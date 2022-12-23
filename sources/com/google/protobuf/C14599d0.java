package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

/* renamed from: com.google.protobuf.d0 */
public final class C14599d0 {

    /* renamed from: e */
    public static final C14599d0 f36840e = new C14599d0(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f36841a;

    /* renamed from: b */
    public int[] f36842b;

    /* renamed from: c */
    public Object[] f36843c;

    /* renamed from: d */
    public int f36844d;

    public C14599d0() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo44045a() {
        int i;
        int i2 = this.f36844d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f36841a; i4++) {
            int i5 = this.f36842b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = CodedOutputStream.m36451w(i6, ((Long) this.f36843c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.f36843c[i4]).longValue();
                i = CodedOutputStream.m36435g(i6);
            } else if (i7 == 2) {
                i = CodedOutputStream.m36431c(i6, (ByteString) this.f36843c[i4]);
            } else if (i7 == 3) {
                i3 = ((C14599d0) this.f36843c[i4]).mo44045a() + (CodedOutputStream.m36448t(i6) * 2) + i3;
            } else if (i7 == 5) {
                ((Integer) this.f36843c[i4]).intValue();
                i = CodedOutputStream.m36434f(i6);
            } else {
                int i8 = InvalidProtocolBufferException.f36811b;
                throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException());
            }
            i3 = i + i3;
        }
        this.f36844d = i3;
        return i3;
    }

    /* renamed from: b */
    public final void mo44046b(C14602f fVar) throws IOException {
        if (this.f36841a != 0) {
            fVar.getClass();
            Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
            for (int i = 0; i < this.f36841a; i++) {
                int i2 = this.f36842b[i];
                Object obj = this.f36843c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    fVar.mo44059j(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    fVar.mo44055f(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    fVar.mo44051b(i3, (ByteString) obj);
                } else if (i4 == 3) {
                    fVar.getClass();
                    Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                    fVar.f36850a.mo43923P(i3, 3);
                    ((C14599d0) obj).mo44046b(fVar);
                    fVar.f36850a.mo43923P(i3, 4);
                } else if (i4 == 5) {
                    fVar.mo44054e(i3, ((Integer) obj).intValue());
                } else {
                    int i5 = InvalidProtocolBufferException.f36811b;
                    throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C14599d0)) {
            return false;
        }
        C14599d0 d0Var = (C14599d0) obj;
        int i = this.f36841a;
        if (i == d0Var.f36841a) {
            int[] iArr = this.f36842b;
            int[] iArr2 = d0Var.f36842b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f36843c;
                Object[] objArr2 = d0Var.f36843c;
                int i3 = this.f36841a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f36841a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f36842b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f36843c;
        int i7 = this.f36841a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public C14599d0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f36844d = -1;
        this.f36841a = i;
        this.f36842b = iArr;
        this.f36843c = objArr;
    }
}
