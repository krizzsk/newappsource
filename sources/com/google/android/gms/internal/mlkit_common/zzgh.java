package com.google.android.gms.internal.mlkit_common;

import java.io.IOException;
import java.util.HashMap;
import p001a0.C0017h;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzgh implements C19449c {
    public static final zzgh zza = new zzgh();
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
    private static final C19448b zzo;

    static {
        zzbi L = C0017h.m55L(1);
        HashMap hashMap = new HashMap();
        hashMap.put(L.annotationType(), L);
        zzb = new C19448b("appId", C16530d.m42017j(hashMap));
        zzbi L2 = C0017h.m55L(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(L2.annotationType(), L2);
        zzc = new C19448b("appVersion", C16530d.m42017j(hashMap2));
        zzbi L3 = C0017h.m55L(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(L3.annotationType(), L3);
        zzd = new C19448b("firebaseProjectId", C16530d.m42017j(hashMap3));
        zzbi L4 = C0017h.m55L(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(L4.annotationType(), L4);
        zze = new C19448b("mlSdkVersion", C16530d.m42017j(hashMap4));
        zzbi L5 = C0017h.m55L(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(L5.annotationType(), L5);
        zzf = new C19448b("tfliteSchemaVersion", C16530d.m42017j(hashMap5));
        zzbi L6 = C0017h.m55L(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(L6.annotationType(), L6);
        zzg = new C19448b("gcmSenderId", C16530d.m42017j(hashMap6));
        zzbi L7 = C0017h.m55L(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(L7.annotationType(), L7);
        zzh = new C19448b("apiKey", C16530d.m42017j(hashMap7));
        zzbi L8 = C0017h.m55L(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(L8.annotationType(), L8);
        zzi = new C19448b("languages", C16530d.m42017j(hashMap8));
        zzbi L9 = C0017h.m55L(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(L9.annotationType(), L9);
        zzj = new C19448b("mlSdkInstanceId", C16530d.m42017j(hashMap9));
        zzbi L10 = C0017h.m55L(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(L10.annotationType(), L10);
        zzk = new C19448b("isClearcutClient", C16530d.m42017j(hashMap10));
        zzbi L11 = C0017h.m55L(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(L11.annotationType(), L11);
        zzl = new C19448b("isStandaloneMlkit", C16530d.m42017j(hashMap11));
        zzbi L12 = C0017h.m55L(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(L12.annotationType(), L12);
        zzm = new C19448b("isJsonLogging", C16530d.m42017j(hashMap12));
        zzbi L13 = C0017h.m55L(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(L13.annotationType(), L13);
        zzn = new C19448b("buildLevel", C16530d.m42017j(hashMap13));
        zzbi L14 = C0017h.m55L(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(L14.annotationType(), L14);
        zzo = new C19448b("optionalModuleVersion", C16530d.m42017j(hashMap14));
    }

    private zzgh() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzkb zzkb = (zzkb) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(zzb, (Object) zzkb.zzg());
        dVar.add(zzc, (Object) zzkb.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) zzkb.zzj());
        dVar.add(zzf, (Object) zzkb.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) zzkb.zza());
        dVar.add(zzj, (Object) zzkb.zzi());
        dVar.add(zzk, (Object) zzkb.zzb());
        dVar.add(zzl, (Object) zzkb.zzd());
        dVar.add(zzm, (Object) zzkb.zzc());
        dVar.add(zzn, (Object) zzkb.zze());
        dVar.add(zzo, (Object) zzkb.zzf());
    }
}
