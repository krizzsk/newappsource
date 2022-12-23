package vg0;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.C24084f;
import p001a0.C0016g;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;
import vg0.C25091a;
import vg0.C25097e;

/* renamed from: vg0.h */
public final class C25101h extends C25091a {

    /* renamed from: i */
    public static final int[] f63314i;

    /* renamed from: c */
    public final int f63315c;

    /* renamed from: d */
    public final C25091a f63316d;

    /* renamed from: e */
    public final C25091a f63317e;

    /* renamed from: f */
    public final int f63318f;

    /* renamed from: g */
    public final int f63319g;

    /* renamed from: h */
    public int f63320h;

    /* renamed from: vg0.h$a */
    public static class C25102a {

        /* renamed from: a */
        public final Stack<C25091a> f63321a = new Stack<>();

        /* renamed from: a */
        public final void mo61656a(C25091a aVar) {
            if (aVar.mo61622m()) {
                int size = aVar.size();
                int[] iArr = C25101h.f63314i;
                int binarySearch = Arrays.binarySearch(iArr, size);
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int i = iArr[binarySearch + 1];
                if (this.f63321a.isEmpty() || this.f63321a.peek().size() >= i) {
                    this.f63321a.push(aVar);
                    return;
                }
                int i2 = iArr[binarySearch];
                C25091a pop = this.f63321a.pop();
                while (!this.f63321a.isEmpty() && this.f63321a.peek().size() < i2) {
                    pop = new C25101h(this.f63321a.pop(), pop);
                }
                C25101h hVar = new C25101h(pop, aVar);
                while (!this.f63321a.isEmpty()) {
                    int i3 = hVar.f63315c;
                    int[] iArr2 = C25101h.f63314i;
                    int binarySearch2 = Arrays.binarySearch(iArr2, i3);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (this.f63321a.peek().size() >= iArr2[binarySearch2 + 1]) {
                        break;
                    }
                    hVar = new C25101h(this.f63321a.pop(), hVar);
                }
                this.f63321a.push(hVar);
            } else if (aVar instanceof C25101h) {
                C25101h hVar2 = (C25101h) aVar;
                mo61656a(hVar2.f63316d);
                mo61656a(hVar2.f63317e);
            } else {
                String valueOf = String.valueOf(aVar.getClass());
                throw new IllegalArgumentException(C0016g.m31o(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
        }
    }

    /* renamed from: vg0.h$b */
    public static class C25103b implements Iterator<C25097e>, p988j$.util.Iterator {

        /* renamed from: b */
        public final Stack<C25101h> f63322b = new Stack<>();

        /* renamed from: c */
        public C25097e f63323c;

        public C25103b(C25091a aVar) {
            while (aVar instanceof C25101h) {
                C25101h hVar = (C25101h) aVar;
                this.f63322b.push(hVar);
                aVar = hVar.f63316d;
            }
            this.f63323c = (C25097e) aVar;
        }

        /* renamed from: b */
        public final C25097e next() {
            C25097e eVar;
            boolean z;
            C25097e eVar2 = this.f63323c;
            if (eVar2 != null) {
                while (true) {
                    if (!this.f63322b.isEmpty()) {
                        C25091a aVar = this.f63322b.pop().f63317e;
                        while (aVar instanceof C25101h) {
                            C25101h hVar = (C25101h) aVar;
                            this.f63322b.push(hVar);
                            aVar = hVar.f63316d;
                        }
                        eVar = (C25097e) aVar;
                        if (eVar.f63309c.length == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        eVar = null;
                        break;
                    }
                }
                this.f63323c = eVar;
                return eVar2;
            }
            throw new NoSuchElementException();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f63323c != null;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: vg0.h$c */
    public class C25104c implements C25091a.C25092a, p988j$.util.Iterator {

        /* renamed from: b */
        public final C25103b f63324b;

        /* renamed from: c */
        public C25097e.C25098a f63325c;

        /* renamed from: d */
        public int f63326d;

        public C25104c(C25101h hVar) {
            C25103b bVar = new C25103b(hVar);
            this.f63324b = bVar;
            this.f63325c = new C25097e.C25098a();
            this.f63326d = hVar.f63315c;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f63326d > 0;
        }

        public final Object next() {
            return Byte.valueOf(nextByte());
        }

        public final byte nextByte() {
            if (!this.f63325c.hasNext()) {
                this.f63325c = new C25097e.C25098a();
            }
            this.f63326d--;
            return this.f63325c.nextByte();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f63314i = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f63314i;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ C25101h() {
        throw null;
    }

    public C25101h(C25091a aVar, C25091a aVar2) {
        this.f63320h = 0;
        this.f63316d = aVar;
        this.f63317e = aVar2;
        int size = aVar.size();
        this.f63318f = size;
        this.f63315c = aVar2.size() + size;
        this.f63319g = Math.max(aVar.mo61620i(), aVar2.mo61620i()) + 1;
    }

    /* renamed from: B */
    public final String mo61615B() throws UnsupportedEncodingException {
        byte[] bArr;
        int i = this.f63315c;
        if (i == 0) {
            bArr = C24084f.f61087a;
        } else {
            byte[] bArr2 = new byte[i];
            mo61619e(0, 0, i, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    /* renamed from: C */
    public final void mo61616C(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.f63318f;
        if (i3 <= i4) {
            this.f63316d.mo61616C(outputStream, i, i2);
        } else if (i >= i4) {
            this.f63317e.mo61616C(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f63316d.mo61616C(outputStream, i, i5);
            this.f63317e.mo61616C(outputStream, 0, i2 - i5);
        }
    }

    /* renamed from: e */
    public final void mo61619e(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        int i5 = this.f63318f;
        if (i4 <= i5) {
            this.f63316d.mo61619e(i, i2, i3, bArr);
        } else if (i >= i5) {
            this.f63317e.mo61619e(i - i5, i2, i3, bArr);
        } else {
            int i6 = i5 - i;
            this.f63316d.mo61619e(i, i2, i6, bArr);
            this.f63317e.mo61619e(0, i2 + i6, i3 - i6, bArr);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        int z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25091a)) {
            return false;
        }
        C25091a aVar = (C25091a) obj;
        if (this.f63315c != aVar.size()) {
            return false;
        }
        if (this.f63315c == 0) {
            return true;
        }
        if (this.f63320h != 0 && (z2 = aVar.mo61629z()) != 0 && this.f63320h != z2) {
            return false;
        }
        C25103b bVar = new C25103b(this);
        C25097e b = bVar.next();
        C25103b bVar2 = new C25103b(aVar);
        C25097e b2 = bVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = b.f63309c.length - i;
            int length2 = b2.f63309c.length - i2;
            int min = Math.min(length, length2);
            if (i == 0) {
                z = b.mo61648D(b2, i2, min);
            } else {
                z = b2.mo61648D(b, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.f63315c;
            if (i3 < i4) {
                if (min == length) {
                    b = bVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == length2) {
                    b2 = bVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final int hashCode() {
        int i = this.f63320h;
        if (i == 0) {
            int i2 = this.f63315c;
            i = mo61627u(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f63320h = i;
        }
        return i;
    }

    /* renamed from: i */
    public final int mo61620i() {
        return this.f63319g;
    }

    /* renamed from: m */
    public final boolean mo61622m() {
        return this.f63315c >= f63314i[this.f63319g];
    }

    /* renamed from: n */
    public final boolean mo61623n() {
        int x = this.f63316d.mo61628x(0, 0, this.f63318f);
        C25091a aVar = this.f63317e;
        if (aVar.mo61628x(x, 0, aVar.size()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final C25091a.C25092a iterator() {
        return new C25104c(this);
    }

    public final int size() {
        return this.f63315c;
    }

    /* renamed from: u */
    public final int mo61627u(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f63318f;
        if (i4 <= i5) {
            return this.f63316d.mo61627u(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f63317e.mo61627u(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f63317e.mo61627u(this.f63316d.mo61627u(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: x */
    public final int mo61628x(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f63318f;
        if (i4 <= i5) {
            return this.f63316d.mo61628x(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f63317e.mo61628x(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f63317e.mo61628x(this.f63316d.mo61628x(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: z */
    public final int mo61629z() {
        return this.f63320h;
    }
}
