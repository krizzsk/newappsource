package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@ShowFirstParty
@SafeParcelable.Class(creator = "TokenDataCreator")
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new zzm();
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getToken", mo65739id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", mo65739id = 3)
    private final Long zzc;
    @SafeParcelable.Field(getter = "isCached", mo65739id = 4)
    private final boolean zzd;
    @SafeParcelable.Field(getter = "isSnowballed", mo65739id = 5)
    private final boolean zze;
    @SafeParcelable.Field(getter = "getGrantedScopes", mo65739id = 6)
    private final List zzf;
    @SafeParcelable.Field(getter = "getScopeData", mo65739id = 7)
    private final String zzg;

    @SafeParcelable.Constructor
    public TokenData(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) Long l, @SafeParcelable.Param(mo65742id = 4) boolean z, @SafeParcelable.Param(mo65742id = 5) boolean z2, @SafeParcelable.Param(mo65742id = 6) List list, @SafeParcelable.Param(mo65742id = 7) String str2) {
        this.zza = i;
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzc = l;
        this.zzd = z;
        this.zze = z2;
        this.zzf = list;
        this.zzg = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.zzb, tokenData.zzb) || !Objects.equal(this.zzc, tokenData.zzc) || this.zzd != tokenData.zzd || this.zze != tokenData.zze || !Objects.equal(this.zzf, tokenData.zzf) || !Objects.equal(this.zzg, tokenData.zzg)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, this.zzg);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zzb;
    }
}
