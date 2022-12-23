package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class CarpoolRegistrationSteps implements Parcelable {
    public static final Parcelable.Creator<CarpoolRegistrationSteps> CREATOR = new C15707a();

    /* renamed from: e */
    public static final C15708b f40905e = new C15708b(CarpoolRegistrationSteps.class);

    /* renamed from: b */
    public final boolean f40906b;

    /* renamed from: c */
    public final boolean f40907c;

    /* renamed from: d */
    public final boolean f40908d;

    /* renamed from: com.moovit.carpool.CarpoolRegistrationSteps$a */
    public class C15707a implements Parcelable.Creator<CarpoolRegistrationSteps> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolRegistrationSteps) C19612n.m46981v(parcel, CarpoolRegistrationSteps.f40905e);
        }

        public final Object[] newArray(int i) {
            return new CarpoolRegistrationSteps[i];
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolRegistrationSteps$b */
    public class C15708b extends C19619s<CarpoolRegistrationSteps> {
        public C15708b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new CarpoolRegistrationSteps(pVar.mo51919b(), pVar.mo51919b(), pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CarpoolRegistrationSteps carpoolRegistrationSteps = (CarpoolRegistrationSteps) obj;
            qVar.mo51934b(carpoolRegistrationSteps.f40906b);
            qVar.mo51934b(carpoolRegistrationSteps.f40907c);
            qVar.mo51934b(carpoolRegistrationSteps.f40908d);
        }
    }

    public CarpoolRegistrationSteps(boolean z, boolean z2, boolean z3) {
        this.f40906b = z;
        this.f40907c = z2;
        this.f40908d = z3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40905e);
    }
}
