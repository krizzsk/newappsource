package com.appsflyer;

import java.security.MessageDigest;
import java.util.Formatter;
import java.util.Map;

public class HashUtils {
    public static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static String getOneLinkAuthorization(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        sb.append(j);
        return toSHA1(sb.toString());
    }

    public static String toMD5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return valueOf(instance.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    public static String toSHA1(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return valueOf(instance.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    public static String toSha256(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            return bytesToHex(instance.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    private static String valueOf(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    public String getHashCode(Map<String, Object> map) {
        String str = (String) map.get(ServerParameters.TIMESTAMP);
        StringBuilder sb = new StringBuilder();
        sb.append(((String) map.get(ServerParameters.AF_DEV_KEY)).substring(0, 7));
        sb.append(((String) map.get(ServerParameters.AF_USER_ID)).substring(0, 7));
        sb.append(str.substring(str.length() - 7));
        return toSHA1(sb.toString());
    }

    public String getHashCodeV2(Map<String, Object> map) {
        StringBuilder k = C13555b.m33972k((String) map.get(ServerParameters.AF_DEV_KEY));
        k.append(map.get(ServerParameters.TIMESTAMP));
        StringBuilder k2 = C13555b.m33972k(k.toString());
        k2.append(map.get(ServerParameters.AF_USER_ID));
        StringBuilder k3 = C13555b.m33972k(k2.toString());
        k3.append(map.get(ServerParameters.INSTALL_DATE));
        StringBuilder k4 = C13555b.m33972k(k3.toString());
        k4.append(map.get("counter"));
        StringBuilder k5 = C13555b.m33972k(k4.toString());
        k5.append(map.get("iaecounter"));
        return toSHA1(toMD5(k5.toString()));
    }
}
