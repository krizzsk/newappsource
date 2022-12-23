package p434dd;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: dd.x0 */
public final class C16588x0 extends C16560j0 {
    public C16588x0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void zzd(Bundle bundle) throws RemoteException {
        Parcel G = mo49332G();
        int i = C16564l0.f43221a;
        G.writeInt(1);
        bundle.writeToParcel(G, 0);
        mo49333H(3, G);
    }
}
