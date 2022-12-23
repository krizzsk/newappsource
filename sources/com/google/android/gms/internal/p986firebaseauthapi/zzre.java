package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@SafeParcelable.Class(creator = "SendEmailVerificationWithSettingsAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzre */
public final class zzre extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzre> CREATOR = new zzrf();
    @SafeParcelable.Field(getter = "getToken", mo65739id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getActionCodeSettings", mo65739id = 2)
    private final ActionCodeSettings zzb;

    @SafeParcelable.Constructor
    public zzre(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) ActionCodeSettings actionCodeSettings) {
        this.zza = str;
        this.zzb = actionCodeSettings;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ActionCodeSettings zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
