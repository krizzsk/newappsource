package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LinkFederatedCredentialAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqy */
public final class zzqy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqy> CREATOR = new zzqz();
    @SafeParcelable.Field(getter = "getCachedState", mo65739id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getVerifyAssertionRequest", mo65739id = 2)
    private final zzaaa zzb;

    @SafeParcelable.Constructor
    public zzqy(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) zzaaa zzaaa) {
        this.zza = str;
        this.zzb = zzaaa;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzaaa zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
