package com.moovit.payment.registration.steps.profile;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class ProfilesInstructions implements Parcelable {
    public static final Parcelable.Creator<ProfilesInstructions> CREATOR = new C16391a();

    /* renamed from: d */
    public static final C16392b f42835d = new C16392b(ProfilesInstructions.class);

    /* renamed from: b */
    public final List<PaymentProfile> f42836b;

    /* renamed from: c */
    public final int f42837c;

    /* renamed from: com.moovit.payment.registration.steps.profile.ProfilesInstructions$a */
    public class C16391a implements Parcelable.Creator<ProfilesInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (ProfilesInstructions) C19612n.m46981v(parcel, ProfilesInstructions.f42835d);
        }

        public final Object[] newArray(int i) {
            return new ProfilesInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.profile.ProfilesInstructions$b */
    public class C16392b extends C19619s<ProfilesInstructions> {
        public C16392b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ArrayList g = pVar.mo51959g(PaymentProfile.f42827i);
            int i2 = 1;
            if (i >= 1) {
                i2 = pVar.mo51924l();
            }
            return new ProfilesInstructions(g, i2);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ProfilesInstructions profilesInstructions = (ProfilesInstructions) obj;
            qVar.mo51965h(profilesInstructions.f42836b, PaymentProfile.f42827i);
            qVar.mo51939l(profilesInstructions.f42837c);
        }
    }

    public ProfilesInstructions(ArrayList arrayList, int i) {
        C21100e.m49373x(arrayList, "profiles");
        this.f42836b = Collections.unmodifiableList(arrayList);
        this.f42837c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42835d);
    }
}
