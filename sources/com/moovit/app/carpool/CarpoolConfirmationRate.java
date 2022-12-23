package com.moovit.app.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class CarpoolConfirmationRate implements Parcelable {
    public static final Parcelable.Creator<CarpoolConfirmationRate> CREATOR = new C14784a();

    /* renamed from: e */
    public static C14785b f37622e = new C14785b(CarpoolConfirmationRate.class);

    /* renamed from: b */
    public final int f37623b;

    /* renamed from: c */
    public final int f37624c;

    /* renamed from: d */
    public final int f37625d;

    /* renamed from: com.moovit.app.carpool.CarpoolConfirmationRate$a */
    public class C14784a implements Parcelable.Creator<CarpoolConfirmationRate> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolConfirmationRate) C19612n.m46981v(parcel, CarpoolConfirmationRate.f37622e);
        }

        public final Object[] newArray(int i) {
            return new CarpoolConfirmationRate[i];
        }
    }

    /* renamed from: com.moovit.app.carpool.CarpoolConfirmationRate$b */
    public class C14785b extends C19619s<CarpoolConfirmationRate> {
        public C14785b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new CarpoolConfirmationRate(pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CarpoolConfirmationRate carpoolConfirmationRate = (CarpoolConfirmationRate) obj;
            qVar.mo51939l(carpoolConfirmationRate.f37623b);
            qVar.mo51939l(carpoolConfirmationRate.f37624c);
            qVar.mo51939l(carpoolConfirmationRate.f37625d);
        }
    }

    public CarpoolConfirmationRate(int i, int i2, int i3) {
        this.f37623b = i;
        this.f37624c = i2;
        this.f37625d = i3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37622e);
    }
}
