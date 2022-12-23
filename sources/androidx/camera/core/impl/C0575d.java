package androidx.camera.core.impl;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p054d0.C4279f;
import p054d0.C4289j0;

/* renamed from: androidx.camera.core.impl.d */
public final class C0575d {

    /* renamed from: a */
    public final StringBuilder f1960a = new StringBuilder();

    /* renamed from: b */
    public final Object f1961b = new Object();

    /* renamed from: c */
    public final int f1962c = 1;

    /* renamed from: d */
    public final HashMap f1963d = new HashMap();

    /* renamed from: e */
    public int f1964e;

    /* renamed from: androidx.camera.core.impl.d$a */
    public static class C0576a {

        /* renamed from: a */
        public CameraInternal.State f1965a = null;

        /* renamed from: b */
        public final Executor f1966b;

        /* renamed from: c */
        public final C0577b f1967c;

        public C0576a(SequentialExecutor sequentialExecutor, Camera2CameraImpl.C0495c cVar) {
            this.f1966b = sequentialExecutor;
            this.f1967c = cVar;
        }
    }

    /* renamed from: androidx.camera.core.impl.d$b */
    public interface C0577b {
    }

    public C0575d() {
        synchronized ("mLock") {
            this.f1964e = 1;
        }
    }

    /* renamed from: a */
    public final void mo2476a() {
        boolean z;
        String str;
        if (C4289j0.m11434a("CameraStateRegistry")) {
            this.f1960a.setLength(0);
            this.f1960a.append("Recalculating open cameras:\n");
            this.f1960a.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{"Camera", "State"}));
            this.f1960a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.f1963d.entrySet()) {
            if (C4289j0.m11434a("CameraStateRegistry")) {
                if (((C0576a) entry.getValue()).f1965a != null) {
                    str = ((C0576a) entry.getValue()).f1965a.toString();
                } else {
                    str = "UNKNOWN";
                }
                this.f1960a.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{((C4279f) entry.getKey()).toString(), str}));
            }
            CameraInternal.State state = ((C0576a) entry.getValue()).f1965a;
            if (state == null || !state.holdsCameraSlot()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i++;
            }
        }
        if (C4289j0.m11434a("CameraStateRegistry")) {
            this.f1960a.append("-------------------------------------------------------------------\n");
            this.f1960a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f1962c)}));
            this.f1960a.getClass();
            C4289j0.m11435b("CameraStateRegistry");
        }
        this.f1964e = Math.max(this.f1962c - i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2477b(p054d0.C4279f r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f1961b
            monitor-enter(r0)
            java.util.HashMap r1 = r9.f1963d     // Catch:{ all -> 0x009f }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ all -> 0x009f }
            androidx.camera.core.impl.d$a r1 = (androidx.camera.core.impl.C0575d.C0576a) r1     // Catch:{ all -> 0x009f }
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            mf0.C24361g.m61185s(r1, r2)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = p054d0.C4289j0.m11434a(r2)     // Catch:{ all -> 0x009f }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0053
            java.lang.StringBuilder r2 = r9.f1960a     // Catch:{ all -> 0x009f }
            r2.setLength(r3)     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r2 = r9.f1960a     // Catch:{ all -> 0x009f }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x009f }
            r7[r3] = r10     // Catch:{ all -> 0x009f }
            int r10 = r9.f1964e     // Catch:{ all -> 0x009f }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x009f }
            r7[r4] = r10     // Catch:{ all -> 0x009f }
            r10 = 2
            androidx.camera.core.impl.CameraInternal$State r8 = r1.f1965a     // Catch:{ all -> 0x009f }
            if (r8 == 0) goto L_0x0040
            boolean r8 = r8.holdsCameraSlot()     // Catch:{ all -> 0x009f }
            if (r8 == 0) goto L_0x0040
            r8 = 1
            goto L_0x0041
        L_0x0040:
            r8 = 0
        L_0x0041:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x009f }
            r7[r10] = r8     // Catch:{ all -> 0x009f }
            r10 = 3
            androidx.camera.core.impl.CameraInternal$State r8 = r1.f1965a     // Catch:{ all -> 0x009f }
            r7[r10] = r8     // Catch:{ all -> 0x009f }
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch:{ all -> 0x009f }
            r2.append(r10)     // Catch:{ all -> 0x009f }
        L_0x0053:
            int r10 = r9.f1964e     // Catch:{ all -> 0x009f }
            if (r10 > 0) goto L_0x0069
            androidx.camera.core.impl.CameraInternal$State r10 = r1.f1965a     // Catch:{ all -> 0x009f }
            if (r10 == 0) goto L_0x0063
            boolean r10 = r10.holdsCameraSlot()     // Catch:{ all -> 0x009f }
            if (r10 == 0) goto L_0x0063
            r10 = 1
            goto L_0x0064
        L_0x0063:
            r10 = 0
        L_0x0064:
            if (r10 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r10 = 0
            goto L_0x006e
        L_0x0069:
            androidx.camera.core.impl.CameraInternal$State r10 = androidx.camera.core.impl.CameraInternal.State.OPENING     // Catch:{ all -> 0x009f }
            r1.f1965a = r10     // Catch:{ all -> 0x009f }
            r10 = 1
        L_0x006e:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = p054d0.C4289j0.m11434a(r1)     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0098
            java.lang.StringBuilder r1 = r9.f1960a     // Catch:{ all -> 0x009f }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x009f }
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x009f }
            if (r10 == 0) goto L_0x0083
            java.lang.String r6 = "SUCCESS"
            goto L_0x0085
        L_0x0083:
            java.lang.String r6 = "FAIL"
        L_0x0085:
            r4[r3] = r6     // Catch:{ all -> 0x009f }
            java.lang.String r2 = java.lang.String.format(r2, r5, r4)     // Catch:{ all -> 0x009f }
            r1.append(r2)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.f1960a     // Catch:{ all -> 0x009f }
            r2.getClass()     // Catch:{ all -> 0x009f }
            p054d0.C4289j0.m11435b(r1)     // Catch:{ all -> 0x009f }
        L_0x0098:
            if (r10 == 0) goto L_0x009d
            r9.mo2476a()     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            return r10
        L_0x009f:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0575d.mo2477b(d0.f):boolean");
    }
}
