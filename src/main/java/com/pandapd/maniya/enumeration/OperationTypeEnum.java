package com.pandapd.maniya.enumeration;

import lombok.Getter;

/**
 * @description: 操作类型枚举
 * @author: pandapd
 * @date: Created at 2021/8/18 15:52
 */
@Getter
public enum OperationTypeEnum {
    CREATE(0, "创建"),
    UPDATE(1, "更新"),
    DELETE(2, "删除"),
    ACTIVATE(3, "启用"),
    FORBIDDEN(4, "禁用"),
    ENABLE(5, "可见"),
    DISABLE(6, "不可见");
    private final int id;
    private final String desc;

    private OperationTypeEnum(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    /**
     * 根据id解析相应枚举类型
     * @param id
     * @return OperationTypeEnum枚举类型
     */
    public static OperationTypeEnum parseById(int id) {
        for (OperationTypeEnum value : OperationTypeEnum.values()) {
            if (id == value.id) {
                return value;
            }
        }
        return null;
    }
}
