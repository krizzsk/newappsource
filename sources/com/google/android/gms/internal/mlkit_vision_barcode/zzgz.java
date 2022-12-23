package com.google.android.gms.internal.mlkit_vision_barcode;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzgz implements C19449c {
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

    static {
        zzdj d = C25541a.m63874d(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.annotationType(), d);
        zzb = new C19448b("name", C16530d.m42017j(hashMap));
        zzdj d2 = C25541a.m63874d(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d2.annotationType(), d2);
        zzc = new C19448b(MediationMetaData.KEY_VERSION, C16530d.m42017j(hashMap2));
        zzdj d3 = C25541a.m63874d(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(d3.annotationType(), d3);
        zzd = new C19448b("source", C16530d.m42017j(hashMap3));
        zzdj d4 = C25541a.m63874d(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(d4.annotationType(), d4);
        zze = new C19448b("uri", C16530d.m42017j(hashMap4));
        zzdj d5 = C25541a.m63874d(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(d5.annotationType(), d5);
        zzf = new C19448b("hash", C16530d.m42017j(hashMap5));
        zzdj d6 = C25541a.m63874d(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(d6.annotationType(), d6);
        zzg = new C19448b("modelType", C16530d.m42017j(hashMap6));
        zzdj d7 = C25541a.m63874d(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(d7.annotationType(), d7);
        zzh = new C19448b("size", C16530d.m42017j(hashMap7));
        zzdj d8 = C25541a.m63874d(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(d8.annotationType(), d8);
        zzi = new C19448b("hasLabelMap", C16530d.m42017j(hashMap8));
        zzdj d9 = C25541a.m63874d(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(d9.annotationType(), d9);
        zzj = new C19448b("isManifestModel", C16530d.m42017j(hashMap9));
    }

    private zzgz() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzkp zzkp = (zzkp) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
