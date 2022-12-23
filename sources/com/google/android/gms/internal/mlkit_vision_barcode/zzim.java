package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzim implements C19449c {
    public static final zzim zza = new zzim();
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
        zzdj d = C25541a.m63874d(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.annotationType(), d);
        zzb = new C19448b("appId", C16530d.m42017j(hashMap));
        zzdj d2 = C25541a.m63874d(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d2.annotationType(), d2);
        zzc = new C19448b("appVersion", C16530d.m42017j(hashMap2));
        zzdj d3 = C25541a.m63874d(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(d3.annotationType(), d3);
        zzd = new C19448b("firebaseProjectId", C16530d.m42017j(hashMap3));
        zzdj d4 = C25541a.m63874d(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(d4.annotationType(), d4);
        zze = new C19448b("mlSdkVersion", C16530d.m42017j(hashMap4));
        zzdj d5 = C25541a.m63874d(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(d5.annotationType(), d5);
        zzf = new C19448b("tfliteSchemaVersion", C16530d.m42017j(hashMap5));
        zzdj d6 = C25541a.m63874d(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(d6.annotationType(), d6);
        zzg = new C19448b("gcmSenderId", C16530d.m42017j(hashMap6));
        zzdj d7 = C25541a.m63874d(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(d7.annotationType(), d7);
        zzh = new C19448b("apiKey", C16530d.m42017j(hashMap7));
        zzdj d8 = C25541a.m63874d(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(d8.annotationType(), d8);
        zzi = new C19448b("languages", C16530d.m42017j(hashMap8));
        zzdj d9 = C25541a.m63874d(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(d9.annotationType(), d9);
        zzj = new C19448b("mlSdkInstanceId", C16530d.m42017j(hashMap9));
        zzdj d11 = C25541a.m63874d(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(d11.annotationType(), d11);
        zzk = new C19448b("isClearcutClient", C16530d.m42017j(hashMap10));
        zzdj d12 = C25541a.m63874d(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(d12.annotationType(), d12);
        zzl = new C19448b("isStandaloneMlkit", C16530d.m42017j(hashMap11));
        zzdj d13 = C25541a.m63874d(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(d13.annotationType(), d13);
        zzm = new C19448b("isJsonLogging", C16530d.m42017j(hashMap12));
        zzdj d14 = C25541a.m63874d(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(d14.annotationType(), d14);
        zzn = new C19448b("buildLevel", C16530d.m42017j(hashMap13));
        zzdj d15 = C25541a.m63874d(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(d15.annotationType(), d15);
        zzo = new C19448b("optionalModuleVersion", C16530d.m42017j(hashMap14));
    }

    private zzim() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzme zzme = (zzme) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(zzb, (Object) zzme.zzg());
        dVar.add(zzc, (Object) zzme.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) zzme.zzj());
        dVar.add(zzf, (Object) zzme.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) zzme.zza());
        dVar.add(zzj, (Object) zzme.zzi());
        dVar.add(zzk, (Object) zzme.zzb());
        dVar.add(zzl, (Object) zzme.zzd());
        dVar.add(zzm, (Object) zzme.zzc());
        dVar.add(zzn, (Object) zzme.zze());
        dVar.add(zzo, (Object) zzme.zzf());
    }
}
