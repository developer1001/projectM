package com.zgc.util;

public class StringUtil {
    /**
     * 验证字符串是否有效
     * @param str
     * @return
     */
    public static boolean isValid(String str){

        return (!str.trim().equals("") && str != null);
    }
}
