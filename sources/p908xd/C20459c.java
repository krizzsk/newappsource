package p908xd;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import p955zd.C20829n;

/* renamed from: xd.c */
public abstract class C20459c {

    /* renamed from: a */
    public static WeakReference<C20459c> f51827a;

    /* renamed from: a */
    public static synchronized C20459c m48080a(Context context) {
        C20459c cVar;
        synchronized (C20459c.class) {
            Preconditions.checkNotNull(context);
            WeakReference<C20459c> weakReference = f51827a;
            if (weakReference == null) {
                cVar = null;
            } else {
                cVar = weakReference.get();
            }
            if (cVar != null) {
                return cVar;
            }
            C20829n nVar = new C20829n(context.getApplicationContext());
            f51827a = new WeakReference<>(nVar);
            return nVar;
        }
    }

    /* renamed from: b */
    public abstract Task<Void> mo52649b();

    /* renamed from: c */
    public abstract Task<Void> mo52650c(C20461e... eVarArr);
}
