package com.veriff.sdk.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.bd */
final class C21435bd extends C21437bf {

    /* renamed from: a */
    private static final String[] f53916a = new String[RecyclerView.C1119a0.FLAG_IGNORE];

    /* renamed from: k */
    private final abj f53917k;

    /* renamed from: l */
    private String f53918l = ":";

    /* renamed from: m */
    private String f53919m;

    static {
        for (int i = 0; i <= 31; i++) {
            f53916a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f53916a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C21435bd(abj abj) {
        if (abj != null) {
            this.f53917k = abj;
            mo54280a(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: l */
    private void m51119l() throws IOException {
        if (this.f53919m != null) {
            m51121n();
            m51117a(this.f53917k, this.f53919m);
            this.f53919m = null;
        }
    }

    /* renamed from: m */
    private void m51120m() throws IOException {
    }

    /* renamed from: n */
    private void m51121n() throws IOException {
        int f = mo54284f();
        if (f == 5) {
            this.f53917k.mo53899i(44);
        } else if (f != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m51120m();
        mo54281b(4);
    }

    /* renamed from: o */
    private void m51122o() throws IOException {
        int f = mo54284f();
        int i = 7;
        if (f != 1) {
            if (f != 2) {
                if (f == 4) {
                    i = 5;
                    this.f53917k.mo53870b(this.f53918l);
                } else if (f == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else if (f != 6) {
                    if (f != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.f53926g) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                mo54281b(i);
            }
            this.f53917k.mo53899i(44);
        }
        m51120m();
        i = 2;
        mo54281b(i);
    }

    /* renamed from: a */
    public C21437bf mo54264a() throws IOException {
        if (!this.f53928i) {
            m51119l();
            return m51116a(1, 2, '[');
        }
        StringBuilder k = C13555b.m33972k("Array cannot be used as a map key in JSON at path ");
        k.append(mo54289k());
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: b */
    public C21437bf mo54271b() throws IOException {
        return m51118b(1, 2, ']');
    }

    /* renamed from: c */
    public C21437bf mo54273c() throws IOException {
        if (!this.f53928i) {
            m51119l();
            return m51116a(3, 5, '{');
        }
        StringBuilder k = C13555b.m33972k("Object cannot be used as a map key in JSON at path ");
        k.append(mo54289k());
        throw new IllegalStateException(k.toString());
    }

    public void close() throws IOException {
        this.f53917k.close();
        int i = this.f53922b;
        if (i > 1 || (i == 1 && this.f53923c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f53922b = 0;
    }

    /* renamed from: d */
    public C21437bf mo54275d() throws IOException {
        this.f53928i = false;
        return m51118b(3, 5, '}');
    }

    /* renamed from: e */
    public C21437bf mo54276e() throws IOException {
        if (!this.f53928i) {
            if (this.f53919m != null) {
                if (this.f53927h) {
                    m51119l();
                } else {
                    this.f53919m = null;
                    return this;
                }
            }
            m51122o();
            this.f53917k.mo53870b(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            int[] iArr = this.f53925e;
            int i = this.f53922b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder k = C13555b.m33972k("null cannot be used as a map key in JSON at path ");
        k.append(mo54289k());
        throw new IllegalStateException(k.toString());
    }

    public void flush() throws IOException {
        if (this.f53922b != 0) {
            this.f53917k.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: b */
    private C21437bf m51118b(int i, int i2, char c) throws IOException {
        int f = mo54284f();
        if (f != i2 && f != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f53919m == null) {
            int i3 = this.f53922b;
            int i4 = this.f53929j;
            if (i3 == (~i4)) {
                this.f53929j = ~i4;
                return this;
            }
            int i5 = i3 - 1;
            this.f53922b = i5;
            this.f53924d[i5] = null;
            int[] iArr = this.f53925e;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            if (f == i2) {
                m51120m();
            }
            this.f53917k.mo53899i(c);
            return this;
        } else {
            StringBuilder k = C13555b.m33972k("Dangling name: ");
            k.append(this.f53919m);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: a */
    private C21437bf m51116a(int i, int i2, char c) throws IOException {
        int i3 = this.f53922b;
        int i4 = this.f53929j;
        if (i3 == i4) {
            int[] iArr = this.f53923c;
            if (iArr[i3 - 1] == i || iArr[i3 - 1] == i2) {
                this.f53929j = ~i4;
                return this;
            }
        }
        m51122o();
        mo54285g();
        mo54280a(i);
        this.f53925e[this.f53922b - 1] = 0;
        this.f53917k.mo53899i(c);
        return this;
    }

    /* renamed from: a */
    public C21437bf mo54269a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f53922b != 0) {
            int f = mo54284f();
            if ((f == 3 || f == 5) && this.f53919m == null) {
                this.f53919m = str;
                this.f53924d[this.f53922b - 1] = str;
                this.f53928i = false;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: b */
    public C21437bf mo54272b(String str) throws IOException {
        if (str == null) {
            return mo54276e();
        }
        if (this.f53928i) {
            return mo54269a(str);
        }
        m51119l();
        m51122o();
        m51117a(this.f53917k, str);
        int[] iArr = this.f53925e;
        int i = this.f53922b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C21437bf mo54270a(boolean z) throws IOException {
        if (!this.f53928i) {
            m51119l();
            m51122o();
            this.f53917k.mo53870b(z ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false");
            int[] iArr = this.f53925e;
            int i = this.f53922b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder k = C13555b.m33972k("Boolean cannot be used as a map key in JSON at path ");
        k.append(mo54289k());
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: a */
    public C21437bf mo54267a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo54276e();
        }
        return mo54270a(bool.booleanValue());
    }

    /* renamed from: a */
    public C21437bf mo54265a(double d) throws IOException {
        if (!this.f53926g && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f53928i) {
            return mo54269a(Double.toString(d));
        } else {
            m51119l();
            m51122o();
            this.f53917k.mo53870b(Double.toString(d));
            int[] iArr = this.f53925e;
            int i = this.f53922b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: a */
    public C21437bf mo54266a(long j) throws IOException {
        if (this.f53928i) {
            return mo54269a(Long.toString(j));
        }
        m51119l();
        m51122o();
        this.f53917k.mo53870b(Long.toString(j));
        int[] iArr = this.f53925e;
        int i = this.f53922b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C21437bf mo54268a(Number number) throws IOException {
        if (number == null) {
            return mo54276e();
        }
        String obj = number.toString();
        if (!this.f53926g && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f53928i) {
            return mo54269a(obj);
        } else {
            m51119l();
            m51122o();
            this.f53917k.mo53870b(obj);
            int[] iArr = this.f53925e;
            int i = this.f53922b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: a */
    public static void m51117a(abj abj, String str) throws IOException {
        String str2;
        String[] strArr = f53916a;
        abj.mo53899i(34);
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
                abj.mo53871b(str, i, i2);
            }
            abj.mo53870b(str2);
            i = i2 + 1;
        }
        if (i < length) {
            abj.mo53871b(str, i, length);
        }
        abj.mo53899i(34);
    }
}
