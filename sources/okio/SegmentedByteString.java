package okio;

import cf0.C21132f;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.security.MessageDigest;
import kotlin.Metadata;
import mf0.C24362h;
import p583jk.C17875h;
import p584jl.C17885a;
import si0.C24898f;
import si0.C24920y;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, mo59060d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "okio"}, mo59061k = 1, mo59062mv = {1, 4, 1})
public final class SegmentedByteString extends ByteString {

    /* renamed from: e */
    public final transient byte[][] f62333e;

    /* renamed from: f */
    public final transient int[] f62334f;

    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.f62330d.mo60872j());
        this.f62333e = bArr;
        this.f62334f = iArr;
    }

    private final Object writeReplace() {
        return new ByteString(mo60880s());
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ByteString) {
                ByteString byteString = (ByteString) obj;
                if (byteString.mo60873k() != mo60873k() || !mo60878q(byteString, mo60873k())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo60869f() {
        return new ByteString(mo60880s()).mo60869f();
    }

    public final int hashCode() {
        int i = this.f62331b;
        if (i != 0) {
            return i;
        }
        int length = this.f62333e.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f62334f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f62333e[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f62331b = i3;
        return i3;
    }

    /* renamed from: i */
    public final ByteString mo60871i(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = this.f62333e.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f62334f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            instance.update(this.f62333e[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        C24362h.m61210e(digest, "digestBytes");
        return new ByteString(digest);
    }

    /* renamed from: k */
    public final int mo60873k() {
        return this.f62334f[this.f62333e.length - 1];
    }

    /* renamed from: l */
    public final String mo60874l() {
        return new ByteString(mo60880s()).mo60874l();
    }

    /* renamed from: m */
    public final byte[] mo60875m() {
        return mo60880s();
    }

    /* renamed from: n */
    public final byte mo60876n(int i) {
        int i2;
        C17885a.m44460s((long) this.f62334f[this.f62333e.length - 1], (long) i, 1);
        int O = C17875h.m44290O(this, i);
        if (O == 0) {
            i2 = 0;
        } else {
            i2 = this.f62334f[O - 1];
        }
        int[] iArr = this.f62334f;
        byte[][] bArr = this.f62333e;
        return bArr[O][(i - i2) + iArr[bArr.length + O]];
    }

    /* renamed from: p */
    public final boolean mo60877p(int i, int i2, int i3, byte[] bArr) {
        int i4;
        C24362h.m61211f(bArr, InneractiveMediationNameConsts.OTHER);
        if (i < 0 || i > mo60873k() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int O = C17875h.m44290O(this, i);
        while (i < i5) {
            if (O == 0) {
                i4 = 0;
            } else {
                i4 = this.f62334f[O - 1];
            }
            int[] iArr = this.f62334f;
            int i6 = iArr[this.f62333e.length + O];
            int min = Math.min(i5, (iArr[O] - i4) + i4) - i;
            if (!C17885a.m44447l((i - i4) + i6, this.f62333e[O], i2, bArr, min)) {
                return false;
            }
            i2 += min;
            i += min;
            O++;
        }
        return true;
    }

    /* renamed from: q */
    public final boolean mo60878q(ByteString byteString, int i) {
        int i2;
        C24362h.m61211f(byteString, InneractiveMediationNameConsts.OTHER);
        if (mo60873k() - i < 0) {
            return false;
        }
        int i3 = i + 0;
        int O = C17875h.m44290O(this, 0);
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            if (O == 0) {
                i2 = 0;
            } else {
                i2 = this.f62334f[O - 1];
            }
            int[] iArr = this.f62334f;
            int i6 = iArr[this.f62333e.length + O];
            int min = Math.min(i3, (iArr[O] - i2) + i2) - i4;
            if (!byteString.mo60877p(i5, (i4 - i2) + i6, min, this.f62333e[O])) {
                return false;
            }
            i5 += min;
            i4 += min;
            O++;
        }
        return true;
    }

    /* renamed from: r */
    public final ByteString mo60879r() {
        return new ByteString(mo60880s()).mo60879r();
    }

    /* renamed from: s */
    public final byte[] mo60880s() {
        byte[] bArr = new byte[mo60873k()];
        int length = this.f62333e.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f62334f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            C21132f.m49429L0(i3, this.f62333e[i], i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final String toString() {
        return new ByteString(mo60880s()).toString();
    }

    /* renamed from: u */
    public final void mo60883u(C24898f fVar, int i) {
        int i2;
        C24362h.m61211f(fVar, "buffer");
        int i3 = 0 + i;
        int O = C17875h.m44290O(this, 0);
        int i4 = 0;
        while (i4 < i3) {
            if (O == 0) {
                i2 = 0;
            } else {
                i2 = this.f62334f[O - 1];
            }
            int[] iArr = this.f62334f;
            int i5 = iArr[this.f62333e.length + O];
            int min = Math.min(i3, (iArr[O] - i2) + i2) - i4;
            int i6 = (i4 - i2) + i5;
            C24920y yVar = new C24920y(this.f62333e[O], i6, i6 + min, true);
            C24920y yVar2 = fVar.f62946b;
            if (yVar2 == null) {
                yVar.f62997g = yVar;
                yVar.f62996f = yVar;
                fVar.f62946b = yVar;
            } else {
                C24920y yVar3 = yVar2.f62997g;
                C24362h.m61208c(yVar3);
                yVar3.mo61476b(yVar);
            }
            i4 += min;
            O++;
        }
        fVar.f62947c += (long) i;
    }
}
