package com.moovit.app.useraccount.manager.profile;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class UserWondoData implements Parcelable {
    public static final Parcelable.Creator<UserWondoData> CREATOR = new C15624a();

    /* renamed from: c */
    public static C15625b f40614c = new C15625b(UserWondoData.class);

    /* renamed from: b */
    public final boolean f40615b;

    /* renamed from: com.moovit.app.useraccount.manager.profile.UserWondoData$a */
    public class C15624a implements Parcelable.Creator<UserWondoData> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserWondoData) C19612n.m46981v(parcel, UserWondoData.f40614c);
        }

        public final Object[] newArray(int i) {
            return new UserWondoData[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.profile.UserWondoData$b */
    public class C15625b extends C19619s<UserWondoData> {
        public C15625b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new UserWondoData(pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51934b(((UserWondoData) obj).f40615b);
        }
    }

    public UserWondoData(boolean z) {
        this.f40615b = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40614c);
    }
}
