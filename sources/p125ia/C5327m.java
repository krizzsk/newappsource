package p125ia;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: ia.m */
public final /* synthetic */ class C5327m implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Handler f17548b;

    public /* synthetic */ C5327m(Handler handler) {
        this.f17548b = handler;
    }

    public final void execute(Runnable runnable) {
        this.f17548b.post(runnable);
    }
}
