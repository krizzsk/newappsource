package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzfo implements C19449c<zzib> {
    public static final zzfo zza = new zzfo();
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
        zzb = new C19448b("landmarkMode", C16530d.m42017j(hashMap));
        zzcw f2 = C13715c.m34240f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("classificationMode", C16530d.m42017j(hashMap2));
        zzcw f3 = C13715c.m34240f(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(f3.annotationType(), f3);
        zzd = new C19448b("performanceMode", C16530d.m42017j(hashMap3));
        zzcw f4 = C13715c.m34240f(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(f4.annotationType(), f4);
        zze = new C19448b("contourMode", C16530d.m42017j(hashMap4));
        zzcw f5 = C13715c.m34240f(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(f5.annotationType(), f5);
        zzf = new C19448b("isTrackingEnabled", C16530d.m42017j(hashMap5));
        zzcw f6 = C13715c.m34240f(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(f6.annotationType(), f6);
        zzg = new C19448b("minFaceSize", C16530d.m42017j(hashMap6));
    }

    private zzfo() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzib zzib = (zzib) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(zzb, (Object) zzib.zza());
        dVar.add(zzc, (Object) zzib.zzb());
        dVar.add(zzd, (Object) zzib.zzc());
        dVar.add(zze, (Object) zzib.zzd());
        dVar.add(zzf, (Object) zzib.zze());
        dVar.add(zzg, (Object) zzib.zzf());
    }
}
