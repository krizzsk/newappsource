package nj0;

import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import mf0.C24368m;
import oj0.C24630a;
import p221q6.C6181b;
import p331z3.C7453a;
import pj0.C24723b;
import pj0.C24724c;
import qj0.C24790a;

/* renamed from: nj0.c */
public final class C24542c {

    /* renamed from: a */
    public static volatile int f62162a;

    /* renamed from: b */
    public static final C24724c f62163b = new C24724c();

    /* renamed from: c */
    public static final C6181b f62164c = new C6181b();

    /* renamed from: d */
    public static final String[] f62165d = {"1.6", "1.7"};

    /* renamed from: e */
    public static String f62166e = "org/slf4j/impl/StaticLoggerBinder.class";

    static {
        String str = null;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
        }
        if (str != null) {
            str.equalsIgnoreCase(InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        }
    }

    /* renamed from: a */
    public static LinkedHashSet m61717a() {
        Enumeration<URL> enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C24542c.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f62166e);
            } else {
                enumeration = classLoader.getResources(f62166e);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
        } catch (IOException e) {
            C24368m.m61233g("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public static C24541b m61718b(String str) {
        C24540a aVar;
        if (f62162a == 0) {
            synchronized (C24542c.class) {
                if (f62162a == 0) {
                    f62162a = 1;
                    m61720d();
                }
            }
        }
        int i = f62162a;
        if (i == 1) {
            aVar = f62163b;
        } else if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            C24790a aVar2 = C24790a.f62710d;
            if (!aVar2.f62712a) {
                aVar = aVar2.f62713b;
            } else {
                C7453a aVar3 = aVar2.f62714c.f15308a;
                if (aVar3 != null) {
                    aVar = aVar3.mo23709a();
                } else {
                    throw new IllegalStateException("contextSelector cannot be null. See also http://logback.qos.ch/codes.html#null_CS");
                }
            }
        } else if (i == 4) {
            aVar = f62164c;
        } else {
            throw new IllegalStateException("Unreachable code");
        }
        return aVar.mo22168a(str);
    }

    /* renamed from: c */
    public static boolean m61719c() {
        String str = null;
        try {
            str = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r6.contains("org.slf4j.impl.StaticLoggerBinder") != false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e A[Catch:{ NoClassDefFoundError -> 0x0050, NoSuchMethodError -> 0x002f, Exception -> 0x0017, all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2 A[SYNTHETIC, Splitter:B:48:0x00d2] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m61720d() {
        /*
            java.lang.String r0 = "Failed to instantiate SLF4J LoggerFactory"
            r1 = 1
            r2 = 2
            r3 = 0
            r4 = 3
            boolean r5 = m61719c()     // Catch:{ NoClassDefFoundError -> 0x0050, NoSuchMethodError -> 0x002f, Exception -> 0x0017 }
            if (r5 != 0) goto L_0x0019
            java.util.LinkedHashSet r5 = m61717a()     // Catch:{ NoClassDefFoundError -> 0x0050, NoSuchMethodError -> 0x002f, Exception -> 0x0017 }
            m61723g(r5)     // Catch:{ NoClassDefFoundError -> 0x0050, NoSuchMethodError -> 0x002f, Exception -> 0x0017 }
            goto L_0x001a
        L_0x0014:
            r0 = move-exception
            goto L_0x00d8
        L_0x0017:
            r1 = move-exception
            goto L_0x0022
        L_0x0019:
            r5 = 0
        L_0x001a:
            qj0.a r6 = qj0.C24790a.f62710d     // Catch:{ NoClassDefFoundError -> 0x0050, NoSuchMethodError -> 0x002f, Exception -> 0x0017 }
            f62162a = r4     // Catch:{ NoClassDefFoundError -> 0x0050, NoSuchMethodError -> 0x002f, Exception -> 0x0017 }
            m61722f(r5)     // Catch:{ NoClassDefFoundError -> 0x0050, NoSuchMethodError -> 0x002f, Exception -> 0x0017 }
            goto L_0x0080
        L_0x0022:
            f62162a = r2     // Catch:{ all -> 0x0014 }
            mf0.C24368m.m61233g(r0, r1)     // Catch:{ all -> 0x0014 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = "Unexpected initialization failure"
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x002f:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x004f
            java.lang.String r3 = "org.slf4j.impl.StaticLoggerBinder.getSingleton()"
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x004f
            f62162a = r2     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "slf4j-api 1.6.x (or later) is incompatible with this binding."
            mf0.C24368m.m61232d(r1)     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Your binding is version 1.5.5 or earlier."
            mf0.C24368m.m61232d(r1)     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Upgrade your binding to version 1.6.x."
            mf0.C24368m.m61232d(r1)     // Catch:{ all -> 0x0014 }
        L_0x004f:
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0050:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()     // Catch:{ all -> 0x0014 }
            if (r6 != 0) goto L_0x0058
            goto L_0x006b
        L_0x0058:
            java.lang.String r7 = "org/slf4j/impl/StaticLoggerBinder"
            boolean r7 = r6.contains(r7)     // Catch:{ all -> 0x0014 }
            if (r7 == 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            java.lang.String r7 = "org.slf4j.impl.StaticLoggerBinder"
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x0014 }
            if (r6 == 0) goto L_0x006b
        L_0x0069:
            r6 = 1
            goto L_0x006c
        L_0x006b:
            r6 = 0
        L_0x006c:
            if (r6 == 0) goto L_0x00d2
            r0 = 4
            f62162a = r0     // Catch:{ all -> 0x0014 }
            java.lang.String r0 = "Failed to load class \"org.slf4j.impl.StaticLoggerBinder\"."
            mf0.C24368m.m61232d(r0)     // Catch:{ all -> 0x0014 }
            java.lang.String r0 = "Defaulting to no-operation (NOP) logger implementation"
            mf0.C24368m.m61232d(r0)     // Catch:{ all -> 0x0014 }
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details."
            mf0.C24368m.m61232d(r0)     // Catch:{ all -> 0x0014 }
        L_0x0080:
            m61721e()
            int r0 = f62162a
            if (r0 != r4) goto L_0x00d1
            qj0.a r0 = qj0.C24790a.f62710d     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            java.lang.String r0 = "1.6"
            java.lang.String[] r2 = f62165d     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            int r4 = r2.length     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            r5 = 0
        L_0x008f:
            if (r3 >= r4) goto L_0x009d
            r6 = r2[r3]     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            boolean r6 = r0.startsWith(r6)     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            if (r6 == 0) goto L_0x009a
            r5 = 1
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x008f
        L_0x009d:
            if (r5 != 0) goto L_0x00d1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            r1.<init>()     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            java.lang.String r2 = "The requested version "
            r1.append(r2)     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            r1.append(r0)     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            java.lang.String r0 = " by your slf4j binding is not compatible with "
            r1.append(r0)     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            java.lang.String[] r0 = f62165d     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            java.lang.String r0 = r0.toString()     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            r1.append(r0)     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            java.lang.String r0 = r1.toString()     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            mf0.C24368m.m61232d(r0)     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#version_mismatch for further details."
            mf0.C24368m.m61232d(r0)     // Catch:{ NoSuchFieldError -> 0x00d1, all -> 0x00cb }
            goto L_0x00d1
        L_0x00cb:
            r0 = move-exception
            java.lang.String r1 = "Unexpected problem occured during version sanity check"
            mf0.C24368m.m61233g(r1, r0)
        L_0x00d1:
            return
        L_0x00d2:
            f62162a = r2     // Catch:{ all -> 0x0014 }
            mf0.C24368m.m61233g(r0, r5)     // Catch:{ all -> 0x0014 }
            throw r5     // Catch:{ all -> 0x0014 }
        L_0x00d8:
            m61721e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nj0.C24542c.m61720d():void");
    }

    /* renamed from: e */
    public static void m61721e() {
        C24724c cVar = f62163b;
        synchronized (cVar) {
            cVar.getClass();
            Iterator it = new ArrayList(cVar.f62589b.values()).iterator();
            while (it.hasNext()) {
                C24723b bVar = (C24723b) it.next();
                m61718b(bVar.f62588b);
                bVar.getClass();
            }
        }
        LinkedBlockingQueue<C24630a> linkedBlockingQueue = f62163b.f62590c;
        linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(RecyclerView.C1119a0.FLAG_IGNORE);
        while (linkedBlockingQueue.drainTo(arrayList, RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                C24630a aVar = (C24630a) it2.next();
                if (aVar == null) {
                    aVar.getClass();
                    throw null;
                }
                throw null;
            }
            arrayList.clear();
        }
        C24724c cVar2 = f62163b;
        cVar2.f62589b.clear();
        cVar2.f62590c.clear();
    }

    /* renamed from: f */
    public static void m61722f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet != null) {
            boolean z = true;
            if (linkedHashSet.size() <= 1) {
                z = false;
            }
            if (z) {
                StringBuilder k = C13555b.m33972k("Actual binding is of type [");
                k.append(C24790a.f62710d.f62714c.getClass().getName());
                k.append("]");
                C24368m.m61232d(k.toString());
            }
        }
    }

    /* renamed from: g */
    public static void m61723g(LinkedHashSet linkedHashSet) {
        boolean z = true;
        if (linkedHashSet.size() <= 1) {
            z = false;
        }
        if (z) {
            C24368m.m61232d("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C24368m.m61232d("Found binding in [" + ((URL) it.next()) + "]");
            }
            C24368m.m61232d("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
