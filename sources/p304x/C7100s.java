package p304x;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.C0575d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import p066e0.C4440l;
import p066e0.C4447o;
import p316y.C7197a0;
import p583jk.C17875h;

/* renamed from: x.s */
public final class C7100s implements C4440l {

    /* renamed from: a */
    public final C4447o f22075a;

    /* renamed from: b */
    public final C0575d f22076b;

    /* renamed from: c */
    public final C7197a0 f22077c;

    /* renamed from: d */
    public final ArrayList f22078d;

    /* renamed from: e */
    public final C7039d1 f22079e;

    /* renamed from: f */
    public final HashMap f22080f = new HashMap();

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7100s(android.content.Context r6, p066e0.C4414a r7, p054d0.C4292l r8) throws androidx.camera.core.InitializationException {
        /*
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.f22080f = r0
            r5.f22075a = r7
            androidx.camera.core.impl.d r0 = new androidx.camera.core.impl.d
            r0.<init>()
            r5.f22076b = r0
            android.os.Handler r7 = r7.f15476b
            y.a0 r7 = p316y.C7197a0.m16800a(r6, r7)
            r5.f22077c = r7
            x.d1 r6 = p304x.C7039d1.m16545b(r6)
            r5.f22079e = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            r6.<init>()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            y.a0$b r0 = r7.f22323a     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            y.d0 r0 = (p316y.C7205d0) r0     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            r0.getClass()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            android.hardware.camera2.CameraManager r0 = r0.f22329a     // Catch:{ CameraAccessException -> 0x0106 }
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch:{ CameraAccessException -> 0x0106 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            if (r8 != 0) goto L_0x004d
            java.util.Iterator r7 = r0.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
        L_0x003d:
            boolean r8 = r7.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            if (r8 == 0) goto L_0x0099
            java.lang.Object r8 = r7.next()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            r6.add(r8)     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            goto L_0x003d
        L_0x004d:
            java.lang.Integer r1 = r8.mo19816c()     // Catch:{ IllegalStateException -> 0x0056 }
            java.lang.String r7 = p304x.C7110v0.m16650a(r7, r1, r0)     // Catch:{ IllegalStateException -> 0x0056 }
            goto L_0x0057
        L_0x0056:
            r7 = 0
        L_0x0057:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            r1.<init>()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
        L_0x0060:
            boolean r2 = r0.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            if (r2 == 0) goto L_0x007b
            java.lang.Object r2 = r0.next()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            boolean r3 = r2.equals(r7)     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            if (r3 == 0) goto L_0x0073
            goto L_0x0060
        L_0x0073:
            x.z r2 = r5.mo23349b(r2)     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            r1.add(r2)     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            goto L_0x0060
        L_0x007b:
            java.util.List r7 = r8.mo19815b(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
        L_0x0083:
            boolean r8 = r7.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            if (r8 == 0) goto L_0x0099
            java.lang.Object r8 = r7.next()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            d0.j r8 = (p054d0.C4288j) r8     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            e0.m r8 = (p066e0.C4443m) r8     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            java.lang.String r8 = r8.getCameraId()     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            r6.add(r8)     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            goto L_0x0083
        L_0x0099:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00a2:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0103
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = "0"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = "1"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00bf
            goto L_0x00ff
        L_0x00bf:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "robolectric"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00cb
            goto L_0x00e3
        L_0x00cb:
            y.a0 r0 = r5.f22077c     // Catch:{ CameraAccessExceptionCompat -> 0x00f4 }
            y.s r0 = r0.mo23499b(r8)     // Catch:{ CameraAccessExceptionCompat -> 0x00f4 }
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES     // Catch:{ CameraAccessExceptionCompat -> 0x00f4 }
            java.lang.Object r0 = r0.mo23532a(r2)     // Catch:{ CameraAccessExceptionCompat -> 0x00f4 }
            int[] r0 = (int[]) r0     // Catch:{ CameraAccessExceptionCompat -> 0x00f4 }
            if (r0 == 0) goto L_0x00e8
            int r2 = r0.length
            r3 = 0
        L_0x00dd:
            if (r3 >= r2) goto L_0x00e8
            r4 = r0[r3]
            if (r4 != 0) goto L_0x00e5
        L_0x00e3:
            r1 = 1
            goto L_0x00e8
        L_0x00e5:
            int r3 = r3 + 1
            goto L_0x00dd
        L_0x00e8:
            if (r1 == 0) goto L_0x00ee
            r7.add(r8)
            goto L_0x00a2
        L_0x00ee:
            java.lang.String r8 = "Camera2CameraFactory"
            p054d0.C4289j0.m11435b(r8)
            goto L_0x00a2
        L_0x00f4:
            r6 = move-exception
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException
            androidx.camera.core.CameraUnavailableException r6 = p583jk.C17875h.m44310u(r6)
            r7.<init>(r6)
            throw r7
        L_0x00ff:
            r7.add(r8)
            goto L_0x00a2
        L_0x0103:
            r5.f22078d = r7
            return
        L_0x0106:
            r6 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r7 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            r7.<init>((android.hardware.camera2.CameraAccessException) r6)     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
            throw r7     // Catch:{ CameraAccessExceptionCompat -> 0x0114, CameraUnavailableException -> 0x010d }
        L_0x010d:
            r6 = move-exception
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException
            r7.<init>(r6)
            throw r7
        L_0x0114:
            r6 = move-exception
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException
            androidx.camera.core.CameraUnavailableException r6 = p583jk.C17875h.m44310u(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7100s.<init>(android.content.Context, e0.a, d0.l):void");
    }

    /* renamed from: a */
    public final C7197a0 mo19972a() {
        return this.f22077c;
    }

    /* renamed from: b */
    public final C7124z mo23349b(String str) throws CameraUnavailableException {
        try {
            C7124z zVar = (C7124z) this.f22080f.get(str);
            if (zVar != null) {
                return zVar;
            }
            C7124z zVar2 = new C7124z(str, this.f22077c);
            this.f22080f.put(str, zVar2);
            return zVar2;
        } catch (CameraAccessExceptionCompat e) {
            throw C17875h.m44310u(e);
        }
    }

    public final LinkedHashSet getAvailableCameraIds() {
        return new LinkedHashSet(this.f22078d);
    }

    public final Camera2CameraImpl getCamera(String str) throws CameraUnavailableException {
        if (this.f22078d.contains(str)) {
            return new Camera2CameraImpl(this.f22077c, str, mo23349b(str), this.f22076b, this.f22075a.mo19922a(), this.f22075a.mo19923b(), this.f22079e);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }
}
