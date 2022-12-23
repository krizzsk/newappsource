package com.cubic.umo.p045ad.types;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p001a0.C0016g;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012Jt\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKBannerResponse;", "Landroid/os/Parcelable;", "", "bannerSpotId", "Lcom/cubic/umo/ad/types/AKTrackers;", "trackers", "bannerType", "", "creativeWidth", "creativeHeight", "", "adExpiryTimeMinutes", "clickThrough", "adData", "adVendor", "copy", "(Ljava/lang/String;Lcom/cubic/umo/ad/types/AKTrackers;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cubic/umo/ad/types/AKBannerResponse;", "<init>", "(Ljava/lang/String;Lcom/cubic/umo/ad/types/AKTrackers;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKBannerResponse */
public final class AKBannerResponse implements Parcelable {
    public static final Parcelable.Creator<AKBannerResponse> CREATOR = new C2228a();

    /* renamed from: b */
    public final String f7432b;

    /* renamed from: c */
    public final AKTrackers f7433c;

    /* renamed from: d */
    public final String f7434d;

    /* renamed from: e */
    public final Float f7435e;

    /* renamed from: f */
    public final Float f7436f;

    /* renamed from: g */
    public final int f7437g;

    /* renamed from: h */
    public final String f7438h;

    /* renamed from: i */
    public final String f7439i;

    /* renamed from: j */
    public String f7440j;

    /* renamed from: k */
    public transient LinkedHashMap f7441k;

    /* renamed from: com.cubic.umo.ad.types.AKBannerResponse$a */
    public static final class C2228a implements Parcelable.Creator<AKBannerResponse> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new AKBannerResponse(parcel.readString(), parcel.readInt() == 0 ? null : AKTrackers.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new AKBannerResponse[i];
        }
    }

    public AKBannerResponse(@C12943g(name = "banner_id") String str, @C12943g(name = "trackers") AKTrackers aKTrackers, @C12943g(name = "banner_type") String str2, @C12943g(name = "creative_width") Float f, @C12943g(name = "creative_height") Float f2, @C12943g(name = "ad_expiry_time_minutes") int i, @C12943g(name = "click_through") String str3, @C12943g(name = "ad") String str4, @C12943g(name = "ad_vendor") String str5) {
        C13437d.m33711q(str, "bannerSpotId", str2, "bannerType", str4, "adData");
        this.f7432b = str;
        this.f7433c = aKTrackers;
        this.f7434d = str2;
        this.f7435e = f;
        this.f7436f = f2;
        this.f7437g = i;
        this.f7438h = str3;
        this.f7439i = str4;
        this.f7440j = str5;
    }

    public final AKBannerResponse copy(@C12943g(name = "banner_id") String str, @C12943g(name = "trackers") AKTrackers aKTrackers, @C12943g(name = "banner_type") String str2, @C12943g(name = "creative_width") Float f, @C12943g(name = "creative_height") Float f2, @C12943g(name = "ad_expiry_time_minutes") int i, @C12943g(name = "click_through") String str3, @C12943g(name = "ad") String str4, @C12943g(name = "ad_vendor") String str5) {
        C24362h.m61211f(str, "bannerSpotId");
        C24362h.m61211f(str2, "bannerType");
        String str6 = str4;
        C24362h.m61211f(str6, "adData");
        return new AKBannerResponse(str, aKTrackers, str2, f, f2, i, str3, str6, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKBannerResponse)) {
            return false;
        }
        AKBannerResponse aKBannerResponse = (AKBannerResponse) obj;
        return C24362h.m61206a(this.f7432b, aKBannerResponse.f7432b) && C24362h.m61206a(this.f7433c, aKBannerResponse.f7433c) && C24362h.m61206a(this.f7434d, aKBannerResponse.f7434d) && C24362h.m61206a(this.f7435e, aKBannerResponse.f7435e) && C24362h.m61206a(this.f7436f, aKBannerResponse.f7436f) && this.f7437g == aKBannerResponse.f7437g && C24362h.m61206a(this.f7438h, aKBannerResponse.f7438h) && C24362h.m61206a(this.f7439i, aKBannerResponse.f7439i) && C24362h.m61206a(this.f7440j, aKBannerResponse.f7440j);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = this.f7432b.hashCode() * 31;
        AKTrackers aKTrackers = this.f7433c;
        int i5 = 0;
        if (aKTrackers == null) {
            i = 0;
        } else {
            i = aKTrackers.hashCode();
        }
        int I0 = C21100e.m49313I0((hashCode + i) * 31, this.f7434d);
        Float f = this.f7435e;
        if (f == null) {
            i2 = 0;
        } else {
            i2 = f.hashCode();
        }
        int i6 = (I0 + i2) * 31;
        Float f2 = this.f7436f;
        if (f2 == null) {
            i3 = 0;
        } else {
            i3 = f2.hashCode();
        }
        int i7 = (this.f7437g + ((i6 + i3) * 31)) * 31;
        String str = this.f7438h;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        int I02 = C21100e.m49313I0((i7 + i4) * 31, this.f7439i);
        String str2 = this.f7440j;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return I02 + i5;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKBannerResponse(bannerSpotId=");
        J0.append(this.f7432b);
        J0.append(", trackers=");
        J0.append(this.f7433c);
        J0.append(", bannerType=");
        J0.append(this.f7434d);
        J0.append(", creativeWidth=");
        J0.append(this.f7435e);
        J0.append(", creativeHeight=");
        J0.append(this.f7436f);
        J0.append(", adExpiryTimeMinutes=");
        J0.append(this.f7437g);
        J0.append(", clickThrough=");
        J0.append(this.f7438h);
        J0.append(", adData=");
        J0.append(this.f7439i);
        J0.append(", adVendor=");
        return C0016g.m30n(J0, this.f7440j, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f7432b);
        AKTrackers aKTrackers = this.f7433c;
        if (aKTrackers == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aKTrackers.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f7434d);
        Float f = this.f7435e;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.f7436f;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        parcel.writeInt(this.f7437g);
        parcel.writeString(this.f7438h);
        parcel.writeString(this.f7439i);
        parcel.writeString(this.f7440j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AKBannerResponse(String str, AKTrackers aKTrackers, String str2, Float f, Float f2, int i, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aKTrackers, str2, f, f2, i, str3, str4, (i2 & 256) != 0 ? "NONE" : str5);
    }
}
