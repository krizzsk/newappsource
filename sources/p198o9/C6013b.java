package p198o9;

import com.vungle.warren.C23135f0;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;
import kd0.C23757c;
import kd0.C23759d;

/* renamed from: o9.b */
public final class C6013b implements C23135f0 {

    /* renamed from: a */
    public final WeakReference<C23757c> f19212a;

    /* renamed from: b */
    public final WeakReference<C23135f0> f19213b;

    /* renamed from: c */
    public final C6012a f19214c;

    public C6013b(C23757c cVar, C23757c cVar2, C6012a aVar) {
        this.f19213b = new WeakReference<>(cVar);
        this.f19212a = new WeakReference<>(cVar2);
        this.f19214c = aVar;
    }

    public final void creativeId(String str) {
    }

    public final void onAdClick(String str) {
        C23135f0 f0Var = this.f19213b.get();
        C23757c cVar = this.f19212a.get();
        if (f0Var != null && cVar != null && cVar.f60022i) {
            f0Var.onAdClick(str);
        }
    }

    public final void onAdEnd(String str) {
        C23135f0 f0Var = this.f19213b.get();
        C23757c cVar = this.f19212a.get();
        if (f0Var != null && cVar != null && cVar.f60022i) {
            f0Var.onAdEnd(str);
        }
    }

    @Deprecated
    public final void onAdEnd(String str, boolean z, boolean z2) {
    }

    public final void onAdLeftApplication(String str) {
        C23135f0 f0Var = this.f19213b.get();
        C23757c cVar = this.f19212a.get();
        if (f0Var != null && cVar != null && cVar.f60022i) {
            f0Var.onAdLeftApplication(str);
        }
    }

    public final void onAdRewarded(String str) {
        C23135f0 f0Var = this.f19213b.get();
        C23757c cVar = this.f19212a.get();
        if (f0Var != null && cVar != null && cVar.f60022i) {
            f0Var.onAdRewarded(str);
        }
    }

    public final void onAdStart(String str) {
        C23135f0 f0Var = this.f19213b.get();
        C23757c cVar = this.f19212a.get();
        if (f0Var != null && cVar != null && cVar.f60022i) {
            f0Var.onAdStart(str);
        }
    }

    public final void onAdViewed(String str) {
    }

    public final void onError(String str, VungleException vungleException) {
        C23759d.m58339b().mo59003c(str, this.f19214c);
        C23135f0 f0Var = this.f19213b.get();
        C23757c cVar = this.f19212a.get();
        if (f0Var != null && cVar != null && cVar.f60022i) {
            f0Var.onError(str, vungleException);
        }
    }
}
