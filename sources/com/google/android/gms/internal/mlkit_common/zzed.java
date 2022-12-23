package com.google.android.gms.internal.mlkit_common;

import com.appsflyer.ServerParameters;
import java.io.IOException;
import java.util.HashMap;
import p001a0.C0017h;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzed implements C19449c {
    public static final zzed zza = new zzed();
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
        zzbi L = C0017h.m55L(1);
        HashMap hashMap = new HashMap();
        hashMap.put(L.annotationType(), L);
        zzb = new C19448b("sdkVersion", C16530d.m42017j(hashMap));
        zzbi L2 = C0017h.m55L(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(L2.annotationType(), L2);
        zzc = new C19448b("osBuild", C16530d.m42017j(hashMap2));
        zzbi L3 = C0017h.m55L(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(L3.annotationType(), L3);
        zzd = new C19448b(ServerParameters.BRAND, C16530d.m42017j(hashMap3));
        zzbi L4 = C0017h.m55L(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(L4.annotationType(), L4);
        zze = new C19448b(ServerParameters.DEVICE_KEY, C16530d.m42017j(hashMap4));
        zzbi L5 = C0017h.m55L(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(L5.annotationType(), L5);
        zzf = new C19448b("hardware", C16530d.m42017j(hashMap5));
        zzbi L6 = C0017h.m55L(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(L6.annotationType(), L6);
        zzg = new C19448b("manufacturer", C16530d.m42017j(hashMap6));
        zzbi L7 = C0017h.m55L(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(L7.annotationType(), L7);
        zzh = new C19448b(ServerParameters.MODEL, C16530d.m42017j(hashMap7));
        zzbi L8 = C0017h.m55L(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(L8.annotationType(), L8);
        zzi = new C19448b("product", C16530d.m42017j(hashMap8));
        zzbi L9 = C0017h.m55L(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(L9.annotationType(), L9);
        zzj = new C19448b("soc", C16530d.m42017j(hashMap9));
        zzbi L10 = C0017h.m55L(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(L10.annotationType(), L10);
        zzk = new C19448b("socMetaBuildId", C16530d.m42017j(hashMap10));
    }

    private zzed() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzkg zzkg = (zzkg) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
