package com.example.springhateoas.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class UserControllerAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Around("execution(* com.example.springhateoas.controller.UserController.getAllUsers(..))")
    public Object createUserAround(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Cacheable istek gönderildi");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();

        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("Cacheable istek alındı ");
        System.out.println("Değer : " + value);
        return value;
    }


}
