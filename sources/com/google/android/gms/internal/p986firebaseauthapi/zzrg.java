package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@SafeParcelable.Class(creator = "SendGetOobConfirmationCodeEmailAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrg */
public final class zzrg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrg> CREATOR = new zzrh();
    @SafeParcelable.Field(getter = "getEmail", mo65739id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getActionCodeSettings", mo65739id = 2)
    private final ActionCodeSettings zzb;
    @SafeParcelable.Field(getter = "getTenantId", mo65739id = 3)
    private final String zzc;

    @SafeParcelable.Constructor
    public zzrg(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) ActionCodeSettings actionCodeSettings, @SafeParcelable.Param(mo65742id = 3) String str2) {
        this.zza = str;
        this.zzb = actionCodeSettings;
        this.zzc = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ActionCodeSettings zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }
}
