package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzfq implements C19449c<zzif> {
    public static final zzfq zza = new zzfq();
    private static final C19448b zzb;
    private static final C19448b zzc;
    private static final C19448b zzd;

    static {
        zzcw f = C13715c.m34240f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("imageFormat", C16530d.m42017j(hashMap));
        zzcw f2 = C13715c.m34240f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("originalImageSize", C16530d.m42017j(hashMap2));
        zzcw f3 = C13715c.m34240f(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(f3.annotationType(), f3);
        zzd = new C19448b("compressedImageSize", C16530d.m42017j(hashMap3));
    }

    private zzfq() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzif zzif = (zzif) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(zzb, (Object) zzif.zza());
        dVar.add(zzc, (Object) zzif.zzb());
        dVar.add(zzd, (Object) null);
    }
}
