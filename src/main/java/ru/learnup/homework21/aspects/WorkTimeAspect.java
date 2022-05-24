package ru.learnup.homework21.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Slf4j
public class WorkTimeAspect {

    @Around("@annotation(ru.learnup.homework21.annotation.WorkTime)")
    public Object logAdvice(ProceedingJoinPoint point) throws Throwable {

        long begun = System.currentTimeMillis();
        Object obj = point.proceed();
        long end = System.currentTimeMillis();
        long runTime = end - begun;
        String nameMethod = point.getSignature().getName();

        log.info("Method {} runtime {}ms", nameMethod, runTime);
        return obj;
    }
}
