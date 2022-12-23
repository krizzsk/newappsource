package p565io.reactivex.internal.operators.observable;

import com.google.android.play.core.appupdate.C14226d;
import je0.C23711d;
import je0.C23712e;
import ke0.C23763b;
import le0.C24224b;
import p565io.reactivex.internal.disposables.DisposableHelper;
import p565io.reactivex.internal.observers.BasicIntQueueDisposable;
import pe0.C24688a;
import pe0.C24689b;
import re0.C24794a;
import re0.C24797c;
import se0.C24853a;
import te0.C24956e;
import ve0.C25088a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableObserveOn */
public final class ObservableObserveOn<T> extends C24794a<T, T> {

    /* renamed from: c */
    public final C23712e f59883c;

    /* renamed from: d */
    public final boolean f59884d = false;

    /* renamed from: e */
    public final int f59885e;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableObserveOn$ObserveOnObserver */
    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements C23711d<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        public final int bufferSize;
        public final boolean delayError;
        public volatile boolean disposed;
        public volatile boolean done;
        public final C23711d<? super T> downstream;
        public Throwable error;
        public boolean outputFused;
        public C24689b<T> queue;
        public int sourceMode;
        public C24224b upstream;
        public final C23712e.C23714b worker;

        public ObserveOnObserver(C23711d<? super T> dVar, C23712e.C23714b bVar, boolean z, int i) {
            this.downstream = dVar;
            this.worker = bVar;
            this.delayError = z;
            this.bufferSize = i;
        }

        /* renamed from: a */
        public final boolean mo58914a(boolean z, boolean z2, C23711d<? super T> dVar) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (this.delayError) {
                    if (!z2) {
                        return false;
                    }
                    this.disposed = true;
                    if (th != null) {
                        dVar.onError(th);
                    } else {
                        dVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                } else if (th != null) {
                    this.disposed = true;
                    this.queue.clear();
                    dVar.onError(th);
                    this.worker.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.disposed = true;
                    dVar.onComplete();
                    this.worker.dispose();
                    return true;
                }
            }
        }

        /* renamed from: b */
        public final void mo58910b(C24224b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof C24688a) {
                    C24688a aVar = (C24688a) bVar;
                    int requestFusion = aVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = aVar;
                        this.done = true;
                        this.downstream.mo58910b(this);
                        if (getAndIncrement() == 0) {
                            this.worker.mo58931b(this);
                            return;
                        }
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = aVar;
                        this.downstream.mo58910b(this);
                        return;
                    }
                }
                this.queue = new C24853a(this.bufferSize);
                this.downstream.mo58910b(this);
            }
        }

        public final void clear() {
            this.queue.clear();
        }

        public final void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.dispose();
                this.worker.dispose();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* renamed from: e */
        public final void mo58911e(T t) {
            if (!this.done) {
                if (this.sourceMode != 2) {
                    this.queue.offer(t);
                }
                if (getAndIncrement() == 0) {
                    this.worker.mo58931b(this);
                }
            }
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                if (getAndIncrement() == 0) {
                    this.worker.mo58931b(this);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                C25088a.m62857b(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (getAndIncrement() == 0) {
                this.worker.mo58931b(this);
            }
        }

        public final T poll() throws Exception {
            return this.queue.poll();
        }

        public final int requestFusion(int i) {
            this.outputFused = true;
            return 2;
        }

        public final void run() {
            boolean z;
            if (this.outputFused) {
                int i = 1;
                while (!this.disposed) {
                    boolean z2 = this.done;
                    Throwable th = this.error;
                    if (this.delayError || !z2 || th == null) {
                        this.downstream.mo58911e(null);
                        if (z2) {
                            this.disposed = true;
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                this.downstream.onError(th2);
                            } else {
                                this.downstream.onComplete();
                            }
                            this.worker.dispose();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        this.disposed = true;
                        this.downstream.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                }
                return;
            }
            C24689b<T> bVar = this.queue;
            C23711d<? super T> dVar = this.downstream;
            int i2 = 1;
            while (!mo58914a(this.done, bVar.isEmpty(), dVar)) {
                while (true) {
                    boolean z3 = this.done;
                    try {
                        T poll = bVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo58914a(z3, z, dVar)) {
                            if (z) {
                                i2 = addAndGet(-i2);
                                if (i2 == 0) {
                                    return;
                                }
                            } else {
                                dVar.mo58911e(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th3) {
                        C14226d.m35340G0(th3);
                        this.disposed = true;
                        this.upstream.dispose();
                        bVar.clear();
                        dVar.onError(th3);
                        this.worker.dispose();
                        return;
                    }
                }
            }
        }
    }

    public ObservableObserveOn(C24797c cVar, C23763b bVar, int i) {
        super(cVar);
        this.f59883c = bVar;
        this.f59885e = i;
    }

    /* renamed from: v */
    public final void mo53556v(C23711d<? super T> dVar) {
        C23712e eVar = this.f59883c;
        if (eVar instanceof C24956e) {
            this.f62716b.mo53555u(dVar);
            return;
        }
        this.f62716b.mo53555u(new ObserveOnObserver(dVar, eVar.mo58928a(), this.f59884d, this.f59885e));
    }
}
