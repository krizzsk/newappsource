package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p789se.C19449c;

public final class zzdo {
    private final Map zza;
    private final Map zzb;
    private final C19449c zzc;

    public zzdo(Map map, Map map2, C19449c cVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = cVar;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzdl(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
