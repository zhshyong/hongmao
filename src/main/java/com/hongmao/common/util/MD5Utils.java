package com.hongmao.common.util;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

/**
 *加密类
 * @author
 * @version
 */
public class MD5Utils {

    public static String getMD5ecode(String string){
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            String newstr=base64en.encode(md5.digest(string.getBytes("utf-8")));
            return newstr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string;
    }
}
