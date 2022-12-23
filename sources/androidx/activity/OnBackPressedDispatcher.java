package androidx.activity;

import android.annotation.SuppressLint;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f504a;

    /* renamed from: b */
    public final ArrayDeque<C0201i> f505b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements C1025n, C0193a {

        /* renamed from: b */
        public final Lifecycle f506b;

        /* renamed from: c */
        public final C0201i f507c;

        /* renamed from: d */
        public C0192a f508d;

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, FragmentManager.C0886b bVar) {
            this.f506b = lifecycle;
            this.f507c = bVar;
            lifecycle.mo4224a(this);
        }

        public final void cancel() {
            this.f506b.mo4226c(this);
            this.f507c.f527b.remove(this);
            C0192a aVar = this.f508d;
            if (aVar != null) {
                aVar.cancel();
                this.f508d = null;
            }
        }

        /* renamed from: f */
        public final void mo740f(C1033p pVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                C0201i iVar = this.f507c;
                onBackPressedDispatcher.f505b.add(iVar);
                C0192a aVar = new C0192a(iVar);
                iVar.f527b.add(aVar);
                this.f508d = aVar;
            } else if (event == Lifecycle.Event.ON_STOP) {
                C0192a aVar2 = this.f508d;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0192a implements C0193a {

        /* renamed from: b */
        public final C0201i f510b;

        public C0192a(C0201i iVar) {
            this.f510b = iVar;
        }

        public final void cancel() {
            OnBackPressedDispatcher.this.f505b.remove(this.f510b);
            this.f510b.f527b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f504a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public final void mo743a(C1033p pVar, FragmentManager.C0886b bVar) {
        Lifecycle lifecycle = pVar.getLifecycle();
        if (lifecycle.mo4225b() != Lifecycle.State.DESTROYED) {
            bVar.f527b.add(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    /* renamed from: b */
    public final void mo744b() {
        Iterator<C0201i> descendingIterator = this.f505b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0201i next = descendingIterator.next();
            if (next.f526a) {
                next.mo761a();
                return;
            }
        }
        Runnable runnable = this.f504a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
