package p066e0;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.C0655a;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.C1044w;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a0.C0016g;
import p304x.C7041e;

/* renamed from: e0.d0 */
public final class C4421d0<T> {

    /* renamed from: a */
    public final C1043v<C4423b<T>> f15490a = new C1043v<>();

    /* renamed from: b */
    public final HashMap f15491b = new HashMap();

    /* renamed from: e0.d0$a */
    public static final class C4422a<T> implements C1044w<C4423b<T>> {

        /* renamed from: a */
        public final AtomicBoolean f15492a = new AtomicBoolean(true);

        /* renamed from: b */
        public final C4429g0<? super T> f15493b;

        /* renamed from: c */
        public final Executor f15494c;

        public C4422a(Executor executor, C0655a aVar) {
            this.f15494c = executor;
            this.f15493b = aVar;
        }

        public final void onChanged(Object obj) {
            this.f15494c.execute(new C7041e(4, this, (C4423b) obj));
        }
    }

    /* renamed from: e0.d0$b */
    public static final class C4423b<T> {

        /* renamed from: a */
        public final T f15495a;

        /* renamed from: b */
        public final Throwable f15496b = null;

        public C4423b(CameraInternal.State state) {
            this.f15495a = state;
        }

        public final String toString() {
            boolean z;
            String str;
            StringBuilder k = C13555b.m33972k("[Result: <");
            if (this.f15496b == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder k2 = C13555b.m33972k("Value: ");
                k2.append(this.f15495a);
                str = k2.toString();
            } else {
                StringBuilder k3 = C13555b.m33972k("Error: ");
                k3.append(this.f15496b);
                str = k3.toString();
            }
            return C0016g.m31o(k, str, ">]");
        }
    }
}
