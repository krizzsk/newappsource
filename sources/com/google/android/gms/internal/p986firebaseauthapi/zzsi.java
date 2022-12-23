package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.UserProfileChangeRequest;

@SafeParcelable.Class(creator = "UpdateProfileAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsi */
public final class zzsi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsi> CREATOR = new zzsj();
    @SafeParcelable.Field(getter = "getUserProfileChangeRequest", mo65739id = 1)
    private final UserProfileChangeRequest zza;
    @SafeParcelable.Field(getter = "getCachedState", mo65739id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zzsi(@SafeParcelable.Param(mo65742id = 1) UserProfileChangeRequest userProfileChangeRequest, @SafeParcelable.Param(mo65742id = 2) String str) {
        this.zza = userProfileChangeRequest;
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final UserProfileChangeRequest zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
