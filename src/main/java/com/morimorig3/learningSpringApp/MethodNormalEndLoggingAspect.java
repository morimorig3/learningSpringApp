package com.morimorig3.learningSpringApp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodNormalEndLoggingAspect {
    @AfterReturning("execution(* *..*ServiceImpl.*(..))")
    public void endLog(JoinPoint jp){
        System.out.println("メソッド正常終了:"+jp.getSignature());
    }
}
