package ke0;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import je0.C23712e;
import le0.C24224b;
import p565io.reactivex.internal.disposables.EmptyDisposable;
import ve0.C25088a;

/* renamed from: ke0.b */
public final class C23763b extends C23712e {

    /* renamed from: a */
    public final Handler f60031a;

    /* renamed from: b */
    public final boolean f60032b = false;

    /* renamed from: ke0.b$a */
    public static final class C23764a extends C23712e.C23714b {

        /* renamed from: b */
        public final Handler f60033b;

        /* renamed from: c */
        public final boolean f60034c;

        /* renamed from: d */
        public volatile boolean f60035d;

        public C23764a(Handler handler, boolean z) {
            this.f60033b = handler;
            this.f60034c = z;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public final C24224b mo58930a(Runnable runnable, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f60035d) {
                return EmptyDisposable.INSTANCE;
            } else {
                Handler handler = this.f60033b;
                C23765b bVar = new C23765b(handler, runnable);
                Message obtain = Message.obtain(handler, bVar);
                obtain.obj = this;
                if (this.f60034c) {
                    obtain.setAsynchronous(true);
                }
                this.f60033b.sendMessageDelayed(obtain, timeUnit.toMillis(0));
                if (!this.f60035d) {
                    return bVar;
                }
                this.f60033b.removeCallbacks(bVar);
                return EmptyDisposable.INSTANCE;
            }
        }

        public final void dispose() {
            this.f60035d = true;
            this.f60033b.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: ke0.b$b */
    public static final class C23765b implements Runnable, C24224b {

        /* renamed from: b */
        public final Handler f60036b;

        /* renamed from: c */
        public final Runnable f60037c;

        public C23765b(Handler handler, Runnable runnable) {
            this.f60036b = handler;
            this.f60037c = runnable;
        }

        public final void dispose() {
            this.f60036b.removeCallbacks(this);
        }

        public final void run() {
            try {
                this.f60037c.run();
            } catch (Throwable th) {
                C25088a.m62857b(th);
            }
        }
    }

    public C23763b(Handler handler) {
        this.f60031a = handler;
    }

    /* renamed from: a */
    public final C23712e.C23714b mo58928a() {
        return new C23764a(this.f60031a, this.f60032b);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public final C24224b mo58929c(Runnable runnable, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            Handler handler = this.f60031a;
            C23765b bVar = new C23765b(handler, runnable);
            Message obtain = Message.obtain(handler, bVar);
            if (this.f60032b) {
                obtain.setAsynchronous(true);
            }
            this.f60031a.sendMessageDelayed(obtain, timeUnit.toMillis(0));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
