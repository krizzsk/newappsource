package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzfn implements C19449c {
    public static final zzfn zza = new zzfn();
    private static final C19448b zzb;

    static {
        zzdj d = C25541a.m63874d(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.annotationType(), d);
        zzb = new C19448b("format", C16530d.m42017j(hashMap));
    }

    private zzfn() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((C19450d) obj2).add(zzb, (Object) ((zzmy) obj).zza());
    }
}
