package com.google.android.gms.common.util;

import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.StringUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            }
            String str = hashMap.get(next);
            C16530d.m42019l(sb, "\"", next, "\":");
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                C16530d.m42019l(sb, "\"", str, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
