package com.example.aspects;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggerAspect {
	private Logger logger = Logger.getLogger(LoggerAspect.class.getName());
	
	@Around("execution(* com.example.services.*.*(..))")
	
	public void log(ProceedingJoinPoint jointPoint) throws Throwable{
		logger.info(jointPoint.getSignature().toString()+" method execution start");
		Instant start = Instant.now();
		jointPoint.proceed();
		Instant finish = Instant.now();
		Long timeElapsed =  Duration.between(start, finish).toMillis();
		logger.info("Time took to execute the method : "+timeElapsed);
		logger.info(jointPoint.getSignature().toString()+ "method execution ends");
		
	}

}
