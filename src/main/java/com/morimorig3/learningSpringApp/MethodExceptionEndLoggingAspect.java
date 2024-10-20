package com.morimorig3.learningSpringApp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodExceptionEndLoggingAspect {
    @AfterThrowing("execution(* *..*ServiceImpl.*(..))")
    public void endLog(JoinPoint jp){
        System.out.println("メソッド異常終了:"+jp.getSignature());
    }
}
