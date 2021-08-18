package com.pandapd.maniya.aspect.operatelog;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @description: 操作日志拦截器切面
 * @author: pandapd
 * @date: Created at 2021/8/18 15:36
 */
@Aspect
@Component
public class OperateLogInterceptor {
    @Around("@annotation(com.pandapd.maniya.aspect.operatelog.OperateLog) && execution(public * *.*(..))")
    public Object logOperate(ProceedingJoinPoint joinPoint) throws Throwable {
        return joinPoint.proceed();
    }


}
