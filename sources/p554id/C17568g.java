package p554id;

import com.google.android.play.core.assetpacks.C14330w;
import java.util.concurrent.Executor;

/* renamed from: id.g */
public final class C17568g implements C17571j {

    /* renamed from: a */
    public final Executor f45184a;

    /* renamed from: b */
    public final Object f45185b = new Object();

    /* renamed from: c */
    public final C17562a f45186c;

    public C17568g(Executor executor, C17562a aVar) {
        this.f45184a = executor;
        this.f45186c = aVar;
    }

    /* renamed from: a */
    public final void mo50020a(C17576o oVar) {
        if (!oVar.mo50028a()) {
            synchronized (this.f45185b) {
                if (this.f45186c != null) {
                    this.f45184a.execute(new C14330w(this, oVar));
                }
            }
        }
    }
}
