package vg0;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import vg0.C25101h;

/* renamed from: vg0.a */
public abstract class C25091a implements Iterable<Byte> {

    /* renamed from: b */
    public static final C25097e f63298b = new C25097e(new byte[0]);

    /* renamed from: vg0.a$a */
    public interface C25092a extends Iterator<Byte> {
    }

    static {
        Class<C25091a> cls = C25091a.class;
    }

    /* renamed from: a */
    public static C25091a m62861a(Iterator<C25091a> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m62861a(it, i2).mo61617b(m62861a(it, i - i2));
    }

    /* renamed from: s */
    public static C25093b m62862s() {
        return new C25093b();
    }

    /* renamed from: B */
    public abstract String mo61615B() throws UnsupportedEncodingException;

    /* renamed from: C */
    public abstract void mo61616C(OutputStream outputStream, int i, int i2) throws IOException;

    /* renamed from: b */
    public final C25091a mo61617b(C25091a aVar) {
        C25101h hVar;
        int size = size();
        int size2 = aVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            int[] iArr = C25101h.f63314i;
            C25101h hVar2 = null;
            if (this instanceof C25101h) {
                hVar2 = (C25101h) this;
            }
            if (aVar.size() == 0) {
                return this;
            }
            if (size() == 0) {
                return aVar;
            }
            int size3 = aVar.size() + size();
            if (size3 < 128) {
                int size4 = size();
                int size5 = aVar.size();
                byte[] bArr = new byte[(size4 + size5)];
                mo61618d(0, 0, size4, bArr);
                aVar.mo61618d(0, size4, size5, bArr);
                return new C25097e(bArr);
            }
            if (hVar2 != null) {
                if (aVar.size() + hVar2.f63317e.size() < 128) {
                    C25091a aVar2 = hVar2.f63317e;
                    int size6 = aVar2.size();
                    int size7 = aVar.size();
                    byte[] bArr2 = new byte[(size6 + size7)];
                    aVar2.mo61618d(0, 0, size6, bArr2);
                    aVar.mo61618d(0, size6, size7, bArr2);
                    hVar = new C25101h(hVar2.f63316d, new C25097e(bArr2));
                    return hVar;
                }
            }
            if (hVar2 == null || hVar2.f63316d.mo61620i() <= hVar2.f63317e.mo61620i() || hVar2.f63319g <= aVar.mo61620i()) {
                if (size3 >= C25101h.f63314i[Math.max(mo61620i(), aVar.mo61620i()) + 1]) {
                    hVar = new C25101h(this, aVar);
                    return hVar;
                }
                C25101h.C25102a aVar3 = new C25101h.C25102a();
                aVar3.mo61656a(this);
                aVar3.mo61656a(aVar);
                C25091a pop = aVar3.f63321a.pop();
                while (!aVar3.f63321a.isEmpty()) {
                    pop = new C25101h(aVar3.f63321a.pop(), pop);
                }
                return pop;
            }
            return new C25101h(hVar2.f63316d, new C25101h(hVar2.f63317e, aVar));
        }
        throw new IllegalArgumentException(C13715c.m34243i(53, "ByteString would be too long: ", size, "+", size2));
    }

    /* renamed from: d */
    public final void mo61618d(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C13715c.m34241g(30, "Source offset < 0: ", i));
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException(C13715c.m34241g(30, "Target offset < 0: ", i2));
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    throw new IndexOutOfBoundsException(C13715c.m34241g(34, "Target end offset < 0: ", i5));
                } else if (i3 > 0) {
                    mo61619e(i, i2, i3, bArr);
                }
            } else {
                throw new IndexOutOfBoundsException(C13715c.m34241g(34, "Source end offset < 0: ", i4));
            }
        } else {
            throw new IndexOutOfBoundsException(C13715c.m34241g(23, "Length < 0: ", i3));
        }
    }

    /* renamed from: e */
    public abstract void mo61619e(int i, int i2, int i3, byte[] bArr);

    /* renamed from: i */
    public abstract int mo61620i();

    /* renamed from: m */
    public abstract boolean mo61622m();

    /* renamed from: n */
    public abstract boolean mo61623n();

    /* renamed from: p */
    public abstract C25092a iterator();

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* renamed from: u */
    public abstract int mo61627u(int i, int i2, int i3);

    /* renamed from: x */
    public abstract int mo61628x(int i, int i2, int i3);

    /* renamed from: z */
    public abstract int mo61629z();

    /* renamed from: vg0.a$b */
    public static final class C25093b extends OutputStream {

        /* renamed from: g */
        public static final byte[] f63299g = new byte[0];

        /* renamed from: b */
        public final int f63300b = RecyclerView.C1119a0.FLAG_IGNORE;

        /* renamed from: c */
        public final ArrayList<C25091a> f63301c = new ArrayList<>();

        /* renamed from: d */
        public int f63302d;

        /* renamed from: e */
        public byte[] f63303e = new byte[RecyclerView.C1119a0.FLAG_IGNORE];

        /* renamed from: f */
        public int f63304f;

        /* renamed from: a */
        public final void mo61630a(int i) {
            this.f63301c.add(new C25097e(this.f63303e));
            int length = this.f63302d + this.f63303e.length;
            this.f63302d = length;
            this.f63303e = new byte[Math.max(this.f63300b, Math.max(i, length >>> 1))];
            this.f63304f = 0;
        }

        /* renamed from: e */
        public final void mo61631e() {
            int i = this.f63304f;
            byte[] bArr = this.f63303e;
            if (i >= bArr.length) {
                this.f63301c.add(new C25097e(this.f63303e));
                this.f63303e = f63299g;
            } else if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                this.f63301c.add(new C25097e(bArr2));
            }
            this.f63302d += this.f63304f;
            this.f63304f = 0;
        }

        /* renamed from: i */
        public final synchronized C25091a mo61632i() {
            C25091a aVar;
            mo61631e();
            ArrayList<C25091a> arrayList = this.f63301c;
            if (!(arrayList instanceof Collection)) {
                ArrayList<C25091a> arrayList2 = new ArrayList<>();
                Iterator<C25091a> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            if (arrayList.isEmpty()) {
                aVar = C25091a.f63298b;
            } else {
                aVar = C25091a.m62861a(arrayList.iterator(), arrayList.size());
            }
            return aVar;
        }

        public final String toString() {
            int i;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i = this.f63302d + this.f63304f;
            }
            objArr[1] = Integer.valueOf(i);
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        public final synchronized void write(int i) {
            if (this.f63304f == this.f63303e.length) {
                mo61630a(1);
            }
            byte[] bArr = this.f63303e;
            int i2 = this.f63304f;
            this.f63304f = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public final synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f63303e;
            int length = bArr2.length;
            int i3 = this.f63304f;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f63304f += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                mo61630a(i4);
                System.arraycopy(bArr, i + length2, this.f63303e, 0, i4);
                this.f63304f = i4;
            }
        }
    }
}
