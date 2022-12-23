package com.moovit.app.useraccount.campaigns;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p358af.C13437d;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class Campaign implements Parcelable {
    public static final Parcelable.Creator<Campaign> CREATOR = new C15588a();

    /* renamed from: d */
    public static final C15589b f40552d = new C15589b(Campaign.class);

    /* renamed from: b */
    public int f40553b;

    /* renamed from: c */
    public String f40554c;

    /* renamed from: com.moovit.app.useraccount.campaigns.Campaign$a */
    public class C15588a implements Parcelable.Creator<Campaign> {
        public final Object createFromParcel(Parcel parcel) {
            return (Campaign) C19612n.m46981v(parcel, Campaign.f40552d);
        }

        public final Object[] newArray(int i) {
            return new Campaign[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.campaigns.Campaign$b */
    public class C15589b extends C19619s<Campaign> {
        public C15589b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new Campaign(pVar.mo51924l(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Campaign campaign = (Campaign) obj;
            qVar.mo51939l(campaign.f40553b);
            qVar.mo51954p(campaign.f40554c);
        }
    }

    public Campaign(int i, String str) {
        this.f40553b = i;
        C21100e.m49373x(str, "htmlData");
        this.f40554c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Campaign) && this.f40553b == ((Campaign) obj).f40553b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40553b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40553b);
        sb.append(" (id=");
        return C13437d.m33707l(sb, this.f40553b, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40552d);
    }
}
