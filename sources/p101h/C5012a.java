package p101h;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: h.a */
public interface C5012a extends IInterface {

    /* renamed from: h.a$a */
    public static abstract class C5013a extends Binder implements C5012a {

        /* renamed from: b */
        public static final /* synthetic */ int f16978b = 0;

        /* renamed from: h.a$a$a */
        public static class C5014a implements C5012a {

            /* renamed from: b */
            public IBinder f16979b;

            public C5014a(IBinder iBinder) {
                this.f16979b = iBinder;
            }

            public final IBinder asBinder() {
                return this.f16979b;
            }

            public final String getId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.ads.identifier.provider.IAdvertisingIdService");
                    this.f16979b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final boolean mo20726p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.ads.identifier.provider.IAdvertisingIdService");
                    boolean z = false;
                    this.f16979b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    String getId() throws RemoteException;

    /* renamed from: p */
    boolean mo20726p() throws RemoteException;
}
