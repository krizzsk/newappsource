package com.moovit.app.useraccount.manager.profile;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;
import p583jk.C17884p;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19584i;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class UserAdsTargetingData implements Parcelable {
    public static final Parcelable.Creator<UserAdsTargetingData> CREATOR = new C15616a();

    /* renamed from: c */
    public static final C15617b f40605c = new C15617b(UserAdsTargetingData.class);

    /* renamed from: b */
    public final Map<String, List<String>> f40606b;

    /* renamed from: com.moovit.app.useraccount.manager.profile.UserAdsTargetingData$a */
    public class C15616a implements Parcelable.Creator<UserAdsTargetingData> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserAdsTargetingData) C19612n.m46981v(parcel, UserAdsTargetingData.f40605c);
        }

        public final Object[] newArray(int i) {
            return new UserAdsTargetingData[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.profile.UserAdsTargetingData$b */
    public class C15617b extends C19619s<UserAdsTargetingData> {
        public C15617b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19589j.C19598i iVar = C19589j.f49779k;
            return new UserAdsTargetingData(pVar.mo51961o(iVar, C19575a.m46957a(iVar, true), new C6302b()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51966o(((UserAdsTargetingData) obj).f40606b, C19584i.f49770b, new C19576b(C19600l.f49790t, true));
        }
    }

    public UserAdsTargetingData(Map<String, List<String>> map) {
        Map<String, List<String>> map2;
        if (map != null) {
            map2 = Collections.unmodifiableMap(map);
        } else {
            map2 = null;
        }
        this.f40606b = map2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdsTargetingData)) {
            return false;
        }
        return C20975x0.m49118e(this.f40606b, ((UserAdsTargetingData) obj).f40606b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f40606b);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("UserAdsTargetingData{userTags=");
        k.append(this.f40606b);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40605c);
    }
}
