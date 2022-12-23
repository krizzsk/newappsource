package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/model/TodSubscriptionShuttleInfo;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodSubscriptionShuttleInfo implements Parcelable {
    public static final Parcelable.Creator<TodSubscriptionShuttleInfo> CREATOR = new C15522a();

    /* renamed from: b */
    public final String f40322b;

    /* renamed from: c */
    public final String f40323c;

    /* renamed from: d */
    public final ServerId f40324d;

    /* renamed from: e */
    public final Image f40325e;

    /* renamed from: f */
    public final TodSubscriptionJourneyInfo f40326f;

    /* renamed from: g */
    public final TodSubscriptionOrderInfo f40327g;

    /* renamed from: com.moovit.app.tod.model.TodSubscriptionShuttleInfo$a */
    public static final class C15522a implements Parcelable.Creator<TodSubscriptionShuttleInfo> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TodSubscriptionShuttleInfo(parcel.readString(), parcel.readString(), (ServerId) parcel.readParcelable(TodSubscriptionShuttleInfo.class.getClassLoader()), (Image) parcel.readParcelable(TodSubscriptionShuttleInfo.class.getClassLoader()), TodSubscriptionJourneyInfo.CREATOR.createFromParcel(parcel), TodSubscriptionOrderInfo.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new TodSubscriptionShuttleInfo[i];
        }
    }

    public TodSubscriptionShuttleInfo(String str, String str2, ServerId serverId, Image image, TodSubscriptionJourneyInfo todSubscriptionJourneyInfo, TodSubscriptionOrderInfo todSubscriptionOrderInfo) {
        C24362h.m61211f(str, "patternId");
        C24362h.m61211f(str2, "patternName");
        C24362h.m61211f(serverId, "taxiProviderId");
        C24362h.m61211f(image, "taxiProviderImage");
        C24362h.m61211f(todSubscriptionJourneyInfo, "journeyInfo");
        C24362h.m61211f(todSubscriptionOrderInfo, "orderInfo");
        this.f40322b = str;
        this.f40323c = str2;
        this.f40324d = serverId;
        this.f40325e = image;
        this.f40326f = todSubscriptionJourneyInfo;
        this.f40327g = todSubscriptionOrderInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodSubscriptionShuttleInfo)) {
            return false;
        }
        TodSubscriptionShuttleInfo todSubscriptionShuttleInfo = (TodSubscriptionShuttleInfo) obj;
        return C24362h.m61206a(this.f40322b, todSubscriptionShuttleInfo.f40322b) && C24362h.m61206a(this.f40323c, todSubscriptionShuttleInfo.f40323c) && C24362h.m61206a(this.f40324d, todSubscriptionShuttleInfo.f40324d) && C24362h.m61206a(this.f40325e, todSubscriptionShuttleInfo.f40325e) && C24362h.m61206a(this.f40326f, todSubscriptionShuttleInfo.f40326f) && C24362h.m61206a(this.f40327g, todSubscriptionShuttleInfo.f40327g);
    }

    public final int hashCode() {
        String str = this.f40323c;
        int hashCode = this.f40325e.hashCode();
        int hashCode2 = this.f40326f.hashCode();
        return this.f40327g.hashCode() + ((hashCode2 + ((hashCode + ((C13715c.m34238d(str, this.f40322b.hashCode() * 31, 31) + this.f40324d.f15142b) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodSubscriptionShuttleInfo(patternId=");
        k.append(this.f40322b);
        k.append(", patternName=");
        k.append(this.f40323c);
        k.append(", taxiProviderId=");
        k.append(this.f40324d);
        k.append(", taxiProviderImage=");
        k.append(this.f40325e);
        k.append(", journeyInfo=");
        k.append(this.f40326f);
        k.append(", orderInfo=");
        k.append(this.f40327g);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f40322b);
        parcel.writeString(this.f40323c);
        parcel.writeParcelable(this.f40324d, i);
        parcel.writeParcelable(this.f40325e, i);
        this.f40326f.writeToParcel(parcel, i);
        this.f40327g.writeToParcel(parcel, i);
    }
}
