package com.example.aopexample.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAdviceAspect {

    @Pointcut("execution(* com.example.aopexample.manager.*.*(..))")
    public void methodPointCuts(){

    }

    @Around("methodPointCuts()")
    public Object calculateExecutionTime(ProceedingJoinPoint pjp) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println(" Going to call the method ");

        Object output = pjp.proceed();

        System.out.println(" Method execution completed ");

        long elapsedTime = System.currentTimeMillis() - start ;

        System.out.println(" Method execution time : "+ elapsedTime+ " miliseconds ");

        return output;
    }
}
