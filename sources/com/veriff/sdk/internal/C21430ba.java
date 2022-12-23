package com.veriff.sdk.internal;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p001a0.C0016g;

/* renamed from: com.veriff.sdk.internal.ba */
public abstract class C21430ba implements Closeable {

    /* renamed from: a */
    public int f53886a;

    /* renamed from: b */
    public int[] f53887b;

    /* renamed from: c */
    public String[] f53888c;

    /* renamed from: d */
    public int[] f53889d;

    /* renamed from: e */
    public boolean f53890e;

    /* renamed from: f */
    public boolean f53891f;

    /* renamed from: com.veriff.sdk.internal.ba$a */
    public static final class C21431a {

        /* renamed from: a */
        public final String[] f53892a;

        /* renamed from: b */
        public final C21325abs f53893b;

        private C21431a(String[] strArr, C21325abs abs) {
            this.f53892a = strArr;
            this.f53893b = abs;
        }

        /* renamed from: a */
        public static C21431a m51080a(String... strArr) {
            try {
                abl[] ablArr = new abl[strArr.length];
                abi abi = new abi();
                for (int i = 0; i < strArr.length; i++) {
                    C21435bd.m51117a(abi, strArr[i]);
                    abi.mo53902j();
                    ablArr[i] = abi.mo53913q();
                }
                return new C21431a((String[]) strArr.clone(), C21325abs.m50530a(ablArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.ba$b */
    public enum C21432b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public C21430ba() {
        this.f53887b = new int[32];
        this.f53888c = new String[32];
        this.f53889d = new int[32];
    }

    /* renamed from: a */
    public static C21430ba m51054a(abk abk) {
        return new C21434bc(abk);
    }

    /* renamed from: a */
    public abstract int mo54236a(C21431a aVar) throws IOException;

    /* renamed from: b */
    public abstract int mo54241b(C21431a aVar) throws IOException;

    /* renamed from: b */
    public final void mo54242b(boolean z) {
        this.f53891f = z;
    }

    /* renamed from: c */
    public abstract void mo54244c() throws IOException;

    /* renamed from: d */
    public abstract void mo54245d() throws IOException;

    /* renamed from: e */
    public abstract void mo54246e() throws IOException;

    /* renamed from: f */
    public abstract void mo54247f() throws IOException;

    /* renamed from: g */
    public abstract boolean mo54248g() throws IOException;

    /* renamed from: h */
    public abstract C21432b mo54249h() throws IOException;

    /* renamed from: i */
    public abstract void mo54250i() throws IOException;

    /* renamed from: j */
    public abstract String mo54251j() throws IOException;

    /* renamed from: k */
    public abstract boolean mo54252k() throws IOException;

    /* renamed from: l */
    public abstract <T> T mo54253l() throws IOException;

    /* renamed from: m */
    public abstract double mo54254m() throws IOException;

    /* renamed from: n */
    public abstract long mo54255n() throws IOException;

    /* renamed from: o */
    public abstract int mo54256o() throws IOException;

    /* renamed from: p */
    public abstract void mo54257p() throws IOException;

    /* renamed from: q */
    public abstract C21430ba mo54258q();

    /* renamed from: r */
    public final String mo54259r() {
        return C21433bb.m51081a(this.f53886a, this.f53887b, this.f53888c, this.f53889d);
    }

    /* renamed from: s */
    public abstract void mo54260s() throws IOException;

    /* renamed from: a */
    public final void mo54238a(int i) {
        int i2 = this.f53886a;
        int[] iArr = this.f53887b;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f53887b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f53888c;
                this.f53888c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f53889d;
                this.f53889d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder k = C13555b.m33972k("Nesting too deep at ");
                k.append(mo54259r());
                throw new C21426ax(k.toString());
            }
        }
        int[] iArr3 = this.f53887b;
        int i3 = this.f53886a;
        this.f53886a = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: b */
    public final boolean mo54243b() {
        return this.f53891f;
    }

    public C21430ba(C21430ba baVar) {
        this.f53886a = baVar.f53886a;
        this.f53887b = (int[]) baVar.f53887b.clone();
        this.f53888c = (String[]) baVar.f53888c.clone();
        this.f53889d = (int[]) baVar.f53889d.clone();
        this.f53890e = baVar.f53890e;
        this.f53891f = baVar.f53891f;
    }

    /* renamed from: a */
    public final C21427ay mo54237a(String str) throws C21427ay {
        StringBuilder t = C0016g.m36t(str, " at path ");
        t.append(mo54259r());
        throw new C21427ay(t.toString());
    }

    /* renamed from: a */
    public final void mo54239a(boolean z) {
        this.f53890e = z;
    }

    /* renamed from: a */
    public final boolean mo54240a() {
        return this.f53890e;
    }
}
