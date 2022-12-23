package p304x;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0587k;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.C0595r;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import p001a0.C0022m;
import p001a0.C0034x;
import p066e0.C4427f0;
import p066e0.C4428g;
import p066e0.C4450p0;
import p291w.C6956a;

/* renamed from: x.q0 */
public final class C7094q0 implements UseCaseConfigFactory {

    /* renamed from: b */
    public final C7039d1 f22062b;

    /* renamed from: x.q0$a */
    public static /* synthetic */ class C7095a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22063a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType[] r0 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22063a = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22063a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22063a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22063a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p304x.C7094q0.C7095a.<clinit>():void");
        }
    }

    public C7094q0(Context context) {
        this.f22062b = C7039d1.m16545b(context);
    }

    /* renamed from: a */
    public final Config mo2468a(UseCaseConfigFactory.CaptureType captureType, int i) {
        int i2;
        Object obj;
        C7094q0 q0Var;
        int i3;
        int i4;
        UseCaseConfigFactory.CaptureType captureType2 = captureType;
        int i5 = i;
        C0589m t = C0589m.m1674t();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0578e.C0579a aVar = new C0578e.C0579a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int[] iArr = C7095a.f22063a;
        int i6 = iArr[captureType.ordinal()];
        if (i6 == 1) {
            if (i5 == 2) {
                i4 = 5;
            } else {
                i4 = 1;
            }
            aVar.f1979c = i4;
        } else if (i6 == 2 || i6 == 3) {
            aVar.f1979c = 1;
        } else if (i6 == 4) {
            aVar.f1979c = 3;
        }
        UseCaseConfigFactory.CaptureType captureType3 = UseCaseConfigFactory.CaptureType.PREVIEW;
        if (captureType2 == captureType3 && ((C0034x) C0022m.m93a(C0034x.class)) != null) {
            C0589m t2 = C0589m.m1674t();
            t2.mo2503w(C6956a.m16424s(CaptureRequest.TONEMAP_MODE), 2);
            aVar.mo2481c(new C6956a(C0590n.m1678s(t2)));
        }
        C0572a aVar2 = C0595r.f2024m;
        UseCaseConfigFactory.CaptureType captureType4 = captureType3;
        SessionConfig sessionConfig = r6;
        SessionConfig sessionConfig2 = new SessionConfig(new ArrayList(linkedHashSet), arrayList, arrayList2, arrayList4, arrayList3, aVar.mo2482d(), (InputConfiguration) null);
        t.mo2503w(aVar2, sessionConfig);
        t.mo2503w(C0595r.f2026o, C7088p0.f22032a);
        HashSet hashSet = new HashSet();
        C0589m t3 = C0589m.m1674t();
        ArrayList arrayList5 = new ArrayList();
        C4427f0 c = C4427f0.m11609c();
        int i7 = iArr[captureType.ordinal()];
        if (i7 == 1) {
            if (i5 == 2) {
                i3 = 5;
            } else {
                i3 = 2;
            }
            i2 = i3;
        } else if (i7 == 2 || i7 == 3) {
            i2 = 1;
        } else if (i7 != 4) {
            i2 = -1;
        } else {
            i2 = 3;
        }
        C0572a aVar3 = C0595r.f2025n;
        ArrayList arrayList6 = new ArrayList(hashSet);
        C0590n s = C0590n.m1678s(t3);
        C4450p0 p0Var = C4450p0.f15508b;
        ArrayMap arrayMap = new ArrayMap();
        for (String next : c.mo19987b()) {
            arrayMap.put(next, c.mo19986a(next));
        }
        t.mo2503w(aVar3, new C0578e(arrayList6, s, i2, arrayList5, false, new C4450p0(arrayMap), (C4428g) null));
        C0572a aVar4 = C0595r.f2027p;
        if (captureType2 == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE) {
            obj = C7069k1.f21981c;
        } else {
            obj = C7032c0.f21879a;
        }
        t.mo2503w(aVar4, obj);
        if (captureType2 == captureType4) {
            q0Var = this;
            t.mo2503w(C0587k.f2010k, q0Var.f22062b.mo23301d());
        } else {
            q0Var = this;
        }
        t.mo2503w(C0587k.f2006g, Integer.valueOf(q0Var.f22062b.mo23300c().getRotation()));
        return C0590n.m1678s(t);
    }
}
