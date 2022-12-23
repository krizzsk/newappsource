package com.google.android.gms.internal.mlkit_vision_common;

import com.appsflyer.ServerParameters;
import com.usebutton.sdk.internal.events.Events;
import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzfd implements C19449c {
    public static final zzfd zza = new zzfd();
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

    static {
        zzah f = C13555b.m33967f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("deviceInfo", C16530d.m42017j(hashMap));
        zzah f2 = C13555b.m33967f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("nnapiInfo", C16530d.m42017j(hashMap2));
        zzah f3 = C13555b.m33967f(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(f3.annotationType(), f3);
        zzd = new C19448b("gpuInfo", C16530d.m42017j(hashMap3));
        zzah f4 = C13555b.m33967f(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(f4.annotationType(), f4);
        zze = new C19448b("pipelineIdentifier", C16530d.m42017j(hashMap4));
        zzah f5 = C13555b.m33967f(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(f5.annotationType(), f5);
        zzf = new C19448b("acceptedConfigurations", C16530d.m42017j(hashMap5));
        zzah f6 = C13555b.m33967f(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(f6.annotationType(), f6);
        zzg = new C19448b(Events.PROPERTY_ACTION, C16530d.m42017j(hashMap6));
        zzah f7 = C13555b.m33967f(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(f7.annotationType(), f7);
        zzh = new C19448b(ServerParameters.STATUS, C16530d.m42017j(hashMap7));
        zzah f8 = C13555b.m33967f(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(f8.annotationType(), f8);
        zzi = new C19448b("customErrors", C16530d.m42017j(hashMap8));
        zzah f9 = C13555b.m33967f(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(f9.annotationType(), f9);
        zzj = new C19448b("benchmarkStatus", C16530d.m42017j(hashMap9));
        zzah f11 = C13555b.m33967f(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(f11.annotationType(), f11);
        zzk = new C19448b("validationTestResult", C16530d.m42017j(hashMap10));
        zzah f12 = C13555b.m33967f(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(f12.annotationType(), f12);
        zzl = new C19448b("timestampUs", C16530d.m42017j(hashMap11));
        zzah f13 = C13555b.m33967f(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(f13.annotationType(), f13);
        zzm = new C19448b("elapsedUs", C16530d.m42017j(hashMap12));
    }

    private zzfd() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zziz zziz = (zziz) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
