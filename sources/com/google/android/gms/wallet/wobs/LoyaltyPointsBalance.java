package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LoyaltyPointsBalanceCreator")
@SafeParcelable.Reserved({1})
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zzi();
    @SafeParcelable.Field(mo65739id = 2)
    public int zza;
    @SafeParcelable.Field(mo65739id = 3)
    public String zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public double zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public String zzd;
    @SafeParcelable.Field(mo65739id = 6)
    public long zze;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.wobs.LoyaltyPointsBalance.Type.UNDEFINED", mo65739id = 7)
    public int zzf;

    public final class Builder {
        public /* synthetic */ Builder(zzh zzh) {
        }

        public LoyaltyPointsBalance build() {
            return LoyaltyPointsBalance.this;
        }

        public Builder setDouble(double d) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzc = d;
            loyaltyPointsBalance.zzf = 2;
            return this;
        }

        public Builder setInt(int i) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zza = i;
            loyaltyPointsBalance.zzf = 0;
            return this;
        }

        public Builder setMoney(String str, long j) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzd = str;
            loyaltyPointsBalance.zze = j;
            loyaltyPointsBalance.zzf = 3;
            return this;
        }

        public Builder setString(String str) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzb = str;
            loyaltyPointsBalance.zzf = 1;
            return this;
        }
    }

    public interface Type {
        public static final int DOUBLE = 2;
        public static final int INT = 0;
        public static final int MONEY = 3;
        public static final int STRING = 1;
        public static final int UNDEFINED = -1;
    }

    public LoyaltyPointsBalance() {
        this.zzf = -1;
        this.zza = -1;
        this.zzc = -1.0d;
    }

    public static Builder newBuilder() {
        return new Builder((zzh) null);
    }

    public String getCurrencyCode() {
        return this.zzd;
    }

    public long getCurrencyMicros() {
        return this.zze;
    }

    public double getDouble() {
        return this.zzc;
    }

    public int getInt() {
        return this.zza;
    }

    public String getString() {
        return this.zzb;
    }

    public int getType() {
        return this.zzf;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzc);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LoyaltyPointsBalance(@SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) double d, @SafeParcelable.Param(mo65742id = 5) String str2, @SafeParcelable.Param(mo65742id = 6) long j, @SafeParcelable.Param(mo65742id = 7) int i2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = d;
        this.zzd = str2;
        this.zze = j;
        this.zzf = i2;
    }
}
