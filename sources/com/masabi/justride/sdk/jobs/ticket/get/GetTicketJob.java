package com.masabi.justride.sdk.jobs.ticket.get;

import ce0.C21100e;
import com.masabi.justride.sdk.jobs.ticket.get.C14659a;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONException;
import p258t4.C6587a;
import p364al.C13487h;
import p370ar.C13506a;
import p406cg.C13815e;
import p412cn.C13851a;
import p413co.C13872r;
import p465ek.C16835c;
import p490fl.C17037e;
import p561ik.C17618a;
import p584jl.C17886b;
import p586jn.C17900f;
import p626lf.C18201b;
import p703ol.C18781a;
import p725pj.C18926a;
import p752qn.C19151i;
import p774rn.C19292b;
import p821tm.C19695b;
import p821tm.C19709m;
import p821tm.C19710n;
import p891wk.C20344a;
import p891wk.C20362q;
import p893wm.C20374a;
import p940ym.C20745a;

public final class GetTicketJob {

    /* renamed from: a */
    public final C20745a f37143a;

    /* renamed from: b */
    public final C19709m f37144b;

    /* renamed from: c */
    public final C20374a f37145c;

    /* renamed from: d */
    public final C14659a.C14660a f37146d;

    /* renamed from: e */
    public final C13851a f37147e;

    /* renamed from: f */
    public final C13506a f37148f;

    /* renamed from: g */
    public final C17886b f37149g;

    /* renamed from: h */
    public final C6587a f37150h;

    /* renamed from: i */
    public final C6587a f37151i;

    /* renamed from: j */
    public final C13815e f37152j;

    /* renamed from: k */
    public final C19695b f37153k;

    /* renamed from: l */
    public final C18201b f37154l;

    /* renamed from: m */
    public final C19710n f37155m;

    /* renamed from: n */
    public final C17037e f37156n;

    /* renamed from: o */
    public final C18781a f37157o;

    public static class GetTicketJobException extends Exception {
        private final C18926a error;

        public GetTicketJobException(C18926a aVar) {
            super(aVar.mo51439b());
            this.error = aVar;
        }

        /* renamed from: a */
        public final C18926a mo44367a() {
            return this.error;
        }
    }

    public GetTicketJob(C20745a aVar, C19709m mVar, C20374a aVar2, C14659a.C14660a aVar3, C13851a aVar4, C13506a aVar5, C17886b bVar, C6587a aVar6, C6587a aVar7, C13815e eVar, C19695b bVar2, C18201b bVar3, C19710n nVar, C17037e eVar2, C18781a aVar8) {
        this.f37143a = aVar;
        this.f37144b = mVar;
        this.f37145c = aVar2;
        this.f37146d = aVar3;
        this.f37147e = aVar4;
        this.f37148f = aVar5;
        this.f37149g = bVar;
        this.f37150h = aVar6;
        this.f37151i = aVar7;
        this.f37152j = eVar;
        this.f37153k = bVar2;
        this.f37154l = bVar3;
        this.f37155m = nVar;
        this.f37156n = eVar2;
        this.f37157o = aVar8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0136, code lost:
        if (r10.intValue() < r13.intValue()) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0144, code lost:
        if (r10.intValue() < r13.intValue()) goto L_0x0146;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p364al.C13487h<p891wk.C20362q> mo44363a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 0
            wk.q r1 = r12.mo44364b(r13)     // Catch:{ GetTicketJobException -> 0x0063 }
            com.masabi.justride.sdk.jobs.ticket.get.a$a r2 = r12.f37146d     // Catch:{ GetTicketJobException -> 0x0063 }
            com.masabi.justride.sdk.jobs.ticket.get.a r3 = new com.masabi.justride.sdk.jobs.ticket.get.a     // Catch:{ GetTicketJobException -> 0x0063 }
            co.m r4 = r2.f37161a     // Catch:{ GetTicketJobException -> 0x0063 }
            xi.d r2 = r2.f37162b     // Catch:{ GetTicketJobException -> 0x0063 }
            r3.<init>(r4, r2, r13)     // Catch:{ GetTicketJobException -> 0x0063 }
            al.h r2 = r3.mo40394C()     // Catch:{ GetTicketJobException -> 0x0063 }
            boolean r3 = r2.mo40399a()     // Catch:{ GetTicketJobException -> 0x0063 }
            if (r3 != 0) goto L_0x01db
            S r2 = r2.f33365a     // Catch:{ GetTicketJobException -> 0x0063 }
            wk.c r2 = (p891wk.C20348c) r2     // Catch:{ GetTicketJobException -> 0x0063 }
            cn.a r3 = r12.f37147e     // Catch:{ GetTicketJobException -> 0x0063 }
            al.h r13 = r3.mo40780a(r13)     // Catch:{ GetTicketJobException -> 0x0063 }
            boolean r3 = r13.mo40399a()     // Catch:{ GetTicketJobException -> 0x0063 }
            if (r3 != 0) goto L_0x01d3
            S r13 = r13.f33365a     // Catch:{ GetTicketJobException -> 0x0063 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ GetTicketJobException -> 0x0063 }
            boolean r3 = p583jk.C17875h.m44278B(r13)     // Catch:{ GetTicketJobException -> 0x0063 }
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0038
            r3 = 1
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            r1.f51592N = r3     // Catch:{ GetTicketJobException -> 0x0063 }
            wk.a r3 = r1.f51608n     // Catch:{ GetTicketJobException -> 0x0063 }
            t4.a r6 = r12.f37151i     // Catch:{ GetTicketJobException -> 0x0063 }
            java.lang.Long r7 = r2.f51523b     // Catch:{ GetTicketJobException -> 0x0063 }
            r6.getClass()     // Catch:{ GetTicketJobException -> 0x0063 }
            if (r7 == 0) goto L_0x0048
            r3.f51509d = r7     // Catch:{ GetTicketJobException -> 0x0063 }
        L_0x0048:
            cg.e r6 = r12.f37152j     // Catch:{ GetTicketJobException -> 0x0063 }
            java.lang.Long r7 = r2.f51524c     // Catch:{ GetTicketJobException -> 0x0063 }
            r6.getClass()     // Catch:{ GetTicketJobException -> 0x0063 }
            if (r7 != 0) goto L_0x0052
            goto L_0x0068
        L_0x0052:
            java.lang.Long r6 = r3.f51511f     // Catch:{ GetTicketJobException -> 0x0063 }
            if (r6 == 0) goto L_0x0066
            long r8 = r7.longValue()     // Catch:{ GetTicketJobException -> 0x0063 }
            long r10 = r6.longValue()     // Catch:{ GetTicketJobException -> 0x0063 }
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0068
            goto L_0x0066
        L_0x0063:
            r13 = move-exception
            goto L_0x01e3
        L_0x0066:
            r3.f51511f = r7     // Catch:{ GetTicketJobException -> 0x0063 }
        L_0x0068:
            t4.a r6 = r12.f37150h     // Catch:{ GetTicketJobException -> 0x0063 }
            java.lang.Integer r2 = r2.f51522a     // Catch:{ GetTicketJobException -> 0x0063 }
            r6.getClass()     // Catch:{ GetTicketJobException -> 0x0063 }
            if (r2 != 0) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            java.lang.Integer r6 = r3.f51510e     // Catch:{ GetTicketJobException -> 0x0063 }
            int r7 = r2.intValue()     // Catch:{ GetTicketJobException -> 0x0063 }
            int r6 = r6.intValue()     // Catch:{ GetTicketJobException -> 0x0063 }
            if (r7 <= r6) goto L_0x0080
            r3.f51510e = r2     // Catch:{ GetTicketJobException -> 0x0063 }
        L_0x0080:
            wk.a r2 = r1.f51608n     // Catch:{ GetTicketJobException -> 0x0063 }
            r12.mo44365c(r2, r13)     // Catch:{ GetTicketJobException -> 0x0063 }
            r12.mo44366d(r1)     // Catch:{ GetTicketJobException -> 0x0063 }
            ar.a r13 = r12.f37148f
            wk.a r2 = r1.f51608n
            wk.a0 r3 = r1.f51606l
            java.lang.Long r3 = r3.f51515b
            r13.getClass()
            java.lang.Long r13 = r2.f51509d
            if (r13 != 0) goto L_0x0098
            goto L_0x00c0
        L_0x0098:
            java.lang.Integer r6 = r2.f51507b
            int r6 = r6.intValue()
            int r6 = r6 * 60
            long r6 = (long) r6
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            long r7 = r13.longValue()
            long r9 = r6.longValue()
            long r9 = r9 + r7
            long r6 = r3.longValue()
            long r6 = java.lang.Math.min(r9, r6)
            java.lang.Long r13 = java.lang.Long.valueOf(r6)
            r2.f51513h = r13
        L_0x00c0:
            wm.a r13 = r12.f37145c
            com.masabi.justride.sdk.internal.models.ticket.TicketState r13 = r13.mo52603a(r1)
            r1.f51582D = r13
            tm.b r13 = r12.f37153k
            r13.getClass()
            java.lang.Long r13 = r1.f51618x
            r2 = 3
            r3 = 2
            if (r13 == 0) goto L_0x00d4
            goto L_0x0104
        L_0x00d4:
            int[] r13 = p821tm.C19695b.C19696a.f50013a
            com.masabi.justride.sdk.internal.models.ticket.TicketState r6 = r1.f51582D
            int r6 = r6.ordinal()
            r13 = r13[r6]
            r6 = 0
            if (r13 == r4) goto L_0x00f5
            if (r13 == r3) goto L_0x00ee
            if (r13 == r2) goto L_0x00e7
            goto L_0x0104
        L_0x00e7:
            java.lang.Long r13 = java.lang.Long.valueOf(r6)
            r1.f51618x = r13
            goto L_0x0104
        L_0x00ee:
            wk.a0 r13 = r1.f51606l
            java.lang.Long r13 = r13.f51515b
            r1.f51618x = r13
            goto L_0x0104
        L_0x00f5:
            wk.a r13 = r1.f51608n
            java.lang.Long r13 = r13.f51513h
            if (r13 != 0) goto L_0x0102
            java.lang.Long r13 = java.lang.Long.valueOf(r6)
            r1.f51618x = r13
            goto L_0x0104
        L_0x0102:
            r1.f51618x = r13
        L_0x0104:
            lf.b r13 = r12.f37154l
            r13.getClass()
            wk.a r13 = r1.f51608n
            com.masabi.justride.sdk.internal.models.ticket.TicketState r6 = r1.f51582D
            java.lang.Long r7 = r1.f51586H
            wk.a0 r8 = r1.f51606l
            java.lang.Long r9 = r13.f51513h
            java.lang.Integer r10 = r13.f51510e
            java.lang.Integer r13 = r13.f51512g
            java.lang.Long r8 = r8.f51515b
            boolean r6 = r6.isFinalized()
            if (r6 == 0) goto L_0x0122
            java.lang.Long r7 = r1.f51618x
            goto L_0x0149
        L_0x0122:
            int r6 = r10.intValue()
            if (r6 != 0) goto L_0x0129
            goto L_0x0146
        L_0x0129:
            if (r7 == 0) goto L_0x0139
            if (r13 != 0) goto L_0x012e
            goto L_0x0149
        L_0x012e:
            int r6 = r10.intValue()
            int r13 = r13.intValue()
            if (r6 >= r13) goto L_0x0148
            goto L_0x0149
        L_0x0139:
            if (r13 != 0) goto L_0x013c
            goto L_0x0146
        L_0x013c:
            int r6 = r10.intValue()
            int r13 = r13.intValue()
            if (r6 >= r13) goto L_0x0148
        L_0x0146:
            r7 = r8
            goto L_0x0149
        L_0x0148:
            r7 = r9
        L_0x0149:
            r1.f51619y = r7
            tm.n r13 = r12.f37155m
            wk.n r6 = r1.f51607m
            r13.getClass()
            if (r6 != 0) goto L_0x0155
            goto L_0x0188
        L_0x0155:
            java.lang.Integer r7 = r6.f51567a
            ok.c r7 = r13.mo52060a(r7)
            r6.f51569c = r7
            java.lang.Integer r7 = r6.f51568b
            ok.c r7 = r13.mo52060a(r7)
            r6.f51570d = r7
            java.util.List<java.lang.Integer> r7 = r6.f51571e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r7 == 0) goto L_0x0186
            java.util.Iterator r7 = r7.iterator()
        L_0x0172:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0186
            java.lang.Object r9 = r7.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            ok.c r9 = r13.mo52060a(r9)
            r8.add(r9)
            goto L_0x0172
        L_0x0186:
            r6.f51572f = r8
        L_0x0188:
            java.lang.Long r13 = r1.f51619y
            if (r13 != 0) goto L_0x01cd
            r13 = 7
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.String r6 = r1.f51581C
            r13[r5] = r6
            com.masabi.justride.sdk.internal.models.ticket.TicketState r5 = r1.f51582D
            java.lang.String r5 = r5.getBrokerName()
            r13[r4] = r5
            java.lang.Long r4 = r1.f51618x
            r13[r3] = r4
            wk.a0 r3 = r1.f51606l
            java.lang.Long r3 = r3.f51515b
            r13[r2] = r3
            r2 = 4
            wk.a r1 = r1.f51608n
            java.lang.Integer r3 = r1.f51510e
            r13[r2] = r3
            r2 = 5
            java.lang.Integer r3 = r1.f51512g
            r13[r2] = r3
            r2 = 6
            java.lang.Long r1 = r1.f51513h
            r13[r2] = r1
            java.lang.String r1 = "id = %s; s = %s; f = %s; ve = %s; a = %s; ma = %s; ae = %s"
            java.lang.String r13 = java.lang.String.format(r1, r13)
            r1 = 111(0x6f, float:1.56E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            ek.c r2 = new ek.c
            r2.<init>(r0, r1, r13)
            al.h r13 = new al.h
            r13.<init>(r0, r2)
            return r13
        L_0x01cd:
            al.h r13 = new al.h
            r13.<init>(r1, r0)
            return r13
        L_0x01d3:
            com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob$GetTicketJobException r1 = new com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob$GetTicketJobException     // Catch:{ GetTicketJobException -> 0x0063 }
            pj.a r13 = r13.f33366b     // Catch:{ GetTicketJobException -> 0x0063 }
            r1.<init>(r13)     // Catch:{ GetTicketJobException -> 0x0063 }
            throw r1     // Catch:{ GetTicketJobException -> 0x0063 }
        L_0x01db:
            com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob$GetTicketJobException r13 = new com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob$GetTicketJobException     // Catch:{ GetTicketJobException -> 0x0063 }
            pj.a r1 = r2.f33366b     // Catch:{ GetTicketJobException -> 0x0063 }
            r13.<init>(r1)     // Catch:{ GetTicketJobException -> 0x0063 }
            throw r13     // Catch:{ GetTicketJobException -> 0x0063 }
        L_0x01e3:
            pj.a r13 = r13.mo44367a()
            java.lang.String r1 = r13.f48169a
            java.lang.String r2 = "ticket.access"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01f7
            al.h r1 = new al.h
            r1.<init>(r0, r13)
            goto L_0x0209
        L_0x01f7:
            r1 = 900(0x384, float:1.261E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            ek.c r2 = new ek.c
            java.lang.String r3 = "Unexpected error"
            r2.<init>(r13, r1, r3)
            al.h r1 = new al.h
            r1.<init>(r0, r2)
        L_0x0209:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob.mo44363a(java.lang.String):al.h");
    }

    /* renamed from: b */
    public final C20362q mo44364b(String str) throws GetTicketJobException {
        C13487h hVar;
        String str2;
        C19709m mVar = this.f37144b;
        C13872r<byte[]> d = mVar.f50053b.mo40787d(C21100e.m49347j0(), str);
        if (d.mo40817a()) {
            hVar = mVar.mo52059b(d.f34120b);
        } else {
            S s = d.f34119a;
            if (s == null) {
                hVar = new C13487h(null, new C16835c((C18926a) null, C16835c.f43812e, "Not found"));
            } else {
                try {
                    hVar = new C13487h((C20362q) mVar.f50054c.mo52732a(C20362q.class, new String((byte[]) s, StandardCharsets.UTF_8)), (C18926a) null);
                } catch (JSONException e) {
                    hVar = mVar.mo52059b(new C17618a(e.getMessage()));
                }
            }
        }
        if (!hVar.mo40399a()) {
            C13487h<C17900f> a = this.f37156n.mo49646a();
            if (!a.mo40399a()) {
                S s2 = a.f33365a;
                if (s2 != null) {
                    str2 = ((C17900f) s2).f45939a;
                } else {
                    str2 = null;
                }
                C13487h<String> a2 = this.f37157o.mo51264a();
                if (!a2.mo40399a()) {
                    String str3 = (String) a2.f33365a;
                    C20362q qVar = (C20362q) hVar.f33365a;
                    if ((str2 != null && str2.equals(qVar.f51598d)) || (str3 != null && str3.equals(qVar.f51598d))) {
                        return (C20362q) hVar.f33365a;
                    }
                    throw new GetTicketJobException(new C16835c((C18926a) null, 110, "The ticket does not belong to this device/account"));
                }
                throw new GetTicketJobException(a2.f33366b);
            }
            throw new GetTicketJobException(a.f33366b);
        }
        throw new GetTicketJobException(hVar.f33366b);
    }

    /* renamed from: c */
    public final void mo44365c(C20344a aVar, List<C19292b> list) {
        Long l;
        for (C19292b next : list) {
            C6587a aVar2 = this.f37151i;
            Long l2 = next.f49048b;
            aVar2.getClass();
            if (l2 != null) {
                aVar.f51509d = l2;
            }
            C13815e eVar = this.f37152j;
            Long l3 = next.f49048b;
            eVar.getClass();
            if (l3 != null && ((l = aVar.f51511f) == null || l3.longValue() < l.longValue())) {
                aVar.f51511f = l3;
            }
        }
        C17886b bVar = this.f37149g;
        Integer valueOf = Integer.valueOf(list.size());
        bVar.getClass();
        aVar.f51510e = Integer.valueOf(valueOf.intValue() + aVar.f51510e.intValue());
    }

    /* renamed from: d */
    public final void mo44366d(C20362q qVar) throws GetTicketJobException {
        if (qVar.f51608n.f51510e.intValue() > 0) {
            C13487h<C19151i> a = this.f37143a.mo52890a(qVar);
            if (!a.mo40399a()) {
                C19151i iVar = (C19151i) a.f33365a;
                if (iVar.f48734a) {
                    Long valueOf = Long.valueOf(iVar.f48737d.getTime());
                    qVar.f51586H = valueOf;
                    qVar.f51606l.f51515b = valueOf;
                    return;
                }
                return;
            }
            throw new GetTicketJobException(new C16835c(a.f33366b, C16835c.f43816i, (String) null));
        }
    }
}
