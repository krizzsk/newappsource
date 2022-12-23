package n40;

import c70.C13752e;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.Time;
import m40.C5701a;
import m40.C5702b;
import p824tp.C19728f;
import p952yy.C20787c;
import q00.C19047a;

/* renamed from: n40.e */
public final class C5863e extends C5858a<Boolean, C20787c> {

    /* renamed from: m */
    public final Time f18851m;

    /* renamed from: n */
    public final int f18852n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5863e(C5702b bVar, C5701a aVar, C13752e eVar, C19728f fVar, C19047a aVar2, ServerId serverId, ServerId serverId2, Time time, Time time2, int i) {
        super(bVar, aVar, eVar, fVar, aVar2, time, serverId, serverId2);
        this.f18851m = time2;
        this.f18852n = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x013d A[LOOP:1: B:18:0x0089->B:38:0x013d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0146 A[EDGE_INSN: B:44:0x0146->B:40:0x0146 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(com.google.android.gms.tasks.Task r24) throws java.lang.Exception {
        /*
            r23 = this;
            r0 = r23
            com.moovit.util.time.Time r1 = r0.f18507i
            if (r1 == 0) goto L_0x0007
            goto L_0x0010
        L_0x0007:
            com.moovit.util.time.Time r1 = new com.moovit.util.time.Time
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
        L_0x0010:
            com.moovit.util.time.Time r2 = r0.f18851m
            r3 = 5
            r4 = 1
            if (r2 == 0) goto L_0x001f
            int r2 = r2.compareTo(r1)
            if (r2 <= 0) goto L_0x001f
            com.moovit.util.time.Time r2 = r0.f18851m
            goto L_0x0037
        L_0x001f:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r5 = r1.mo24631g()
            r2.setTimeInMillis(r5)
            r2.add(r3, r4)
            com.moovit.util.time.Time r5 = new com.moovit.util.time.Time
            long r6 = r2.getTimeInMillis()
            r5.<init>(r6)
            r2 = r5
        L_0x0037:
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            long r6 = r1.mo24631g()
            r5.setTimeInMillis(r6)
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            long r7 = r2.mo24631g()
            r6.setTimeInMillis(r7)
            boolean r7 = com.moovit.util.time.C7925b.m18028p(r5, r6)
            if (r7 == 0) goto L_0x0058
            java.util.List r3 = java.util.Collections.singletonList(r1)
            goto L_0x0080
        L_0x0058:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x005d:
            boolean r8 = com.moovit.util.time.C7925b.m18028p(r5, r6)
            if (r8 != 0) goto L_0x0073
            com.moovit.util.time.Time r8 = new com.moovit.util.time.Time
            long r9 = r5.getTimeInMillis()
            r8.<init>(r9)
            r7.add(r8)
            r5.add(r3, r4)
            goto L_0x005d
        L_0x0073:
            com.moovit.util.time.Time r3 = new com.moovit.util.time.Time
            long r5 = r5.getTimeInMillis()
            r3.<init>(r5)
            r7.add(r3)
            r3 = r7
        L_0x0080:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0089:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0144
            java.lang.Object r6 = r3.next()
            com.moovit.util.time.Time r6 = (com.moovit.util.time.Time) r6
            m40.b r15 = r0.f18500b
            c70.e r14 = r0.f18503e
            tp.f r13 = r0.f18504f
            q00.a r12 = r0.f18506h
            com.moovit.network.model.ServerId r11 = r0.f18849k
            com.moovit.network.model.ServerId r10 = r0.f18850l
            r15.getClass()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            com.google.android.gms.tasks.Task r9 = com.google.android.gms.tasks.Tasks.forResult(r8)
            java.util.concurrent.ThreadPoolExecutor r8 = r15.f18499d
            n40.d r4 = new n40.d
            m40.a r7 = r15.f18496a
            r17 = r3
            r3 = r8
            r8 = r4
            r0 = r9
            r9 = r15
            r18 = r10
            r10 = r7
            r7 = r11
            r11 = r14
            r19 = r12
            r12 = r13
            r20 = r13
            r13 = r19
            r21 = r14
            r14 = r6
            r22 = r5
            r5 = r15
            r15 = r7
            r16 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.tasks.Task r0 = r0.continueWith(r3, r4)
            java.util.concurrent.ThreadPoolExecutor r3 = r5.f18499d
            n40.c r4 = new n40.c
            m40.a r10 = r5.f18496a
            r8 = r4
            r9 = r5
            r11 = r21
            r12 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.tasks.Task r0 = r0.continueWith(r3, r4)
            java.util.concurrent.ThreadPoolExecutor r3 = r5.f18499d
            n40.b r4 = new n40.b
            m40.a r10 = r5.f18496a
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.tasks.Task r0 = r0.continueWith(r3, r4)
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x00fe
        L_0x00fb:
            r4 = r22
            goto L_0x0132
        L_0x00fe:
            java.util.Iterator r0 = r0.iterator()
        L_0x0102:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00fb
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.moovit.util.time.Time r4 = (com.moovit.util.time.Time) r4
            int r5 = r4.compareTo(r1)
            if (r5 < 0) goto L_0x011d
            int r4 = r4.compareTo(r2)
            if (r4 > 0) goto L_0x011d
            r4 = 1
            goto L_0x011e
        L_0x011d:
            r4 = 0
        L_0x011e:
            if (r4 == 0) goto L_0x0102
            r4 = r22
            r4.add(r3)
            int r3 = r4.size()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r3 < r5) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r22 = r4
            goto L_0x0102
        L_0x0132:
            int r0 = r4.size()
            r3 = r23
            int r5 = r3.f18852n
            if (r0 < r5) goto L_0x013d
            goto L_0x0146
        L_0x013d:
            r0 = r3
            r5 = r4
            r3 = r17
            r4 = 1
            goto L_0x0089
        L_0x0144:
            r3 = r0
            r4 = r5
        L_0x0146:
            yy.c r0 = new yy.c
            com.moovit.network.model.ServerId r7 = r3.f18849k
            com.moovit.network.model.ServerId r8 = r3.f18850l
            com.moovit.transit.Schedule r9 = new com.moovit.transit.Schedule
            r1 = 0
            r9.<init>(r4, r1)
            r10 = 0
            java.util.Map r11 = java.util.Collections.emptyMap()
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n40.C5863e.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
