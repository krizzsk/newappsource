package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzdp {
    public static void zza(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void zzb(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(C16759e.m42349e("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
