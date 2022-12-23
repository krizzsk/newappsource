package com.vungle.warren;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.URLUtil;
import ce0.C21103h;
import ce0.C21105j;
import com.appboy.models.outgoing.AttributionData;
import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.braze.support.WebContentUtils;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23130e0;
import com.vungle.warren.downloader.C23112a;
import com.vungle.warren.downloader.C23125f;
import com.vungle.warren.downloader.C23127h;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.admarkup.AdMarkupV2;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.C23211d;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.utility.UnzipUtility;
import ee0.C23285a;
import ee0.C23286b;
import ee0.C23287c;
import hi0.C23558r;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import od0.C24543a;
import od0.C24545c;
import od0.C24559j;
import od0.C24566m;
import od0.C24573q;
import p001a0.C0016g;
import p359ag.C13447d;
import p359ag.C13452i;
import p389bl.C13641g;
import p988j$.util.concurrent.ConcurrentHashMap;
import qd0.C24726b;
import qd0.C24727c;
import qd0.C24728d;
import qd0.C24732e;
import sd0.C24849b;
import td0.C24927a;
import td0.C24935e;
import td0.C24944n;
import td0.C24945o;
import ud0.C25017a;
import ud0.C25020d;
import ud0.C25023g;
import ud0.C25024h;

/* renamed from: com.vungle.warren.c */
public final class C23097c {

    /* renamed from: q */
    public static final /* synthetic */ int f58614q = 0;

    /* renamed from: a */
    public final ConcurrentHashMap f58615a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ConcurrentHashMap f58616b = new ConcurrentHashMap();

    /* renamed from: c */
    public final CopyOnWriteArrayList f58617c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final C23130e0 f58618d;

    /* renamed from: e */
    public AdRequest f58619e = null;

    /* renamed from: f */
    public final C23192a f58620f;

    /* renamed from: g */
    public final C21103h f58621g;

    /* renamed from: h */
    public final VungleApiClient f58622h;

    /* renamed from: i */
    public final C24927a f58623i;

    /* renamed from: j */
    public final Downloader f58624j;

    /* renamed from: k */
    public final C23171k0 f58625k;

    /* renamed from: l */
    public final AtomicReference<C25024h> f58626l = new AtomicReference<>();

    /* renamed from: m */
    public final C23252x1 f58627m;

    /* renamed from: n */
    public final C23186o1 f58628n;

    /* renamed from: o */
    public final C24849b f58629o;

    /* renamed from: p */
    public boolean f58630p = false;

    /* renamed from: com.vungle.warren.c$a */
    public class C23098a implements Runnable {
        public C23098a() {
        }

        public final void run() {
            C23097c cVar = C23097c.this;
            cVar.f58619e = null;
            C23130e0 e0Var = cVar.f58618d;
            e0Var.getClass();
            ArrayList arrayList = new ArrayList();
            while (!e0Var.f58723a.isEmpty()) {
                C23130e0.C23132b poll = e0Var.f58723a.poll();
                if (poll != null) {
                    arrayList.add(poll);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C23097c cVar2 = C23097c.this;
                C23105g gVar = ((C23130e0.C23132b) it.next()).f58726b;
                cVar2.getClass();
                C23097c.m57043r(gVar, 25);
            }
        }
    }

    /* renamed from: com.vungle.warren.c$b */
    public class C23099b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23105g f58632b;

        public C23099b(C23105g gVar) {
            this.f58632b = gVar;
        }

        public final void run() {
            C23130e0.C23132b bVar;
            boolean z;
            if (C23097c.this.f58617c.contains(this.f58632b)) {
                C23105g gVar = this.f58632b;
                C23105g gVar2 = (C23105g) C23097c.this.f58615a.get(gVar.f58643a);
                if (gVar2 != null) {
                    int i = gVar2.f58653k;
                    gVar2.mo58125b(gVar);
                    if (gVar2.f58653k < i) {
                        C23097c cVar = C23097c.this;
                        cVar.getClass();
                        Iterator it = gVar2.f58654l.iterator();
                        while (it.hasNext()) {
                            C23127h hVar = (C23127h) it.next();
                            int i2 = gVar2.f58653k;
                            String str = hVar.f58715c;
                            int max = Math.max(-2147483646, i2);
                            if (!cVar.f58630p) {
                                z = false;
                            } else {
                                z = !str.endsWith("template");
                            }
                            hVar.f58717e.set(new C23125f(max, z ? 1 : 0));
                            cVar.f58624j.mo58155j(hVar);
                        }
                    }
                } else {
                    C23130e0 e0Var = C23097c.this.f58618d;
                    AdRequest adRequest = gVar.f58643a;
                    Iterator<C23130e0.C23132b> it2 = e0Var.f58723a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            bVar = null;
                            break;
                        }
                        bVar = it2.next();
                        if (bVar.f58726b.f58643a.equals(adRequest)) {
                            break;
                        }
                    }
                    e0Var.f58723a.remove(bVar);
                    if (bVar != null) {
                        bVar.f58726b.mo58125b(gVar);
                        gVar = bVar.f58726b;
                    }
                    if (gVar.f58653k <= 0) {
                        C23097c.this.mo58114v(gVar);
                    } else {
                        C23130e0 e0Var2 = C23097c.this.f58618d;
                        if (bVar == null) {
                            bVar = new C23130e0.C23132b(gVar);
                        }
                        e0Var2.f58723a.offer(bVar);
                        C23097c.this.mo58115w((AdRequest) null);
                    }
                }
                C23097c.this.f58617c.remove(gVar);
            }
        }
    }

    /* renamed from: com.vungle.warren.c$c */
    public class C23100c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23105g f58634b;

        public C23100c(C23105g gVar) {
            this.f58634b = gVar;
        }

        public final void run() {
            C23097c cVar = C23097c.this;
            C23105g gVar = this.f58634b;
            cVar.getClass();
            C23097c.m57043r(gVar, 39);
        }
    }

    /* renamed from: com.vungle.warren.c$d */
    public class C23101d implements C24726b<C13452i> {

        /* renamed from: a */
        public final /* synthetic */ C23105g f58636a;

        /* renamed from: b */
        public final /* synthetic */ long f58637b;

        public C23101d(C23105g gVar, long j) {
            this.f58636a = gVar;
            this.f58637b = j;
        }

        /* renamed from: a */
        public final void mo58057a(C24732e eVar) {
            int i = C23097c.f58614q;
            VungleLogger.m57031d("ttDownloadContext", String.format("Request ad got response, request = %1$s, elapsed time = %2$dms", new Object[]{this.f58636a.f58643a, Long.valueOf(System.currentTimeMillis() - this.f58637b)}));
            C23097c.this.f58621g.mo53305j().mo53324a(new C23137g(this, eVar), new C23149h(this));
        }

        public final void onFailure(Throwable th) {
            int i = C23097c.f58614q;
            VungleLogger.m57031d("ttDownloadContext", String.format("Request ad failed, request = %1$s, elapsed time = %2$dms", new Object[]{this.f58636a.f58643a, Long.valueOf(System.currentTimeMillis() - this.f58637b)}));
            VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", String.format("failed to request ad, request = %1$s, throwable = %2$s", new Object[]{this.f58636a.f58643a, th}));
            C23097c.this.f58621g.mo53305j().mo53324a(new C23129e(this, th), new C23134f(this));
        }
    }

    /* renamed from: com.vungle.warren.c$e */
    public class C23102e {

        /* renamed from: a */
        public final /* synthetic */ List f58639a;

        public C23102e(ArrayList arrayList) {
            this.f58639a = arrayList;
        }

        /* renamed from: a */
        public final boolean mo58120a(String str) {
            File file = new File(str);
            for (String file2 : this.f58639a) {
                File file3 = new File(file2);
                if (file3.equals(file)) {
                    return false;
                }
                String path = file.getPath();
                if (path.startsWith(file3.getPath() + File.separator)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.vungle.warren.c$f */
    public class C23103f implements C23192a.C23207n {

        /* renamed from: a */
        public final /* synthetic */ File f58640a;

        /* renamed from: com.vungle.warren.c$f$a */
        public class C23104a implements Runnable {
            public C23104a() {
            }

            public final void run() {
                try {
                    C21105j.m49397b(C23103f.this.f58640a);
                } catch (IOException unused) {
                    int i = C23097c.f58614q;
                }
            }
        }

        public C23103f(File file) {
            this.f58640a = file;
        }

        /* renamed from: a */
        public final void mo58121a() {
            C23097c.this.f58621g.mo53305j().execute(new C23104a());
        }

        public final void onError() {
        }
    }

    /* renamed from: com.vungle.warren.c$g */
    public static class C23105g {

        /* renamed from: a */
        public final AdRequest f58643a;

        /* renamed from: b */
        public final AdConfig.AdSize f58644b;

        /* renamed from: c */
        public long f58645c;

        /* renamed from: d */
        public long f58646d;

        /* renamed from: e */
        public int f58647e;

        /* renamed from: f */
        public int f58648f;

        /* renamed from: g */
        public int f58649g;

        /* renamed from: h */
        public final CopyOnWriteArraySet f58650h;

        /* renamed from: i */
        public final AtomicBoolean f58651i;

        /* renamed from: j */
        public boolean f58652j;

        /* renamed from: k */
        public int f58653k;

        /* renamed from: l */
        public CopyOnWriteArrayList f58654l = new CopyOnWriteArrayList();

        public C23105g(AdRequest adRequest, AdConfig.AdSize adSize, long j, long j2, int i, int i2, int i3, boolean z, int i4, C23258z... zVarArr) {
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f58650h = copyOnWriteArraySet;
            this.f58643a = adRequest;
            this.f58645c = j;
            this.f58646d = j2;
            this.f58648f = i;
            this.f58649g = i2;
            this.f58647e = i3;
            this.f58651i = new AtomicBoolean();
            this.f58644b = adSize;
            this.f58652j = z;
            this.f58653k = i4;
            if (zVarArr != null) {
                copyOnWriteArraySet.addAll(Arrays.asList(zVarArr));
            }
        }

        /* renamed from: a */
        public final C23105g mo58124a(long j) {
            return new C23105g(this.f58643a, this.f58644b, j, this.f58646d, this.f58648f, this.f58649g, this.f58647e, this.f58652j, this.f58653k, (C23258z[]) this.f58650h.toArray(new C23258z[0]));
        }

        /* renamed from: b */
        public final void mo58125b(C23105g gVar) {
            this.f58645c = Math.min(this.f58645c, gVar.f58645c);
            this.f58646d = Math.min(this.f58646d, gVar.f58646d);
            this.f58648f = Math.min(this.f58648f, gVar.f58648f);
            int i = gVar.f58649g;
            if (i != 0) {
                i = this.f58649g;
            }
            this.f58649g = i;
            this.f58647e = Math.min(this.f58647e, gVar.f58647e);
            this.f58652j |= gVar.f58652j;
            this.f58653k = Math.min(this.f58653k, gVar.f58653k);
            this.f58650h.addAll(gVar.f58650h);
        }

        /* renamed from: c */
        public final C23105g mo58126c(int i) {
            return new C23105g(this.f58643a, this.f58644b, this.f58645c, this.f58646d, this.f58648f, this.f58649g, i, this.f58652j, this.f58653k, (C23258z[]) this.f58650h.toArray(new C23258z[0]));
        }

        /* renamed from: d */
        public final C23105g mo58127d(long j) {
            return new C23105g(this.f58643a, this.f58644b, this.f58645c, j, this.f58648f, this.f58649g, this.f58647e, this.f58652j, this.f58653k, (C23258z[]) this.f58650h.toArray(new C23258z[0]));
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("request=");
            k.append(this.f58643a.toString());
            k.append(" size=");
            k.append(this.f58644b.toString());
            k.append(" priority=");
            k.append(this.f58653k);
            k.append(" policy=");
            k.append(this.f58649g);
            k.append(" retry=");
            k.append(this.f58647e);
            k.append("/");
            k.append(this.f58648f);
            k.append(" delay=");
            k.append(this.f58645c);
            k.append("->");
            k.append(this.f58646d);
            k.append(" log=");
            k.append(this.f58652j);
            return k.toString();
        }
    }

    public C23097c(C21103h hVar, C23192a aVar, VungleApiClient vungleApiClient, C24927a aVar2, Downloader downloader, C23171k0 k0Var, C23252x1 x1Var, C23186o1 o1Var, C23130e0 e0Var, C24849b bVar) {
        this.f58621g = hVar;
        this.f58620f = aVar;
        this.f58622h = vungleApiClient;
        this.f58623i = aVar2;
        this.f58624j = downloader;
        this.f58625k = k0Var;
        this.f58627m = x1Var;
        this.f58628n = o1Var;
        this.f58618d = e0Var;
        this.f58629o = bVar;
    }

    /* renamed from: a */
    public static boolean m57040a(C23097c cVar, File file) {
        cVar.getClass();
        if (file.getName().equals("postroll") || file.getName().equals("template")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m57041f(File file, C24543a aVar) {
        return file.exists() && file.length() == aVar.f62174h;
    }

    /* renamed from: k */
    public static boolean m57042k(C23105g gVar, C23192a aVar) {
        List list = aVar.mo58278m(gVar.f58643a.mo58041f(), (String) null).get();
        if (list == null || ((long) list.size()) < gVar.f58643a.mo58035a()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static void m57043r(C23105g gVar, int i) {
        Object obj;
        Object[] objArr = new Object[2];
        objArr[0] = new VungleException(i);
        if (gVar != null) {
            obj = gVar;
        } else {
            obj = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        objArr[1] = obj;
        VungleLogger.m57029b("AdLoader#onError; loadAd sequence", String.format("Error %1$s occured; operation is %2$s", objArr));
        if (gVar != null) {
            Iterator it = gVar.f58650h.iterator();
            while (it.hasNext()) {
                ((C23258z) it.next()).onError(gVar.f58643a.mo58041f(), new VungleException(i));
            }
        }
    }

    /* renamed from: b */
    public final void mo58097b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f58615a.keySet());
        hashSet.addAll(this.f58616b.keySet());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AdRequest adRequest = (AdRequest) it.next();
            C23105g gVar = (C23105g) this.f58615a.remove(adRequest);
            this.f58617c.remove(gVar);
            m57043r(gVar, 25);
            m57043r((C23105g) this.f58616b.remove(adRequest), 25);
        }
        Iterator it2 = this.f58617c.iterator();
        while (it2.hasNext()) {
            C23105g gVar2 = (C23105g) it2.next();
            this.f58617c.remove(gVar2);
            m57043r(gVar2, 25);
        }
        this.f58621g.mo53305j().execute(new C23098a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x006b A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58098c(com.vungle.warren.C23097c.C23105g r17, od0.C24545c r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f58654l
            r0.clear()
            java.util.HashMap r0 = r18.mo60810h()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r4 = r0.hasNext()
            r5 = 0
            java.lang.String r6 = "AdLoader#downloadAdAssets; loadAd sequence"
            r7 = 1
            r8 = 2
            r9 = 0
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r10 = r4.getKey()
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x004d
            java.lang.Object r10 = r4.getValue()
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x004d
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = android.webkit.URLUtil.isValidUrl(r4)
            if (r4 != 0) goto L_0x0017
        L_0x004d:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.vungle.warren.AdRequest r4 = r2.f58643a
            r0[r9] = r4
            r0[r7] = r3
            java.lang.String r3 = "One or more ad asset URLs is empty or not valid;request = %1$s; advertisement = %2$s"
            java.lang.String r0 = java.lang.String.format(r3, r0)
            com.vungle.warren.VungleLogger.m57029b(r6, r0)
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException
            r3 = 11
            r0.<init>((int) r3)
            com.vungle.warren.AdRequest r2 = r2.f58643a
            r1.mo58110q(r0, r2, r5)
            return
        L_0x006b:
            r4 = 26
            com.vungle.warren.persistence.a r0 = r1.f58620f     // Catch:{ DBException -> 0x02ae }
            r0.mo58288w(r3)     // Catch:{ DBException -> 0x02ae }
            com.vungle.warren.persistence.a r0 = r1.f58620f
            java.lang.String r5 = r18.getId()
            td0.e r0 = r0.mo58284s(r5)
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x00a4
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.vungle.warren.AdRequest r5 = r2.f58643a
            r0[r9] = r5
            r0[r7] = r3
            java.lang.String r5 = "Cannot load all ad assets; op.request = %1$s; advertisement = %2$s"
            java.lang.String r0 = java.lang.String.format(r5, r0)
            com.vungle.warren.VungleLogger.m57029b(r6, r0)
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException
            r0.<init>((int) r4)
            com.vungle.warren.AdRequest r2 = r2.f58643a
            java.lang.String r3 = r18.getId()
            r1.mo58110q(r0, r2, r3)
            return
        L_0x00a4:
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x00a9:
            boolean r10 = r0.hasNext()
            java.lang.String r11 = "event"
            if (r10 == 0) goto L_0x022b
            java.lang.Object r10 = r0.next()
            od0.a r10 = (od0.C24543a) r10
            int r12 = r10.f62172f
            r13 = 3
            r14 = 24
            java.lang.String r15 = ".mp4"
            if (r12 != r13) goto L_0x0128
            java.io.File r12 = new java.io.File
            java.lang.String r13 = r10.f62171e
            r12.<init>(r13)
            boolean r12 = m57041f(r12, r10)
            if (r12 == 0) goto L_0x0104
            java.lang.String r10 = r10.f62170d
            java.util.List<java.lang.Class<?>> r12 = ce0.C21105j.f52950a
            if (r10 == 0) goto L_0x00d8
            boolean r10 = r10.endsWith(r15)
            goto L_0x00d9
        L_0x00d8:
            r10 = 0
        L_0x00d9:
            if (r10 == 0) goto L_0x00a9
            com.vungle.warren.n1 r5 = com.vungle.warren.C23181n1.m57208b()
            ag.i r10 = new ag.i
            r10.<init>()
            com.vungle.warren.session.SessionEvent r12 = com.vungle.warren.session.SessionEvent.ADS_CACHED
            java.lang.String r13 = r12.toString()
            r10.mo40349F(r11, r13)
            com.vungle.warren.session.SessionAttribute r11 = com.vungle.warren.session.SessionAttribute.EVENT_ID
            java.lang.String r13 = r18.getId()
            java.lang.String r11 = r11.toString()
            r10.mo40349F(r11, r13)
            od0.q r11 = new od0.q
            r11.<init>((com.vungle.warren.session.SessionEvent) r12, (p359ag.C13452i) r10)
            r5.mo58250d(r11)
            r5 = 1
            goto L_0x00a9
        L_0x0104:
            int r12 = r10.f62173g
            if (r12 != r7) goto L_0x0128
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.vungle.warren.AdRequest r4 = r2.f58643a
            r0[r9] = r4
            r0[r7] = r3
            java.lang.String r4 = "Cannot download ad assets - asset filetype is zip_asset;request = %1$s; advertisement = %2$s"
            java.lang.String r0 = java.lang.String.format(r4, r0)
            com.vungle.warren.VungleLogger.m57029b(r6, r0)
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException
            r0.<init>((int) r14)
            com.vungle.warren.AdRequest r2 = r2.f58643a
            java.lang.String r3 = r18.getId()
            r1.mo58110q(r0, r2, r3)
            return
        L_0x0128:
            int r12 = r10.f62172f
            r13 = 4
            if (r12 != r13) goto L_0x0133
            int r12 = r10.f62173g
            if (r12 != 0) goto L_0x0133
            goto L_0x00a9
        L_0x0133:
            java.lang.String r12 = r10.f62170d
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x015b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.vungle.warren.AdRequest r4 = r2.f58643a
            r0[r9] = r4
            r0[r7] = r3
            java.lang.String r4 = "Cannot download ad assets - empty ;request = %1$s; advertisement = %2$s"
            java.lang.String r0 = java.lang.String.format(r4, r0)
            com.vungle.warren.VungleLogger.m57029b(r6, r0)
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException
            r0.<init>((int) r14)
            com.vungle.warren.AdRequest r2 = r2.f58643a
            java.lang.String r3 = r18.getId()
            r1.mo58110q(r0, r2, r3)
            return
        L_0x015b:
            int r12 = r2.f58653k
            java.lang.String r13 = r10.f62171e
            r14 = -2147483646(0xffffffff80000002, float:-2.8E-45)
            int r12 = java.lang.Math.max(r14, r12)
            boolean r4 = r1.f58630p
            java.lang.String r9 = "template"
            if (r4 != 0) goto L_0x016e
            r4 = 0
            goto L_0x0173
        L_0x016e:
            boolean r4 = r13.endsWith(r9)
            r4 = r4 ^ r7
        L_0x0173:
            com.vungle.warren.downloader.f r13 = new com.vungle.warren.downloader.f
            r13.<init>(r12, r4)
            com.vungle.warren.downloader.h r4 = new com.vungle.warren.downloader.h
            java.lang.String r12 = r10.f62170d
            java.lang.String r8 = r10.f62171e
            java.lang.String r14 = r10.f62167a
            r4.<init>(r13, r12, r8, r14)
            int r8 = r10.f62172f
            if (r8 != r7) goto L_0x01b2
            com.vungle.warren.downloader.Downloader r8 = r1.f58624j
            r8.mo58152g(r4)
            int r4 = r2.f58653k
            java.lang.String r8 = r10.f62171e
            r12 = -2147483646(0xffffffff80000002, float:-2.8E-45)
            int r4 = java.lang.Math.max(r12, r4)
            boolean r12 = r1.f58630p
            if (r12 != 0) goto L_0x019d
            r8 = 0
            goto L_0x01a2
        L_0x019d:
            boolean r8 = r8.endsWith(r9)
            r8 = r8 ^ r7
        L_0x01a2:
            com.vungle.warren.downloader.f r9 = new com.vungle.warren.downloader.f
            r9.<init>(r4, r8)
            com.vungle.warren.downloader.h r4 = new com.vungle.warren.downloader.h
            java.lang.String r8 = r10.f62170d
            java.lang.String r12 = r10.f62171e
            java.lang.String r13 = r10.f62167a
            r4.<init>(r9, r8, r12, r13)
        L_0x01b2:
            r10.toString()
            r10.f62172f = r7
            com.vungle.warren.persistence.a r8 = r1.f58620f     // Catch:{ DBException -> 0x0208 }
            r8.mo58288w(r10)     // Catch:{ DBException -> 0x0208 }
            java.util.concurrent.CopyOnWriteArrayList r8 = r2.f58654l
            r8.add(r4)
            java.lang.String r4 = r10.f62170d
            java.util.List<java.lang.Class<?>> r8 = ce0.C21105j.f52950a
            if (r4 == 0) goto L_0x01cc
            boolean r4 = r4.endsWith(r15)
            goto L_0x01cd
        L_0x01cc:
            r4 = 0
        L_0x01cd:
            if (r4 == 0) goto L_0x0202
            com.vungle.warren.n1 r4 = com.vungle.warren.C23181n1.m57208b()
            ag.i r5 = new ag.i
            r5.<init>()
            com.vungle.warren.session.SessionEvent r8 = com.vungle.warren.session.SessionEvent.ADS_CACHED
            java.lang.String r9 = r8.toString()
            r5.mo40349F(r11, r9)
            com.vungle.warren.session.SessionAttribute r9 = com.vungle.warren.session.SessionAttribute.EVENT_ID
            java.lang.String r11 = r18.getId()
            java.lang.String r9 = r9.toString()
            r5.mo40349F(r9, r11)
            com.vungle.warren.session.SessionAttribute r9 = com.vungle.warren.session.SessionAttribute.URL
            java.lang.String r10 = r10.f62170d
            java.lang.String r9 = r9.toString()
            r5.mo40349F(r9, r10)
            od0.q r9 = new od0.q
            r9.<init>((com.vungle.warren.session.SessionEvent) r8, (p359ag.C13452i) r5)
            r4.mo58250d(r9)
            r5 = 1
        L_0x0202:
            r4 = 26
            r8 = 2
            r9 = 0
            goto L_0x00a9
        L_0x0208:
            r0 = move-exception
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r10
            r4[r7] = r0
            java.lang.String r0 = "Can't save asset %1$s; exception = %2$s"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            com.vungle.warren.VungleLogger.m57029b(r6, r0)
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException
            r4 = 26
            r0.<init>((int) r4)
            com.vungle.warren.AdRequest r2 = r2.f58643a
            java.lang.String r3 = r18.getId()
            r1.mo58110q(r0, r2, r3)
            return
        L_0x022b:
            if (r5 != 0) goto L_0x025f
            com.vungle.warren.n1 r0 = com.vungle.warren.C23181n1.m57208b()
            ag.i r4 = new ag.i
            r4.<init>()
            com.vungle.warren.session.SessionEvent r5 = com.vungle.warren.session.SessionEvent.ADS_CACHED
            java.lang.String r6 = r5.toString()
            r4.mo40349F(r11, r6)
            com.vungle.warren.session.SessionAttribute r6 = com.vungle.warren.session.SessionAttribute.EVENT_ID
            java.lang.String r8 = r18.getId()
            java.lang.String r6 = r6.toString()
            r4.mo40349F(r6, r8)
            com.vungle.warren.session.SessionAttribute r6 = com.vungle.warren.session.SessionAttribute.VIDEO_CACHED
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "none"
            r4.mo40349F(r6, r8)
            od0.q r6 = new od0.q
            r6.<init>((com.vungle.warren.session.SessionEvent) r5, (p359ag.C13452i) r4)
            r0.mo58250d(r6)
        L_0x025f:
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f58654l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0273
            java.lang.String r0 = r18.getId()
            java.util.List r3 = java.util.Collections.emptyList()
            r1.mo58107n(r2, r0, r3, r7)
            return
        L_0x0273:
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.vungle.warren.AdRequest r4 = r2.f58643a
            r5 = 0
            r0[r5] = r4
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0[r7] = r4
            java.lang.String r4 = "Start to download assets,  request = %1$s at: %2$d"
            java.lang.String r0 = java.lang.String.format(r4, r0)
            java.lang.String r4 = "ttDownloadContext"
            com.vungle.warren.VungleLogger.m57031d(r4, r0)
            com.vungle.warren.i r0 = new com.vungle.warren.i
            r0.<init>(r1, r2, r3)
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f58654l
            java.util.Iterator r2 = r2.iterator()
        L_0x029b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02ad
            java.lang.Object r3 = r2.next()
            com.vungle.warren.downloader.h r3 = (com.vungle.warren.downloader.C23127h) r3
            com.vungle.warren.downloader.Downloader r4 = r1.f58624j
            r4.mo58150e(r3, r0)
            goto L_0x029b
        L_0x02ad:
            return
        L_0x02ae:
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.vungle.warren.AdRequest r4 = r2.f58643a
            r5 = 0
            r0[r5] = r4
            r0[r7] = r3
            java.lang.String r4 = "Cannot save advertisement op.request = %1$s; advertisement = %2$s"
            java.lang.String r0 = java.lang.String.format(r4, r0)
            com.vungle.warren.VungleLogger.m57029b(r6, r0)
            com.vungle.warren.error.VungleException r0 = new com.vungle.warren.error.VungleException
            r4 = 26
            r0.<init>((int) r4)
            com.vungle.warren.AdRequest r2 = r2.f58643a
            java.lang.String r3 = r18.getId()
            r1.mo58110q(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.C23097c.mo58098c(com.vungle.warren.c$g, od0.c):void");
    }

    /* renamed from: d */
    public final void mo58099d(String str) {
        List<C24543a> list = this.f58620f.mo58284s(str).get();
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (C24543a aVar : list) {
                hashSet.add(aVar.f62170d);
            }
            C24545c cVar = (C24545c) this.f58620f.mo58281p(C24545c.class, str).get();
            if (cVar != null) {
                hashSet.addAll(cVar.mo60810h().values());
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f58624j.mo58149d((String) it.next());
            }
        }
    }

    /* renamed from: e */
    public final void mo58100e(C23105g gVar, C24566m mVar) {
        String str;
        long j;
        C13452i iVar;
        String str2;
        int i;
        String str3;
        int i2;
        long j2;
        String str4;
        int i3;
        C23105g gVar2 = gVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (gVar2.f58643a.mo58036b() instanceof AdMarkupV2) {
            mo58102h(gVar, currentTimeMillis, ((AdMarkupV2) gVar2.f58643a.mo58036b()).mo58248c(), mVar, new C13452i());
            return;
        }
        VungleLogger.m57031d("ttDownloadContext", String.format("Start to request ad, request = %1$s, at: %2$d", new Object[]{gVar2.f58643a, Long.valueOf(currentTimeMillis)}));
        VungleApiClient vungleApiClient = this.f58622h;
        String f = gVar2.f58643a.mo58041f();
        if (AdConfig.AdSize.isNonMrecBannerAdSize(gVar2.f58644b)) {
            str = gVar2.f58644b.getName();
        } else {
            str = "";
        }
        boolean z = mVar.f62263g;
        C23186o1 o1Var = this.f58628n;
        if (o1Var.f58863c.f59061a) {
            C13452i iVar2 = new C13452i();
            C24559j jVar = (C24559j) o1Var.f58861a.mo58281p(C24559j.class, "visionCookie").get();
            if (jVar == null) {
                str2 = null;
            } else {
                str2 = jVar.mo60826c("data_science_cache");
            }
            if (str2 != null) {
                iVar2.mo40349F("data_science_cache", str2);
            }
            if (o1Var.f58863c.f59064d != null) {
                int a = o1Var.f58862b.mo53310a();
                if (a != 0) {
                    if (a != 1) {
                        if (a != 4) {
                            if (a != 9) {
                                if (a != 17) {
                                    if (a != 6) {
                                        if (a != 7) {
                                            i = o1Var.f58863c.f59064d.f59065a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C23287c.C23288a aVar = o1Var.f58863c.f59064d;
                    i3 = aVar.f59066b;
                    if (i3 <= 0) {
                        i = aVar.f59065a;
                    }
                    i = i3;
                }
                C23287c.C23288a aVar2 = o1Var.f58863c.f59064d;
                i3 = aVar2.f59067c;
                if (i3 <= 0) {
                    i = aVar2.f59065a;
                }
                i = i3;
            } else {
                i = 0;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            C13447d dVar = new C13447d();
            iVar2.mo40346C(dVar, "aggregate");
            int[] iArr = o1Var.f58863c.f59063c;
            if (iArr != null) {
                int length = iArr.length;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = iArr[i4];
                    C13452i iVar3 = iVar2;
                    int i6 = i4;
                    int i7 = length;
                    long millis = currentTimeMillis2 - TimeUnit.DAYS.toMillis((long) i5);
                    C23192a aVar3 = o1Var.f58861a;
                    aVar3.getClass();
                    int[] iArr2 = iArr;
                    C13447d dVar2 = dVar;
                    C23286b bVar = (C23286b) new C24935e(aVar3.f58875b.submit(new C24944n(aVar3, millis))).get();
                    C13452i iVar4 = new C13452i();
                    iVar4.mo40348E("window", Integer.valueOf(i5));
                    if (bVar != null) {
                        str3 = bVar.f59060b;
                    } else {
                        str3 = null;
                    }
                    iVar4.mo40349F("last_viewed_creative_id", str3);
                    if (bVar != null) {
                        i2 = bVar.f59059a;
                    } else {
                        i2 = 0;
                    }
                    iVar4.mo40348E("total_view_count", Integer.valueOf(i2));
                    String[] strArr = o1Var.f58863c.f59062b;
                    if (strArr != null) {
                        int length2 = strArr.length;
                        int i8 = 0;
                        while (i8 < length2) {
                            String str5 = strArr[i8];
                            String[] strArr2 = strArr;
                            C13447d dVar3 = new C13447d();
                            iVar4.mo40346C(dVar3, str5);
                            str5.hashCode();
                            char c = 65535;
                            switch (str5.hashCode()) {
                                case -1329100269:
                                    j2 = millis;
                                    if (str5.equals("campaign_details")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 1272113586:
                                    j2 = millis;
                                    if (str5.equals("creative_details")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 1845893934:
                                    j2 = millis;
                                    if (str5.equals("advertiser_details")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                default:
                                    j2 = millis;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    str4 = AttributionData.CAMPAIGN_KEY;
                                    break;
                                case 1:
                                    str4 = "creative";
                                    break;
                                case 2:
                                    str4 = "advertiser";
                                    break;
                                default:
                                    str4 = null;
                                    break;
                            }
                            C23192a aVar4 = o1Var.f58861a;
                            aVar4.getClass();
                            C23186o1 o1Var2 = o1Var;
                            long j3 = currentTimeMillis;
                            String str6 = str4;
                            int i9 = i7;
                            int i11 = i8;
                            int i12 = i;
                            int i13 = i;
                            C13447d dVar4 = dVar2;
                            int i14 = length2;
                            List<C23285a> list = (List) new C24935e(aVar4.f58875b.submit(new C24945o(aVar4, str6, i12, j2))).get();
                            if (list != null) {
                                for (C23285a aVar5 : list) {
                                    C13452i iVar5 = new C13452i();
                                    iVar5.mo40349F(C25541a.m63881k(str6, "_id"), aVar5.f59056a);
                                    iVar5.mo40348E("view_count", Integer.valueOf(aVar5.f59057b));
                                    iVar5.mo40348E("last_time_viewed", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(aVar5.f59058c)));
                                    dVar3.mo40327C(iVar5);
                                }
                            }
                            i8 = i11 + 1;
                            length2 = i14;
                            strArr = strArr2;
                            o1Var = o1Var2;
                            millis = j2;
                            currentTimeMillis = j3;
                            i7 = i9;
                            dVar2 = dVar4;
                            i = i13;
                        }
                    }
                    int i15 = i;
                    C13447d dVar5 = dVar2;
                    dVar5.mo40327C(iVar4);
                    i4 = i6 + 1;
                    C23105g gVar3 = gVar;
                    iVar2 = iVar3;
                    dVar = dVar5;
                    iArr = iArr2;
                    o1Var = o1Var;
                    currentTimeMillis = currentTimeMillis;
                    length = i7;
                    i = i15;
                }
            }
            j = currentTimeMillis;
            iVar = iVar2;
        } else {
            j = currentTimeMillis;
            iVar = null;
        }
        if (vungleApiClient.f58568e != null) {
            C13452i iVar6 = new C13452i();
            iVar6.mo40346C(vungleApiClient.mo58076d(false), ServerParameters.DEVICE_KEY);
            iVar6.mo40346C(vungleApiClient.f58576m, "app");
            C13452i h = vungleApiClient.mo58079h();
            if (iVar != null) {
                h.mo40346C(iVar, "vision");
            }
            iVar6.mo40346C(h, "user");
            C13452i e = vungleApiClient.mo58077e();
            if (e != null) {
                iVar6.mo40346C(e, "ext");
            }
            C13452i iVar7 = new C13452i();
            C13447d dVar6 = new C13447d();
            dVar6.mo40328D(f);
            iVar7.mo40346C(dVar6, "placements");
            iVar7.mo40347D("header_bidding", Boolean.valueOf(z));
            if (!TextUtils.isEmpty(str)) {
                iVar7.mo40349F("ad_size", str);
            }
            iVar6.mo40346C(iVar7, "request");
            C24728d b = vungleApiClient.f58581r.mo61220b(VungleApiClient.f58560C, vungleApiClient.f58568e, iVar6);
            FirebasePerfOkHttpClient.enqueue(b.f62595b, new C24727c(b, new C23101d(gVar, j)));
            return;
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* renamed from: g */
    public final File mo58101g(C24545c cVar) {
        return this.f58620f.mo58279n(cVar.getId()).get();
    }

    /* renamed from: h */
    public final void mo58102h(C23105g gVar, long j, C24545c cVar, C24566m mVar, C13452i iVar) throws IllegalArgumentException {
        String str;
        String str2;
        boolean z;
        int i;
        C23105g gVar2 = gVar;
        C24545c cVar2 = cVar;
        C24566m mVar2 = mVar;
        C13452i iVar2 = iVar;
        C23235v vVar = this.f58625k.f58819a.get();
        try {
            if (this.f58628n.f58863c.f59061a) {
                if (C13641g.m34129r(iVar2, "data_science_cache")) {
                    C23186o1 o1Var = this.f58628n;
                    String B = iVar2.mo40351I("data_science_cache").mo40326B();
                    o1Var.getClass();
                    C24559j jVar = new C24559j("visionCookie");
                    if (B != null) {
                        jVar.mo60827d(B, "data_science_cache");
                    }
                    o1Var.f58861a.mo58288w(jVar);
                } else {
                    C23186o1 o1Var2 = this.f58628n;
                    o1Var2.getClass();
                    o1Var2.f58861a.mo58288w(new C24559j("visionCookie"));
                }
            }
            C24545c cVar3 = (C24545c) this.f58620f.mo58281p(C24545c.class, cVar.getId()).get();
            if (cVar3 == null || !((i = cVar3.f62192N) == 0 || i == 1 || i == 2)) {
                if (mVar2.f62263g && vVar != null) {
                    vVar.mo58347a(gVar2.f58643a.mo58041f(), cVar2.f62190L);
                }
                this.f58620f.mo58272g(cVar.getId());
                Set<Map.Entry> entrySet = cVar.mo60810h().entrySet();
                File g = mo58101g(cVar2);
                if (g != null) {
                    if (g.isDirectory()) {
                        for (Map.Entry entry : entrySet) {
                            String str3 = (String) entry.getValue();
                            if (TextUtils.isEmpty(str3) || (!URLUtil.isHttpsUrl(str3) && !URLUtil.isHttpUrl(str3))) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                mo58112t(cVar2, g, (String) entry.getKey(), (String) entry.getValue());
                            } else {
                                VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", String.format("Response was successful, but one of downloadable urls is neither http nor https : url = %1$s; op.request = %2$s, ad.getId() = %3$s", new Object[]{entry.getValue(), gVar2.f58643a, cVar.getId()}));
                                mo58110q(new VungleException(11), gVar2.f58643a, cVar.getId());
                                return;
                            }
                        }
                        if (mVar2.f62265i != 1 || (cVar2.f62204c == 1 && "banner".equals(cVar2.f62185G))) {
                            cVar2.f62224w.mo58262b(gVar2.f58644b);
                            cVar2.f62198T = j;
                            cVar2.f62196R = System.currentTimeMillis();
                            cVar2.f62191M = mVar2.f62263g;
                            this.f58620f.mo58290y(cVar2, gVar2.f58643a.mo58041f(), 0);
                            int g2 = gVar2.f58643a.mo58042g();
                            if (g2 != 0) {
                                if (g2 != 2) {
                                    if (gVar2.f58643a.mo58042g() != 1) {
                                        return;
                                    }
                                    if (m57042k(gVar2, this.f58620f)) {
                                        mo58115w(gVar2.f58643a);
                                        mo58111s(gVar2.f58643a, mVar2, (C24545c) null);
                                        return;
                                    }
                                    mo58100e(gVar2, mVar2);
                                    return;
                                }
                            }
                            mo58115w(gVar2.f58643a);
                            mo58098c(gVar2, cVar2);
                            return;
                        }
                        Object[] objArr = new Object[3];
                        if (cVar2.f62204c != 1) {
                            str2 = "ad type is not MRAID";
                        } else {
                            str2 = "advertisement template type is not banner";
                        }
                        objArr[0] = str2;
                        objArr[1] = gVar2.f58643a;
                        objArr[2] = cVar.getId();
                        VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", String.format("Response was successful, but placement is banner while %1$s; op.request = %2$s, ad.getId() = %3$s", objArr));
                        mo58110q(new VungleException(1), gVar2.f58643a, cVar.getId());
                        return;
                    }
                }
                Object[] objArr2 = new Object[3];
                if (g == null) {
                    str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
                } else {
                    str = "not a dir";
                }
                objArr2[0] = str;
                objArr2[1] = gVar2.f58643a;
                objArr2[2] = cVar.getId();
                VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", String.format("Response was successful, but adv directory is %1$s; op.request = %2$s, ad.getId() = %3$s", objArr2));
                mo58110q(new VungleException(26), gVar2.f58643a, cVar.getId());
                return;
            }
            mo58110q(new VungleException(25), gVar2.f58643a, (String) null);
        } catch (DatabaseHelper.DBException e) {
            VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", String.format("BadAd - DBException; can't proceed; placement = %1$s; op.request = %2$s; exception = %3$s", new Object[]{mVar2, gVar2.f58643a, e}));
            mo58110q(new VungleException(26), gVar2.f58643a, (String) null);
        }
    }

    /* renamed from: i */
    public final boolean mo58103i(C24545c cVar) throws IllegalStateException {
        List<C24543a> list;
        boolean z;
        if (cVar == null || (list = this.f58620f.mo58284s(cVar.getId()).get()) == null || list.size() == 0) {
            return false;
        }
        for (C24543a aVar : list) {
            if (aVar.f62173g != 0) {
                String str = aVar.f62170d;
                if (TextUtils.isEmpty(str) || (!URLUtil.isHttpsUrl(str) && !URLUtil.isHttpUrl(str))) {
                    z = false;
                } else {
                    z = true;
                }
                if ((!z || !mo58104j(cVar)) && (aVar.f62172f != 3 || !m57041f(new File(aVar.f62171e), aVar))) {
                    return false;
                }
            } else if (aVar.f62172f != 4) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo58104j(C24545c cVar) {
        if (!this.f58630p || cVar == null || cVar.f62204c != 1 || !cVar.f62191M) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void mo58105l(C23105g gVar) {
        C25024h hVar = this.f58626l.get();
        if (hVar == null) {
            VungleLogger.m57029b("AdLoader#load; loadAd sequence", String.format("Cannot load operation %s; job runner is null", new Object[]{gVar}));
            m57043r(gVar, 9);
            return;
        }
        if (gVar.f58643a.mo58039e()) {
            C23181n1 b = C23181n1.m57208b();
            C13452i iVar = new C13452i();
            SessionEvent sessionEvent = SessionEvent.LOAD_AD;
            iVar.mo40349F("event", sessionEvent.toString());
            SessionAttribute sessionAttribute = SessionAttribute.PLACEMENT_ID;
            iVar.mo40349F(sessionAttribute.toString(), gVar.f58643a.mo58041f());
            b.mo58250d(new C24573q(sessionEvent, iVar));
        }
        String f = gVar.f58643a.mo58041f();
        AdConfig.AdSize adSize = gVar.f58644b;
        C23192a aVar = this.f58620f;
        aVar.f58875b.execute(new C23211d(aVar, f, C24566m.class, new C23109d(this, adSize)));
        C23105g gVar2 = (C23105g) this.f58616b.remove(gVar.f58643a);
        if (gVar2 != null) {
            gVar.mo58125b(gVar2);
        }
        if (gVar.f58645c <= 0) {
            gVar.f58643a.timeStamp.set(System.currentTimeMillis());
            this.f58617c.add(gVar);
            this.f58621g.mo53305j().mo53324a(new C23099b(gVar), new C23100c(gVar));
            return;
        }
        this.f58616b.put(gVar.f58643a, gVar);
        AdRequest adRequest = gVar.f58643a;
        int i = C25020d.f63194c;
        Bundle bundle = new Bundle();
        bundle.putSerializable("request", adRequest);
        C25023g gVar3 = new C25023g("ud0.d" + " " + adRequest);
        gVar3.f63202g = bundle;
        gVar3.f63204i = 4;
        gVar3.f63199d = gVar.f58645c;
        gVar3.f63198c = true;
        hVar.mo58356b(gVar3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58106m(od0.C24566m r18, com.vungle.warren.AdConfig.AdSize r19, long r20, boolean r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r18.mo60833c()
            r3 = 1
            if (r2 == 0) goto L_0x0019
            int r2 = r1.f62265i
            if (r2 != r3) goto L_0x0019
            boolean r2 = com.vungle.warren.AdConfig.AdSize.isBannerAdSize(r19)
            if (r2 != 0) goto L_0x0019
            com.vungle.warren.AdConfig$AdSize r2 = r1.f62267k
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r19
        L_0x001b:
            int r2 = r1.f62265i
            r4 = 0
            if (r2 != r3) goto L_0x0026
            boolean r2 = com.vungle.warren.AdConfig.AdSize.isNonMrecBannerAdSize(r6)
            if (r2 == 0) goto L_0x0030
        L_0x0026:
            int r2 = r1.f62265i
            if (r2 != 0) goto L_0x0032
            boolean r2 = com.vungle.warren.AdConfig.AdSize.isDefaultAdSize(r6)
            if (r2 != 0) goto L_0x0032
        L_0x0030:
            r2 = 1
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r2 == 0) goto L_0x0036
            return
        L_0x0036:
            int r2 = r1.f62262f
            com.vungle.warren.k0 r5 = r0.f58625k
            java.util.concurrent.atomic.AtomicReference<com.vungle.warren.w1> r5 = r5.f58821c
            java.lang.Object r5 = r5.get()
            com.vungle.warren.w1 r5 = (com.vungle.warren.C23248w1) r5
            r7 = 0
            if (r5 == 0) goto L_0x004f
            java.lang.String r5 = r1.f62257a
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x004f
            r15 = 0
            goto L_0x0050
        L_0x004f:
            r15 = r2
        L_0x0050:
            boolean r2 = r18.mo60833c()
            if (r2 == 0) goto L_0x0072
            boolean r2 = r1.f62263g
            if (r2 == 0) goto L_0x0060
            int r2 = r1.f62268l
            if (r2 != r3) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r2 != 0) goto L_0x0072
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r9 = r1.f62257a
            r10 = 1
            int r1 = r1.f62268l
            long r11 = (long) r1
            r8 = r2
            r13 = r22
            r8.<init>(r9, r10, r11, r13)
            goto L_0x008b
        L_0x0072:
            boolean r2 = r1.f62263g
            if (r2 == 0) goto L_0x007b
            int r2 = r1.f62268l
            if (r2 != r3) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x008d
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r9 = r1.f62257a
            r10 = 2
            r11 = 1
            r8 = r2
            r13 = r22
            r8.<init>(r9, r10, r11, r13)
        L_0x008b:
            r5 = r2
            goto L_0x00a2
        L_0x008d:
            boolean r2 = r18.mo60832b()
            if (r2 == 0) goto L_0x00a1
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r9 = r1.f62257a
            r10 = 0
            r11 = 1
            r8 = r2
            r13 = r22
            r8.<init>(r9, r10, r11, r13)
            goto L_0x008b
        L_0x00a1:
            r5 = r7
        L_0x00a2:
            if (r5 == 0) goto L_0x00b9
            com.vungle.warren.c$g r1 = new com.vungle.warren.c$g
            r9 = 2000(0x7d0, double:9.88E-321)
            r11 = 5
            r12 = 1
            r13 = 0
            r14 = 0
            com.vungle.warren.z[] r2 = new com.vungle.warren.C23258z[r4]
            r4 = r1
            r7 = r20
            r16 = r2
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16)
            r0.mo58105l(r1)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.C23097c.mo58106m(od0.m, com.vungle.warren.AdConfig$AdSize, long, boolean):void");
    }

    /* renamed from: n */
    public final void mo58107n(C23105g gVar, String str, List<C23112a.C23113a> list, boolean z) {
        boolean z2;
        VungleException vungleException;
        boolean z3;
        C23105g gVar2 = gVar;
        String str2 = str;
        VungleLogger.m57031d("ttDownloadContext", String.format("Assets download completed, request  = %1$s, at: %2$d", new Object[]{gVar2.f58643a, Long.valueOf(System.currentTimeMillis())}));
        VungleException vungleException2 = null;
        if (list.isEmpty()) {
            C24545c cVar = (C24545c) this.f58620f.mo58281p(C24545c.class, str2).get();
            if (cVar == null) {
                VungleLogger.m57029b("AdLoader#DownloadAdCallback#onDownloadCompleted; loadAd sequence", String.format("advertisement is null: request = %1$s; advertisementId = %2$s", new Object[]{gVar2.f58643a, str2}));
                mo58110q(new VungleException(11), gVar2.f58643a, str2);
                return;
            }
            List<C24543a> list2 = this.f58620f.mo58284s(str2).get();
            String str3 = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            if (list2 == null || list2.size() == 0) {
                Object[] objArr = new Object[3];
                if (list2 != null) {
                    str3 = "empty";
                }
                objArr[0] = str3;
                objArr[1] = gVar2.f58643a;
                objArr[2] = str2;
                VungleLogger.m57029b("AdLoader#onAssetDownloadFinished; loadAd sequence", String.format("Assets are %1$s; request = %2$s; advertisement = %3$s", objArr));
                if (z) {
                    mo58110q(new VungleException(24), gVar2.f58643a, str2);
                    return;
                }
                return;
            }
            for (C24543a aVar : list2) {
                int i = aVar.f62172f;
                if (i == 3) {
                    File file = new File(aVar.f62171e);
                    if (!m57041f(file, aVar)) {
                        VungleLogger.m57029b("AdLoader#onAssetDownloadFinished; loadAd sequence", String.format("Assets file not valid %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", new Object[]{file.getPath(), aVar.toString(), gVar2.f58643a, cVar}));
                        if (z) {
                            mo58110q(new VungleException(24), gVar2.f58643a, cVar.getId());
                            return;
                        }
                        return;
                    }
                } else if (aVar.f62173g == 0 && i != 4) {
                    VungleLogger.m57029b("AdLoader#onAssetDownloadFinished; loadAd sequence", String.format("Zip asset left unprocessed asset = %1$s,request = %2$s; advertisement = %3$s", new Object[]{aVar.toString(), gVar2.f58643a, cVar}));
                    mo58110q(new VungleException(24), gVar2.f58643a, cVar.getId());
                    return;
                }
            }
            if (cVar.f62204c == 1) {
                File g = mo58101g(cVar);
                if (g == null || !g.isDirectory()) {
                    Object[] objArr2 = new Object[3];
                    if (g != null) {
                        str3 = "not a dir";
                    }
                    objArr2[0] = str3;
                    objArr2[1] = gVar2.f58643a;
                    objArr2[2] = cVar;
                    VungleLogger.m57029b("AdLoader#onAssetDownloadFinished; loadAd sequence", String.format("Mraid ad; bad destinationDir - %1$srequest = %2$s; advertisement = %3$s", objArr2));
                    if (z) {
                        mo58110q(new VungleException(26), gVar2.f58643a, cVar.getId());
                        return;
                    }
                    return;
                }
                for (Map.Entry next : cVar.f62182D.entrySet()) {
                    String str4 = (String) ((Pair) next.getValue()).first;
                    if (TextUtils.isEmpty(str4) || C23558r.m57727m(str4) == null) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        File file2 = new File(g, URLUtil.guessFileName(str4, (String) null, (String) null));
                        if (file2.exists()) {
                            Map<String, String> map = cVar.f62181C;
                            Object key = next.getKey();
                            StringBuilder k = C13555b.m33972k(WebContentUtils.FILE_URI_SCHEME_PREFIX);
                            k.append(file2.getPath());
                            map.put(key, k.toString());
                        }
                    }
                }
                cVar.f62201Y = true;
                try {
                    this.f58620f.mo58288w(cVar);
                } catch (DatabaseHelper.DBException e) {
                    VungleLogger.m57029b("AdLoader#onAssetDownloadFinished; loadAd sequence", String.format("Issue(s) with database: can't save advertisement;exception = %1$s; request = %2$s; advertisement = %3$s", new Object[]{e, gVar2.f58643a, cVar}));
                    if (z) {
                        mo58110q(new VungleException(26), gVar2.f58643a, cVar.getId());
                        return;
                    }
                    return;
                }
            }
            if (z) {
                mo58109p(gVar2.f58643a, cVar.getId());
                return;
            }
            return;
        }
        Iterator<C23112a.C23113a> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C23112a.C23113a next2 = it.next();
            if (VungleException.m57171b(next2.f58666c) != 26) {
                int i2 = next2.f58665b;
                if (i2 == 408 || (500 <= i2 && i2 < 600)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && next2.f58664a == 1) {
                    vungleException = new VungleException(23);
                } else if (next2.f58664a == 0) {
                    vungleException = new VungleException(23);
                } else {
                    vungleException = new VungleException(24);
                }
                vungleException2 = vungleException;
                if (vungleException2.mo58207a() == 24) {
                    break;
                }
            } else {
                vungleException2 = new VungleException(26);
                break;
            }
        }
        if (z) {
            mo58110q(vungleException2, gVar2.f58643a, str2);
        }
    }

    /* renamed from: o */
    public final void mo58108o(AdRequest adRequest) {
        m57043r((C23105g) this.f58615a.remove(adRequest), 39);
    }

    /* renamed from: p */
    public final void mo58109p(AdRequest adRequest, String str) {
        C24545c cVar;
        Objects.toString(adRequest);
        C24566m mVar = (C24566m) this.f58620f.mo58281p(C24566m.class, adRequest.mo58041f()).get();
        if (mVar == null) {
            VungleLogger.m57029b("AdLoader#DownloadAdCallback#onDownloadCompleted; loadAd sequence", String.format("loaded placement is null: request = %1$s; advertisementId = %2$s", new Object[]{adRequest, str}));
            mo58110q(new VungleException(13), adRequest, str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            cVar = null;
        } else {
            cVar = (C24545c) this.f58620f.mo58281p(C24545c.class, str).get();
        }
        if (cVar == null) {
            VungleLogger.m57029b("AdLoader#DownloadAdCallback#onDownloadCompleted; loadAd sequence", String.format("advertisement is null: request = %1$s; advertisementId = %2$s", new Object[]{adRequest, str}));
            mo58110q(new VungleException(11), adRequest, str);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        cVar.f62197S = currentTimeMillis - cVar.f62196R;
        cVar.f62194P = currentTimeMillis - cVar.f62198T;
        try {
            this.f58620f.mo58290y(cVar, adRequest.mo58041f(), 1);
            mo58111s(adRequest, mVar, cVar);
        } catch (DatabaseHelper.DBException e) {
            VungleLogger.m57029b("AdLoader#DownloadAdCallback#onDownloadCompleted; loadAd sequence", String.format("Can't save/apply state READY: exception = %1$s;request = %2$s; advertisement = %3$s", new Object[]{e, adRequest, cVar}));
            mo58110q(new VungleException(26), adRequest, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00da A[SYNTHETIC, Splitter:B:48:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58110q(com.vungle.warren.error.VungleException r12, com.vungle.warren.AdRequest r13, java.lang.String r14) {
        /*
            r11 = this;
            j$.util.concurrent.ConcurrentHashMap r0 = r11.f58615a
            java.lang.Object r0 = r0.remove(r13)
            com.vungle.warren.c$g r0 = (com.vungle.warren.C23097c.C23105g) r0
            r11.mo58115w(r13)
            com.vungle.warren.persistence.a r1 = r11.f58620f
            java.lang.String r2 = r13.mo58041f()
            java.lang.Class<od0.m> r3 = od0.C24566m.class
            td0.e r1 = r1.mo58281p(r3, r2)
            java.lang.Object r1 = r1.get()
            od0.m r1 = (od0.C24566m) r1
            if (r14 != 0) goto L_0x0021
            r14 = 0
            goto L_0x002f
        L_0x0021:
            com.vungle.warren.persistence.a r2 = r11.f58620f
            java.lang.Class<od0.c> r3 = od0.C24545c.class
            td0.e r14 = r2.mo58281p(r3, r14)
            java.lang.Object r14 = r14.get()
            od0.c r14 = (od0.C24545c) r14
        L_0x002f:
            r2 = 26
            r3 = 4
            r4 = 0
            if (r1 != 0) goto L_0x0066
            if (r14 == 0) goto L_0x0046
            com.vungle.warren.persistence.a r1 = r11.f58620f     // Catch:{ DBException -> 0x0041 }
            java.lang.String r5 = r13.mo58041f()     // Catch:{ DBException -> 0x0041 }
            r1.mo58290y(r14, r5, r3)     // Catch:{ DBException -> 0x0041 }
            goto L_0x0046
        L_0x0041:
            com.vungle.warren.error.VungleException r12 = new com.vungle.warren.error.VungleException
            r12.<init>((int) r2)
        L_0x0046:
            if (r0 == 0) goto L_0x0062
            java.util.concurrent.CopyOnWriteArraySet r14 = r0.f58650h
            java.util.Iterator r14 = r14.iterator()
        L_0x004e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r14.next()
            com.vungle.warren.z r0 = (com.vungle.warren.C23258z) r0
            java.lang.String r1 = r13.mo58041f()
            r0.onError(r1, r12)
            goto L_0x004e
        L_0x0062:
            r11.mo58113u(r13, r4)
            return
        L_0x0066:
            boolean r5 = r13.mo58039e()
            if (r5 == 0) goto L_0x009e
            com.vungle.warren.n1 r5 = com.vungle.warren.C23181n1.m57208b()
            ag.i r6 = new ag.i
            r6.<init>()
            com.vungle.warren.session.SessionEvent r7 = com.vungle.warren.session.SessionEvent.LOAD_AD_END
            java.lang.String r8 = r7.toString()
            java.lang.String r9 = "event"
            r6.mo40349F(r9, r8)
            com.vungle.warren.session.SessionAttribute r8 = com.vungle.warren.session.SessionAttribute.SUCCESS
            java.lang.String r8 = r8.toString()
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r6.mo40347D(r8, r9)
            com.vungle.warren.session.SessionAttribute r8 = com.vungle.warren.session.SessionAttribute.PLACEMENT_ID
            java.lang.String r1 = r1.f62257a
            java.lang.String r8 = r8.toString()
            r6.mo40349F(r8, r1)
            od0.q r1 = new od0.q
            r1.<init>((com.vungle.warren.session.SessionEvent) r7, (p359ag.C13452i) r6)
            r5.mo58250d(r1)
        L_0x009e:
            int r1 = r12.mo58207a()
            r5 = 1
            if (r1 == r5) goto L_0x00c9
            r6 = 14
            if (r1 == r6) goto L_0x00c9
            r6 = 20
            if (r1 == r6) goto L_0x00c6
            r6 = 25
            if (r1 == r6) goto L_0x00c9
            r6 = 36
            if (r1 == r6) goto L_0x00c9
            r6 = 22
            if (r1 == r6) goto L_0x00c6
            r6 = 23
            if (r1 == r6) goto L_0x00be
            goto L_0x00c4
        L_0x00be:
            if (r14 == 0) goto L_0x00c4
            r1 = 0
            r6 = 1
            r7 = 0
            goto L_0x00cc
        L_0x00c4:
            r1 = 0
            goto L_0x00ca
        L_0x00c6:
            r1 = 0
            r6 = 1
            goto L_0x00cb
        L_0x00c9:
            r1 = 1
        L_0x00ca:
            r6 = 0
        L_0x00cb:
            r7 = 4
        L_0x00cc:
            if (r0 == 0) goto L_0x00d2
            boolean r8 = r0.f58652j
            if (r8 == 0) goto L_0x00d5
        L_0x00d2:
            r13.toString()
        L_0x00d5:
            r11.mo58113u(r13, r4)
            if (r0 == 0) goto L_0x0167
            int r8 = r0.f58649g     // Catch:{ DBException -> 0x0148 }
            r9 = 2
            if (r8 != 0) goto L_0x010c
            int r1 = r0.f58647e     // Catch:{ DBException -> 0x0148 }
            int r4 = r0.f58648f     // Catch:{ DBException -> 0x0148 }
            if (r1 >= r4) goto L_0x013c
            if (r6 == 0) goto L_0x013c
            if (r14 == 0) goto L_0x00f3
            com.vungle.warren.persistence.a r12 = r11.f58620f     // Catch:{ DBException -> 0x0148 }
            java.lang.String r1 = r13.mo58041f()     // Catch:{ DBException -> 0x0148 }
            r12.mo58290y(r14, r1, r7)     // Catch:{ DBException -> 0x0148 }
        L_0x00f3:
            long r3 = r0.f58646d     // Catch:{ DBException -> 0x0148 }
            com.vungle.warren.c$g r12 = r0.mo58124a(r3)     // Catch:{ DBException -> 0x0148 }
            long r3 = r0.f58646d     // Catch:{ DBException -> 0x0148 }
            long r3 = r3 * r9
            com.vungle.warren.c$g r12 = r12.mo58127d(r3)     // Catch:{ DBException -> 0x0148 }
            int r14 = r0.f58647e     // Catch:{ DBException -> 0x0148 }
            int r14 = r14 + r5
            com.vungle.warren.c$g r12 = r12.mo58126c(r14)     // Catch:{ DBException -> 0x0148 }
            r11.mo58105l(r12)     // Catch:{ DBException -> 0x0148 }
            return
        L_0x010c:
            if (r8 != r5) goto L_0x013c
            if (r1 != 0) goto L_0x013c
            int r12 = r0.f58647e     // Catch:{ DBException -> 0x0148 }
            int r1 = r0.f58648f     // Catch:{ DBException -> 0x0148 }
            if (r12 >= r1) goto L_0x011b
            if (r6 == 0) goto L_0x011b
            int r4 = r12 + 1
            r3 = r7
        L_0x011b:
            if (r14 == 0) goto L_0x0126
            com.vungle.warren.persistence.a r12 = r11.f58620f     // Catch:{ DBException -> 0x0148 }
            java.lang.String r1 = r13.mo58041f()     // Catch:{ DBException -> 0x0148 }
            r12.mo58290y(r14, r1, r3)     // Catch:{ DBException -> 0x0148 }
        L_0x0126:
            long r5 = r0.f58646d     // Catch:{ DBException -> 0x0148 }
            com.vungle.warren.c$g r12 = r0.mo58124a(r5)     // Catch:{ DBException -> 0x0148 }
            long r5 = r0.f58646d     // Catch:{ DBException -> 0x0148 }
            long r5 = r5 * r9
            com.vungle.warren.c$g r12 = r12.mo58127d(r5)     // Catch:{ DBException -> 0x0148 }
            com.vungle.warren.c$g r12 = r12.mo58126c(r4)     // Catch:{ DBException -> 0x0148 }
            r11.mo58105l(r12)     // Catch:{ DBException -> 0x0148 }
            return
        L_0x013c:
            if (r14 == 0) goto L_0x014d
            com.vungle.warren.persistence.a r1 = r11.f58620f     // Catch:{ DBException -> 0x0148 }
            java.lang.String r4 = r13.mo58041f()     // Catch:{ DBException -> 0x0148 }
            r1.mo58290y(r14, r4, r3)     // Catch:{ DBException -> 0x0148 }
            goto L_0x014d
        L_0x0148:
            com.vungle.warren.error.VungleException r12 = new com.vungle.warren.error.VungleException
            r12.<init>((int) r2)
        L_0x014d:
            java.util.concurrent.CopyOnWriteArraySet r14 = r0.f58650h
            java.util.Iterator r14 = r14.iterator()
        L_0x0153:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r14.next()
            com.vungle.warren.z r0 = (com.vungle.warren.C23258z) r0
            java.lang.String r1 = r13.mo58041f()
            r0.onError(r1, r12)
            goto L_0x0153
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.C23097c.mo58110q(com.vungle.warren.error.VungleException, com.vungle.warren.AdRequest, java.lang.String):void");
    }

    /* renamed from: s */
    public final void mo58111s(AdRequest adRequest, C24566m mVar, C24545c cVar) {
        String str;
        String str2;
        List list;
        mo58113u(adRequest, false);
        C23235v vVar = this.f58625k.f58819a.get();
        if (!(cVar == null || !mVar.f62263g || vVar == null)) {
            vVar.mo58348b(adRequest.mo58041f(), cVar.f62190L);
        }
        Objects.toString(adRequest);
        C23250x xVar = this.f58625k.f58820b.get();
        int g = adRequest.mo58042g();
        if (mVar.mo60832b() && xVar != null && (g == 2 || g == 0)) {
            xVar.mo15749b(adRequest.mo58041f());
        }
        C23105g gVar = (C23105g) this.f58615a.remove(adRequest);
        if (cVar != null) {
            str = cVar.getId();
        } else {
            str = null;
        }
        if (gVar != null) {
            mVar.f62266j = gVar.f58644b;
            try {
                this.f58620f.mo58288w(mVar);
                System.currentTimeMillis();
                adRequest.timeStamp.get();
                adRequest.toString();
                if (adRequest.mo58039e()) {
                    C23181n1 b = C23181n1.m57208b();
                    C13452i iVar = new C13452i();
                    SessionEvent sessionEvent = SessionEvent.LOAD_AD_END;
                    iVar.mo40349F("event", sessionEvent.toString());
                    iVar.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.TRUE);
                    iVar.mo40349F(SessionAttribute.PLACEMENT_ID.toString(), mVar.f62257a);
                    b.mo58250d(new C24573q(sessionEvent, iVar));
                }
                Iterator it = gVar.f58650h.iterator();
                while (it.hasNext()) {
                    C23258z zVar = (C23258z) it.next();
                    if (zVar instanceof C23106c0) {
                        ((C23106c0) zVar).mo58096a(cVar);
                    } else {
                        zVar.onAdLoad(adRequest.mo58041f());
                    }
                }
                C23181n1 b2 = C23181n1.m57208b();
                C13452i iVar2 = new C13452i();
                SessionEvent sessionEvent2 = SessionEvent.AD_AVAILABLE;
                iVar2.mo40349F("event", sessionEvent2.toString());
                SessionAttribute sessionAttribute = SessionAttribute.EVENT_ID;
                if (cVar != null) {
                    str2 = cVar.getId();
                } else {
                    str2 = null;
                }
                iVar2.mo40349F(sessionAttribute.toString(), str2);
                iVar2.mo40349F(SessionAttribute.PLACEMENT_ID.toString(), adRequest.mo58041f());
                b2.mo58250d(new C24573q(sessionEvent2, iVar2));
                if (adRequest.mo58039e()) {
                    if (cVar != null) {
                        list = cVar.f62202Z;
                    } else {
                        list = new ArrayList();
                    }
                    if (!list.isEmpty()) {
                        C25024h hVar = this.f58626l.get();
                        if (hVar == null) {
                            VungleLogger.m57029b("AdLoader#load; loadAd sequence", String.format("Cannot load operation %s; job runner is null", new Object[]{gVar}));
                            m57043r(gVar, 9);
                            return;
                        }
                        String[] strArr = (String[]) list.toArray(new String[0]);
                        hVar.mo58356b(C25017a.m62725b((String) null, 3, 0, strArr));
                        hVar.mo58356b(C25017a.m62725b((String) null, 1, 1, strArr));
                    }
                }
            } catch (DatabaseHelper.DBException e) {
                VungleLogger.m57029b("AdLoader#DownloadAdCallback#onReady; loadAd sequence", String.format("Can't save placement: exception = %1$s;placement = %2$s; advertisement = %3$s", new Object[]{e, mVar, cVar}));
                mo58110q(new VungleException(26), adRequest, str);
            }
        }
    }

    /* renamed from: t */
    public final void mo58112t(C24545c cVar, File file, String str, String str2) throws DatabaseHelper.DBException {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        String o = C0016g.m31o(sb, File.separator, str);
        if (o.endsWith("postroll") || o.endsWith("template")) {
            i = 0;
        } else {
            i = 2;
        }
        C24543a aVar = new C24543a(cVar.getId(), str2, o);
        aVar.f62172f = 0;
        aVar.f62173g = i;
        try {
            this.f58620f.mo58288w(aVar);
        } catch (DatabaseHelper.DBException e) {
            VungleLogger.m57029b("AdLoader#saveAsset; loadAd sequence", String.format("Can't save adAsset %1$s; exception = %2$s", new Object[]{aVar, e}));
            throw e;
        }
    }

    /* renamed from: u */
    public final void mo58113u(AdRequest adRequest, boolean z) {
        C23105g gVar = (C23105g) this.f58615a.get(adRequest);
        if (gVar != null) {
            gVar.f58651i.set(z);
        }
    }

    /* renamed from: v */
    public final void mo58114v(C23105g gVar) {
        boolean z;
        C24545c cVar;
        int i;
        boolean z2;
        int i2;
        List list;
        boolean z3;
        List<C24545c> list2;
        this.f58615a.put(gVar.f58643a, gVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f58627m.isInitialized()) {
            VungleLogger.m57029b("AdLoader#loadAd#execute; loadAd sequence", "Vungle is not initialized");
            mo58110q(new VungleException(9), gVar.f58643a, (String) null);
            return;
        }
        C24566m mVar = (C24566m) this.f58620f.mo58281p(C24566m.class, gVar.f58643a.mo58041f()).get();
        if (mVar == null) {
            StringBuilder k = C13555b.m33972k("placement not found for ");
            k.append(gVar.f58643a);
            VungleLogger.m57029b("AdLoader#loadAd#execute; loadAd sequence", k.toString());
            mo58110q(new VungleException(13), gVar.f58643a, (String) null);
        } else if (!mVar.f62264h) {
            mo58110q(new VungleException(5), gVar.f58643a, (String) null);
        } else {
            AdConfig.AdSize adSize = gVar.f58644b;
            if ((mVar.f62265i != 1 || AdConfig.AdSize.isNonMrecBannerAdSize(adSize)) && (mVar.f62265i != 0 || AdConfig.AdSize.isDefaultAdSize(adSize))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                StringBuilder k2 = C13555b.m33972k("size is invalid, size = ");
                k2.append(gVar.f58644b);
                VungleLogger.m57029b("AdLoader#loadAd#execute; loadAd sequence", k2.toString());
                mo58110q(new VungleException(28), gVar.f58643a, (String) null);
                return;
            }
            if (mVar.f62265i == 1 && !mVar.mo60833c() && (list2 = this.f58620f.mo58278m(mVar.f62257a, gVar.f58643a.mo58037c()).get()) != null) {
                boolean z4 = false;
                for (C24545c cVar2 : list2) {
                    if (cVar2.f62224w.mo58261a() != gVar.f58644b) {
                        try {
                            this.f58620f.mo58272g(cVar2.getId());
                            z4 = true;
                        } catch (DatabaseHelper.DBException unused) {
                            StringBuilder k3 = C13555b.m33972k("cannot delete advertisement, request = ");
                            k3.append(gVar.f58643a);
                            VungleLogger.m57029b("AdLoader#loadAd#execute; loadAd sequence", k3.toString());
                            mo58110q(new VungleException(26), gVar.f58643a, (String) null);
                            return;
                        }
                    }
                }
                if (z4) {
                    mo58106m(mVar, gVar.f58644b, 0, gVar.f58643a.mo58039e());
                }
            }
            int g = gVar.f58643a.mo58042g();
            if (g == 0 || g == 2) {
                cVar = this.f58620f.mo58277l(mVar.f62257a, gVar.f58643a.mo58037c()).get();
                if (gVar.f58643a.mo58036b() != null && cVar == null && gVar.f58643a.mo58036b().mo58244b() == 2) {
                    cVar = ((AdMarkupV2) gVar.f58643a.mo58036b()).mo58248c();
                    try {
                        this.f58620f.mo58288w(cVar);
                    } catch (DatabaseHelper.DBException unused2) {
                    }
                }
                if (mVar.mo60833c() && gVar.f58643a.mo58042g() == 0) {
                    if (gVar.f58643a.mo58037c() == null) {
                        mo58110q(new VungleException(36), gVar.f58643a, (String) null);
                        return;
                    } else if (cVar == null) {
                        mo58110q(new VungleException(10), gVar.f58643a, (String) null);
                        return;
                    }
                }
                if (cVar != null) {
                    if (cVar.f62192N != 1) {
                        z3 = false;
                    } else {
                        z3 = mo58103i(cVar);
                    }
                    if (z3) {
                        mo58115w(gVar.f58643a);
                        mo58111s(gVar.f58643a, mVar, cVar);
                        return;
                    }
                }
                if (cVar != null && (((i2 = cVar.f62192N) == 0 || i2 == 1) && (list = this.f58620f.mo58284s(cVar.getId()).get()) != null && list.size() != 0)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = true;
                            break;
                        }
                        C24543a aVar = (C24543a) it.next();
                        if (aVar.f62173g == 1) {
                            if (!m57041f(new File(aVar.f62171e), aVar)) {
                                break;
                            }
                        } else if (TextUtils.isEmpty(aVar.f62170d)) {
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    C23248w1 w1Var = this.f58625k.f58821c.get();
                    if (w1Var == null || this.f58623i.mo61482b(1) < w1Var.f59001b) {
                        if (cVar.f62192N != 4) {
                            try {
                                this.f58620f.mo58290y(cVar, gVar.f58643a.mo58041f(), 4);
                            } catch (DatabaseHelper.DBException unused3) {
                                StringBuilder k4 = C13555b.m33972k("cannot save/apply ERROR state, request = ");
                                k4.append(gVar.f58643a);
                                VungleLogger.m57029b("AdLoader#loadAd#execute; loadAd sequence; canReDownload branch", k4.toString());
                                mo58110q(new VungleException(26), gVar.f58643a, (String) null);
                                return;
                            }
                        }
                        StringBuilder k5 = C13555b.m33972k("failed to download assets, no space; request = ");
                        k5.append(gVar.f58643a);
                        VungleLogger.m57029b("AdLoader#loadAd#execute; loadAd sequence", k5.toString());
                        mo58110q(new VungleException(19), gVar.f58643a, (String) null);
                        return;
                    }
                    mo58113u(gVar.f58643a, true);
                    if (cVar.f62192N != 0) {
                        try {
                            this.f58620f.mo58290y(cVar, gVar.f58643a.mo58041f(), 0);
                        } catch (DatabaseHelper.DBException unused4) {
                            StringBuilder k6 = C13555b.m33972k("cannot save/apply NEW state, request = ");
                            k6.append(gVar.f58643a);
                            VungleLogger.m57029b("AdLoader#loadAd#execute; loadAd sequence; canReDownload branch", k6.toString());
                            mo58110q(new VungleException(26), gVar.f58643a, (String) null);
                            return;
                        }
                    }
                    cVar.f62198T = currentTimeMillis;
                    cVar.f62196R = System.currentTimeMillis();
                    mo58115w(gVar.f58643a);
                    mo58098c(gVar, cVar);
                    return;
                }
            } else if (gVar.f58643a.mo58042g() != 1 || !m57042k(gVar, this.f58620f)) {
                cVar = null;
            } else {
                mo58115w(gVar.f58643a);
                mo58111s(gVar.f58643a, mVar, (C24545c) null);
                return;
            }
            if (mVar.f62260d > System.currentTimeMillis()) {
                mo58110q(new VungleException(1), gVar.f58643a, (String) null);
                VungleLogger.m57032e("AdLoader#loadAd#execute; loadAd sequence; snoozed branch", String.format("Placement with id %s is snoozed ", new Object[]{mVar.f62257a}));
                mo58106m(mVar, gVar.f58644b, mVar.f62260d - System.currentTimeMillis(), false);
                return;
            }
            gVar.f58643a.getClass();
            Objects.toString(gVar.f58643a);
            if (cVar != null) {
                try {
                    this.f58620f.mo58290y(cVar, gVar.f58643a.mo58041f(), 4);
                } catch (DatabaseHelper.DBException unused5) {
                    StringBuilder k7 = C13555b.m33972k("cannot save/apply ERROR state, request = ");
                    k7.append(gVar.f58643a);
                    VungleLogger.m57029b("AdLoader#loadAd#execute; loadAd sequence; last else branch", k7.toString());
                    mo58110q(new VungleException(26), gVar.f58643a, (String) null);
                    return;
                }
            }
            C23248w1 w1Var2 = this.f58625k.f58821c.get();
            if (w1Var2 == null || this.f58623i.mo61482b(1) >= w1Var2.f59001b) {
                mo58113u(gVar.f58643a, true);
                mo58100e(gVar, mVar);
                return;
            }
            VungleLogger.m57029b("AdLoader#loadAd#execute; loadAd sequence; last else branch", String.format("no space to load, isAutoCached = %1$s, request = %2$s", new Object[]{Boolean.valueOf(mVar.mo60832b()), gVar.f58643a}));
            if (mVar.mo60832b()) {
                i = 18;
            } else {
                i = 17;
            }
            mo58110q(new VungleException(i), gVar.f58643a, (String) null);
        }
    }

    /* renamed from: w */
    public final void mo58115w(AdRequest adRequest) {
        AdRequest adRequest2 = this.f58619e;
        if (adRequest2 == null || adRequest2.equals(adRequest)) {
            this.f58619e = null;
            C23130e0.C23132b poll = this.f58618d.f58723a.poll();
            if (poll != null) {
                C23105g gVar = poll.f58726b;
                this.f58619e = gVar.f58643a;
                mo58114v(gVar);
            }
        }
    }

    /* renamed from: x */
    public final void mo58116x(C24545c cVar, C24543a aVar, File file, List<C24543a> list) throws IOException, DatabaseHelper.DBException {
        String str;
        ArrayList arrayList = new ArrayList();
        for (C24543a next : list) {
            if (next.f62173g == 2) {
                arrayList.add(next.f62171e);
            }
        }
        File g = mo58101g(cVar);
        if (g == null || !g.isDirectory()) {
            Object[] objArr = new Object[2];
            if (g == null) {
                str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            } else {
                str = "not a dir";
            }
            objArr[0] = str;
            objArr[1] = cVar;
            VungleLogger.m57029b("AdLoader#unzipFile; loadAd sequence", String.format("Can't unzip file: destination dir is %1$s; advertisement = %2$s", objArr));
            throw new IOException("Unable to access Destination Directory");
        }
        ArrayList b = UnzipUtility.m57275b(file.getPath(), g.getPath(), new C23102e(arrayList));
        if (file.getName().equals("template")) {
            StringBuilder sb = new StringBuilder();
            sb.append(g.getPath());
            File file2 = new File(C0016g.m31o(sb, File.separator, "mraid.js"));
            if (file2.exists()) {
                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2, true)));
                printWriter.println("!function(e){var t={};function r(n){if(t[n])return t[n].exports;var o=t[n]={i:n,l:!1,exports:{}};return e[n].call(o.exports,o,o.exports,r),o.l=!0,o.exports}r.m=e,r.c=t,r.d=function(e,t,n){r.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},r.r=function(e){\"undefined\"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:\"Module\"}),Object.defineProperty(e,\"__esModule\",{value:!0})},r.t=function(e,t){if(1&t&&(e=r(e)),8&t)return e;if(4&t&&\"object\"==typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(r.r(n),Object.defineProperty(n,\"default\",{enumerable:!0,value:e}),2&t&&\"string\"!=typeof e)for(var o in e)r.d(n,o,function(t){return e[t]}.bind(null,o));return n},r.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return r.d(t,\"a\",t),t},r.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},r.p=\"\",r(r.s=0)}([function(e,t,r){\"use strict\";r.r(t);r(1),r(2),r(3),r(4)},function(e,t){!function(e){\"use strict\";var t,r=e.vungle=e.vungle||{};r.error||((t=r.error=r.error||{}).bridgeError={BRG000:\"Missing command in mraidBridge.executeSDKCommand method call!\",BRG001:\"Vungle SDK is not ready to process MRAID command!\"},t.bridgeExtError={BRX000:\"Cannot retrieve #dynamic container in Ad Unit!\"},t.mraidError={MRD000:\"Cannot add listener for unknown MRAID event!\",MRD001:\"Missing argument(s)! Both event and/or listener are required for method call!\",MRD002:\"Unable to find listener registered for event!\",MRD003:\"Missing MRAID event! Cannot remove event listener!\",MRD004:\"Missing object! An expand properties object is required for method call!\",MRD005:\"Missing object! An orientation properties object is required for method call!\",MRD006:\"Missing object! An resize properties object is required for method call!\",MRD007:\"Missing URL! A URL is required for method call!\",MRD008:\"Ad unit is hidden and cannot be closed!\",MRD009:\"Missing URL! A video/caption URL is required for method call!\",MRD010:\"Ad Unit is not viewable! Please make sure isViewAble is set to true!\",MRD011:\"Ad unit can only be expanded from the default or resized state!\",MRD012:\"Ad unit can only be resized from the default or resized state!\",MRD013:\"Missing URI! A valid URI is required for method call!\",MRD015:\"Invalid data/type detected when updating MRAID properties!\",MRD016:\"Missing app store id! An app store id is required for method call!\"},t.mraidClientError={MRC000:\"MRAID SDK error detected!\",MRC001:\"Missing MRAID object in window!\",MRC002:\"Missing video URL!  mraidClient.playVideo cannot retrieve video URL from arguments!\"},t.adTemplateError={ADT000:\"Missing page template JavaScript!\",ADT001:\"Error encountered loading template configuration!\"},t.gestureTrackingError={GET000:\"Cannot serialize user interaction tracking event object!\"})}(window)},function(e,t){!function(e){\"use strict\";var t=e.vungle=e.vungle||{},r=t.mraidCore=t.mraidCore||{},n=t.debugLog=t.debugLog||[];n&&n.push(\"vungle.mraidCore loaded.\"),r.consts={versions:{V1:\"1.0\",V2:\"2.0\"},states:{LOADING:\"loading\",DEFAULT:\"default\",RESIZED:\"resized\",EXPANDED:\"expanded\",HIDDEN:\"hidden\"},events:{INFO:\"info\",READY:\"ready\",ERROR:\"error\",STATE_CHANGE:\"stateChange\",ORIENTATION_CHANGE:\"orientationChange\",VIEWABLE_CHANGE:\"viewableChange\",SIZE_CHANGE:\"sizeChange\"},placements:{UNKNOWN:\"unknown\",INLINE:\"inline\",INTERSTITIAL:\"interstitial\"},orientations:{PORTRAIT:\"portrait\",LANDSCAPE:\"landscape\",NONE:\"none\"},closePositions:{CENTER:\"center\",TOP_LEFT:\"top-left\",TOP_CENTER:\"top-center\",TOP_RIGHT:\"top-right\",BOTTOM_LEFT:\"bottom-left\",BOTTOM_CENTER:\"bottom-center\",BOTTOM_RIGHT:\"bottom-right\"}},r.PropertiesValueObject=function(e){var t=function(e){var t;return e&&\"object\"==typeof e?(t={},Object.keys(e).forEach(function(r){t[r]=e[r]})):t=e,t};this.value=t(e),this.clone=function(){return t(this.value)},this.update=function(e){if(e&&\"object\"==typeof e){var t=this;Object.keys(e).forEach(function(r){t.value[r]=e[r]})}else this.value=e}},r.EventListeners=function(e){var t={};this.event=e,this.listenerCount=0,this.add=function(e){var r=String(e);return!t[r]&&(t[r]=e,this.listenerCount++,!0)},this.remove=function(e){var r=String(e);return!(!t.hasOwnProperty(r)||!t[r])&&(t[r]=null,delete t[r],this.listenerCount--,!0)},this.removeAll=function(){var e=this;Object.keys(t).forEach(function(r){e.remove(t[r])})},this.broadcast=function(e){var r=this;Object.keys(t).forEach(function(n){t[n].apply(r.mraid,e)})}};var o=new r.PropertiesValueObject(r.consts.versions.V1),i=new r.PropertiesValueObject({width:0,height:0}),a=new r.PropertiesValueObject({width:0,height:0}),s=new r.PropertiesValueObject({x:0,y:0,width:0,height:0}),c=new r.PropertiesValueObject({x:0,y:0,width:0,height:0}),d=new r.PropertiesValueObject({width:0,height:0,useCustomClose:!1,isModal:!0}),u=new r.PropertiesValueObject({width:0,height:0,offsetX:0,offsetY:0,customClosePosition:r.consts.closePositions.TOP_RIGHT,allowOffscreen:!0}),l=new r.PropertiesValueObject({allowOrientationChange:!0,forceOrientation:r.consts.orientations.NONE}),p=new r.PropertiesValueObject({sms:!1,tel:!1,calendar:!1,storePicture:!1,inlineVideo:!1}),m=new r.PropertiesValueObject(r.consts.states.LOADING),f=new r.PropertiesValueObject(r.consts.placements.UNKNOWN),E=new r.PropertiesValueObject(!1),g=new r.PropertiesValueObject(!1),v=new r.PropertiesValueObject(!1),y=new r.PropertiesValueObject(!1),R=new r.PropertiesValueObject(!1),h=new r.PropertiesValueObject(!1),O=new r.PropertiesValueObject(!1),S=new r.PropertiesValueObject(!1),C=new r.PropertiesValueObject(!1),x=new r.PropertiesValueObject(!1),b={},P=new r.PropertiesValueObject(\"\"),B=new r.PropertiesValueObject(\"\"),D=new r.PropertiesValueObject(\"\");r.eventListeners=b,r.propertiesHandlers={os:{update:function(e){P.update(e)},clone:function(){return P.clone()}},osVersion:{update:function(e){B.update(e)},clone:function(){return B.clone()}},sdkVersion:{update:function(e){D.update(e)},clone:function(){return D.clone()}},incentivized:{update:function(e){g.update(e)},clone:function(){return g.clone()}},consentRequired:{update:function(e){v.update(e)},clone:function(){return v.clone()}},consentTitleText:{update:function(e){y.update(e)},clone:function(){return y.clone()}},consentBodyText:{update:function(e){R.update(e)},clone:function(){return R.clone()}},consentAcceptButtonText:{update:function(e){h.update(e)},clone:function(){return h.clone()}},consentDenyButtonText:{update:function(e){O.update(e)},clone:function(){return O.clone()}},version:{update:function(e){o.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting MRAID version to: \"+String(e))},clone:function(){return o.clone()}},maxSize:{update:function(e){i.update(e),d.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting maxSize to: \"+String(e))},clone:function(){return i.clone()}},screenSize:{update:function(e){var t;a.update(e),t=a.clone(),r.broadcastEvent(r.consts.events.INFO,\"Setting screenSize to: \"+String(e)),r.broadcastEvent(r.consts.events.SIZE_CHANGE,t.width,t.height)},clone:function(){return a.clone()}},defaultPosition:{update:function(e){s.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting defaultPosition to: \"+String(e))},clone:function(){return s.clone()}},currentPosition:{update:function(e){c.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting currentPosition to: \"+String(e))},clone:function(){return c.clone()}},expandProperties:{update:function(e){d.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting expandProperties to: \"+String(e))},clone:function(){return d.clone()}},resizeProperties:{update:function(e){u.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting resizeProperties to: \"+String(e))},clone:function(){return u.clone()}},orientationProperties:{update:function(e){l.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting orientationProperties to: \"+String(e))},clone:function(){return l.clone()}},supports:{update:function(e){p.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting supports to: \"+String(e))},clone:function(){return p.clone()}},state:{update:function(e){m.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting state to: \"+String(e)),r.broadcastEvent(r.consts.events.STATE_CHANGE,m.clone()),m.clone()===r.consts.states.DEFAULT&&r.broadcastEvent(r.consts.events.READY)},clone:function(){return m.clone()}},placementType:{update:function(e){f.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting placementType to: \"+String(e))},clone:function(){return f.clone()}},isViewable:{update:function(e){E.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting isViewable to: \"+String(e)),r.broadcastEvent(r.consts.events.VIEWABLE_CHANGE,E.clone())},clone:function(){return E.clone()}},customClose:{update:function(e){S.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting useCustomClose to: \"+String(e))},clone:function(){return S.clone()}},customPrivacy:{update:function(e){C.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting useCustomPrivacy to: \"+String(e))},clone:function(){return C.clone()}},enableBackImmediately:{update:function(e){x.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting enableBackImmediately to: \"+String(e))},clone:function(){return x.clone()}}},r.propertiesValidator=function(e,r,n){var o=!0;return typeof e!=typeof r&&\"useCustomClose\"!==n?(o=!1,t.mraidBridgeExt&&t.mraidBridgeExt.notifyError([\"MRD015\",n,e].join(\":\"))):\"object\"==typeof e&&Object.keys(e).forEach(function(e){e in r||(o=!1,t.mraidBridgeExt&&t.mraidBridgeExt.notifyError([\"MRD015\",n,e].join(\":\")))}),o},r.broadcastEvent=function(){var e=Array.prototype.slice.call(arguments),t=e.shift(),r=b[t];r&&r.broadcast(e)},r.isValidMARIDEvent=function(e){for(var t in r.consts.events)if(r.consts.events[t]===e)return!0;return!1}}(window)},function(e,t){!function(e){\"use strict\";var t,r=e.vungle=e.vungle||{},n=r.mraidBridge=r.mraidBridge||{},o=r.mraidBridgeExt=r.mraidBridgeExt||{},i=r.debugLog=r.debugLog||[],a=!1,s=!1,c=[],d=!1,u=!1,l=!1,p=!1,m=r.mraidCore.broadcastEvent,f=r.mraidCore.consts.states,E=r.mraidCore.consts.events;i&&i.push(\"vungle.mraidBridge loaded.\"),n.notifyContainer=function(t){e.location=t},n.notifyPropertiesChange=function(e,t){i&&i.push(\"mraidBridge.notifyPropertiesChange:\"+JSON.stringify(e)),Object.keys(e).forEach(function(t){r.mraidCore.propertiesHandlers[t]?r.mraidCore.propertiesHandlers[t].update(e[t]):n.notifyErrorEvent(\"notifyPropertiesChange\",\"MRD015: Unhandled Property received - \"+t+\" - \"+e[t])}),void 0!==t&&!0===t&&n.notifyContainer(\"mraid://propertiesChangeCompleted\")},n.notifyCommandComplete=function(){i&&i.push(\"mraidBridge.notifyCommandComplete\");var e=\"\";c.length?(e=c.shift(),n.notifyContainer(e)):s=!1},n.notifyReadyEvent=function(e){i&&i.push(\"mraidBridge.notifyReadyEvent\");var n=r.mraidCore.propertiesHandlers.state.clone();a=!0,void 0!==e?(d=!0,p=e.isInstalled,l=e.isDisplayIAP,u=e.isDirectDownload,t=e):r.mraidBridgeExt.notifySuccessfulViewAd(),n!==f.DEFAULT?r.mraidCore.propertiesHandlers.state.update(f.DEFAULT):m(E.READY)},n.notifyErrorEvent=function(e,t){i&&i.push(\"mraidBridge.notifyErrorEvent:\"+e+\":\"+t),m(E.ERROR,e,t)},n.executeSDKCommand=function(){var e,t,o,d=\"\";if(!a)throw n.notifyErrorEvent(d,r.error.bridgeError.BRG001),{name:\"VungleMRAIDBridgeException\",message:\"BRG001\"};if(!arguments)throw n.notifyErrorEvent(d,r.error.bridgeError.BRG000),{name:\"VungleMRAIDBridgeException\",message:\"BRG000\"};for(d+=\"mraid://\"+arguments[0],o=1;o<arguments.length;o+=2)e=arguments[o],t=arguments[o+1],d+=(1===o?\"?\":\"&\")+encodeURIComponent(e),void 0!==t&&(d+=\"=\"+encodeURIComponent(t));s?c.push(d):(s=!0,n.notifyContainer(d)),i&&i.push(\"mraidBridge.executeSDKCommand: \"+d)},o.getReplacementTokens=function(){return t},o.getIsVungleAd=function(){return d},o.getIsDirectDownload=function(){return u},o.getIsDisplayIAP=function(){return l},o.getIsInstalled=function(){return p},o.getEnableBackButtonImmediately=function(){return r.mraidCore.propertiesHandlers.enableBackImmediately.clone()},o.fireVideoCompleteEvent=function(){i&&i.push(\"mraidBridgeExt.fireVideoCompleteEvent\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.video.ended\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPrepareStoreViewSuccess=function(){i&&i.push(\"mraidBridgeExt.notifyPrepareStoreViewSuccess\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.preparestore.success\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPresentStoreViewFinished=function(){i&&i.push(\"mraidBridgeExt.notifyPresentStoreViewFinished\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.preparestore.finished\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPrepareStoreOverlayViewSuccess=function(){i&&i.push(\"mraidBridgeExt.notifyPrepareStoreOverlayViewSuccess\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.storeoverlay.success\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPresentStoreOverlayViewFinished=function(){i&&i.push(\"mraidBridgeExt.notifyPresentStoreOverlayViewFinished\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.storeoverlay.finished\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPresentStoreOverlayViewVisible=function(){i&&i.push(\"mraidBridgeExt.notifyPresentStoreOverlayViewVisible\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.storeoverlay.visible\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPresentStoreOverlayViewFailed=function(){i&&i.push(\"mraidBridgeExt.notifyPresentStoreOverlayViewFailed\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.storeoverlay.failed\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyError=function(t){i&&i.push(\"mraidBridgeExt.notifyError:\"+t);try{r.mraidBridge.executeSDKCommand(\"error\",\"code\",t)}catch(t){\"VungleMRAIDBridgeException\"===t.name?i&&i.push(\"%cVungleMRAIDBridgeException caught in mraidBridgeExt.notifyError! Message: %s\",\"color: red; font-size: x-large\",e.vungle.error.bridgeError[t.message]):i&&i.push(\"%cUnknown Exception caught in mraidBridgeExt.notifyError! Message: %s\",\"color: red; font-size: x-large\",t.message)}},o.notifyTPAT=function(e){i&&i.push(\"mraidBridgeExt.notifyTPATEvent:\"+e);try{r.mraidBridge.executeSDKCommand(\"tpat\",\"event\",e)}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifyTPAT\",e.message)}},o.consentAction=function(e){i&&i.push(\"mraidBridgeExt.consentActionEvent:\"+e);try{r.mraidBridge.executeSDKCommand(\"consentAction\",\"event\",e)}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.consentActionEvent\",e.message)}},o.notifyUserInteraction=function(e,t){i&&i.push(\"mraidBridgeExt.notifyUserInteraction\");try{r.mraidBridge.executeSDKCommand(\"action\",e,t)}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifyUserInteraction\",e.message)}},o.notifyEventValuePairEvent=function(e,t){i&&i.push(\"mraidBridgeExt.notifyEventValuePairEvent\");var n=e||\"null\",o=t||\"null\";try{r.mraidBridge.executeSDKCommand(\"actionWithValue\",\"event\",n,\"value\",o)}catch(n){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifyEventValuePairEvent\",n.message)}},o.playHTML5Video=function(e){i&&i.push(\"mraidBridgeExt.playHTML5Video\");try{r.mraidBridge.executeSDKCommand(\"playHTML5Video\",\"selector\",e)}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.playHTML5Video\",e.message)}},o.openPrivacy=function(e){i&&i.push(\"mraidBridgeExt.openPrivacy\");try{r.mraidBridge.executeSDKCommand(\"openPrivacy\",\"url\",e)}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.openPrivacy\",e.message)}},o.requestMRAIDClose=function(){i&&i.push(\"mraidBridgeExt.requestMRAIDClose\");try{var e,t=\"windows\"===r.mraidExt.getOS()&&(0===r.mraidExt.getOSVersion().indexOf(\"WinPhone81\")||0===r.mraidExt.getOSVersion().indexOf(\"Win81\")),n=\"android\"===r.mraidExt.getOS()&&parseInt(r.mraidExt.getOSVersion(),10)<=17;t||n?(e=document.createEvent(\"Event\")).initEvent(\"vungle.events.request.close\",!0,!0):e=new Event(\"vungle.events.request.close\"),d?document.querySelector(\"#dynamic\").dispatchEvent(e):r.mraidBridge.executeSDKCommand(\"close\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.requestMRAIDClose\",e.message)}},o.notifySuccessfulViewAd=function(){i&&i.push(\"mraidBridgeExt.notifySuccessfulViewAd\");try{r.mraidBridge.executeSDKCommand(\"successfulView\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifySuccessfulViewAd\",e.message)}},o.openAppInDevice=function(){i&&i.push(\"mraidBridgeExt.openAppInDevice\");try{r.mraidBridge.executeSDKCommand(\"openAppInDevice\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.openAppInDevice\",e.message)}},o.openStorePage=function(){i&&i.push(\"mraidBridgeExt.openStorePage\");try{r.mraidBridge.executeSDKCommand(\"openStorePage\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.openStorePage\",e.message)}},o.cancelDownload=function(){i&&i.push(\"mraidBridgeExt.cancelDownload\");try{r.mraidBridge.executeSDKCommand(\"cancelDownload\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.cancelDownload\",e.message)}},o.getInstallationStatus=function(t){i&&i.push(\"mraidBridgeExt.getInstallationStatus\");var r=e.document.querySelector(\"#dynamic\"),n=new e.CustomEvent(\"vungle.events.installationStatus.updated\",{detail:t});r?r.dispatchEvent(n):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.startDownloadAppOnDevice=function(){i&&i.push(\"mraidBridgeExt.startDownloadAppOnDevice\");try{r.mraidBridge.executeSDKCommand(\"startDownloadAppOnDevice\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.startDownloadAppOnDevice\",e.message)}}}(window)},function(e,t){!function(e){\"use strict\";var t=e.vungle=e.vungle||{},r=e.mraid=t.mraid=t.mraid||{},n=t.mraidExt=t.mraidExt||{},o=t.debugLog=t.debugLog||[],i=t.mraidBridge.executeSDKCommand,a=t.mraidCore.broadcastEvent,s=t.mraidCore.propertiesHandlers,c=t.mraidCore.propertiesValidator,d=t.mraidCore.consts.states,u=t.mraidCore.consts.events,l=t.mraidCore.consts.placements;o&&o.push(\"vungle.mraid loaded.\"),r.addEventListener=function(e,r){e&&r?t.mraidCore.isValidMARIDEvent(e)?(t.mraidCore.eventListeners[e]||(t.mraidCore.eventListeners[e]=new t.mraidCore.EventListeners(e)),t.mraidCore.eventListeners[e].add(r)):a(u.ERROR,\"mraid.addEventListener\",t.error.mraidError.MRD000+\":\"+e):a(u.ERROR,\"mraid.addEventListener\",t.error.mraidError.MRD001)},r.removeEventListener=function(e,r){var n,o=!1;e?(n=t.mraidCore.eventListeners[e],r?(n&&(o=n.remove(r)),o||a(u.ERROR,\"mraid.removeEventListener\",t.error.mraidError.MRD002+\":\"+e)):n&&t.mraidCore.eventListeners.removeAll(),n&&0===n.count&&(t.mraidCore.eventListeners[e]=null,delete t.mraidCore.eventListeners[e])):a(u.ERROR,\"mraid.removeEventListener\",t.error.mraidError.MRD003)},r.getVersion=function(){return s.version.clone()},r.getMaxSize=function(){return s.maxSize.clone()},r.getScreenSize=function(){return s.screenSize.clone()},r.getDefaultPosition=function(){return s.defaultPosition.clone()},r.getCurrentPosition=function(){return s.currentPosition.clone()},r.getExpandProperties=function(){return s.expandProperties.clone()},r.getResizeProperties=function(){return s.resizeProperties.clone()},r.getState=function(){return s.state.clone()},r.getPlacementType=function(){return s.placementType.clone()},r.getOrientationProperties=function(){return s.orientationProperties.clone()},r.setOrientationProperties=function(e){var r;\"object\"==typeof e?(r=[\"setOrientationProperties\",\"allowOrientationChange\",e.allowOrientationChange,\"forceOrientation\",e.forceOrientation],c(e,s.orientationProperties.clone(),\"orientationProperties\")&&(s.orientationProperties.update(e),i.apply(null,r))):(a(u.ERROR,\"mraid.setOrientationProperties\",t.error.mraidError.MRD005),t.mraidBridgeExt&&t.mraidBridgeExt.notifyError(\"MRD005\"))},r.setExpandProperties=function(e){var r={};\"object\"==typeof e?(Object.keys(e).forEach(function(t){\"isModal\"!==t&&(r[t]=e[t])}),c(r,s.expandProperties.clone(),\"expandProperties\")&&s.expandProperties.update(r)):(a(u.ERROR,\"mraid.setExpandProperties\",t.error.mraidError.MRD004),t.mraidBridgeExt&&t.mraidBridgeExt.notifyError(\"MRD004\"))},r.setResizeProperties=function(e){\"object\"==typeof e?c(e,s.resizeProperties.clone(),\"resizeProperties\")&&s.resizeProperties.update(e):(a(u.ERROR,\"mraid.setResizeProperties\",t.error.mraidError.MRD006),t.mraidBridgeExt&&t.mraidBridgeExt.notifyError(\"MRD006\"))},r.open=function(e){e?i(\"open\",\"url\",e):a(u.ERROR,\"mraid.open\",t.error.mraidError.MRD007)},r.close=function(){r.getState()!==d.HIDDEN?i(\"close\"):a(u.ERROR,\"mraid.close\",t.error.mraidError.MRD008)},r.expand=function(e){var r=s.customClose.clone(),n=s.placementType.clone(),o=s.state.clone(),c=[\"expand\",\"useCustomClose\",r];n!==l.INLINE||o!==d.DEFAULT&&o!==d.RESIZED?a(u.ERROR,\"mraid.expand\",t.error.mraidError.MRD011):(e&&(arguments.push(\"url\"),arguments.push(encodeURI(e))),i.apply(null,c))},r.resize=function(){var e=s.resize.clone(),n=[\"resize\"],o=r.getState();o!==d.DEFAULT&&o!==d.RESIZED?(n.push(\"width\"),n.push(e.width),n.push(\"height\"),n.push(e.height),n.push(\"offsetX\"),n.push(e.offsetX),n.push(\"offsetY\"),n.push(e.offsetY),n.push(\"customClosePosition\"),n.push(e.customClosePosition),n.push(\"allowOffscreen\"),n.push(e.allowOffscreen),i.apply(null,n)):a(u.ERROR,\"mraid.resize\",t.error.mraidError.MRD012)},r.supports=function(e){return s.supports.clone()[e]},r.isViewable=function(){return s.isViewable.clone()},r.useCustomClose=function(e){c(e,s.customClose.clone(),\"useCustomClose\")&&c({useCustomClose:e},s.expandProperties.clone(),\"expandProperties\")&&(s.customClose.update(e),s.expandProperties.update({useCustomClose:e}),i(\"useCustomClose\",\"sdkCloseButton\",!0===e?\"invisible\":!1===e?\"visible\":void 0===e?\"gone\":\"\"))},r.playVideo=function(){var e=arguments&&arguments[0]?arguments[0]:\"\",n=arguments&&arguments[1]?arguments[1]:\"\";r.isViewable()?e.length>0?i(\"playVideo\",\"uri\",e,\"captionUrl\",n):a(u.ERROR,\"mraid.playVideo\",t.error.mraidError.MRD009):a(u.ERROR,\"mraid.playVideo\",t.error.mraidError.MRD010)},r.createCalendarEvent=function(){},r.storePicture=function(e){r.isViewable()?e?a(u.ERROR,\"mraid.storePicture\",t.error.mraidError.MRD013):i(\"storePicture\",\"uri\",e):a(u.ERROR,\"mraid.storePicture\",t.error.mraidError.MRD010)},r.getViewable=r.isViewable,n.getConsentRequired=function(){return s.consentRequired.clone()},n.getConsentTitleText=function(){return s.consentTitleText.clone()},n.getConsentBodyText=function(){return s.consentBodyText.clone()},n.getConsentAcceptButtonText=function(){return s.consentAcceptButtonText.clone()},n.getConsentDenyButtonText=function(){return s.consentDenyButtonText.clone()},n.prepareStoreView=function(e){e?i(\"prepareStoreView\",\"appStoreId\",e):a(u.ERROR,\"mraid.prepareStoreView\",t.error.mraidError.MRD016)},n.presentStoreView=function(e){e?i(\"presentStoreView\",\"appStoreId\",e):a(u.ERROR,\"mraid.presentStoreView\",t.error.mraidError.MRD016)},n.prepareStoreOverlayView=function(e,r){if(e&&r){var n=[\"prepareStoreOverlayView\"];n.push(\"appStoreId\"),n.push(e),Object.keys(r).forEach(function(e){n.push(e),n.push(r[e])}),i.apply(null,n)}else a(u.ERROR,\"mraid.prepareStoreOverlayView\",t.error.mraidError.MRD016)},n.presentStoreOverlayView=function(e,r){if(e&&r){var n=[\"presentStoreOverlayView\"];n.push(\"appStoreId\"),n.push(e),Object.keys(r).forEach(function(e){n.push(e),n.push(r[e])}),i.apply(null,n)}else a(u.ERROR,\"mraid.presentStoreOverlayView\",t.error.mraidError.MRD016)},n.dismissStoreOverlayView=function(e){e?i(\"dismissStoreOverlayView\",\"appStoreId\",e):a(u.ERROR,\"mraid.dismissStoreOverlayView\",t.error.mraidError.MRD016)},n.getMraidVersion=function(){return\"v4.5.0\"},n.getOS=function(){return s.os.clone()},n.getOSVersion=function(){return s.osVersion.clone()},n.getSDKVersion=function(){return s.sdkVersion.clone()},n.getIncentivized=function(){return s.incentivized.clone()},n.useCustomPrivacy=function(e){c(e,s.customPrivacy.clone(),\"useCustomPrivacy\")&&(s.customPrivacy.update(e),i(\"useCustomPrivacy\",\"useCustomPrivacy\",e))},r.getConsentRequired=n.getConsentRequired,r.getConsentTitleText=n.getConsentTitleText,r.getConsentBodyText=n.getConsentBodyText,r.getConsentAcceptButtonText=n.getConsentAcceptButtonText,r.getConsentDenyButtonText=n.getConsentDenyButtonText}(window)}]);");
                printWriter.close();
            }
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            File file3 = (File) it.next();
            C24543a aVar2 = new C24543a(cVar.getId(), (String) null, file3.getPath());
            aVar2.f62174h = file3.length();
            aVar2.f62173g = 1;
            aVar2.f62169c = aVar.f62167a;
            aVar2.f62172f = 3;
            this.f58620f.mo58288w(aVar2);
        }
        g.toString();
        List<Class<?>> list2 = C21105j.f52950a;
        aVar.f62172f = 4;
        this.f58620f.mo58289x(aVar, new C23103f(file), true);
    }
}
