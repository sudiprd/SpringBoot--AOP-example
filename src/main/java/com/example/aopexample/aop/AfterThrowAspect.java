package com.example.aopexample.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterThrowAspect {

    @Pointcut("execution(* com.example.aopexample.manager.VehicleManager.perform())")
    public void exceptionPointCut(){

    }

    @AfterThrowing(pointcut = "exceptionPointCut()", throwing = "ex")
    public void handleException(JoinPoint jp, Throwable ex)
    {
        System.out.println(" Method Signature:  "+ jp.getSignature().getName());
        System.out.println(" Exception caught : "+ ex.getMessage());
    }
}
