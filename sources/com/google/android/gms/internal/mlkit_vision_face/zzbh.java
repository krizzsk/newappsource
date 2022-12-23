package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzbh<K, V> extends zzap<K, V> implements Serializable {
    @NullableDecl
    public final K zza;
    @NullableDecl
    public final V zzb;

    public zzbh(@NullableDecl K k, @NullableDecl V v) {
        this.zza = k;
        this.zzb = v;
    }

    @NullableDecl
    public final K getKey() {
        return this.zza;
    }

    @NullableDecl
    public final V getValue() {
        return this.zzb;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
