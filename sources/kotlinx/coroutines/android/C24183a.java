package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import bi0.C21073k;
import ci0.C21207b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import mf0.C24361g;
import mf0.C24362h;
import wh0.C25179g1;
import wh0.C25184i0;
import wh0.C25188j1;
import wh0.C25190k0;
import wh0.C25192l;
import xh0.C25272b;
import xh0.C25273c;
import xh0.C25274d;

/* renamed from: kotlinx.coroutines.android.a */
public final class C24183a extends C25274d {
    private volatile C24183a _immediate;

    /* renamed from: d */
    public final Handler f61419d;

    /* renamed from: e */
    public final String f61420e;

    /* renamed from: f */
    public final boolean f61421f;

    /* renamed from: g */
    public final C24183a f61422g;

    public C24183a(Handler handler, String str, boolean z) {
        this.f61419d = handler;
        this.f61420e = str;
        this.f61421f = z;
        this._immediate = z ? this : null;
        C24183a aVar = this._immediate;
        if (aVar == null) {
            aVar = new C24183a(handler, str, true);
            this._immediate = aVar;
        }
        this.f61422g = aVar;
    }

    /* renamed from: A */
    public final void mo60297A(CoroutineContext coroutineContext, Runnable runnable) {
        C24361g.m61172l(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C25184i0.f63460b.mo4335k(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C24183a) && ((C24183a) obj).f61419d == this.f61419d;
    }

    /* renamed from: f */
    public final void mo53203f(long j, C25192l lVar) {
        C25273c cVar = new C25273c(lVar, this);
        Handler handler = this.f61419d;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(cVar, j)) {
            lVar.mo61821f(new HandlerContext$scheduleResumeAfterDelay$1(this, cVar));
        } else {
            mo60297A(lVar.f63467f, cVar);
        }
    }

    /* renamed from: g */
    public final C25190k0 mo53204g(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Handler handler = this.f61419d;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new C25272b(this, runnable);
        }
        mo60297A(coroutineContext, runnable);
        return C25188j1.f63463b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f61419d);
    }

    /* renamed from: k */
    public final void mo4335k(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.f61419d.post(runnable)) {
            mo60297A(coroutineContext, runnable);
        }
    }

    public final String toString() {
        String str;
        C25179g1 g1Var;
        C21207b bVar = C25184i0.f63459a;
        C25179g1 g1Var2 = C21073k.f52890a;
        if (this == g1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                g1Var = g1Var2.mo60300z();
            } catch (UnsupportedOperationException unused) {
                g1Var = null;
            }
            if (this == g1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f61420e;
        if (str2 == null) {
            str2 = this.f61419d.toString();
        }
        if (this.f61421f) {
            return C25541a.m63881k(str2, ".immediate");
        }
        return str2;
    }

    /* renamed from: x */
    public final boolean mo4336x(CoroutineContext coroutineContext) {
        return !this.f61421f || !C24362h.m61206a(Looper.myLooper(), this.f61419d.getLooper());
    }

    /* renamed from: z */
    public final C25179g1 mo60300z() {
        return this.f61422g;
    }

    public C24183a(Handler handler) {
        this(handler, (String) null, false);
    }
}
