package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzgz implements C19449c<zzjy> {
    public static final zzgz zza = new zzgz();
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
    private static final C19448b zzl;
    private static final C19448b zzm;
    private static final C19448b zzn;

    static {
        zzcw f = C13715c.m34240f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("appId", C16530d.m42017j(hashMap));
        zzcw f2 = C13715c.m34240f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("appVersion", C16530d.m42017j(hashMap2));
        zzcw f3 = C13715c.m34240f(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(f3.annotationType(), f3);
        zzd = new C19448b("firebaseProjectId", C16530d.m42017j(hashMap3));
        zzcw f4 = C13715c.m34240f(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(f4.annotationType(), f4);
        zze = new C19448b("mlSdkVersion", C16530d.m42017j(hashMap4));
        zzcw f5 = C13715c.m34240f(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(f5.annotationType(), f5);
        zzf = new C19448b("tfliteSchemaVersion", C16530d.m42017j(hashMap5));
        zzcw f6 = C13715c.m34240f(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(f6.annotationType(), f6);
        zzg = new C19448b("gcmSenderId", C16530d.m42017j(hashMap6));
        zzcw f7 = C13715c.m34240f(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(f7.annotationType(), f7);
        zzh = new C19448b("apiKey", C16530d.m42017j(hashMap7));
        zzcw f8 = C13715c.m34240f(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(f8.annotationType(), f8);
        zzi = new C19448b("languages", C16530d.m42017j(hashMap8));
        zzcw f9 = C13715c.m34240f(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(f9.annotationType(), f9);
        zzj = new C19448b("mlSdkInstanceId", C16530d.m42017j(hashMap9));
        zzcw f11 = C13715c.m34240f(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(f11.annotationType(), f11);
        zzk = new C19448b("isClearcutClient", C16530d.m42017j(hashMap10));
        zzcw f12 = C13715c.m34240f(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(f12.annotationType(), f12);
        zzl = new C19448b("isStandaloneMlkit", C16530d.m42017j(hashMap11));
        zzcw f13 = C13715c.m34240f(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(f13.annotationType(), f13);
        zzm = new C19448b("isJsonLogging", C16530d.m42017j(hashMap12));
        zzcw f14 = C13715c.m34240f(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(f14.annotationType(), f14);
        zzn = new C19448b("buildLevel", C16530d.m42017j(hashMap13));
    }

    private zzgz() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzjy zzjy = (zzjy) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(zzb, (Object) zzjy.zza());
        dVar.add(zzc, (Object) zzjy.zzb());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) zzjy.zzc());
        dVar.add(zzf, (Object) zzjy.zzd());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) zzjy.zze());
        dVar.add(zzj, (Object) zzjy.zzf());
        dVar.add(zzk, (Object) zzjy.zzg());
        dVar.add(zzl, (Object) zzjy.zzh());
        dVar.add(zzm, (Object) zzjy.zzi());
        dVar.add(zzn, (Object) zzjy.zzj());
    }
}
