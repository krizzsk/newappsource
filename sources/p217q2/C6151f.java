package p217q2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: q2.f */
public interface C6151f extends IInterface {

    /* renamed from: q2.f$a */
    public static abstract class C6152a extends Binder implements C6151f {

        /* renamed from: b */
        public static final /* synthetic */ int f19510b = 0;

        /* renamed from: q2.f$a$a */
        public static class C6153a implements C6151f {

            /* renamed from: b */
            public IBinder f19511b;

            public C6153a(IBinder iBinder) {
                this.f19511b = iBinder;
            }

            public final IBinder asBinder() {
                return this.f19511b;
            }

            /* renamed from: c */
            public final void mo22126c(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (!this.f19511b.transact(1, obtain, (Parcel) null, 1)) {
                        int i = C6152a.f19510b;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: c */
    void mo22126c(String[] strArr) throws RemoteException;
}
