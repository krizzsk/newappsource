package p197o8;

import android.annotation.TargetApi;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import java.util.HashMap;
import mf0.C24362h;
import p009a8.C0115o;
import p262t8.C6606a;
import uh0.C25081h;

/* renamed from: o8.a */
public final class C6010a {

    /* renamed from: a */
    public static final C6010a f19206a = new C6010a();

    /* renamed from: b */
    public static final HashMap<String, NsdManager.RegistrationListener> f19207b = new HashMap<>();

    /* renamed from: o8.a$a */
    public static final class C6011a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        public final /* synthetic */ String f19208a;

        /* renamed from: b */
        public final /* synthetic */ String f19209b;

        public C6011a(String str, String str2) {
            this.f19208a = str;
            this.f19209b = str2;
        }

        public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            C24362h.m61211f(nsdServiceInfo, "serviceInfo");
            C6010a aVar = C6010a.f19206a;
            C6010a.m14494a(this.f19209b);
        }

        public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            C24362h.m61211f(nsdServiceInfo, "NsdServiceInfo");
            if (!C24362h.m61206a(this.f19208a, nsdServiceInfo.getServiceName())) {
                C6010a aVar = C6010a.f19206a;
                C6010a.m14494a(this.f19209b);
            }
        }

        public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            C24362h.m61211f(nsdServiceInfo, "serviceInfo");
        }

        public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            C24362h.m61211f(nsdServiceInfo, "serviceInfo");
        }
    }

    /* renamed from: a */
    public static final void m14494a(String str) {
        Class<C6010a> cls = C6010a.class;
        if (!C6606a.m15601b(cls)) {
            try {
                f19206a.mo22010b(str);
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: c */
    public static final boolean m14495c() {
        Class<C6010a> cls = C6010a.class;
        if (C6606a.m15601b(cls)) {
            return false;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
            C2429s b = FetchedAppSettingsManager.m6261b(C0115o.m211b());
            if (b == null || !b.f8710c.contains(SmartLoginOption.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0023 */
    @android.annotation.TargetApi(16)
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22010b(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = p262t8.C6606a.m15601b(r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.HashMap<java.lang.String, android.net.nsd.NsdManager$RegistrationListener> r0 = f19207b     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0038 }
            android.net.nsd.NsdManager$RegistrationListener r0 = (android.net.nsd.NsdManager.RegistrationListener) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            android.content.Context r1 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "servicediscovery"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x002f
            android.net.nsd.NsdManager r1 = (android.net.nsd.NsdManager) r1     // Catch:{ all -> 0x0038 }
            r1.unregisterService(r0)     // Catch:{ IllegalArgumentException -> 0x0023 }
            goto L_0x0029
        L_0x0023:
            com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0038 }
            com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0038 }
            a8.o r0 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0038 }
        L_0x0029:
            java.util.HashMap<java.lang.String, android.net.nsd.NsdManager$RegistrationListener> r0 = f19207b     // Catch:{ all -> 0x0038 }
            r0.remove(r4)     // Catch:{ all -> 0x0038 }
            goto L_0x0037
        L_0x002f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "null cannot be cast to non-null type android.net.nsd.NsdManager"
            r4.<init>(r0)     // Catch:{ all -> 0x0038 }
            throw r4     // Catch:{ all -> 0x0038 }
        L_0x0037:
            return
        L_0x0038:
            r4 = move-exception
            p262t8.C6606a.m15600a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p197o8.C6010a.mo22010b(java.lang.String):void");
    }

    @TargetApi(16)
    /* renamed from: d */
    public final boolean mo22011d(String str) {
        if (C6606a.m15601b(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = f19207b;
            if (hashMap.containsKey(str)) {
                return true;
            }
            C0115o oVar = C0115o.f331a;
            String str2 = "fbsdk_" + C24362h.m61216k(C25081h.m62834E("15.1.0", '.', '|'), "android-") + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = C0115o.m210a().getSystemService("servicediscovery");
            if (systemService != null) {
                C6011a aVar = new C6011a(str2, str);
                hashMap.put(str, aVar);
                ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return false;
        }
    }
}
