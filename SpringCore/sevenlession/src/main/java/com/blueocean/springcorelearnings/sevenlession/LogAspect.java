package com.blueocean.springcorelearnings.sevenlession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {
	@Before("execution(* com.blueocean.springcorelearnings.sevenlession.OrderServiceImpln.Multiplication(..))")
	public void logBefore(JoinPoint joinpoint)
	{
		System.out.println("before logging");
	}
	@After("execution(* com.blueocean.springcorelearnings.sevenlession.OrderServiceImpln.Multiplication(..))")
	public void logAfter(JoinPoint joinpoint)
	{
		System.out.println("after logging");
	}
	
}
