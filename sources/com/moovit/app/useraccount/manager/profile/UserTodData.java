package com.moovit.app.useraccount.manager.profile;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class UserTodData implements Parcelable {
    public static final Parcelable.Creator<UserTodData> CREATOR = new C15622a();

    /* renamed from: c */
    public static C15623b f40612c = new C15623b(UserTodData.class);

    /* renamed from: b */
    public final boolean f40613b;

    /* renamed from: com.moovit.app.useraccount.manager.profile.UserTodData$a */
    public class C15622a implements Parcelable.Creator<UserTodData> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserTodData) C19612n.m46981v(parcel, UserTodData.f40612c);
        }

        public final Object[] newArray(int i) {
            return new UserTodData[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.profile.UserTodData$b */
    public class C15623b extends C19619s<UserTodData> {
        public C15623b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new UserTodData(pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51934b(((UserTodData) obj).f40613b);
        }
    }

    public UserTodData(boolean z) {
        this.f40613b = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40612c);
    }
}
