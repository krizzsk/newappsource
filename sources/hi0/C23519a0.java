package hi0;

import java.io.File;

/* renamed from: hi0.a0 */
public final class C23519a0 extends C23521b0 {

    /* renamed from: a */
    public final /* synthetic */ C23562t f59380a;

    /* renamed from: b */
    public final /* synthetic */ File f59381b;

    public C23519a0(C23562t tVar, File file) {
        this.f59380a = tVar;
        this.f59381b = file;
    }

    /* renamed from: a */
    public final long mo53612a() {
        return this.f59381b.length();
    }

    /* renamed from: b */
    public final C23562t mo53613b() {
        return this.f59380a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r1 = move-exception;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53614e(si0.C24901h r3) throws java.io.IOException {
        /*
            r2 = this;
            java.io.File r0 = r2.f59381b
            si0.q r0 = si0.C24911r.m62552h(r0)
            r3.mo61417q1(r0)     // Catch:{ all -> 0x000d }
            r0.close()
            return
        L_0x000d:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x000f }
        L_0x000f:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x0018:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C23519a0.mo53614e(si0.h):void");
    }
}
