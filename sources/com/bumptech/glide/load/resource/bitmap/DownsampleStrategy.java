package com.bumptech.glide.load.resource.bitmap;

import p025b6.C1489d;

public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final C2196e f7148a = new C2196e();

    /* renamed from: b */
    public static final C2194c f7149b = new C2194c();

    /* renamed from: c */
    public static final C2195d f7150c;

    /* renamed from: d */
    public static final C2197f f7151d = new C2197f();

    /* renamed from: e */
    public static final C2195d f7152e;

    /* renamed from: f */
    public static final C1489d<DownsampleStrategy> f7153f;

    /* renamed from: g */
    public static final boolean f7154g = true;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C2192a extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo10992a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public final float mo10993b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C2193b extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo10992a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }

        /* renamed from: b */
        public final float mo10993b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C2194c extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo10992a(int i, int i2, int i3, int i4) {
            if (mo10993b(i, i2, i3, i4) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return DownsampleStrategy.f7148a.mo10992a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public final float mo10993b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f7148a.mo10993b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C2195d extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo10992a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public final float mo10993b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C2196e extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo10992a(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f7154g) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }

        /* renamed from: b */
        public final float mo10993b(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f7154g) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C2197f extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo10992a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public final float mo10993b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    static {
        new C2192a();
        new C2193b();
        C2195d dVar = new C2195d();
        f7150c = dVar;
        f7152e = dVar;
        f7153f = C1489d.m3904a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo10992a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo10993b(int i, int i2, int i3, int i4);
}
