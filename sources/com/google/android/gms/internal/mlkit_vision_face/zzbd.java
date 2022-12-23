package com.google.android.gms.internal.mlkit_vision_face;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzbd {
    public static int zza(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    public static int zzb(@NullableDecl Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
