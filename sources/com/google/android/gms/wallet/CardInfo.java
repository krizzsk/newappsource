package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "CardInfoCreator")
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new zze();
    @SafeParcelable.Field(mo65739id = 1)
    public String zza;
    @SafeParcelable.Field(mo65739id = 2)
    public String zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public String zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public int zzd;
    @SafeParcelable.Field(mo65739id = 5)
    public UserAddress zze;

    private CardInfo() {
    }

    public UserAddress getBillingAddress() {
        return this.zze;
    }

    public int getCardClass() {
        int i = this.zzd;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    public String getCardDescription() {
        return this.zza;
    }

    public String getCardDetails() {
        return this.zzc;
    }

    public String getCardNetwork() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CardInfo(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) String str3, @SafeParcelable.Param(mo65742id = 4) int i, @SafeParcelable.Param(mo65742id = 5) UserAddress userAddress) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i;
        this.zze = userAddress;
    }
}
