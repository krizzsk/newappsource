package android.support.p015v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p015v4.media.session.MediaControllerCompat$MediaControllerImplApi21;

/* renamed from: android.support.v4.media.session.b */
public interface C0174b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class C0175a extends Binder implements C0174b {

        /* renamed from: b */
        public static final /* synthetic */ int f483b = 0;

        /* renamed from: android.support.v4.media.session.b$a$a */
        public static class C0176a implements C0174b {

            /* renamed from: b */
            public IBinder f484b;

            public C0176a(IBinder iBinder) {
                this.f484b = iBinder;
            }

            public final IBinder asBinder() {
                return this.f484b;
            }

            /* renamed from: r */
            public final void mo604r(MediaControllerCompat$MediaControllerImplApi21.C0165a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar);
                    if (!this.f484b.transact(3, obtain, obtain2, 0)) {
                        int i = C0175a.f483b;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: G */
        public static C0174b m314G(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0174b)) {
                return new C0176a(iBinder);
            }
            return (C0174b) queryLocalInterface;
        }
    }

    /* renamed from: r */
    void mo604r(MediaControllerCompat$MediaControllerImplApi21.C0165a aVar) throws RemoteException;
}
