package ki0;

import hi0.C23518a;
import hi0.C23534e;
import hi0.C23539f0;
import hi0.C23550n;
import ii0.C23610d;
import ki0.C23801g;

/* renamed from: ki0.d */
public final class C23798d {

    /* renamed from: a */
    public final C23803h f60107a;

    /* renamed from: b */
    public final C23518a f60108b;

    /* renamed from: c */
    public final C23800f f60109c;

    /* renamed from: d */
    public final C23550n f60110d;

    /* renamed from: e */
    public C23801g.C23802a f60111e;

    /* renamed from: f */
    public final C23801g f60112f;

    /* renamed from: g */
    public C23799e f60113g;

    /* renamed from: h */
    public boolean f60114h;

    /* renamed from: i */
    public C23539f0 f60115i;

    public C23798d(C23803h hVar, C23800f fVar, C23518a aVar, C23534e eVar, C23550n nVar) {
        this.f60107a = hVar;
        this.f60109c = fVar;
        this.f60108b = aVar;
        this.f60110d = nVar;
        this.f60112f = new C23801g(aVar, fVar.f60137e, eVar, nVar);
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final ki0.C23799e mo59031a(int r17, int r18, int r19, int r20, boolean r21) throws java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            ki0.f r2 = r1.f60109c
            monitor-enter(r2)
            ki0.h r0 = r1.f60107a     // Catch:{ all -> 0x034f }
            ki0.f r3 = r0.f60149b     // Catch:{ all -> 0x034f }
            monitor-enter(r3)     // Catch:{ all -> 0x034f }
            boolean r0 = r0.f60160m     // Catch:{ all -> 0x034c }
            monitor-exit(r3)     // Catch:{ all -> 0x034c }
            if (r0 != 0) goto L_0x0344
            r0 = 0
            r1.f60114h = r0     // Catch:{ all -> 0x034f }
            ki0.h r3 = r1.f60107a     // Catch:{ all -> 0x034f }
            ki0.e r4 = r3.f60156i     // Catch:{ all -> 0x034f }
            r5 = 0
            if (r4 == 0) goto L_0x0022
            boolean r6 = r4.f60125k     // Catch:{ all -> 0x034f }
            if (r6 == 0) goto L_0x0022
            java.net.Socket r3 = r3.mo59054f()     // Catch:{ all -> 0x034f }
            goto L_0x0023
        L_0x0022:
            r3 = r5
        L_0x0023:
            ki0.h r6 = r1.f60107a     // Catch:{ all -> 0x034f }
            ki0.e r7 = r6.f60156i     // Catch:{ all -> 0x034f }
            if (r7 == 0) goto L_0x002b
            r4 = r5
            goto L_0x002c
        L_0x002b:
            r7 = r5
        L_0x002c:
            r8 = 1
            if (r7 != 0) goto L_0x0055
            ki0.f r9 = r1.f60109c     // Catch:{ all -> 0x034f }
            hi0.a r10 = r1.f60108b     // Catch:{ all -> 0x034f }
            boolean r6 = r9.mo59048c(r10, r6, r5, r0)     // Catch:{ all -> 0x034f }
            if (r6 == 0) goto L_0x0041
            ki0.h r6 = r1.f60107a     // Catch:{ all -> 0x034f }
            ki0.e r7 = r6.f60156i     // Catch:{ all -> 0x034f }
            r6 = 1
            r9 = r7
            r7 = r5
            goto L_0x005a
        L_0x0041:
            hi0.f0 r6 = r1.f60115i     // Catch:{ all -> 0x034f }
            if (r6 == 0) goto L_0x0048
            r1.f60115i = r5     // Catch:{ all -> 0x034f }
            goto L_0x0056
        L_0x0048:
            boolean r6 = r16.mo59034d()     // Catch:{ all -> 0x034f }
            if (r6 == 0) goto L_0x0055
            ki0.h r6 = r1.f60107a     // Catch:{ all -> 0x034f }
            ki0.e r6 = r6.f60156i     // Catch:{ all -> 0x034f }
            hi0.f0 r6 = r6.f60117c     // Catch:{ all -> 0x034f }
            goto L_0x0056
        L_0x0055:
            r6 = r5
        L_0x0056:
            r9 = 0
            r9 = r7
            r7 = r6
            r6 = 0
        L_0x005a:
            monitor-exit(r2)     // Catch:{ all -> 0x034f }
            ii0.C23610d.m57797e(r3)
            if (r4 == 0) goto L_0x0065
            hi0.n r2 = r1.f60110d
            r2.getClass()
        L_0x0065:
            if (r6 == 0) goto L_0x006c
            hi0.n r2 = r1.f60110d
            r2.getClass()
        L_0x006c:
            if (r9 == 0) goto L_0x006f
            return r9
        L_0x006f:
            if (r7 != 0) goto L_0x0259
            ki0.g$a r2 = r1.f60111e
            if (r2 == 0) goto L_0x0084
            int r3 = r2.f60147b
            java.util.List<hi0.f0> r2 = r2.f60146a
            int r2 = r2.size()
            if (r3 >= r2) goto L_0x0081
            r2 = 1
            goto L_0x0082
        L_0x0081:
            r2 = 0
        L_0x0082:
            if (r2 != 0) goto L_0x0259
        L_0x0084:
            ki0.g r2 = r1.f60112f
            int r3 = r2.f60143e
            java.util.List<java.net.Proxy> r4 = r2.f60142d
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0092
            r3 = 1
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 != 0) goto L_0x00a0
            java.util.ArrayList r3 = r2.f60145g
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r3 = 0
            goto L_0x00a1
        L_0x00a0:
            r3 = 1
        L_0x00a1:
            if (r3 == 0) goto L_0x0253
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x00a8:
            int r4 = r2.f60143e
            java.util.List<java.net.Proxy> r10 = r2.f60142d
            int r10 = r10.size()
            if (r4 >= r10) goto L_0x00b4
            r4 = 1
            goto L_0x00b5
        L_0x00b4:
            r4 = 0
        L_0x00b5:
            if (r4 == 0) goto L_0x023a
            int r4 = r2.f60143e
            java.util.List<java.net.Proxy> r10 = r2.f60142d
            int r10 = r10.size()
            if (r4 >= r10) goto L_0x00c3
            r4 = 1
            goto L_0x00c4
        L_0x00c3:
            r4 = 0
        L_0x00c4:
            java.lang.String r10 = "No route to "
            if (r4 == 0) goto L_0x0219
            java.util.List<java.net.Proxy> r4 = r2.f60142d
            int r11 = r2.f60143e
            int r12 = r11 + 1
            r2.f60143e = r12
            java.lang.Object r4 = r4.get(r11)
            java.net.Proxy r4 = (java.net.Proxy) r4
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r2.f60144f = r11
            java.net.Proxy$Type r11 = r4.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.DIRECT
            if (r11 == r12) goto L_0x0123
            java.net.Proxy$Type r11 = r4.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.SOCKS
            if (r11 != r12) goto L_0x00ee
            goto L_0x0123
        L_0x00ee:
            java.net.SocketAddress r11 = r4.address()
            boolean r12 = r11 instanceof java.net.InetSocketAddress
            if (r12 == 0) goto L_0x010c
            java.net.InetSocketAddress r11 = (java.net.InetSocketAddress) r11
            java.net.InetAddress r12 = r11.getAddress()
            if (r12 != 0) goto L_0x0103
            java.lang.String r12 = r11.getHostName()
            goto L_0x0107
        L_0x0103:
            java.lang.String r12 = r12.getHostAddress()
        L_0x0107:
            int r11 = r11.getPort()
            goto L_0x012b
        L_0x010c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.Class r3 = r11.getClass()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0123:
            hi0.a r11 = r2.f60139a
            hi0.r r11 = r11.f59369a
            java.lang.String r12 = r11.f59537d
            int r11 = r11.f59538e
        L_0x012b:
            if (r11 < r8) goto L_0x01f7
            r8 = 65535(0xffff, float:9.1834E-41)
            if (r11 > r8) goto L_0x01f7
            java.net.Proxy$Type r8 = r4.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r8 != r10) goto L_0x0144
            java.util.List<java.net.InetSocketAddress> r8 = r2.f60144f
            java.net.InetSocketAddress r10 = java.net.InetSocketAddress.createUnresolved(r12, r11)
            r8.add(r10)
            goto L_0x0181
        L_0x0144:
            hi0.n r8 = r2.f60141c
            r8.getClass()
            hi0.a r8 = r2.f60139a
            hi0.m r8 = r8.f59370b
            com.facebook.appevents.l r8 = (com.facebook.appevents.C2342l) r8
            r8.getClass()
            if (r12 == 0) goto L_0x01ef
            java.net.InetAddress[] r8 = java.net.InetAddress.getAllByName(r12)     // Catch:{ NullPointerException -> 0x01df }
            java.util.List r8 = java.util.Arrays.asList(r8)     // Catch:{ NullPointerException -> 0x01df }
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L_0x01c1
            hi0.n r10 = r2.f60141c
            r10.getClass()
            int r10 = r8.size()
            r12 = 0
        L_0x016c:
            if (r12 >= r10) goto L_0x0181
            java.lang.Object r13 = r8.get(r12)
            java.net.InetAddress r13 = (java.net.InetAddress) r13
            java.util.List<java.net.InetSocketAddress> r14 = r2.f60144f
            java.net.InetSocketAddress r15 = new java.net.InetSocketAddress
            r15.<init>(r13, r11)
            r14.add(r15)
            int r12 = r12 + 1
            goto L_0x016c
        L_0x0181:
            java.util.List<java.net.InetSocketAddress> r8 = r2.f60144f
            int r8 = r8.size()
            r10 = 0
        L_0x0188:
            if (r10 >= r8) goto L_0x01b6
            hi0.f0 r11 = new hi0.f0
            hi0.a r12 = r2.f60139a
            java.util.List<java.net.InetSocketAddress> r13 = r2.f60144f
            java.lang.Object r13 = r13.get(r10)
            java.net.InetSocketAddress r13 = (java.net.InetSocketAddress) r13
            r11.<init>(r12, r4, r13)
            androidx.lifecycle.u r12 = r2.f60140b
            monitor-enter(r12)
            java.lang.Object r13 = r12.f3985a     // Catch:{ all -> 0x01b3 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x01b3 }
            boolean r13 = r13.contains(r11)     // Catch:{ all -> 0x01b3 }
            monitor-exit(r12)
            if (r13 == 0) goto L_0x01ad
            java.util.ArrayList r12 = r2.f60145g
            r12.add(r11)
            goto L_0x01b0
        L_0x01ad:
            r3.add(r11)
        L_0x01b0:
            int r10 = r10 + 1
            goto L_0x0188
        L_0x01b3:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x01b6:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x01be
            goto L_0x023a
        L_0x01be:
            r8 = 1
            goto L_0x00a8
        L_0x01c1:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            hi0.a r2 = r2.f60139a
            hi0.m r2 = r2.f59370b
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x01df:
            r0 = move-exception
            java.net.UnknownHostException r2 = new java.net.UnknownHostException
            java.lang.String r3 = "Broken system behaviour for dns lookup of "
            java.lang.String r3 = p379.C25541a.m63881k(r3, r12)
            r2.<init>(r3)
            r2.initCause(r0)
            throw r2
        L_0x01ef:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r2 = "hostname == null"
            r0.<init>(r2)
            throw r0
        L_0x01f7:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r12)
            java.lang.String r3 = ":"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0219:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r10)
            hi0.a r4 = r2.f60139a
            hi0.r r4 = r4.f59369a
            java.lang.String r4 = r4.f59537d
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<java.net.Proxy> r2 = r2.f60142d
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x023a:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x024a
            java.util.ArrayList r4 = r2.f60145g
            r3.addAll(r4)
            java.util.ArrayList r2 = r2.f60145g
            r2.clear()
        L_0x024a:
            ki0.g$a r2 = new ki0.g$a
            r2.<init>(r3)
            r1.f60111e = r2
            r2 = 1
            goto L_0x025a
        L_0x0253:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0259:
            r2 = 0
        L_0x025a:
            ki0.f r3 = r1.f60109c
            monitor-enter(r3)
            ki0.h r4 = r1.f60107a     // Catch:{ all -> 0x0341 }
            ki0.f r8 = r4.f60149b     // Catch:{ all -> 0x0341 }
            monitor-enter(r8)     // Catch:{ all -> 0x0341 }
            boolean r4 = r4.f60160m     // Catch:{ all -> 0x033e }
            monitor-exit(r8)     // Catch:{ all -> 0x033e }
            if (r4 != 0) goto L_0x0336
            if (r2 == 0) goto L_0x0287
            ki0.g$a r2 = r1.f60111e     // Catch:{ all -> 0x0341 }
            r2.getClass()     // Catch:{ all -> 0x0341 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0341 }
            java.util.List<hi0.f0> r2 = r2.f60146a     // Catch:{ all -> 0x0341 }
            r4.<init>(r2)     // Catch:{ all -> 0x0341 }
            ki0.f r2 = r1.f60109c     // Catch:{ all -> 0x0341 }
            hi0.a r8 = r1.f60108b     // Catch:{ all -> 0x0341 }
            ki0.h r10 = r1.f60107a     // Catch:{ all -> 0x0341 }
            boolean r2 = r2.mo59048c(r8, r10, r4, r0)     // Catch:{ all -> 0x0341 }
            if (r2 == 0) goto L_0x0288
            ki0.h r2 = r1.f60107a     // Catch:{ all -> 0x0341 }
            ki0.e r9 = r2.f60156i     // Catch:{ all -> 0x0341 }
            r6 = 1
            goto L_0x0288
        L_0x0287:
            r4 = r5
        L_0x0288:
            if (r6 != 0) goto L_0x02ba
            if (r7 != 0) goto L_0x02b1
            ki0.g$a r2 = r1.f60111e     // Catch:{ all -> 0x0341 }
            int r7 = r2.f60147b     // Catch:{ all -> 0x0341 }
            java.util.List<hi0.f0> r8 = r2.f60146a     // Catch:{ all -> 0x0341 }
            int r8 = r8.size()     // Catch:{ all -> 0x0341 }
            if (r7 >= r8) goto L_0x0299
            r0 = 1
        L_0x0299:
            if (r0 == 0) goto L_0x02ab
            java.util.List<hi0.f0> r0 = r2.f60146a     // Catch:{ all -> 0x0341 }
            int r7 = r2.f60147b     // Catch:{ all -> 0x0341 }
            int r8 = r7 + 1
            r2.f60147b = r8     // Catch:{ all -> 0x0341 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0341 }
            r7 = r0
            hi0.f0 r7 = (hi0.C23539f0) r7     // Catch:{ all -> 0x0341 }
            goto L_0x02b1
        L_0x02ab:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0341 }
            r0.<init>()     // Catch:{ all -> 0x0341 }
            throw r0     // Catch:{ all -> 0x0341 }
        L_0x02b1:
            ki0.e r9 = new ki0.e     // Catch:{ all -> 0x0341 }
            ki0.f r0 = r1.f60109c     // Catch:{ all -> 0x0341 }
            r9.<init>(r0, r7)     // Catch:{ all -> 0x0341 }
            r1.f60113g = r9     // Catch:{ all -> 0x0341 }
        L_0x02ba:
            r0 = r9
            monitor-exit(r3)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x02c4
            hi0.n r2 = r1.f60110d
            r2.getClass()
            return r0
        L_0x02c4:
            hi0.n r14 = r1.f60110d
            r8 = r0
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r8.mo59037c(r9, r10, r11, r12, r13, r14)
            ki0.f r2 = r1.f60109c
            androidx.lifecycle.u r2 = r2.f60137e
            hi0.f0 r3 = r0.f60117c
            r2.mo4329d(r3)
            ki0.f r2 = r1.f60109c
            monitor-enter(r2)
            r1.f60113g = r5     // Catch:{ all -> 0x0333 }
            ki0.f r3 = r1.f60109c     // Catch:{ all -> 0x0333 }
            hi0.a r6 = r1.f60108b     // Catch:{ all -> 0x0333 }
            ki0.h r8 = r1.f60107a     // Catch:{ all -> 0x0333 }
            r9 = 1
            boolean r3 = r3.mo59048c(r6, r8, r4, r9)     // Catch:{ all -> 0x0333 }
            if (r3 == 0) goto L_0x02fa
            r0.f60125k = r9     // Catch:{ all -> 0x0333 }
            java.net.Socket r5 = r0.f60119e     // Catch:{ all -> 0x0333 }
            ki0.h r0 = r1.f60107a     // Catch:{ all -> 0x0333 }
            ki0.e r0 = r0.f60156i     // Catch:{ all -> 0x0333 }
            r1.f60115i = r7     // Catch:{ all -> 0x0333 }
            goto L_0x0323
        L_0x02fa:
            ki0.f r3 = r1.f60109c     // Catch:{ all -> 0x0333 }
            boolean r4 = r3.f60138f     // Catch:{ all -> 0x0333 }
            if (r4 != 0) goto L_0x030a
            r4 = 1
            r3.f60138f = r4     // Catch:{ all -> 0x0333 }
            java.util.concurrent.ThreadPoolExecutor r4 = ki0.C23800f.f60132g     // Catch:{ all -> 0x0333 }
            x.m r6 = r3.f60135c     // Catch:{ all -> 0x0333 }
            r4.execute(r6)     // Catch:{ all -> 0x0333 }
        L_0x030a:
            java.util.ArrayDeque r3 = r3.f60136d     // Catch:{ all -> 0x0333 }
            r3.add(r0)     // Catch:{ all -> 0x0333 }
            ki0.h r3 = r1.f60107a     // Catch:{ all -> 0x0333 }
            ki0.e r4 = r3.f60156i     // Catch:{ all -> 0x0333 }
            if (r4 != 0) goto L_0x032d
            r3.f60156i = r0     // Catch:{ all -> 0x0333 }
            java.util.ArrayList r4 = r0.f60130p     // Catch:{ all -> 0x0333 }
            ki0.h$b r6 = new ki0.h$b     // Catch:{ all -> 0x0333 }
            java.lang.Object r7 = r3.f60153f     // Catch:{ all -> 0x0333 }
            r6.<init>(r3, r7)     // Catch:{ all -> 0x0333 }
            r4.add(r6)     // Catch:{ all -> 0x0333 }
        L_0x0323:
            monitor-exit(r2)     // Catch:{ all -> 0x0333 }
            ii0.C23610d.m57797e(r5)
            hi0.n r2 = r1.f60110d
            r2.getClass()
            return r0
        L_0x032d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0333 }
            r0.<init>()     // Catch:{ all -> 0x0333 }
            throw r0     // Catch:{ all -> 0x0333 }
        L_0x0333:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0333 }
            throw r0
        L_0x0336:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0341 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x0341 }
            throw r0     // Catch:{ all -> 0x0341 }
        L_0x033e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x033e }
            throw r0     // Catch:{ all -> 0x0341 }
        L_0x0341:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0341 }
            throw r0
        L_0x0344:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x034f }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x034f }
            throw r0     // Catch:{ all -> 0x034f }
        L_0x034c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x034c }
            throw r0     // Catch:{ all -> 0x034f }
        L_0x034f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x034f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki0.C23798d.mo59031a(int, int, int, int, boolean):ki0.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        if (r1.f60119e.isClosed() != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r1.f60119e.isInputShutdown() != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r1.f60119e.isOutputShutdown() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r3 = r1.f60122h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r3 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        r6 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        if (r3.f62049h == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004b, code lost:
        if (r3.f62056o >= r3.f62055n) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0051, code lost:
        if (r6 < r3.f62057p) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0053, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0055, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005a, code lost:
        if (r18 == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3 = r1.f60119e.getSoTimeout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1.f60119e.setSoTimeout(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006d, code lost:
        if (r1.f60123i.mo61415l1() == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.f60119e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0075, code lost:
        r1.f60119e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007c, code lost:
        r1.f60119e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0081, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0088 A[LOOP:0: B:0:0x0000->B:56:0x0088, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x008d A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ki0.C23799e mo59032b(int r13, int r14, int r15, int r16, boolean r17, boolean r18) throws java.io.IOException {
        /*
            r12 = this;
        L_0x0000:
            ki0.e r1 = r12.mo59031a(r13, r14, r15, r16, r17)
            r2 = r12
            ki0.f r3 = r2.f60109c
            monitor-enter(r3)
            int r0 = r1.f60127m     // Catch:{ all -> 0x0019 }
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x001c
            ni0.d r0 = r1.f60122h     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 != 0) goto L_0x001c
            monitor-exit(r3)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x0019:
            r0 = move-exception
            goto L_0x008e
        L_0x001c:
            monitor-exit(r3)     // Catch:{ all -> 0x0019 }
            java.net.Socket r0 = r1.f60119e
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L_0x0086
            java.net.Socket r0 = r1.f60119e
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L_0x0086
            java.net.Socket r0 = r1.f60119e
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L_0x0036
            goto L_0x0086
        L_0x0036:
            ni0.d r3 = r1.f60122h
            if (r3 == 0) goto L_0x005a
            long r6 = java.lang.System.nanoTime()
            monitor-enter(r3)
            boolean r0 = r3.f62049h     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0045
            monitor-exit(r3)
            goto L_0x0086
        L_0x0045:
            long r8 = r3.f62056o     // Catch:{ all -> 0x0057 }
            long r10 = r3.f62055n     // Catch:{ all -> 0x0057 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            long r8 = r3.f62057p     // Catch:{ all -> 0x0057 }
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            monitor-exit(r3)
            goto L_0x0086
        L_0x0055:
            monitor-exit(r3)
            goto L_0x0085
        L_0x0057:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x005a:
            if (r18 == 0) goto L_0x0085
            java.net.Socket r0 = r1.f60119e     // Catch:{ SocketTimeoutException -> 0x0084, IOException -> 0x0082 }
            int r3 = r0.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0084, IOException -> 0x0082 }
            java.net.Socket r0 = r1.f60119e     // Catch:{ all -> 0x007b }
            r0.setSoTimeout(r5)     // Catch:{ all -> 0x007b }
            si0.x r0 = r1.f60123i     // Catch:{ all -> 0x007b }
            boolean r0 = r0.mo61415l1()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0075
            java.net.Socket r0 = r1.f60119e     // Catch:{ SocketTimeoutException -> 0x0084, IOException -> 0x0082 }
            r0.setSoTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0084, IOException -> 0x0082 }
            goto L_0x0086
        L_0x0075:
            java.net.Socket r0 = r1.f60119e     // Catch:{ SocketTimeoutException -> 0x0084, IOException -> 0x0082 }
            r0.setSoTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0084, IOException -> 0x0082 }
            goto L_0x0085
        L_0x007b:
            r0 = move-exception
            java.net.Socket r6 = r1.f60119e     // Catch:{ SocketTimeoutException -> 0x0084, IOException -> 0x0082 }
            r6.setSoTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0084, IOException -> 0x0082 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0084, IOException -> 0x0082 }
        L_0x0082:
            goto L_0x0086
        L_0x0084:
        L_0x0085:
            r4 = 1
        L_0x0086:
            if (r4 != 0) goto L_0x008d
            r1.mo59042h()
            goto L_0x0000
        L_0x008d:
            return r1
        L_0x008e:
            monitor-exit(r3)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki0.C23798d.mo59032b(int, int, int, int, boolean, boolean):ki0.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r1 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59033c() {
        /*
            r6 = this;
            ki0.f r0 = r6.f60109c
            monitor-enter(r0)
            hi0.f0 r1 = r6.f60115i     // Catch:{ all -> 0x0051 }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r2
        L_0x000a:
            boolean r1 = r6.mo59034d()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x001a
            ki0.h r1 = r6.f60107a     // Catch:{ all -> 0x0051 }
            ki0.e r1 = r1.f60156i     // Catch:{ all -> 0x0051 }
            hi0.f0 r1 = r1.f60117c     // Catch:{ all -> 0x0051 }
            r6.f60115i = r1     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r2
        L_0x001a:
            ki0.g$a r1 = r6.f60111e     // Catch:{ all -> 0x0051 }
            r3 = 0
            if (r1 == 0) goto L_0x002e
            int r4 = r1.f60147b     // Catch:{ all -> 0x0051 }
            java.util.List<hi0.f0> r1 = r1.f60146a     // Catch:{ all -> 0x0051 }
            int r1 = r1.size()     // Catch:{ all -> 0x0051 }
            if (r4 >= r1) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            if (r1 != 0) goto L_0x004f
        L_0x002e:
            ki0.g r1 = r6.f60112f     // Catch:{ all -> 0x0051 }
            int r4 = r1.f60143e     // Catch:{ all -> 0x0051 }
            java.util.List<java.net.Proxy> r5 = r1.f60142d     // Catch:{ all -> 0x0051 }
            int r5 = r5.size()     // Catch:{ all -> 0x0051 }
            if (r4 >= r5) goto L_0x003c
            r4 = 1
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            if (r4 != 0) goto L_0x004a
            java.util.ArrayList r1 = r1.f60145g     // Catch:{ all -> 0x0051 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = 0
            goto L_0x004b
        L_0x004a:
            r1 = 1
        L_0x004b:
            if (r1 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r2
        L_0x0051:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ki0.C23798d.mo59033c():boolean");
    }

    /* renamed from: d */
    public final boolean mo59034d() {
        C23799e eVar = this.f60107a.f60156i;
        if (eVar == null || eVar.f60126l != 0 || !C23610d.m57809q(eVar.f60117c.f59461a.f59369a, this.f60108b.f59369a)) {
            return false;
        }
        return true;
    }
}
