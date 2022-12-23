package com.squareup.moshi;

import com.google.android.play.core.assetpacks.C14256d1;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import nb0.C12946j;
import okio.ByteString;
import p001a0.C0016g;
import si0.C24898f;
import si0.C24913t;

public abstract class JsonReader implements Closeable {

    /* renamed from: b */
    public int f24202b;

    /* renamed from: c */
    public int[] f24203c = new int[32];

    /* renamed from: d */
    public String[] f24204d = new String[32];

    /* renamed from: e */
    public int[] f24205e = new int[32];

    public enum Token {
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

    /* renamed from: com.squareup.moshi.JsonReader$a */
    public static final class C7986a {

        /* renamed from: a */
        public final String[] f24206a;

        /* renamed from: b */
        public final C24913t f24207b;

        public C7986a(String[] strArr, C24913t tVar) {
            this.f24206a = strArr;
            this.f24207b = tVar;
        }

        /* renamed from: a */
        public static C7986a m18216a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C24898f fVar = new C24898f();
                for (int i = 0; i < strArr.length; i++) {
                    C12946j.m32756T(fVar, strArr[i]);
                    fVar.readByte();
                    byteStringArr[i] = fVar.mo61439z();
                }
                return new C7986a((String[]) strArr.clone(), C24913t.m62554i(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: A */
    public abstract long mo24983A() throws IOException;

    /* renamed from: B */
    public abstract void mo24984B() throws IOException;

    /* renamed from: C */
    public abstract String mo24985C() throws IOException;

    /* renamed from: H */
    public abstract Token mo24986H() throws IOException;

    /* renamed from: K */
    public abstract void mo24987K() throws IOException;

    /* renamed from: N */
    public final void mo24988N(int i) {
        int i2 = this.f24202b;
        int[] iArr = this.f24203c;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f24203c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f24204d;
                this.f24204d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f24205e;
                this.f24205e = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder k = C13555b.m33972k("Nesting too deep at ");
                k.append(mo24998t());
                throw new JsonDataException(k.toString());
            }
        }
        int[] iArr3 = this.f24203c;
        int i3 = this.f24202b;
        this.f24202b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: O */
    public abstract int mo24989O(C7986a aVar) throws IOException;

    /* renamed from: R */
    public abstract int mo24990R(C7986a aVar) throws IOException;

    /* renamed from: S */
    public abstract void mo24991S() throws IOException;

    /* renamed from: T */
    public abstract void mo24992T() throws IOException;

    /* renamed from: U */
    public final void mo24993U(String str) throws JsonEncodingException {
        StringBuilder t = C0016g.m36t(str, " at path ");
        t.append(mo24998t());
        throw new JsonEncodingException(t.toString());
    }

    /* renamed from: e */
    public abstract void mo24994e() throws IOException;

    /* renamed from: i */
    public abstract void mo24995i() throws IOException;

    /* renamed from: q */
    public abstract void mo24996q() throws IOException;

    /* renamed from: r */
    public abstract void mo24997r() throws IOException;

    /* renamed from: t */
    public final String mo24998t() {
        return C14256d1.m35487e(this.f24202b, this.f24203c, this.f24204d, this.f24205e);
    }

    /* renamed from: v */
    public abstract boolean mo24999v() throws IOException;

    /* renamed from: w */
    public abstract boolean mo25000w() throws IOException;

    /* renamed from: x */
    public abstract double mo25001x() throws IOException;

    /* renamed from: z */
    public abstract int mo25002z() throws IOException;
}
