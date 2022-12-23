package nb0;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;
import si0.C24898f;
import si0.C24901h;

/* renamed from: nb0.j */
public final class C12946j extends C12947k {

    /* renamed from: k */
    public static final String[] f32079k = new String[RecyclerView.C1119a0.FLAG_IGNORE];

    /* renamed from: h */
    public final C24901h f32080h;

    /* renamed from: i */
    public String f32081i = ":";

    /* renamed from: j */
    public String f32082j;

    static {
        for (int i = 0; i <= 31; i++) {
            f32079k[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f32079k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C12946j(C24898f fVar) {
        this.f32080h = fVar;
        mo39833A(6);
    }

    /* renamed from: T */
    public static void m32756T(C24901h hVar, String str) throws IOException {
        String str2;
        String[] strArr = f32079k;
        hVar.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                hVar.mo61379G1(i, i2, str);
            }
            hVar.mo61387Q(str2);
            i = i2 + 1;
        }
        if (i < length) {
            hVar.mo61379G1(i, length, str);
        }
        hVar.writeByte(34);
    }

    /* renamed from: B */
    public final C12947k mo25065B(double d) throws IOException {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f32087f) {
            this.f32087f = false;
            mo25077w(Double.toString(d));
            return this;
        } else {
            mo39830U();
            mo39827O();
            this.f32080h.mo61387Q(Double.toString(d));
            int[] iArr = this.f32086e;
            int i = this.f32083b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: C */
    public final C12947k mo25066C(long j) throws IOException {
        if (this.f32087f) {
            this.f32087f = false;
            mo25077w(Long.toString(j));
            return this;
        }
        mo39830U();
        mo39827O();
        this.f32080h.mo61387Q(Long.toString(j));
        int[] iArr = this.f32086e;
        int i = this.f32083b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: H */
    public final C12947k mo25067H(Number number) throws IOException {
        if (number == null) {
            mo25078x();
            return this;
        }
        String obj = number.toString();
        if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f32087f) {
            this.f32087f = false;
            mo25077w(obj);
            return this;
        } else {
            mo39830U();
            mo39827O();
            this.f32080h.mo61387Q(obj);
            int[] iArr = this.f32086e;
            int i = this.f32083b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: K */
    public final C12947k mo25068K(String str) throws IOException {
        if (str == null) {
            mo25078x();
            return this;
        } else if (this.f32087f) {
            this.f32087f = false;
            mo25077w(str);
            return this;
        } else {
            mo39830U();
            mo39827O();
            m32756T(this.f32080h, str);
            int[] iArr = this.f32086e;
            int i = this.f32083b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: N */
    public final C12947k mo25069N(boolean z) throws IOException {
        String str;
        if (!this.f32087f) {
            mo39830U();
            mo39827O();
            C24901h hVar = this.f32080h;
            if (z) {
                str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
            } else {
                str = "false";
            }
            hVar.mo61387Q(str);
            int[] iArr = this.f32086e;
            int i = this.f32083b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder k = C13555b.m33972k("Boolean cannot be used as a map key in JSON at path ");
        k.append(mo39835v());
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: O */
    public final void mo39827O() throws IOException {
        int z = mo39836z();
        int i = 2;
        if (z != 1) {
            if (z == 2) {
                this.f32080h.writeByte(44);
            } else if (z == 4) {
                i = 5;
                this.f32080h.mo61387Q(this.f32081i);
            } else if (z == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else if (z == 6) {
                i = 7;
            } else if (z == 7) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        }
        this.f32084c[this.f32083b - 1] = i;
    }

    /* renamed from: R */
    public final void mo39828R(int i, int i2, char c) throws IOException {
        int z = mo39836z();
        if (z != i2 && z != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f32082j == null) {
            int i3 = this.f32083b;
            int i4 = ~this.f32088g;
            if (i3 == i4) {
                this.f32088g = i4;
                return;
            }
            int i5 = i3 - 1;
            this.f32083b = i5;
            this.f32085d[i5] = null;
            int[] iArr = this.f32086e;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            this.f32080h.writeByte(c);
        } else {
            StringBuilder k = C13555b.m33972k("Dangling name: ");
            k.append(this.f32082j);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: S */
    public final void mo39829S(int i, int i2, char c) throws IOException {
        int i3;
        int i4 = this.f32083b;
        int i5 = this.f32088g;
        if (i4 == i5 && ((i3 = this.f32084c[i4 - 1]) == i || i3 == i2)) {
            this.f32088g = ~i5;
            return;
        }
        mo39827O();
        mo39834q();
        mo39833A(i);
        this.f32086e[this.f32083b - 1] = 0;
        this.f32080h.writeByte(c);
    }

    /* renamed from: U */
    public final void mo39830U() throws IOException {
        if (this.f32082j != null) {
            int z = mo39836z();
            if (z == 5) {
                this.f32080h.writeByte(44);
            } else if (z != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f32084c[this.f32083b - 1] = 4;
            m32756T(this.f32080h, this.f32082j);
            this.f32082j = null;
        }
    }

    public final void close() throws IOException {
        this.f32080h.close();
        int i = this.f32083b;
        if (i > 1 || (i == 1 && this.f32084c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f32083b = 0;
    }

    /* renamed from: e */
    public final C12947k mo25072e() throws IOException {
        if (!this.f32087f) {
            mo39830U();
            mo39829S(1, 2, '[');
            return this;
        }
        StringBuilder k = C13555b.m33972k("Array cannot be used as a map key in JSON at path ");
        k.append(mo39835v());
        throw new IllegalStateException(k.toString());
    }

    public final void flush() throws IOException {
        if (this.f32083b != 0) {
            this.f32080h.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: i */
    public final C12947k mo25074i() throws IOException {
        if (!this.f32087f) {
            mo39830U();
            mo39829S(3, 5, '{');
            return this;
        }
        StringBuilder k = C13555b.m33972k("Object cannot be used as a map key in JSON at path ");
        k.append(mo39835v());
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: r */
    public final C12947k mo25075r() throws IOException {
        mo39828R(1, 2, ']');
        return this;
    }

    /* renamed from: t */
    public final C12947k mo25076t() throws IOException {
        this.f32087f = false;
        mo39828R(3, 5, '}');
        return this;
    }

    /* renamed from: w */
    public final C12947k mo25077w(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f32083b != 0) {
            int z = mo39836z();
            if ((z == 3 || z == 5) && this.f32082j == null && !this.f32087f) {
                this.f32082j = str;
                this.f32085d[this.f32083b - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: x */
    public final C12947k mo25078x() throws IOException {
        if (this.f32087f) {
            StringBuilder k = C13555b.m33972k("null cannot be used as a map key in JSON at path ");
            k.append(mo39835v());
            throw new IllegalStateException(k.toString());
        } else if (this.f32082j != null) {
            this.f32082j = null;
            return this;
        } else {
            mo39827O();
            this.f32080h.mo61387Q(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            int[] iArr = this.f32086e;
            int i = this.f32083b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }
}
