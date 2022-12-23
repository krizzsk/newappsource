package p741pz;

import android.os.AsyncTask;
import p304x.C7082o;

/* renamed from: pz.a */
public abstract class C19042a<T> {
    /* renamed from: a */
    public final void mo51498a() {
        AsyncTask.execute(new C7082o(this, 16));
    }

    /* renamed from: b */
    public final void mo51499b() {
        if (!mo51502e()) {
            throw new IllegalStateException("Attempting to use a store that has not been initialized");
        }
    }

    /* renamed from: c */
    public abstract boolean mo51500c();

    /* renamed from: d */
    public abstract boolean mo51501d();

    /* renamed from: e */
    public abstract boolean mo51502e();
}
