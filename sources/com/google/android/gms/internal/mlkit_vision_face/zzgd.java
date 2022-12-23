package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzgd implements C19449c<zzja> {
    public static final zzgd zza = new zzgd();
    private static final C19448b zzb;
    private static final C19448b zzc;
    private static final C19448b zzd;
    private static final C19448b zze;
    private static final C19448b zzf;
    private static final C19448b zzg;

    static {
        zzcw f = C13715c.m34240f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("inferenceCommonLogEvent", C16530d.m42017j(hashMap));
        zzcw f2 = C13715c.m34240f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("options", C16530d.m42017j(hashMap2));
        zzcw f3 = C13715c.m34240f(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(f3.annotationType(), f3);
        zzd = new C19448b("imageInfo", C16530d.m42017j(hashMap3));
        zzcw f4 = C13715c.m34240f(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(f4.annotationType(), f4);
        zze = new C19448b("detectorOptions", C16530d.m42017j(hashMap4));
        zzcw f5 = C13715c.m34240f(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(f5.annotationType(), f5);
        zzf = new C19448b("contourDetectedFaces", C16530d.m42017j(hashMap5));
        zzcw f6 = C13715c.m34240f(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(f6.annotationType(), f6);
        zzg = new C19448b("nonContourDetectedFaces", C16530d.m42017j(hashMap6));
    }

    private zzgd() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzja zzja = (zzja) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(zzb, (Object) zzja.zza());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, (Object) zzja.zzb());
        dVar.add(zze, (Object) zzja.zzc());
        dVar.add(zzf, (Object) zzja.zzd());
        dVar.add(zzg, (Object) zzja.zze());
    }
}
