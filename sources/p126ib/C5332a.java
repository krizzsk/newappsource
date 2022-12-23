package p126ib;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import p583jk.C17875h;

/* renamed from: ib.a */
public final class C5332a {

    /* renamed from: r */
    public static final C5332a f17588r;

    /* renamed from: a */
    public final CharSequence f17589a;

    /* renamed from: b */
    public final Layout.Alignment f17590b;

    /* renamed from: c */
    public final Layout.Alignment f17591c;

    /* renamed from: d */
    public final Bitmap f17592d;

    /* renamed from: e */
    public final float f17593e;

    /* renamed from: f */
    public final int f17594f;

    /* renamed from: g */
    public final int f17595g;

    /* renamed from: h */
    public final float f17596h;

    /* renamed from: i */
    public final int f17597i;

    /* renamed from: j */
    public final float f17598j;

    /* renamed from: k */
    public final float f17599k;

    /* renamed from: l */
    public final boolean f17600l;

    /* renamed from: m */
    public final int f17601m;

    /* renamed from: n */
    public final int f17602n;

    /* renamed from: o */
    public final float f17603o;

    /* renamed from: p */
    public final int f17604p;

    /* renamed from: q */
    public final float f17605q;

    static {
        C5333a aVar = new C5333a();
        aVar.f17606a = "";
        f17588r = aVar.mo21116a();
    }

    public C5332a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            bitmap.getClass();
        } else {
            C17875h.m44301k(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.f17589a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.f17589a = charSequence.toString();
        } else {
            this.f17589a = null;
        }
        this.f17590b = alignment;
        this.f17591c = alignment2;
        this.f17592d = bitmap2;
        this.f17593e = f;
        this.f17594f = i;
        this.f17595g = i2;
        this.f17596h = f2;
        this.f17597i = i3;
        this.f17598j = f4;
        this.f17599k = f5;
        this.f17600l = z;
        this.f17601m = i5;
        this.f17602n = i4;
        this.f17603o = f3;
        this.f17604p = i6;
        this.f17605q = f6;
    }

    /* renamed from: ib.a$a */
    public static final class C5333a {

        /* renamed from: a */
        public CharSequence f17606a;

        /* renamed from: b */
        public Bitmap f17607b;

        /* renamed from: c */
        public Layout.Alignment f17608c;

        /* renamed from: d */
        public Layout.Alignment f17609d;

        /* renamed from: e */
        public float f17610e;

        /* renamed from: f */
        public int f17611f;

        /* renamed from: g */
        public int f17612g;

        /* renamed from: h */
        public float f17613h;

        /* renamed from: i */
        public int f17614i;

        /* renamed from: j */
        public int f17615j;

        /* renamed from: k */
        public float f17616k;

        /* renamed from: l */
        public float f17617l;

        /* renamed from: m */
        public float f17618m;

        /* renamed from: n */
        public boolean f17619n;

        /* renamed from: o */
        public int f17620o;

        /* renamed from: p */
        public int f17621p;

        /* renamed from: q */
        public float f17622q;

        public C5333a() {
            this.f17606a = null;
            this.f17607b = null;
            this.f17608c = null;
            this.f17609d = null;
            this.f17610e = -3.4028235E38f;
            this.f17611f = Integer.MIN_VALUE;
            this.f17612g = Integer.MIN_VALUE;
            this.f17613h = -3.4028235E38f;
            this.f17614i = Integer.MIN_VALUE;
            this.f17615j = Integer.MIN_VALUE;
            this.f17616k = -3.4028235E38f;
            this.f17617l = -3.4028235E38f;
            this.f17618m = -3.4028235E38f;
            this.f17619n = false;
            this.f17620o = -16777216;
            this.f17621p = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public final C5332a mo21116a() {
            return new C5332a(this.f17606a, this.f17608c, this.f17609d, this.f17607b, this.f17610e, this.f17611f, this.f17612g, this.f17613h, this.f17614i, this.f17615j, this.f17616k, this.f17617l, this.f17618m, this.f17619n, this.f17620o, this.f17621p, this.f17622q);
        }

        public C5333a(C5332a aVar) {
            this.f17606a = aVar.f17589a;
            this.f17607b = aVar.f17592d;
            this.f17608c = aVar.f17590b;
            this.f17609d = aVar.f17591c;
            this.f17610e = aVar.f17593e;
            this.f17611f = aVar.f17594f;
            this.f17612g = aVar.f17595g;
            this.f17613h = aVar.f17596h;
            this.f17614i = aVar.f17597i;
            this.f17615j = aVar.f17602n;
            this.f17616k = aVar.f17603o;
            this.f17617l = aVar.f17598j;
            this.f17618m = aVar.f17599k;
            this.f17619n = aVar.f17600l;
            this.f17620o = aVar.f17601m;
            this.f17621p = aVar.f17604p;
            this.f17622q = aVar.f17605q;
        }
    }
}
