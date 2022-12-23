package p434dd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: dd.j0 */
public class C16560j0 implements IInterface {

    /* renamed from: b */
    public final IBinder f43201b;

    /* renamed from: c */
    public final String f43202c;

    public C16560j0(IBinder iBinder, String str) {
        this.f43201b = iBinder;
        this.f43202c = str;
    }

    /* renamed from: G */
    public final Parcel mo49332G() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f43202c);
        return obtain;
    }

    /* renamed from: H */
    public final void mo49333H(int i, Parcel parcel) throws RemoteException {
        try {
            this.f43201b.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f43201b;
    }
}
