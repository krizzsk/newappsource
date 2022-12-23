package p217q2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import p217q2.C6151f;

/* renamed from: q2.g */
public abstract class C6154g extends Binder implements IInterface {
    public C6154g() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C6151f fVar = null;
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C6151f)) {
                    fVar = new C6151f.C6152a.C6153a(readStrongBinder);
                } else {
                    fVar = (C6151f) queryLocalInterface;
                }
            }
            int H = ((MultiInstanceInvalidationService.C1251b) this).mo5184H(fVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(H);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C6151f)) {
                    fVar = new C6151f.C6152a.C6153a(readStrongBinder2);
                } else {
                    fVar = (C6151f) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService.C1251b bVar = (MultiInstanceInvalidationService.C1251b) this;
            synchronized (MultiInstanceInvalidationService.this.f4704d) {
                MultiInstanceInvalidationService.this.f4704d.unregister(fVar);
                MultiInstanceInvalidationService.this.f4703c.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.C1251b) this).mo5183G(parcel.readInt(), parcel.createStringArray());
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }
}
