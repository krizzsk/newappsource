package ce0;

import com.vungle.warren.C23231u1;
import com.vungle.warren.C23258z;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;

/* renamed from: ce0.v */
public final class C21121v implements C23258z {

    /* renamed from: a */
    public WeakReference<C23258z> f52985a;

    public C21121v(C23231u1.C23233b bVar) {
        this.f52985a = new WeakReference<>(bVar);
    }

    public final void onAdLoad(String str) {
        C23258z zVar = this.f52985a.get();
        if (zVar != null) {
            zVar.onAdLoad(str);
        }
    }

    public final void onError(String str, VungleException vungleException) {
        C23258z zVar = this.f52985a.get();
        if (zVar != null) {
            zVar.onError(str, vungleException);
        }
    }
}
