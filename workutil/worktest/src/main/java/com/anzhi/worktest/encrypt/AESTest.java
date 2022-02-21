package com.anzhi.worktest.encrypt;

import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESTest {
    private static String key = "c6ApRFAcaGeVHkBoYHGyBT==";

    public static void main(String[] args) {
        String data = "{\"payTime\":\"2021-02-20 08:14:47\",\"receiverName\":\"赵怡\",\"freight\":0,\"receiverMobile\":\"13981111333\",\"userName\":\"赵一\",\"userId\":\"9547\",\"receiverAddress\":\"四川省>绵阳市涪城区长虹国际城二期33栋\",\"receiverProvince\":\"省份\",\"receiverCity\":\"市区\",\"receiverRegion\":\"区\",\"receiverDetail\":\"详细\",\"productAmount\":246,\"orderTime\":\"2021-02-20 08:14:29\",\"orderAmount\":492,\"userMobile\":\"13981111333\",\"outOrderId\":\"ME20210220081429406497\",\"patientInfo\":{\"diseaseName\":[\"帕金森\"],\"patientName\":\"赵全喜\",\"patientId\":\"534\",\"idCardNo\":\"510402194808311817\"},\"payStatus\":\"1\",\"productList\":[{\"productCode\":\"33836\",\"prodoctName\":\"盐酸罗匹尼罗片\",\"productNum\":\"2\",\"productPrice\":\"246\"}]}";

        String encode = "LpI/4yIrEXAOAExsNWJcQ4g+DiSVh/avq+8cT6/coyPQNhGrc9i8COLPer11GY5Y5qKxlnd/JkjHorj8iYCtaGt7gmZbfQJZPY+oycNCMfmvflBwSy/iFKVqdu2jOzVxSJQ50UYze+hUbEW6rEsFai8ktUvvaj1aWs7lQn8j8z0PZgPbtAC6PNH8cneYKBvdnhRCCrHOxlF1zaQdxHuGc/U7AARmSYHX81xMgymeTXepdRn7rBBEgAvL4GRBlIT+By7Zb5N2gilSxe7QSUKZZbESm3GZ8TBK99L2g1HliRjJlM8e6vbHJqyrzRs9NksoXXlWbPcnMCWRHD5mrM/1ZCpRTEmv6USchrymqpjfyi9P7wQ4vlK5HlkAhNEjH54HGjn4A9Eh3yaAKmtYuOP4XvdsZSCXohDX6Sy6kHrqqVuYPk4G3wm9hVOQsYeZPA0qIp0YtC7vhqoSPz9sE2hPUdttyAduEZihyJ/f+/1QBs5UtruA//lQ1Jxx+2NM2+4GVN0q2eNxBDkd4/SwCjaS/ZulK3n50eTUB3juczmwICvHTyLUbRqt2PkLVZo9ZXUJ9zNFsq7RXmTMOBqt0ohhFmEIMcryUn5PqkdgZibY6Ld/E2E799EIXidjKKvPvgpJKe/lBKeWLpU8jbjlUzHPW6H8JutFYrRJtHnz2hX05jHf4U9Xj4eCAI2ZciqcxJk5RMalFxTtVIVEFhHb+SPCNLshmaptapf+USkyS8fjmfoPCpQhrueZUcTz18W94fEZa1JESk32/r97YpMbzVSj52p5kGyCLY5XXBaV4yGJER5s7VIFojiiOgeaXg6VRS1cNctYSG3ehe71pPAu9YNuElj0L+n06qimV55OiKiSVZvOWi3D9Ui+sGYq1PTYefOdv9CX3V93nShOm//d3NdLtjugtFphJ1G9fakM0SCXPHw=";
        try {
//            encode = encrypt(data);
//            System.out.println("加密：" + encode);

            String decode = decrypt(encode);
            System.out.println("解密：" + decode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public static String encrypt(String data) throws Exception {

        byte[] raw = Base64.decodeBase64(key);

        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");         //"算法/模式/补码方式"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        data = Base64.encodeBase64String(encrypted);
        return data;
    }

    public static String decrypt(String data) throws Exception {
        byte[] raw = Base64.decodeBase64(key);
        byte[] text = Base64.decodeBase64(data);

        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");         //"算法/模式/补码方式"
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] original = cipher.doFinal(text);
        data = new String(original,"utf-8");
        return data;
    }
}
