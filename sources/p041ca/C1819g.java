package p041ca;

import android.content.Context;
import p313x9.C7180b;
import ye0.C25292a;

/* renamed from: ca.g */
public final class C1819g implements C7180b<String> {

    /* renamed from: a */
    public final C25292a<Context> f6321a;

    public C1819g(C25292a<Context> aVar) {
        this.f6321a = aVar;
    }

    public final Object get() {
        String packageName = this.f6321a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
