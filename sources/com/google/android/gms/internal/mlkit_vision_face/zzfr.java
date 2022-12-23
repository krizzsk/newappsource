package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzfr implements C19449c<zzii> {
    public static final zzfr zza = new zzfr();
    private static final C19448b zzb;
    private static final C19448b zzc;
    private static final C19448b zzd;
    private static final C19448b zze;
    private static final C19448b zzf;
    private static final C19448b zzg;
    private static final C19448b zzh;
    private static final C19448b zzi;
    private static final C19448b zzj;
    private static final C19448b zzk;

    static {
        zzcw f = C13715c.m34240f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("durationMs", C16530d.m42017j(hashMap));
        zzcw f2 = C13715c.m34240f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("errorCode", C16530d.m42017j(hashMap2));
        zzcw f3 = C13715c.m34240f(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(f3.annotationType(), f3);
        zzd = new C19448b("isColdCall", C16530d.m42017j(hashMap3));
        zzcw f4 = C13715c.m34240f(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(f4.annotationType(), f4);
        zze = new C19448b("autoManageModelOnBackground", C16530d.m42017j(hashMap4));
        zzcw f5 = C13715c.m34240f(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(f5.annotationType(), f5);
        zzf = new C19448b("autoManageModelOnLowMemory", C16530d.m42017j(hashMap5));
        zzcw f6 = C13715c.m34240f(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(f6.annotationType(), f6);
        zzg = new C19448b("isNnApiEnabled", C16530d.m42017j(hashMap6));
        zzcw f7 = C13715c.m34240f(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(f7.annotationType(), f7);
        zzh = new C19448b("eventsCount", C16530d.m42017j(hashMap7));
        zzcw f8 = C13715c.m34240f(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(f8.annotationType(), f8);
        zzi = new C19448b("otherErrors", C16530d.m42017j(hashMap8));
        zzcw f9 = C13715c.m34240f(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(f9.annotationType(), f9);
        zzj = new C19448b("remoteConfigValueForAcceleration", C16530d.m42017j(hashMap9));
        zzcw f11 = C13715c.m34240f(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(f11.annotationType(), f11);
        zzk = new C19448b("isAccelerated", C16530d.m42017j(hashMap10));
    }

    private zzfr() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzii zzii = (zzii) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(zzb, (Object) zzii.zza());
        dVar.add(zzc, (Object) zzii.zzb());
        dVar.add(zzd, (Object) zzii.zzc());
        dVar.add(zze, (Object) zzii.zzd());
        dVar.add(zzf, (Object) zzii.zze());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, (Object) null);
        dVar.add(zzk, (Object) null);
    }
}
