package com.example.aopexample.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeAdviceAspect {

    @Before("execution(* com.example.aopexample.service.Car.*(..))")
    public void logAllMethods(JoinPoint jp ){
        String targetClass = jp.getTarget().getClass().getSimpleName();
        String targetMethod = jp.getSignature().getName();
        System.out.println("AOP1[ " + targetClass + " : " + targetMethod + " ()] : " + jp.getSignature().getName()+ " is called" );
    }

    @Before("execution(* com.example.aopexample.service.Bike.cc(..))")
    public void logArea(JoinPoint jp){
        String targetClass=  jp.getTarget().getClass().getSimpleName();
        String targetMethod = jp.getSignature().getName();

        System.out.println("AOP2[ " + targetClass + " : " + targetMethod + " ()] : " + jp.getSignature().getName()+ " is called" );
    }
}
