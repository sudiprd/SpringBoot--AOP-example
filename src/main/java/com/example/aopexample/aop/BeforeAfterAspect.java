package com.example.aopexample.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
@Aspect
public class BeforeAfterAspect {

    @Pointcut("within(com.example.aopexample.service.*)")
    public void allMethodPointCut(){

    }

    @Before("allMethodPointCut()")
    public void serviceBeforeMethodExecution(JoinPoint jp){
        String targetClass = jp.getTarget().getClass().getSimpleName();
        String targetMethod = jp.getSignature().getName();

        System.out.println(targetClass+"- "+ targetMethod+ " method called at "+ new Date());
    }

    @After("allMethodPointCut()")
    public void serviceAfterMethodExecution(JoinPoint jp){
        String targetClass = jp.getTarget().getClass().getSimpleName();
        String targetMethod = jp.getSignature().getName();

        System.out.println(targetClass+"- "+ targetMethod+ " method ended at "+ new Date());
    }




}
