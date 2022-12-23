package p955zd;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import p172m9.C5720b;

/* renamed from: zd.j */
public final class C20825j extends IStatusCallback.Stub {

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f52546b;

    /* renamed from: c */
    public final /* synthetic */ C20826k f52547c;

    public C20825j(C20826k kVar, TaskCompletionSource taskCompletionSource) {
        this.f52547c = kVar;
        this.f52546b = taskCompletionSource;
    }

    public final void onResult(Status status) throws RemoteException {
        if (!this.f52546b.trySetResult(null)) {
            return;
        }
        if (status.isSuccess()) {
            this.f52547c.f52548a.f52550b.setResult(null);
        } else {
            this.f52547c.f52548a.f52550b.setException(C5720b.m14042J(status, "Indexing error, please try again."));
        }
    }
}
