package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final /* synthetic */ class zzuo implements Comparator {
    public static final /* synthetic */ zzuo zza = new zzuo();

    private /* synthetic */ zzuo() {
    }

    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        int i = zzvf.zza;
        if (num.intValue() == -1) {
            if (num2.intValue() == -1) {
                return 0;
            }
            return -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }
}
