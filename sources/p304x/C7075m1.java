package p304x;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C0586j;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.C0595r;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import java.util.Set;
import p001a0.C0016g;
import p032c0.C1754d;
import p054d0.C4292l;
import p066e0.C4415a0;
import p102h0.C5018c;
import p115i0.C5233i;

/* renamed from: x.m1 */
public final class C7075m1 {

    /* renamed from: a */
    public C4415a0 f21991a;

    /* renamed from: b */
    public final SessionConfig f21992b;

    /* renamed from: x.m1$a */
    public class C7076a implements C5018c<Void> {

        /* renamed from: a */
        public final /* synthetic */ Surface f21993a;

        /* renamed from: b */
        public final /* synthetic */ SurfaceTexture f21994b;

        public C7076a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f21993a = surface;
            this.f21994b = surfaceTexture;
        }

        public final void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        public final void onSuccess(Object obj) {
            Void voidR = (Void) obj;
            this.f21993a.release();
            this.f21994b.release();
        }
    }

    /* renamed from: x.m1$b */
    public static class C7077b implements C0595r<UseCase> {

        /* renamed from: x */
        public final C0589m f21995x;

        public C7077b() {
            C0589m t = C0589m.m1674t();
            t.mo2503w(C0595r.f2026o, new C7088p0());
            this.f21995x = t;
        }

        /* renamed from: a */
        public final Object mo2422a(Config.C0564a aVar) {
            return ((C0590n) getConfig()).mo2422a(aVar);
        }

        /* renamed from: b */
        public final Object mo2423b(Config.C0564a aVar, Object obj) {
            return ((C0590n) getConfig()).mo2423b(aVar, obj);
        }

        /* renamed from: c */
        public final Config.OptionPriority mo2424c(Config.C0564a aVar) {
            return ((C0590n) getConfig()).mo2424c(aVar);
        }

        /* renamed from: e */
        public final boolean mo2425e(Config.C0564a aVar) {
            return this.f21995x.mo2425e(aVar);
        }

        /* renamed from: f */
        public final Object mo2426f(Config.C0564a aVar, Config.OptionPriority optionPriority) {
            return ((C0590n) getConfig()).mo2426f(aVar, optionPriority);
        }

        public final Config getConfig() {
            return this.f21995x;
        }

        public final int getInputFormat() {
            return ((Integer) mo2422a(C0586j.f2004e)).intValue();
        }

        public final /* synthetic */ String getTargetName(String str) {
            return C0016g.m18a(this, str);
        }

        /* renamed from: h */
        public final Set mo2429h(Config.C0564a aVar) {
            return ((C0590n) getConfig()).mo2429h(aVar);
        }

        /* renamed from: l */
        public final void mo2430l(C1754d dVar) {
            this.f21995x.mo2430l(dVar);
        }

        public final Set listOptions() {
            return ((C0590n) getConfig()).listOptions();
        }

        /* renamed from: m */
        public final UseCase.C0539b mo2494m() {
            return (UseCase.C0539b) mo2423b(C5233i.f17326w, null);
        }

        /* renamed from: n */
        public final SessionConfig mo2495n() {
            return (SessionConfig) mo2423b(C0595r.f2024m, (Object) null);
        }

        /* renamed from: o */
        public final /* synthetic */ int mo2496o() {
            return C13555b.m33962a(this);
        }

        /* renamed from: p */
        public final SessionConfig.C0568d mo2497p() {
            return (SessionConfig.C0568d) mo2423b(C0595r.f2026o, (Object) null);
        }

        /* renamed from: q */
        public final C4292l mo2498q() {
            return (C4292l) mo2423b(C0595r.f2029r, (Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [java.lang.Object[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
        r1 = (android.util.Size) r1.get(r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7075m1(p316y.C7225s r18, p304x.C7039d1 r19) {
        /*
            r17 = this;
            r0 = r17
            r17.<init>()
            b0.k r1 = new b0.k
            r1.<init>()
            x.m1$b r2 = new x.m1$b
            r2.<init>()
            android.graphics.SurfaceTexture r3 = new android.graphics.SurfaceTexture
            r4 = 0
            r3.<init>(r4)
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            r6 = r18
            java.lang.Object r5 = r6.mo23532a(r5)
            android.hardware.camera2.params.StreamConfigurationMap r5 = (android.hardware.camera2.params.StreamConfigurationMap) r5
            java.lang.String r7 = "MeteringRepeating"
            if (r5 != 0) goto L_0x002d
            p054d0.C4289j0.m11435b(r7)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r4, r4)
            goto L_0x00e0
        L_0x002d:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r8 >= r9) goto L_0x003a
            java.lang.Class<android.graphics.SurfaceTexture> r8 = android.graphics.SurfaceTexture.class
            android.util.Size[] r5 = r5.getOutputSizes(r8)
            goto L_0x0040
        L_0x003a:
            r8 = 34
            android.util.Size[] r5 = r5.getOutputSizes(r8)
        L_0x0040:
            if (r5 != 0) goto L_0x004c
            p054d0.C4289j0.m11435b(r7)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r4, r4)
            goto L_0x00e0
        L_0x004c:
            a0.y r1 = r1.f5285a
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r8 = "Huawei"
            boolean r1 = r8.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0066
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r8 = "mha-l29"
            boolean r1 = r8.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0066
            r1 = 1
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 == 0) goto L_0x008d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r8 = r5.length
            r9 = 0
        L_0x0070:
            if (r9 >= r8) goto L_0x0084
            r10 = r5[r9]
            f0.b r11 = p019b0.C1434k.f5284c
            android.util.Size r12 = p019b0.C1434k.f5283b
            int r11 = r11.compare(r10, r12)
            if (r11 < 0) goto L_0x0081
            r1.add(r10)
        L_0x0081:
            int r9 = r9 + 1
            goto L_0x0070
        L_0x0084:
            android.util.Size[] r5 = new android.util.Size[r4]
            java.lang.Object[] r1 = r1.toArray(r5)
            r5 = r1
            android.util.Size[] r5 = (android.util.Size[]) r5
        L_0x008d:
            java.util.List r1 = java.util.Arrays.asList(r5)
            x.l1 r8 = new x.l1
            r8.<init>(r4)
            java.util.Collections.sort(r1, r8)
            android.util.Size r8 = r19.mo23301d()
            int r9 = r8.getWidth()
            long r9 = (long) r9
            int r8 = r8.getHeight()
            long r11 = (long) r8
            long r9 = r9 * r11
            r11 = 307200(0x4b000, double:1.51777E-318)
            long r8 = java.lang.Math.min(r9, r11)
            r10 = 0
            int r11 = r5.length
            r12 = 0
        L_0x00b3:
            if (r12 >= r11) goto L_0x00da
            r13 = r5[r12]
            int r14 = r13.getWidth()
            long r14 = (long) r14
            int r6 = r13.getHeight()
            r16 = r5
            long r4 = (long) r6
            long r14 = r14 * r4
            int r4 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00cb
            r1 = r13
            goto L_0x00e0
        L_0x00cb:
            if (r4 <= 0) goto L_0x00d3
            if (r10 == 0) goto L_0x00d1
            r1 = r10
            goto L_0x00e0
        L_0x00d1:
            r4 = 0
            goto L_0x00da
        L_0x00d3:
            int r12 = r12 + 1
            r10 = r13
            r5 = r16
            r4 = 0
            goto L_0x00b3
        L_0x00da:
            java.lang.Object r1 = r1.get(r4)
            android.util.Size r1 = (android.util.Size) r1
        L_0x00e0:
            java.util.Objects.toString(r1)
            p054d0.C4289j0.m11435b(r7)
            int r4 = r1.getWidth()
            int r1 = r1.getHeight()
            r3.setDefaultBufferSize(r4, r1)
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r3)
            androidx.camera.core.impl.SessionConfig$b r2 = androidx.camera.core.impl.SessionConfig.C0566b.m1604d(r2)
            androidx.camera.core.impl.e$a r4 = r2.f1940b
            r5 = 1
            r4.f1979c = r5
            e0.a0 r4 = new e0.a0
            r4.<init>(r1)
            r0.f21991a = r4
            od.c r4 = r4.mo2453d()
            x.m1$a r5 = new x.m1$a
            r5.<init>(r1, r3)
            g0.a r1 = com.google.android.play.core.appupdate.C14226d.m35352s0()
            p102h0.C5023g.m12853a(r4, r5, r1)
            e0.a0 r1 = r0.f21991a
            java.util.LinkedHashSet r3 = r2.f1939a
            r3.add(r1)
            androidx.camera.core.impl.e$a r3 = r2.f1940b
            java.util.HashSet r3 = r3.f1977a
            r3.add(r1)
            androidx.camera.core.impl.SessionConfig r1 = r2.mo2460c()
            r0.f21992b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7075m1.<init>(y.s, x.d1):void");
    }
}
