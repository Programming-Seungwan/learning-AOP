package com.seungwan.learning_AOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;

// AOP 설정을 위한 클래스임
@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());
    // 비즈시느와 데이터 레이어에서의 모든 메서드 콜 당시에 호출되어야 함
    // Pointcut. When? 언제 로직이 실행될 지를 정해주는 것임.
    // Pointcut의 대표적인 예시로는 execution, 즉 메서드의 실행이 있음.
    @Before("execution(* com.seungwan.learning_AOP.aopexample.data.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        // Logic!
        logger.info("Before Aspect Method is called - {}", joinPoint);
    }
}
