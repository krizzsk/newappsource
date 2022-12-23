package p304x;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C0573b;
import androidx.camera.core.impl.C0587k;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mf0.C24361g;
import p019b0.C1425b;
import p019b0.C1426c;
import p019b0.C1432i;
import p066e0.C4420d;
import p066e0.C4446n0;
import p078f0.C4635b;
import p316y.C7225s;
import p389bl.C13641g;

/* renamed from: x.o1 */
public final class C7085o1 {

    /* renamed from: q */
    public static final Size f22004q = new Size(640, 480);

    /* renamed from: r */
    public static final Size f22005r = new Size(0, 0);

    /* renamed from: s */
    public static final Size f22006s = new Size(1920, 1080);

    /* renamed from: t */
    public static final Size f22007t = new Size(720, 480);

    /* renamed from: u */
    public static final Rational f22008u = new Rational(4, 3);

    /* renamed from: v */
    public static final Rational f22009v = new Rational(3, 4);

    /* renamed from: w */
    public static final Rational f22010w = new Rational(16, 9);

    /* renamed from: x */
    public static final Rational f22011x = new Rational(9, 16);

    /* renamed from: a */
    public final ArrayList f22012a;

    /* renamed from: b */
    public final HashMap f22013b = new HashMap();

    /* renamed from: c */
    public final String f22014c;

    /* renamed from: d */
    public final C7027b f22015d;

    /* renamed from: e */
    public final C7225s f22016e;

    /* renamed from: f */
    public final C1425b f22017f;

    /* renamed from: g */
    public final C1426c f22018g;

    /* renamed from: h */
    public final int f22019h;

    /* renamed from: i */
    public final boolean f22020i;

    /* renamed from: j */
    public final HashMap f22021j = new HashMap();

    /* renamed from: k */
    public boolean f22022k;

    /* renamed from: l */
    public boolean f22023l;

    /* renamed from: m */
    public C4420d f22024m;

    /* renamed from: n */
    public HashMap f22025n;

    /* renamed from: o */
    public final C7039d1 f22026o;

    /* renamed from: p */
    public final C1432i f22027p;

    /* renamed from: x.o1$a */
    public static final class C7086a implements Comparator<Rational> {

        /* renamed from: b */
        public Rational f22028b;

        public C7086a(Rational rational) {
            this.f22028b = rational;
        }

        public final int compare(Object obj, Object obj2) {
            Rational rational = (Rational) obj;
            Rational rational2 = (Rational) obj2;
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.f22028b.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.f22028b.floatValue())).floatValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x04a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7085o1(android.content.Context r12, java.lang.String r13, p316y.C7197a0 r14, p304x.C7027b r15) throws androidx.camera.core.CameraUnavailableException {
        /*
            r11 = this;
            r11.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f22012a = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r11.f22013b = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r11.f22021j = r1
            r1 = 0
            r11.f22022k = r1
            r11.f22023l = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r11.f22025n = r2
            b0.i r2 = new b0.i
            r2.<init>()
            r11.f22027p = r2
            r13.getClass()
            r11.f22014c = r13
            r15.getClass()
            r11.f22015d = r15
            b0.b r15 = new b0.b
            r15.<init>(r13)
            r11.f22017f = r15
            b0.c r15 = new b0.c
            r15.<init>(r1)
            r11.f22018g = r15
            x.d1 r12 = p304x.C7039d1.m16545b(r12)
            r11.f22026o = r12
            y.s r12 = r14.mo23499b(r13)     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            r11.f22016e = r12     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            java.lang.Object r13 = r12.mo23532a(r13)     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            if (r13 == 0) goto L_0x005e
            int r13 = r13.intValue()     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            goto L_0x005f
        L_0x005e:
            r13 = 2
        L_0x005f:
            r11.f22019h = r13     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            android.hardware.camera2.CameraCharacteristics$Key r14 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            java.lang.Object r14 = r12.mo23532a(r14)     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            android.util.Size r14 = (android.util.Size) r14     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            r15 = 1
            if (r14 == 0) goto L_0x0079
            int r2 = r14.getWidth()     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            int r14 = r14.getHeight()     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            if (r2 < r14) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r14 = 0
            goto L_0x007a
        L_0x0079:
            r14 = 1
        L_0x007a:
            r11.f22020i = r14     // Catch:{ CameraAccessExceptionCompat -> 0x04f3 }
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r4 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.b r5 = new androidx.camera.core.impl.b
            r5.<init>(r3, r4)
            r2.mo19985a(r5)
            r14.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r5 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.b r6 = new androidx.camera.core.impl.b
            r6.<init>(r5, r4)
            r2.mo19985a(r6)
            r14.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r6 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r6, r4)
            r2.mo19985a(r7)
            r14.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r7 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r5, r4)
            r2.mo19985a(r8)
            r14.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r6, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r5, r4)
            r2.mo19985a(r8)
            r14.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r7)
            r2.mo19985a(r8)
            r14.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r6, r7)
            r2.mo19985a(r8)
            r14.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r6, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r5, r4)
            r2.mo19985a(r8)
            r14.add(r2)
            r0.addAll(r14)
            r14 = 3
            if (r13 == 0) goto L_0x0145
            if (r13 == r15) goto L_0x0145
            if (r13 != r14) goto L_0x01f7
        L_0x0145:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            e0.n0 r8 = new e0.n0
            r8.<init>()
            androidx.camera.core.impl.b r9 = new androidx.camera.core.impl.b
            r9.<init>(r3, r7)
            r8.mo19985a(r9)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r9 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r3, r9)
            r8.mo19985a(r10)
            r2.add(r8)
            e0.n0 r8 = new e0.n0
            r8.<init>()
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r3, r7)
            r8.mo19985a(r10)
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r6, r9)
            r8.mo19985a(r10)
            r2.add(r8)
            e0.n0 r8 = new e0.n0
            r8.<init>()
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r6, r7)
            r8.mo19985a(r10)
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r6, r9)
            r8.mo19985a(r10)
            r2.add(r8)
            e0.n0 r8 = new e0.n0
            r8.<init>()
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r3, r7)
            r8.mo19985a(r10)
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r3, r9)
            r8.mo19985a(r10)
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r5, r9)
            r8.mo19985a(r10)
            r2.add(r8)
            e0.n0 r8 = new e0.n0
            r8.<init>()
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r3, r7)
            r8.mo19985a(r10)
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r6, r9)
            r8.mo19985a(r10)
            androidx.camera.core.impl.b r10 = new androidx.camera.core.impl.b
            r10.<init>(r5, r9)
            r8.mo19985a(r10)
            r2.add(r8)
            e0.n0 r8 = new e0.n0
            r8.<init>()
            androidx.camera.core.impl.b r9 = new androidx.camera.core.impl.b
            r9.<init>(r6, r7)
            r8.mo19985a(r9)
            androidx.camera.core.impl.b r9 = new androidx.camera.core.impl.b
            r9.<init>(r6, r7)
            r8.mo19985a(r9)
            androidx.camera.core.impl.b r9 = new androidx.camera.core.impl.b
            r9.<init>(r5, r4)
            r8.mo19985a(r9)
            r2.add(r8)
            r0.addAll(r2)
        L_0x01f7:
            if (r13 == r15) goto L_0x01fb
            if (r13 != r14) goto L_0x02ad
        L_0x01fb:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r4)
            r2.mo19985a(r8)
            r13.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r6, r4)
            r2.mo19985a(r8)
            r13.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r6, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r6, r4)
            r2.mo19985a(r8)
            r13.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r5, r4)
            r2.mo19985a(r8)
            r13.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r5 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.ANALYSIS
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r6, r5)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r8 = new androidx.camera.core.impl.b
            r8.<init>(r3, r7)
            r2.mo19985a(r8)
            androidx.camera.core.impl.b r3 = new androidx.camera.core.impl.b
            r3.<init>(r6, r4)
            r2.mo19985a(r3)
            r13.add(r2)
            e0.n0 r2 = new e0.n0
            r2.<init>()
            androidx.camera.core.impl.b r3 = new androidx.camera.core.impl.b
            r3.<init>(r6, r5)
            r2.mo19985a(r3)
            androidx.camera.core.impl.b r3 = new androidx.camera.core.impl.b
            r3.<init>(r6, r7)
            r2.mo19985a(r3)
            androidx.camera.core.impl.b r3 = new androidx.camera.core.impl.b
            r3.<init>(r6, r4)
            r2.mo19985a(r3)
            r13.add(r2)
            r0.addAll(r13)
        L_0x02ad:
            android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r12 = r12.mo23532a(r13)
            int[] r12 = (int[]) r12
            if (r12 == 0) goto L_0x02ca
            int r13 = r12.length
            r0 = 0
        L_0x02b9:
            if (r0 >= r13) goto L_0x02ca
            r2 = r12[r0]
            if (r2 != r14) goto L_0x02c2
            r11.f22022k = r15
            goto L_0x02c7
        L_0x02c2:
            r3 = 6
            if (r2 != r3) goto L_0x02c7
            r11.f22023l = r15
        L_0x02c7:
            int r0 = r0 + 1
            goto L_0x02b9
        L_0x02ca:
            boolean r12 = r11.f22022k
            if (r12 == 0) goto L_0x03c4
            java.util.ArrayList r12 = r11.f22012a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.b r4 = new androidx.camera.core.impl.b
            r4.<init>(r2, r3)
            r0.mo19985a(r4)
            r13.add(r0)
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r5 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.b r6 = new androidx.camera.core.impl.b
            r6.<init>(r4, r5)
            r0.mo19985a(r6)
            androidx.camera.core.impl.b r6 = new androidx.camera.core.impl.b
            r6.<init>(r2, r3)
            r0.mo19985a(r6)
            r13.add(r0)
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r6 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r6, r5)
            r0.mo19985a(r7)
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r2, r3)
            r0.mo19985a(r7)
            r13.add(r0)
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r4, r5)
            r0.mo19985a(r7)
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r4, r5)
            r0.mo19985a(r7)
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r2, r3)
            r0.mo19985a(r7)
            r13.add(r0)
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r4, r5)
            r0.mo19985a(r7)
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r6, r5)
            r0.mo19985a(r7)
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r2, r3)
            r0.mo19985a(r7)
            r13.add(r0)
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r6, r5)
            r0.mo19985a(r7)
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r6, r5)
            r0.mo19985a(r7)
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r2, r3)
            r0.mo19985a(r7)
            r13.add(r0)
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r4, r5)
            r0.mo19985a(r7)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r4, r3)
            r0.mo19985a(r7)
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r2, r3)
            r0.mo19985a(r7)
            r13.add(r0)
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.b r7 = new androidx.camera.core.impl.b
            r7.<init>(r6, r5)
            r0.mo19985a(r7)
            androidx.camera.core.impl.b r5 = new androidx.camera.core.impl.b
            r5.<init>(r4, r3)
            r0.mo19985a(r5)
            androidx.camera.core.impl.b r4 = new androidx.camera.core.impl.b
            r4.<init>(r2, r3)
            r0.mo19985a(r4)
            r13.add(r0)
            r12.addAll(r13)
        L_0x03c4:
            boolean r12 = r11.f22023l
            if (r12 == 0) goto L_0x0426
            int r12 = r11.f22019h
            if (r12 != 0) goto L_0x0426
            java.util.ArrayList r12 = r11.f22012a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.b r4 = new androidx.camera.core.impl.b
            r4.<init>(r2, r3)
            r0.mo19985a(r4)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r4 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.b r5 = new androidx.camera.core.impl.b
            r5.<init>(r2, r4)
            r0.mo19985a(r5)
            r13.add(r0)
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.b r5 = new androidx.camera.core.impl.b
            r5.<init>(r2, r3)
            r0.mo19985a(r5)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.b r5 = new androidx.camera.core.impl.b
            r5.<init>(r2, r4)
            r0.mo19985a(r5)
            r13.add(r0)
            e0.n0 r0 = new e0.n0
            r0.<init>()
            androidx.camera.core.impl.b r5 = new androidx.camera.core.impl.b
            r5.<init>(r2, r3)
            r0.mo19985a(r5)
            androidx.camera.core.impl.b r3 = new androidx.camera.core.impl.b
            r3.<init>(r2, r4)
            r0.mo19985a(r3)
            r13.add(r0)
            r12.addAll(r13)
        L_0x0426:
            int r12 = r11.f22019h
            if (r12 != r14) goto L_0x0492
            java.util.ArrayList r12 = r11.f22012a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            e0.n0 r14 = new e0.n0
            r14.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.b r3 = new androidx.camera.core.impl.b
            r3.<init>(r0, r2)
            r14.mo19985a(r3)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.ANALYSIS
            androidx.camera.core.impl.b r4 = new androidx.camera.core.impl.b
            r4.<init>(r0, r3)
            r14.mo19985a(r4)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r5 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.b r6 = new androidx.camera.core.impl.b
            r6.<init>(r4, r5)
            r14.mo19985a(r6)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW
            androidx.camera.core.impl.b r6 = new androidx.camera.core.impl.b
            r6.<init>(r4, r5)
            r14.mo19985a(r6)
            r13.add(r14)
            e0.n0 r14 = new e0.n0
            r14.<init>()
            androidx.camera.core.impl.b r6 = new androidx.camera.core.impl.b
            r6.<init>(r0, r2)
            r14.mo19985a(r6)
            androidx.camera.core.impl.b r2 = new androidx.camera.core.impl.b
            r2.<init>(r0, r3)
            r14.mo19985a(r2)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.b r2 = new androidx.camera.core.impl.b
            r2.<init>(r0, r5)
            r14.mo19985a(r2)
            androidx.camera.core.impl.b r0 = new androidx.camera.core.impl.b
            r0.<init>(r4, r5)
            r14.mo19985a(r0)
            r13.add(r14)
            r12.addAll(r13)
        L_0x0492:
            java.util.ArrayList r12 = r11.f22012a
            b0.c r13 = r11.f22018g
            java.lang.String r14 = r11.f22014c
            int r0 = r11.f22019h
            java.lang.Object r13 = r13.f5273c
            a0.p r13 = (p001a0.C0026p) r13
            if (r13 != 0) goto L_0x04a6
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            goto L_0x04ec
        L_0x04a6:
            e0.n0 r13 = p001a0.C0026p.f11a
            java.lang.String r13 = android.os.Build.DEVICE
            java.lang.String r2 = "heroqltevzw"
            boolean r2 = r2.equalsIgnoreCase(r13)
            if (r2 != 0) goto L_0x04ba
            java.lang.String r2 = "heroqltetmo"
            boolean r13 = r2.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x04bb
        L_0x04ba:
            r1 = 1
        L_0x04bb:
            if (r1 == 0) goto L_0x04d0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r15 = "1"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x04ec
            e0.n0 r14 = p001a0.C0026p.f11a
            r13.add(r14)
            goto L_0x04ec
        L_0x04d0:
            boolean r13 = p001a0.C0026p.m96a()
            if (r13 == 0) goto L_0x04e8
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            if (r0 != 0) goto L_0x04ec
            e0.n0 r14 = p001a0.C0026p.f11a
            r13.add(r14)
            e0.n0 r14 = p001a0.C0026p.f12b
            r13.add(r14)
            goto L_0x04ec
        L_0x04e8:
            java.util.List r13 = java.util.Collections.emptyList()
        L_0x04ec:
            r12.addAll(r13)
            r11.mo23320d()
            return
        L_0x04f3:
            r12 = move-exception
            androidx.camera.core.CameraUnavailableException r12 = p583jk.C17875h.m44310u(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7085o1.<init>(android.content.Context, java.lang.String, y.a0, x.b):void");
    }

    /* renamed from: f */
    public static int m16608f(Size size) {
        return size.getHeight() * size.getWidth();
    }

    /* renamed from: h */
    public static boolean m16609h(int i, int i2, Rational rational) {
        boolean z;
        if (i2 % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61175n(z);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        if (numerator <= ((double) Math.max(0, i2 - 16)) || numerator >= ((double) (i2 + 16))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static void m16610i(List list, Size size) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Size size2 = (Size) list.get(i2);
                if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                    break;
                }
                if (i >= 0) {
                    arrayList.add((Size) list.get(i));
                }
                i = i2;
            }
            list.removeAll(arrayList);
        }
    }

    /* renamed from: a */
    public final boolean mo23317a(ArrayList arrayList) {
        boolean z;
        Iterator it = this.f22012a.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C4446n0 n0Var = (C4446n0) it.next();
            n0Var.getClass();
            boolean z3 = true;
            if (arrayList.isEmpty()) {
                z2 = true;
                continue;
            } else if (arrayList.size() > n0Var.f15507a.size()) {
                z2 = false;
                continue;
            } else {
                int size = n0Var.f15507a.size();
                ArrayList arrayList2 = new ArrayList();
                C4446n0.m11648b(arrayList2, size, new int[size], 0);
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z3 = false;
                        break;
                    }
                    int[] iArr = (int[]) it2.next();
                    boolean z4 = true;
                    for (int i = 0; i < n0Var.f15507a.size(); i++) {
                        if (iArr[i] < arrayList.size()) {
                            SurfaceConfig surfaceConfig = (SurfaceConfig) n0Var.f15507a.get(i);
                            SurfaceConfig surfaceConfig2 = (SurfaceConfig) arrayList.get(iArr[i]);
                            surfaceConfig.getClass();
                            SurfaceConfig.ConfigType b = surfaceConfig2.mo2466b();
                            if (surfaceConfig2.mo2465a().getId() > surfaceConfig.mo2465a().getId() || b != surfaceConfig.mo2466b()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            z4 &= z;
                            if (!z4) {
                                continue;
                                break;
                            }
                        }
                    }
                    if (z4) {
                        break;
                    }
                }
                z2 = z3;
                continue;
            }
            if (z2) {
                break;
            }
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c6, code lost:
        if (r14 == 35) goto L_0x00c8;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Size[] mo23318b(android.util.Size[] r13, int r14) {
        /*
            r12 = this;
            java.util.HashMap r0 = r12.f22021j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 != 0) goto L_0x00f0
            b0.b r0 = r12.f22017f
            r0.getClass()
            java.lang.Class<a0.n> r2 = p001a0.C0023n.class
            e0.i0 r2 = p001a0.C0022m.m93a(r2)
            a0.n r2 = (p001a0.C0023n) r2
            if (r2 != 0) goto L_0x0025
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x00e7
        L_0x0025:
            java.lang.String r0 = r0.f5271b
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r3 = "OnePlus"
            boolean r4 = r3.equalsIgnoreCase(r2)
            r5 = 1
            if (r4 == 0) goto L_0x003e
            java.lang.String r4 = android.os.Build.DEVICE
            java.lang.String r6 = "OnePlus6"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x003e
            r4 = 1
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            r6 = 3000(0xbb8, float:4.204E-42)
            r7 = 4000(0xfa0, float:5.605E-42)
            r8 = 3120(0xc30, float:4.372E-42)
            r9 = 4160(0x1040, float:5.83E-42)
            r10 = 256(0x100, float:3.59E-43)
            java.lang.String r11 = "0"
            if (r4 == 0) goto L_0x006c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            if (r14 != r10) goto L_0x00e6
            android.util.Size r0 = new android.util.Size
            r0.<init>(r9, r8)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r7, r6)
            r2.add(r0)
            goto L_0x00e6
        L_0x006c:
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x007e
            java.lang.String r3 = android.os.Build.DEVICE
            java.lang.String r4 = "OnePlus6T"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x007e
            r3 = 1
            goto L_0x007f
        L_0x007e:
            r3 = 0
        L_0x007f:
            if (r3 == 0) goto L_0x009f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            if (r14 != r10) goto L_0x00e6
            android.util.Size r0 = new android.util.Size
            r0.<init>(r9, r8)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r7, r6)
            r2.add(r0)
            goto L_0x00e6
        L_0x009f:
            java.lang.String r3 = "HUAWEI"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00b2
            java.lang.String r2 = android.os.Build.DEVICE
            java.lang.String r3 = "HWANE"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r5 = 0
        L_0x00b3:
            if (r5 == 0) goto L_0x00dd
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            r0 = 34
            if (r14 == r0) goto L_0x00c8
            r0 = 35
            if (r14 != r0) goto L_0x00e6
        L_0x00c8:
            android.util.Size r0 = new android.util.Size
            r3 = 720(0x2d0, float:1.009E-42)
            r0.<init>(r3, r3)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r3 = 400(0x190, float:5.6E-43)
            r0.<init>(r3, r3)
            r2.add(r0)
            goto L_0x00e6
        L_0x00dd:
            java.lang.String r0 = "ExcludedSupportedSizesQuirk"
            p054d0.C4289j0.m11435b(r0)
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x00e6:
            r0 = r2
        L_0x00e7:
            java.util.HashMap r2 = r12.f22021j
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r2.put(r14, r0)
        L_0x00f0:
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.List r13 = java.util.Arrays.asList(r13)
            r14.<init>(r13)
            r14.removeAll(r0)
            android.util.Size[] r13 = new android.util.Size[r1]
            java.lang.Object[] r13 = r14.toArray(r13)
            android.util.Size[] r13 = (android.util.Size[]) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7085o1.mo23318b(android.util.Size[], int):android.util.Size[]");
    }

    /* renamed from: c */
    public final Size mo23319c(int i) {
        Size size = (Size) this.f22013b.get(Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        Size size2 = (Size) Collections.max(Arrays.asList(mo23321e(i)), new C4635b(false));
        this.f22013b.put(Integer.valueOf(i), size2);
        return size2;
    }

    /* renamed from: d */
    public final void mo23320d() {
        Size size;
        Size size2;
        CamcorderProfile camcorderProfile;
        Size size3 = new Size(640, 480);
        Size d = this.f22026o.mo23301d();
        try {
            int parseInt = Integer.parseInt(this.f22014c);
            CamcorderProfile camcorderProfile2 = null;
            if (this.f22015d.hasProfile(parseInt, 1)) {
                camcorderProfile = this.f22015d.get(parseInt, 1);
            } else {
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                size = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
                this.f22024m = new C4420d(size3, d, size);
            }
            size2 = f22007t;
            if (this.f22015d.hasProfile(parseInt, 10)) {
                camcorderProfile2 = this.f22015d.get(parseInt, 10);
            } else if (this.f22015d.hasProfile(parseInt, 8)) {
                camcorderProfile2 = this.f22015d.get(parseInt, 8);
            } else if (this.f22015d.hasProfile(parseInt, 12)) {
                camcorderProfile2 = this.f22015d.get(parseInt, 12);
            } else if (this.f22015d.hasProfile(parseInt, 6)) {
                camcorderProfile2 = this.f22015d.get(parseInt, 6);
            } else if (this.f22015d.hasProfile(parseInt, 5)) {
                camcorderProfile2 = this.f22015d.get(parseInt, 5);
            } else if (this.f22015d.hasProfile(parseInt, 4)) {
                camcorderProfile2 = this.f22015d.get(parseInt, 4);
            }
            if (camcorderProfile2 != null) {
                size2 = new Size(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
            }
            size = size2;
            this.f22024m = new C4420d(size3, d, size);
        } catch (NumberFormatException unused) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f22016e.mo23532a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                if (outputSizes == null) {
                    size2 = f22007t;
                } else {
                    Arrays.sort(outputSizes, new C4635b(true));
                    for (Size size4 : outputSizes) {
                        int width = size4.getWidth();
                        Size size5 = f22006s;
                        if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                            size = size4;
                            break;
                        }
                    }
                    size2 = f22007t;
                }
            } else {
                throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
            }
        }
    }

    /* renamed from: e */
    public final Size[] mo23321e(int i) {
        Size[] sizeArr;
        Size[] sizeArr2 = (Size[]) this.f22025n.get(Integer.valueOf(i));
        if (sizeArr2 != null) {
            return sizeArr2;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f22016e.mo23532a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            if (Build.VERSION.SDK_INT >= 23 || i != 34) {
                sizeArr = streamConfigurationMap.getOutputSizes(i);
            } else {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            }
            if (sizeArr != null) {
                Size[] b = mo23318b(sizeArr, i);
                Arrays.sort(b, new C4635b(true));
                this.f22025n.put(Integer.valueOf(i), b);
                return b;
            }
            throw new IllegalArgumentException(C16759e.m42349e("Can not get supported output size for the format: ", i));
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    /* renamed from: g */
    public final Size mo23322g(C0587k kVar) {
        boolean z;
        int i = kVar.mo2491i();
        Size j = kVar.mo2492j();
        if (j == null) {
            return j;
        }
        Integer num = (Integer) this.f22016e.mo23532a(CameraCharacteristics.SENSOR_ORIENTATION);
        C24361g.m61185s(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int A = C13641g.m34109A(i);
        Integer num2 = (Integer) this.f22016e.mo23532a(CameraCharacteristics.LENS_FACING);
        C24361g.m61185s(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        boolean z2 = false;
        if (1 == num2.intValue()) {
            z = true;
        } else {
            z = false;
        }
        int p = C13641g.m34127p(A, num.intValue(), z);
        if (p == 90 || p == 270) {
            z2 = true;
        }
        if (z2) {
            return new Size(j.getHeight(), j.getWidth());
        }
        return j;
    }

    /* renamed from: j */
    public final C0573b mo23323j(int i, Size size) {
        SurfaceConfig.ConfigType configType;
        if (i == 35) {
            configType = SurfaceConfig.ConfigType.YUV;
        } else if (i == 256) {
            configType = SurfaceConfig.ConfigType.JPEG;
        } else if (i == 32) {
            configType = SurfaceConfig.ConfigType.RAW;
        } else {
            configType = SurfaceConfig.ConfigType.PRIV;
        }
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.NOT_SUPPORT;
        Size c = mo23319c(i);
        if (size.getHeight() * size.getWidth() <= this.f22024m.f15487a.getHeight() * this.f22024m.f15487a.getWidth()) {
            configSize = SurfaceConfig.ConfigSize.ANALYSIS;
        } else {
            if (size.getHeight() * size.getWidth() <= this.f22024m.f15488b.getHeight() * this.f22024m.f15488b.getWidth()) {
                configSize = SurfaceConfig.ConfigSize.PREVIEW;
            } else {
                if (size.getHeight() * size.getWidth() <= this.f22024m.f15489c.getHeight() * this.f22024m.f15489c.getWidth()) {
                    configSize = SurfaceConfig.ConfigSize.RECORD;
                } else {
                    if (size.getHeight() * size.getWidth() <= c.getHeight() * c.getWidth()) {
                        configSize = SurfaceConfig.ConfigSize.MAXIMUM;
                    }
                }
            }
        }
        return new C0573b(configType, configSize);
    }
}
