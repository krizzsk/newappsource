package p506gd;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.internal.zzbt;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p530hd.C17379d;

/* renamed from: gd.a */
public final class C17170a {

    /* renamed from: e */
    public static final AtomicReference f44404e = new AtomicReference((Object) null);

    /* renamed from: a */
    public final C17174e f44405a;

    /* renamed from: b */
    public final C17379d f44406b;

    /* renamed from: c */
    public final HashSet f44407c = new HashSet();

    /* renamed from: d */
    public final C17171b f44408d;

    public C17170a(Context context) {
        try {
            this.f44405a = new C17174e(context);
            this.f44408d = new C17171b();
            this.f44406b = new C17379d(context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new zzbt(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041 A[LOOP:1: B:10:0x0041->B:13:0x004c, LOOP_START] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m43154c(android.content.Context r9, boolean r10) {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = f44404e
            gd.a r1 = new gd.a
            r1.<init>(r9)
        L_0x0007:
            r2 = 0
            boolean r3 = r0.compareAndSet(r2, r1)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0019
        L_0x0012:
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x0007
            r0 = 0
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r1 = f44404e
            java.lang.Object r1 = r1.get()
            gd.a r1 = (p506gd.C17170a) r1
            if (r0 == 0) goto L_0x005a
            com.google.android.play.core.splitinstall.zzo r0 = com.google.android.play.core.splitinstall.zzo.INSTANCE
            dd.m r3 = new dd.m
            java.util.concurrent.ThreadPoolExecutor r6 = p583jk.C17884p.m44365e0()
            dd.o r7 = new dd.o
            gd.e r8 = r1.f44405a
            r7.<init>(r9, r8)
            gd.e r8 = r1.f44405a
            r3.<init>(r9, r6, r7, r8)
            r0.zzb(r3)
            androidx.lifecycle.u r0 = new androidx.lifecycle.u
            r0.<init>((java.lang.Object) r1)
            java.util.concurrent.atomic.AtomicReference r3 = p530hd.C17383h.f44774a
        L_0x0041:
            boolean r6 = r3.compareAndSet(r2, r0)
            if (r6 == 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            java.lang.Object r6 = r3.get()
            if (r6 == 0) goto L_0x0041
        L_0x004e:
            java.util.concurrent.ThreadPoolExecutor r0 = p583jk.C17884p.m44365e0()
            com.google.android.play.core.assetpacks.w1 r2 = new com.google.android.play.core.assetpacks.w1
            r2.<init>(r9, r4)
            r0.execute(r2)
        L_0x005a:
            r1.mo49754b(r9, r10)     // Catch:{ Exception -> 0x005e }
            return r4
        L_0x005e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p506gd.C17170a.m43154c(android.content.Context, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo49753a(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C17174e eVar = this.f44405a;
            eVar.getClass();
            File file = new File(eVar.mo49764g(), "verified-splits");
            C17174e.m43161e(file);
            C17174e.m43159c(C17174e.m43160d(file, String.valueOf((String) it.next()).concat(".apk")));
        }
        C17379d dVar = this.f44406b;
        dVar.getClass();
        synchronized (C17379d.class) {
            dVar.f44773a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01ff */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x00a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x00d0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c8 A[Catch:{ NameNotFoundException -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4 A[Catch:{ NameNotFoundException -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fc A[SYNTHETIC, Splitter:B:99:0x01fc] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo49754b(android.content.Context r12, boolean r13) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            if (r13 == 0) goto L_0x0009
            gd.e r0 = r11.f44405a     // Catch:{ all -> 0x0294 }
            r0.mo49762b()     // Catch:{ all -> 0x0294 }
            goto L_0x0015
        L_0x0009:
            java.util.concurrent.ThreadPoolExecutor r0 = p583jk.C17884p.m44365e0()     // Catch:{ all -> 0x0294 }
            gd.n r1 = new gd.n     // Catch:{ all -> 0x0294 }
            r1.<init>(r11)     // Catch:{ all -> 0x0294 }
            r0.execute(r1)     // Catch:{ all -> 0x0294 }
        L_0x0015:
            java.lang.String r0 = r12.getPackageName()     // Catch:{ all -> 0x0294 }
            r1 = 1
            r2 = 0
            android.content.pm.PackageManager r3 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0283 }
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0283 }
            java.lang.String[] r3 = r3.splitNames     // Catch:{ NameNotFoundException -> 0x0283 }
            if (r3 != 0) goto L_0x002d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0283 }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x0283 }
            goto L_0x0031
        L_0x002d:
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch:{ NameNotFoundException -> 0x0283 }
        L_0x0031:
            gd.e r0 = r11.f44405a     // Catch:{ all -> 0x0294 }
            java.util.HashSet r0 = r0.mo49761a()     // Catch:{ all -> 0x0294 }
            hd.d r4 = r11.f44406b     // Catch:{ all -> 0x0294 }
            java.util.Set r4 = r4.mo49854a()     // Catch:{ all -> 0x0294 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0294 }
            r5.<init>()     // Catch:{ all -> 0x0294 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0294 }
        L_0x0046:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0294 }
            r8 = 2
            if (r7 == 0) goto L_0x007f
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0294 }
            gd.o r7 = (p506gd.C17184o) r7     // Catch:{ all -> 0x0294 }
            java.lang.String r7 = r7.mo49756b()     // Catch:{ all -> 0x0294 }
            boolean r9 = r3.contains(r7)     // Catch:{ all -> 0x0294 }
            if (r9 != 0) goto L_0x0078
            int r9 = p530hd.C17384i.f44775a     // Catch:{ all -> 0x0294 }
            java.lang.String r9 = "config."
            boolean r9 = r7.startsWith(r9)     // Catch:{ all -> 0x0294 }
            if (r9 == 0) goto L_0x006a
            java.lang.String r8 = ""
            goto L_0x0072
        L_0x006a:
            java.lang.String r9 = "\\.config\\."
            java.lang.String[] r8 = r7.split(r9, r8)     // Catch:{ all -> 0x0294 }
            r8 = r8[r2]     // Catch:{ all -> 0x0294 }
        L_0x0072:
            boolean r8 = r4.contains(r8)     // Catch:{ all -> 0x0294 }
            if (r8 == 0) goto L_0x0046
        L_0x0078:
            r5.add(r7)     // Catch:{ all -> 0x0294 }
            r6.remove()     // Catch:{ all -> 0x0294 }
            goto L_0x0046
        L_0x007f:
            if (r13 == 0) goto L_0x0085
            r11.mo49753a(r5)     // Catch:{ all -> 0x0294 }
            goto L_0x0097
        L_0x0085:
            boolean r4 = r5.isEmpty()     // Catch:{ all -> 0x0294 }
            if (r4 != 0) goto L_0x0097
            java.util.concurrent.ThreadPoolExecutor r4 = p583jk.C17884p.m44365e0()     // Catch:{ all -> 0x0294 }
            com.android.billingclient.api.z r6 = new com.android.billingclient.api.z     // Catch:{ all -> 0x0294 }
            r6.<init>((p506gd.C17170a) r11, (java.util.HashSet) r5)     // Catch:{ all -> 0x0294 }
            r4.execute(r6)     // Catch:{ all -> 0x0294 }
        L_0x0097:
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0294 }
            r4.<init>()     // Catch:{ all -> 0x0294 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0294 }
        L_0x00a0:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0294 }
            if (r6 == 0) goto L_0x00cc
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0294 }
            gd.o r6 = (p506gd.C17184o) r6     // Catch:{ all -> 0x0294 }
            java.lang.String r6 = r6.mo49756b()     // Catch:{ all -> 0x0294 }
            int r7 = p530hd.C17384i.f44775a     // Catch:{ all -> 0x0294 }
            java.lang.String r7 = "config."
            boolean r7 = r6.startsWith(r7)     // Catch:{ all -> 0x0294 }
            if (r7 != 0) goto L_0x00c5
            java.lang.String r7 = ".config."
            boolean r7 = r6.contains(r7)     // Catch:{ all -> 0x0294 }
            if (r7 == 0) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r7 = 0
            goto L_0x00c6
        L_0x00c5:
            r7 = 1
        L_0x00c6:
            if (r7 != 0) goto L_0x00a0
            r4.add(r6)     // Catch:{ all -> 0x0294 }
            goto L_0x00a0
        L_0x00cc:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0294 }
        L_0x00d0:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0294 }
            if (r5 == 0) goto L_0x00f8
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0294 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0294 }
            int r6 = p530hd.C17384i.f44775a     // Catch:{ all -> 0x0294 }
            java.lang.String r6 = "config."
            boolean r6 = r5.startsWith(r6)     // Catch:{ all -> 0x0294 }
            if (r6 != 0) goto L_0x00f1
            java.lang.String r6 = ".config."
            boolean r6 = r5.contains(r6)     // Catch:{ all -> 0x0294 }
            if (r6 == 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r6 = 0
            goto L_0x00f2
        L_0x00f1:
            r6 = 1
        L_0x00f2:
            if (r6 != 0) goto L_0x00d0
            r4.add(r5)     // Catch:{ all -> 0x0294 }
            goto L_0x00d0
        L_0x00f8:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0294 }
            int r5 = r0.size()     // Catch:{ all -> 0x0294 }
            r3.<init>(r5)     // Catch:{ all -> 0x0294 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0294 }
        L_0x0105:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0294 }
            if (r5 == 0) goto L_0x0140
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0294 }
            gd.o r5 = (p506gd.C17184o) r5     // Catch:{ all -> 0x0294 }
            java.lang.String r6 = r5.mo49756b()     // Catch:{ all -> 0x0294 }
            int r7 = p530hd.C17384i.f44775a     // Catch:{ all -> 0x0294 }
            java.lang.String r7 = "config."
            boolean r6 = r6.startsWith(r7)     // Catch:{ all -> 0x0294 }
            if (r6 != 0) goto L_0x013c
            java.lang.String r6 = r5.mo49756b()     // Catch:{ all -> 0x0294 }
            java.lang.String r7 = "config."
            boolean r7 = r6.startsWith(r7)     // Catch:{ all -> 0x0294 }
            if (r7 == 0) goto L_0x012e
            java.lang.String r6 = ""
            goto L_0x0136
        L_0x012e:
            java.lang.String r7 = "\\.config\\."
            java.lang.String[] r6 = r6.split(r7, r8)     // Catch:{ all -> 0x0294 }
            r6 = r6[r2]     // Catch:{ all -> 0x0294 }
        L_0x0136:
            boolean r6 = r4.contains(r6)     // Catch:{ all -> 0x0294 }
            if (r6 == 0) goto L_0x0105
        L_0x013c:
            r3.add(r5)     // Catch:{ all -> 0x0294 }
            goto L_0x0105
        L_0x0140:
            gd.m r0 = new gd.m     // Catch:{ all -> 0x0294 }
            gd.e r2 = r11.f44405a     // Catch:{ all -> 0x0294 }
            r0.<init>(r2)     // Catch:{ all -> 0x0294 }
            dd.p r2 = p434dd.C16575r.m42079a()     // Catch:{ all -> 0x0294 }
            java.lang.ClassLoader r4 = r12.getClassLoader()     // Catch:{ all -> 0x0294 }
            r5 = 0
            if (r13 == 0) goto L_0x015a
            java.util.HashSet r0 = r0.mo49767a()     // Catch:{ all -> 0x0294 }
            r2.mo22171f(r4, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x018e
        L_0x015a:
            java.util.Iterator r6 = r3.iterator()     // Catch:{ all -> 0x0294 }
        L_0x015e:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0294 }
            if (r7 == 0) goto L_0x018e
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0294 }
            gd.o r7 = (p506gd.C17184o) r7     // Catch:{ all -> 0x0294 }
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0294 }
            r8.<init>(r1)     // Catch:{ all -> 0x0294 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0294 }
            r9.<init>()     // Catch:{ all -> 0x0294 }
            gd.g r10 = new gd.g     // Catch:{ all -> 0x0294 }
            r10.<init>(r0, r7, r9, r8)     // Catch:{ all -> 0x0294 }
            p506gd.C17182m.m43172b(r7, r10)     // Catch:{ all -> 0x0294 }
            boolean r7 = r8.get()     // Catch:{ all -> 0x0294 }
            if (r7 == 0) goto L_0x0183
            goto L_0x0184
        L_0x0183:
            r9 = r5
        L_0x0184:
            if (r9 != 0) goto L_0x018a
            r6.remove()     // Catch:{ all -> 0x0294 }
            goto L_0x015e
        L_0x018a:
            r2.mo22171f(r4, r9)     // Catch:{ all -> 0x0294 }
            goto L_0x015e
        L_0x018e:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0294 }
            r0.<init>()     // Catch:{ all -> 0x0294 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0294 }
        L_0x0197:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x0294 }
            if (r6 == 0) goto L_0x0200
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0294 }
            gd.o r6 = (p506gd.C17184o) r6     // Catch:{ all -> 0x0294 }
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x01f9 }
            java.io.File r8 = r6.mo49755a()     // Catch:{ IOException -> 0x01f9 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x01f9 }
            java.lang.String r8 = "classes.dex"
            java.util.zip.ZipEntry r8 = r7.getEntry(r8)     // Catch:{ IOException -> 0x01f6 }
            r7.close()     // Catch:{ IOException -> 0x01f6 }
            if (r8 == 0) goto L_0x01ee
            gd.e r7 = r11.f44405a     // Catch:{ all -> 0x0294 }
            java.lang.String r8 = r6.mo49756b()     // Catch:{ all -> 0x0294 }
            r7.getClass()     // Catch:{ all -> 0x0294 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0294 }
            java.io.File r7 = r7.mo49764g()     // Catch:{ all -> 0x0294 }
            java.lang.String r10 = "dex"
            r9.<init>(r7, r10)     // Catch:{ all -> 0x0294 }
            p506gd.C17174e.m43161e(r9)     // Catch:{ all -> 0x0294 }
            java.io.File r7 = p506gd.C17174e.m43160d(r9, r8)     // Catch:{ all -> 0x0294 }
            p506gd.C17174e.m43161e(r7)     // Catch:{ all -> 0x0294 }
            java.io.File r8 = r6.mo49755a()     // Catch:{ all -> 0x0294 }
            boolean r7 = r2.mo22170e(r4, r7, r8, r13)     // Catch:{ all -> 0x0294 }
            if (r7 == 0) goto L_0x01e0
            goto L_0x01ee
        L_0x01e0:
            java.lang.String r7 = "split was not installed "
            java.io.File r6 = r6.mo49755a()     // Catch:{ all -> 0x0294 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0294 }
            r7.concat(r6)     // Catch:{ all -> 0x0294 }
            goto L_0x0197
        L_0x01ee:
            java.io.File r6 = r6.mo49755a()     // Catch:{ all -> 0x0294 }
            r0.add(r6)     // Catch:{ all -> 0x0294 }
            goto L_0x0197
        L_0x01f6:
            r12 = move-exception
            r5 = r7
            goto L_0x01fa
        L_0x01f9:
            r12 = move-exception
        L_0x01fa:
            if (r5 == 0) goto L_0x01ff
            r5.close()     // Catch:{ IOException -> 0x01ff }
        L_0x01ff:
            throw r12     // Catch:{ all -> 0x0294 }
        L_0x0200:
            gd.b r13 = r11.f44408d     // Catch:{ all -> 0x0294 }
            monitor-enter(r13)     // Catch:{ all -> 0x0294 }
            android.content.res.AssetManager r12 = r12.getAssets()     // Catch:{ all -> 0x0280 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0280 }
        L_0x020b:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0280 }
            if (r2 == 0) goto L_0x022b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0280 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0280 }
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.String r2 = r2.getPath()     // Catch:{ all -> 0x0280 }
            java.lang.String r6 = "addAssetPath"
            java.lang.Object r2 = p172m9.C5720b.m14045M(r12, r6, r4, r5, r2)     // Catch:{ all -> 0x0280 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0280 }
            r2.intValue()     // Catch:{ all -> 0x0280 }
            goto L_0x020b
        L_0x022b:
            monitor-exit(r13)     // Catch:{ all -> 0x0294 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x0294 }
            r12.<init>()     // Catch:{ all -> 0x0294 }
            java.util.Iterator r13 = r3.iterator()     // Catch:{ all -> 0x0294 }
        L_0x0235:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x0294 }
            if (r1 == 0) goto L_0x0272
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0294 }
            gd.o r1 = (p506gd.C17184o) r1     // Catch:{ all -> 0x0294 }
            java.io.File r2 = r1.mo49755a()     // Catch:{ all -> 0x0294 }
            boolean r2 = r0.contains(r2)     // Catch:{ all -> 0x0294 }
            if (r2 == 0) goto L_0x0262
            java.lang.String r2 = r1.mo49756b()     // Catch:{ all -> 0x0294 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0294 }
            int r2 = r2.length()     // Catch:{ all -> 0x0294 }
            int r2 = r2 + 30
            r3.<init>(r2)     // Catch:{ all -> 0x0294 }
            java.lang.String r1 = r1.mo49756b()     // Catch:{ all -> 0x0294 }
            r12.add(r1)     // Catch:{ all -> 0x0294 }
            goto L_0x0235
        L_0x0262:
            java.lang.String r1 = r1.mo49756b()     // Catch:{ all -> 0x0294 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0294 }
            int r1 = r1.length()     // Catch:{ all -> 0x0294 }
            int r1 = r1 + 35
            r2.<init>(r1)     // Catch:{ all -> 0x0294 }
            goto L_0x0235
        L_0x0272:
            java.util.HashSet r13 = r11.f44407c     // Catch:{ all -> 0x0294 }
            monitor-enter(r13)     // Catch:{ all -> 0x0294 }
            java.util.HashSet r0 = r11.f44407c     // Catch:{ all -> 0x027d }
            r0.addAll(r12)     // Catch:{ all -> 0x027d }
            monitor-exit(r13)     // Catch:{ all -> 0x027d }
            monitor-exit(r11)
            return
        L_0x027d:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x027d }
            throw r12     // Catch:{ all -> 0x0294 }
        L_0x0280:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0294 }
            throw r12     // Catch:{ all -> 0x0294 }
        L_0x0283:
            r12 = move-exception
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x0294 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0294 }
            r1[r2] = r0     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = "Cannot load data for application '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0294 }
            r13.<init>(r0, r12)     // Catch:{ all -> 0x0294 }
            throw r13     // Catch:{ all -> 0x0294 }
        L_0x0294:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p506gd.C17170a.mo49754b(android.content.Context, boolean):void");
    }
}
