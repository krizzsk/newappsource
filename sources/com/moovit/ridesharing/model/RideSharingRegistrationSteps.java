package com.moovit.ridesharing.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class RideSharingRegistrationSteps implements Parcelable {
    public static final Parcelable.Creator<RideSharingRegistrationSteps> CREATOR = new C16440a();

    /* renamed from: f */
    public static final C16441b f42976f = new C16441b(RideSharingRegistrationSteps.class);

    /* renamed from: b */
    public final boolean f42977b;

    /* renamed from: c */
    public final boolean f42978c;

    /* renamed from: d */
    public final boolean f42979d;

    /* renamed from: e */
    public final boolean f42980e;

    /* renamed from: com.moovit.ridesharing.model.RideSharingRegistrationSteps$a */
    public class C16440a implements Parcelable.Creator<RideSharingRegistrationSteps> {
        public final Object createFromParcel(Parcel parcel) {
            return (RideSharingRegistrationSteps) C19612n.m46981v(parcel, RideSharingRegistrationSteps.f42976f);
        }

        public final Object[] newArray(int i) {
            return new RideSharingRegistrationSteps[i];
        }
    }

    /* renamed from: com.moovit.ridesharing.model.RideSharingRegistrationSteps$b */
    public class C16441b extends C19619s<RideSharingRegistrationSteps> {
        public C16441b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            if (i == 1) {
                return new RideSharingRegistrationSteps(pVar.mo51919b(), pVar.mo51919b(), pVar.mo51919b(), pVar.mo51919b());
            }
            boolean b = pVar.mo51919b();
            boolean b2 = pVar.mo51919b();
            return new RideSharingRegistrationSteps(b, b2, b2, pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            RideSharingRegistrationSteps rideSharingRegistrationSteps = (RideSharingRegistrationSteps) obj;
            qVar.mo51934b(rideSharingRegistrationSteps.f42977b);
            qVar.mo51934b(rideSharingRegistrationSteps.f42978c);
            qVar.mo51934b(rideSharingRegistrationSteps.f42979d);
            qVar.mo51934b(rideSharingRegistrationSteps.f42980e);
        }
    }

    public RideSharingRegistrationSteps(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f42977b = z;
        this.f42978c = z2;
        this.f42979d = z3;
        this.f42980e = z4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42976f);
    }
}
