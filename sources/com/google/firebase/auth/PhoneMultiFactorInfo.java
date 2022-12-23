package com.google.firebase.auth;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.ServerParameters;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p986firebaseauthapi.zzpz;
import org.json.JSONException;
import org.json.JSONObject;
import p357ae.C13421h;

@SafeParcelable.Class(creator = "PhoneMultiFactorInfoCreator")
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new C13421h();
    @SafeParcelable.Field(getter = "getUid", mo65739id = 1)

    /* renamed from: b */
    public final String f36405b;
    @SafeParcelable.Field(getter = "getDisplayName", mo65739id = 2)

    /* renamed from: c */
    public final String f36406c;
    @SafeParcelable.Field(getter = "getEnrollmentTimestamp", mo65739id = 3)

    /* renamed from: d */
    public final long f36407d;
    @SafeParcelable.Field(getter = "getPhoneNumber", mo65739id = 4)

    /* renamed from: e */
    public final String f36408e;

    @SafeParcelable.Constructor
    public PhoneMultiFactorInfo(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) long j, @SafeParcelable.Param(mo65742id = 4) String str3) {
        this.f36405b = Preconditions.checkNotEmpty(str);
        this.f36406c = str2;
        this.f36407d = j;
        this.f36408e = Preconditions.checkNotEmpty(str3);
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt(ServerParameters.AF_USER_ID, this.f36405b);
            jSONObject.putOpt("displayName", this.f36406c);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f36407d));
            jSONObject.putOpt("phoneNumber", this.f36408e);
            return jSONObject;
        } catch (JSONException e) {
            throw new zzpz(e);
        }
    }

    @SuppressLint({"FirebaseUnknownNullness"})
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36405b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36406c, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f36407d);
        SafeParcelWriter.writeString(parcel, 4, this.f36408e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
