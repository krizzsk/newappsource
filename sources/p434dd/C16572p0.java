package p434dd;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: dd.p0 */
public abstract class C16572p0 extends C16562k0 implements C16574q0 {
    public C16572p0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* renamed from: G */
    public final boolean mo49339G(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            mo42766t((Bundle) C16564l0.m42065a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo42767x((Bundle) C16564l0.m42065a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
