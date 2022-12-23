package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import nb0.C12947k;

/* renamed from: com.squareup.moshi.m */
public final class C8014m extends C12947k {

    /* renamed from: h */
    public Object[] f24273h = new Object[32];

    /* renamed from: i */
    public String f24274i;

    public C8014m() {
        mo39833A(6);
    }

    /* renamed from: B */
    public final C12947k mo25065B(double d) throws IOException {
        if (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f32087f) {
            this.f32087f = false;
            mo25077w(Double.toString(d));
            return this;
        } else {
            mo25070O(Double.valueOf(d));
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
        mo25070O(Long.valueOf(j));
        int[] iArr = this.f32086e;
        int i = this.f32083b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: H */
    public final C12947k mo25067H(Number number) throws IOException {
        BigDecimal bigDecimal;
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            mo25066C(number.longValue());
            return this;
        } else if ((number instanceof Float) || (number instanceof Double)) {
            mo25065B(number.doubleValue());
            return this;
        } else if (number == null) {
            mo25078x();
            return this;
        } else {
            if (number instanceof BigDecimal) {
                bigDecimal = (BigDecimal) number;
            } else {
                bigDecimal = new BigDecimal(number.toString());
            }
            if (this.f32087f) {
                this.f32087f = false;
                mo25077w(bigDecimal.toString());
                return this;
            }
            mo25070O(bigDecimal);
            int[] iArr = this.f32086e;
            int i = this.f32083b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: K */
    public final C12947k mo25068K(String str) throws IOException {
        if (this.f32087f) {
            this.f32087f = false;
            mo25077w(str);
            return this;
        }
        mo25070O(str);
        int[] iArr = this.f32086e;
        int i = this.f32083b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: N */
    public final C12947k mo25069N(boolean z) throws IOException {
        if (!this.f32087f) {
            mo25070O(Boolean.valueOf(z));
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
    public final void mo25070O(Object obj) {
        String str;
        Object put;
        int z = mo39836z();
        int i = this.f32083b;
        if (i == 1) {
            if (z == 6) {
                this.f32084c[i - 1] = 7;
                this.f24273h[i - 1] = obj;
                return;
            }
            throw new IllegalStateException("JSON must have only one top-level value.");
        } else if (z != 3 || (str = this.f24274i) == null) {
            if (z == 1) {
                ((List) this.f24273h[i - 1]).add(obj);
            } else if (z == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if (obj == null || (put = ((Map) this.f24273h[i - 1]).put(str, obj)) == null) {
            this.f24274i = null;
        } else {
            StringBuilder k = C13555b.m33972k("Map key '");
            k.append(this.f24274i);
            k.append("' has multiple values at path ");
            k.append(mo39835v());
            k.append(": ");
            k.append(put);
            k.append(" and ");
            k.append(obj);
            throw new IllegalArgumentException(k.toString());
        }
    }

    public final void close() throws IOException {
        int i = this.f32083b;
        if (i > 1 || (i == 1 && this.f32084c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f32083b = 0;
    }

    /* renamed from: e */
    public final C12947k mo25072e() throws IOException {
        if (!this.f32087f) {
            int i = this.f32083b;
            int i2 = this.f32088g;
            if (i == i2 && this.f32084c[i - 1] == 1) {
                this.f32088g = ~i2;
                return this;
            }
            mo39834q();
            ArrayList arrayList = new ArrayList();
            mo25070O(arrayList);
            Object[] objArr = this.f24273h;
            int i3 = this.f32083b;
            objArr[i3] = arrayList;
            this.f32086e[i3] = 0;
            mo39833A(1);
            return this;
        }
        StringBuilder k = C13555b.m33972k("Array cannot be used as a map key in JSON at path ");
        k.append(mo39835v());
        throw new IllegalStateException(k.toString());
    }

    public final void flush() throws IOException {
        if (this.f32083b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: i */
    public final C12947k mo25074i() throws IOException {
        if (!this.f32087f) {
            int i = this.f32083b;
            int i2 = this.f32088g;
            if (i == i2 && this.f32084c[i - 1] == 3) {
                this.f32088g = ~i2;
                return this;
            }
            mo39834q();
            LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
            mo25070O(linkedHashTreeMap);
            this.f24273h[this.f32083b] = linkedHashTreeMap;
            mo39833A(3);
            return this;
        }
        StringBuilder k = C13555b.m33972k("Object cannot be used as a map key in JSON at path ");
        k.append(mo39835v());
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: r */
    public final C12947k mo25075r() throws IOException {
        if (mo39836z() == 1) {
            int i = this.f32083b;
            int i2 = this.f32088g;
            if (i == (~i2)) {
                this.f32088g = ~i2;
                return this;
            }
            int i3 = i - 1;
            this.f32083b = i3;
            this.f24273h[i3] = null;
            int[] iArr = this.f32086e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: t */
    public final C12947k mo25076t() throws IOException {
        if (mo39836z() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f24274i == null) {
            int i = this.f32083b;
            int i2 = this.f32088g;
            if (i == (~i2)) {
                this.f32088g = ~i2;
                return this;
            }
            this.f32087f = false;
            int i3 = i - 1;
            this.f32083b = i3;
            this.f24273h[i3] = null;
            this.f32085d[i3] = null;
            int[] iArr = this.f32086e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        } else {
            StringBuilder k = C13555b.m33972k("Dangling name: ");
            k.append(this.f24274i);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: w */
    public final C12947k mo25077w(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f32083b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (mo39836z() == 3 && this.f24274i == null && !this.f32087f) {
            this.f24274i = str;
            this.f32085d[this.f32083b - 1] = str;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: x */
    public final C12947k mo25078x() throws IOException {
        if (!this.f32087f) {
            mo25070O((Object) null);
            int[] iArr = this.f32086e;
            int i = this.f32083b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder k = C13555b.m33972k("null cannot be used as a map key in JSON at path ");
        k.append(mo39835v());
        throw new IllegalStateException(k.toString());
    }
}
