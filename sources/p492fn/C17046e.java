package p492fn;

import java.util.Arrays;

/* renamed from: fn.e */
public final class C17046e {

    /* renamed from: a */
    public byte[] f44196a;

    /* renamed from: b */
    public short f44197b;

    /* renamed from: c */
    public String f44198c;

    public C17046e(byte[] bArr, short s, String str) {
        this.f44196a = Arrays.copyOf(bArr, bArr.length);
        this.f44197b = s;
        this.f44198c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17046e.class != obj.getClass()) {
            return false;
        }
        C17046e eVar = (C17046e) obj;
        if (this.f44197b != eVar.f44197b || !Arrays.equals(this.f44196a, eVar.f44196a)) {
            return false;
        }
        String str = this.f44198c;
        String str2 = eVar.f44198c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((Arrays.hashCode(this.f44196a) * 31) + this.f44197b) * 31;
        String str = this.f44198c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
