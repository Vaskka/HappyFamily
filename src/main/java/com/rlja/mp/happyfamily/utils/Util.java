package com.rlja.mp.happyfamily.utils;

/**
 * @program: happyfamily
 * @description: Util
 * @author: Vaskka
 * @create: 2019/4/29 9:58 AM
 **/

public class Util {

    /**
     * md5加密
     * @param origin 明文
     * @return 密文
     */
    public static String md5(String origin) {
        return MD5Util.MD5Encode(origin, "utf8");
    }


    /**
     * 获取当前时间
     * @return String timestamp
     */
    public static String current() {
        return String.valueOf(System.currentTimeMillis());
    }
}
