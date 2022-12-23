package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.appcompat.widget.C0441n1;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.drm.C3920f;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.common.collect.C14439w0;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p100gb.C4978i;
import p161la.C5653b;
import p265tb.C6669s;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6778d;
import p583jk.C17875h;

public final class DefaultDrmSession implements DrmSession {

    /* renamed from: a */
    public final List<DrmInitData.SchemeData> f13653a;

    /* renamed from: b */
    public final C3920f f13654b;

    /* renamed from: c */
    public final C3899a f13655c;

    /* renamed from: d */
    public final C3900b f13656d;

    /* renamed from: e */
    public final int f13657e;

    /* renamed from: f */
    public final boolean f13658f;

    /* renamed from: g */
    public final boolean f13659g;

    /* renamed from: h */
    public final HashMap<String, String> f13660h;

    /* renamed from: i */
    public final C6778d<C3912b.C3913a> f13661i;

    /* renamed from: j */
    public final C6669s f13662j;

    /* renamed from: k */
    public final C3927i f13663k;

    /* renamed from: l */
    public final UUID f13664l;

    /* renamed from: m */
    public final C3903e f13665m;

    /* renamed from: n */
    public int f13666n;

    /* renamed from: o */
    public int f13667o;

    /* renamed from: p */
    public HandlerThread f13668p;

    /* renamed from: q */
    public C3901c f13669q;

    /* renamed from: r */
    public C5653b f13670r;

    /* renamed from: s */
    public DrmSession.DrmSessionException f13671s;

    /* renamed from: t */
    public byte[] f13672t;

    /* renamed from: u */
    public byte[] f13673u;

    /* renamed from: v */
    public C3920f.C3921a f13674v;

    /* renamed from: w */
    public C3920f.C3924d f13675w;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$a */
    public interface C3899a {
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$b */
    public interface C3900b {
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$c */
    public class C3901c extends Handler {

        /* renamed from: a */
        public boolean f13676a;

        public C3901c(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Throwable, java.lang.Exception] */
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
        public final void handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r9.obj
                com.google.android.exoplayer2.drm.DefaultDrmSession$d r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession.C3902d) r0
                r1 = 1
                int r2 = r9.what     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                if (r2 == 0) goto L_0x0023
                if (r2 != r1) goto L_0x001d
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.i r3 = r2.f13663k     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                java.util.UUID r2 = r2.f13664l     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                java.lang.Object r4 = r0.f13680c     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.f$a r4 = (com.google.android.exoplayer2.drm.C3920f.C3921a) r4     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.h r3 = (com.google.android.exoplayer2.drm.C3926h) r3     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                byte[] r1 = r3.mo16020a(r2, r4)     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                goto L_0x00bf
            L_0x001d:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                r2.<init>()     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                throw r2     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
            L_0x0023:
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.i r2 = r2.f13663k     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                java.lang.Object r3 = r0.f13680c     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.f$d r3 = (com.google.android.exoplayer2.drm.C3920f.C3924d) r3     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.h r2 = (com.google.android.exoplayer2.drm.C3926h) r2     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                byte[] r1 = r2.mo16021c(r3)     // Catch:{ MediaDrmCallbackException -> 0x003b, Exception -> 0x0033 }
                goto L_0x00bf
            L_0x0033:
                r1 = move-exception
                java.lang.String r2 = "Key/provisioning request produced an unexpected exception. Not retrying."
                p277ub.C6776b0.m15968a(r2, r1)
                goto L_0x00bf
            L_0x003b:
                r2 = move-exception
                java.lang.Object r3 = r9.obj
                com.google.android.exoplayer2.drm.DefaultDrmSession$d r3 = (com.google.android.exoplayer2.drm.DefaultDrmSession.C3902d) r3
                boolean r4 = r3.f13679b
                if (r4 != 0) goto L_0x0046
                goto L_0x00ba
            L_0x0046:
                int r4 = r3.f13681d
                int r4 = r4 + r1
                r3.f13681d = r4
                com.google.android.exoplayer2.drm.DefaultDrmSession r5 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                tb.s r5 = r5.f13662j
                com.google.android.exoplayer2.upstream.a r5 = (com.google.android.exoplayer2.upstream.C4076a) r5
                r5.getClass()
                r5 = 3
                if (r4 <= r5) goto L_0x0058
                goto L_0x00ba
            L_0x0058:
                gb.i r4 = new gb.i
                android.os.SystemClock.elapsedRealtime()
                android.os.SystemClock.elapsedRealtime()
                java.lang.Throwable r4 = r2.getCause()
                boolean r4 = r4 instanceof java.io.IOException
                if (r4 == 0) goto L_0x006f
                java.lang.Throwable r4 = r2.getCause()
                java.io.IOException r4 = (java.io.IOException) r4
                goto L_0x0078
            L_0x006f:
                com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException r4 = new com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException
                java.lang.Throwable r5 = r2.getCause()
                r4.<init>(r5)
            L_0x0078:
                com.google.android.exoplayer2.drm.DefaultDrmSession r5 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                tb.s r5 = r5.f13662j
                int r3 = r3.f13681d
                com.google.android.exoplayer2.upstream.a r5 = (com.google.android.exoplayer2.upstream.C4076a) r5
                r5.getClass()
                boolean r5 = r4 instanceof com.google.android.exoplayer2.ParserException
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r5 != 0) goto L_0x00a5
                boolean r5 = r4 instanceof java.io.FileNotFoundException
                if (r5 != 0) goto L_0x00a5
                boolean r5 = r4 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
                if (r5 != 0) goto L_0x00a5
                boolean r4 = r4 instanceof com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException
                if (r4 == 0) goto L_0x0099
                goto L_0x00a5
            L_0x0099:
                int r3 = r3 + -1
                int r3 = r3 * 1000
                r4 = 5000(0x1388, float:7.006E-42)
                int r3 = java.lang.Math.min(r3, r4)
                long r3 = (long) r3
                goto L_0x00a6
            L_0x00a5:
                r3 = r6
            L_0x00a6:
                int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r5 != 0) goto L_0x00ab
                goto L_0x00ba
            L_0x00ab:
                monitor-enter(r8)
                boolean r5 = r8.f13676a     // Catch:{ all -> 0x00e5 }
                if (r5 != 0) goto L_0x00b9
                android.os.Message r5 = android.os.Message.obtain(r9)     // Catch:{ all -> 0x00e5 }
                r8.sendMessageDelayed(r5, r3)     // Catch:{ all -> 0x00e5 }
                monitor-exit(r8)     // Catch:{ all -> 0x00e5 }
                goto L_0x00bb
            L_0x00b9:
                monitor-exit(r8)     // Catch:{ all -> 0x00e5 }
            L_0x00ba:
                r1 = 0
            L_0x00bb:
                if (r1 == 0) goto L_0x00be
                return
            L_0x00be:
                r1 = r2
            L_0x00bf:
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                tb.s r2 = r2.f13662j
                long r3 = r0.f13678a
                r2.getClass()
                monitor-enter(r8)
                boolean r2 = r8.f13676a     // Catch:{ all -> 0x00e2 }
                if (r2 != 0) goto L_0x00e0
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ all -> 0x00e2 }
                com.google.android.exoplayer2.drm.DefaultDrmSession$e r2 = r2.f13665m     // Catch:{ all -> 0x00e2 }
                int r9 = r9.what     // Catch:{ all -> 0x00e2 }
                java.lang.Object r0 = r0.f13680c     // Catch:{ all -> 0x00e2 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x00e2 }
                android.os.Message r9 = r2.obtainMessage(r9, r0)     // Catch:{ all -> 0x00e2 }
                r9.sendToTarget()     // Catch:{ all -> 0x00e2 }
            L_0x00e0:
                monitor-exit(r8)     // Catch:{ all -> 0x00e2 }
                return
            L_0x00e2:
                r9 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x00e2 }
                throw r9
            L_0x00e5:
                r9 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x00e5 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.C3901c.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$d */
    public static final class C3902d {

        /* renamed from: a */
        public final long f13678a;

        /* renamed from: b */
        public final boolean f13679b;

        /* renamed from: c */
        public final Object f13680c;

        /* renamed from: d */
        public int f13681d;

        public C3902d(long j, boolean z, long j2, Object obj) {
            this.f13678a = j;
            this.f13679b = z;
            this.f13680c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$e */
    public class C3903e extends Handler {
        public C3903e(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Set<E> set;
            Set<E> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj != defaultDrmSession.f13675w) {
                    return;
                }
                if (defaultDrmSession.f13666n == 2 || defaultDrmSession.mo15960h()) {
                    defaultDrmSession.f13675w = null;
                    if (obj2 instanceof Exception) {
                        ((DefaultDrmSessionManager.C3907d) defaultDrmSession.f13655c).mo15978a((Exception) obj2);
                        return;
                    }
                    try {
                        defaultDrmSession.f13654b.mo16013g((byte[]) obj2);
                        DefaultDrmSessionManager.C3907d dVar = (DefaultDrmSessionManager.C3907d) defaultDrmSession.f13655c;
                        dVar.f13713b = null;
                        ImmutableList z = ImmutableList.m35691z(dVar.f13712a);
                        dVar.f13712a.clear();
                        C14439w0 u = z.iterator();
                        while (u.hasNext()) {
                            DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) u.next();
                            if (defaultDrmSession2.mo15962j()) {
                                defaultDrmSession2.mo15958g(true);
                            }
                        }
                    } catch (Exception e) {
                        ((DefaultDrmSessionManager.C3907d) defaultDrmSession.f13655c).mo15978a(e);
                    }
                }
            } else if (i == 1) {
                DefaultDrmSession defaultDrmSession3 = DefaultDrmSession.this;
                if (obj == defaultDrmSession3.f13674v && defaultDrmSession3.mo15960h()) {
                    defaultDrmSession3.f13674v = null;
                    if (obj2 instanceof Exception) {
                        Exception exc = (Exception) obj2;
                        if (exc instanceof NotProvisionedException) {
                            DefaultDrmSessionManager.C3907d dVar2 = (DefaultDrmSessionManager.C3907d) defaultDrmSession3.f13655c;
                            dVar2.f13712a.add(defaultDrmSession3);
                            if (dVar2.f13713b == null) {
                                dVar2.f13713b = defaultDrmSession3;
                                C3920f.C3924d d = defaultDrmSession3.f13654b.mo16010d();
                                defaultDrmSession3.f13675w = d;
                                C3901c cVar = defaultDrmSession3.f13669q;
                                int i2 = C6774a0.f20959a;
                                d.getClass();
                                cVar.getClass();
                                cVar.obtainMessage(0, new C3902d(C4978i.f16828b.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
                                return;
                            }
                            return;
                        }
                        defaultDrmSession3.mo15961i(exc);
                        return;
                    }
                    try {
                        byte[] bArr = (byte[]) obj2;
                        if (defaultDrmSession3.f13657e == 3) {
                            C3920f fVar = defaultDrmSession3.f13654b;
                            byte[] bArr2 = defaultDrmSession3.f13673u;
                            int i3 = C6774a0.f20959a;
                            fVar.mo16016j(bArr2, bArr);
                            C6778d<C3912b.C3913a> dVar3 = defaultDrmSession3.f13661i;
                            synchronized (dVar3.f20974b) {
                                set2 = dVar3.f20976d;
                            }
                            for (E b : set2) {
                                b.mo16002b();
                            }
                            return;
                        }
                        byte[] j = defaultDrmSession3.f13654b.mo16016j(defaultDrmSession3.f13672t, bArr);
                        int i4 = defaultDrmSession3.f13657e;
                        if (!((i4 != 2 && (i4 != 0 || defaultDrmSession3.f13673u == null)) || j == null || j.length == 0)) {
                            defaultDrmSession3.f13673u = j;
                        }
                        defaultDrmSession3.f13666n = 4;
                        C6778d<C3912b.C3913a> dVar4 = defaultDrmSession3.f13661i;
                        synchronized (dVar4.f20974b) {
                            set = dVar4.f20976d;
                        }
                        for (E a : set) {
                            a.mo16001a();
                        }
                    } catch (Exception e2) {
                        if (e2 instanceof NotProvisionedException) {
                            DefaultDrmSessionManager.C3907d dVar5 = (DefaultDrmSessionManager.C3907d) defaultDrmSession3.f13655c;
                            dVar5.f13712a.add(defaultDrmSession3);
                            if (dVar5.f13713b == null) {
                                dVar5.f13713b = defaultDrmSession3;
                                C3920f.C3924d d2 = defaultDrmSession3.f13654b.mo16010d();
                                defaultDrmSession3.f13675w = d2;
                                C3901c cVar2 = defaultDrmSession3.f13669q;
                                int i5 = C6774a0.f20959a;
                                d2.getClass();
                                cVar2.getClass();
                                cVar2.obtainMessage(0, new C3902d(C4978i.f16828b.getAndIncrement(), true, SystemClock.elapsedRealtime(), d2)).sendToTarget();
                                return;
                            }
                            return;
                        }
                        defaultDrmSession3.mo15961i(e2);
                    }
                }
            }
        }
    }

    public DefaultDrmSession(UUID uuid, C3920f fVar, DefaultDrmSessionManager.C3907d dVar, DefaultDrmSessionManager.C3908e eVar, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap hashMap, C3927i iVar, Looper looper, C6669s sVar) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.f13664l = uuid;
        this.f13655c = dVar;
        this.f13656d = eVar;
        this.f13654b = fVar;
        this.f13657e = i;
        this.f13658f = z;
        this.f13659g = z2;
        if (bArr != null) {
            this.f13673u = bArr;
            this.f13653a = null;
        } else {
            list.getClass();
            this.f13653a = Collections.unmodifiableList(list);
        }
        this.f13660h = hashMap;
        this.f13663k = iVar;
        this.f13661i = new C6778d<>();
        this.f13662j = sVar;
        this.f13666n = 2;
        this.f13665m = new C3903e(looper);
    }

    /* renamed from: a */
    public final DrmSession.DrmSessionException mo15952a() {
        if (this.f13666n == 1) {
            return this.f13671s;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo15953b(C3912b.C3913a aVar) {
        boolean z;
        int i;
        boolean z2 = false;
        if (this.f13667o >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        if (aVar != null) {
            C6778d<C3912b.C3913a> dVar = this.f13661i;
            synchronized (dVar.f20974b) {
                ArrayList arrayList = new ArrayList(dVar.f20977e);
                arrayList.add(aVar);
                dVar.f20977e = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) dVar.f20975c.get(aVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(dVar.f20976d);
                    hashSet.add(aVar);
                    dVar.f20976d = Collections.unmodifiableSet(hashSet);
                }
                HashMap hashMap = dVar.f20975c;
                if (num != null) {
                    i = num.intValue() + 1;
                } else {
                    i = 1;
                }
                hashMap.put(aVar, Integer.valueOf(i));
            }
        }
        int i2 = this.f13667o + 1;
        this.f13667o = i2;
        if (i2 == 1) {
            if (this.f13666n == 2) {
                z2 = true;
            }
            C17875h.m44304o(z2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f13668p = handlerThread;
            handlerThread.start();
            this.f13669q = new C3901c(this.f13668p.getLooper());
            if (mo15962j()) {
                mo15958g(true);
            }
        } else if (aVar != null && mo15960h() && this.f13661i.mo22946a(aVar) == 1) {
            aVar.mo16004d(this.f13666n);
        }
        DefaultDrmSessionManager.C3908e eVar = (DefaultDrmSessionManager.C3908e) this.f13656d;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.f13693l != -9223372036854775807L) {
            defaultDrmSessionManager.f13696o.remove(this);
            Handler handler = DefaultDrmSessionManager.this.f13702u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: c */
    public final void mo15954c(C3912b.C3913a aVar) {
        boolean z;
        if (this.f13667o > 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        int i = this.f13667o - 1;
        this.f13667o = i;
        if (i == 0) {
            this.f13666n = 0;
            C3903e eVar = this.f13665m;
            int i2 = C6774a0.f20959a;
            eVar.removeCallbacksAndMessages((Object) null);
            C3901c cVar = this.f13669q;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages((Object) null);
                cVar.f13676a = true;
            }
            this.f13669q = null;
            this.f13668p.quit();
            this.f13668p = null;
            this.f13670r = null;
            this.f13671s = null;
            this.f13674v = null;
            this.f13675w = null;
            byte[] bArr = this.f13672t;
            if (bArr != null) {
                this.f13654b.mo16015i(bArr);
                this.f13672t = null;
            }
        }
        if (aVar != null) {
            C6778d<C3912b.C3913a> dVar = this.f13661i;
            synchronized (dVar.f20974b) {
                Integer num = (Integer) dVar.f20975c.get(aVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(dVar.f20977e);
                    arrayList.remove(aVar);
                    dVar.f20977e = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        dVar.f20975c.remove(aVar);
                        HashSet hashSet = new HashSet(dVar.f20976d);
                        hashSet.remove(aVar);
                        dVar.f20976d = Collections.unmodifiableSet(hashSet);
                    } else {
                        dVar.f20975c.put(aVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.f13661i.mo22946a(aVar) == 0) {
                aVar.mo16006f();
            }
        }
        C3900b bVar = this.f13656d;
        int i3 = this.f13667o;
        DefaultDrmSessionManager.C3908e eVar2 = (DefaultDrmSessionManager.C3908e) bVar;
        if (i3 == 1) {
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager.f13697p > 0 && defaultDrmSessionManager.f13693l != -9223372036854775807L) {
                defaultDrmSessionManager.f13696o.add(this);
                Handler handler = DefaultDrmSessionManager.this.f13702u;
                handler.getClass();
                handler.postAtTime(new C0441n1(this, 7), this, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f13693l);
                DefaultDrmSessionManager.this.mo15975k();
            }
        }
        if (i3 == 0) {
            DefaultDrmSessionManager.this.f13694m.remove(this);
            DefaultDrmSessionManager defaultDrmSessionManager2 = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager2.f13699r == this) {
                defaultDrmSessionManager2.f13699r = null;
            }
            if (defaultDrmSessionManager2.f13700s == this) {
                defaultDrmSessionManager2.f13700s = null;
            }
            DefaultDrmSessionManager.C3907d dVar2 = defaultDrmSessionManager2.f13690i;
            dVar2.f13712a.remove(this);
            if (dVar2.f13713b == this) {
                dVar2.f13713b = null;
                if (!dVar2.f13712a.isEmpty()) {
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) dVar2.f13712a.iterator().next();
                    dVar2.f13713b = defaultDrmSession;
                    C3920f.C3924d d = defaultDrmSession.f13654b.mo16010d();
                    defaultDrmSession.f13675w = d;
                    C3901c cVar2 = defaultDrmSession.f13669q;
                    int i4 = C6774a0.f20959a;
                    d.getClass();
                    cVar2.getClass();
                    cVar2.obtainMessage(0, new C3902d(C4978i.f16828b.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
                }
            }
            DefaultDrmSessionManager defaultDrmSessionManager3 = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager3.f13693l != -9223372036854775807L) {
                Handler handler2 = defaultDrmSessionManager3.f13702u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                DefaultDrmSessionManager.this.f13696o.remove(this);
            }
        }
        DefaultDrmSessionManager.this.mo15975k();
    }

    /* renamed from: d */
    public final UUID mo15955d() {
        return this.f13664l;
    }

    /* renamed from: e */
    public final boolean mo15956e() {
        return this.f13658f;
    }

    /* renamed from: f */
    public final C5653b mo15957f() {
        return this.f13670r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098 A[Catch:{ NumberFormatException -> 0x009c }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15958g(boolean r10) {
        /*
            r9 = this;
            boolean r0 = r9.f13659g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte[] r0 = r9.f13672t
            int r1 = p277ub.C6774a0.f20959a
            int r1 = r9.f13657e
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r4) goto L_0x0040
            if (r1 == r2) goto L_0x002a
            r0 = 3
            if (r1 == r0) goto L_0x0019
            goto L_0x00f6
        L_0x0019:
            byte[] r1 = r9.f13673u
            r1.getClass()
            byte[] r1 = r9.f13672t
            r1.getClass()
            byte[] r1 = r9.f13673u
            r9.mo15963k(r1, r0, r10)
            goto L_0x00f6
        L_0x002a:
            byte[] r1 = r9.f13673u
            if (r1 == 0) goto L_0x003b
            com.google.android.exoplayer2.drm.f r5 = r9.f13654b     // Catch:{ Exception -> 0x0035 }
            r5.mo16012f(r0, r1)     // Catch:{ Exception -> 0x0035 }
            r3 = 1
            goto L_0x0039
        L_0x0035:
            r1 = move-exception
            r9.mo15961i(r1)
        L_0x0039:
            if (r3 == 0) goto L_0x00f6
        L_0x003b:
            r9.mo15963k(r0, r2, r10)
            goto L_0x00f6
        L_0x0040:
            byte[] r1 = r9.f13673u
            if (r1 != 0) goto L_0x0049
            r9.mo15963k(r0, r4, r10)
            goto L_0x00f6
        L_0x0049:
            int r5 = r9.f13666n
            r6 = 4
            if (r5 == r6) goto L_0x005b
            com.google.android.exoplayer2.drm.f r5 = r9.f13654b     // Catch:{ Exception -> 0x0055 }
            r5.mo16012f(r0, r1)     // Catch:{ Exception -> 0x0055 }
            r3 = 1
            goto L_0x0059
        L_0x0055:
            r1 = move-exception
            r9.mo15961i(r1)
        L_0x0059:
            if (r3 == 0) goto L_0x00f6
        L_0x005b:
            java.util.UUID r1 = p099ga.C4883f.f16444d
            java.util.UUID r3 = r9.f13664l
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x006b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00bb
        L_0x006b:
            java.util.Map r1 = r9.mo15964l()
            if (r1 != 0) goto L_0x0073
            r1 = 0
            goto L_0x00a4
        L_0x0073:
            android.util.Pair r3 = new android.util.Pair
            java.lang.String r4 = "LicenseDurationRemaining"
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r4 = r1.get(r4)     // Catch:{ NumberFormatException -> 0x0089 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NumberFormatException -> 0x0089 }
            if (r4 == 0) goto L_0x0089
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0089 }
            goto L_0x008a
        L_0x0089:
            r4 = r7
        L_0x008a:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r5)     // Catch:{ NumberFormatException -> 0x009c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x009c }
            if (r1 == 0) goto L_0x009c
            long r7 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x009c }
        L_0x009c:
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r3.<init>(r4, r1)
            r1 = r3
        L_0x00a4:
            r1.getClass()
            java.lang.Object r3 = r1.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            long r3 = java.lang.Math.min(r3, r7)
        L_0x00bb:
            int r1 = r9.f13657e
            if (r1 != 0) goto L_0x00c9
            r7 = 60
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x00c9
            r9.mo15963k(r0, r2, r10)
            goto L_0x00f6
        L_0x00c9:
            r0 = 0
            int r10 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00d8
            com.google.android.exoplayer2.drm.KeysExpiredException r10 = new com.google.android.exoplayer2.drm.KeysExpiredException
            r10.<init>()
            r9.mo15961i(r10)
            goto L_0x00f6
        L_0x00d8:
            r9.f13666n = r6
            ub.d<com.google.android.exoplayer2.drm.b$a> r10 = r9.f13661i
            java.lang.Object r0 = r10.f20974b
            monitor-enter(r0)
            java.util.Set<E> r10 = r10.f20976d     // Catch:{ all -> 0x00f7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f7 }
            java.util.Iterator r10 = r10.iterator()
        L_0x00e6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r10.next()
            com.google.android.exoplayer2.drm.b$a r0 = (com.google.android.exoplayer2.drm.C3912b.C3913a) r0
            r0.mo16003c()
            goto L_0x00e6
        L_0x00f6:
            return
        L_0x00f7:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f7 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.mo15958g(boolean):void");
    }

    public final int getState() {
        return this.f13666n;
    }

    /* renamed from: h */
    public final boolean mo15960h() {
        int i = this.f13666n;
        return i == 3 || i == 4;
    }

    /* renamed from: i */
    public final void mo15961i(Exception exc) {
        Set<E> set;
        this.f13671s = new DrmSession.DrmSessionException(exc);
        C6776b0.m15968a("DRM session error", exc);
        C6778d<C3912b.C3913a> dVar = this.f13661i;
        synchronized (dVar.f20974b) {
            set = dVar.f20976d;
        }
        for (E e : set) {
            e.mo16005e(exc);
        }
        if (this.f13666n != 4) {
            this.f13666n = 1;
        }
    }

    /* renamed from: j */
    public final boolean mo15962j() {
        Set<E> set;
        if (mo15960h()) {
            return true;
        }
        try {
            byte[] e = this.f13654b.mo16011e();
            this.f13672t = e;
            this.f13670r = this.f13654b.mo16009c(e);
            this.f13666n = 3;
            C6778d<C3912b.C3913a> dVar = this.f13661i;
            synchronized (dVar.f20974b) {
                set = dVar.f20976d;
            }
            for (E d : set) {
                d.mo16004d(3);
            }
            this.f13672t.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            DefaultDrmSessionManager.C3907d dVar2 = (DefaultDrmSessionManager.C3907d) this.f13655c;
            dVar2.f13712a.add(this);
            if (dVar2.f13713b == null) {
                dVar2.f13713b = this;
                C3920f.C3924d d2 = this.f13654b.mo16010d();
                this.f13675w = d2;
                C3901c cVar = this.f13669q;
                int i = C6774a0.f20959a;
                d2.getClass();
                cVar.getClass();
                cVar.obtainMessage(0, new C3902d(C4978i.f16828b.getAndIncrement(), true, SystemClock.elapsedRealtime(), d2)).sendToTarget();
            }
        } catch (Exception e2) {
            mo15961i(e2);
        }
        return false;
    }

    /* renamed from: k */
    public final void mo15963k(byte[] bArr, int i, boolean z) {
        try {
            C3920f.C3921a k = this.f13654b.mo16017k(bArr, this.f13653a, i, this.f13660h);
            this.f13674v = k;
            C3901c cVar = this.f13669q;
            int i2 = C6774a0.f20959a;
            k.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new C3902d(C4978i.f16828b.getAndIncrement(), z, SystemClock.elapsedRealtime(), k)).sendToTarget();
        } catch (Exception e) {
            if (e instanceof NotProvisionedException) {
                DefaultDrmSessionManager.C3907d dVar = (DefaultDrmSessionManager.C3907d) this.f13655c;
                dVar.f13712a.add(this);
                if (dVar.f13713b == null) {
                    dVar.f13713b = this;
                    C3920f.C3924d d = this.f13654b.mo16010d();
                    this.f13675w = d;
                    C3901c cVar2 = this.f13669q;
                    int i3 = C6774a0.f20959a;
                    d.getClass();
                    cVar2.getClass();
                    cVar2.obtainMessage(0, new C3902d(C4978i.f16828b.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
                    return;
                }
                return;
            }
            mo15961i(e);
        }
    }

    /* renamed from: l */
    public final Map<String, String> mo15964l() {
        byte[] bArr = this.f13672t;
        if (bArr == null) {
            return null;
        }
        return this.f13654b.mo16008b(bArr);
    }
}
