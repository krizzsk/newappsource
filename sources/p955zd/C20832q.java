package p955zd;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.icing.zzaa;
import com.google.android.gms.internal.icing.zzae;
import com.google.android.gms.internal.icing.zzak;
import com.google.android.gms.location.places.PlacesStatusCodes;
import com.google.android.gms.tasks.TaskCompletionSource;
import p172m9.C5720b;

/* renamed from: zd.q */
public abstract class C20832q extends TaskApiCall<zzae, Void> implements BaseImplementation.ResultHolder<Status> {

    /* renamed from: a */
    public TaskCompletionSource<Void> f52558a;

    public C20832q() {
        super((Feature[]) null, false, PlacesStatusCodes.INVALID_ARGUMENT);
    }

    public final void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f52558a = taskCompletionSource;
        C20830o oVar = (C20830o) this;
        ((zzaa) ((zzae) anyClient).getService()).zze(new zzak(oVar), oVar.f52557b);
    }

    public final void setFailedResult(Status status) {
        Preconditions.checkArgument(!status.isSuccess(), "Failed result must not be success.");
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        this.f52558a.setException(C5720b.m14042J(status, statusMessage));
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        Status status = (Status) obj;
        if (status.isSuccess()) {
            this.f52558a.setResult(null);
        } else {
            this.f52558a.setException(C5720b.m14042J(status, "User Action indexing error, please try again."));
        }
    }
}
