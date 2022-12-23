package p434dd;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.C14236n;
import com.google.android.play.core.appupdate.C14237o;

/* renamed from: dd.m0 */
public final class C16566m0 extends C16560j0 implements C16570o0 {
    public C16566m0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* renamed from: o */
    public final void mo49344o(String str, Bundle bundle, C14236n nVar) throws RemoteException {
        Parcel G = mo49332G();
        G.writeString(str);
        int i = C16564l0.f43221a;
        G.writeInt(1);
        bundle.writeToParcel(G, 0);
        G.writeStrongBinder(nVar);
        mo49333H(3, G);
    }

    /* renamed from: s */
    public final void mo49345s(String str, Bundle bundle, C14237o oVar) throws RemoteException {
        Parcel G = mo49332G();
        G.writeString(str);
        int i = C16564l0.f43221a;
        G.writeInt(1);
        bundle.writeToParcel(G, 0);
        G.writeStrongBinder(oVar);
        mo49333H(2, G);
    }
}
