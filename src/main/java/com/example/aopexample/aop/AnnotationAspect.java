package com.example.aopexample.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationAspect {

    @Around("@annotation(com.example.aopexample.annotation.ExecutionTime)")
    public Object timeTaken(ProceedingJoinPoint pjp ) throws Throwable{
        long start = System.currentTimeMillis();
        Object output = pjp.proceed();

        long executionTime = System.currentTimeMillis() -start;
        String methodName  = pjp.getSignature().getName();

        System.out.println(methodName+ " method took" + executionTime+ " ms to finish execution ");

        return output;


    }



}
