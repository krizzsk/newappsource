package p031c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: c.a */
public interface C1748a extends IInterface {

    /* renamed from: c.a$a */
    public static abstract class C1749a extends Binder implements C1748a {

        /* renamed from: b */
        public static final /* synthetic */ int f6139b = 0;

        /* renamed from: c.a$a$a */
        public static class C1750a implements C1748a {

            /* renamed from: b */
            public IBinder f6140b;

            public C1750a(IBinder iBinder) {
                this.f6140b = iBinder;
            }

            /* renamed from: D */
            public final void mo6508D(int i, Notification notification, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6140b.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f6140b;
            }
        }
    }

    /* renamed from: D */
    void mo6508D(int i, Notification notification, String str, String str2) throws RemoteException;
}
