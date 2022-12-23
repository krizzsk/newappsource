package com.google.android.gms.internal.icing;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@VisibleForTesting
public final class zzq {
    @VisibleForTesting
    public static final String[] zza = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    private static final Map<String, Integer> zzb = new HashMap(10);

    static {
        int i = 0;
        while (true) {
            String[] strArr = zza;
            int length = strArr.length;
            if (i < 10) {
                zzb.put(strArr[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }

    public static String zza(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = zza;
        int length = strArr.length;
        if (i >= 10) {
            return null;
        }
        return strArr[i];
    }

    public static int zzb(String str) {
        Integer num = zzb.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(C13715c.m34245k(new StringBuilder(str.length() + 44), "[", str, "] is not a valid global search section name"));
    }
}
