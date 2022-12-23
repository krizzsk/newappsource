package com.masabi.justride.sdk.p415ui.features.universalticket;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/UniversalTicketScreenConfiguration;", "Landroid/os/Parcelable;", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketScreenConfiguration */
public final class UniversalTicketScreenConfiguration implements Parcelable {
    public static final Parcelable.Creator<UniversalTicketScreenConfiguration> CREATOR = new C14668a();

    /* renamed from: b */
    public Integer f37215b;

    /* renamed from: c */
    public float f37216c;

    /* renamed from: d */
    public Integer f37217d;

    /* renamed from: e */
    public Integer f37218e;

    /* renamed from: f */
    public Integer f37219f;

    /* renamed from: g */
    public Boolean f37220g;

    /* renamed from: h */
    public String f37221h;

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketScreenConfiguration$a */
    public static class C14668a implements Parcelable.Creator<UniversalTicketScreenConfiguration> {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            C24362h.m61211f(parcel, "in");
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            float readFloat = parcel.readFloat();
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf4 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            return new UniversalTicketScreenConfiguration(valueOf, readFloat, valueOf2, valueOf3, valueOf4, bool, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new UniversalTicketScreenConfiguration[i];
        }
    }

    public UniversalTicketScreenConfiguration(Integer num, float f, Integer num2, Integer num3, Integer num4, Boolean bool, String str) {
        C24362h.m61211f(str, "customTicketDetailsJsonString");
        this.f37215b = num;
        this.f37216c = f;
        this.f37217d = num2;
        this.f37218e = num3;
        this.f37219f = num4;
        this.f37220g = bool;
        this.f37221h = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalTicketScreenConfiguration)) {
            return false;
        }
        UniversalTicketScreenConfiguration universalTicketScreenConfiguration = (UniversalTicketScreenConfiguration) obj;
        return C24362h.m61206a(this.f37215b, universalTicketScreenConfiguration.f37215b) && Float.compare(this.f37216c, universalTicketScreenConfiguration.f37216c) == 0 && C24362h.m61206a(this.f37217d, universalTicketScreenConfiguration.f37217d) && C24362h.m61206a(this.f37218e, universalTicketScreenConfiguration.f37218e) && C24362h.m61206a(this.f37219f, universalTicketScreenConfiguration.f37219f) && C24362h.m61206a(this.f37220g, universalTicketScreenConfiguration.f37220g) && C24362h.m61206a(this.f37221h, universalTicketScreenConfiguration.f37221h);
    }

    public final int hashCode() {
        Integer num = this.f37215b;
        int i = 0;
        int floatToIntBits = (Float.floatToIntBits(this.f37216c) + ((num != null ? num.hashCode() : 0) * 31)) * 31;
        Integer num2 = this.f37217d;
        int hashCode = (floatToIntBits + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f37218e;
        int hashCode2 = (hashCode + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f37219f;
        int hashCode3 = (hashCode2 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool = this.f37220g;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f37221h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("UniversalTicketScreenConfiguration(activateTicketButtonBackgroundColour=");
        k.append(this.f37215b);
        k.append(", activateTicketButtonCornerRadius=");
        k.append(this.f37216c);
        k.append(", fullScreenBackgroundColour=");
        k.append(this.f37217d);
        k.append(", navigationButtonsTintColour=");
        k.append(this.f37218e);
        k.append(", dismissButtonTintColour=");
        k.append(this.f37219f);
        k.append(", hideTicketPrice=");
        k.append(this.f37220g);
        k.append(", customTicketDetailsJsonString=");
        return C0016g.m31o(k, this.f37221h, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        Integer num = this.f37215b;
        if (num != null) {
            C0017h.m59P(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeFloat(this.f37216c);
        Integer num2 = this.f37217d;
        if (num2 != null) {
            C0017h.m59P(parcel, 1, num2);
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.f37218e;
        if (num3 != null) {
            C0017h.m59P(parcel, 1, num3);
        } else {
            parcel.writeInt(0);
        }
        Integer num4 = this.f37219f;
        if (num4 != null) {
            C0017h.m59P(parcel, 1, num4);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.f37220g;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f37221h);
    }

    public UniversalTicketScreenConfiguration() {
        this((Integer) null, -1.0f, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, "{}");
    }
}
