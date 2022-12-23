package android.support.p015v4.p016os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p015v4.p016os.C0183a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0181a();

    /* renamed from: b */
    public C0183a f488b;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    public class C0181a implements Parcelable.Creator<ResultReceiver> {
        public final Object createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public final Object[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    public class C0182b extends C0183a.C0184a {
        public C0182b() {
        }

        /* renamed from: k */
        public final void mo620k(int i, Bundle bundle) {
            ResultReceiver.this.getClass();
            ResultReceiver.this.mo533b(i, bundle);
        }
    }

    public ResultReceiver(Parcel parcel) {
        C0183a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = C0183a.C0184a.f490b;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0183a)) {
                aVar = new C0183a.C0184a.C0185a(readStrongBinder);
            } else {
                aVar = (C0183a) queryLocalInterface;
            }
        }
        this.f488b = aVar;
    }

    /* renamed from: b */
    public void mo533b(int i, Bundle bundle) {
    }

    /* renamed from: c */
    public final void mo615c(int i, Bundle bundle) {
        C0183a aVar = this.f488b;
        if (aVar != null) {
            try {
                aVar.mo620k(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f488b == null) {
                this.f488b = new C0182b();
            }
            parcel.writeStrongBinder(this.f488b.asBinder());
        }
    }
}
