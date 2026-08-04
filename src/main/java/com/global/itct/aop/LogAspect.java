package com.global.itct.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class LogAspect {
	
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		String name = joinPoint.getSignature().getName();
		System.out.printf("LogAspect.before name:%s\n", name);
		Object result = joinPoint.proceed();
		System.out.printf("LogAspect.after name:%s\n", name);
		return result;
	}

}
