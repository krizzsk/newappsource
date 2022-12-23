package p565io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import je0.C23711d;
import le0.C24224b;
import ve0.C25088a;
import xe0.C25248a;

/* renamed from: io.reactivex.subjects.PublishSubject */
public final class PublishSubject<T> extends C25248a<T> {

    /* renamed from: d */
    public static final PublishDisposable[] f59915d = new PublishDisposable[0];

    /* renamed from: e */
    public static final PublishDisposable[] f59916e = new PublishDisposable[0];

    /* renamed from: b */
    public final AtomicReference<PublishDisposable<T>[]> f59917b = new AtomicReference<>(f59916e);

    /* renamed from: c */
    public Throwable f59918c;

    /* renamed from: io.reactivex.subjects.PublishSubject$PublishDisposable */
    public static final class PublishDisposable<T> extends AtomicBoolean implements C24224b {
        private static final long serialVersionUID = 3562861878281475070L;
        public final C23711d<? super T> downstream;
        public final PublishSubject<T> parent;

        public PublishDisposable(C23711d<? super T> dVar, PublishSubject<T> publishSubject) {
            this.downstream = dVar;
            this.parent = publishSubject;
        }

        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.mo58933w(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo58910b(C24224b bVar) {
        if (this.f59917b.get() == f59915d) {
            bVar.dispose();
        }
    }

    /* renamed from: e */
    public final void mo58911e(T t) {
        if (t != null) {
            for (PublishDisposable publishDisposable : (PublishDisposable[]) this.f59917b.get()) {
                if (!publishDisposable.get()) {
                    publishDisposable.downstream.mo58911e(t);
                }
            }
            return;
        }
        throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    public final void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.f59917b.get();
        PublishDisposable<T>[] publishDisposableArr2 = f59915d;
        if (publishDisposableArr != publishDisposableArr2) {
            for (PublishDisposable publishDisposable : (PublishDisposable[]) this.f59917b.getAndSet(publishDisposableArr2)) {
                if (!publishDisposable.get()) {
                    publishDisposable.downstream.onComplete();
                }
            }
        }
    }

    public final void onError(Throwable th) {
        if (th != null) {
            PublishDisposable<T>[] publishDisposableArr = this.f59917b.get();
            PublishDisposable<T>[] publishDisposableArr2 = f59915d;
            if (publishDisposableArr == publishDisposableArr2) {
                C25088a.m62857b(th);
                return;
            }
            this.f59918c = th;
            for (PublishDisposable publishDisposable : (PublishDisposable[]) this.f59917b.getAndSet(publishDisposableArr2)) {
                if (publishDisposable.get()) {
                    C25088a.m62857b(th);
                } else {
                    publishDisposable.downstream.onError(th);
                }
            }
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    /* renamed from: v */
    public final void mo53556v(C23711d<? super T> dVar) {
        boolean z;
        PublishDisposable publishDisposable = new PublishDisposable(dVar, this);
        dVar.mo58910b(publishDisposable);
        while (true) {
            PublishDisposable<T>[] publishDisposableArr = (PublishDisposable[]) this.f59917b.get();
            z = false;
            if (publishDisposableArr != f59915d) {
                int length = publishDisposableArr.length;
                PublishDisposable[] publishDisposableArr2 = new PublishDisposable[(length + 1)];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
                publishDisposableArr2[length] = publishDisposable;
                AtomicReference<PublishDisposable<T>[]> atomicReference = this.f59917b;
                while (true) {
                    if (!atomicReference.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                        if (atomicReference.get() != publishDisposableArr) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
                if (z) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.f59918c;
            if (th != null) {
                dVar.onError(th);
            } else {
                dVar.onComplete();
            }
        } else if (publishDisposable.get()) {
            mo58933w(publishDisposable);
        }
    }

    /* renamed from: w */
    public final void mo58933w(PublishDisposable<T> publishDisposable) {
        boolean z;
        PublishDisposable[] publishDisposableArr;
        do {
            PublishDisposable<T>[] publishDisposableArr2 = (PublishDisposable[]) this.f59917b.get();
            if (publishDisposableArr2 != f59915d && publishDisposableArr2 != f59916e) {
                int length = publishDisposableArr2.length;
                int i = -1;
                z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (publishDisposableArr2[i2] == publishDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        publishDisposableArr = f59916e;
                    } else {
                        PublishDisposable[] publishDisposableArr3 = new PublishDisposable[(length - 1)];
                        System.arraycopy(publishDisposableArr2, 0, publishDisposableArr3, 0, i);
                        System.arraycopy(publishDisposableArr2, i + 1, publishDisposableArr3, i, (length - i) - 1);
                        publishDisposableArr = publishDisposableArr3;
                    }
                    AtomicReference<PublishDisposable<T>[]> atomicReference = this.f59917b;
                    while (true) {
                        if (!atomicReference.compareAndSet(publishDisposableArr2, publishDisposableArr)) {
                            if (atomicReference.get() != publishDisposableArr2) {
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!z);
    }
}
