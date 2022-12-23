package p315xb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p224q9.C6215a;
import p224q9.C6216b;
import p224q9.C6217c;

/* renamed from: xb.a */
public interface C7193a extends IInterface {

    /* renamed from: xb.a$a */
    public static abstract class C7194a extends C6216b implements C7193a {

        /* renamed from: b */
        public static final /* synthetic */ int f22322b = 0;

        /* renamed from: xb.a$a$a */
        public static class C7195a extends C6215a implements C7193a {
            public C7195a(IBinder iBinder) {
                super(iBinder);
            }

            /* renamed from: d */
            public final Bundle mo23498d(Bundle bundle) throws RemoteException {
                Parcelable parcelable;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i = C6217c.f19632a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                obtain = Parcel.obtain();
                try {
                    this.f19631b.transact(1, obtain, obtain, 0);
                    obtain.readException();
                    obtain.recycle();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    if (obtain.readInt() == 0) {
                        parcelable = null;
                    } else {
                        parcelable = (Parcelable) creator.createFromParcel(obtain);
                    }
                    return (Bundle) parcelable;
                } catch (RuntimeException e) {
                    throw e;
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: d */
    Bundle mo23498d(Bundle bundle) throws RemoteException;
}
