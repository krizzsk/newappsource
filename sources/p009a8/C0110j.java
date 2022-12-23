package p009a8;

import android.content.Context;
import java.util.concurrent.Callable;
import mf0.C24362h;

/* renamed from: a8.j */
public final /* synthetic */ class C0110j implements Callable {
    public final Object call() {
        Context context = C0115o.f339i;
        if (context != null) {
            return context.getCacheDir();
        }
        C24362h.m61217l("applicationContext");
        throw null;
    }
}
