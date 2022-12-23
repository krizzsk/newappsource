package com.veriff.sdk.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.veriff.sdk.internal.bf */
public abstract class C21437bf implements Closeable, Flushable {

    /* renamed from: b */
    public int f53922b = 0;

    /* renamed from: c */
    public int[] f53923c = new int[32];

    /* renamed from: d */
    public String[] f53924d = new String[32];

    /* renamed from: e */
    public int[] f53925e = new int[32];

    /* renamed from: g */
    public boolean f53926g;

    /* renamed from: h */
    public boolean f53927h;

    /* renamed from: i */
    public boolean f53928i;

    /* renamed from: j */
    public int f53929j = -1;

    /* renamed from: a */
    public static C21437bf m51148a(abj abj) {
        return new C21435bd(abj);
    }

    /* renamed from: a */
    public abstract C21437bf mo54264a() throws IOException;

    /* renamed from: a */
    public abstract C21437bf mo54265a(double d) throws IOException;

    /* renamed from: a */
    public abstract C21437bf mo54266a(long j) throws IOException;

    /* renamed from: a */
    public abstract C21437bf mo54267a(Boolean bool) throws IOException;

    /* renamed from: a */
    public abstract C21437bf mo54268a(Number number) throws IOException;

    /* renamed from: a */
    public abstract C21437bf mo54269a(String str) throws IOException;

    /* renamed from: a */
    public abstract C21437bf mo54270a(boolean z) throws IOException;

    /* renamed from: b */
    public abstract C21437bf mo54271b() throws IOException;

    /* renamed from: b */
    public abstract C21437bf mo54272b(String str) throws IOException;

    /* renamed from: b */
    public final void mo54281b(int i) {
        this.f53923c[this.f53922b - 1] = i;
    }

    /* renamed from: c */
    public abstract C21437bf mo54273c() throws IOException;

    /* renamed from: c */
    public final void mo54283c(boolean z) {
        this.f53927h = z;
    }

    /* renamed from: d */
    public abstract C21437bf mo54275d() throws IOException;

    /* renamed from: e */
    public abstract C21437bf mo54276e() throws IOException;

    /* renamed from: f */
    public final int mo54284f() {
        int i = this.f53922b;
        if (i != 0) {
            return this.f53923c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final boolean mo54285g() {
        int i = this.f53922b;
        int[] iArr = this.f53923c;
        if (i != iArr.length) {
            return false;
        }
        if (i != 256) {
            this.f53923c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f53924d;
            this.f53924d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f53925e;
            this.f53925e = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (!(this instanceof C21436be)) {
                return true;
            }
            C21436be beVar = (C21436be) this;
            Object[] objArr = beVar.f53920a;
            beVar.f53920a = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        StringBuilder k = C13555b.m33972k("Nesting too deep at ");
        k.append(mo54289k());
        k.append(": circular reference?");
        throw new C21426ax(k.toString());
    }

    /* renamed from: h */
    public final boolean mo54286h() {
        return this.f53926g;
    }

    /* renamed from: i */
    public final boolean mo54287i() {
        return this.f53927h;
    }

    /* renamed from: j */
    public final void mo54288j() throws IOException {
        int f = mo54284f();
        if (f == 5 || f == 3) {
            this.f53928i = true;
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: k */
    public final String mo54289k() {
        return C21433bb.m51081a(this.f53922b, this.f53923c, this.f53924d, this.f53925e);
    }

    /* renamed from: a */
    public final void mo54280a(int i) {
        int[] iArr = this.f53923c;
        int i2 = this.f53922b;
        this.f53922b = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    public final void mo54282b(boolean z) {
        this.f53926g = z;
    }
}
