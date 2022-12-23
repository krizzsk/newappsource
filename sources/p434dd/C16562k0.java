package p434dd;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: dd.k0 */
public class C16562k0 extends Binder implements IInterface {
    public C16562k0(String str) {
        attachInterface(this, str);
    }

    /* renamed from: G */
    public boolean mo49339G(int i, Parcel parcel) throws RemoteException {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo49339G(i, parcel);
    }
}
