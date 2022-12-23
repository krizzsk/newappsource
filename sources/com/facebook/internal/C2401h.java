package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.internal.C2440z;
import com.usebutton.sdk.internal.events.Events;
import mf0.C24362h;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: com.facebook.internal.h */
public final class C2401h {

    /* renamed from: com.facebook.internal.h$a */
    public interface C2402a {
        /* renamed from: a */
        Bundle mo299a();

        Bundle getParameters();
    }

    /* renamed from: a */
    public static final boolean m6343a(C2396f fVar) {
        C24362h.m61211f(fVar, "feature");
        if (m6344b(fVar).f8750b != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a A[SYNTHETIC, Splitter:B:25:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebook.internal.C2440z.C2446f m6344b(com.facebook.internal.C2396f r7) {
        /*
            java.lang.String r0 = "feature"
            mf0.C24362h.m61211f(r7, r0)
            java.lang.String r0 = p009a8.C0115o.m211b()
            java.lang.String r1 = r7.getAction()
            java.lang.String r2 = r7.name()
            java.lang.String r3 = "actionName"
            mf0.C24362h.m61211f(r1, r3)
            java.lang.String r3 = "featureName"
            mf0.C24362h.m61211f(r2, r3)
            int r3 = r1.length()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            r6 = 0
            if (r3 != 0) goto L_0x004e
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0031
            r3 = 1
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            if (r3 == 0) goto L_0x0035
            goto L_0x004e
        L_0x0035:
            com.facebook.internal.s r0 = com.facebook.internal.FetchedAppSettingsManager.m6261b(r0)
            if (r0 != 0) goto L_0x003d
            r0 = r6
            goto L_0x0045
        L_0x003d:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.facebook.internal.s$a>> r0 = r0.f8711d
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
        L_0x0045:
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r0.get(r2)
            com.facebook.internal.s$a r0 = (com.facebook.internal.C2429s.C2430a) r0
            goto L_0x004f
        L_0x004e:
            r0 = r6
        L_0x004f:
            if (r0 != 0) goto L_0x0053
            r0 = r6
            goto L_0x0055
        L_0x0053:
            int[] r0 = r0.f8723c
        L_0x0055:
            if (r0 != 0) goto L_0x005f
            int[] r0 = new int[r5]
            int r7 = r7.getMinVersion()
            r0[r4] = r7
        L_0x005f:
            com.facebook.internal.z r7 = com.facebook.internal.C2440z.f8743a
            java.lang.Class<com.facebook.internal.z> r7 = com.facebook.internal.C2440z.class
            boolean r2 = p262t8.C6606a.m15601b(r7)
            if (r2 == 0) goto L_0x006a
            goto L_0x0081
        L_0x006a:
            java.util.HashMap r2 = com.facebook.internal.C2440z.f8745c     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x007d }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x007d }
            if (r1 != 0) goto L_0x0076
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.f60173b     // Catch:{ all -> 0x007d }
        L_0x0076:
            com.facebook.internal.z r2 = com.facebook.internal.C2440z.f8743a     // Catch:{ all -> 0x007d }
            com.facebook.internal.z$f r6 = r2.mo12601k(r1, r0)     // Catch:{ all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            p262t8.C6606a.m15600a(r7, r0)
        L_0x0081:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2401h.m6344b(com.facebook.internal.f):com.facebook.internal.z$f");
    }

    /* renamed from: c */
    public static final void m6345c(C2373a aVar, C2402a aVar2, C2396f fVar) {
        Bundle bundle;
        C24362h.m61211f(aVar, "appCall");
        C24362h.m61211f(fVar, "feature");
        Context a = C0115o.m210a();
        String action = fVar.getAction();
        C2440z.C2446f b = m6344b(fVar);
        int i = b.f8750b;
        if (i != -1) {
            if (C2440z.m6409p(i)) {
                bundle = aVar2.getParameters();
            } else {
                bundle = aVar2.mo299a();
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            String uuid = aVar.mo12536a().toString();
            Class<C2440z> cls = C2440z.class;
            Intent intent = null;
            if (!C6606a.m15601b(cls)) {
                try {
                    C2440z.C2445e eVar = b.f8749a;
                    if (eVar != null) {
                        Intent s = C2440z.m6412s(a, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(eVar.mo12603c()).addCategory("android.intent.category.DEFAULT"));
                        if (s != null) {
                            C2440z.m6410q(s, uuid, action, b.f8750b, bundle);
                            intent = s;
                        }
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
            if (intent == null) {
                throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
            } else if (!C6606a.m15601b(aVar)) {
                try {
                    aVar.f8602c = intent;
                } catch (Throwable th2) {
                    C6606a.m15600a(aVar, th2);
                }
            }
        } else {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
    }

    /* renamed from: d */
    public static final void m6346d(C2373a aVar, FacebookException facebookException) {
        C24362h.m61211f(aVar, "appCall");
        int i = C2400g0.f8641a;
        C2400g0.m6337b(C0115o.m210a(), true);
        Intent intent = new Intent();
        intent.setClass(C0115o.m210a(), FacebookActivity.class);
        intent.setAction("PassThrough");
        C2440z zVar = C2440z.f8743a;
        C2440z.m6410q(intent, aVar.mo12536a().toString(), (String) null, C2440z.m6405l(), C2440z.m6399c(facebookException));
        if (!C6606a.m15601b(aVar)) {
            try {
                aVar.f8602c = intent;
            } catch (Throwable th) {
                C6606a.m15600a(aVar, th);
            }
        }
    }

    /* renamed from: e */
    public static final void m6347e(C2373a aVar, String str, Bundle bundle) {
        C24362h.m61211f(aVar, "appCall");
        int i = C2400g0.f8641a;
        C2400g0.m6337b(C0115o.m210a(), true);
        C2400g0.m6338c(C0115o.m210a(), true);
        Bundle bundle2 = new Bundle();
        bundle2.putString(Events.PROPERTY_ACTION, str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        C2440z zVar = C2440z.f8743a;
        C2440z.m6410q(intent, aVar.mo12536a().toString(), str, C2440z.m6405l(), bundle2);
        intent.setClass(C0115o.m210a(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        if (!C6606a.m15601b(aVar)) {
            try {
                aVar.f8602c = intent;
            } catch (Throwable th) {
                C6606a.m15600a(aVar, th);
            }
        }
    }
}
