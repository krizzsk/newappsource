package p198o9;

import android.view.ViewGroup;
import com.vungle.warren.C23231u1;
import java.lang.ref.WeakReference;
import kd0.C23757c;

/* renamed from: o9.a */
public final class C6012a {

    /* renamed from: a */
    public final WeakReference<C23757c> f19210a;

    /* renamed from: b */
    public C23231u1 f19211b;

    public C6012a(C23757c cVar) {
        this.f19210a = new WeakReference<>(cVar);
    }

    /* renamed from: a */
    public final void mo22016a() {
        C23231u1 u1Var = this.f19211b;
        if (u1Var != null && u1Var.getParent() != null) {
            ((ViewGroup) this.f19211b.getParent()).removeView(this.f19211b);
        }
    }
}
