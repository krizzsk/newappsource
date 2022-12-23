package vd0;

import ce0.C21113o;
import ud0.C25022f;
import ud0.C25023g;
import ud0.C25024h;
import wd0.C25127a;

/* renamed from: vd0.a */
public final class C25087a extends C21113o {

    /* renamed from: b */
    public final C25023g f63292b;

    /* renamed from: c */
    public final C25022f f63293c;

    /* renamed from: d */
    public final C25024h f63294d;

    /* renamed from: e */
    public final C25127a f63295e;

    static {
        Class<C25087a> cls = C25087a.class;
    }

    public C25087a(C25023g gVar, C25022f fVar, C25024h hVar, C25127a aVar) {
        this.f63292b = gVar;
        this.f63293c = fVar;
        this.f63294d = hVar;
        this.f63295e = aVar;
    }

    /* renamed from: f */
    public final Integer mo53315f() {
        return Integer.valueOf(this.f63292b.f63204i);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0043 A[Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            wd0.a r0 = r8.f63295e
            if (r0 == 0) goto L_0x0027
            ud0.g r1 = r8.f63292b     // Catch:{ all -> 0x0027 }
            bl.g r0 = (p389bl.C13641g) r0     // Catch:{ all -> 0x0027 }
            r0.getClass()     // Catch:{ all -> 0x0027 }
            int r0 = r1.f63204i     // Catch:{ all -> 0x0027 }
            r1 = 0
            int r0 = r0 + -2
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0027 }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0027 }
            int r0 = r0 + 10
            r1 = 19
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0027 }
            android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x0027 }
            ud0.g r0 = r8.f63292b     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = r0.f63197b     // Catch:{ all -> 0x0027 }
        L_0x0027:
            ud0.g r0 = r8.f63292b     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            java.lang.String r1 = r0.f63197b     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            android.os.Bundle r0 = r0.f63202g     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            r2.getName()     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            ud0.f r2 = r8.f63293c     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            ud0.e r1 = r2.mo61559a(r1)     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            ud0.h r2 = r8.f63294d     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            int r0 = r1.mo61555a(r0, r2)     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            r1 = 2
            if (r0 != r1) goto L_0x0075
            ud0.g r0 = r8.f63292b     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            long r1 = r0.f63200e     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x004f
            r1 = r3
            goto L_0x0065
        L_0x004f:
            long r5 = r0.f63201f     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0058
            r0.f63201f = r1     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            goto L_0x0063
        L_0x0058:
            int r1 = r0.f63203h     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            r2 = 1
            if (r1 != r2) goto L_0x0063
            r1 = 2
            long r5 = r5 * r1
            r0.f63201f = r5     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
        L_0x0063:
            long r1 = r0.f63201f     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
        L_0x0065:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0075
            r0.f63199d = r1     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            ud0.h r1 = r8.f63294d     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            r1.mo58356b(r0)     // Catch:{ UnknownTagException -> 0x0071, all -> 0x0075 }
            goto L_0x0075
        L_0x0071:
            r0 = move-exception
            r0.getLocalizedMessage()
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vd0.C25087a.run():void");
    }
}
