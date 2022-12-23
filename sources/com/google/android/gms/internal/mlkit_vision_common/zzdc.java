package com.google.android.gms.internal.mlkit_vision_common;

import com.appsflyer.ServerParameters;
import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzdc implements C19449c {
    public static final zzdc zza = new zzdc();
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
        zzah f = C13555b.m33967f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("sdkVersion", C16530d.m42017j(hashMap));
        zzah f2 = C13555b.m33967f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("osBuild", C16530d.m42017j(hashMap2));
        zzah f3 = C13555b.m33967f(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(f3.annotationType(), f3);
        zzd = new C19448b(ServerParameters.BRAND, C16530d.m42017j(hashMap3));
        zzah f4 = C13555b.m33967f(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(f4.annotationType(), f4);
        zze = new C19448b(ServerParameters.DEVICE_KEY, C16530d.m42017j(hashMap4));
        zzah f5 = C13555b.m33967f(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(f5.annotationType(), f5);
        zzf = new C19448b("hardware", C16530d.m42017j(hashMap5));
        zzah f6 = C13555b.m33967f(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(f6.annotationType(), f6);
        zzg = new C19448b("manufacturer", C16530d.m42017j(hashMap6));
        zzah f7 = C13555b.m33967f(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(f7.annotationType(), f7);
        zzh = new C19448b(ServerParameters.MODEL, C16530d.m42017j(hashMap7));
        zzah f8 = C13555b.m33967f(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(f8.annotationType(), f8);
        zzi = new C19448b("product", C16530d.m42017j(hashMap8));
        zzah f9 = C13555b.m33967f(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(f9.annotationType(), f9);
        zzj = new C19448b("soc", C16530d.m42017j(hashMap9));
        zzah f11 = C13555b.m33967f(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(f11.annotationType(), f11);
        zzk = new C19448b("socMetaBuildId", C16530d.m42017j(hashMap10));
    }

    private zzdc() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzis zzis = (zzis) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
