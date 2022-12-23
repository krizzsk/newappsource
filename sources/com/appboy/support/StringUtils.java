package com.appboy.support;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;

@Keep
public final class StringUtils {
    public static final String CACHE_SUFFIX_PREFERENCES_FILE_PREFIX = "com.appboy.support.stringutils.cachefilesuffix";
    public static final String MD5_HASH_OF_THE_STRING_NULL = "37a6259cc0c1dae299a7866489dff0bd";
    public static final String NULL_USER_ID_SUBSTITUTE_STRING = "null";
    public static final String SUFFIX_CACHE_USER_ID_HASH_VALUE = "user_id_hash_value";
    public static final String SUFFIX_CACHE_USER_ID_KEY = "user_id_key";
    public static final String TAG = AppboyLogger.getBrazeLogTag(StringUtils.class);

    public static String checkNotNullOrEmpty(String str) {
        if (str == null) {
            throw new NullPointerException("Provided String must be non-null.");
        } else if (str.length() != 0) {
            return str;
        } else {
            throw new IllegalArgumentException("Provided String must be non-empty.");
        }
    }

    public static int countOccurrences(String str, String str2) {
        return str.split(str2, -1).length - 1;
    }

    public static String emptyToNull(String str) {
        if (str.trim().equals("")) {
            return null;
        }
        return str;
    }

    public static long getByteSize(String str) {
        return (long) str.getBytes(Charset.forName("UTF-8")).length;
    }

    public static String getCacheFileSuffix(Context context, String str, String str2) {
        if (str == null) {
            str = NULL_USER_ID_SUBSTITUTE_STRING;
        }
        if (str.equals(NULL_USER_ID_SUBSTITUTE_STRING)) {
            return getSuffixFromUserIdHashAndApiKey(MD5_HASH_OF_THE_STRING_NULL, str2);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(CACHE_SUFFIX_PREFERENCES_FILE_PREFIX, 0);
        String string = sharedPreferences.getString(SUFFIX_CACHE_USER_ID_KEY, (String) null);
        if (string != null && string.equals(str)) {
            String string2 = sharedPreferences.getString(SUFFIX_CACHE_USER_ID_HASH_VALUE, (String) null);
            if (!isNullOrEmpty(string2)) {
                return getSuffixFromUserIdHashAndApiKey(string2, str2);
            }
            AppboyLogger.m5448d(TAG, "The saved user id hash was null or empty.");
        }
        String str3 = TAG;
        AppboyLogger.m5448d(str3, "Generating MD5 for user id: " + str + " apiKey: " + str2);
        String md5Hash = getMd5Hash(str);
        if (md5Hash == null) {
            md5Hash = Integer.toString(str.hashCode());
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(SUFFIX_CACHE_USER_ID_KEY, str);
        edit.putString(SUFFIX_CACHE_USER_ID_HASH_VALUE, md5Hash);
        edit.apply();
        return getSuffixFromUserIdHashAndApiKey(md5Hash, str2);
    }

    public static String getMd5Hash(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Failed to calculate MD5 hash", e);
            return null;
        }
    }

    public static String getSuffixFromUserIdHashAndApiKey(String str, String str2) {
        if (isNullOrBlank(str2)) {
            return C25541a.m63881k(".", str);
        }
        return C25541a.m63882l(".", str, ".", str2);
    }

    public static boolean isBlank(String str) {
        return str != null && str.trim().length() == 0;
    }

    public static boolean isNullOrBlank(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static String join(Collection<String> collection, String str) {
        return collection == null ? "" : join((String[]) collection.toArray(new String[0]), str);
    }

    public static HashSet<String> jsonArrayToHashSet(JSONArray jSONArray) {
        HashSet<String> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.get(i).toString());
            }
        }
        return hashSet;
    }

    public static String stringArrayToJsonString(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        if (strArr == null) {
            return null;
        }
        if (strArr.length == 0) {
            return "[]";
        }
        for (String put : strArr) {
            jSONArray.put(put);
        }
        return jSONArray.toString();
    }

    public static String truncateToByteLength(String str, int i) {
        if (getByteSize(str) <= ((long) i)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (char c : str.toCharArray()) {
            i2 += (int) getByteSize(new String(new char[]{c}));
            if (i2 > i) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String join(String[] strArr, String str) {
        if (strArr == null || str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (str2 != null) {
                sb.append(str2);
                sb.append(str);
            }
        }
        String sb2 = sb.toString();
        return sb2.endsWith(str) ? sb2.substring(0, sb2.length() - str.length()) : sb2;
    }

    public static String getCacheFileSuffix(Context context, String str) {
        return getCacheFileSuffix(context, str, (String) null);
    }
}
