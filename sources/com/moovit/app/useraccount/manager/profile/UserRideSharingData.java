package com.moovit.app.useraccount.manager.profile;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class UserRideSharingData implements Parcelable {
    public static final Parcelable.Creator<UserRideSharingData> CREATOR = new C15620a();

    /* renamed from: c */
    public static C15621b f40610c = new C15621b(UserRideSharingData.class);

    /* renamed from: b */
    public final boolean f40611b;

    /* renamed from: com.moovit.app.useraccount.manager.profile.UserRideSharingData$a */
    public class C15620a implements Parcelable.Creator<UserRideSharingData> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserRideSharingData) C19612n.m46981v(parcel, UserRideSharingData.f40610c);
        }

        public final Object[] newArray(int i) {
            return new UserRideSharingData[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.profile.UserRideSharingData$b */
    public class C15621b extends C19619s<UserRideSharingData> {
        public C15621b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new UserRideSharingData(pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51934b(((UserRideSharingData) obj).f40611b);
        }
    }

    public UserRideSharingData(boolean z) {
        this.f40611b = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40610c);
    }
}
