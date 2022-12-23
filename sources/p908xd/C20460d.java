package p908xd;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import p955zd.C20833r;

/* renamed from: xd.d */
public abstract class C20460d {

    /* renamed from: a */
    public static WeakReference<C20460d> f51828a;

    /* renamed from: b */
    public static synchronized C20460d m48083b(Context context) {
        C20460d dVar;
        synchronized (C20460d.class) {
            Preconditions.checkNotNull(context);
            WeakReference<C20460d> weakReference = f51828a;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = weakReference.get();
            }
            if (dVar != null) {
                return dVar;
            }
            C20833r rVar = new C20833r(context.getApplicationContext());
            f51828a = new WeakReference<>(rVar);
            return rVar;
        }
    }

    /* renamed from: a */
    public abstract Task<Void> mo52651a(C20458b bVar);

    /* renamed from: c */
    public abstract Task<Void> mo52652c(C20458b bVar);
}
