package yh0;

import bf0.C21050d;
import bi0.C21079q;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17875h;

/* renamed from: yh0.b */
public final class C25306b<E> extends AbstractChannel<E> {

    /* renamed from: e */
    public final int f63612e;

    /* renamed from: f */
    public final BufferOverflow f63613f;

    /* renamed from: g */
    public final ReentrantLock f63614g;

    /* renamed from: h */
    public Object[] f63615h;

    /* renamed from: i */
    public int f63616i;
    private volatile /* synthetic */ int size;

    /* renamed from: yh0.b$a */
    public /* synthetic */ class C25307a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63617a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f63617a = iArr;
        }
    }

    public C25306b(int i, BufferOverflow bufferOverflow, C24236l<? super E, C21050d> lVar) {
        super(lVar);
        this.f63612e = i;
        this.f63613f = bufferOverflow;
        if (i < 1 ? false : true) {
            this.f63614g = new ReentrantLock();
            int min = Math.min(i, 8);
            Object[] objArr = new Object[min];
            Arrays.fill(objArr, 0, min, C17875h.f45863g);
            this.f63615h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(C25541a.m63878h("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
    }

    /* renamed from: c */
    public final Object mo60344c(C25326r rVar) {
        ReentrantLock reentrantLock = this.f63614g;
        reentrantLock.lock();
        try {
            return super.mo60344c(rVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final String mo60345d() {
        StringBuilder k = C13555b.m33972k("(buffer:capacity=");
        k.append(this.f63612e);
        k.append(",size=");
        return C16530d.m42014g(k, this.size, ')');
    }

    /* renamed from: g */
    public final boolean mo60347g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo60348h() {
        return this.size == this.f63612e && this.f63613f == BufferOverflow.SUSPEND;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public final Object mo60349i(E e) {
        C25322n j;
        ReentrantLock reentrantLock = this.f63614g;
        reentrantLock.lock();
        int i = this.size;
        C25315g<?> e2 = mo60346e();
        if (e2 != null) {
            reentrantLock.unlock();
            return e2;
        }
        C21079q qVar = null;
        if (i < this.f63612e) {
            this.size = i + 1;
        } else {
            int i2 = C25307a.f63617a[this.f63613f.ordinal()];
            if (i2 == 1) {
                qVar = C17875h.f45865i;
            } else if (i2 == 2) {
                qVar = C17875h.f45864h;
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (qVar != null) {
            reentrantLock.unlock();
            return qVar;
        }
        if (i == 0) {
            do {
                try {
                    j = mo60322j();
                    if (j != null) {
                        if (j instanceof C25315g) {
                            this.size = i;
                            reentrantLock.unlock();
                            return j;
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } while (j.mo60334a(e) == null);
            this.size = i;
            C21050d dVar = C21050d.f52856a;
            reentrantLock.unlock();
            j.mo60335e(e);
            return j.mo61907b();
        }
        mo61900w(i, e);
        C21079q qVar2 = C17875h.f45864h;
        reentrantLock.unlock();
        return qVar2;
    }

    /* renamed from: l */
    public final boolean mo60323l(C25320l<? super E> lVar) {
        ReentrantLock reentrantLock = this.f63614g;
        reentrantLock.lock();
        try {
            return super.mo60323l(lVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m */
    public final boolean mo60324m() {
        return false;
    }

    /* renamed from: n */
    public final boolean mo60325n() {
        return this.size == 0;
    }

    /* renamed from: o */
    public final boolean mo60326o() {
        ReentrantLock reentrantLock = this.f63614g;
        reentrantLock.lock();
        try {
            return super.mo60326o();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: p */
    public final void mo60327p(boolean z) {
        C24236l<E, C21050d> lVar = this.f61444b;
        ReentrantLock reentrantLock = this.f63614g;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f63615h[this.f63616i];
                if (!(lVar == null || obj == C17875h.f45863g)) {
                    undeliveredElementException = OnUndeliveredElementKt.m60694b(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.f63615h;
                int i3 = this.f63616i;
                objArr[i3] = C17875h.f45863g;
                this.f63616i = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            C21050d dVar = C21050d.f52856a;
            reentrantLock.unlock();
            super.mo60327p(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: t */
    public final Object mo60329t() {
        ReentrantLock reentrantLock = this.f63614g;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object e = mo60346e();
                if (e == null) {
                    e = C17875h.f45866j;
                }
                return e;
            }
            Object[] objArr = this.f63615h;
            int i2 = this.f63616i;
            Object obj = objArr[i2];
            C25324p pVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C17875h.f45866j;
            boolean z = false;
            if (i == this.f63612e) {
                while (true) {
                    C25324p k = mo60350k();
                    if (k == null) {
                        break;
                    } else if (k.mo60357t() != null) {
                        obj2 = k.mo60355r();
                        pVar = k;
                        z = true;
                        break;
                    } else {
                        k.mo61910u();
                        pVar = k;
                    }
                }
            }
            if (obj2 != C17875h.f45866j && !(obj2 instanceof C25315g)) {
                this.size = i;
                Object[] objArr2 = this.f63615h;
                objArr2[(this.f63616i + i) % objArr2.length] = obj2;
            }
            this.f63616i = (this.f63616i + 1) % this.f63615h.length;
            C21050d dVar = C21050d.f52856a;
            reentrantLock.unlock();
            if (z) {
                C24362h.m61208c(pVar);
                pVar.mo60354q();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: w */
    public final void mo61900w(int i, E e) {
        int i2 = this.f63612e;
        if (i < i2) {
            Object[] objArr = this.f63615h;
            if (i >= objArr.length) {
                int min = Math.min(objArr.length * 2, i2);
                Object[] objArr2 = new Object[min];
                for (int i3 = 0; i3 < i; i3++) {
                    Object[] objArr3 = this.f63615h;
                    objArr2[i3] = objArr3[(this.f63616i + i3) % objArr3.length];
                }
                Arrays.fill(objArr2, i, min, C17875h.f45863g);
                this.f63615h = objArr2;
                this.f63616i = 0;
            }
            Object[] objArr4 = this.f63615h;
            objArr4[(this.f63616i + i) % objArr4.length] = e;
            return;
        }
        Object[] objArr5 = this.f63615h;
        int i4 = this.f63616i;
        objArr5[i4 % objArr5.length] = null;
        objArr5[(i + i4) % objArr5.length] = e;
        this.f63616i = (i4 + 1) % objArr5.length;
    }
}
