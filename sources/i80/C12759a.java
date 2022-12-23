package i80;

import android.content.Context;
import ce0.C21100e;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import p664mu.C18436b;

/* renamed from: i80.a */
public final class C12759a<R> implements Continuation<R, R> {

    /* renamed from: b */
    public final Context f31525b;

    /* renamed from: c */
    public final Callable<R> f31526c;

    public C12759a(Context context, C18436b bVar) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f31525b = context.getApplicationContext();
        this.f31526c = bVar;
    }

    public final R then(Task<R> task) throws Exception {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        Exception exception = task.getException();
        if (exception instanceof SSLException) {
            Context context = this.f31525b;
            C21100e.m49355o();
            ProviderInstaller.installIfNeeded(context.getApplicationContext());
            return this.f31526c.call();
        } else if (exception != null) {
            throw exception;
        } else {
            throw new RuntimeException("Failed to perform SSLExceptionRetryContinuation");
        }
    }
}
