package p324y8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: y8.a */
public interface C7345a extends IInterface {

    /* renamed from: y8.a$a */
    public static abstract class C7346a extends Binder implements C7345a {

        /* renamed from: b */
        public static final /* synthetic */ int f22566b = 0;

        /* renamed from: y8.a$a$a */
        public static class C7347a implements C7345a {

            /* renamed from: b */
            public IBinder f22567b;

            public C7347a(IBinder iBinder) {
                this.f22567b = iBinder;
            }

            /* renamed from: a */
            public final int mo23562a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f22567b.transact(1, obtain, obtain2, 0)) {
                        int i = C7346a.f22566b;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f22567b;
            }
        }

        /* renamed from: G */
        public static C7345a m16972G(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C7345a)) {
                return new C7347a(iBinder);
            }
            return (C7345a) queryLocalInterface;
        }
    }

    /* renamed from: a */
    int mo23562a(Bundle bundle) throws RemoteException;
}
