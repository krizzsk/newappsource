package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import p001a0.C0016g;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: com.fyber.inneractive.sdk.protobuf.i */
public abstract class C3508i implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final C3508i f12443b = new C3516h(C3609z.f12641b);

    /* renamed from: c */
    public static final C3513e f12444c;

    /* renamed from: a */
    public int f12445a = 0;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$a */
    public class C3509a extends C3510b {

        /* renamed from: a */
        public int f12446a = 0;

        /* renamed from: b */
        public final int f12447b;

        public C3509a() {
            this.f12447b = C3508i.this.size();
        }

        /* renamed from: a */
        public byte mo14944a() {
            int i = this.f12446a;
            if (i < this.f12447b) {
                this.f12446a = i + 1;
                return C3508i.this.mo14933d(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f12446a < this.f12447b;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$b */
    public static abstract class C3510b implements C3514f, Iterator {
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        public Object next() {
            return Byte.valueOf(mo14944a());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$c */
    public static final class C3511c implements C3513e {
        /* renamed from: a */
        public byte[] mo14946a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$d */
    public static final class C3512d extends C3516h {
        private static final long serialVersionUID = 1;

        /* renamed from: e */
        public final int f12449e;

        /* renamed from: f */
        public final int f12450f;

        public C3512d(byte[] bArr, int i, int i2) {
            super(bArr);
            C3508i.m8969a(i, i + i2, bArr.length);
            this.f12449e = i;
            this.f12450f = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* renamed from: a */
        public void mo14929a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f12451d, this.f12449e + i, bArr, i2, i3);
        }

        /* renamed from: c */
        public byte mo14932c(int i) {
            C3508i.m8972a(i, this.f12450f);
            return this.f12451d[this.f12449e + i];
        }

        /* renamed from: d */
        public byte mo14933d(int i) {
            return this.f12451d[this.f12449e + i];
        }

        /* renamed from: j */
        public int mo14947j() {
            return this.f12449e;
        }

        public int size() {
            return this.f12450f;
        }

        public Object writeReplace() {
            return new C3516h(mo14938h());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$e */
    public interface C3513e {
        /* renamed from: a */
        byte[] mo14946a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$f */
    public interface C3514f extends java.util.Iterator<Byte> {
        /* renamed from: a */
        byte mo14944a();
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$g */
    public static abstract class C3515g extends C3508i {
        public java.util.Iterator iterator() {
            return new C3509a();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$h */
    public static class C3516h extends C3515g {
        private static final long serialVersionUID = 1;

        /* renamed from: d */
        public final byte[] f12451d;

        public C3516h(byte[] bArr) {
            bArr.getClass();
            this.f12451d = bArr;
        }

        /* renamed from: a */
        public void mo14929a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f12451d, i, bArr, i2, i3);
        }

        /* renamed from: b */
        public final C3508i mo14931b(int i, int i2) {
            int a = C3508i.m8969a(i, i2, size());
            if (a == 0) {
                return C3508i.f12443b;
            }
            return new C3512d(this.f12451d, mo14947j() + i, a);
        }

        /* renamed from: c */
        public byte mo14932c(int i) {
            return this.f12451d[i];
        }

        /* renamed from: d */
        public byte mo14933d(int i) {
            return this.f12451d[i];
        }

        /* renamed from: e */
        public final boolean mo14934e() {
            int j = mo14947j();
            return C3576s1.m9505b(this.f12451d, j, size() + j);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3508i) || size() != ((C3508i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C3516h)) {
                return obj.equals(this);
            }
            C3516h hVar = (C3516h) obj;
            int i = this.f12445a;
            int i2 = hVar.f12445a;
            if (i == 0 || i2 == 0 || i == i2) {
                return mo14949a(hVar, 0, size());
            }
            return false;
        }

        /* renamed from: g */
        public final C3529j mo14937g() {
            return C3529j.m9024a(this.f12451d, mo14947j(), size(), true);
        }

        /* renamed from: j */
        public int mo14947j() {
            return 0;
        }

        public int size() {
            return this.f12451d.length;
        }

        /* renamed from: a */
        public final void mo14928a(C3505h hVar) throws IOException {
            hVar.mo14914a(this.f12451d, mo14947j(), size());
        }

        /* renamed from: a */
        public final String mo14927a(Charset charset) {
            return new String(this.f12451d, mo14947j(), size(), charset);
        }

        /* renamed from: a */
        public final boolean mo14949a(C3508i iVar, int i, int i2) {
            if (i2 <= iVar.size()) {
                int i3 = i + i2;
                if (i3 > iVar.size()) {
                    StringBuilder s = C0016g.m35s("Ran off end of other: ", i, ", ", i2, ", ");
                    s.append(iVar.size());
                    throw new IllegalArgumentException(s.toString());
                } else if (!(iVar instanceof C3516h)) {
                    return iVar.mo14931b(i, i3).equals(mo14931b(0, i2));
                } else {
                    C3516h hVar = (C3516h) iVar;
                    byte[] bArr = this.f12451d;
                    byte[] bArr2 = hVar.f12451d;
                    int j = mo14947j() + i2;
                    int j2 = mo14947j();
                    int j3 = hVar.mo14947j() + i;
                    while (j2 < j) {
                        if (bArr[j2] != bArr2[j3]) {
                            return false;
                        }
                        j2++;
                        j3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* renamed from: b */
        public final int mo14930b(int i, int i2, int i3) {
            byte[] bArr = this.f12451d;
            int j = mo14947j() + i2;
            Charset charset = C3609z.f12640a;
            for (int i4 = j; i4 < j + i3; i4++) {
                i = (i * 31) + bArr[i4];
            }
            return i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$i */
    public static final class C3517i implements C3513e {
        /* renamed from: a */
        public byte[] mo14946a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        C3513e eVar;
        if (C3487d.m8743a()) {
            eVar = new C3517i();
        } else {
            eVar = new C3511c();
        }
        f12444c = eVar;
    }

    /* renamed from: a */
    public static C3508i m8971a(byte[] bArr, int i, int i2) {
        m8969a(i, i + i2, bArr.length);
        return new C3516h(f12444c.mo14946a(bArr, i, i2));
    }

    /* renamed from: a */
    public abstract String mo14927a(Charset charset);

    /* renamed from: a */
    public abstract void mo14928a(C3505h hVar) throws IOException;

    /* renamed from: a */
    public abstract void mo14929a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: b */
    public abstract int mo14930b(int i, int i2, int i3);

    /* renamed from: b */
    public abstract C3508i mo14931b(int i, int i2);

    /* renamed from: c */
    public abstract byte mo14932c(int i);

    /* renamed from: d */
    public abstract byte mo14933d(int i);

    /* renamed from: e */
    public abstract boolean mo14934e();

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public C3514f iterator() {
        return new C3509a();
    }

    /* renamed from: g */
    public abstract C3529j mo14937g();

    /* renamed from: h */
    public final byte[] mo14938h() {
        int size = size();
        if (size == 0) {
            return C3609z.f12641b;
        }
        byte[] bArr = new byte[size];
        mo14929a(bArr, 0, 0, size);
        return bArr;
    }

    public final int hashCode() {
        int i = this.f12445a;
        if (i == 0) {
            int size = size();
            i = mo14930b(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f12445a = i;
        }
        return i;
    }

    /* renamed from: i */
    public final String mo14940i() {
        Charset charset = C3609z.f12640a;
        if (size() == 0) {
            return "";
        }
        return mo14927a(charset);
    }

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = C3539k1.m9222a(this);
        } else {
            str = C3539k1.m9222a(mo14931b(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: a */
    public static C3508i m8970a(String str) {
        return new C3516h(str.getBytes(C3609z.f12640a));
    }

    /* renamed from: a */
    public static void m8972a(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C16759e.m42349e("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(C13715c.m34244j("Index > length: ", i, ", ", i2));
    }

    /* renamed from: a */
    public static int m8969a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C25541a.m63878h("Beginning index: ", i, " < 0"));
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(C13715c.m34244j("Beginning index larger than ending index: ", i, ", ", i2));
        } else {
            throw new IndexOutOfBoundsException(C13715c.m34244j("End index: ", i2, " >= ", i3));
        }
    }
}
