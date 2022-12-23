package com.fyber.inneractive.sdk.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import com.fyber.inneractive.sdk.protobuf.C3576s1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.l */
public abstract class C3540l extends C3505h {

    /* renamed from: b */
    public static final Logger f12507b = Logger.getLogger(C3540l.class.getName());

    /* renamed from: c */
    public static final boolean f12508c = C3569r1.f12545g;

    /* renamed from: a */
    public C3548m f12509a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$b */
    public static abstract class C3542b extends C3540l {

        /* renamed from: d */
        public final byte[] f12510d;

        /* renamed from: e */
        public final int f12511e;

        /* renamed from: f */
        public int f12512f;

        /* renamed from: g */
        public int f12513g;

        public C3542b(int i) {
            super();
            if (i >= 0) {
                int max = Math.max(i, 20);
                this.f12510d = new byte[max];
                this.f12511e = max;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: a */
        public final int mo15057a() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* renamed from: b */
        public final void mo15077b(byte b) {
            byte[] bArr = this.f12510d;
            int i = this.f12512f;
            this.f12512f = i + 1;
            bArr[i] = b;
            this.f12513g++;
        }

        /* renamed from: e */
        public final void mo15078e(long j) {
            byte[] bArr = this.f12510d;
            int i = this.f12512f;
            int i2 = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f12512f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f12513g += 8;
        }

        /* renamed from: f */
        public final void mo15079f(long j) {
            if (C3540l.f12508c) {
                long j2 = (long) this.f12512f;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f12510d;
                    int i = this.f12512f;
                    this.f12512f = i + 1;
                    C3569r1.m9429a(bArr, (long) i, (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f12510d;
                int i2 = this.f12512f;
                this.f12512f = i2 + 1;
                C3569r1.m9429a(bArr2, (long) i2, (byte) ((int) j));
                this.f12513g += (int) (((long) this.f12512f) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f12510d;
                int i3 = this.f12512f;
                this.f12512f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
                this.f12513g++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f12510d;
            int i4 = this.f12512f;
            this.f12512f = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f12513g++;
        }

        /* renamed from: h */
        public final void mo15080h(int i) {
            byte[] bArr = this.f12510d;
            int i2 = this.f12512f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f12512f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f12513g += 4;
        }

        /* renamed from: i */
        public final void mo15081i(int i) {
            if (C3540l.f12508c) {
                long j = (long) this.f12512f;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f12510d;
                    int i2 = this.f12512f;
                    this.f12512f = i2 + 1;
                    C3569r1.m9429a(bArr, (long) i2, (byte) ((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f12510d;
                int i3 = this.f12512f;
                this.f12512f = i3 + 1;
                C3569r1.m9429a(bArr2, (long) i3, (byte) i);
                this.f12513g += (int) (((long) this.f12512f) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f12510d;
                int i4 = this.f12512f;
                this.f12512f = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
                this.f12513g++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f12510d;
            int i5 = this.f12512f;
            this.f12512f = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f12513g++;
        }
    }

    /* renamed from: a */
    public static int m9232a(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: a */
    public static C3540l m9236a(byte[] bArr) {
        return new C3543c(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m9238b(int i, int i2) {
        return m9237b(i) + 4;
    }

    /* renamed from: b */
    public static long m9240b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: c */
    public static int m9241c(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: c */
    public static int m9242c(int i, int i2) {
        return m9223a(i2) + m9237b(i);
    }

    /* renamed from: d */
    public static int m9244d(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: d */
    public static int m9245d(int i, int i2) {
        return m9237b(i) + 4;
    }

    /* renamed from: e */
    public static int m9247e(int i, int i2) {
        return m9241c(m9244d(i2)) + m9237b(i);
    }

    /* renamed from: f */
    public static int m9249f(int i, int i2) {
        return m9241c(i2) + m9237b(i);
    }

    /* renamed from: a */
    public abstract int mo15057a();

    /* renamed from: a */
    public abstract void mo15058a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo15059a(int i, C3564q0 q0Var) throws IOException;

    /* renamed from: b */
    public abstract void mo15061b(int i, C3508i iVar) throws IOException;

    /* renamed from: b */
    public abstract void mo15062b(int i, C3564q0 q0Var, C3498f1 f1Var) throws IOException;

    /* renamed from: b */
    public abstract void mo15063b(int i, String str) throws IOException;

    /* renamed from: b */
    public abstract void mo15064b(int i, boolean z) throws IOException;

    /* renamed from: c */
    public abstract void mo15065c(int i, C3508i iVar) throws IOException;

    /* renamed from: c */
    public abstract void mo15066c(long j) throws IOException;

    /* renamed from: d */
    public abstract void mo15067d(long j) throws IOException;

    /* renamed from: e */
    public abstract void mo15068e(int i) throws IOException;

    /* renamed from: f */
    public abstract void mo15069f(int i) throws IOException;

    /* renamed from: f */
    public abstract void mo15070f(int i, long j) throws IOException;

    /* renamed from: g */
    public abstract void mo15071g(int i) throws IOException;

    /* renamed from: g */
    public abstract void mo15072g(int i, int i2) throws IOException;

    /* renamed from: g */
    public abstract void mo15073g(int i, long j) throws IOException;

    /* renamed from: h */
    public abstract void mo15074h(int i, int i2) throws IOException;

    /* renamed from: i */
    public abstract void mo15075i(int i, int i2) throws IOException;

    /* renamed from: j */
    public abstract void mo15076j(int i, int i2) throws IOException;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$c */
    public static class C3543c extends C3540l {

        /* renamed from: d */
        public final byte[] f12514d;

        /* renamed from: e */
        public final int f12515e;

        /* renamed from: f */
        public int f12516f;

        public C3543c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f12514d = bArr;
                    this.f12516f = i;
                    this.f12515e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public final void mo15059a(int i, C3564q0 q0Var) throws IOException {
            mo15071g(C3584t1.m9573a(1, 3));
            mo15076j(2, i);
            mo15071g(C3584t1.m9573a(3, 2));
            mo15071g(q0Var.getSerializedSize());
            q0Var.writeTo(this);
            mo15071g(C3584t1.m9573a(1, 4));
        }

        /* renamed from: b */
        public final void mo15064b(int i, boolean z) throws IOException {
            mo15071g(C3584t1.m9573a(i, 0));
            mo15058a(z ? (byte) 1 : 0);
        }

        /* renamed from: c */
        public final void mo15065c(int i, C3508i iVar) throws IOException {
            mo15071g(C3584t1.m9573a(1, 3));
            mo15076j(2, i);
            mo15061b(3, iVar);
            mo15071g(C3584t1.m9573a(1, 4));
        }

        /* renamed from: d */
        public final void mo15067d(long j) throws IOException {
            if (!C3540l.f12508c || mo15057a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f12514d;
                    int i = this.f12516f;
                    this.f12516f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f12514d;
                    int i2 = this.f12516f;
                    this.f12516f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C3544d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12516f), Integer.valueOf(this.f12515e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f12514d;
                    int i3 = this.f12516f;
                    this.f12516f = i3 + 1;
                    C3569r1.m9429a(bArr3, (long) i3, (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f12514d;
                int i4 = this.f12516f;
                this.f12516f = i4 + 1;
                C3569r1.m9429a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: e */
        public final void mo15068e(int i) throws IOException {
            try {
                byte[] bArr = this.f12514d;
                int i2 = this.f12516f;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f12516f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            } catch (IndexOutOfBoundsException e) {
                throw new C3544d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12516f), Integer.valueOf(this.f12515e), 1}), e);
            }
        }

        /* renamed from: f */
        public final void mo15070f(int i, long j) throws IOException {
            mo15071g(C3584t1.m9573a(i, 1));
            mo15066c(j);
        }

        /* renamed from: g */
        public final void mo15071g(int i) throws IOException {
            if (!C3540l.f12508c || C3487d.m8743a() || mo15057a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f12514d;
                    int i2 = this.f12516f;
                    this.f12516f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f12514d;
                    int i3 = this.f12516f;
                    this.f12516f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C3544d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12516f), Integer.valueOf(this.f12515e), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f12514d;
                int i4 = this.f12516f;
                this.f12516f = i4 + 1;
                C3569r1.m9429a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f12514d;
                int i5 = this.f12516f;
                this.f12516f = i5 + 1;
                C3569r1.m9429a(bArr4, (long) i5, (byte) (i | RecyclerView.C1119a0.FLAG_IGNORE));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f12514d;
                    int i7 = this.f12516f;
                    this.f12516f = i7 + 1;
                    C3569r1.m9429a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f12514d;
                int i8 = this.f12516f;
                this.f12516f = i8 + 1;
                C3569r1.m9429a(bArr6, (long) i8, (byte) (i6 | RecyclerView.C1119a0.FLAG_IGNORE));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f12514d;
                    int i11 = this.f12516f;
                    this.f12516f = i11 + 1;
                    C3569r1.m9429a(bArr7, (long) i11, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f12514d;
                int i12 = this.f12516f;
                this.f12516f = i12 + 1;
                C3569r1.m9429a(bArr8, (long) i12, (byte) (i9 | RecyclerView.C1119a0.FLAG_IGNORE));
                int i13 = i9 >>> 7;
                if ((i13 & -128) == 0) {
                    byte[] bArr9 = this.f12514d;
                    int i14 = this.f12516f;
                    this.f12516f = i14 + 1;
                    C3569r1.m9429a(bArr9, (long) i14, (byte) i13);
                    return;
                }
                byte[] bArr10 = this.f12514d;
                int i15 = this.f12516f;
                this.f12516f = i15 + 1;
                C3569r1.m9429a(bArr10, (long) i15, (byte) (i13 | RecyclerView.C1119a0.FLAG_IGNORE));
                byte[] bArr11 = this.f12514d;
                int i16 = this.f12516f;
                this.f12516f = i16 + 1;
                C3569r1.m9429a(bArr11, (long) i16, (byte) (i13 >>> 7));
            }
        }

        /* renamed from: h */
        public final void mo15074h(int i, int i2) throws IOException {
            mo15071g(C3584t1.m9573a(i, 0));
            if (i2 >= 0) {
                mo15071g(i2);
            } else {
                mo15067d((long) i2);
            }
        }

        /* renamed from: i */
        public final void mo15075i(int i, int i2) throws IOException {
            mo15071g(C3584t1.m9573a(i, i2));
        }

        /* renamed from: j */
        public final void mo15076j(int i, int i2) throws IOException {
            mo15071g(C3584t1.m9573a(i, 0));
            mo15071g(i2);
        }

        /* renamed from: b */
        public final void mo15061b(int i, C3508i iVar) throws IOException {
            mo15071g(C3584t1.m9573a(i, 2));
            mo15082b(iVar);
        }

        /* renamed from: f */
        public final void mo15069f(int i) throws IOException {
            if (i >= 0) {
                mo15071g(i);
            } else {
                mo15067d((long) i);
            }
        }

        /* renamed from: b */
        public final void mo15062b(int i, C3564q0 q0Var, C3498f1 f1Var) throws IOException {
            mo15071g(C3584t1.m9573a(i, 2));
            mo15071g(((C3473a) q0Var).getSerializedSize(f1Var));
            f1Var.mo14892a(q0Var, (C3599u1) this.f12509a);
        }

        /* renamed from: c */
        public final void mo15066c(long j) throws IOException {
            try {
                byte[] bArr = this.f12514d;
                int i = this.f12516f;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f12516f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            } catch (IndexOutOfBoundsException e) {
                throw new C3544d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12516f), Integer.valueOf(this.f12515e), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo15058a(byte b) throws IOException {
            try {
                byte[] bArr = this.f12514d;
                int i = this.f12516f;
                this.f12516f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C3544d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12516f), Integer.valueOf(this.f12515e), 1}), e);
            }
        }

        /* renamed from: b */
        public final void mo15063b(int i, String str) throws IOException {
            mo15071g(C3584t1.m9573a(i, 2));
            mo15083b(str);
        }

        /* renamed from: a */
        public final void mo14914a(byte[] bArr, int i, int i2) throws IOException {
            mo15084b(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo15082b(C3508i iVar) throws IOException {
            mo15071g(iVar.size());
            iVar.mo14928a((C3505h) this);
        }

        /* renamed from: a */
        public final int mo15057a() {
            return this.f12515e - this.f12516f;
        }

        /* renamed from: b */
        public final void mo15084b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f12514d, this.f12516f, i2);
                this.f12516f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C3544d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12516f), Integer.valueOf(this.f12515e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: b */
        public final void mo15083b(String str) throws IOException {
            int i = this.f12516f;
            try {
                int c = C3540l.m9241c(str.length() * 3);
                int c2 = C3540l.m9241c(str.length());
                if (c2 == c) {
                    int i2 = i + c2;
                    this.f12516f = i2;
                    int a = C3576s1.f12550a.mo15180a((CharSequence) str, this.f12514d, i2, mo15057a());
                    this.f12516f = i;
                    mo15071g((a - i) - c2);
                    this.f12516f = a;
                    return;
                }
                mo15071g(C3576s1.m9502a((CharSequence) str));
                this.f12516f = C3576s1.f12550a.mo15180a((CharSequence) str, this.f12514d, this.f12516f, mo15057a());
            } catch (C3576s1.C3580d e) {
                this.f12516f = i;
                mo15060a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C3544d(e2);
            }
        }

        /* renamed from: g */
        public final void mo15072g(int i, int i2) throws IOException {
            mo15071g(C3584t1.m9573a(i, 5));
            mo15068e(i2);
        }

        /* renamed from: g */
        public final void mo15073g(int i, long j) throws IOException {
            mo15071g(C3584t1.m9573a(i, 0));
            mo15067d(j);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$e */
    public static final class C3545e extends C3542b {

        /* renamed from: h */
        public final OutputStream f12517h;

        public C3545e(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f12517h = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: a */
        public void mo15059a(int i, C3564q0 q0Var) throws IOException {
            mo15071g(C3584t1.m9573a(1, 3));
            mo15076j(2, i);
            mo15071g(C3584t1.m9573a(3, 2));
            mo15071g(q0Var.getSerializedSize());
            q0Var.writeTo(this);
            mo15071g(C3584t1.m9573a(1, 4));
        }

        /* renamed from: b */
        public void mo15061b(int i, C3508i iVar) throws IOException {
            mo15071g(C3584t1.m9573a(i, 2));
            mo15086b(iVar);
        }

        /* renamed from: c */
        public void mo15065c(int i, C3508i iVar) throws IOException {
            mo15071g(C3584t1.m9573a(1, 3));
            mo15076j(2, i);
            mo15061b(3, iVar);
            mo15071g(C3584t1.m9573a(1, 4));
        }

        /* renamed from: d */
        public void mo15067d(long j) throws IOException {
            mo15089j(10);
            mo15079f(j);
        }

        /* renamed from: e */
        public void mo15068e(int i) throws IOException {
            mo15089j(4);
            mo15080h(i);
        }

        /* renamed from: f */
        public void mo15070f(int i, long j) throws IOException {
            mo15089j(18);
            mo15081i(C3584t1.m9573a(i, 1));
            mo15078e(j);
        }

        /* renamed from: g */
        public void mo15072g(int i, int i2) throws IOException {
            mo15089j(14);
            mo15081i(C3584t1.m9573a(i, 5));
            mo15080h(i2);
        }

        /* renamed from: h */
        public void mo15074h(int i, int i2) throws IOException {
            mo15089j(20);
            mo15081i(C3584t1.m9573a(i, 0));
            if (i2 >= 0) {
                mo15081i(i2);
            } else {
                mo15079f((long) i2);
            }
        }

        /* renamed from: i */
        public void mo15075i(int i, int i2) throws IOException {
            mo15071g(C3584t1.m9573a(i, i2));
        }

        /* renamed from: j */
        public void mo15076j(int i, int i2) throws IOException {
            mo15089j(20);
            mo15081i(C3584t1.m9573a(i, 0));
            mo15081i(i2);
        }

        /* renamed from: b */
        public void mo15062b(int i, C3564q0 q0Var, C3498f1 f1Var) throws IOException {
            mo15071g(C3584t1.m9573a(i, 2));
            mo15071g(((C3473a) q0Var).getSerializedSize(f1Var));
            f1Var.mo14892a(q0Var, (C3599u1) this.f12509a);
        }

        /* renamed from: f */
        public void mo15069f(int i) throws IOException {
            if (i >= 0) {
                mo15089j(5);
                mo15081i(i);
                return;
            }
            mo15067d((long) i);
        }

        /* renamed from: g */
        public void mo15073g(int i, long j) throws IOException {
            mo15089j(20);
            mo15081i(C3584t1.m9573a(i, 0));
            mo15079f(j);
        }

        /* renamed from: j */
        public final void mo15089j(int i) throws IOException {
            if (this.f12511e - this.f12512f < i) {
                mo15085b();
            }
        }

        /* renamed from: c */
        public void mo15066c(long j) throws IOException {
            mo15089j(8);
            mo15078e(j);
        }

        /* renamed from: b */
        public void mo15063b(int i, String str) throws IOException {
            mo15071g(C3584t1.m9573a(i, 2));
            mo15087b(str);
        }

        /* renamed from: a */
        public void mo15058a(byte b) throws IOException {
            if (this.f12512f == this.f12511e) {
                mo15085b();
            }
            mo15077b(b);
        }

        /* renamed from: g */
        public void mo15071g(int i) throws IOException {
            mo15089j(5);
            mo15081i(i);
        }

        /* renamed from: b */
        public void mo15064b(int i, boolean z) throws IOException {
            mo15089j(11);
            mo15081i(C3584t1.m9573a(i, 0));
            mo15077b(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public void mo14914a(byte[] bArr, int i, int i2) throws IOException {
            mo15088b(bArr, i, i2);
        }

        /* renamed from: b */
        public void mo15086b(C3508i iVar) throws IOException {
            mo15071g(iVar.size());
            iVar.mo14928a((C3505h) this);
        }

        /* renamed from: b */
        public void mo15087b(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int c = C3540l.m9241c(length);
                int i3 = c + length;
                int i4 = this.f12511e;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int a = C3576s1.f12550a.mo15180a((CharSequence) str, bArr, 0, length);
                    mo15071g(a);
                    mo15088b(bArr, 0, a);
                    return;
                }
                if (i3 > i4 - this.f12512f) {
                    mo15085b();
                }
                int c2 = C3540l.m9241c(str.length());
                i = this.f12512f;
                if (c2 == c) {
                    int i5 = i + c2;
                    this.f12512f = i5;
                    int a2 = C3576s1.f12550a.mo15180a((CharSequence) str, this.f12510d, i5, this.f12511e - i5);
                    this.f12512f = i;
                    i2 = (a2 - i) - c2;
                    mo15081i(i2);
                    this.f12512f = a2;
                } else {
                    i2 = C3576s1.m9502a((CharSequence) str);
                    mo15081i(i2);
                    this.f12512f = C3576s1.f12550a.mo15180a((CharSequence) str, this.f12510d, this.f12512f, i2);
                }
                this.f12513g += i2;
            } catch (C3576s1.C3580d e) {
                this.f12513g -= this.f12512f - i;
                this.f12512f = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C3544d(e2);
            } catch (C3576s1.C3580d e3) {
                mo15060a(str, e3);
            }
        }

        /* renamed from: b */
        public void mo15088b(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f12511e;
            int i4 = this.f12512f;
            int i5 = i3 - i4;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, this.f12510d, i4, i2);
                this.f12512f += i2;
                this.f12513g += i2;
                return;
            }
            System.arraycopy(bArr, i, this.f12510d, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f12512f = this.f12511e;
            this.f12513g += i5;
            mo15085b();
            if (i7 <= this.f12511e) {
                System.arraycopy(bArr, i6, this.f12510d, 0, i7);
                this.f12512f = i7;
            } else {
                this.f12517h.write(bArr, i6, i7);
            }
            this.f12513g += i7;
        }

        /* renamed from: b */
        public final void mo15085b() throws IOException {
            this.f12517h.write(this.f12510d, 0, this.f12512f);
            this.f12512f = 0;
        }
    }

    public C3540l() {
    }

    /* renamed from: b */
    public static int m9239b(int i, long j) {
        return m9232a(j) + m9237b(i);
    }

    /* renamed from: c */
    public static int m9243c(int i, long j) {
        return m9237b(i) + 8;
    }

    /* renamed from: d */
    public static int m9246d(int i, long j) {
        return m9232a(m9240b(j)) + m9237b(i);
    }

    /* renamed from: a */
    public static int m9233a(C3488d0 d0Var) {
        int i;
        if (d0Var.f12414b != null) {
            i = d0Var.f12414b.size();
        } else {
            i = d0Var.f12413a != null ? d0Var.f12413a.getSerializedSize() : 0;
        }
        return m9241c(i) + i;
    }

    /* renamed from: e */
    public static int m9248e(int i, long j) {
        return m9232a(j) + m9237b(i);
    }

    /* renamed from: b */
    public static int m9237b(int i) {
        return m9241c(C3584t1.m9573a(i, 0));
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$d */
    public static class C3544d extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public C3544d(String str, Throwable th) {
            super(C25541a.m63881k("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public C3544d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: a */
    public static int m9227a(int i, long j) {
        return m9237b(i) + 8;
    }

    /* renamed from: a */
    public static int m9225a(int i, float f) {
        return m9237b(i) + 4;
    }

    /* renamed from: a */
    public static int m9224a(int i, double d) {
        return m9237b(i) + 8;
    }

    /* renamed from: a */
    public static int m9231a(int i, boolean z) {
        return m9237b(i) + 1;
    }

    /* renamed from: a */
    public static int m9226a(int i, int i2) {
        return m9223a(i2) + m9237b(i);
    }

    /* renamed from: a */
    public static int m9230a(int i, String str) {
        return m9235a(str) + m9237b(i);
    }

    /* renamed from: a */
    public static int m9228a(int i, C3508i iVar) {
        int b = m9237b(i);
        int size = iVar.size();
        return m9241c(size) + size + b;
    }

    /* renamed from: a */
    public static int m9223a(int i) {
        if (i >= 0) {
            return m9241c(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m9235a(String str) {
        int i;
        try {
            i = C3576s1.m9502a((CharSequence) str);
        } catch (C3576s1.C3580d unused) {
            i = str.getBytes(C3609z.f12640a).length;
        }
        return m9241c(i) + i;
    }

    /* renamed from: a */
    public static int m9234a(C3508i iVar) {
        int size = iVar.size();
        return m9241c(size) + size;
    }

    /* renamed from: a */
    public final void mo15060a(String str, C3576s1.C3580d dVar) throws IOException {
        f12507b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C3609z.f12640a);
        try {
            mo15071g(bytes.length);
            mo14914a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C3544d(e);
        } catch (C3544d e2) {
            throw e2;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static int m9229a(int i, C3564q0 q0Var, C3498f1 f1Var) {
        return ((C3473a) q0Var).getSerializedSize(f1Var) + (m9237b(i) * 2);
    }
}
