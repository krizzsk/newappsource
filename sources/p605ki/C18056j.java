package p605ki;

import com.google.android.play.core.assetpacks.C14333w2;
import com.masabi.justride.sdk.jobs.purchase.payment.C14658b;
import com.masabi.justride.sdk.jobs.purchase.payment.PaymentDataException;
import p364al.C13487h;
import p388bk.C13634a;
import p469eo.C16846b;
import p517go.C17210b;
import p583jk.C17873f;
import p609km.C18098d;
import p609km.C18103g;
import p633lm.C18242c;
import p633lm.C18244e;
import p633lm.C18245f;
import p705on.C18796d;
import p705on.C18799g;
import p705on.C18801i;
import p705on.C18807m;
import p705on.C18808n;
import p725pj.C18926a;
import p752qn.C19148f;
import p843uk.C19925d0;
import p843uk.C19937j;
import p843uk.C19945o;
import p843uk.C19956z;

/* renamed from: ki.j */
public final class C18056j {

    /* renamed from: a */
    public final C16846b f46192a;

    public C18056j(C16846b bVar) {
        this.f46192a = bVar;
    }

    /* renamed from: a */
    public final C14333w2 mo50528a(C18796d dVar, C18799g gVar) {
        boolean z;
        C13487h<Void> hVar;
        C13487h hVar2;
        C14658b bVar = (C14658b) this.f46192a.mo49505a(C14658b.class, (String) null);
        String str = dVar.f47848a;
        bVar.getClass();
        if ((gVar instanceof C18807m) || (gVar instanceof C18808n)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C18244e eVar = bVar.f37139d;
            C13487h b = eVar.f46545e.mo50658b(gVar);
            if (b.mo40399a()) {
                hVar2 = C18244e.m44976a(b.f33366b);
            } else {
                hVar2 = eVar.mo50656b(str, gVar.f47866f);
            }
            if (hVar2.mo40399a()) {
                hVar = C14658b.m36792c(hVar2.f33366b);
            } else {
                C19956z zVar = (C19956z) hVar2.f33365a;
                C19937j jVar = zVar.f50738a;
                C18245f b2 = bVar.mo44362b(zVar, gVar.f47866f);
                try {
                    C19148f fVar = jVar.f50633c;
                    bVar.f37140e.getClass();
                    b2.mo50657a(fVar, C18242c.m44973a(gVar));
                    hVar = bVar.mo44361a(jVar, new C19925d0(b2.f46546a, (String) null, b2.f46547b, b2.f46548c, b2.f46549d, b2.f46550e));
                    if (z && !hVar.mo40399a()) {
                        bVar.f37142g.mo40795d();
                        bVar.f37142g.mo40792a();
                    }
                } catch (PaymentDataException e) {
                    bVar.f37141f.getClass();
                    hVar = C14658b.m36792c(C17873f.m44275b(e));
                }
            }
        } else {
            try {
                bVar.f37140e.mo50654b(gVar, str);
                throw null;
            } catch (PaymentDataException e2) {
                bVar.f37141f.getClass();
                hVar = C14658b.m36792c(C17873f.m44275b(e2));
            }
        }
        return new C14333w2(hVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C14333w2 mo50529b(p705on.C18796d r19, p705on.C18799g r20, long r21, p705on.C18799g r23, long r24) {
        /*
            r18 = this;
            r0 = r20
            r1 = r21
            r3 = r23
            r4 = r18
            r5 = r24
            eo.b r7 = r4.f46192a
            java.lang.Class<com.masabi.justride.sdk.jobs.purchase.payment.b> r8 = com.masabi.justride.sdk.jobs.purchase.payment.C14658b.class
            r9 = 0
            java.lang.Object r7 = r7.mo49505a(r8, r9)
            com.masabi.justride.sdk.jobs.purchase.payment.b r7 = (com.masabi.justride.sdk.jobs.purchase.payment.C14658b) r7
            com.google.android.play.core.assetpacks.w2 r8 = new com.google.android.play.core.assetpacks.w2
            r10 = r19
            java.lang.String r10 = r10.f47848a
            r7.getClass()
            boolean r11 = r0 instanceof p705on.C18807m
            r12 = 0
            r13 = 1
            if (r11 != 0) goto L_0x002b
            boolean r11 = r0 instanceof p705on.C18808n
            if (r11 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r11 = 0
            goto L_0x002c
        L_0x002b:
            r11 = 1
        L_0x002c:
            java.lang.String r14 = "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."
            if (r11 != 0) goto L_0x014f
            boolean r11 = r3 instanceof p705on.C18807m
            if (r11 != 0) goto L_0x0038
            boolean r11 = r3 instanceof p705on.C18808n
            if (r11 == 0) goto L_0x0039
        L_0x0038:
            r12 = 1
        L_0x0039:
            if (r12 == 0) goto L_0x003d
            goto L_0x014f
        L_0x003d:
            java.lang.String r11 = r0.f47866f
            if (r11 != 0) goto L_0x0043
            java.lang.String r11 = r3.f47866f
        L_0x0043:
            lm.e r12 = r7.f37139d
            lm.g r13 = r12.f46545e
            al.h r13 = r13.mo50658b(r0)
            boolean r15 = r13.mo40399a()
            if (r15 == 0) goto L_0x0058
            pj.a r10 = r13.f33366b
            al.h r10 = p633lm.C18244e.m44976a(r10)
            goto L_0x006f
        L_0x0058:
            lm.g r13 = r12.f46545e
            al.h r13 = r13.mo50658b(r3)
            boolean r15 = r13.mo40399a()
            if (r15 == 0) goto L_0x006b
            pj.a r10 = r13.f33366b
            al.h r10 = p633lm.C18244e.m44976a(r10)
            goto L_0x006f
        L_0x006b:
            al.h r10 = r12.mo50656b(r10, r11)
        L_0x006f:
            boolean r12 = r10.mo40399a()
            if (r12 == 0) goto L_0x007d
            pj.a r0 = r10.f33366b
            al.h r0 = com.masabi.justride.sdk.jobs.purchase.payment.C14658b.m36792c(r0)
            goto L_0x015b
        L_0x007d:
            S r10 = r10.f33365a
            uk.z r10 = (p843uk.C19956z) r10
            uk.j r12 = r10.f50738a
            qn.f r13 = r12.f50633c
            uk.v r15 = r12.f50634d
            on.o r15 = r15.f50713i
            if (r15 != 0) goto L_0x0098
            bk.a r0 = new bk.a
            java.lang.Integer r1 = p388bk.C13634a.f33610N
            r0.<init>(r9, r1, r14)
            al.h r0 = com.masabi.justride.sdk.jobs.purchase.payment.C14658b.m36792c(r0)
            goto L_0x015b
        L_0x0098:
            r19 = r10
            long r9 = r15.f47915a
            java.lang.Integer r13 = r13.f48695b
            int r13 = r13.intValue()
            long r3 = (long) r13
            r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r13 > 0) goto L_0x00d2
            int r13 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x00af
            goto L_0x00d2
        L_0x00af:
            int r13 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r13 > 0) goto L_0x00c9
            int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x00b8
            goto L_0x00c9
        L_0x00b8:
            long r9 = r1 + r5
            int r13 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x00c7
            bk.a r3 = new bk.a
            java.lang.Integer r4 = p388bk.C13634a.f33608L
            r9 = 0
            r3.<init>(r9, r4, r14)
            goto L_0x00da
        L_0x00c7:
            r9 = 0
            goto L_0x00db
        L_0x00c9:
            r9 = 0
            bk.a r3 = new bk.a
            java.lang.Integer r4 = p388bk.C13634a.f33607K
            r3.<init>(r9, r4, r14)
            goto L_0x00da
        L_0x00d2:
            r9 = 0
            bk.a r3 = new bk.a
            java.lang.Integer r4 = p388bk.C13634a.f33606J
            r3.<init>(r9, r4, r14)
        L_0x00da:
            r9 = r3
        L_0x00db:
            if (r9 == 0) goto L_0x00e3
            al.h r0 = com.masabi.justride.sdk.jobs.purchase.payment.C14658b.m36792c(r9)
            goto L_0x015b
        L_0x00e3:
            int r2 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            int r2 = (int) r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10 = r19
            lm.f r3 = r7.mo44362b(r10, r11)
            lm.c r4 = r7.f37140e     // Catch:{ PaymentDataException -> 0x0140 }
            r4.getClass()     // Catch:{ PaymentDataException -> 0x0140 }
            uk.s r0 = p633lm.C18242c.m44973a(r20)     // Catch:{ PaymentDataException -> 0x0140 }
            uk.m r0 = (p843uk.C19943m) r0     // Catch:{ PaymentDataException -> 0x0140 }
            uk.q r4 = new uk.q     // Catch:{ PaymentDataException -> 0x0140 }
            r4.<init>((java.lang.Integer) r1, (p843uk.C19943m) r0)     // Catch:{ PaymentDataException -> 0x0140 }
            java.util.ArrayList r0 = r3.f46547b     // Catch:{ PaymentDataException -> 0x0140 }
            r0.add(r4)     // Catch:{ PaymentDataException -> 0x0140 }
            lm.c r0 = r7.f37140e     // Catch:{ PaymentDataException -> 0x0140 }
            r0.getClass()     // Catch:{ PaymentDataException -> 0x0140 }
            uk.s r0 = p633lm.C18242c.m44973a(r23)     // Catch:{ PaymentDataException -> 0x0140 }
            uk.m r0 = (p843uk.C19943m) r0     // Catch:{ PaymentDataException -> 0x0140 }
            uk.q r1 = new uk.q     // Catch:{ PaymentDataException -> 0x0140 }
            r1.<init>((java.lang.Integer) r2, (p843uk.C19943m) r0)     // Catch:{ PaymentDataException -> 0x0140 }
            java.util.ArrayList r0 = r3.f46547b     // Catch:{ PaymentDataException -> 0x0140 }
            r0.add(r1)     // Catch:{ PaymentDataException -> 0x0140 }
            uk.d0 r0 = new uk.d0     // Catch:{ PaymentDataException -> 0x0140 }
            qn.f r1 = r3.f46546a     // Catch:{ PaymentDataException -> 0x0140 }
            java.util.ArrayList r2 = r3.f46547b     // Catch:{ PaymentDataException -> 0x0140 }
            on.k r4 = r3.f46548c     // Catch:{ PaymentDataException -> 0x0140 }
            java.lang.String r5 = r3.f46549d     // Catch:{ PaymentDataException -> 0x0140 }
            on.p r3 = r3.f46550e     // Catch:{ PaymentDataException -> 0x0140 }
            r6 = 0
            r19 = r0
            r20 = r1
            r21 = r6
            r22 = r2
            r23 = r4
            r24 = r5
            r25 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ PaymentDataException -> 0x0140 }
            al.h r0 = r7.mo44361a(r12, r0)
            goto L_0x015b
        L_0x0140:
            r0 = move-exception
            jk.f r1 = r7.f37141f
            r1.getClass()
            pj.a r0 = p583jk.C17873f.m44275b(r0)
            al.h r0 = com.masabi.justride.sdk.jobs.purchase.payment.C14658b.m36792c(r0)
            goto L_0x015b
        L_0x014f:
            bk.a r0 = new bk.a
            java.lang.Integer r1 = p388bk.C13634a.f33609M
            r2 = 0
            r0.<init>(r2, r1, r14)
            al.h r0 = com.masabi.justride.sdk.jobs.purchase.payment.C14658b.m36792c(r0)
        L_0x015b:
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p605ki.C18056j.mo50529b(on.d, on.g, long, on.g, long):com.google.android.play.core.assetpacks.w2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x044e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C14333w2 mo50530c(p705on.C18801i r36) {
        /*
            r35 = this;
            r1 = r35
            r0 = r36
            eo.b r2 = r1.f46192a
            java.lang.Class<jm.a> r3 = p585jm.C17887a.class
            r4 = 0
            java.lang.Object r2 = r2.mo49505a(r3, r4)
            jm.a r2 = (p585jm.C17887a) r2
            com.google.android.play.core.assetpacks.w2 r3 = new com.google.android.play.core.assetpacks.w2
            r2.getClass()
            java.lang.String r5 = "orderSummary"
            mf0.C24362h.m61211f(r0, r5)
            jm.c r5 = r2.f45893a
            vl.e r6 = r5.f45904h
            java.util.List<java.lang.String> r6 = r6.f51166a
            java.lang.String r7 = "SDK"
            boolean r6 = r6.contains(r7)
            java.lang.String r7 = "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."
            r8 = 900(0x384, float:1.261E-42)
            if (r6 != 0) goto L_0x003f
            vl.e r6 = r5.f45904h
            java.util.List<java.lang.String> r6 = r6.f51166a
            java.lang.String r9 = "EXTERNAL_MPG"
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x003f
            java.lang.Integer r0 = p388bk.C13634a.f33619m
            al.h r0 = p585jm.C17889c.m44503a(r4, r0, r7)
            goto L_0x0223
        L_0x003f:
            go.b r6 = r5.f45903g
            java.lang.String r0 = r0.f47873a
            uk.o r6 = r6.mo49785a(r0)
            if (r6 != 0) goto L_0x0051
            java.lang.Integer r0 = p388bk.C13634a.f33612f
            al.h r0 = p585jm.C17889c.m44503a(r4, r0, r7)
            goto L_0x0223
        L_0x0051:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r6.f50670e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0061
            java.lang.Integer r0 = p388bk.C13634a.f33616j
            al.h r0 = p585jm.C17889c.m44503a(r4, r0, r7)
            goto L_0x0223
        L_0x0061:
            fl.d r0 = r5.f45898b
            al.h r0 = r0.mo49645a()
            boolean r9 = r0.mo40399a()
            java.lang.String r10 = "Unexpected error"
            if (r9 == 0) goto L_0x007b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            pj.a r0 = r0.f33366b
            al.h r0 = p585jm.C17889c.m44503a(r0, r4, r10)
            goto L_0x0223
        L_0x007b:
            S r0 = r0.f33365a
            r9 = r0
            jn.d r9 = (p586jn.C17898d) r9
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r6.f50670e
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x008a:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00a8
            java.lang.Object r11 = r0.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.util.Map<java.lang.Integer, uk.a0> r12 = r6.f50668c
            java.lang.Object r11 = r12.get(r11)
            uk.a0 r11 = (p843uk.C19918a0) r11
            java.lang.Boolean r11 = r11.f50569a
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x008a
            r0 = 1
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r9.f45931b
            if (r0 != 0) goto L_0x00b7
            java.lang.Integer r0 = p388bk.C13634a.f33617k
            al.h r0 = p585jm.C17889c.m44503a(r4, r0, r7)
            goto L_0x0223
        L_0x00b7:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r6.f50670e
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c1:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00db
            java.lang.Object r11 = r0.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.util.Map<java.lang.Integer, uk.a0> r12 = r6.f50668c
            java.lang.Object r11 = r12.get(r11)
            uk.a0 r11 = (p843uk.C19918a0) r11
            java.lang.Integer r11 = r11.f50584p
            if (r11 == 0) goto L_0x00c1
            r0 = 1
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            java.lang.String r11 = "purchase"
            if (r0 == 0) goto L_0x0114
            km.e$a r0 = r5.f45897a
            km.e r12 = new km.e
            si.a r13 = r0.f46287a
            uk.e$a r14 = r0.f46288b
            km.i r0 = r0.f46289c
            r12.<init>(r13, r14, r0, r6)
            al.h r0 = r12.mo40394C()
            boolean r12 = r0.mo40399a()
            if (r12 == 0) goto L_0x010f
            pj.a r0 = r0.f33366b
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            dm.a r6 = new dm.a
            r6.<init>(r11, r5)
            al.h r5 = new al.h
            pj.a r0 = r6.mo49399a(r0)
            r5.<init>(r4, r0)
            r0 = r5
            goto L_0x0223
        L_0x010f:
            S r0 = r0.f33365a
            r4 = r0
            qn.f r4 = (p752qn.C19148f) r4
        L_0x0114:
            qn.f r0 = r6.mo52238a()
            if (r4 != 0) goto L_0x011c
            r15 = r0
            goto L_0x0135
        L_0x011c:
            java.lang.Integer r12 = r0.f48695b
            int r12 = r12.intValue()
            java.lang.Integer r13 = r4.f48695b
            int r13 = r13.intValue()
            int r13 = r13 + r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            qn.f r13 = new qn.f
            java.lang.String r0 = r0.f48694a
            r13.<init>(r0, r12)
            r15 = r13
        L_0x0135:
            java.util.Map<java.lang.Integer, uk.a0> r0 = r6.f50668c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            uk.a0 r0 = (p843uk.C19918a0) r0
            java.lang.String r0 = r0.f50582n
            km.a r12 = r5.f45899c
            al.h r12 = r12.mo50542a(r9)
            boolean r13 = r12.mo40399a()
            if (r13 == 0) goto L_0x015f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            pj.a r4 = r12.f33366b
            al.h r0 = p585jm.C17889c.m44503a(r4, r0, r10)
            goto L_0x0223
        L_0x015f:
            S r8 = r12.f33365a
            java.lang.String r8 = (java.lang.String) r8
            dl.a r10 = r5.f45900d
            java.lang.Integer r12 = r15.f48695b
            r10.getClass()
            com.masabi.justride.sdk.jobs.network.forc.FOrcEndpoint r13 = com.masabi.justride.sdk.jobs.network.forc.FOrcEndpoint.PAYMENT_INSTRUMENTS
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r14 = "totalPurchaseAmount"
            java.util.Map r19 = java.util.Collections.singletonMap(r14, r12)
            java.lang.Object r12 = r10.f43425b
            r16 = r12
            gm.a r16 = (p515gm.C17205a) r16
            com.masabi.justride.sdk.internal.models.network.HttpMethod r17 = r13.getHttpMethod()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r13.getPath()
            r12.append(r13)
            java.lang.String r13 = "/"
            r12.append(r13)
            java.lang.Object r14 = r10.f43426c
            java.lang.String r14 = (java.lang.String) r14
            boolean r18 = ce0.C21100e.m49352m0(r0)
            if (r18 == 0) goto L_0x019c
            goto L_0x01a2
        L_0x019c:
            java.lang.String r1 = "-"
            java.lang.String r14 = p358af.C13437d.m33706k(r14, r1, r0)
        L_0x01a2:
            java.lang.String r18 = p379.C13715c.m34245k(r12, r14, r13, r8)
            r20 = 0
            r21 = 0
            al.h r0 = r16.mo49783a(r17, r18, r19, r20, r21)
            boolean r1 = r0.mo40399a()
            if (r1 == 0) goto L_0x01ca
            pj.a r0 = r0.f33366b
            bk.a r1 = new bk.a
            r8 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r10 = "Underlying network error."
            r1.<init>(r0, r8, r10)
            al.h r0 = new al.h
            r8 = 0
            r0.<init>(r8, r1)
            goto L_0x01f4
        L_0x01ca:
            S r0 = r0.f33365a
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r10.f43424a     // Catch:{ JSONException -> 0x01e4 }
            xi.d r1 = (p913xi.C20531d) r1     // Catch:{ JSONException -> 0x01e4 }
            java.lang.Class<uk.r> r8 = p843uk.C19948r.class
            java.lang.Object r0 = r1.mo52732a(r8, r0)     // Catch:{ JSONException -> 0x01e4 }
            uk.r r0 = (p843uk.C19948r) r0     // Catch:{ JSONException -> 0x01e4 }
            al.h r1 = new al.h     // Catch:{ JSONException -> 0x01e4 }
            java.util.List<uk.t> r0 = r0.f50681a     // Catch:{ JSONException -> 0x01e4 }
            r8 = 0
            r1.<init>(r0, r8)     // Catch:{ JSONException -> 0x01e4 }
            r0 = r1
            goto L_0x01f4
        L_0x01e4:
            r0 = move-exception
            ik.a r1 = new ik.a
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            al.h r0 = new al.h
            r8 = 0
            r0.<init>(r8, r1)
        L_0x01f4:
            boolean r1 = r0.mo40399a()
            if (r1 == 0) goto L_0x0212
            pj.a r0 = r0.f33366b
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            dm.a r4 = new dm.a
            r4.<init>(r11, r1)
            al.h r1 = new al.h
            pj.a r0 = r4.mo49399a(r0)
            r4 = 0
            r1.<init>(r4, r0)
            r0 = r1
            goto L_0x0223
        L_0x0212:
            r1 = 0
            S r0 = r0.f33365a
            java.util.List r0 = (java.util.List) r0
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L_0x022c
            java.lang.Integer r0 = p388bk.C13634a.f33618l
            al.h r0 = p585jm.C17889c.m44503a(r1, r0, r7)
        L_0x0223:
            r1 = 0
            r31 = r2
            r29 = r3
            r30 = r7
            goto L_0x0440
        L_0x022c:
            wn.b r1 = r5.f45907k
            r1.mo44369b()
            jm.g r1 = r5.f45902f
            java.util.ArrayList r14 = r1.mo50441a(r6)
            lm.d r1 = r5.f45906j
            boolean r8 = r9.f45931b
            r1.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r28 = new java.util.ArrayList
            r28.<init>()
            java.util.Iterator r13 = r0.iterator()
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r26 = r12
            r24 = r20
            r25 = r21
            r27 = r22
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x0279:
            boolean r12 = r13.hasNext()
            r29 = r3
            java.lang.String r3 = "SVA"
            if (r12 == 0) goto L_0x03d2
            java.lang.Object r12 = r13.next()
            uk.t r12 = (p843uk.C19950t) r12
            r36 = r13
            boolean r13 = r12.f50683b
            if (r13 == 0) goto L_0x0291
            r19 = 1
        L_0x0291:
            java.lang.String r13 = r12.f50687f
            r30 = r7
            java.lang.String r7 = "NEW_CARDS"
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x029f
            r18 = 1
        L_0x029f:
            java.lang.String r7 = r12.f50687f
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x02a9
            r20 = 1
        L_0x02a9:
            boolean r7 = r12.f50682a
            if (r7 == 0) goto L_0x02af
            r17 = 1
        L_0x02af:
            java.util.List<on.a> r7 = r12.f50684c
            if (r7 == 0) goto L_0x02be
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x02be
            java.util.List<on.a> r7 = r12.f50684c
            r1.addAll(r7)
        L_0x02be:
            java.lang.String r7 = r12.f50687f
            java.lang.String r13 = "WEBPAYMENTS"
            boolean r7 = r7.equals(r13)
            java.lang.String r13 = ""
            if (r7 == 0) goto L_0x0327
            java.util.List<uk.u> r7 = r12.f50685d
            if (r7 == 0) goto L_0x0327
            r16 = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x02d9:
            boolean r21 = r7.hasNext()
            if (r21 == 0) goto L_0x031b
            java.lang.Object r21 = r7.next()
            r22 = r7
            r7 = r21
            uk.u r7 = (p843uk.C19951u) r7
            r31 = r2
            on.q r2 = new on.q
            r32 = r4
            java.lang.String r4 = r7.f50696a
            r33 = r15
            if (r4 == 0) goto L_0x02f6
            goto L_0x02f8
        L_0x02f6:
            r4 = r16
        L_0x02f8:
            java.lang.String r15 = r7.f50697b
            r34 = r14
            java.lang.String r14 = r7.f50699d
            if (r14 == 0) goto L_0x0301
            goto L_0x0303
        L_0x0301:
            r14 = r16
        L_0x0303:
            java.lang.String r7 = r7.f50700e
            if (r7 == 0) goto L_0x0308
            goto L_0x030a
        L_0x0308:
            r7 = r16
        L_0x030a:
            r2.<init>(r4, r15, r14, r7)
            r13.add(r2)
            r7 = r22
            r2 = r31
            r4 = r32
            r15 = r33
            r14 = r34
            goto L_0x02d9
        L_0x031b:
            r31 = r2
            r32 = r4
            r34 = r14
            r33 = r15
            r11.addAll(r13)
            goto L_0x032f
        L_0x0327:
            r31 = r2
            r32 = r4
            r34 = r14
            r33 = r15
        L_0x032f:
            java.lang.String r2 = r12.f50687f
            java.lang.String r4 = "SPLIT_PAYMENT"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0346
            java.lang.Long r2 = r12.f50689h
            long r13 = r2.longValue()
            on.o r2 = new on.o
            r2.<init>(r13)
            r25 = r2
        L_0x0346:
            if (r8 == 0) goto L_0x0368
            java.lang.String r2 = r12.f50687f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0368
            vk.f r2 = r12.f50688g
            if (r2 == 0) goto L_0x0368
            mn.a r4 = new mn.a
            vk.c r2 = r2.f51141a
            long r13 = r2.f51131a
            java.lang.String r2 = r2.f51132b
            r4.<init>(r13, r2)
            pn.a r2 = new pn.a
            java.lang.String r7 = r12.f50690i
            r2.<init>(r4, r7)
            r24 = r2
        L_0x0368:
            if (r8 != 0) goto L_0x0372
            java.lang.String r2 = r12.f50687f
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0381
        L_0x0372:
            java.lang.String r2 = r12.f50687f
            java.lang.String r3 = "CASH"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0381
            java.lang.String r2 = r12.f50687f
            r10.add(r2)
        L_0x0381:
            java.lang.String r2 = r12.f50687f
            java.lang.String r3 = "APPLE_PAY"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0391
            java.util.List<java.lang.String> r2 = r12.f50692k
            if (r2 == 0) goto L_0x0391
            r26 = r2
        L_0x0391:
            java.lang.String r2 = r12.f50687f
            java.lang.String r3 = "GOOGLE_PAY"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x03c2
            java.lang.String r2 = r12.f50693l
            if (r2 == 0) goto L_0x03c2
            java.lang.String r2 = r12.f50694m
            if (r2 == 0) goto L_0x03c2
            java.util.List<java.lang.String> r2 = r12.f50692k
            boolean r2 = p583jk.C17875h.m44278B(r2)
            if (r2 != 0) goto L_0x03c2
            java.util.List<java.lang.String> r2 = r12.f50695n
            boolean r2 = p583jk.C17875h.m44278B(r2)
            if (r2 != 0) goto L_0x03c2
            uk.k r2 = new uk.k
            java.lang.String r3 = r12.f50693l
            java.lang.String r4 = r12.f50694m
            java.util.List<java.lang.String> r7 = r12.f50692k
            java.util.List<java.lang.String> r12 = r12.f50695n
            r2.<init>(r3, r4, r7, r12)
            r27 = r2
        L_0x03c2:
            r13 = r36
            r3 = r29
            r7 = r30
            r2 = r31
            r4 = r32
            r15 = r33
            r14 = r34
            goto L_0x0279
        L_0x03d2:
            r31 = r2
            r32 = r4
            r30 = r7
            r34 = r14
            r33 = r15
            uk.v r2 = new uk.v
            r16 = r2
            r21 = r1
            r22 = r10
            r23 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            uk.j r1 = new uk.j
            un.b r4 = r5.f45905i
            java.lang.String r4 = r4.mo52262a()
            qn.f r17 = r6.mo52238a()
            ln.a r7 = r6.f50671f
            ln.a r6 = r6.f50672g
            boolean r8 = r9.f45931b
            if (r8 != 0) goto L_0x0401
            r0 = 0
            r21 = r0
            goto L_0x0421
        L_0x0401:
            java.util.Iterator r0 = r0.iterator()
            r8 = 0
        L_0x0406:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x041f
            java.lang.Object r9 = r0.next()
            uk.t r9 = (p843uk.C19950t) r9
            java.lang.String r10 = r9.f50687f
            if (r10 == 0) goto L_0x0406
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x0406
            java.lang.String r8 = r9.f50691j
            goto L_0x0406
        L_0x041f:
            r21 = r8
        L_0x0421:
            r12 = r1
            r13 = r4
            r14 = r34
            r15 = r33
            r16 = r2
            r18 = r32
            r19 = r7
            r20 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            go.a r0 = r5.f45901e
            java.util.HashMap r0 = r0.f44498a
            r0.put(r4, r1)
            al.h r0 = new al.h
            r2 = 0
            r0.<init>(r1, r2)
            r1 = r2
        L_0x0440:
            boolean r2 = r0.mo40399a()
            if (r2 == 0) goto L_0x044e
            al.h r2 = new al.h
            pj.a r0 = r0.f33366b
            r2.<init>(r1, r0)
            goto L_0x0483
        L_0x044e:
            S r0 = r0.f33365a
            uk.j r0 = (p843uk.C19937j) r0
            r2 = r31
            jm.d r1 = r2.f45894b     // Catch:{ JSONException -> 0x0466 }
            java.lang.String r2 = "finalisedOrderInternal"
            mf0.C24362h.m61210e(r0, r2)     // Catch:{ JSONException -> 0x0466 }
            on.d r0 = r1.mo50440a(r0)     // Catch:{ JSONException -> 0x0466 }
            al.h r2 = new al.h     // Catch:{ JSONException -> 0x0466 }
            r1 = 0
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x0466 }
            goto L_0x0483
        L_0x0466:
            r0 = move-exception
            ik.a r1 = new ik.a
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            bk.a r0 = new bk.a
            r2 = 900(0x384, float:1.261E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r30
            r0.<init>(r1, r2, r3)
            al.h r2 = new al.h
            r1 = 0
            r2.<init>(r1, r0)
        L_0x0483:
            r1 = r29
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p605ki.C18056j.mo50530c(on.i):com.google.android.play.core.assetpacks.w2");
    }

    /* renamed from: d */
    public final C14333w2 mo50531d(C18796d dVar) {
        C18098d.C18099a aVar = (C18098d.C18099a) this.f46192a.mo49505a(C18098d.C18099a.class, (String) null);
        return new C14333w2(new C18098d(aVar.f46276a, aVar.f46280e, aVar.f46277b, aVar.f46279d, aVar.f46281f, aVar.f46278c, aVar.f46282g, dVar.f47848a).mo40394C());
    }

    /* renamed from: e */
    public final C14333w2 mo50532e(String str) {
        C13487h hVar;
        C18103g gVar = (C18103g) this.f46192a.mo49505a(C18103g.class, (String) null);
        C17210b bVar = gVar.f46291a;
        C18801i.C18802a aVar = gVar.f46292b;
        C19945o a = bVar.mo49785a(str);
        if (a == null) {
            hVar = new C13487h(null, new C13634a((C18926a) null, C13634a.f33612f, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."));
        } else {
            hVar = new C13487h(aVar.mo51288a(a), (C18926a) null);
        }
        return new C14333w2(hVar);
    }
}
