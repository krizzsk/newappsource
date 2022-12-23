package com.google.android.gms.internal.mlkit_vision_face;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p789se.C19449c;
import p789se.C19451e;

public final class zzdb {
    private final Map<Class<?>, C19449c<?>> zza;
    private final Map<Class<?>, C19451e<?>> zzb;
    private final C19449c<Object> zzc;

    public zzdb(Map<Class<?>, C19449c<?>> map, Map<Class<?>, C19451e<?>> map2, C19449c<Object> cVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = cVar;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzcy(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzd(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
