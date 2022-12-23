package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3331a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3381b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k */
public final class C3345k implements C3331a {

    /* renamed from: a */
    public final File f11978a;

    /* renamed from: b */
    public final C3340f f11979b;

    /* renamed from: c */
    public final HashMap<String, C3341g> f11980c;

    /* renamed from: d */
    public final C3343i f11981d;

    /* renamed from: e */
    public final HashMap<String, ArrayList<C3331a.C3333b>> f11982e;

    /* renamed from: f */
    public long f11983f = 0;

    /* renamed from: g */
    public C3331a.C3332a f11984g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k$a */
    public class C3346a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ ConditionVariable f11985a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3346a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f11985a = conditionVariable;
        }

        public void run() {
            synchronized (C3345k.this) {
                this.f11985a.open();
                try {
                    C3345k.m8436a(C3345k.this);
                } catch (C3331a.C3332a e) {
                    C3345k.this.f11984g = e;
                }
                C3345k.this.f11979b.getClass();
            }
        }
    }

    public C3345k(File file, C3340f fVar, byte[] bArr) {
        this.f11978a = file;
        this.f11979b = fVar;
        this.f11980c = new HashMap<>();
        this.f11981d = new C3343i(file, (byte[]) null);
        this.f11982e = new HashMap<>();
        ConditionVariable conditionVariable = new ConditionVariable();
        new C3346a("SimpleCache.initialize()", conditionVariable).start();
        conditionVariable.block();
    }

    /* renamed from: a */
    public synchronized long mo14460a() {
        return this.f11983f;
    }

    /* renamed from: b */
    public C3341g mo14466b(String str, long j) throws InterruptedException, C3331a.C3332a {
        C3347l d;
        synchronized (this) {
            while (true) {
                d = mo14468c(str, j);
                if (d == null) {
                    wait();
                }
            }
        }
        return d;
    }

    /* renamed from: d */
    public synchronized C3347l mo14468c(String str, long j) throws C3331a.C3332a {
        C3347l lVar;
        C3347l floor;
        C3331a.C3332a aVar = this.f11984g;
        if (aVar == null) {
            C3342h hVar = this.f11981d.f11969a.get(str);
            if (hVar == null) {
                lVar = new C3347l(str, j, -1, -9223372036854775807L, (File) null);
            } else {
                while (true) {
                    C3347l lVar2 = new C3347l(hVar.f11966b, j, -1, -9223372036854775807L, (File) null);
                    floor = hVar.f11967c.floor(lVar2);
                    if (floor == null || floor.f11960b + floor.f11961c <= j) {
                        C3347l ceiling = hVar.f11967c.ceiling(lVar2);
                        if (ceiling == null) {
                            floor = new C3347l(hVar.f11966b, j, -1, -9223372036854775807L, (File) null);
                        } else {
                            floor = new C3347l(hVar.f11966b, j, ceiling.f11960b - j, -9223372036854775807L, (File) null);
                        }
                    }
                    if (!floor.f11962d || floor.f11963e.length() == floor.f11961c) {
                        lVar = floor;
                    } else {
                        mo14495b();
                    }
                }
                lVar = floor;
            }
            if (lVar.f11962d) {
                C3342h hVar2 = this.f11981d.f11969a.get(str);
                C3380a.m8507b(hVar2.f11967c.remove(lVar));
                int i = hVar2.f11965a;
                C3380a.m8507b(lVar.f11962d);
                long currentTimeMillis = System.currentTimeMillis();
                File a = C3347l.m8451a(lVar.f11963e.getParentFile(), i, lVar.f11960b, currentTimeMillis);
                C3347l lVar3 = new C3347l(lVar.f11959a, lVar.f11960b, lVar.f11961c, currentTimeMillis, a);
                if (lVar.f11963e.renameTo(a)) {
                    hVar2.f11967c.add(lVar3);
                    ArrayList arrayList = this.f11982e.get(lVar.f11959a);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((C3331a.C3333b) arrayList.get(size)).mo14470a(this, lVar, lVar3);
                        }
                    }
                    C3344j jVar = (C3344j) this.f11979b;
                    jVar.f11976a.remove(lVar);
                    jVar.f11977b -= lVar.f11961c;
                    jVar.mo14471b(this, lVar3);
                    return lVar3;
                }
                throw new C3331a.C3332a("Renaming of " + lVar.f11963e + " to " + a + " failed.");
            } else if (this.f11980c.containsKey(str)) {
                return null;
            } else {
                this.f11980c.put(str, lVar);
                return lVar;
            }
        } else {
            throw aVar;
        }
    }

    /* renamed from: a */
    public synchronized File mo14462a(String str, long j, long j2) throws C3331a.C3332a {
        File file;
        C3342h hVar;
        C3380a.m8507b(this.f11980c.containsKey(str));
        if (!this.f11978a.exists()) {
            mo14495b();
            this.f11978a.mkdirs();
        }
        ((C3344j) this.f11979b).mo14491a((C3331a) this, j2);
        file = this.f11978a;
        C3343i iVar = this.f11981d;
        hVar = iVar.f11969a.get(str);
        if (hVar == null) {
            hVar = iVar.mo14485a(str, -1);
        }
        return C3347l.m8451a(file, hVar.f11965a, j, System.currentTimeMillis());
    }

    /* renamed from: b */
    public synchronized void mo14467b(C3341g gVar) {
        C3380a.m8507b(gVar == this.f11980c.remove(gVar.f11959a));
        notifyAll();
    }

    /* renamed from: b */
    public final void mo14495b() throws C3331a.C3332a {
        LinkedList linkedList = new LinkedList();
        for (C3342h hVar : this.f11981d.f11969a.values()) {
            Iterator<C3347l> it = hVar.f11967c.iterator();
            while (it.hasNext()) {
                C3341g next = it.next();
                if (next.f11963e.length() != next.f11961c) {
                    linkedList.add(next);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            mo14493a((C3341g) it2.next(), false);
        }
        this.f11981d.mo14488b();
        this.f11981d.mo14490c();
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo14464a(java.io.File r9) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3331a.C3332a {
        /*
            r8 = this;
            monitor-enter(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r0 = r8.f11981d     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l r0 = com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3347l.m8450a(r9, r0)     // Catch:{ all -> 0x0077 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r3 = 1
            goto L_0x000e
        L_0x000d:
            r3 = 0
        L_0x000e:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r3)     // Catch:{ all -> 0x0077 }
            java.util.HashMap<java.lang.String, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g> r3 = r8.f11980c     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = r0.f11959a     // Catch:{ all -> 0x0077 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r3)     // Catch:{ all -> 0x0077 }
            boolean r3 = r9.exists()     // Catch:{ all -> 0x0077 }
            if (r3 != 0) goto L_0x0024
            monitor-exit(r8)
            return
        L_0x0024:
            long r3 = r9.length()     // Catch:{ all -> 0x0077 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0033
            r9.delete()     // Catch:{ all -> 0x0077 }
            monitor-exit(r8)
            return
        L_0x0033:
            java.lang.String r9 = r0.f11959a     // Catch:{ all -> 0x0077 }
            monitor-enter(r8)     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r3 = r8.f11981d     // Catch:{ all -> 0x0074 }
            java.util.HashMap<java.lang.String, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h> r3 = r3.f11969a     // Catch:{ all -> 0x0074 }
            java.lang.Object r9 = r3.get(r9)     // Catch:{ all -> 0x0074 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h r9 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3342h) r9     // Catch:{ all -> 0x0074 }
            r3 = -1
            if (r9 != 0) goto L_0x0046
            r5 = r3
            goto L_0x0048
        L_0x0046:
            long r5 = r9.f11968d     // Catch:{ all -> 0x0074 }
        L_0x0048:
            monitor-exit(r8)     // Catch:{ all -> 0x0077 }
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0077 }
            long r5 = r9.longValue()     // Catch:{ all -> 0x0077 }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0067
            long r3 = r0.f11960b     // Catch:{ all -> 0x0077 }
            long r5 = r0.f11961c     // Catch:{ all -> 0x0077 }
            long r3 = r3 + r5
            long r5 = r9.longValue()     // Catch:{ all -> 0x0077 }
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r1)     // Catch:{ all -> 0x0077 }
        L_0x0067:
            r8.mo14494a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3347l) r0)     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r9 = r8.f11981d     // Catch:{ all -> 0x0077 }
            r9.mo14490c()     // Catch:{ all -> 0x0077 }
            r8.notifyAll()     // Catch:{ all -> 0x0077 }
            monitor-exit(r8)
            return
        L_0x0074:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0077 }
            throw r9     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3345k.mo14464a(java.io.File):void");
    }

    /* renamed from: a */
    public static void m8436a(C3345k kVar) throws C3331a.C3332a {
        if (!kVar.f11978a.exists()) {
            kVar.f11978a.mkdirs();
            return;
        }
        C3343i iVar = kVar.f11981d;
        C3380a.m8507b(!iVar.f11974f);
        if (!iVar.mo14487a()) {
            C3381b bVar = iVar.f11971c;
            bVar.f12086a.delete();
            bVar.f12087b.delete();
            iVar.f11969a.clear();
            iVar.f11970b.clear();
        }
        File[] listFiles = kVar.f11978a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.getName().equals("cached_content_index.exi")) {
                    C3347l a = file.length() > 0 ? C3347l.m8450a(file, kVar.f11981d) : null;
                    if (a != null) {
                        kVar.mo14494a(a);
                    } else {
                        file.delete();
                    }
                }
            }
            kVar.f11981d.mo14488b();
            kVar.f11981d.mo14490c();
        }
    }

    /* renamed from: a */
    public final void mo14494a(C3347l lVar) {
        C3343i iVar = this.f11981d;
        String str = lVar.f11959a;
        C3342h hVar = iVar.f11969a.get(str);
        if (hVar == null) {
            hVar = iVar.mo14485a(str, -1);
        }
        hVar.f11967c.add(lVar);
        this.f11983f += lVar.f11961c;
        ArrayList arrayList = this.f11982e.get(lVar.f11959a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C3331a.C3333b) arrayList.get(size)).mo14471b(this, lVar);
            }
        }
        ((C3344j) this.f11979b).mo14471b(this, lVar);
    }

    /* renamed from: a */
    public final void mo14493a(C3341g gVar, boolean z) throws C3331a.C3332a {
        boolean z2;
        C3342h a = this.f11981d.mo14484a(gVar.f11959a);
        if (a != null) {
            if (a.f11967c.remove(gVar)) {
                gVar.f11963e.delete();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f11983f -= gVar.f11961c;
                if (z && a.f11967c.isEmpty()) {
                    this.f11981d.mo14489b(a.f11966b);
                    this.f11981d.mo14490c();
                }
                ArrayList arrayList = this.f11982e.get(gVar.f11959a);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((C3331a.C3333b) arrayList.get(size)).mo14469a(this, gVar);
                    }
                }
                C3344j jVar = (C3344j) this.f11979b;
                jVar.f11976a.remove(gVar);
                jVar.f11977b -= gVar.f11961c;
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo14463a(C3341g gVar) throws C3331a.C3332a {
        mo14493a(gVar, true);
    }

    /* renamed from: a */
    public synchronized void mo14465a(String str, long j) throws C3331a.C3332a {
        C3343i iVar = this.f11981d;
        C3342h hVar = iVar.f11969a.get(str);
        if (hVar == null) {
            iVar.mo14485a(str, j);
        } else if (hVar.f11968d != j) {
            hVar.f11968d = j;
            iVar.f11974f = true;
        }
        this.f11981d.mo14490c();
    }

    /* renamed from: a */
    public synchronized long mo14461a(String str) {
        long j;
        C3342h hVar = this.f11981d.f11969a.get(str);
        if (hVar == null) {
            j = -1;
        } else {
            j = hVar.f11968d;
        }
        return j;
    }
}
