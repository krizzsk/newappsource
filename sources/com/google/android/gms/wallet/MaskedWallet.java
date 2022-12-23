package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "MaskedWalletCreator")
@SafeParcelable.Reserved({1})
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new zzt();
    @SafeParcelable.Field(mo65739id = 2)
    public String zza;
    @SafeParcelable.Field(mo65739id = 3)
    public String zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public String[] zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public String zzd;
    @SafeParcelable.Field(mo65739id = 6)
    public zza zze;
    @SafeParcelable.Field(mo65739id = 7)
    public zza zzf;
    @SafeParcelable.Field(mo65739id = 8)
    public LoyaltyWalletObject[] zzg;
    @SafeParcelable.Field(mo65739id = 9)
    public OfferWalletObject[] zzh;
    @SafeParcelable.Field(mo65739id = 10)
    public UserAddress zzi;
    @SafeParcelable.Field(mo65739id = 11)
    public UserAddress zzj;
    @SafeParcelable.Field(mo65739id = 12)
    public InstrumentInfo[] zzk;

    private MaskedWallet() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public MaskedWallet(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) String[] strArr, @SafeParcelable.Param(mo65742id = 5) String str3, @SafeParcelable.Param(mo65742id = 6) zza zza2, @SafeParcelable.Param(mo65742id = 7) zza zza3, @SafeParcelable.Param(mo65742id = 8) LoyaltyWalletObject[] loyaltyWalletObjectArr, @SafeParcelable.Param(mo65742id = 9) OfferWalletObject[] offerWalletObjectArr, @SafeParcelable.Param(mo65742id = 10) UserAddress userAddress, @SafeParcelable.Param(mo65742id = 11) UserAddress userAddress2, @SafeParcelable.Param(mo65742id = 12) InstrumentInfo[] instrumentInfoArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = strArr;
        this.zzd = str3;
        this.zze = zza2;
        this.zzf = zza3;
        this.zzg = loyaltyWalletObjectArr;
        this.zzh = offerWalletObjectArr;
        this.zzi = userAddress;
        this.zzj = userAddress2;
        this.zzk = instrumentInfoArr;
    }
}
