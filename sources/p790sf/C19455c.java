package p790sf;

import java.util.concurrent.TimeUnit;

/* renamed from: sf.c */
public final class C19455c {

    /* renamed from: a */
    public long f49473a;

    /* renamed from: b */
    public long f49474b;

    /* renamed from: c */
    public TimeUnit f49475c;

    /* renamed from: sf.c$a */
    public static /* synthetic */ class C19456a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49476a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f49476a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f49476a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f49476a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p790sf.C19455c.C19456a.<clinit>():void");
        }
    }

    public C19455c(TimeUnit timeUnit, long j, long j2) {
        this.f49473a = j;
        this.f49474b = j2;
        this.f49475c = timeUnit;
    }

    /* renamed from: a */
    public final double mo51863a() {
        int i = C19456a.f49476a[this.f49475c.ordinal()];
        if (i == 1) {
            return (((double) this.f49473a) / ((double) this.f49474b)) * ((double) TimeUnit.SECONDS.toNanos(1));
        }
        if (i == 2) {
            return (((double) this.f49473a) / ((double) this.f49474b)) * ((double) TimeUnit.SECONDS.toMicros(1));
        }
        if (i != 3) {
            return ((double) this.f49473a) / ((double) this.f49475c.toSeconds(this.f49474b));
        }
        return (((double) this.f49473a) / ((double) this.f49474b)) * ((double) TimeUnit.SECONDS.toMillis(1));
    }
}
