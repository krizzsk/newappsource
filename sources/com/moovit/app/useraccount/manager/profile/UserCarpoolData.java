package com.moovit.app.useraccount.manager.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.carpool.CarpoolCompany;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class UserCarpoolData implements Parcelable {
    public static final Parcelable.Creator<UserCarpoolData> CREATOR = new C15618a();

    /* renamed from: d */
    public static C15619b f40607d = new C15619b(UserCarpoolData.class);

    /* renamed from: b */
    public final boolean f40608b;

    /* renamed from: c */
    public final CarpoolCompany f40609c;

    /* renamed from: com.moovit.app.useraccount.manager.profile.UserCarpoolData$a */
    public class C15618a implements Parcelable.Creator<UserCarpoolData> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserCarpoolData) C19612n.m46981v(parcel, UserCarpoolData.f40607d);
        }

        public final Object[] newArray(int i) {
            return new UserCarpoolData[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.profile.UserCarpoolData$b */
    public class C15619b extends C19619s<UserCarpoolData> {
        public C15619b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new UserCarpoolData((CarpoolCompany) pVar.mo51962q(CarpoolCompany.f40867d), pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            UserCarpoolData userCarpoolData = (UserCarpoolData) obj;
            qVar.mo51934b(userCarpoolData.f40608b);
            qVar.mo51967q(userCarpoolData.f40609c, CarpoolCompany.f40867d);
        }
    }

    public UserCarpoolData(CarpoolCompany carpoolCompany, boolean z) {
        this.f40608b = z;
        this.f40609c = carpoolCompany;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40607d);
    }
}
