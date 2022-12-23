package nb0;

import com.google.android.play.core.assetpacks.C14256d1;
import com.squareup.moshi.C8014m;
import com.squareup.moshi.JsonDataException;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: nb0.k */
public abstract class C12947k implements Closeable, Flushable {

    /* renamed from: b */
    public int f32083b = 0;

    /* renamed from: c */
    public int[] f32084c = new int[32];

    /* renamed from: d */
    public String[] f32085d = new String[32];

    /* renamed from: e */
    public int[] f32086e = new int[32];

    /* renamed from: f */
    public boolean f32087f;

    /* renamed from: g */
    public int f32088g = -1;

    /* renamed from: A */
    public final void mo39833A(int i) {
        int[] iArr = this.f32084c;
        int i2 = this.f32083b;
        this.f32083b = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: B */
    public abstract C12947k mo25065B(double d) throws IOException;

    /* renamed from: C */
    public abstract C12947k mo25066C(long j) throws IOException;

    /* renamed from: H */
    public abstract C12947k mo25067H(Number number) throws IOException;

    /* renamed from: K */
    public abstract C12947k mo25068K(String str) throws IOException;

    /* renamed from: N */
    public abstract C12947k mo25069N(boolean z) throws IOException;

    /* renamed from: e */
    public abstract C12947k mo25072e() throws IOException;

    /* renamed from: i */
    public abstract C12947k mo25074i() throws IOException;

    /* renamed from: q */
    public final void mo39834q() {
        int i = this.f32083b;
        int[] iArr = this.f32084c;
        if (i == iArr.length) {
            if (i != 256) {
                this.f32084c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f32085d;
                this.f32085d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f32086e;
                this.f32086e = Arrays.copyOf(iArr2, iArr2.length * 2);
                if (this instanceof C8014m) {
                    C8014m mVar = (C8014m) this;
                    Object[] objArr = mVar.f24273h;
                    mVar.f24273h = Arrays.copyOf(objArr, objArr.length * 2);
                    return;
                }
                return;
            }
            StringBuilder k = C13555b.m33972k("Nesting too deep at ");
            k.append(mo39835v());
            k.append(": circular reference?");
            throw new JsonDataException(k.toString());
        }
    }

    /* renamed from: r */
    public abstract C12947k mo25075r() throws IOException;

    /* renamed from: t */
    public abstract C12947k mo25076t() throws IOException;

    /* renamed from: v */
    public final String mo39835v() {
        return C14256d1.m35487e(this.f32083b, this.f32084c, this.f32085d, this.f32086e);
    }

    /* renamed from: w */
    public abstract C12947k mo25077w(String str) throws IOException;

    /* renamed from: x */
    public abstract C12947k mo25078x() throws IOException;

    /* renamed from: z */
    public final int mo39836z() {
        int i = this.f32083b;
        if (i != 0) {
            return this.f32084c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
}
