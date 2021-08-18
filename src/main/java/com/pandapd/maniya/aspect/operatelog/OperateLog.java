package com.pandapd.maniya.aspect.operatelog;

import com.pandapd.maniya.enumeration.ModuleTypeEnum;
import com.pandapd.maniya.enumeration.OperationTypeEnum;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: 操作注解
 * @author: pandapd
 * @date: Created at 2021/8/18 15:47
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OperateLog {

    /**
     * 操作模块
     */
    ModuleTypeEnum moduleTypeEnum();

    /**
     * 操作类型
     */
    OperationTypeEnum operationType();
}
