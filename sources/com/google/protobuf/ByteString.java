package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import mf0.C24361g;
import p001a0.C0016g;
import p911xg.C20491a;
import p911xg.C20492b;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final ByteString f36798b = new LiteralByteString(C14610k.f36862b);
    private int hash = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.m36409e(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* renamed from: B */
        public final void mo43904B(int i, byte[] bArr) {
            System.arraycopy(this.bytes, this.bytesOffset + 0, bArr, 0, i);
        }

        /* renamed from: d */
        public final byte mo43891d(int i) {
            int i2 = this.bytesLength;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.bytes[this.bytesOffset + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(C16759e.m42349e("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(C13715c.m34244j("Index > length: ", i, ", ", i2));
        }

        /* renamed from: i */
        public final byte mo43894i(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        public final int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            byte[] bArr;
            int size = size();
            if (size == 0) {
                bArr = C14610k.f36862b;
            } else {
                byte[] bArr2 = new byte[size];
                mo43904B(size, bArr2);
                bArr = bArr2;
            }
            return new LiteralByteString(bArr);
        }

        /* renamed from: z */
        public final int mo43906z() {
            return this.bytesOffset;
        }
    }

    public static abstract class LeafByteString extends ByteString {
        public final Iterator iterator() {
            return new C14598d(this);
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        public final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        /* renamed from: d */
        public byte mo43891d(int i) {
            return this.bytes[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int p = mo43898p();
            int p2 = literalByteString.mo43898p();
            if (p != 0 && p2 != 0 && p != p2) {
                return false;
            }
            int size = size();
            if (size > literalByteString.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            } else if (0 + size <= literalByteString.size()) {
                byte[] bArr = this.bytes;
                byte[] bArr2 = literalByteString.bytes;
                int z = mo43906z() + size;
                int z2 = mo43906z();
                int z3 = literalByteString.mo43906z() + 0;
                while (z2 < z) {
                    if (bArr[z2] != bArr2[z3]) {
                        return false;
                    }
                    z2++;
                    z3++;
                }
                return true;
            } else {
                StringBuilder s = C0016g.m35s("Ran off end of other: ", 0, ", ", size, ", ");
                s.append(literalByteString.size());
                throw new IllegalArgumentException(s.toString());
            }
        }

        /* renamed from: i */
        public byte mo43894i(int i) {
            return this.bytes[i];
        }

        /* renamed from: m */
        public final boolean mo43896m() {
            int z = mo43906z();
            byte[] bArr = this.bytes;
            if (Utf8.f36813a.mo43980b(z, size() + z, bArr) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public final int mo43897n(int i, int i2) {
            byte[] bArr = this.bytes;
            int z = mo43906z() + 0;
            Charset charset = C14610k.f36861a;
            for (int i3 = z; i3 < z + i2; i3++) {
                i = (i * 31) + bArr[i3];
            }
            return i;
        }

        /* renamed from: s */
        public final ByteString mo43899s(int i) {
            int e = ByteString.m36409e(0, i, size());
            if (e == 0) {
                return ByteString.f36798b;
            }
            return new BoundedByteString(this.bytes, mo43906z() + 0, e);
        }

        public int size() {
            return this.bytes.length;
        }

        /* renamed from: u */
        public final String mo43902u(Charset charset) {
            return new String(this.bytes, mo43906z(), size(), charset);
        }

        /* renamed from: x */
        public final void mo43903x(C20492b bVar) throws IOException {
            bVar.mo43932a(mo43906z(), size(), this.bytes);
        }

        /* renamed from: z */
        public int mo43906z() {
            return 0;
        }
    }

    /* renamed from: com.google.protobuf.ByteString$a */
    public static abstract class C14567a implements Iterator, p988j$.util.Iterator {
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final Object next() {
            C14598d dVar = (C14598d) this;
            int i = dVar.f36837b;
            if (i < dVar.f36838c) {
                dVar.f36837b = i + 1;
                return Byte.valueOf(dVar.f36839d.mo43894i(i));
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.ByteString$b */
    public static final class C14568b {
    }

    /* renamed from: com.google.protobuf.ByteString$c */
    public static final class C14569c {
    }

    static {
        if (C20491a.m48115a()) {
            new C14569c();
        } else {
            new C14568b();
        }
    }

    /* renamed from: e */
    public static int m36409e(int i, int i2, int i3) {
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

    /* renamed from: d */
    public abstract byte mo43891d(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = mo43897n(size, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract byte mo43894i(int i);

    public java.util.Iterator iterator() {
        return new C14598d(this);
    }

    /* renamed from: m */
    public abstract boolean mo43896m();

    /* renamed from: n */
    public abstract int mo43897n(int i, int i2);

    /* renamed from: p */
    public final int mo43898p() {
        return this.hash;
    }

    /* renamed from: s */
    public abstract ByteString mo43899s(int i);

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = C24361g.m61138H(this);
        } else {
            str = C24361g.m61138H(mo43899s(47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public abstract String mo43902u(Charset charset);

    /* renamed from: x */
    public abstract void mo43903x(C20492b bVar) throws IOException;
}
