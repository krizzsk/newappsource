package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p001a0.C0017h;

@SafeParcelable.Class(creator = "BeaconInfoImplCreator")
@SafeParcelable.Reserved({1})
public final class zzn extends AbstractSafeParcelable implements BeaconState.BeaconInfo {
    public static final Parcelable.Creator<zzn> CREATOR = new zzm();
    @SafeParcelable.Field(getter = "getNamespace", mo65739id = 2)
    private final String zza;
    @SafeParcelable.Field(getter = "getType", mo65739id = 3)
    private final String zzb;
    @SafeParcelable.Field(getter = "getContent", mo65739id = 4)
    private final byte[] zzc;

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) byte[] bArr) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = bArr;
    }

    public final byte[] getContent() {
        return this.zzc;
    }

    public final String getNamespace() {
        return this.zza;
    }

    public final String getType() {
        return this.zzb;
    }

    public final String toString() {
        String str = new String(this.zzc);
        String str2 = this.zza;
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(C16530d.m42011d(String.valueOf(str2).length(), 6, String.valueOf(str3).length(), str.length()));
        C0017h.m61R(sb, "(", str2, ", ", str3);
        return C13715c.m34245k(sb, ", ", str, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
