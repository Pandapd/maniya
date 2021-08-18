package com.pandapd.maniya.enumeration;

/**
 * 所操作模块的枚举类型
 * @author: pandapd
 * @date: Created at 2021/8/18 15:59
 */
public enum ModuleTypeEnum {
    MODULE_EXAMPLE(10000, "示例模块");

    private final int id;
    private final String desc;

    private ModuleTypeEnum(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    /**
     * 根据id解析相应枚举类型
     * @param id
     * @return ModuleTypeEnum枚举类型
     */
    public static ModuleTypeEnum parseById(int id) {
        for (ModuleTypeEnum value : ModuleTypeEnum.values()) {
            if (id == value.id) {
                return value;
            }
        }
        return null;
    }
}
