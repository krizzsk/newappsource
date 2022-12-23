package com.vungle.warren.downloader;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import ce0.C21105j;
import ce0.C21110n;
import ce0.C21120u;
import com.amazonaws.http.HttpHeader;
import com.appboy.support.StringUtils;
import com.vungle.warren.C23152i;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.downloader.C23112a;
import com.vungle.warren.error.VungleException;
import hi0.C23529c0;
import hi0.C23536e0;
import hi0.C23556q;
import hi0.C23566v;
import hi0.C23571x;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import li0.C24318e;
import li0.C24320g;
import p229r1.C6233c;
import p988j$.util.concurrent.ConcurrentHashMap;
import si0.C24908o;
import si0.C24911r;

@SuppressLint({"LogNotTimber"})
/* renamed from: com.vungle.warren.downloader.d */
public final class C23117d implements Downloader {

    /* renamed from: m */
    public static final long f58674m = TimeUnit.HOURS.toMillis(24);

    /* renamed from: n */
    public static final /* synthetic */ int f58675n = 0;

    /* renamed from: a */
    public final C23128i f58676a;

    /* renamed from: b */
    public final long f58677b;

    /* renamed from: c */
    public final C21110n f58678c;

    /* renamed from: d */
    public final C21120u f58679d;

    /* renamed from: e */
    public final C23566v f58680e;

    /* renamed from: f */
    public final ExecutorService f58681f;

    /* renamed from: g */
    public ConcurrentHashMap f58682g = new ConcurrentHashMap();

    /* renamed from: h */
    public ArrayList f58683h = new ArrayList();

    /* renamed from: i */
    public final Object f58684i = new Object();

    /* renamed from: j */
    public volatile int f58685j = 5;

    /* renamed from: k */
    public boolean f58686k = true;

    /* renamed from: l */
    public final C23120c f58687l = new C23120c();

    /* renamed from: com.vungle.warren.downloader.d$a */
    public class C23118a extends C23123f {

        /* renamed from: f */
        public final /* synthetic */ DownloadRequestMediator f58688f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23118a(DownloadRequestMediator downloadRequestMediator, DownloadRequestMediator downloadRequestMediator2) {
            super(downloadRequestMediator);
            this.f58688f = downloadRequestMediator2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: com.vungle.warren.downloader.DownloadRequestMediator} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v49, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v25, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v6, resolved type: com.vungle.warren.downloader.DownloadRequestMediator} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v53, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v40, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v48, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v59, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v82, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v83, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v39, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v43, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r22v14 */
        /* JADX WARNING: type inference failed for: r22v19 */
        /* JADX WARNING: type inference failed for: r22v24 */
        /* JADX WARNING: type inference failed for: r26v2 */
        /* JADX WARNING: type inference failed for: r22v44 */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        public final void run() {
            /*
                r30 = this;
                r1 = r30
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                r2 = 0
                r0.setRunnable(r2)
                com.vungle.warren.downloader.a$b r3 = new com.vungle.warren.downloader.a$b
                r3.<init>()
                java.lang.System.currentTimeMillis()
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                java.lang.String r4 = r0.url
                java.lang.String r5 = r0.filePath
                java.lang.String r0 = r0.metaPath
                java.io.File r12 = new java.io.File
                r12.<init>(r5)
                java.io.File r5 = new java.io.File
                r5.<init>(r0)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                if (r0 == 0) goto L_0x0039
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                boolean r0 = r0.isCacheable
                if (r0 == 0) goto L_0x0039
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58188h(r12)
            L_0x0039:
                r15 = r2
                r0 = 0
                r14 = 0
                r16 = 0
            L_0x003e:
                if (r0 != 0) goto L_0x0a4e
                int r0 = com.vungle.warren.downloader.C23117d.f58675n
                r9 = 3
                r7 = 2
                r8 = 5
                r6 = 4
                r2 = 1
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x06cf }
                boolean r0 = r0.mo58135is(r2)     // Catch:{ all -> 0x06cf }
                if (r0 != 0) goto L_0x00dc
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x00d9 }
                com.vungle.warren.downloader.DownloadRequestMediator r10 = r1.f58688f     // Catch:{ all -> 0x00d9 }
                java.lang.String unused = r0.getClass()     // Catch:{ all -> 0x00d9 }
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                int r0 = r0.getStatus()
                if (r0 == r7) goto L_0x008c
                if (r0 == r9) goto L_0x0085
                if (r0 == r6) goto L_0x007d
                if (r0 == r8) goto L_0x0075
                if (r16 != 0) goto L_0x008c
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57090B(r0, r2)
                goto L_0x008c
            L_0x0075:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58171W(r15, r2)
                goto L_0x008c
            L_0x007d:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57115y(r0, r12, r2)
                goto L_0x008c
            L_0x0085:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58170V(r2)
            L_0x008c:
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                r0.getStatus()
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.d r10 = com.vungle.warren.downloader.C23117d.this
                monitor-enter(r10)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x00d6 }
                com.vungle.warren.downloader.C23117d.m57091C(r0)     // Catch:{ all -> 0x00d6 }
                monitor-exit(r10)     // Catch:{ all -> 0x00d6 }
                java.util.List<java.lang.Class<?>> r0 = ce0.C21105j.f52950a
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                if (r0 == 0) goto L_0x00d5
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                boolean r0 = r0.isCacheable
                if (r0 == 0) goto L_0x00d5
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58187g(r12)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                boolean r0 = r0.mo58166R()
                if (r0 != 0) goto L_0x00cc
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.clear()
                goto L_0x00d5
            L_0x00cc:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58190j()
            L_0x00d5:
                return
            L_0x00d6:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00d6 }
                throw r0
            L_0x00d9:
                r0 = move-exception
                goto L_0x01f7
            L_0x00dc:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x06cf }
                com.vungle.warren.downloader.DownloadRequestMediator r10 = r1.f58688f     // Catch:{ all -> 0x06cf }
                boolean r0 = r0.mo58165Q(r10)     // Catch:{ all -> 0x06cf }
                if (r0 == 0) goto L_0x06d5
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x06cf }
                r0.setConnected(r2)     // Catch:{ all -> 0x06cf }
                java.io.File r0 = r12.getParentFile()     // Catch:{ all -> 0x06cf }
                if (r0 == 0) goto L_0x0102
                java.io.File r0 = r12.getParentFile()     // Catch:{ all -> 0x00d9 }
                boolean r0 = r0.exists()     // Catch:{ all -> 0x00d9 }
                if (r0 != 0) goto L_0x0102
                java.io.File r0 = r12.getParentFile()     // Catch:{ all -> 0x00d9 }
                r0.mkdirs()     // Catch:{ all -> 0x00d9 }
            L_0x0102:
                boolean r0 = r12.exists()     // Catch:{ all -> 0x06cf }
                r17 = 0
                if (r0 == 0) goto L_0x010f
                long r19 = r12.length()     // Catch:{ all -> 0x00d9 }
                goto L_0x0111
            L_0x010f:
                r19 = r17
            L_0x0111:
                r12.exists()     // Catch:{ all -> 0x06cf }
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x06cf }
                com.vungle.warren.downloader.DownloadRequestMediator r10 = r1.f58688f     // Catch:{ all -> 0x06cf }
                java.lang.String unused = r0.getClass()     // Catch:{ all -> 0x06cf }
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x06cf }
                java.util.HashMap r0 = com.vungle.warren.downloader.C23117d.m57095G(r0, r5)     // Catch:{ all -> 0x06cf }
                com.vungle.warren.downloader.d r10 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x06cf }
                com.vungle.warren.downloader.DownloadRequestMediator r11 = r1.f58688f     // Catch:{ all -> 0x06cf }
                boolean r10 = com.vungle.warren.downloader.C23117d.m57096H(r10, r11, r12, r0)     // Catch:{ all -> 0x06cf }
                if (r10 == 0) goto L_0x0200
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x00d9 }
                java.lang.String r0 = r0.key     // Catch:{ all -> 0x00d9 }
                java.util.List<java.lang.Class<?>> r10 = ce0.C21105j.f52950a     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x013a
                java.lang.String r10 = ".mp4"
                boolean r0 = r0.endsWith(r10)     // Catch:{ all -> 0x00d9 }
                goto L_0x013b
            L_0x013a:
                r0 = 0
            L_0x013b:
                if (r0 == 0) goto L_0x0171
                com.vungle.warren.n1 r0 = com.vungle.warren.C23181n1.m57208b()     // Catch:{ all -> 0x00d9 }
                ag.i r10 = new ag.i     // Catch:{ all -> 0x00d9 }
                r10.<init>()     // Catch:{ all -> 0x00d9 }
                com.vungle.warren.session.SessionEvent r11 = com.vungle.warren.session.SessionEvent.ADS_CACHED     // Catch:{ all -> 0x00d9 }
                java.lang.String r2 = r11.toString()     // Catch:{ all -> 0x00d9 }
                java.lang.String r13 = "event"
                r10.mo40349F(r13, r2)     // Catch:{ all -> 0x00d9 }
                com.vungle.warren.session.SessionAttribute r2 = com.vungle.warren.session.SessionAttribute.URL     // Catch:{ all -> 0x00d9 }
                com.vungle.warren.downloader.DownloadRequestMediator r13 = r1.f58688f     // Catch:{ all -> 0x00d9 }
                java.lang.String r13 = r13.key     // Catch:{ all -> 0x00d9 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d9 }
                r10.mo40349F(r2, r13)     // Catch:{ all -> 0x00d9 }
                com.vungle.warren.session.SessionAttribute r2 = com.vungle.warren.session.SessionAttribute.VIDEO_CACHED     // Catch:{ all -> 0x00d9 }
                java.lang.String r13 = "cached"
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d9 }
                r10.mo40349F(r2, r13)     // Catch:{ all -> 0x00d9 }
                od0.q r2 = new od0.q     // Catch:{ all -> 0x00d9 }
                r2.<init>((com.vungle.warren.session.SessionEvent) r11, (p359ag.C13452i) r10)     // Catch:{ all -> 0x00d9 }
                r0.mo58250d(r2)     // Catch:{ all -> 0x00d9 }
            L_0x0171:
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x00d9 }
                r0.set(r6)     // Catch:{ all -> 0x00d9 }
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                int r0 = r0.getStatus()
                if (r0 == r7) goto L_0x01ac
                if (r0 == r9) goto L_0x01a5
                if (r0 == r6) goto L_0x019d
                if (r0 == r8) goto L_0x0195
                if (r16 != 0) goto L_0x01ac
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57090B(r0, r2)
                goto L_0x01ac
            L_0x0195:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58171W(r15, r2)
                goto L_0x01ac
            L_0x019d:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57115y(r0, r12, r2)
                goto L_0x01ac
            L_0x01a5:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58170V(r2)
            L_0x01ac:
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                r0.getStatus()
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                monitor-enter(r2)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x01f4 }
                com.vungle.warren.downloader.C23117d.m57091C(r0)     // Catch:{ all -> 0x01f4 }
                monitor-exit(r2)     // Catch:{ all -> 0x01f4 }
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                if (r0 == 0) goto L_0x01f3
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                boolean r0 = r0.isCacheable
                if (r0 == 0) goto L_0x01f3
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58187g(r12)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                boolean r0 = r0.mo58166R()
                if (r0 != 0) goto L_0x01ea
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.clear()
                goto L_0x01f3
            L_0x01ea:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58190j()
            L_0x01f3:
                return
            L_0x01f4:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x01f4 }
                throw r0
            L_0x01f7:
                r22 = r4
                r11 = r14
                r2 = 0
                r6 = 0
                r10 = -1
            L_0x01fd:
                r13 = 0
                goto L_0x0359
            L_0x0200:
                java.lang.String r2 = "ttDownloadContext"
                java.lang.String r10 = "Send network request: %1$s, at: %2$d"
                java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x06cf }
                r13 = 0
                r11[r13] = r4     // Catch:{ all -> 0x06cf }
                long r22 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x06cf }
                java.lang.Long r13 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x06cf }
                r22 = 1
                r11[r22] = r13     // Catch:{ all -> 0x06cf }
                java.lang.String r10 = java.lang.String.format(r10, r11)     // Catch:{ all -> 0x06cf }
                com.vungle.warren.VungleLogger.m57031d(r2, r10)     // Catch:{ all -> 0x06cf }
                hi0.x$a r2 = new hi0.x$a     // Catch:{ all -> 0x06cf }
                r2.<init>()     // Catch:{ all -> 0x06cf }
                r2.mo58731e(r4)     // Catch:{ all -> 0x06cf }
                com.vungle.warren.downloader.d r10 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x06cf }
                r13 = 4
                r6 = r10
                r10 = 5
                r11 = 2
                r7 = r19
                r9 = r12
                r10 = r0
                r13 = 10
                r11 = r2
                com.vungle.warren.downloader.C23117d.m57097I(r6, r7, r9, r10, r11)     // Catch:{ all -> 0x06ca }
                com.vungle.warren.downloader.d r6 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x06ca }
                hi0.v r6 = r6.f58680e     // Catch:{ all -> 0x06ca }
                hi0.x r2 = r2.mo58727a()     // Catch:{ all -> 0x06ca }
                hi0.w r2 = r6.mo58647a(r2)     // Catch:{ all -> 0x06ca }
                hi0.c0 r6 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r2)     // Catch:{ all -> 0x06c3 }
                com.vungle.warren.downloader.d r7 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x06bc }
                long r7 = com.vungle.warren.downloader.C23117d.m57102l(r7, r6)     // Catch:{ all -> 0x06bc }
                r6.getClass()     // Catch:{ all -> 0x06bc }
                com.vungle.warren.downloader.DownloadRequestMediator r9 = r1.f58688f     // Catch:{ all -> 0x06bc }
                java.util.Objects.toString(r9)     // Catch:{ all -> 0x06bc }
                int r10 = r6.mo58640q()     // Catch:{ all -> 0x06bc }
                com.vungle.warren.downloader.d r9 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x05e4 }
                com.vungle.warren.downloader.DownloadRequestMediator r11 = r1.f58688f     // Catch:{ all -> 0x05e4 }
                boolean r9 = com.vungle.warren.downloader.C23117d.m57103m(r9, r12, r6, r11, r0)     // Catch:{ all -> 0x05e4 }
                if (r9 != 0) goto L_0x05ec
                com.vungle.warren.downloader.d r9 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x05e4 }
                com.vungle.warren.downloader.DownloadRequestMediator r11 = r1.f58688f     // Catch:{ all -> 0x05e4 }
                boolean r9 = com.vungle.warren.downloader.C23117d.m57104n(r9, r11, r12, r0, r10)     // Catch:{ all -> 0x05e4 }
                if (r9 == 0) goto L_0x026e
                goto L_0x05ec
            L_0x026e:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x05e4 }
                com.vungle.warren.downloader.DownloadRequestMediator r9 = r1.f58688f     // Catch:{ all -> 0x05e4 }
                r21 = r0
                r22 = r19
                r24 = r10
                r25 = r6
                r26 = r9
                boolean r0 = com.vungle.warren.downloader.C23117d.m57105o(r21, r22, r24, r25, r26)     // Catch:{ all -> 0x05e4 }
                if (r0 == 0) goto L_0x02de
                int r7 = r14 + 1
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x02db }
                r0.getClass()     // Catch:{ all -> 0x02db }
                if (r14 >= r13) goto L_0x02c4
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x02db }
                r8 = 0
                r0.mo58162N(r12, r5, r8)     // Catch:{ all -> 0x02db }
                hi0.e0 r0 = r6.mo58638e()
                if (r0 == 0) goto L_0x029e
                hi0.e0 r0 = r6.mo58638e()
                r0.close()
            L_0x029e:
                r2.mo58719f()
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.d r8 = com.vungle.warren.downloader.C23117d.this
                monitor-enter(r8)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x02c1 }
                com.vungle.warren.downloader.C23117d.m57091C(r0)     // Catch:{ all -> 0x02c1 }
                monitor-exit(r8)     // Catch:{ all -> 0x02c1 }
                java.util.List<java.lang.Class<?>> r0 = ce0.C21105j.f52950a
                r22 = r4
                r14 = r7
                r0 = 0
                r9 = 0
                goto L_0x0993
            L_0x02c1:
                r0 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x02c1 }
                throw r0
            L_0x02c4:
                com.vungle.warren.downloader.Downloader$RequestException r0 = new com.vungle.warren.downloader.Downloader$RequestException     // Catch:{ all -> 0x02db }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x02db }
                r8.<init>()     // Catch:{ all -> 0x02db }
                java.lang.String r9 = "Code: "
                r8.append(r9)     // Catch:{ all -> 0x02db }
                r8.append(r10)     // Catch:{ all -> 0x02db }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x02db }
                r0.<init>(r8)     // Catch:{ all -> 0x02db }
                throw r0     // Catch:{ all -> 0x02db }
            L_0x02db:
                r0 = move-exception
                r14 = r7
                goto L_0x02f2
            L_0x02de:
                boolean r0 = r6.mo58644v()     // Catch:{ all -> 0x05e4 }
                if (r0 == 0) goto L_0x05c2
                r0 = 206(0xce, float:2.89E-43)
                if (r10 == r0) goto L_0x02fa
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x02f1 }
                r9 = 0
                r0.mo58162N(r12, r5, r9)     // Catch:{ all -> 0x02f1 }
                r19 = r17
                goto L_0x02fa
            L_0x02f1:
                r0 = move-exception
            L_0x02f2:
                r22 = r4
                r4 = 0
                r7 = 2
                r8 = 3
                r9 = 5
                goto L_0x06ff
            L_0x02fa:
                ce0.C21105j.m49398c(r5)     // Catch:{ all -> 0x05b8 }
                hi0.q r0 = r6.mo58642t()     // Catch:{ all -> 0x05b8 }
                com.vungle.warren.downloader.d r9 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x05b8 }
                com.vungle.warren.downloader.C23117d.m57107q(r9, r12, r5, r0)     // Catch:{ all -> 0x05b8 }
                com.vungle.warren.downloader.d r9 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x05b8 }
                java.util.HashMap r0 = com.vungle.warren.downloader.C23117d.m57108r(r9, r5, r0, r4)     // Catch:{ all -> 0x05b8 }
                boolean r9 = li0.C24318e.m61057b(r6)     // Catch:{ all -> 0x05b8 }
                if (r9 == 0) goto L_0x0598
                com.vungle.warren.downloader.d r9 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x05b8 }
                com.vungle.warren.downloader.i r9 = r9.f58676a     // Catch:{ all -> 0x05b8 }
                if (r9 == 0) goto L_0x0331
                com.vungle.warren.downloader.d r9 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x032b }
                com.vungle.warren.downloader.i r9 = r9.f58676a     // Catch:{ all -> 0x032b }
                r11 = r14
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0329 }
                r9.mo58184d(r12, r13)     // Catch:{ all -> 0x0329 }
                goto L_0x0332
            L_0x0329:
                r0 = move-exception
                goto L_0x032d
            L_0x032b:
                r0 = move-exception
                r11 = r14
            L_0x032d:
                r22 = r4
                goto L_0x01fd
            L_0x0331:
                r11 = r14
            L_0x0332:
                com.vungle.warren.downloader.d r9 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x058e }
                hi0.e0 r9 = com.vungle.warren.downloader.C23117d.m57109s(r9, r6)     // Catch:{ all -> 0x058e }
                si0.i r13 = r9.mo53600t()     // Catch:{ all -> 0x058e }
                com.vungle.warren.downloader.d r14 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0585 }
                r22 = r4
                com.vungle.warren.downloader.DownloadRequestMediator r4 = r1.f58688f     // Catch:{ all -> 0x057d }
                java.lang.String unused = r14.getClass()     // Catch:{ all -> 0x057d }
                long r7 = r7 + r19
                int r4 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
                if (r4 != 0) goto L_0x0360
                java.util.logging.Logger r4 = si0.C24912s.f62972a     // Catch:{ all -> 0x0358 }
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0358 }
                r14 = 0
                r4.<init>(r12, r14)     // Catch:{ all -> 0x0358 }
                si0.u r4 = si0.C24911r.m62550f(r4)     // Catch:{ all -> 0x0358 }
                goto L_0x0364
            L_0x0358:
                r0 = move-exception
            L_0x0359:
                r14 = r11
                r4 = 0
            L_0x035b:
                r7 = 2
                r8 = 3
                r9 = 5
                goto L_0x0700
            L_0x0360:
                si0.u r4 = si0.C24911r.m62545a(r12)     // Catch:{ all -> 0x057d }
            L_0x0364:
                si0.w r4 = si0.C24911r.m62546b(r4)     // Catch:{ all -> 0x057d }
                r9.mo53598i()     // Catch:{ all -> 0x0574 }
                com.vungle.warren.downloader.d r9 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0574 }
                com.vungle.warren.downloader.DownloadRequestMediator r14 = r1.f58688f     // Catch:{ all -> 0x0574 }
                com.vungle.warren.downloader.C23117d.m57110t(r9, r14, r3)     // Catch:{ all -> 0x0574 }
                r23 = r17
                r9 = 0
            L_0x0375:
                com.vungle.warren.downloader.DownloadRequestMediator r14 = r1.f58688f     // Catch:{ all -> 0x0574 }
                r25 = r9
                r9 = 1
                boolean r14 = r14.mo58135is(r9)     // Catch:{ all -> 0x0574 }
                if (r14 == 0) goto L_0x042a
                si0.f r9 = r4.mo61377D()     // Catch:{ all -> 0x0422 }
                r26 = r10
                r14 = r11
                r10 = 2048(0x800, double:1.0118E-320)
                long r9 = r13.mo53601m(r9, r10)     // Catch:{ all -> 0x0420 }
                r28 = -1
                int r11 = (r9 > r28 ? 1 : (r9 == r28 ? 0 : -1))
                if (r11 == 0) goto L_0x042d
                boolean r11 = r12.exists()     // Catch:{ all -> 0x0420 }
                if (r11 == 0) goto L_0x0407
                r4.mo61458e()     // Catch:{ all -> 0x0420 }
                long r23 = r23 + r9
                long r9 = r19 + r23
                r28 = 100
                int r11 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
                if (r11 <= 0) goto L_0x03ac
                long r9 = r9 * r28
                long r9 = r9 / r7
                int r10 = (int) r9     // Catch:{ all -> 0x0420 }
                r9 = r10
                goto L_0x03ae
            L_0x03ac:
                r9 = r25
            L_0x03ae:
                com.vungle.warren.downloader.DownloadRequestMediator r10 = r1.f58688f     // Catch:{ all -> 0x0420 }
                boolean r10 = r10.isConnected()     // Catch:{ all -> 0x0420 }
                if (r10 == 0) goto L_0x03e6
            L_0x03b6:
                int r10 = r3.f58667a     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.d r11 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0420 }
                int r11 = r11.f58685j     // Catch:{ all -> 0x0420 }
                int r10 = r10 + r11
                if (r10 > r9) goto L_0x03e2
                int r10 = r3.f58667a     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.d r11 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0420 }
                int r11 = r11.f58685j     // Catch:{ all -> 0x0420 }
                int r10 = r10 + r11
                long r10 = (long) r10     // Catch:{ all -> 0x0420 }
                int r25 = (r10 > r28 ? 1 : (r10 == r28 ? 0 : -1))
                if (r25 > 0) goto L_0x03e2
                int r10 = r3.f58667a     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.d r11 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0420 }
                int r11 = r11.f58685j     // Catch:{ all -> 0x0420 }
                int r10 = r10 + r11
                r3.f58667a = r10     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.d r10 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.DownloadRequestMediator r11 = r1.f58688f     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.C23117d.m57110t(r10, r11, r3)     // Catch:{ all -> 0x0420 }
                goto L_0x03b6
            L_0x03e2:
                r11 = r14
                r10 = r26
                goto L_0x0375
            L_0x03e6:
                java.lang.String r0 = "AssetDownloader#load; loadAd sequence"
                java.lang.String r7 = "mediator %s is not connected"
                r8 = 1
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.d r8 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.DownloadRequestMediator r10 = r1.f58688f     // Catch:{ all -> 0x0420 }
                java.lang.String r8 = r8.getClass()     // Catch:{ all -> 0x0420 }
                r10 = 0
                r9[r10] = r8     // Catch:{ all -> 0x0420 }
                java.lang.String r7 = java.lang.String.format(r7, r9)     // Catch:{ all -> 0x0420 }
                com.vungle.warren.VungleLogger.m57029b(r0, r7)     // Catch:{ all -> 0x0420 }
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0420 }
                java.lang.String r7 = "Request is not connected"
                r0.<init>(r7)     // Catch:{ all -> 0x0420 }
                throw r0     // Catch:{ all -> 0x0420 }
            L_0x0407:
                java.lang.String r0 = "AssetDownloader#load; loadAd sequence"
                java.lang.String r7 = "file %s does not exist"
                r8 = 1
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0420 }
                r8 = 0
                r9[r8] = r12     // Catch:{ all -> 0x0420 }
                java.lang.String r7 = java.lang.String.format(r7, r9)     // Catch:{ all -> 0x0420 }
                com.vungle.warren.VungleLogger.m57029b(r0, r7)     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.Downloader$RequestException r0 = new com.vungle.warren.downloader.Downloader$RequestException     // Catch:{ all -> 0x0420 }
                java.lang.String r7 = "File is not existing"
                r0.<init>(r7)     // Catch:{ all -> 0x0420 }
                throw r0     // Catch:{ all -> 0x0420 }
            L_0x0420:
                r0 = move-exception
                goto L_0x0426
            L_0x0422:
                r0 = move-exception
                r26 = r10
                r14 = r11
            L_0x0426:
                r10 = r26
                goto L_0x035b
            L_0x042a:
                r26 = r10
                r14 = r11
            L_0x042d:
                r4.flush()     // Catch:{ all -> 0x056f }
                com.vungle.warren.downloader.DownloadRequestMediator r7 = r1.f58688f     // Catch:{ all -> 0x056f }
                r8 = 1
                boolean r7 = r7.mo58135is(r8)     // Catch:{ all -> 0x056f }
                if (r7 == 0) goto L_0x04bf
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0420 }
                java.lang.String r9 = "DOWNLOAD_COMPLETE"
                java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0420 }
                java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0420 }
                r0.put(r9, r10)     // Catch:{ all -> 0x0420 }
                java.lang.String r9 = "Last-Cache-Verification"
                java.lang.String r10 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0420 }
                r0.put(r9, r10)     // Catch:{ all -> 0x0420 }
                java.lang.String r9 = "Last-Download"
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0420 }
                r0.put(r9, r7)     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.d r7 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0420 }
                r7.getClass()     // Catch:{ all -> 0x0420 }
                java.lang.String r7 = r5.getPath()     // Catch:{ all -> 0x0420 }
                java.util.List<java.lang.Class<?>> r8 = ce0.C21105j.f52950a     // Catch:{ all -> 0x0420 }
                java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0420 }
                r8.<init>(r7)     // Catch:{ all -> 0x0420 }
                boolean r7 = r0.isEmpty()     // Catch:{ all -> 0x0420 }
                if (r7 == 0) goto L_0x0471
                goto L_0x0474
            L_0x0471:
                ce0.C21105j.m49401f(r8, r0)     // Catch:{ all -> 0x0420 }
            L_0x0474:
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x0420 }
                java.lang.String r0 = r0.key     // Catch:{ all -> 0x0420 }
                if (r0 == 0) goto L_0x0481
                java.lang.String r7 = ".mp4"
                boolean r0 = r0.endsWith(r7)     // Catch:{ all -> 0x0420 }
                goto L_0x0482
            L_0x0481:
                r0 = 0
            L_0x0482:
                if (r0 == 0) goto L_0x04b8
                com.vungle.warren.n1 r0 = com.vungle.warren.C23181n1.m57208b()     // Catch:{ all -> 0x0420 }
                ag.i r7 = new ag.i     // Catch:{ all -> 0x0420 }
                r7.<init>()     // Catch:{ all -> 0x0420 }
                com.vungle.warren.session.SessionEvent r8 = com.vungle.warren.session.SessionEvent.ADS_CACHED     // Catch:{ all -> 0x0420 }
                java.lang.String r9 = r8.toString()     // Catch:{ all -> 0x0420 }
                java.lang.String r10 = "event"
                r7.mo40349F(r10, r9)     // Catch:{ all -> 0x0420 }
                com.vungle.warren.session.SessionAttribute r9 = com.vungle.warren.session.SessionAttribute.URL     // Catch:{ all -> 0x0420 }
                com.vungle.warren.downloader.DownloadRequestMediator r10 = r1.f58688f     // Catch:{ all -> 0x0420 }
                java.lang.String r10 = r10.key     // Catch:{ all -> 0x0420 }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0420 }
                r7.mo40349F(r9, r10)     // Catch:{ all -> 0x0420 }
                com.vungle.warren.session.SessionAttribute r9 = com.vungle.warren.session.SessionAttribute.VIDEO_CACHED     // Catch:{ all -> 0x0420 }
                java.lang.String r10 = "cdn"
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0420 }
                r7.mo40349F(r9, r10)     // Catch:{ all -> 0x0420 }
                od0.q r9 = new od0.q     // Catch:{ all -> 0x0420 }
                r9.<init>((com.vungle.warren.session.SessionEvent) r8, (p359ag.C13452i) r7)     // Catch:{ all -> 0x0420 }
                r0.mo58250d(r9)     // Catch:{ all -> 0x0420 }
            L_0x04b8:
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x0420 }
                r7 = 4
                r0.set(r7)     // Catch:{ all -> 0x0420 }
                goto L_0x04cd
            L_0x04bf:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x056d }
                com.vungle.warren.downloader.DownloadRequestMediator r7 = r1.f58688f     // Catch:{ all -> 0x056d }
                com.vungle.warren.downloader.C23117d.m57110t(r0, r7, r3)     // Catch:{ all -> 0x056d }
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x056d }
                com.vungle.warren.downloader.DownloadRequestMediator r7 = r1.f58688f     // Catch:{ all -> 0x056d }
                java.lang.String unused = r0.getClass()     // Catch:{ all -> 0x056d }
            L_0x04cd:
                hi0.e0 r0 = r6.mo58638e()
                if (r0 == 0) goto L_0x04da
                hi0.e0 r0 = r6.mo58638e()
                r0.close()
            L_0x04da:
                r2.mo58719f()
                int r0 = com.vungle.warren.downloader.C23117d.f58675n
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                int r0 = r0.getStatus()
                r7 = 2
                if (r0 == r7) goto L_0x0519
                r8 = 3
                if (r0 == r8) goto L_0x0512
                r2 = 4
                if (r0 == r2) goto L_0x050a
                r9 = 5
                if (r0 == r9) goto L_0x0502
                if (r16 != 0) goto L_0x0519
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57090B(r0, r2)
                goto L_0x0519
            L_0x0502:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58171W(r15, r2)
                goto L_0x0519
            L_0x050a:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57115y(r0, r12, r2)
                goto L_0x0519
            L_0x0512:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58170V(r2)
            L_0x0519:
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                r0.getStatus()
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.d r10 = com.vungle.warren.downloader.C23117d.this
                monitor-enter(r10)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x056a }
                com.vungle.warren.downloader.C23117d.m57091C(r0)     // Catch:{ all -> 0x056a }
                monitor-exit(r10)     // Catch:{ all -> 0x056a }
                ce0.C21105j.m49396a(r4)
                ce0.C21105j.m49396a(r13)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                if (r0 == 0) goto L_0x0566
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                boolean r0 = r0.isCacheable
                if (r0 == 0) goto L_0x0566
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58187g(r12)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                boolean r0 = r0.mo58166R()
                if (r0 != 0) goto L_0x055d
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.clear()
                goto L_0x0566
            L_0x055d:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58190j()
            L_0x0566:
                r2 = 1
                r9 = 0
                goto L_0x0992
            L_0x056a:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x056a }
                throw r0
            L_0x056d:
                r0 = move-exception
                goto L_0x0570
            L_0x056f:
                r0 = move-exception
            L_0x0570:
                r7 = 2
                r8 = 3
                r9 = 5
                goto L_0x0579
            L_0x0574:
                r0 = move-exception
                r26 = r10
                r14 = r11
                goto L_0x0570
            L_0x0579:
                r10 = r26
                goto L_0x0700
            L_0x057d:
                r0 = move-exception
            L_0x057e:
                r26 = r10
                r14 = r11
                r7 = 2
                r8 = 3
                r9 = 5
                goto L_0x0589
            L_0x0585:
                r0 = move-exception
                r22 = r4
                goto L_0x057e
            L_0x0589:
                r10 = r26
                r4 = 0
                goto L_0x0700
            L_0x058e:
                r0 = move-exception
                r22 = r4
                r26 = r10
                r14 = r11
            L_0x0594:
                r7 = 2
                r8 = 3
                r9 = 5
                goto L_0x05be
            L_0x0598:
                r22 = r4
                r26 = r10
                r7 = 2
                r8 = 3
                r9 = 5
                java.lang.String r0 = "AssetDownloader#load; loadAd sequence"
                java.lang.String r4 = "response has no body %s"
                r10 = 1
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x05e2 }
                r10 = 0
                r11[r10] = r6     // Catch:{ all -> 0x05e2 }
                java.lang.String r4 = java.lang.String.format(r4, r11)     // Catch:{ all -> 0x05e2 }
                com.vungle.warren.VungleLogger.m57029b(r0, r4)     // Catch:{ all -> 0x05e2 }
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x05e2 }
                java.lang.String r4 = "Response body is null"
                r0.<init>(r4)     // Catch:{ all -> 0x05e2 }
                throw r0     // Catch:{ all -> 0x05e2 }
            L_0x05b8:
                r0 = move-exception
                r22 = r4
                r26 = r10
                goto L_0x0594
            L_0x05be:
                r10 = r26
                goto L_0x06ba
            L_0x05c2:
                r22 = r4
                r26 = r10
                r7 = 2
                r8 = 3
                r9 = 5
                com.vungle.warren.downloader.Downloader$RequestException r0 = new com.vungle.warren.downloader.Downloader$RequestException     // Catch:{ all -> 0x05e2 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e2 }
                r4.<init>()     // Catch:{ all -> 0x05e2 }
                java.lang.String r10 = "Code: "
                r4.append(r10)     // Catch:{ all -> 0x05e2 }
                r10 = r26
                r4.append(r10)     // Catch:{ all -> 0x061d }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x061d }
                r0.<init>(r4)     // Catch:{ all -> 0x061d }
                throw r0     // Catch:{ all -> 0x061d }
            L_0x05e2:
                r0 = move-exception
                goto L_0x05be
            L_0x05e4:
                r0 = move-exception
                r22 = r4
                r7 = 2
                r8 = 3
                r9 = 5
                goto L_0x06ba
            L_0x05ec:
                r22 = r4
                r7 = 2
                r8 = 3
                r9 = 5
                r4 = 304(0x130, float:4.26E-43)
                if (r10 != r4) goto L_0x0620
                java.lang.String r4 = "Last-Cache-Verification"
                long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x061d }
                java.lang.String r11 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x061d }
                r0.put(r4, r11)     // Catch:{ all -> 0x061d }
                com.vungle.warren.downloader.d r4 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x061d }
                r4.getClass()     // Catch:{ all -> 0x061d }
                java.lang.String r4 = r5.getPath()     // Catch:{ all -> 0x061d }
                java.util.List<java.lang.Class<?>> r11 = ce0.C21105j.f52950a     // Catch:{ all -> 0x061d }
                java.io.File r11 = new java.io.File     // Catch:{ all -> 0x061d }
                r11.<init>(r4)     // Catch:{ all -> 0x061d }
                boolean r4 = r0.isEmpty()     // Catch:{ all -> 0x061d }
                if (r4 == 0) goto L_0x0619
                goto L_0x0620
            L_0x0619:
                ce0.C21105j.m49401f(r11, r0)     // Catch:{ all -> 0x061d }
                goto L_0x0620
            L_0x061d:
                r0 = move-exception
                goto L_0x06ba
            L_0x0620:
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x061d }
                r4 = 4
                r0.set(r4)     // Catch:{ all -> 0x061d }
                hi0.e0 r0 = r6.mo58638e()
                if (r0 == 0) goto L_0x0633
                hi0.e0 r0 = r6.mo58638e()
                r0.close()
            L_0x0633:
                r2.mo58719f()
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                int r0 = r0.getStatus()
                if (r0 == r7) goto L_0x066d
                if (r0 == r8) goto L_0x0666
                r2 = 4
                if (r0 == r2) goto L_0x065e
                if (r0 == r9) goto L_0x0656
                if (r16 != 0) goto L_0x066d
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57090B(r0, r2)
                goto L_0x066d
            L_0x0656:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58171W(r15, r2)
                goto L_0x066d
            L_0x065e:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57115y(r0, r12, r2)
                goto L_0x066d
            L_0x0666:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58170V(r2)
            L_0x066d:
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                r0.getStatus()
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.d r4 = com.vungle.warren.downloader.C23117d.this
                monitor-enter(r4)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x06b7 }
                com.vungle.warren.downloader.C23117d.m57091C(r0)     // Catch:{ all -> 0x06b7 }
                monitor-exit(r4)     // Catch:{ all -> 0x06b7 }
                java.util.List<java.lang.Class<?>> r0 = ce0.C21105j.f52950a
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                if (r0 == 0) goto L_0x06b6
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                boolean r0 = r0.isCacheable
                if (r0 == 0) goto L_0x06b6
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58187g(r12)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                boolean r0 = r0.mo58166R()
                if (r0 != 0) goto L_0x06ad
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.clear()
                goto L_0x06b6
            L_0x06ad:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58190j()
            L_0x06b6:
                return
            L_0x06b7:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x06b7 }
                throw r0
            L_0x06ba:
                r4 = 0
                goto L_0x06ff
            L_0x06bc:
                r0 = move-exception
                r22 = r4
                r7 = 2
                r8 = 3
                r9 = 5
                goto L_0x06fd
            L_0x06c3:
                r0 = move-exception
                r22 = r4
                r7 = 2
                r8 = 3
                r9 = 5
                goto L_0x06fc
            L_0x06ca:
                r0 = move-exception
                r22 = r4
                r7 = 2
                goto L_0x06d2
            L_0x06cf:
                r0 = move-exception
                r22 = r4
            L_0x06d2:
                r8 = 3
                r9 = 5
                goto L_0x06fb
            L_0x06d5:
                r22 = r4
                r8 = 3
                r9 = 5
                java.lang.String r0 = "AssetDownloader#load; loadAd sequence"
                java.lang.String r2 = "No connected to required network requests in %s"
                r4 = 1
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x06fa }
                com.vungle.warren.downloader.d r4 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x06fa }
                com.vungle.warren.downloader.DownloadRequestMediator r10 = r1.f58688f     // Catch:{ all -> 0x06fa }
                java.lang.String r4 = r4.getClass()     // Catch:{ all -> 0x06fa }
                r10 = 0
                r6[r10] = r4     // Catch:{ all -> 0x06fa }
                java.lang.String r2 = java.lang.String.format(r2, r6)     // Catch:{ all -> 0x06fa }
                com.vungle.warren.VungleLogger.m57032e(r0, r2)     // Catch:{ all -> 0x06fa }
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x06fa }
                java.lang.String r2 = "Not connected to correct network"
                r0.<init>(r2)     // Catch:{ all -> 0x06fa }
                throw r0     // Catch:{ all -> 0x06fa }
            L_0x06fa:
                r0 = move-exception
            L_0x06fb:
                r2 = 0
            L_0x06fc:
                r6 = 0
            L_0x06fd:
                r4 = 0
                r10 = -1
            L_0x06ff:
                r13 = 0
            L_0x0700:
                java.lang.String r11 = "AssetDownloader#load; loadAd sequence"
                java.lang.String r9 = "exception, cannot load due to %1$s, state is %2$s"
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x099b }
                r17 = 0
                r8[r17] = r0     // Catch:{ all -> 0x099b }
                com.vungle.warren.downloader.d r7 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x099b }
                r17 = r14
                com.vungle.warren.downloader.DownloadRequestMediator r14 = r1.f58688f     // Catch:{ all -> 0x099b }
                java.lang.String r7 = r7.getClass()     // Catch:{ all -> 0x099b }
                r14 = 1
                r8[r14] = r7     // Catch:{ all -> 0x099b }
                java.lang.String r7 = java.lang.String.format(r9, r8)     // Catch:{ all -> 0x099b }
                com.vungle.warren.VungleLogger.m57029b(r11, r7)     // Catch:{ all -> 0x099b }
                com.vungle.warren.downloader.DownloadRequestMediator r7 = r1.f58688f     // Catch:{ all -> 0x099b }
                r8 = 3
                boolean r7 = r7.mo58135is(r8)     // Catch:{ all -> 0x099b }
                if (r7 != 0) goto L_0x072d
                com.vungle.warren.downloader.DownloadRequestMediator r7 = r1.f58688f     // Catch:{ all -> 0x099b }
                r8 = 5
                r7.set(r8)     // Catch:{ all -> 0x099b }
            L_0x072d:
                boolean r7 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x099b }
                if (r7 == 0) goto L_0x08c3
                com.vungle.warren.downloader.d r7 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x099b }
                com.vungle.warren.downloader.DownloadRequestMediator r8 = r1.f58688f     // Catch:{ all -> 0x099b }
                boolean r7 = r7.mo58165Q(r8)     // Catch:{ all -> 0x099b }
                if (r7 != 0) goto L_0x07fa
                if (r6 != 0) goto L_0x07fa
                com.vungle.warren.downloader.d r8 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x099b }
                com.vungle.warren.downloader.DownloadRequestMediator r9 = r1.f58688f     // Catch:{ all -> 0x099b }
                java.util.HashMap r11 = com.vungle.warren.downloader.C23117d.m57095G(r8, r5)     // Catch:{ all -> 0x099b }
                r14 = -1
                boolean r8 = com.vungle.warren.downloader.C23117d.m57104n(r8, r9, r12, r11, r14)     // Catch:{ all -> 0x099b }
                if (r8 == 0) goto L_0x07fa
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x099b }
                r3 = 3
                boolean r0 = r0.mo58135is(r3)     // Catch:{ all -> 0x099b }
                if (r0 != 0) goto L_0x075b
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x099b }
                r3 = 4
                r0.set(r3)     // Catch:{ all -> 0x099b }
            L_0x075b:
                if (r6 == 0) goto L_0x076a
                hi0.e0 r0 = r6.mo58638e()
                if (r0 == 0) goto L_0x076a
                hi0.e0 r0 = r6.mo58638e()
                r0.close()
            L_0x076a:
                if (r2 == 0) goto L_0x076f
                r2.mo58719f()
            L_0x076f:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                int r0 = r0.getStatus()
                r2 = 2
                if (r0 == r2) goto L_0x07a9
                r2 = 3
                if (r0 == r2) goto L_0x07a2
                r2 = 4
                if (r0 == r2) goto L_0x079a
                r2 = 5
                if (r0 == r2) goto L_0x0792
                if (r16 != 0) goto L_0x07a9
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57090B(r0, r2)
                goto L_0x07a9
            L_0x0792:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58171W(r15, r2)
                goto L_0x07a9
            L_0x079a:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57115y(r0, r12, r2)
                goto L_0x07a9
            L_0x07a2:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58170V(r2)
            L_0x07a9:
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                r0.getStatus()
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                com.vungle.warren.downloader.d r3 = com.vungle.warren.downloader.C23117d.this
                monitor-enter(r3)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x07f7 }
                com.vungle.warren.downloader.C23117d.m57091C(r0)     // Catch:{ all -> 0x07f7 }
                monitor-exit(r3)     // Catch:{ all -> 0x07f7 }
                ce0.C21105j.m49396a(r4)
                ce0.C21105j.m49396a(r13)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                if (r0 == 0) goto L_0x07f6
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                boolean r0 = r0.isCacheable
                if (r0 == 0) goto L_0x07f6
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58187g(r12)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                boolean r0 = r0.mo58166R()
                if (r0 != 0) goto L_0x07ed
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.clear()
                goto L_0x07f6
            L_0x07ed:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58190j()
            L_0x07f6:
                return
            L_0x07f7:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x07f7 }
                throw r0
            L_0x07fa:
                com.vungle.warren.downloader.DownloadRequestMediator r8 = r1.f58688f     // Catch:{ all -> 0x099b }
                r8.setConnected(r7)     // Catch:{ all -> 0x099b }
                com.vungle.warren.downloader.a$a r8 = new com.vungle.warren.downloader.a$a     // Catch:{ all -> 0x099b }
                com.vungle.warren.downloader.d r9 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x099b }
                int r9 = com.vungle.warren.downloader.C23117d.m57112v(r9, r0, r7)     // Catch:{ all -> 0x099b }
                r8.<init>(r10, r0, r9)     // Catch:{ all -> 0x099b }
                if (r7 != 0) goto L_0x0875
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0870 }
                com.vungle.warren.downloader.DownloadRequestMediator r7 = r1.f58688f     // Catch:{ all -> 0x0870 }
                com.vungle.warren.downloader.C23117d.m57110t(r0, r7, r3)     // Catch:{ all -> 0x0870 }
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x0870 }
                r7 = 3
                boolean r0 = r0.mo58135is(r7)     // Catch:{ all -> 0x0870 }
                if (r0 != 0) goto L_0x0875
                int r14 = r17 + 1
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0870 }
                r0.getClass()     // Catch:{ all -> 0x0870 }
                r11 = r17
                r7 = 10
                if (r11 >= r7) goto L_0x086e
                r0 = 0
            L_0x082a:
                com.vungle.warren.downloader.d r7 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0870 }
                r7.getClass()     // Catch:{ all -> 0x0870 }
                r7 = 5
                if (r0 >= r7) goto L_0x086e
                com.vungle.warren.downloader.d r7 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0870 }
                r7.getClass()     // Catch:{ all -> 0x0870 }
                r9 = 300(0x12c, float:4.2E-43)
                long r9 = (long) r9     // Catch:{ all -> 0x0870 }
                com.vungle.warren.downloader.C23117d.m57113w(r7, r9)     // Catch:{ all -> 0x0870 }
                com.vungle.warren.downloader.DownloadRequestMediator r7 = r1.f58688f     // Catch:{ all -> 0x0870 }
                r9 = 3
                boolean r7 = r7.mo58135is(r9)     // Catch:{ all -> 0x0870 }
                if (r7 == 0) goto L_0x0847
                goto L_0x086e
            L_0x0847:
                com.vungle.warren.downloader.d r7 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0870 }
                com.vungle.warren.downloader.DownloadRequestMediator r9 = r1.f58688f     // Catch:{ all -> 0x0870 }
                boolean r7 = r7.mo58165Q(r9)     // Catch:{ all -> 0x0870 }
                if (r7 == 0) goto L_0x0865
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x0860 }
                r7 = 1
                r0.setConnected(r7)     // Catch:{ all -> 0x0860 }
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x0860 }
                r0.set(r7)     // Catch:{ all -> 0x0860 }
                r9 = 0
                r27 = 0
                goto L_0x087b
            L_0x0860:
                r0 = move-exception
                r27 = 0
                goto L_0x09a1
            L_0x0865:
                com.vungle.warren.downloader.DownloadRequestMediator r7 = r1.f58688f     // Catch:{ all -> 0x0870 }
                r9 = 0
                r7.setConnected(r9)     // Catch:{ all -> 0x0870 }
                int r0 = r0 + 1
                goto L_0x082a
            L_0x086e:
                r9 = 0
                goto L_0x0879
            L_0x0870:
                r0 = move-exception
                r15 = r8
            L_0x0872:
                r8 = 1
                goto L_0x099e
            L_0x0875:
                r11 = r17
                r9 = 0
                r14 = r11
            L_0x0879:
                r27 = 1
            L_0x087b:
                com.vungle.warren.downloader.d r7 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x08c0 }
                monitor-enter(r7)     // Catch:{ all -> 0x08c0 }
                if (r27 == 0) goto L_0x08b9
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x08b7 }
                boolean r0 = r0.isConnected()     // Catch:{ all -> 0x08b7 }
                if (r0 != 0) goto L_0x08b9
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x08b7 }
                boolean r0 = r0.isPausable()     // Catch:{ all -> 0x08b7 }
                if (r0 == 0) goto L_0x08b9
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x08b7 }
                com.vungle.warren.downloader.DownloadRequestMediator r10 = r1.f58688f     // Catch:{ all -> 0x08b7 }
                boolean r0 = r0.mo58165Q(r10)     // Catch:{ all -> 0x08b7 }
                if (r0 == 0) goto L_0x08ac
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x08a8 }
                r10 = 1
                r0.setConnected(r10)     // Catch:{ all -> 0x08a8 }
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f     // Catch:{ all -> 0x08a8 }
                r0.set(r10)     // Catch:{ all -> 0x08a8 }
                r27 = 0
                goto L_0x08b9
            L_0x08a8:
                r0 = move-exception
                r27 = 0
                goto L_0x08be
            L_0x08ac:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x08b7 }
                com.vungle.warren.downloader.DownloadRequestMediator r10 = r1.f58688f     // Catch:{ all -> 0x08b7 }
                boolean r0 = com.vungle.warren.downloader.C23117d.m57114x(r0, r10, r3, r8)     // Catch:{ all -> 0x08b7 }
                r16 = r0
                goto L_0x08b9
            L_0x08b7:
                r0 = move-exception
                goto L_0x08be
            L_0x08b9:
                monitor-exit(r7)     // Catch:{ all -> 0x08b7 }
                r7 = r8
                r8 = r27
                goto L_0x08e7
            L_0x08be:
                monitor-exit(r7)     // Catch:{ all -> 0x08b7 }
                throw r0     // Catch:{ all -> 0x08c0 }
            L_0x08c0:
                r0 = move-exception
                goto L_0x09a1
            L_0x08c3:
                r11 = r17
                r9 = 0
                boolean r7 = r0 instanceof com.vungle.warren.downloader.Downloader.RequestException     // Catch:{ all -> 0x099b }
                if (r7 == 0) goto L_0x08da
                com.vungle.warren.downloader.d r7 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x099b }
                r8 = 1
                r7.mo58162N(r12, r5, r8)     // Catch:{ all -> 0x08d7 }
                com.vungle.warren.downloader.a$a r7 = new com.vungle.warren.downloader.a$a     // Catch:{ all -> 0x08d7 }
                r7.<init>(r10, r0, r8)     // Catch:{ all -> 0x08d7 }
                r8 = 1
                goto L_0x08e6
            L_0x08d7:
                r0 = move-exception
                goto L_0x099e
            L_0x08da:
                com.vungle.warren.downloader.d r7 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x099b }
                r8 = 1
                r7.mo58162N(r12, r5, r8)     // Catch:{ all -> 0x08d7 }
                com.vungle.warren.downloader.a$a r7 = new com.vungle.warren.downloader.a$a     // Catch:{ all -> 0x08d7 }
                r14 = 4
                r7.<init>(r10, r0, r14)     // Catch:{ all -> 0x08d7 }
            L_0x08e6:
                r14 = r11
            L_0x08e7:
                if (r6 == 0) goto L_0x08f6
                hi0.e0 r0 = r6.mo58638e()
                if (r0 == 0) goto L_0x08f6
                hi0.e0 r0 = r6.mo58638e()
                r0.close()
            L_0x08f6:
                if (r2 == 0) goto L_0x08fb
                r2.mo58719f()
            L_0x08fb:
                int r0 = com.vungle.warren.downloader.C23117d.f58675n
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                if (r8 == 0) goto L_0x0946
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                int r0 = r0.getStatus()
                r2 = 2
                if (r0 == r2) goto L_0x0939
                r2 = 3
                if (r0 == r2) goto L_0x0932
                r2 = 4
                if (r0 == r2) goto L_0x092a
                r2 = 5
                if (r0 == r2) goto L_0x0922
                if (r16 != 0) goto L_0x0939
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57090B(r0, r2)
                goto L_0x0939
            L_0x0922:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58171W(r7, r2)
                goto L_0x0939
            L_0x092a:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57115y(r0, r12, r2)
                goto L_0x0939
            L_0x0932:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r0.mo58170V(r2)
            L_0x0939:
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                r0.getStatus()
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
                goto L_0x094d
            L_0x0946:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                java.lang.String unused = r0.getClass()
            L_0x094d:
                com.vungle.warren.downloader.d r10 = com.vungle.warren.downloader.C23117d.this
                monitor-enter(r10)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0998 }
                com.vungle.warren.downloader.C23117d.m57091C(r0)     // Catch:{ all -> 0x0998 }
                monitor-exit(r10)     // Catch:{ all -> 0x0998 }
                ce0.C21105j.m49396a(r4)
                ce0.C21105j.m49396a(r13)
                if (r8 == 0) goto L_0x0990
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                if (r0 == 0) goto L_0x0990
                com.vungle.warren.downloader.DownloadRequestMediator r0 = r1.f58688f
                boolean r0 = r0.isCacheable
                if (r0 == 0) goto L_0x0990
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58187g(r12)
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                boolean r0 = r0.mo58166R()
                if (r0 != 0) goto L_0x0987
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.clear()
                goto L_0x0990
            L_0x0987:
                com.vungle.warren.downloader.d r0 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r0 = r0.f58676a
                r0.mo58190j()
            L_0x0990:
                r15 = r7
                r2 = r8
            L_0x0992:
                r0 = r2
            L_0x0993:
                r4 = r22
                r2 = 0
                goto L_0x003e
            L_0x0998:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x0998 }
                throw r0
            L_0x099b:
                r0 = move-exception
                goto L_0x0872
            L_0x099e:
                r8 = r15
                r27 = 1
            L_0x09a1:
                if (r6 == 0) goto L_0x09b0
                hi0.e0 r3 = r6.mo58638e()
                if (r3 == 0) goto L_0x09b0
                hi0.e0 r3 = r6.mo58638e()
                r3.close()
            L_0x09b0:
                if (r2 == 0) goto L_0x09b5
                r2.mo58719f()
            L_0x09b5:
                int r2 = com.vungle.warren.downloader.C23117d.f58675n
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r3 = r1.f58688f
                java.lang.String unused = r2.getClass()
                if (r27 == 0) goto L_0x0a00
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                int r2 = r2.getStatus()
                r3 = 2
                if (r2 == r3) goto L_0x09f3
                r3 = 3
                if (r2 == r3) goto L_0x09ec
                r3 = 4
                if (r2 == r3) goto L_0x09e4
                r3 = 5
                if (r2 == r3) goto L_0x09dc
                if (r16 != 0) goto L_0x09f3
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r3 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57090B(r2, r3)
                goto L_0x09f3
            L_0x09dc:
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r3 = r1.f58688f
                r2.mo58171W(r8, r3)
                goto L_0x09f3
            L_0x09e4:
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r3 = r1.f58688f
                com.vungle.warren.downloader.C23117d.m57115y(r2, r12, r3)
                goto L_0x09f3
            L_0x09ec:
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r3 = r1.f58688f
                r2.mo58170V(r3)
            L_0x09f3:
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                r2.getStatus()
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r3 = r1.f58688f
                java.lang.String unused = r2.getClass()
                goto L_0x0a07
            L_0x0a00:
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.DownloadRequestMediator r3 = r1.f58688f
                java.lang.String unused = r2.getClass()
            L_0x0a07:
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                monitor-enter(r2)
                com.vungle.warren.downloader.d r3 = com.vungle.warren.downloader.C23117d.this     // Catch:{ all -> 0x0a4b }
                com.vungle.warren.downloader.C23117d.m57091C(r3)     // Catch:{ all -> 0x0a4b }
                monitor-exit(r2)     // Catch:{ all -> 0x0a4b }
                ce0.C21105j.m49396a(r4)
                ce0.C21105j.m49396a(r13)
                if (r27 == 0) goto L_0x0a4a
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r2 = r2.f58676a
                if (r2 == 0) goto L_0x0a4a
                com.vungle.warren.downloader.DownloadRequestMediator r2 = r1.f58688f
                boolean r2 = r2.isCacheable
                if (r2 == 0) goto L_0x0a4a
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r2 = r2.f58676a
                r2.mo58187g(r12)
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                boolean r2 = r2.mo58166R()
                if (r2 != 0) goto L_0x0a41
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r2 = r2.f58676a
                r2.clear()
                goto L_0x0a4a
            L_0x0a41:
                com.vungle.warren.downloader.d r2 = com.vungle.warren.downloader.C23117d.this
                com.vungle.warren.downloader.i r2 = r2.f58676a
                r2.mo58190j()
            L_0x0a4a:
                throw r0
            L_0x0a4b:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0a4b }
                throw r0
            L_0x0a4e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.C23117d.C23118a.run():void");
        }
    }

    /* renamed from: com.vungle.warren.downloader.d$b */
    public class C23119b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ DownloadRequestMediator f58690b;

        public C23119b(DownloadRequestMediator downloadRequestMediator) {
            this.f58690b = downloadRequestMediator;
        }

        public final void run() {
            C23117d.this.mo58171W(new C23112a.C23113a(-1, new VungleException(39), 1), this.f58690b);
        }
    }

    /* renamed from: com.vungle.warren.downloader.d$c */
    public class C23120c implements C21110n.C21112b {
        public C23120c() {
        }

        /* renamed from: a */
        public final void mo53313a() {
            int i = C23117d.f58675n;
            C23117d dVar = C23117d.this;
            synchronized (dVar) {
                dVar.f58682g.values().size();
                for (DownloadRequestMediator downloadRequestMediator : dVar.f58682g.values()) {
                    if (!downloadRequestMediator.mo58135is(3)) {
                        boolean Q = dVar.mo58165Q(downloadRequestMediator);
                        downloadRequestMediator.setConnected(Q);
                        if (downloadRequestMediator.isPausable() && Q && downloadRequestMediator.mo58135is(2)) {
                            dVar.mo58167S(downloadRequestMediator);
                            downloadRequestMediator.toString();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.vungle.warren.downloader.d$d */
    public class C23121d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23112a f58693b;

        /* renamed from: c */
        public final /* synthetic */ C23112a.C23113a f58694c;

        /* renamed from: d */
        public final /* synthetic */ C23127h f58695d;

        public C23121d(C23112a.C23113a aVar, C23112a aVar2, C23127h hVar) {
            this.f58693b = aVar2;
            this.f58694c = aVar;
            this.f58695d = hVar;
        }

        public final void run() {
            this.f58693b.mo58158c(this.f58694c, this.f58695d);
        }
    }

    /* renamed from: com.vungle.warren.downloader.d$e */
    public class C23122e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ DownloadRequestMediator f58696b;

        public C23122e(DownloadRequestMediator downloadRequestMediator) {
            this.f58696b = downloadRequestMediator;
        }

        public final void run() {
            C23117d.this.mo58171W(new C23112a.C23113a(-1, new VungleException(39), 1), this.f58696b);
        }
    }

    public C23117d(C23128i iVar, long j, C21110n nVar, C21120u uVar, ExecutorService executorService) {
        this.f58676a = iVar;
        this.f58677b = j;
        this.f58679d = uVar;
        this.f58678c = nVar;
        this.f58681f = executorService;
        C23566v.C23568b bVar = new C23566v.C23568b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        bVar.mo58717c(30, timeUnit);
        bVar.mo58716b(30, timeUnit);
        bVar.f59611j = null;
        bVar.f59612k = null;
        bVar.f59623v = true;
        bVar.f59622u = true;
        this.f58680e = new C23566v(bVar);
    }

    /* renamed from: B */
    public static void m57090B(C23117d dVar, DownloadRequestMediator downloadRequestMediator) {
        synchronized (dVar) {
            dVar.f58682g.remove(downloadRequestMediator.key);
        }
    }

    /* renamed from: C */
    public static void m57091C(C23117d dVar) {
        if (dVar.f58682g.isEmpty()) {
            C21110n nVar = dVar.f58678c;
            nVar.f52961e.remove(dVar.f58687l);
            nVar.mo53311c(!nVar.f52961e.isEmpty());
        }
    }

    /* renamed from: G */
    public static HashMap m57095G(C23117d dVar, File file) {
        dVar.getClass();
        String path = file.getPath();
        List<Class<?>> list = C21105j.f52950a;
        Object d = C21105j.m49399d(new File(path));
        if (d instanceof HashMap) {
            return (HashMap) d;
        }
        return new HashMap();
    }

    /* renamed from: H */
    public static boolean m57096H(C23117d dVar, DownloadRequestMediator downloadRequestMediator, File file, HashMap hashMap) {
        String str;
        if (hashMap == null) {
            dVar.getClass();
        } else if (dVar.f58676a != null && downloadRequestMediator.isCacheable && (str = (String) hashMap.get("Last-Cache-Verification")) != null && file.exists() && Boolean.parseBoolean((String) hashMap.get("DOWNLOAD_COMPLETE"))) {
            try {
                long parseLong = Long.parseLong(str);
                long j = dVar.f58677b;
                if (j >= Long.MAX_VALUE - parseLong || parseLong + j >= System.currentTimeMillis()) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: I */
    public static void m57097I(C23117d dVar, long j, File file, HashMap hashMap, C23571x.C23572a aVar) {
        dVar.getClass();
        aVar.f59644c.mo58690a("Accept-Encoding", "identity");
        if (file.exists() && !hashMap.isEmpty()) {
            String str = (String) hashMap.get("ETag");
            String str2 = (String) hashMap.get("Last-Modified");
            if (Boolean.parseBoolean((String) hashMap.get("DOWNLOAD_COMPLETE"))) {
                if (!TextUtils.isEmpty(str)) {
                    aVar.f59644c.mo58690a("If-None-Match", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    aVar.f59644c.mo58690a("If-Modified-Since", str2);
                }
            } else if ("bytes".equalsIgnoreCase((String) hashMap.get("Accept-Ranges"))) {
                if (hashMap.get("Content-Encoding") == null || "identity".equalsIgnoreCase((String) hashMap.get("Content-Encoding"))) {
                    aVar.f59644c.mo58690a("Range", C16530d.m42012e("bytes=", j, "-"));
                    if (!TextUtils.isEmpty(str)) {
                        aVar.f59644c.mo58690a("If-Range", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        aVar.f59644c.mo58690a("If-Range", str2);
                    }
                }
            }
        }
    }

    /* renamed from: L */
    public static String m57099L(C23127h hVar) {
        StringBuilder k = C13555b.m33972k(", single request url - ");
        k.append(hVar.f58714b);
        k.append(", path - ");
        k.append(hVar.f58715c);
        k.append(", th - ");
        k.append(Thread.currentThread().getName());
        k.append("id ");
        k.append(hVar.f58718f);
        return k.toString();
    }

    /* renamed from: M */
    public static String m57100M(DownloadRequestMediator downloadRequestMediator) {
        StringBuilder k = C13555b.m33972k(", mediator url - ");
        k.append(downloadRequestMediator.url);
        k.append(", path - ");
        k.append(downloadRequestMediator.filePath);
        k.append(", th - ");
        k.append(Thread.currentThread().getName());
        k.append("id ");
        k.append(downloadRequestMediator);
        return k.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r7.f58683h.remove(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r1.mo58135is(6) != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r1.mo58135is(3) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r8.f58720h.get() != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r1.isCacheable == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        r1.add(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r1.mo58135is(2) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        r7.mo58167S(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        com.vungle.warren.VungleLogger.m57032e("AssetDownloader#launchRequest; loadAd sequence", "request " + r8 + " is already running");
        r7.mo58163O(r8, r9, new com.vungle.warren.downloader.C23112a.C23113a(-1, new java.lang.IllegalArgumentException("DownloadRequest is already running"), 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        r8 = r7.mo58168T(r8, r9);
        r7.f58682g.put(r1.key, r8);
        r7.mo58167S(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d6, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r1.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00de, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r1.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m57101k(com.vungle.warren.downloader.C23117d r7, com.vungle.warren.downloader.C23127h r8, com.vungle.warren.downloader.C23112a r9) throws java.io.IOException {
        /*
            java.lang.Object r0 = r7.f58684i
            monitor-enter(r0)
            monitor-enter(r7)     // Catch:{ all -> 0x00e6 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.f58720h     // Catch:{ all -> 0x00e3 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x00e3 }
            r2 = 1
            r3 = -1
            if (r1 == 0) goto L_0x0026
            java.util.ArrayList r1 = r7.f58683h     // Catch:{ all -> 0x00e3 }
            r1.remove(r8)     // Catch:{ all -> 0x00e3 }
            com.vungle.warren.downloader.a$a r1 = new com.vungle.warren.downloader.a$a     // Catch:{ all -> 0x00e3 }
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00e3 }
            java.lang.String r5 = "Cancelled"
            r4.<init>(r5)     // Catch:{ all -> 0x00e3 }
            r1.<init>(r3, r4, r2)     // Catch:{ all -> 0x00e3 }
            r7.mo58163O(r8, r9, r1)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            goto L_0x00db
        L_0x0026:
            j$.util.concurrent.ConcurrentHashMap r1 = r7.f58682g     // Catch:{ all -> 0x00e3 }
            boolean r4 = r7.mo58166R()     // Catch:{ all -> 0x00e3 }
            if (r4 == 0) goto L_0x0031
            java.lang.String r4 = r8.f58714b     // Catch:{ all -> 0x00e3 }
            goto L_0x0049
        L_0x0031:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r4.<init>()     // Catch:{ all -> 0x00e3 }
            java.lang.String r5 = r8.f58714b     // Catch:{ all -> 0x00e3 }
            r4.append(r5)     // Catch:{ all -> 0x00e3 }
            java.lang.String r5 = " "
            r4.append(r5)     // Catch:{ all -> 0x00e3 }
            java.lang.String r5 = r8.f58715c     // Catch:{ all -> 0x00e3 }
            r4.append(r5)     // Catch:{ all -> 0x00e3 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00e3 }
        L_0x0049:
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x00e3 }
            com.vungle.warren.downloader.DownloadRequestMediator r1 = (com.vungle.warren.downloader.DownloadRequestMediator) r1     // Catch:{ all -> 0x00e3 }
            if (r1 != 0) goto L_0x0068
            java.util.ArrayList r1 = r7.f58683h     // Catch:{ all -> 0x00e3 }
            r1.remove(r8)     // Catch:{ all -> 0x00e3 }
            com.vungle.warren.downloader.DownloadRequestMediator r8 = r7.mo58168T(r8, r9)     // Catch:{ all -> 0x00e3 }
            j$.util.concurrent.ConcurrentHashMap r9 = r7.f58682g     // Catch:{ all -> 0x00e3 }
            java.lang.String r1 = r8.key     // Catch:{ all -> 0x00e3 }
            r9.put(r1, r8)     // Catch:{ all -> 0x00e3 }
            r7.mo58167S(r8)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            goto L_0x00db
        L_0x0068:
            monitor-exit(r7)     // Catch:{ all -> 0x00e3 }
            r1.lock()     // Catch:{ all -> 0x00de }
            monitor-enter(r7)     // Catch:{ all -> 0x00de }
            java.util.ArrayList r4 = r7.f58683h     // Catch:{ all -> 0x0089 }
            r4.remove(r8)     // Catch:{ all -> 0x0089 }
            r4 = 6
            boolean r4 = r1.mo58135is(r4)     // Catch:{ all -> 0x0089 }
            if (r4 != 0) goto L_0x00c8
            r4 = 3
            boolean r4 = r1.mo58135is(r4)     // Catch:{ all -> 0x0089 }
            if (r4 == 0) goto L_0x008b
            java.util.concurrent.atomic.AtomicBoolean r4 = r8.f58720h     // Catch:{ all -> 0x0089 }
            boolean r4 = r4.get()     // Catch:{ all -> 0x0089 }
            if (r4 != 0) goto L_0x008b
            goto L_0x00c8
        L_0x0089:
            r8 = move-exception
            goto L_0x00dc
        L_0x008b:
            boolean r4 = r1.isCacheable     // Catch:{ all -> 0x0089 }
            if (r4 == 0) goto L_0x009d
            r1.add(r8, r9)     // Catch:{ all -> 0x0089 }
            r8 = 2
            boolean r8 = r1.mo58135is(r8)     // Catch:{ all -> 0x0089 }
            if (r8 == 0) goto L_0x00d6
            r7.mo58167S(r1)     // Catch:{ all -> 0x0089 }
            goto L_0x00d6
        L_0x009d:
            java.lang.String r4 = "AssetDownloader#launchRequest; loadAd sequence"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r5.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "request "
            r5.append(r6)     // Catch:{ all -> 0x0089 }
            r5.append(r8)     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = " is already running"
            r5.append(r6)     // Catch:{ all -> 0x0089 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0089 }
            com.vungle.warren.VungleLogger.m57032e(r4, r5)     // Catch:{ all -> 0x0089 }
            com.vungle.warren.downloader.a$a r4 = new com.vungle.warren.downloader.a$a     // Catch:{ all -> 0x0089 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "DownloadRequest is already running"
            r5.<init>(r6)     // Catch:{ all -> 0x0089 }
            r4.<init>(r3, r5, r2)     // Catch:{ all -> 0x0089 }
            r7.mo58163O(r8, r9, r4)     // Catch:{ all -> 0x0089 }
            goto L_0x00d6
        L_0x00c8:
            com.vungle.warren.downloader.DownloadRequestMediator r8 = r7.mo58168T(r8, r9)     // Catch:{ all -> 0x0089 }
            j$.util.concurrent.ConcurrentHashMap r9 = r7.f58682g     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = r1.key     // Catch:{ all -> 0x0089 }
            r9.put(r2, r8)     // Catch:{ all -> 0x0089 }
            r7.mo58167S(r8)     // Catch:{ all -> 0x0089 }
        L_0x00d6:
            monitor-exit(r7)     // Catch:{ all -> 0x0089 }
            r1.unlock()     // Catch:{ all -> 0x00e6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
        L_0x00db:
            return
        L_0x00dc:
            monitor-exit(r7)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x00de }
        L_0x00de:
            r7 = move-exception
            r1.unlock()     // Catch:{ all -> 0x00e6 }
            throw r7     // Catch:{ all -> 0x00e6 }
        L_0x00e3:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e3 }
            throw r8     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.C23117d.m57101k(com.vungle.warren.downloader.d, com.vungle.warren.downloader.h, com.vungle.warren.downloader.a):void");
    }

    /* renamed from: l */
    public static long m57102l(C23117d dVar, C23529c0 c0Var) {
        dVar.getClass();
        if (c0Var == null) {
            return -1;
        }
        String c = c0Var.f59415g.mo58682c(HttpHeader.CONTENT_LENGTH);
        if (TextUtils.isEmpty(c)) {
            return -1;
        }
        try {
            return Long.parseLong(c);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: m */
    public static boolean m57103m(C23117d dVar, File file, C23529c0 c0Var, DownloadRequestMediator downloadRequestMediator, HashMap hashMap) {
        dVar.getClass();
        if (file.exists() && file.length() > 0 && downloadRequestMediator.isCacheable) {
            int i = c0Var.f59412d;
            if (Boolean.parseBoolean((String) hashMap.get("DOWNLOAD_COMPLETE")) && i == 304) {
                m57100M(downloadRequestMediator);
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m57104n(C23117d dVar, DownloadRequestMediator downloadRequestMediator, File file, HashMap hashMap, int i) {
        if (dVar.f58676a == null || !downloadRequestMediator.isCacheable || i == 200 || i == 416 || i == 206 || !Boolean.parseBoolean((String) hashMap.get("DOWNLOAD_COMPLETE")) || !file.exists() || file.length() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:23|24|25|26) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006c */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m57105o(com.vungle.warren.downloader.C23117d r9, long r10, int r12, hi0.C23529c0 r13, com.vungle.warren.downloader.DownloadRequestMediator r14) {
        /*
            r9.getClass()
            r9 = 1
            r0 = 0
            r1 = 206(0xce, float:2.89E-43)
            if (r12 != r1) goto L_0x00a0
            hi0.q r2 = r13.f59415g
            java.lang.String r3 = "Content-Range"
            java.lang.String r2 = r2.mo58682c(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = -1
            r6 = 0
            if (r3 != 0) goto L_0x0082
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "\\s+"
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r7 = 2
            if (r3 < r7) goto L_0x0082
            int r3 = r2.length
            if (r3 <= 0) goto L_0x002d
            r6 = r2[r0]
        L_0x002d:
            int r3 = r2.length
            if (r3 <= r9) goto L_0x0082
            r3 = r2[r9]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0082
            r2 = r2[r9]
            java.lang.String r3 = "/"
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            if (r3 != r7) goto L_0x0082
            r3 = r2[r0]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0073
            r3 = r2[r0]
            java.lang.String r8 = "-"
            java.lang.String[] r3 = r3.split(r8)
            int r8 = r3.length
            if (r8 != r7) goto L_0x0073
            r7 = r3[r0]
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0073
            r7 = r3[r9]
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0073
            r7 = r3[r0]     // Catch:{ all -> 0x006c }
            long r4 = java.lang.Long.parseLong(r7)     // Catch:{ all -> 0x006c }
        L_0x006c:
            r3 = r3[r9]     // Catch:{ all -> 0x0072 }
            java.lang.Long.parseLong(r3)     // Catch:{ all -> 0x0072 }
            goto L_0x0073
        L_0x0072:
        L_0x0073:
            r3 = r2[r9]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0082
            r2 = r2[r9]     // Catch:{ all -> 0x0081 }
            java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0081 }
            goto L_0x0082
        L_0x0081:
        L_0x0082:
            int r13 = r13.f59412d
            if (r13 != r1) goto L_0x009a
            java.lang.String r13 = "bytes"
            boolean r13 = r13.equalsIgnoreCase(r6)
            if (r13 == 0) goto L_0x009a
            r1 = 0
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 < 0) goto L_0x009a
            int r13 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            m57100M(r14)
            if (r10 == 0) goto L_0x00a6
        L_0x00a0:
            r10 = 416(0x1a0, float:5.83E-43)
            if (r12 != r10) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.C23117d.m57105o(com.vungle.warren.downloader.d, long, int, hi0.c0, com.vungle.warren.downloader.DownloadRequestMediator):boolean");
    }

    /* renamed from: q */
    public static void m57107q(C23117d dVar, File file, File file2, C23556q qVar) throws IOException {
        dVar.getClass();
        String c = qVar.mo58682c("Content-Encoding");
        if (c != null && !"gzip".equalsIgnoreCase(c) && !"identity".equalsIgnoreCase(c)) {
            dVar.mo58162N(file, file2, false);
            VungleLogger.m57029b("AssetDownloader#checkEncoding; loadAd sequence", String.format("unknown %1$s %2$s ", new Object[]{"Content-Encoding", c}));
            throw new IOException("Unknown Content-Encoding");
        }
    }

    /* renamed from: r */
    public static HashMap m57108r(C23117d dVar, File file, C23556q qVar, String str) {
        dVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("Download_URL", str);
        hashMap.put("ETag", qVar.mo58682c("ETag"));
        hashMap.put("Last-Modified", qVar.mo58682c("Last-Modified"));
        hashMap.put("Accept-Ranges", qVar.mo58682c("Accept-Ranges"));
        hashMap.put("Content-Encoding", qVar.mo58682c("Content-Encoding"));
        String path = file.getPath();
        List<Class<?>> list = C21105j.f52950a;
        File file2 = new File(path);
        if (!hashMap.isEmpty()) {
            C21105j.m49401f(file2, hashMap);
        }
        return hashMap;
    }

    /* renamed from: s */
    public static C23536e0 m57109s(C23117d dVar, C23529c0 c0Var) {
        C23536e0 e0Var;
        dVar.getClass();
        if (!"gzip".equalsIgnoreCase(c0Var.mo58641r("Content-Encoding")) || !C24318e.m61057b(c0Var) || (e0Var = c0Var.f59416h) == null) {
            return c0Var.f59416h;
        }
        return new C24320g(c0Var.mo58641r(HttpHeader.CONTENT_TYPE), -1, C24911r.m62547c(new C24908o(e0Var.mo53600t())));
    }

    /* renamed from: t */
    public static void m57110t(C23117d dVar, DownloadRequestMediator downloadRequestMediator, C23112a.C23114b bVar) {
        dVar.getClass();
        if (downloadRequestMediator != null) {
            C23112a.C23114b bVar2 = new C23112a.C23114b();
            bVar2.f58667a = bVar.f58667a;
            downloadRequestMediator.toString();
            for (C6233c next : downloadRequestMediator.values()) {
                C23127h hVar = (C23127h) next.f19679a;
                C23112a aVar = (C23112a) next.f19680b;
                if (aVar != null) {
                    dVar.f58681f.execute(new C23124e(hVar, aVar, bVar2));
                }
            }
        }
    }

    /* renamed from: v */
    public static int m57112v(C23117d dVar, Throwable th, boolean z) {
        dVar.getClass();
        if (th instanceof RuntimeException) {
            return 4;
        }
        if (!z || (th instanceof SocketException) || (th instanceof SocketTimeoutException)) {
            return 0;
        }
        if ((th instanceof UnknownHostException) || (th instanceof SSLException)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: w */
    public static void m57113w(C23117d dVar, long j) {
        dVar.getClass();
        try {
            Thread.sleep(Math.max(0, j));
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: x */
    public static boolean m57114x(C23117d dVar, DownloadRequestMediator downloadRequestMediator, C23112a.C23114b bVar, C23112a.C23113a aVar) {
        dVar.getClass();
        boolean z = false;
        if (!downloadRequestMediator.mo58135is(3) && !dVar.mo58165Q(downloadRequestMediator)) {
            C23112a.C23114b bVar2 = new C23112a.C23114b();
            bVar2.f58667a = bVar.f58667a;
            for (C6233c next : downloadRequestMediator.values()) {
                C23127h hVar = (C23127h) next.f19679a;
                if (hVar != null) {
                    if (!hVar.f58716d) {
                        downloadRequestMediator.remove(hVar);
                        dVar.mo58163O(hVar, (C23112a) next.f19680b, aVar);
                    } else {
                        downloadRequestMediator.set(2);
                        z = true;
                        m57099L(hVar);
                        C23127h hVar2 = (C23127h) next.f19679a;
                        C23112a aVar2 = (C23112a) next.f19680b;
                        if (aVar2 != null) {
                            dVar.f58681f.execute(new C23124e(hVar2, aVar2, bVar2));
                        }
                    }
                }
            }
            if (!z) {
                downloadRequestMediator.set(5);
            }
            downloadRequestMediator.getStatus();
        }
        return z;
    }

    /* renamed from: y */
    public static void m57115y(C23117d dVar, File file, DownloadRequestMediator downloadRequestMediator) {
        dVar.getClass();
        Objects.toString(downloadRequestMediator);
        try {
            downloadRequestMediator.lock();
            List<C6233c<C23127h, C23112a>> values = downloadRequestMediator.values();
            if (!file.exists()) {
                VungleLogger.m57029b("AssetDownloader#onSuccessMediator; loadAd sequence", String.format("File %1$s does not exist; mediator %2$s ", new Object[]{file.getPath(), m57100M(downloadRequestMediator)}));
                dVar.mo58171W(new C23112a.C23113a(-1, new IOException("File is deleted"), 2), downloadRequestMediator);
            } else {
                C23128i iVar = dVar.f58676a;
                if (iVar != null && downloadRequestMediator.isCacheable) {
                    iVar.mo58185e(file, (long) values.size());
                    dVar.f58676a.mo58184d(file, System.currentTimeMillis());
                }
                for (C6233c next : values) {
                    File file2 = new File(((C23127h) next.f19679a).f58715c);
                    if (!file2.equals(file)) {
                        dVar.mo58161K(file, file2, next);
                    } else {
                        file2 = file;
                    }
                    String str = ((C23127h) next.f19679a).f58714b;
                    file2.getPath();
                    S s = next.f19680b;
                    if (s != null) {
                        ((C23112a) s).mo58157b(file2, (C23127h) next.f19679a);
                    }
                }
                synchronized (dVar) {
                    dVar.f58682g.remove(downloadRequestMediator.key);
                }
                downloadRequestMediator.set(6);
                m57100M(downloadRequestMediator);
            }
            downloadRequestMediator.unlock();
        } catch (Throwable th) {
            downloadRequestMediator.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58161K(java.io.File r11, java.io.File r12, p229r1.C6233c<com.vungle.warren.downloader.C23127h, com.vungle.warren.downloader.C23112a> r13) {
        /*
            r10 = this;
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x0009
            ce0.C21105j.m49398c(r12)
        L_0x0009:
            java.io.File r0 = r12.getParentFile()
            if (r0 == 0) goto L_0x0020
            java.io.File r0 = r12.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0020
            java.io.File r0 = r12.getParentFile()
            r0.mkdirs()
        L_0x0020:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r1.<init>(r11)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004c, all -> 0x0048 }
            r2.<init>(r12)     // Catch:{ IOException -> 0x004c, all -> 0x0048 }
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch:{ IOException -> 0x0046 }
            java.nio.channels.FileChannel r8 = r2.getChannel()     // Catch:{ IOException -> 0x0046 }
            r4 = 0
            long r6 = r3.size()     // Catch:{ IOException -> 0x0046 }
            r3.transferTo(r4, r6, r8)     // Catch:{ IOException -> 0x0046 }
            F r0 = r13.f19679a     // Catch:{ IOException -> 0x0046 }
            com.vungle.warren.downloader.h r0 = (com.vungle.warren.downloader.C23127h) r0     // Catch:{ IOException -> 0x0046 }
            java.lang.String r0 = r0.f58714b     // Catch:{ IOException -> 0x0046 }
            r12.getPath()     // Catch:{ IOException -> 0x0046 }
            goto L_0x009a
        L_0x0046:
            r0 = move-exception
            goto L_0x0058
        L_0x0048:
            r11 = move-exception
        L_0x0049:
            r12 = r0
            r0 = r1
            goto L_0x00a4
        L_0x004c:
            r2 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
            goto L_0x0058
        L_0x0051:
            r11 = move-exception
            r12 = r0
            goto L_0x00a4
        L_0x0054:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x0058:
            java.lang.String r3 = "AssetDownloader#copyToDestination; loadAd sequence"
            java.lang.String r4 = "cannot copy from %1$s(%2$s) to %3$s due to %4$s"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a1 }
            r6 = 0
            java.lang.String r11 = r11.getPath()     // Catch:{ all -> 0x00a1 }
            r5[r6] = r11     // Catch:{ all -> 0x00a1 }
            r11 = 1
            F r6 = r13.f19679a     // Catch:{ all -> 0x00a1 }
            com.vungle.warren.downloader.h r6 = (com.vungle.warren.downloader.C23127h) r6     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = r6.f58714b     // Catch:{ all -> 0x00a1 }
            r5[r11] = r6     // Catch:{ all -> 0x00a1 }
            java.lang.String r11 = r12.getPath()     // Catch:{ all -> 0x00a1 }
            r6 = 2
            r5[r6] = r11     // Catch:{ all -> 0x00a1 }
            r11 = 3
            r5[r11] = r0     // Catch:{ all -> 0x00a1 }
            java.lang.String r11 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x00a1 }
            com.vungle.warren.VungleLogger.m57029b(r3, r11)     // Catch:{ all -> 0x00a1 }
            F r11 = r13.f19679a     // Catch:{ all -> 0x00a1 }
            com.vungle.warren.downloader.h r11 = (com.vungle.warren.downloader.C23127h) r11     // Catch:{ all -> 0x00a1 }
            S r3 = r13.f19680b     // Catch:{ all -> 0x00a1 }
            com.vungle.warren.downloader.a r3 = (com.vungle.warren.downloader.C23112a) r3     // Catch:{ all -> 0x00a1 }
            com.vungle.warren.downloader.a$a r4 = new com.vungle.warren.downloader.a$a     // Catch:{ all -> 0x00a1 }
            r5 = -1
            r4.<init>(r5, r0, r6)     // Catch:{ all -> 0x00a1 }
            r10.mo58163O(r11, r3, r4)     // Catch:{ all -> 0x00a1 }
            F r11 = r13.f19679a     // Catch:{ all -> 0x00a1 }
            com.vungle.warren.downloader.h r11 = (com.vungle.warren.downloader.C23127h) r11     // Catch:{ all -> 0x00a1 }
            java.lang.String r11 = r11.f58714b     // Catch:{ all -> 0x00a1 }
            r12.getPath()     // Catch:{ all -> 0x00a1 }
        L_0x009a:
            ce0.C21105j.m49396a(r1)
            ce0.C21105j.m49396a(r2)
            return
        L_0x00a1:
            r11 = move-exception
            r0 = r2
            goto L_0x0049
        L_0x00a4:
            ce0.C21105j.m49396a(r0)
            ce0.C21105j.m49396a(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.C23117d.mo58161K(java.io.File, java.io.File, r1.c):void");
    }

    /* renamed from: N */
    public final void mo58162N(File file, File file2, boolean z) {
        C21105j.m49398c(file);
        C21105j.m49398c(file2);
        if (this.f58676a != null && mo58166R()) {
            if (z) {
                this.f58676a.mo58189i(file);
            } else {
                this.f58676a.mo58180a(file);
            }
        }
    }

    /* renamed from: O */
    public final void mo58163O(C23127h hVar, C23112a aVar, C23112a.C23113a aVar2) {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = aVar2;
        if (hVar != null) {
            str = m57099L(hVar);
        } else {
            str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        objArr[1] = str;
        VungleLogger.m57029b("AssetDownloader#deliverError; loadAd sequence", String.format("Delivering error %1$s; request %2$s", objArr));
        if (aVar != null) {
            this.f58681f.execute(new C23121d(aVar2, aVar, hVar));
        }
    }

    /* renamed from: P */
    public final synchronized DownloadRequestMediator mo58164P(C23127h hVar) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f58682g.get(hVar.f58714b));
        ConcurrentHashMap concurrentHashMap = this.f58682g;
        arrayList.add(concurrentHashMap.get(hVar.f58714b + " " + hVar.f58715c));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DownloadRequestMediator downloadRequestMediator = (DownloadRequestMediator) it.next();
            if (downloadRequestMediator != null) {
                for (C23127h equals : downloadRequestMediator.requests()) {
                    if (equals.equals(hVar)) {
                        return downloadRequestMediator;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: Q */
    public final boolean mo58165Q(DownloadRequestMediator downloadRequestMediator) {
        int i;
        Iterator<C23127h> it = downloadRequestMediator.requests().iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return false;
            }
            C23127h next = it.next();
            if (next != null) {
                int a = this.f58678c.mo53310a();
                if (a < 0 || next.f58713a != 3) {
                    if (a != 0) {
                        if (a != 1) {
                            if (a != 4) {
                                if (a != 9) {
                                    if (a != 17) {
                                        if (a != 6) {
                                            if (a != 7) {
                                                i = -1;
                                                if (i > 0 && (next.f58713a & i) == i) {
                                                    z = true;
                                                }
                                                m57099L(next);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i = 2;
                        z = true;
                        m57099L(next);
                    }
                    i = 1;
                    z = true;
                    m57099L(next);
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
        }
    }

    /* renamed from: R */
    public final synchronized boolean mo58166R() {
        return this.f58676a != null && this.f58686k;
    }

    /* renamed from: S */
    public final synchronized void mo58167S(DownloadRequestMediator downloadRequestMediator) {
        C21110n nVar = this.f58678c;
        nVar.f52961e.add(this.f58687l);
        nVar.mo53311c(true);
        downloadRequestMediator.set(1);
        this.f58679d.mo53324a(new C23118a(downloadRequestMediator, downloadRequestMediator), new C23119b(downloadRequestMediator));
    }

    /* renamed from: T */
    public final DownloadRequestMediator mo58168T(C23127h hVar, C23112a aVar) throws IOException {
        String str;
        boolean z;
        File file;
        File file2;
        if (!mo58166R()) {
            file2 = new File(hVar.f58715c);
            file = new File(file2.getPath() + ".vng_meta");
            str = hVar.f58714b + " " + hVar.f58715c;
            z = false;
        } else {
            file2 = this.f58676a.mo58182c(hVar.f58714b);
            file = this.f58676a.mo58186f(file2);
            str = hVar.f58714b;
            z = true;
        }
        file2.getPath();
        return new DownloadRequestMediator(hVar, aVar, file2.getPath(), file.getPath(), z, str);
    }

    /* renamed from: U */
    public final void mo58169U(C23127h hVar) {
        C23127h hVar2;
        if (!hVar.f58720h.get()) {
            hVar.f58720h.set(true);
            DownloadRequestMediator P = mo58164P(hVar);
            if (!(P == null || P.getStatus() == 3)) {
                C6233c<C23127h, C23112a> remove = P.remove(hVar);
                C23112a aVar = null;
                if (remove == null) {
                    hVar2 = null;
                } else {
                    hVar2 = (C23127h) remove.f19679a;
                }
                if (remove != null) {
                    aVar = (C23112a) remove.f19680b;
                }
                if (P.values().isEmpty()) {
                    P.set(3);
                }
                if (hVar2 != null) {
                    C23112a.C23114b bVar = new C23112a.C23114b();
                    if (aVar != null) {
                        this.f58681f.execute(new C23124e(hVar2, aVar, bVar));
                    }
                } else {
                    return;
                }
            }
            if (this.f58682g.isEmpty()) {
                C21110n nVar = this.f58678c;
                nVar.f52961e.remove(this.f58687l);
                nVar.mo53311c(!nVar.f52961e.isEmpty());
            }
        }
    }

    /* renamed from: V */
    public final synchronized void mo58170V(DownloadRequestMediator downloadRequestMediator) {
        for (C23127h U : downloadRequestMediator.requests()) {
            mo58169U(U);
        }
    }

    /* renamed from: W */
    public final void mo58171W(C23112a.C23113a aVar, DownloadRequestMediator downloadRequestMediator) {
        VungleLogger.m57029b("AssetDownloader#onErrorMediator; loadAd sequence", String.format("Error %1$s occured; mediator %2$s", new Object[]{aVar, m57100M(downloadRequestMediator)}));
        if (aVar == null) {
            aVar = new C23112a.C23113a(-1, new RuntimeException(), 4);
        }
        try {
            downloadRequestMediator.lock();
            for (C6233c next : downloadRequestMediator.values()) {
                mo58163O((C23127h) next.f19679a, (C23112a) next.f19680b, aVar);
            }
            synchronized (this) {
                this.f58682g.remove(downloadRequestMediator.key);
            }
            downloadRequestMediator.set(6);
            downloadRequestMediator.unlock();
        } catch (Throwable th) {
            downloadRequestMediator.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void mo58146a() {
        C23128i iVar = this.f58676a;
        if (iVar != null) {
            iVar.clear();
        }
    }

    /* renamed from: b */
    public final synchronized void mo58147b() {
        C23128i iVar = this.f58676a;
        if (iVar != null) {
            iVar.mo58181b();
        }
    }

    /* renamed from: c */
    public final synchronized void mo58148c() {
        Iterator it = this.f58683h.iterator();
        while (it.hasNext()) {
            C23127h hVar = (C23127h) it.next();
            String str = hVar.f58714b;
            mo58154i(hVar);
        }
        this.f58682g.values().size();
        for (DownloadRequestMediator downloadRequestMediator : this.f58682g.values()) {
            String str2 = downloadRequestMediator.key;
            mo58170V(downloadRequestMediator);
        }
    }

    /* renamed from: d */
    public final boolean mo58149d(String str) {
        C23128i iVar = this.f58676a;
        if (!(iVar == null || str == null)) {
            try {
                File c = iVar.mo58182c(str);
                c.getPath();
                return this.f58676a.mo58189i(c);
            } catch (IOException e) {
                VungleLogger.m57029b("AssetDownloader#dropCache; loadAd sequence", String.format("Error %1$s occured", new Object[]{e}));
            }
        }
        return false;
    }

    /* renamed from: e */
    public final synchronized void mo58150e(C23127h hVar, C23152i iVar) {
        if (hVar == null) {
            VungleLogger.m57029b("AssetDownloader#download; loadAd sequence", "downloadRequest is null");
            mo58163O((C23127h) null, iVar, new C23112a.C23113a(-1, new IllegalArgumentException("DownloadRequest is null"), 1));
            return;
        }
        VungleLogger.m57031d("ttDownloadContext", String.format("Waiting for download asset %1$s, at: %2$d", new Object[]{hVar, Long.valueOf(System.currentTimeMillis())}));
        this.f58683h.add(hVar);
        this.f58679d.mo53324a(new C23115b(this, new C23125f(-2147483647, 0), hVar, iVar), new C23116c(this, hVar, iVar));
    }

    /* renamed from: f */
    public final synchronized ArrayList mo58151f() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = new ArrayList(this.f58682g.values()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((DownloadRequestMediator) it.next()).requests());
        }
        arrayList.addAll(this.f58683h);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        java.lang.Thread.sleep(java.lang.Math.max(0, 10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo58152g(com.vungle.warren.downloader.C23127h r8) {
        /*
            r7 = this;
            r7.mo58154i(r8)
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = java.lang.Math.max(r2, r4)
            long r4 = r4 + r0
        L_0x0010:
            long r0 = java.lang.System.currentTimeMillis()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x004a
            com.vungle.warren.downloader.DownloadRequestMediator r0 = r7.mo58164P(r8)
            monitor-enter(r7)
            java.util.ArrayList r1 = r7.f58683h     // Catch:{ all -> 0x0047 }
            boolean r1 = r1.contains(r8)     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0034
            if (r0 == 0) goto L_0x0031
            java.util.List r0 = r0.requests()     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0034
        L_0x0031:
            r8 = 1
            monitor-exit(r7)     // Catch:{ all -> 0x0047 }
            return r8
        L_0x0034:
            monitor-exit(r7)     // Catch:{ all -> 0x0047 }
            r0 = 10
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ InterruptedException -> 0x003f }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x003f }
            goto L_0x0010
        L_0x003f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0010
        L_0x0047:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0047 }
            throw r8
        L_0x004a:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.C23117d.mo58152g(com.vungle.warren.downloader.h):boolean");
    }

    /* renamed from: h */
    public final synchronized void mo58153h(boolean z) {
        this.f58686k = z;
    }

    /* renamed from: i */
    public final synchronized void mo58154i(C23127h hVar) {
        mo58169U(hVar);
    }

    /* renamed from: j */
    public final void mo58155j(C23127h hVar) {
        Runnable runnable;
        DownloadRequestMediator P = mo58164P(hVar);
        if (P != null && (runnable = P.getRunnable()) != null && this.f58679d.remove(runnable)) {
            Objects.toString(P.getPriority());
            this.f58679d.mo53324a(runnable, new C23122e(P));
        }
    }

    /* renamed from: com.vungle.warren.downloader.d$f */
    public static abstract class C23123f implements Comparable, Runnable {

        /* renamed from: e */
        public static final AtomicInteger f58698e = new AtomicInteger();

        /* renamed from: b */
        public final int f58699b = f58698e.incrementAndGet();

        /* renamed from: c */
        public final DownloadRequestMediator f58700c;

        /* renamed from: d */
        public final C23125f f58701d;

        public C23123f(DownloadRequestMediator downloadRequestMediator) {
            this.f58700c = downloadRequestMediator;
            this.f58701d = downloadRequestMediator.priority;
            downloadRequestMediator.setRunnable(this);
        }

        public final int compareTo(Object obj) {
            C23125f fVar;
            C23125f fVar2;
            if (!(obj instanceof C23123f)) {
                return -1;
            }
            C23123f fVar3 = (C23123f) obj;
            DownloadRequestMediator downloadRequestMediator = this.f58700c;
            if (downloadRequestMediator != null) {
                fVar = downloadRequestMediator.getPriority();
            } else {
                fVar = this.f58701d;
            }
            DownloadRequestMediator downloadRequestMediator2 = fVar3.f58700c;
            if (downloadRequestMediator2 != null) {
                fVar2 = downloadRequestMediator2.getPriority();
            } else {
                fVar2 = fVar3.f58701d;
            }
            int compareTo = fVar.compareTo(fVar2);
            if (compareTo == 0) {
                return Integer.valueOf(this.f58699b).compareTo(Integer.valueOf(fVar3.f58699b));
            }
            return compareTo;
        }

        public C23123f(C23125f fVar) {
            this.f58701d = fVar;
            this.f58700c = null;
        }
    }
}
