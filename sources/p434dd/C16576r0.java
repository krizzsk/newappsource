package p434dd;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C14282k;
import com.google.android.play.core.assetpacks.C14286l;
import com.google.android.play.core.assetpacks.C14290m;
import com.google.android.play.core.assetpacks.C14294n;
import com.google.android.play.core.assetpacks.C14298o;
import com.google.android.play.core.assetpacks.C14302p;
import com.google.android.play.core.assetpacks.C14306q;
import java.util.ArrayList;

/* renamed from: dd.r0 */
public final class C16576r0 extends C16560j0 implements C16580t0 {
    public C16576r0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* renamed from: C */
    public final void mo49349C(String str, Bundle bundle, C14294n nVar) throws RemoteException {
        Parcel G = mo49332G();
        G.writeString(str);
        int i = C16564l0.f43221a;
        G.writeInt(1);
        bundle.writeToParcel(G, 0);
        G.writeStrongBinder(nVar);
        mo49333H(10, G);
    }

    /* renamed from: F */
    public final void mo49350F(String str, Bundle bundle, Bundle bundle2, C14298o oVar) throws RemoteException {
        Parcel G = mo49332G();
        G.writeString(str);
        int i = C16564l0.f43221a;
        G.writeInt(1);
        bundle.writeToParcel(G, 0);
        G.writeInt(1);
        bundle2.writeToParcel(G, 0);
        G.writeStrongBinder(oVar);
        mo49333H(6, G);
    }

    /* renamed from: h */
    public final void mo49351h(String str, Bundle bundle, Bundle bundle2, C14286l lVar) throws RemoteException {
        Parcel G = mo49332G();
        G.writeString(str);
        int i = C16564l0.f43221a;
        G.writeInt(1);
        bundle.writeToParcel(G, 0);
        G.writeInt(1);
        bundle2.writeToParcel(G, 0);
        G.writeStrongBinder(lVar);
        mo49333H(11, G);
    }

    /* renamed from: j */
    public final void mo49352j(String str, ArrayList arrayList, Bundle bundle, C14282k kVar) throws RemoteException {
        Parcel G = mo49332G();
        G.writeString(str);
        G.writeTypedList(arrayList);
        int i = C16564l0.f43221a;
        G.writeInt(1);
        bundle.writeToParcel(G, 0);
        G.writeStrongBinder(kVar);
        mo49333H(14, G);
    }

    /* renamed from: u */
    public final void mo49353u(String str, Bundle bundle, Bundle bundle2, C14306q qVar) throws RemoteException {
        Parcel G = mo49332G();
        G.writeString(str);
        int i = C16564l0.f43221a;
        G.writeInt(1);
        bundle.writeToParcel(G, 0);
        G.writeInt(1);
        bundle2.writeToParcel(G, 0);
        G.writeStrongBinder(qVar);
        mo49333H(9, G);
    }

    /* renamed from: w */
    public final void mo49354w(String str, Bundle bundle, C14290m mVar) throws RemoteException {
        Parcel G = mo49332G();
        G.writeString(str);
        int i = C16564l0.f43221a;
        G.writeInt(1);
        bundle.writeToParcel(G, 0);
        G.writeStrongBinder(mVar);
        mo49333H(5, G);
    }

    /* renamed from: z */
    public final void mo49355z(String str, Bundle bundle, Bundle bundle2, C14302p pVar) throws RemoteException {
        Parcel G = mo49332G();
        G.writeString(str);
        int i = C16564l0.f43221a;
        G.writeInt(1);
        bundle.writeToParcel(G, 0);
        G.writeInt(1);
        bundle2.writeToParcel(G, 0);
        G.writeStrongBinder(pVar);
        mo49333H(7, G);
    }
}
