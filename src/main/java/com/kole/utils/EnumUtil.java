package com.kole.utils;

import com.kole.enums.CodeEnum;

/**
 * Created by Ldlood on 2017/8/2.
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
