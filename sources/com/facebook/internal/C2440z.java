package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appsflyer.ServerParameters;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C23816b;
import mf0.C24362h;
import p009a8.C0115o;
import p262t8.C6606a;
import p284v5.C6863a;
import p583jk.C17875h;
import uh0.C25081h;

/* renamed from: com.facebook.internal.z */
public final class C2440z {

    /* renamed from: a */
    public static final C2440z f8743a;

    /* renamed from: b */
    public static final ArrayList f8744b;

    /* renamed from: c */
    public static final HashMap f8745c;

    /* renamed from: d */
    public static final AtomicBoolean f8746d = new AtomicBoolean(false);

    /* renamed from: e */
    public static final Integer[] f8747e = {20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};

    /* renamed from: com.facebook.internal.z$a */
    public static final class C2441a extends C2445e {
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ String mo12602b() {
            return null;
        }

        /* renamed from: c */
        public final String mo12603c() {
            return "com.facebook.arstudio.player";
        }
    }

    /* renamed from: com.facebook.internal.z$b */
    public static final class C2442b extends C2445e {
        /* renamed from: b */
        public final String mo12602b() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        /* renamed from: c */
        public final String mo12603c() {
            return "com.instagram.android";
        }

        /* renamed from: d */
        public final String mo12604d() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* renamed from: com.facebook.internal.z$c */
    public static final class C2443c extends C2445e {
        /* renamed from: b */
        public final String mo12602b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* renamed from: c */
        public final String mo12603c() {
            return "com.facebook.katana";
        }

        /* renamed from: e */
        public final void mo12605e() {
            boolean z;
            if (C0115o.m210a().getApplicationInfo().targetSdkVersion >= 30) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Class<C2440z> cls = C2440z.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        C2440z zVar = C2440z.f8743a;
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.z$d */
    public static final class C2444d extends C2445e {
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ String mo12602b() {
            return null;
        }

        /* renamed from: c */
        public final String mo12603c() {
            return "com.facebook.orca";
        }
    }

    /* renamed from: com.facebook.internal.z$e */
    public static abstract class C2445e {

        /* renamed from: a */
        public TreeSet<Integer> f8748a;

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            if (mf0.C24362h.m61206a(r4, java.lang.Boolean.FALSE) == false) goto L_0x001c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0042 A[Catch:{ all -> 0x002c }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo12606a(boolean r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                r0 = 0
                if (r4 != 0) goto L_0x001c
                java.util.TreeSet<java.lang.Integer> r4 = r3.f8748a     // Catch:{ all -> 0x0047 }
                if (r4 == 0) goto L_0x001c
                if (r4 != 0) goto L_0x000c
                r4 = r0
                goto L_0x0014
            L_0x000c:
                boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0047 }
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0047 }
            L_0x0014:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0047 }
                boolean r4 = mf0.C24362h.m61206a(r4, r1)     // Catch:{ all -> 0x0047 }
                if (r4 != 0) goto L_0x0032
            L_0x001c:
                com.facebook.internal.z r4 = com.facebook.internal.C2440z.f8743a     // Catch:{ all -> 0x0047 }
                java.lang.Class<com.facebook.internal.z> r1 = com.facebook.internal.C2440z.class
                boolean r2 = p262t8.C6606a.m15601b(r1)     // Catch:{ all -> 0x0047 }
                if (r2 == 0) goto L_0x0027
                goto L_0x0030
            L_0x0027:
                java.util.TreeSet r0 = r4.mo12600g(r3)     // Catch:{ all -> 0x002c }
                goto L_0x0030
            L_0x002c:
                r4 = move-exception
                p262t8.C6606a.m15600a(r1, r4)     // Catch:{ all -> 0x0047 }
            L_0x0030:
                r3.f8748a = r0     // Catch:{ all -> 0x0047 }
            L_0x0032:
                java.util.TreeSet<java.lang.Integer> r4 = r3.f8748a     // Catch:{ all -> 0x0047 }
                if (r4 == 0) goto L_0x003f
                boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0047 }
                if (r4 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r4 = 0
                goto L_0x0040
            L_0x003f:
                r4 = 1
            L_0x0040:
                if (r4 == 0) goto L_0x0045
                r3.mo12605e()     // Catch:{ all -> 0x0047 }
            L_0x0045:
                monitor-exit(r3)
                return
            L_0x0047:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2440z.C2445e.mo12606a(boolean):void");
        }

        /* renamed from: b */
        public abstract String mo12602b();

        /* renamed from: c */
        public abstract String mo12603c();

        /* renamed from: d */
        public String mo12604d() {
            return "id_token,token,signed_request,graph_domain";
        }

        /* renamed from: e */
        public void mo12605e() {
        }
    }

    /* renamed from: com.facebook.internal.z$f */
    public static final class C2446f {

        /* renamed from: a */
        public C2445e f8749a;

        /* renamed from: b */
        public int f8750b;
    }

    /* renamed from: com.facebook.internal.z$g */
    public static final class C2447g extends C2445e {
        /* renamed from: b */
        public final String mo12602b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* renamed from: c */
        public final String mo12603c() {
            return "com.facebook.wakizashi";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d A[SYNTHETIC, Splitter:B:9:0x003d] */
    static {
        /*
            com.facebook.internal.z r0 = new com.facebook.internal.z
            r0.<init>()
            f8743a = r0
            java.util.ArrayList r1 = r0.mo12598a()
            f8744b = r1
            boolean r1 = p262t8.C6606a.m15601b(r0)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0017
            goto L_0x0030
        L_0x0017:
            com.facebook.internal.z$e[] r1 = new com.facebook.internal.C2440z.C2445e[r2]     // Catch:{ all -> 0x002c }
            com.facebook.internal.z$a r5 = new com.facebook.internal.z$a     // Catch:{ all -> 0x002c }
            r5.<init>()     // Catch:{ all -> 0x002c }
            r1[r4] = r5     // Catch:{ all -> 0x002c }
            java.util.ArrayList r1 = p583jk.C17875h.m44299h(r1)     // Catch:{ all -> 0x002c }
            java.util.ArrayList r5 = r0.mo12598a()     // Catch:{ all -> 0x002c }
            r1.addAll(r5)     // Catch:{ all -> 0x002c }
            goto L_0x0031
        L_0x002c:
            r1 = move-exception
            p262t8.C6606a.m15600a(r0, r1)
        L_0x0030:
            r1 = r3
        L_0x0031:
            com.facebook.internal.z r0 = f8743a
            r0.getClass()
            boolean r5 = p262t8.C6606a.m15601b(r0)
            if (r5 == 0) goto L_0x003d
            goto L_0x007f
        L_0x003d:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x007b }
            r5.<init>()     // Catch:{ all -> 0x007b }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x007b }
            r6.<init>()     // Catch:{ all -> 0x007b }
            com.facebook.internal.z$d r7 = new com.facebook.internal.z$d     // Catch:{ all -> 0x007b }
            r7.<init>()     // Catch:{ all -> 0x007b }
            r6.add(r7)     // Catch:{ all -> 0x007b }
            java.lang.String r7 = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"
            java.util.ArrayList r8 = f8744b     // Catch:{ all -> 0x007b }
            r5.put(r7, r8)     // Catch:{ all -> 0x007b }
            java.lang.String r7 = "com.facebook.platform.action.request.FEED_DIALOG"
            r5.put(r7, r8)     // Catch:{ all -> 0x007b }
            java.lang.String r7 = "com.facebook.platform.action.request.LIKE_DIALOG"
            r5.put(r7, r8)     // Catch:{ all -> 0x007b }
            java.lang.String r7 = "com.facebook.platform.action.request.APPINVITES_DIALOG"
            r5.put(r7, r8)     // Catch:{ all -> 0x007b }
            java.lang.String r7 = "com.facebook.platform.action.request.MESSAGE_DIALOG"
            r5.put(r7, r6)     // Catch:{ all -> 0x007b }
            java.lang.String r7 = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"
            r5.put(r7, r6)     // Catch:{ all -> 0x007b }
            java.lang.String r6 = "com.facebook.platform.action.request.CAMERA_EFFECT"
            r5.put(r6, r1)     // Catch:{ all -> 0x007b }
            java.lang.String r1 = "com.facebook.platform.action.request.SHARE_STORY"
            r5.put(r1, r8)     // Catch:{ all -> 0x007b }
            r3 = r5
            goto L_0x007f
        L_0x007b:
            r1 = move-exception
            p262t8.C6606a.m15600a(r0, r1)
        L_0x007f:
            f8745c = r3
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r4)
            f8746d = r0
            r0 = 22
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 20210906(0x13464da, float:3.3133136E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            r1 = 20171115(0x133c96b, float:3.3021618E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            r1 = 2
            r2 = 20170417(0x133c6b1, float:3.3019662E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 3
            r2 = 20170411(0x133c6ab, float:3.3019645E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 4
            r2 = 20170213(0x133c5e5, float:3.301909E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 5
            r2 = 20161017(0x133a1f9, float:3.2993317E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 6
            r2 = 20160327(0x1339f47, float:3.2991384E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 7
            r2 = 20150702(0x13379ae, float:3.2964409E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 8
            r2 = 20150401(0x1337881, float:3.2963565E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 9
            r2 = 20141218(0x13354a2, float:3.293783E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 10
            r2 = 20141107(0x1335433, float:3.2937518E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 11
            r2 = 20141028(0x13353e4, float:3.2937296E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 12
            r2 = 20141001(0x13353c9, float:3.293722E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 13
            r2 = 20140701(0x133529d, float:3.293638E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 14
            r2 = 20140324(0x1335124, float:3.2935323E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 15
            r2 = 20140313(0x1335119, float:3.2935292E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 16
            r2 = 20140204(0x13350ac, float:3.2934987E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 17
            r2 = 20131107(0x1332d23, float:3.2909492E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 18
            r2 = 20131024(0x1332cd0, float:3.290926E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 19
            r2 = 20130618(0x1332b3a, float:3.290812E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 20
            r2 = 20130502(0x1332ac6, float:3.2907796E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 21
            r2 = 20121101(0x133060d, float:3.288145E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            f8747e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2440z.<clinit>():void");
    }

    /* renamed from: b */
    public static final int m6398b(TreeSet<Integer> treeSet, int i, int[] iArr) {
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls)) {
            return 0;
        }
        if (treeSet == null) {
            return -1;
        }
        try {
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i2 = -1;
            while (descendingIterator.hasNext()) {
                Integer next = descendingIterator.next();
                C24362h.m61210e(next, "fbAppVersion");
                i2 = Math.max(i2, next.intValue());
                while (length >= 0 && iArr[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == next.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i2, i);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return 0;
        }
    }

    /* renamed from: c */
    public static final Bundle m6399c(FacebookException facebookException) {
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls) || facebookException == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", facebookException.toString());
            if (facebookException instanceof FacebookOperationCanceledException) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Intent m6400e(android.content.Context r6) {
        /*
            java.lang.Class<com.facebook.internal.z> r0 = com.facebook.internal.C2440z.class
            boolean r1 = p262t8.C6606a.m15601b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "context"
            mf0.C24362h.m61211f(r6, r1)     // Catch:{ all -> 0x0067 }
            java.util.ArrayList r1 = f8744b     // Catch:{ all -> 0x0067 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0067 }
        L_0x0015:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0067 }
            com.facebook.internal.z$e r3 = (com.facebook.internal.C2440z.C2445e) r3     // Catch:{ all -> 0x0067 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x0067 }
            java.lang.String r5 = "com.facebook.platform.PLATFORM_SERVICE"
            r4.<init>(r5)     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = r3.mo12603c()     // Catch:{ all -> 0x0067 }
            android.content.Intent r3 = r4.setPackage(r3)     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = "android.intent.category.DEFAULT"
            android.content.Intent r3 = r3.addCategory(r4)     // Catch:{ all -> 0x0067 }
            boolean r4 = p262t8.C6606a.m15601b(r0)     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x003d
            goto L_0x0062
        L_0x003d:
            if (r3 != 0) goto L_0x0040
            goto L_0x0062
        L_0x0040:
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch:{ all -> 0x005e }
            r5 = 0
            android.content.pm.ResolveInfo r4 = r4.resolveService(r3, r5)     // Catch:{ all -> 0x005e }
            if (r4 != 0) goto L_0x004c
            goto L_0x0062
        L_0x004c:
            java.util.HashSet<java.lang.String> r5 = com.facebook.internal.C2424o.f8697a     // Catch:{ all -> 0x005e }
            android.content.pm.ServiceInfo r4 = r4.serviceInfo     // Catch:{ all -> 0x005e }
            java.lang.String r4 = r4.packageName     // Catch:{ all -> 0x005e }
            java.lang.String r5 = "resolveInfo.serviceInfo.packageName"
            mf0.C24362h.m61210e(r4, r5)     // Catch:{ all -> 0x005e }
            boolean r4 = com.facebook.internal.C2424o.m6376a(r6, r4)     // Catch:{ all -> 0x005e }
            if (r4 != 0) goto L_0x0063
            goto L_0x0062
        L_0x005e:
            r3 = move-exception
            p262t8.C6606a.m15600a(r0, r3)     // Catch:{ all -> 0x0067 }
        L_0x0062:
            r3 = r2
        L_0x0063:
            if (r3 == 0) goto L_0x0015
            return r3
        L_0x0066:
            return r2
        L_0x0067:
            r6 = move-exception
            p262t8.C6606a.m15600a(r0, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2440z.m6400e(android.content.Context):android.content.Intent");
    }

    /* renamed from: f */
    public static final Intent m6401f(Intent intent, Bundle bundle, FacebookException facebookException) {
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            UUID i = m6403i(intent);
            if (i == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m6407n(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", i.toString());
            if (facebookException != null) {
                bundle2.putBundle("error", m6399c(facebookException));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: h */
    public static final Bundle m6402h(Intent intent) {
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(intent, "intent");
            if (!m6409p(m6407n(intent))) {
                return null;
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: i */
    public static final UUID m6403i(Intent intent) {
        String str;
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls) || intent == null) {
            return null;
        }
        try {
            if (m6409p(m6407n(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                if (bundleExtra != null) {
                    str = bundleExtra.getString("action_id");
                } else {
                    str = null;
                }
            } else {
                str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (str == null) {
                return null;
            }
            try {
                return UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: j */
    public static final FacebookException m6404j(Bundle bundle) {
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string == null || !C25081h.m62830A(string, "UserCanceled", true)) {
                return new FacebookException(string2);
            }
            return new FacebookOperationCanceledException(string2);
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: l */
    public static final int m6405l() {
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls)) {
            return 0;
        }
        try {
            return f8747e[0].intValue();
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return 0;
        }
    }

    /* renamed from: m */
    public static final Bundle m6406m(Intent intent) {
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            if (!m6409p(m6407n(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: n */
    public static final int m6407n(Intent intent) {
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls)) {
            return 0;
        }
        try {
            C24362h.m61211f(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return 0;
        }
    }

    /* renamed from: o */
    public static final boolean m6408o(Intent intent) {
        Boolean bool;
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls)) {
            return false;
        }
        try {
            C24362h.m61211f(intent, "resultIntent");
            Bundle h = m6402h(intent);
            if (h == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(h.containsKey("error"));
            }
            if (bool == null) {
                return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
            }
            return bool.booleanValue();
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return false;
        }
    }

    /* renamed from: p */
    public static final boolean m6409p(int i) {
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls)) {
            return false;
        }
        try {
            return C23816b.m58437S0(f8747e, Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return false;
        }
    }

    /* renamed from: q */
    public static final void m6410q(Intent intent, String str, String str2, int i, Bundle bundle) {
        Class<C2440z> cls = C2440z.class;
        if (!C6606a.m15601b(cls)) {
            try {
                String b = C0115o.m211b();
                C2400g0.m6342g();
                String str3 = C0115o.f335e;
                intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", b);
                if (m6409p(i)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("action_id", str);
                    C2397f0.m6300I(bundle2, ServerParameters.APP_NAME, str3);
                    intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
                    return;
                }
                intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
                if (!C2397f0.m6292A(str3)) {
                    intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", str3);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: r */
    public static final void m6411r() {
        Class<C2440z> cls = C2440z.class;
        if (!C6606a.m15601b(cls)) {
            try {
                if (f8746d.compareAndSet(false, true)) {
                    C0115o.m212c().execute(new C6863a(2));
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: s */
    public static final Intent m6412s(Context context, Intent intent) {
        Class<C2440z> cls = C2440z.class;
        if (C6606a.m15601b(cls) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null) {
                return null;
            }
            HashSet<String> hashSet = C2424o.f8697a;
            String str = resolveActivity.activityInfo.packageName;
            C24362h.m61210e(str, "resolveInfo.activityInfo.packageName");
            if (!C2424o.m6376a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: a */
    public final ArrayList mo12598a() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            return C17875h.m44299h(new C2443c(), new C2447g());
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: d */
    public final Intent mo12599d(C2445e eVar, String str, Set set, String str2, boolean z, DefaultAudience defaultAudience, String str3, String str4, boolean z2, String str5, boolean z3, LoginTargetApp loginTargetApp, boolean z4, boolean z5, String str6) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            String b = eVar.mo12602b();
            if (b == null) {
                return null;
            }
            String str7 = str;
            Intent putExtra = new Intent().setClassName(eVar.mo12603c(), b).putExtra("client_id", str);
            C24362h.m61210e(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            C0115o oVar = C0115o.f331a;
            putExtra.putExtra("facebook_sdk_version", "15.1.0");
            C2397f0 f0Var = C2397f0.f8630a;
            if (!(set.isEmpty())) {
                Set set2 = set;
                putExtra.putExtra("scope", TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, set));
            }
            if (!C2397f0.m6292A(str2)) {
                String str8 = str2;
                putExtra.putExtra("e2e", str2);
            }
            String str9 = str3;
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", eVar.mo12604d());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            if (z) {
                putExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
            }
            putExtra.putExtra("legacy_override", C0115o.m213d());
            String str10 = str4;
            putExtra.putExtra("auth_type", str4);
            if (z2) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z3);
            if (z4) {
                putExtra.putExtra("fx_app", loginTargetApp.toString());
            }
            if (z5) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095 A[SYNTHETIC, Splitter:B:35:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009d A[Catch:{ all -> 0x0049, all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e A[Catch:{ all -> 0x0049, all -> 0x00a2 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.TreeSet<java.lang.Integer> mo12600g(com.facebook.internal.C2440z.C2445e r12) {
        /*
            r11 = this;
            java.lang.String r0 = "version"
            boolean r1 = p262t8.C6606a.m15601b(r11)
            r2 = 0
            if (r1 == 0) goto L_0x000b
            return r2
        L_0x000b:
            java.util.TreeSet r1 = new java.util.TreeSet     // Catch:{ all -> 0x00a2 }
            r1.<init>()     // Catch:{ all -> 0x00a2 }
            android.content.Context r3 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x00a2 }
            android.content.ContentResolver r4 = r3.getContentResolver()     // Catch:{ all -> 0x00a2 }
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch:{ all -> 0x00a2 }
            boolean r3 = p262t8.C6606a.m15601b(r11)     // Catch:{ all -> 0x00a2 }
            if (r3 == 0) goto L_0x0024
        L_0x0022:
            r5 = r2
            goto L_0x004e
        L_0x0024:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r3.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "content://"
            r3.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = r12.mo12603c()     // Catch:{ all -> 0x0049 }
            r3.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = ".provider.PlatformProvider/versions"
            r3.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0049 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)"
            mf0.C24362h.m61210e(r3, r5)     // Catch:{ all -> 0x0049 }
            r5 = r3
            goto L_0x004e
        L_0x0049:
            r3 = move-exception
            p262t8.C6606a.m15600a(r11, r3)     // Catch:{ all -> 0x00a2 }
            goto L_0x0022
        L_0x004e:
            android.content.Context r3 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x0099 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x0099 }
            java.lang.String r12 = r12.mo12603c()     // Catch:{ all -> 0x0099 }
            java.lang.String r7 = ".provider.PlatformProvider"
            java.lang.String r12 = mf0.C24362h.m61216k(r7, r12)     // Catch:{ all -> 0x0099 }
            r7 = 0
            android.content.pm.ProviderInfo r12 = r3.resolveContentProvider(r12, r7)     // Catch:{ RuntimeException -> 0x0066 }
            goto L_0x0068
        L_0x0066:
            r12 = r2
        L_0x0068:
            if (r12 == 0) goto L_0x0091
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x0072 }
            goto L_0x0074
        L_0x0072:
            r12 = r2
        L_0x0074:
            if (r12 == 0) goto L_0x0092
        L_0x0076:
            boolean r3 = r12.moveToNext()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x0092
            int r3 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x008c }
            int r3 = r12.getInt(r3)     // Catch:{ all -> 0x008c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x008c }
            r1.add(r3)     // Catch:{ all -> 0x008c }
            goto L_0x0076
        L_0x008c:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L_0x009b
        L_0x0091:
            r12 = r2
        L_0x0092:
            if (r12 != 0) goto L_0x0095
            goto L_0x0098
        L_0x0095:
            r12.close()     // Catch:{ all -> 0x00a2 }
        L_0x0098:
            return r1
        L_0x0099:
            r12 = move-exception
            r0 = r2
        L_0x009b:
            if (r0 != 0) goto L_0x009e
            goto L_0x00a1
        L_0x009e:
            r0.close()     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r12     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r12 = move-exception
            p262t8.C6606a.m15600a(r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2440z.mo12600g(com.facebook.internal.z$e):java.util.TreeSet");
    }

    /* renamed from: k */
    public final C2446f mo12601k(List<? extends C2445e> list, int[] iArr) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            m6411r();
            if (list == null) {
                C2446f fVar = new C2446f();
                fVar.f8750b = -1;
                return fVar;
            }
            for (C2445e eVar : list) {
                TreeSet<Integer> treeSet = eVar.f8748a;
                if (treeSet == null || !C24362h.m61206a(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    eVar.mo12606a(false);
                }
                int b = m6398b(eVar.f8748a, m6405l(), iArr);
                if (b != -1) {
                    C2446f fVar2 = new C2446f();
                    fVar2.f8749a = eVar;
                    fVar2.f8750b = b;
                    return fVar2;
                }
            }
            C2446f fVar3 = new C2446f();
            fVar3.f8750b = -1;
            return fVar3;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }
}
