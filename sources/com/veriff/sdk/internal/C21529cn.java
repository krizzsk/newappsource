package com.veriff.sdk.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.veriff.sdk.internal.C21512ci;
import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.cn */
public abstract class C21529cn {

    /* renamed from: com.veriff.sdk.internal.cn$a */
    public static final class C21530a {

        /* renamed from: a */
        private final C21512ci.C21518d f54183a;

        /* renamed from: b */
        private final Bitmap f54184b;

        /* renamed from: c */
        private final aca f54185c;

        /* renamed from: d */
        private final int f54186d;

        public C21530a(Bitmap bitmap, C21512ci.C21518d dVar) {
            this((Bitmap) C21537cs.m51498a(bitmap, "bitmap == null"), (aca) null, dVar, 0);
        }

        /* renamed from: a */
        public Bitmap mo54530a() {
            return this.f54184b;
        }

        /* renamed from: b */
        public aca mo54531b() {
            return this.f54185c;
        }

        /* renamed from: c */
        public C21512ci.C21518d mo54532c() {
            return this.f54183a;
        }

        /* renamed from: d */
        public int mo54533d() {
            return this.f54186d;
        }

        public C21530a(aca aca, C21512ci.C21518d dVar) {
            this((Bitmap) null, (aca) C21537cs.m51498a(aca, "source == null"), dVar, 0);
        }

        public C21530a(Bitmap bitmap, aca aca, C21512ci.C21518d dVar, int i) {
            if ((bitmap != null) != (aca == null ? false : true)) {
                this.f54184b = bitmap;
                this.f54185c = aca;
                this.f54183a = (C21512ci.C21518d) C21537cs.m51498a(dVar, "loadedFrom == null");
                this.f54186d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static boolean m51462a(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: c */
    public static BitmapFactory.Options m51463c(C21525cl clVar) {
        boolean z;
        boolean d = clVar.mo54515d();
        if (clVar.f54168s != null) {
            z = true;
        } else {
            z = false;
        }
        BitmapFactory.Options options = null;
        if (d || z || clVar.f54167r) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = d;
            boolean z2 = clVar.f54167r;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = clVar.f54168s;
            }
        }
        return options;
    }

    /* renamed from: a */
    public int mo54482a() {
        return 0;
    }

    /* renamed from: a */
    public abstract C21530a mo54407a(C21525cl clVar, int i) throws IOException;

    /* renamed from: a */
    public abstract boolean mo54408a(C21525cl clVar);

    /* renamed from: a */
    public boolean mo54483a(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* renamed from: b */
    public boolean mo54484b() {
        return false;
    }

    /* renamed from: a */
    public static void m51461a(int i, int i2, BitmapFactory.Options options, C21525cl clVar) {
        m51460a(i, i2, options.outWidth, options.outHeight, options, clVar);
    }

    /* renamed from: a */
    public static void m51460a(int i, int i2, int i3, int i4, BitmapFactory.Options options, C21525cl clVar) {
        int i5;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                floor = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor3 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                i5 = clVar.f54161l ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            i5 = (int) floor;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }
}
