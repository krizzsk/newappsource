package bi0;

import bi0.C21082t;
import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.C24185c;
import mf0.C24362h;

/* renamed from: bi0.s */
public class C21081s<T extends C21082t & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    public T[] f52896a;

    /* renamed from: a */
    public final void mo53231a(C24185c.C24188c cVar) {
        cVar.mo53237a((C24185c.C24189d) this);
        T[] tArr = this.f52896a;
        if (tArr == null) {
            tArr = new C21082t[4];
            this.f52896a = tArr;
        } else if (this._size >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            C24362h.m61210e(copyOf, "copyOf(this, newSize)");
            tArr = (C21082t[]) copyOf;
            this.f52896a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = cVar;
        cVar.f61431c = i;
        mo53235e(i);
    }

    /* renamed from: b */
    public final boolean mo53232b() {
        return this._size == 0;
    }

    /* renamed from: c */
    public final T mo53233c(int i) {
        T[] tArr = this.f52896a;
        C24362h.m61208c(tArr);
        this._size--;
        if (i < this._size) {
            mo53236f(i, this._size);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C24362h.m61208c(t);
                T t2 = tArr[i2];
                C24362h.m61208c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    mo53236f(i, i2);
                    mo53235e(i2);
                }
            }
            while (true) {
                int i3 = (i * 2) + 1;
                if (i3 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f52896a;
                C24362h.m61208c(tArr2);
                int i4 = i3 + 1;
                if (i4 < this._size) {
                    T t3 = tArr2[i4];
                    C24362h.m61208c(t3);
                    T t4 = tArr2[i3];
                    C24362h.m61208c(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i3 = i4;
                    }
                }
                T t5 = tArr2[i];
                C24362h.m61208c(t5);
                T t6 = tArr2[i3];
                C24362h.m61208c(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                mo53236f(i, i3);
                i = i3;
            }
        }
        T t7 = tArr[this._size];
        C24362h.m61208c(t7);
        t7.mo53237a((C24185c.C24189d) null);
        t7.setIndex(-1);
        tArr[this._size] = null;
        return t7;
    }

    /* renamed from: d */
    public final T mo53234d() {
        T t;
        synchronized (this) {
            if (this._size > 0) {
                t = mo53233c(0);
            } else {
                t = null;
            }
        }
        return t;
    }

    /* renamed from: e */
    public final void mo53235e(int i) {
        while (i > 0) {
            T[] tArr = this.f52896a;
            C24362h.m61208c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C24362h.m61208c(t);
            T t2 = tArr[i];
            C24362h.m61208c(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                mo53236f(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo53236f(int i, int i2) {
        T[] tArr = this.f52896a;
        C24362h.m61208c(tArr);
        T t = tArr[i2];
        C24362h.m61208c(t);
        T t2 = tArr[i];
        C24362h.m61208c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
