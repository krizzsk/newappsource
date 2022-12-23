package android.support.p015v4.p016os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p015v4.p016os.ResultReceiver;

/* renamed from: android.support.v4.os.a */
public interface C0183a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    public static abstract class C0184a extends Binder implements C0183a {

        /* renamed from: b */
        public static final /* synthetic */ int f490b = 0;

        /* renamed from: android.support.v4.os.a$a$a */
        public static class C0185a implements C0183a {

            /* renamed from: b */
            public IBinder f491b;

            public C0185a(IBinder iBinder) {
                this.f491b = iBinder;
            }

            public final IBinder asBinder() {
                return this.f491b;
            }

            /* renamed from: k */
            public final void mo620k(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f491b.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0184a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Object obj;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                ((ResultReceiver.C0182b) this).mo620k(readInt, (Bundle) obj);
                return true;
            }
        }
    }

    /* renamed from: k */
    void mo620k(int i, Bundle bundle) throws RemoteException;
}
