package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzfl implements C19449c<zzhq> {
    public static final zzfl zza = new zzfl();
    private static final C19448b zzb;
    private static final C19448b zzc;
    private static final C19448b zzd;
    private static final C19448b zze;
    private static final C19448b zzf;

    static {
        zzcw f = C13715c.m34240f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("remoteModelOptions", C16530d.m42017j(hashMap));
        zzcw f2 = C13715c.m34240f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("localModelOptions", C16530d.m42017j(hashMap2));
        zzcw f3 = C13715c.m34240f(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(f3.annotationType(), f3);
        zzd = new C19448b("errorCodes", C16530d.m42017j(hashMap3));
        zzcw f4 = C13715c.m34240f(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(f4.annotationType(), f4);
        zze = new C19448b("modelInitializationMs", C16530d.m42017j(hashMap4));
        zzcw f5 = C13715c.m34240f(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(f5.annotationType(), f5);
        zzf = new C19448b("isNnApiEnabled", C16530d.m42017j(hashMap5));
    }

    private zzfl() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzhq zzhq = (zzhq) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}