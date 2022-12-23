package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p986firebaseauthapi.zzpz;
import com.google.android.gms.internal.p986firebaseauthapi.zzyt;
import com.google.android.gms.internal.p986firebaseauthapi.zzzg;
import org.json.JSONException;
import org.json.JSONObject;
import p357ae.C13418e;
import p382be.C13594d0;

@SafeParcelable.Class(creator = "DefaultAuthUserInfoCreator")
public final class zzt extends AbstractSafeParcelable implements C13418e {
    public static final Parcelable.Creator<zzt> CREATOR = new C13594d0();
    @SafeParcelable.Field(getter = "getUid", mo65739id = 1)

    /* renamed from: b */
    public final String f36442b;
    @SafeParcelable.Field(getter = "getProviderId", mo65739id = 2)

    /* renamed from: c */
    public final String f36443c;
    @SafeParcelable.Field(getter = "getDisplayName", mo65739id = 3)

    /* renamed from: d */
    public final String f36444d;
    @SafeParcelable.Field(getter = "getPhotoUrlString", mo65739id = 4)

    /* renamed from: e */
    public String f36445e;
    @SafeParcelable.Field(getter = "getEmail", mo65739id = 5)

    /* renamed from: f */
    public final String f36446f;
    @SafeParcelable.Field(getter = "getPhoneNumber", mo65739id = 6)

    /* renamed from: g */
    public final String f36447g;
    @SafeParcelable.Field(getter = "isEmailVerified", mo65739id = 7)

    /* renamed from: h */
    public final boolean f36448h;
    @SafeParcelable.Field(getter = "getRawUserInfo", mo65739id = 8)

    /* renamed from: i */
    public final String f36449i;

    public zzt(zzyt zzyt) {
        Preconditions.checkNotNull(zzyt);
        Preconditions.checkNotEmpty("firebase");
        this.f36442b = Preconditions.checkNotEmpty(zzyt.zzo());
        this.f36443c = "firebase";
        this.f36446f = zzyt.zzn();
        this.f36444d = zzyt.zzm();
        Uri zzc = zzyt.zzc();
        if (zzc != null) {
            this.f36445e = zzc.toString();
        }
        this.f36448h = zzyt.zzs();
        this.f36449i = null;
        this.f36447g = zzyt.zzp();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36442b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36443c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f36444d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f36445e, false);
        SafeParcelWriter.writeString(parcel, 5, this.f36446f, false);
        SafeParcelWriter.writeString(parcel, 6, this.f36447g, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f36448h);
        SafeParcelWriter.writeString(parcel, 8, this.f36449i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: z1 */
    public final String mo40281z1() {
        return this.f36443c;
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f36442b);
            jSONObject.putOpt("providerId", this.f36443c);
            jSONObject.putOpt("displayName", this.f36444d);
            jSONObject.putOpt("photoUrl", this.f36445e);
            jSONObject.putOpt("email", this.f36446f);
            jSONObject.putOpt("phoneNumber", this.f36447g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f36448h));
            jSONObject.putOpt("rawUserInfo", this.f36449i);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new zzpz(e);
        }
    }

    public zzt(zzzg zzzg) {
        Preconditions.checkNotNull(zzzg);
        this.f36442b = zzzg.zzd();
        this.f36443c = Preconditions.checkNotEmpty(zzzg.zzf());
        this.f36444d = zzzg.zzb();
        Uri zza = zzzg.zza();
        if (zza != null) {
            this.f36445e = zza.toString();
        }
        this.f36446f = zzzg.zzc();
        this.f36447g = zzzg.zze();
        this.f36448h = false;
        this.f36449i = zzzg.zzg();
    }

    @SafeParcelable.Constructor
    @VisibleForTesting
    public zzt(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 5) String str3, @SafeParcelable.Param(mo65742id = 4) String str4, @SafeParcelable.Param(mo65742id = 3) String str5, @SafeParcelable.Param(mo65742id = 6) String str6, @SafeParcelable.Param(mo65742id = 7) boolean z, @SafeParcelable.Param(mo65742id = 8) String str7) {
        this.f36442b = str;
        this.f36443c = str2;
        this.f36446f = str3;
        this.f36447g = str4;
        this.f36444d = str5;
        this.f36445e = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(this.f36445e);
        }
        this.f36448h = z;
        this.f36449i = str7;
    }
}
