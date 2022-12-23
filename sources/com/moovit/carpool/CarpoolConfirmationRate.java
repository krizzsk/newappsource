package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class CarpoolConfirmationRate implements Parcelable {
    public static final Parcelable.Creator<CarpoolConfirmationRate> CREATOR = new C15698a();

    /* renamed from: e */
    public static C15699b f40870e = new C15699b(CarpoolConfirmationRate.class);

    /* renamed from: b */
    public final int f40871b;

    /* renamed from: c */
    public final int f40872c;

    /* renamed from: d */
    public final int f40873d;

    /* renamed from: com.moovit.carpool.CarpoolConfirmationRate$a */
    public class C15698a implements Parcelable.Creator<CarpoolConfirmationRate> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolConfirmationRate) C19612n.m46981v(parcel, CarpoolConfirmationRate.f40870e);
        }

        public final Object[] newArray(int i) {
            return new CarpoolConfirmationRate[i];
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolConfirmationRate$b */
    public class C15699b extends C19619s<CarpoolConfirmationRate> {
        public C15699b(Class cls) {
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
            qVar.mo51939l(carpoolConfirmationRate.f40871b);
            qVar.mo51939l(carpoolConfirmationRate.f40872c);
            qVar.mo51939l(carpoolConfirmationRate.f40873d);
        }
    }

    public CarpoolConfirmationRate(int i, int i2, int i3) {
        this.f40871b = i;
        this.f40872c = i2;
        this.f40873d = i3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40870e);
    }
}
