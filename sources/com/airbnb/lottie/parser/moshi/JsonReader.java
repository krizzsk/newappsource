package com.airbnb.lottie.parser.moshi;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import p001a0.C0016g;
import si0.C24898f;
import si0.C24913t;

public abstract class JsonReader implements Closeable {

    /* renamed from: f */
    public static final String[] f6647f = new String[RecyclerView.C1119a0.FLAG_IGNORE];

    /* renamed from: b */
    public int f6648b;

    /* renamed from: c */
    public int[] f6649c = new int[32];

    /* renamed from: d */
    public String[] f6650d = new String[32];

    /* renamed from: e */
    public int[] f6651e = new int[32];

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

    /* renamed from: com.airbnb.lottie.parser.moshi.JsonReader$a */
    public static final class C1901a {

        /* renamed from: a */
        public final String[] f6652a;

        /* renamed from: b */
        public final C24913t f6653b;

        public C1901a(String[] strArr, C24913t tVar) {
            this.f6652a = strArr;
            this.f6653b = tVar;
        }

        /* renamed from: a */
        public static C1901a m5315a(String... strArr) {
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C24898f fVar = new C24898f();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = JsonReader.f6647f;
                    fVar.mo61395V(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char charAt = str2.charAt(i3);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            if (str == null) {
                            }
                        } else if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            fVar.mo61403b0(i2, i3, str2);
                        }
                        fVar.mo61404c0(str);
                        i2 = i3 + 1;
                    }
                    if (i2 < length) {
                        fVar.mo61403b0(i2, length, str2);
                    }
                    fVar.mo61395V(34);
                    fVar.readByte();
                    byteStringArr[i] = fVar.mo61439z();
                }
                return new C1901a((String[]) strArr.clone(), C24913t.m62554i(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f6647f[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f6647f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: A */
    public abstract String mo6823A() throws IOException;

    /* renamed from: B */
    public abstract Token mo6824B() throws IOException;

    /* renamed from: C */
    public final void mo6825C(int i) {
        int i2 = this.f6648b;
        int[] iArr = this.f6649c;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f6649c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f6650d;
                this.f6650d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f6651e;
                this.f6651e = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder k = C13555b.m33972k("Nesting too deep at ");
                k.append(mo6834t());
                throw new JsonDataException(k.toString());
            }
        }
        int[] iArr3 = this.f6649c;
        int i3 = this.f6648b;
        this.f6648b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: H */
    public abstract int mo6826H(C1901a aVar) throws IOException;

    /* renamed from: K */
    public abstract void mo6827K() throws IOException;

    /* renamed from: N */
    public abstract void mo6828N() throws IOException;

    /* renamed from: O */
    public final void mo6829O(String str) throws JsonEncodingException {
        StringBuilder t = C0016g.m36t(str, " at path ");
        t.append(mo6834t());
        throw new JsonEncodingException(t.toString());
    }

    /* renamed from: e */
    public abstract void mo6830e() throws IOException;

    /* renamed from: i */
    public abstract void mo6831i() throws IOException;

    /* renamed from: q */
    public abstract void mo6832q() throws IOException;

    /* renamed from: r */
    public abstract void mo6833r() throws IOException;

    /* renamed from: t */
    public final String mo6834t() {
        int i = this.f6648b;
        int[] iArr = this.f6649c;
        String[] strArr = this.f6650d;
        int[] iArr2 = this.f6651e;
        StringBuilder q = C25541a.m63886q('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                q.append('[');
                q.append(iArr2[i2]);
                q.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                q.append('.');
                String str = strArr[i2];
                if (str != null) {
                    q.append(str);
                }
            }
        }
        return q.toString();
    }

    /* renamed from: v */
    public abstract boolean mo6835v() throws IOException;

    /* renamed from: w */
    public abstract boolean mo6836w() throws IOException;

    /* renamed from: x */
    public abstract double mo6837x() throws IOException;

    /* renamed from: z */
    public abstract int mo6838z() throws IOException;
}
