package ma0;

import ya0.C13281g;

/* renamed from: ma0.a */
public final class C12895a {

    /* renamed from: a */
    public int f31909a;

    /* renamed from: b */
    public int f31910b;

    /* renamed from: c */
    public C12896a f31911c = new C12896a();

    /* renamed from: ma0.a$a */
    public class C12896a extends C13281g<byte[]> {
        public C12896a() {
        }

        /* renamed from: f */
        public final boolean mo39760f(long j, Object obj) {
            byte[] bArr = (byte[]) obj;
            C12895a aVar = C12895a.this;
            int i = aVar.f31910b;
            if (i <= aVar.f31909a) {
                return false;
            }
            aVar.f31910b = i - bArr.length;
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized byte[] mo39758a(long j) {
        if (this.f31909a == 0) {
            return null;
        }
        return (byte[]) this.f31911c.mo40145a(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39759b(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f31909a     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            ma0.a$a r0 = r3.f31911c     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.mo40145a(r4)     // Catch:{ all -> 0x002f }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0013
            monitor-exit(r3)
            return
        L_0x0013:
            int r1 = r3.f31910b     // Catch:{ all -> 0x002f }
            int r0 = r0.length     // Catch:{ all -> 0x002f }
            int r1 = r1 - r0
            r3.f31910b = r1     // Catch:{ all -> 0x002f }
            ma0.a$a r0 = r3.f31911c     // Catch:{ all -> 0x002f }
            ya0.h<ya0.g<V>$a<V>> r1 = r0.f32949a     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r1.mo40149a(r4)     // Catch:{ all -> 0x002f }
            ya0.g$a r1 = (ya0.C13281g.C13282a) r1     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002d
            ya0.h<ya0.g<V>$a<V>> r2 = r0.f32949a     // Catch:{ all -> 0x002f }
            r2.mo40150d(r4)     // Catch:{ all -> 0x002f }
            r0.mo40148g(r1)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r3)
            return
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ma0.C12895a.mo39759b(long):void");
    }
}
