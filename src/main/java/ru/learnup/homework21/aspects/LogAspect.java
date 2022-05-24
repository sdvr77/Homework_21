package ru.learnup.homework21.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Aspect
@Slf4j
public class LogAspect {

    @AfterReturning(pointcut = "@annotation(ru.learnup.homework21.annotation.LogMethod)", returning = "value")
    public void logAdvice(JoinPoint point, Object value) {

        String nameMethod = point.getSignature().getName();
        List<String> argsMethod = Arrays.stream(point.getArgs())
                .map(Object::toString)
                .collect(Collectors.toList());
        log.info("Method {}{}, return value [{}]", nameMethod, argsMethod, value);
    }
}
