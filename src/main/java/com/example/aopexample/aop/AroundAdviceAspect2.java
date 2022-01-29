package com.example.aopexample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAdviceAspect2 {

    @Pointcut("execution(* com.example.aopexample.manager.VehicleManager.*(..))")
    public void logMethodPointCut(){

    }

    @Around("logMethodPointCut()")
    public Object logMethod(ProceedingJoinPoint pjp) throws Throwable{
        Object[] obj= pjp.getArgs();

        Object output = pjp.proceed();
        return output;
    }

    @AfterReturning(pointcut = "execution(* com.example.aopexample.service.Car.cc())", returning = "value")
    public void afterReturningAdvice(double value){
//        System.out.println("Method Signature:"+ jp.getSignature());
        System.out.println(" Car cc called from After Returning advice: " + value);
    }

}
