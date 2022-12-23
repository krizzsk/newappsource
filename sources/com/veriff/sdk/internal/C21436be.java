package com.veriff.sdk.internal;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.veriff.sdk.internal.be */
final class C21436be extends C21437bf {

    /* renamed from: a */
    public Object[] f53920a = new Object[32];

    /* renamed from: k */
    private String f53921k;

    public C21436be() {
        mo54280a(6);
    }

    /* renamed from: a */
    public C21437bf mo54264a() throws IOException {
        if (!this.f53928i) {
            int i = this.f53922b;
            int i2 = this.f53929j;
            if (i == i2 && this.f53923c[i - 1] == 1) {
                this.f53929j = ~i2;
                return this;
            }
            mo54285g();
            ArrayList arrayList = new ArrayList();
            m51135a((Object) arrayList);
            Object[] objArr = this.f53920a;
            int i3 = this.f53922b;
            objArr[i3] = arrayList;
            this.f53925e[i3] = 0;
            mo54280a(1);
            return this;
        }
        StringBuilder k = C13555b.m33972k("Array cannot be used as a map key in JSON at path ");
        k.append(mo54289k());
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: b */
    public C21437bf mo54271b() throws IOException {
        if (mo54284f() == 1) {
            int i = this.f53922b;
            int i2 = this.f53929j;
            if (i == (~i2)) {
                this.f53929j = ~i2;
                return this;
            }
            int i3 = i - 1;
            this.f53922b = i3;
            this.f53920a[i3] = null;
            int[] iArr = this.f53925e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: c */
    public C21437bf mo54273c() throws IOException {
        if (!this.f53928i) {
            int i = this.f53922b;
            int i2 = this.f53929j;
            if (i == i2 && this.f53923c[i - 1] == 3) {
                this.f53929j = ~i2;
                return this;
            }
            mo54285g();
            C21438bg bgVar = new C21438bg();
            m51135a((Object) bgVar);
            this.f53920a[this.f53922b] = bgVar;
            mo54280a(3);
            return this;
        }
        StringBuilder k = C13555b.m33972k("Object cannot be used as a map key in JSON at path ");
        k.append(mo54289k());
        throw new IllegalStateException(k.toString());
    }

    public void close() throws IOException {
        int i = this.f53922b;
        if (i > 1 || (i == 1 && this.f53923c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f53922b = 0;
    }

    /* renamed from: d */
    public C21437bf mo54275d() throws IOException {
        if (mo54284f() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f53921k == null) {
            int i = this.f53922b;
            int i2 = this.f53929j;
            if (i == (~i2)) {
                this.f53929j = ~i2;
                return this;
            }
            this.f53928i = false;
            int i3 = i - 1;
            this.f53922b = i3;
            this.f53920a[i3] = null;
            this.f53924d[i3] = null;
            int[] iArr = this.f53925e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        } else {
            StringBuilder k = C13555b.m33972k("Dangling name: ");
            k.append(this.f53921k);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: e */
    public C21437bf mo54276e() throws IOException {
        if (!this.f53928i) {
            m51135a((Object) null);
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
        if (this.f53922b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: b */
    public C21437bf mo54272b(String str) throws IOException {
        if (this.f53928i) {
            return mo54269a(str);
        }
        m51135a((Object) str);
        int[] iArr = this.f53925e;
        int i = this.f53922b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C21437bf mo54269a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f53922b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (mo54284f() == 3 && this.f53921k == null) {
            this.f53921k = str;
            this.f53924d[this.f53922b - 1] = str;
            this.f53928i = false;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: a */
    public C21437bf mo54270a(boolean z) throws IOException {
        if (!this.f53928i) {
            m51135a((Object) Boolean.valueOf(z));
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
        if (!this.f53928i) {
            m51135a((Object) bool);
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
    public C21437bf mo54265a(double d) throws IOException {
        if (!this.f53926g && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f53928i) {
            return mo54269a(Double.toString(d));
        } else {
            m51135a((Object) Double.valueOf(d));
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
        m51135a((Object) Long.valueOf(j));
        int[] iArr = this.f53925e;
        int i = this.f53922b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C21437bf mo54268a(Number number) throws IOException {
        BigDecimal bigDecimal;
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return mo54266a(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return mo54265a(number.doubleValue());
        }
        if (number == null) {
            return mo54276e();
        }
        if (number instanceof BigDecimal) {
            bigDecimal = (BigDecimal) number;
        } else {
            bigDecimal = new BigDecimal(number.toString());
        }
        if (this.f53928i) {
            return mo54269a(bigDecimal.toString());
        }
        m51135a((Object) bigDecimal);
        int[] iArr = this.f53925e;
        int i = this.f53922b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    private C21436be m51135a(Object obj) {
        String str;
        Object put;
        int f = mo54284f();
        int i = this.f53922b;
        if (i == 1) {
            if (f == 6) {
                this.f53923c[i - 1] = 7;
                this.f53920a[i - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (f != 3 || (str = this.f53921k) == null) {
            if (f == 1) {
                ((List) this.f53920a[i - 1]).add(obj);
            } else if (f == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if ((obj != null || this.f53927h) && (put = ((Map) this.f53920a[i - 1]).put(str, obj)) != null) {
            StringBuilder k = C13555b.m33972k("Map key '");
            k.append(this.f53921k);
            k.append("' has multiple values at path ");
            k.append(mo54289k());
            k.append(": ");
            k.append(put);
            k.append(" and ");
            k.append(obj);
            throw new IllegalArgumentException(k.toString());
        } else {
            this.f53921k = null;
        }
        return this;
    }
}
