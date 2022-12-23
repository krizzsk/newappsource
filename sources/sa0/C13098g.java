package sa0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import na0.C12928f;

/* renamed from: sa0.g */
public final class C13098g extends C12928f {

    /* renamed from: t */
    public static final double f32477t = (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: e */
    public final int f32478e;

    /* renamed from: f */
    public final float f32479f;

    /* renamed from: g */
    public final float f32480g;

    /* renamed from: h */
    public final float f32481h;

    /* renamed from: i */
    public final float f32482i;

    /* renamed from: j */
    public final float f32483j;

    /* renamed from: k */
    public final float f32484k;

    /* renamed from: l */
    public final float f32485l;

    /* renamed from: m */
    public final float f32486m;

    /* renamed from: n */
    public float f32487n;

    /* renamed from: o */
    public C13098g f32488o;

    /* renamed from: p */
    public C13098g f32489p;

    /* renamed from: q */
    public C13098g f32490q;

    /* renamed from: r */
    public C13098g f32491r;

    /* renamed from: s */
    public C13098g f32492s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13098g(sa0.C13098g r12, int r13) {
        /*
            r11 = this;
            int r0 = r12.f32020a
            r1 = 2
            int r0 = r0 * 2
            r2 = 0
            r3 = 1
            if (r13 == r3) goto L_0x000e
            if (r13 != r1) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r4 = 0
            goto L_0x000f
        L_0x000e:
            r4 = 1
        L_0x000f:
            int r6 = r0 + r4
            int r0 = r12.f32021b
            int r0 = r0 * 2
            if (r13 == r1) goto L_0x001a
            r4 = 3
            if (r13 != r4) goto L_0x001b
        L_0x001a:
            r2 = 1
        L_0x001b:
            int r7 = r0 + r2
            int r0 = r12.f32022c
            int r8 = r0 + 1
            long r4 = r12.f32023d
            r9 = 4
            long r4 = r4 * r9
            long r9 = (long) r13
            long r4 = r4 + r9
            r9 = 1
            long r9 = r9 + r4
            r5 = r11
            r5.<init>(r6, r7, r8, r9)
            r11.f32492s = r12
            r11.f32478e = r13
            float r0 = r12.f32485l
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            r11.f32485l = r0
            float r4 = r12.f32486m
            float r4 = r4 / r2
            r11.f32486m = r4
            if (r13 == 0) goto L_0x0079
            if (r13 == r3) goto L_0x0068
            if (r13 == r1) goto L_0x0057
            float r13 = r12.f32481h
            r11.f32481h = r13
            float r13 = r12.f32483j
            r11.f32483j = r13
            float r13 = r12.f32479f
            r11.f32482i = r13
            float r12 = r12.f32480g
            r11.f32484k = r12
            goto L_0x0089
        L_0x0057:
            float r13 = r12.f32479f
            r11.f32481h = r13
            float r13 = r12.f32483j
            r11.f32483j = r13
            float r13 = r12.f32482i
            r11.f32482i = r13
            float r12 = r12.f32480g
            r11.f32484k = r12
            goto L_0x0089
        L_0x0068:
            float r13 = r12.f32479f
            r11.f32481h = r13
            float r13 = r12.f32480g
            r11.f32483j = r13
            float r13 = r12.f32482i
            r11.f32482i = r13
            float r12 = r12.f32484k
            r11.f32484k = r12
            goto L_0x0089
        L_0x0079:
            float r13 = r12.f32481h
            r11.f32481h = r13
            float r13 = r12.f32480g
            r11.f32483j = r13
            float r13 = r12.f32479f
            r11.f32482i = r13
            float r12 = r12.f32484k
            r11.f32484k = r12
        L_0x0089:
            float r12 = r11.f32481h
            r13 = 1056964608(0x3f000000, float:0.5)
            float r1 = r0 * r13
            float r1 = r1 + r12
            r11.f32479f = r1
            float r12 = r11.f32483j
            float r0 = r0 * r13
            float r0 = r0 + r12
            r11.f32480g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13098g.<init>(sa0.g, int):void");
    }

    public C13098g(int i) {
        super(0, 0, 0, 0);
        this.f32492s = null;
        this.f32478e = -1;
        float f = ((float) i) * 500000.0f * 2.0f;
        this.f32479f = f;
        this.f32480g = BitmapDescriptorFactory.HUE_RED;
        float f2 = f - 500000.0f;
        this.f32481h = f2;
        float f3 = f + 500000.0f;
        this.f32482i = f3;
        this.f32483j = BitmapDescriptorFactory.HUE_RED - 500000.0f;
        this.f32484k = BitmapDescriptorFactory.HUE_RED + 500000.0f;
        float f4 = f3 - f2;
        this.f32485l = f4;
        this.f32486m = (float) (((double) f4) * f32477t);
    }
}
