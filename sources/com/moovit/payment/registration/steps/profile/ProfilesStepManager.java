package com.moovit.payment.registration.steps.profile;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import w40.C25765g;

public class ProfilesStepManager implements Parcelable {
    public static final Parcelable.Creator<ProfilesStepManager> CREATOR = new C16393a();

    /* renamed from: g */
    public static final C16394b f42838g = new C16394b(ProfilesStepManager.class);

    /* renamed from: b */
    public boolean f42839b;

    /* renamed from: c */
    public boolean f42840c;

    /* renamed from: d */
    public int f42841d;

    /* renamed from: e */
    public final List<PaymentProfile> f42842e;

    /* renamed from: f */
    public final Map<ServerId, List<ProfileCertificateData>> f42843f;

    /* renamed from: com.moovit.payment.registration.steps.profile.ProfilesStepManager$a */
    public class C16393a implements Parcelable.Creator<ProfilesStepManager> {
        public final Object createFromParcel(Parcel parcel) {
            return (ProfilesStepManager) C19612n.m46981v(parcel, ProfilesStepManager.f42838g);
        }

        public final Object[] newArray(int i) {
            return new ProfilesStepManager[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.profile.ProfilesStepManager$b */
    public class C16394b extends C19619s<ProfilesStepManager> {
        public C16394b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new ProfilesStepManager(pVar.mo51919b(), pVar.mo51919b(), pVar.mo51924l(), pVar.mo51959g(PaymentProfile.f42827i), pVar.mo51961o(ServerId.f15141f, C19575a.m46957a(C25765g.f64280b, false), new C6302b()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ProfilesStepManager profilesStepManager = (ProfilesStepManager) obj;
            qVar.mo51934b(profilesStepManager.f42839b);
            qVar.mo51934b(profilesStepManager.f42840c);
            qVar.mo51939l(profilesStepManager.f42841d);
            qVar.mo51965h(profilesStepManager.f42842e, PaymentProfile.f42827i);
            qVar.mo51966o(profilesStepManager.f42843f, ServerId.f15140e, new C19576b(C25765g.f64280b, false));
        }
    }

    public ProfilesStepManager() {
        throw null;
    }

    public ProfilesStepManager(boolean z, boolean z2, int i, ArrayList arrayList, Map map) {
        this.f42839b = z;
        this.f42840c = z2;
        this.f42841d = i;
        C21100e.m49373x(arrayList, "profilesToDisplay");
        this.f42842e = arrayList;
        C21100e.m49373x(map, "certificatesByProfileId");
        this.f42843f = map;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42838g);
    }
}
