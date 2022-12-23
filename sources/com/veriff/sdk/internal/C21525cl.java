package com.veriff.sdk.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.veriff.sdk.internal.C21512ci;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.veriff.sdk.internal.cl */
public final class C21525cl {

    /* renamed from: u */
    private static final long f54150u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    public int f54151a;

    /* renamed from: b */
    public long f54152b;

    /* renamed from: d */
    public final Uri f54153d;

    /* renamed from: e */
    public final int f54154e;

    /* renamed from: f */
    public final String f54155f;

    /* renamed from: g */
    public final List<C21536cr> f54156g;

    /* renamed from: h */
    public final int f54157h;

    /* renamed from: i */
    public final int f54158i;

    /* renamed from: j */
    public final boolean f54159j;

    /* renamed from: k */
    public final int f54160k;

    /* renamed from: l */
    public final boolean f54161l;

    /* renamed from: m */
    public final boolean f54162m;

    /* renamed from: n */
    public final float f54163n;

    /* renamed from: o */
    public final float f54164o;

    /* renamed from: p */
    public final float f54165p;

    /* renamed from: q */
    public final boolean f54166q;

    /* renamed from: r */
    public final boolean f54167r;

    /* renamed from: s */
    public final Bitmap.Config f54168s;

    /* renamed from: t */
    public final C21512ci.C21519e f54169t;

    /* renamed from: com.veriff.sdk.internal.cl$a */
    public static final class C21527a {

        /* renamed from: a */
        private Uri f54170a;

        /* renamed from: b */
        private int f54171b;

        /* renamed from: d */
        private int f54172d;

        /* renamed from: e */
        private int f54173e;

        /* renamed from: p */
        private Bitmap.Config f54174p;

        /* renamed from: q */
        private C21512ci.C21519e f54175q;

        public C21527a(Uri uri, int i, Bitmap.Config config) {
            this.f54170a = uri;
            this.f54171b = i;
            this.f54174p = config;
        }

        /* renamed from: a */
        public boolean mo54521a() {
            return (this.f54170a == null && this.f54171b == 0) ? false : true;
        }

        /* renamed from: b */
        public boolean mo54522b() {
            return (this.f54172d == 0 && this.f54173e == 0) ? false : true;
        }

        /* renamed from: c */
        public C21525cl mo54523c() {
            if (this.f54175q == null) {
                this.f54175q = C21512ci.C21519e.NORMAL;
            }
            return new C21525cl(this.f54170a, this.f54171b, (String) null, (List) null, this.f54172d, this.f54173e, false, false, 0, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, this.f54174p, this.f54175q);
        }

        /* renamed from: a */
        public C21527a mo54520a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f54172d = i;
                this.f54173e = i2;
                return this;
            }
        }
    }

    /* renamed from: a */
    public String mo54512a() {
        long nanoTime = System.nanoTime() - this.f54152b;
        if (nanoTime > f54150u) {
            return mo54513b() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return mo54513b() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* renamed from: b */
    public String mo54513b() {
        return C16530d.m42014g(C13555b.m33972k("[R"), this.f54151a, ']');
    }

    /* renamed from: c */
    public String mo54514c() {
        Uri uri = this.f54153d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f54154e);
    }

    /* renamed from: d */
    public boolean mo54515d() {
        return (this.f54157h == 0 && this.f54158i == 0) ? false : true;
    }

    /* renamed from: e */
    public boolean mo54516e() {
        return mo54517f() || mo54518g();
    }

    /* renamed from: f */
    public boolean mo54517f() {
        return mo54515d() || this.f54163n != BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: g */
    public boolean mo54518g() {
        return this.f54156g != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f54154e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f54153d);
        }
        List<C21536cr> list = this.f54156g;
        if (list != null && !list.isEmpty()) {
            for (C21536cr a : this.f54156g) {
                sb.append(' ');
                sb.append(a.mo54550a());
            }
        }
        if (this.f54155f != null) {
            sb.append(" stableKey(");
            sb.append(this.f54155f);
            sb.append(')');
        }
        if (this.f54157h > 0) {
            sb.append(" resize(");
            sb.append(this.f54157h);
            sb.append(',');
            sb.append(this.f54158i);
            sb.append(')');
        }
        if (this.f54159j) {
            sb.append(" centerCrop");
        }
        if (this.f54161l) {
            sb.append(" centerInside");
        }
        if (this.f54163n != BitmapDescriptorFactory.HUE_RED) {
            sb.append(" rotation(");
            sb.append(this.f54163n);
            if (this.f54166q) {
                sb.append(" @ ");
                sb.append(this.f54164o);
                sb.append(',');
                sb.append(this.f54165p);
            }
            sb.append(')');
        }
        if (this.f54167r) {
            sb.append(" purgeable");
        }
        if (this.f54168s != null) {
            sb.append(' ');
            sb.append(this.f54168s);
        }
        sb.append('}');
        return sb.toString();
    }

    private C21525cl(Uri uri, int i, String str, List<C21536cr> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, C21512ci.C21519e eVar) {
        this.f54153d = uri;
        this.f54154e = i;
        this.f54155f = str;
        if (list == null) {
            this.f54156g = null;
        } else {
            this.f54156g = Collections.unmodifiableList(list);
        }
        this.f54157h = i2;
        this.f54158i = i3;
        this.f54159j = z;
        this.f54161l = z2;
        this.f54160k = i4;
        this.f54162m = z3;
        this.f54163n = f;
        this.f54164o = f2;
        this.f54165p = f3;
        this.f54166q = z4;
        this.f54167r = z5;
        this.f54168s = config;
        this.f54169t = eVar;
    }
}
