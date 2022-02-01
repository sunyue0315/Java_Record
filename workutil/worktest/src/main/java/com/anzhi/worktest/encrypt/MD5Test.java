package com.anzhi.worktest.encrypt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Test {
    public static void main(String[] args) {
        md5Signature();
    }

    public static String md5Signature() {
        String jsonStr = "{\"businessCode\":\"2\",\"ricipeId\":\"2021032111111111\",\"ricipes\":[{\"code\":\"123564\",\"count\":3,\"price\":\"22.00\"},{\"code\":\"141319\",\"count\":1,\"price\":\"32.50\"}],\"timestamp\":\"1616492211887\",\"total\":\"98.50\"}";
        JSON jsonObject = JSON.parseObject(jsonStr, Feature.InternFieldNames);
        System.out.println("args = " + jsonObject);
        String md5Source = jsonStr + "12345678abcdefgh";
        //结果：03af9cd99ae87122733af215efb7e5a0
        System.out.println(md5ByStr(md5Source));
        return null;
    }

    public static String md5ByStr(String raw) {
        try {
            byte[] hash = MessageDigest.getInstance("MD5").digest(raw.getBytes());
            String hex = bytes2Hex(hash);
            return hex;
        }
        catch (NoSuchAlgorithmException e) {
        }
        return raw;
    }

    public static String bytes2Hex(byte[] bytes) {
        StringBuilder hex = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            if ((b & 0xFF) < 0x10) hex.append("0");
            hex.append(Integer.toHexString(b & 0xFF));
        }
        return hex.toString();
    }
}
