package p360ah;

import android.content.Context;
import android.hardware.Camera;
import p385bh.C13625a;

/* renamed from: ah.c */
public final class C13464c {

    /* renamed from: a */
    public final C13462b f33323a;

    /* renamed from: b */
    public C13625a f33324b;

    /* renamed from: c */
    public C13460a f33325c;

    /* renamed from: d */
    public boolean f33326d;

    /* renamed from: e */
    public boolean f33327e;

    /* renamed from: f */
    public Camera.PreviewCallback f33328f;

    /* renamed from: g */
    public int f33329g = 0;

    /* renamed from: h */
    public int f33330h = -1;

    /* renamed from: i */
    public long f33331i = InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS;

    public C13464c(Context context) {
        this.f33323a = new C13462b(context);
    }

    /* renamed from: a */
    public final synchronized void mo40369a() {
        if (mo40370b()) {
            this.f33324b.f33592b.release();
            this.f33324b = null;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo40370b() {
        boolean z;
        C13625a aVar = this.f33324b;
        if (aVar == null || aVar.f33592b == null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:1|2|(2:4|(2:9|10)(1:8))|11|(1:13)|14|(1:16)(1:17)|(2:18|19)|26|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0066 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40371c(android.view.SurfaceHolder r5, int r6, int r7) throws java.io.IOException {
        /*
            r4 = this;
            monitor-enter(r4)
            bh.a r0 = r4.f33324b     // Catch:{ all -> 0x006b }
            boolean r1 = r4.mo40370b()     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0020
            int r0 = r4.f33330h     // Catch:{ all -> 0x006b }
            bh.a r0 = p385bh.C13626b.m34031a(r0)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0018
            android.hardware.Camera r1 = r0.f33592b     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0018
            r4.f33324b = r0     // Catch:{ all -> 0x006b }
            goto L_0x0020
        L_0x0018:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x006b }
            java.lang.String r6 = "Camera.open() failed to return object from driver"
            r5.<init>(r6)     // Catch:{ all -> 0x006b }
            throw r5     // Catch:{ all -> 0x006b }
        L_0x0020:
            android.hardware.Camera r1 = r0.f33592b     // Catch:{ all -> 0x006b }
            r1.setPreviewDisplay(r5)     // Catch:{ all -> 0x006b }
            android.hardware.Camera r1 = r0.f33592b     // Catch:{ all -> 0x006b }
            android.hardware.Camera$PreviewCallback r2 = r4.f33328f     // Catch:{ all -> 0x006b }
            r1.setPreviewCallback(r2)     // Catch:{ all -> 0x006b }
            android.hardware.Camera r1 = r0.f33592b     // Catch:{ all -> 0x006b }
            int r2 = r4.f33329g     // Catch:{ all -> 0x006b }
            r1.setDisplayOrientation(r2)     // Catch:{ all -> 0x006b }
            boolean r1 = r4.f33326d     // Catch:{ all -> 0x006b }
            r2 = 1
            if (r1 != 0) goto L_0x003f
            r4.f33326d = r2     // Catch:{ all -> 0x006b }
            ah.b r1 = r4.f33323a     // Catch:{ all -> 0x006b }
            r1.mo40366c(r0, r6, r7)     // Catch:{ all -> 0x006b }
        L_0x003f:
            android.hardware.Camera r6 = r0.f33592b     // Catch:{ all -> 0x006b }
            android.hardware.Camera$Parameters r7 = r6.getParameters()     // Catch:{ all -> 0x006b }
            if (r7 != 0) goto L_0x0049
            r7 = 0
            goto L_0x004d
        L_0x0049:
            java.lang.String r7 = r7.flatten()     // Catch:{ all -> 0x006b }
        L_0x004d:
            ah.b r1 = r4.f33323a     // Catch:{ RuntimeException -> 0x0054 }
            r3 = 0
            r1.mo40367d(r0, r3)     // Catch:{ RuntimeException -> 0x0054 }
            goto L_0x0066
        L_0x0054:
            if (r7 == 0) goto L_0x0066
            android.hardware.Camera$Parameters r1 = r6.getParameters()     // Catch:{ all -> 0x006b }
            r1.unflatten(r7)     // Catch:{ all -> 0x006b }
            r6.setParameters(r1)     // Catch:{ RuntimeException -> 0x0066 }
            ah.b r7 = r4.f33323a     // Catch:{ RuntimeException -> 0x0066 }
            r7.mo40367d(r0, r2)     // Catch:{ RuntimeException -> 0x0066 }
        L_0x0066:
            r6.setPreviewDisplay(r5)     // Catch:{ all -> 0x006b }
            monitor-exit(r4)
            return
        L_0x006b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p360ah.C13464c.mo40371c(android.view.SurfaceHolder, int, int):void");
    }

    /* renamed from: d */
    public final synchronized void mo40372d() {
        C13625a aVar = this.f33324b;
        if (aVar != null && !this.f33327e) {
            aVar.f33592b.startPreview();
            this.f33327e = true;
            C13460a aVar2 = new C13460a(aVar.f33592b);
            this.f33325c = aVar2;
            long j = this.f33331i;
            if (j > 0) {
                aVar2.f33310a = j;
            } else {
                throw new IllegalArgumentException("AutoFocusInterval must be greater than 0.");
            }
        }
    }

    /* renamed from: e */
    public final synchronized void mo40373e() {
        C13460a aVar = this.f33325c;
        if (aVar != null) {
            aVar.mo40363c();
            this.f33325c = null;
        }
        C13625a aVar2 = this.f33324b;
        if (aVar2 != null && this.f33327e) {
            aVar2.f33592b.stopPreview();
            this.f33327e = false;
        }
    }
}
