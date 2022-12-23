package p079f1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* renamed from: f1.c */
public abstract class C4645c extends Binder implements IInterface {
    public C4645c() {
        attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C4644b bVar;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return true;
        } else if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                bVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C4644b)) {
                    bVar = new C4643a(readStrongBinder);
                } else {
                    bVar = (C4644b) queryLocalInterface;
                }
            }
            UnusedAppRestrictionsBackportService.C0773a aVar = (UnusedAppRestrictionsBackportService.C0773a) this;
            if (bVar != null) {
                UnusedAppRestrictionsBackportService.this.mo3425a();
            }
            return true;
        }
    }
}
