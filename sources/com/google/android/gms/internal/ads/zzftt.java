package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

public final /* synthetic */ class zzftt {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!C25586e.m63974a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
