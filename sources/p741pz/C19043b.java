package p741pz;

import android.content.Context;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import p669mz.C18482c;

/* renamed from: pz.b */
public abstract class C19043b<T> extends C19042a<T> {

    /* renamed from: a */
    public final Context f48431a;

    /* renamed from: b */
    public C18482c<T> f48432b = null;

    public C19043b(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f48431a = context;
    }

    /* renamed from: e */
    public final boolean mo51502e() {
        return this.f48432b != null;
    }

    /* renamed from: f */
    public final void mo51503f(ArrayList arrayList) {
        if (!mo51502e()) {
            this.f48432b = new C18482c<>(arrayList);
            return;
        }
        throw new IllegalStateException("Store already initialized");
    }
}
