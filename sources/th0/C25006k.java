package th0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import mf0.C24362h;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: th0.k */
public final class C25006k<T> implements C25003h<T>, C24995c<T> {

    /* renamed from: a */
    public final C25003h<T> f63162a;

    /* renamed from: b */
    public final int f63163b;

    /* renamed from: c */
    public final int f63164c;

    /* renamed from: th0.k$a */
    public static final class C25007a implements Iterator<T>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public final Iterator<T> f63165b;

        /* renamed from: c */
        public int f63166c;

        /* renamed from: d */
        public final /* synthetic */ C25006k<T> f63167d;

        public C25007a(C25006k<T> kVar) {
            this.f63167d = kVar;
            this.f63165b = kVar.f63162a.iterator();
        }

        /* renamed from: b */
        public final void mo61549b() {
            while (this.f63166c < this.f63167d.f63163b && this.f63165b.hasNext()) {
                this.f63165b.next();
                this.f63166c++;
            }
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            mo61549b();
            if (this.f63166c >= this.f63167d.f63164c || !this.f63165b.hasNext()) {
                return false;
            }
            return true;
        }

        public final T next() {
            mo61549b();
            int i = this.f63166c;
            if (i < this.f63167d.f63164c) {
                this.f63166c = i + 1;
                return this.f63165b.next();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C25006k(C25003h<? extends T> hVar, int i, int i2) {
        boolean z;
        boolean z2;
        C24362h.m61211f(hVar, "sequence");
        this.f63162a = hVar;
        this.f63163b = i;
        this.f63164c = i2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (!(i2 < i ? false : z3)) {
                    throw new IllegalArgumentException(C13715c.m34244j("endIndex should be not less than startIndex, but was ", i2, " < ", i).toString());
                }
                return;
            }
            throw new IllegalArgumentException(C16759e.m42349e("endIndex should be non-negative, but is ", i2).toString());
        }
        throw new IllegalArgumentException(C16759e.m42349e("startIndex should be non-negative, but is ", i).toString());
    }

    /* renamed from: a */
    public final C25003h mo61539a() {
        int i = this.f63164c;
        int i2 = this.f63163b;
        if (1 >= i - i2) {
            return C24996d.f63140a;
        }
        return new C25006k(this.f63162a, i2 + 1, i);
    }

    /* renamed from: b */
    public final C25003h<T> mo61540b(int i) {
        int i2 = this.f63164c;
        int i3 = this.f63163b;
        if (i >= i2 - i3) {
            return this;
        }
        return new C25006k(this.f63162a, i3, i + i3);
    }

    public final java.util.Iterator<T> iterator() {
        return new C25007a(this);
    }
}
