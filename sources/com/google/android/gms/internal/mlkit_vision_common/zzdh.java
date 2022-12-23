package com.google.android.gms.internal.mlkit_vision_common;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzdh implements C19449c {
    public static final zzdh zza = new zzdh();
    private static final C19448b zzb;
    private static final C19448b zzc;
    private static final C19448b zzd;
    private static final C19448b zze;
    private static final C19448b zzf;
    private static final C19448b zzg;
    private static final C19448b zzh;

    static {
        zzah f = C13555b.m33967f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("renderer", C16530d.m42017j(hashMap));
        zzah f2 = C13555b.m33967f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("vendor", C16530d.m42017j(hashMap2));
        zzah f3 = C13555b.m33967f(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(f3.annotationType(), f3);
        zzd = new C19448b(MediationMetaData.KEY_VERSION, C16530d.m42017j(hashMap3));
        zzah f4 = C13555b.m33967f(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(f4.annotationType(), f4);
        zze = new C19448b("maxImages", C16530d.m42017j(hashMap4));
        zzah f5 = C13555b.m33967f(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(f5.annotationType(), f5);
        zzf = new C19448b("maxSsbo", C16530d.m42017j(hashMap5));
        zzah f6 = C13555b.m33967f(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(f6.annotationType(), f6);
        zzg = new C19448b("workGroupSizes", C16530d.m42017j(hashMap6));
        zzah f7 = C13555b.m33967f(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(f7.annotationType(), f7);
        zzh = new C19448b("errorCode", C16530d.m42017j(hashMap7));
    }

    private zzdh() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzit zzit = (zzit) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
