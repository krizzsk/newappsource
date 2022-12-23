package p577je;

import java.util.Arrays;
import p577je.C17746a0;

/* renamed from: je.f */
public final class C17791f extends C17746a0.C17751d.C17752a {

    /* renamed from: a */
    public final String f45631a;

    /* renamed from: b */
    public final byte[] f45632b;

    public C17791f(String str, byte[] bArr) {
        this.f45631a = str;
        this.f45632b = bArr;
    }

    /* renamed from: a */
    public final byte[] mo50191a() {
        return this.f45632b;
    }

    /* renamed from: b */
    public final String mo50192b() {
        return this.f45631a;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17751d.C17752a)) {
            return false;
        }
        C17746a0.C17751d.C17752a aVar = (C17746a0.C17751d.C17752a) obj;
        if (this.f45631a.equals(aVar.mo50192b())) {
            byte[] bArr2 = this.f45632b;
            if (aVar instanceof C17791f) {
                bArr = ((C17791f) aVar).f45632b;
            } else {
                bArr = aVar.mo50191a();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45631a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f45632b);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("File{filename=");
        k.append(this.f45631a);
        k.append(", contents=");
        k.append(Arrays.toString(this.f45632b));
        k.append("}");
        return k.toString();
    }
}
