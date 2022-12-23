package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "PaymentDataCreator")
public final class PaymentData extends AbstractSafeParcelable implements AutoResolvableResult {
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzaa();
    @SafeParcelable.Field(mo65739id = 1)
    public String zza;
    @SafeParcelable.Field(mo65739id = 2)
    public CardInfo zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public UserAddress zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public PaymentMethodToken zzd;
    @SafeParcelable.Field(mo65739id = 5)
    public String zze;
    @SafeParcelable.Field(mo65739id = 6)
    public Bundle zzf;
    @SafeParcelable.Field(mo65739id = 7)
    public String zzg;
    @SafeParcelable.Field(mo65739id = 8)
    public Bundle zzh;

    private PaymentData() {
    }

    public static PaymentData fromJson(String str) {
        PaymentData paymentData = new PaymentData();
        paymentData.zzg = (String) Preconditions.checkNotNull(str, "paymentDataJson cannot be null!");
        return paymentData;
    }

    public static PaymentData getFromIntent(Intent intent) {
        return (PaymentData) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    @Deprecated
    public CardInfo getCardInfo() {
        return this.zzb;
    }

    @Deprecated
    public String getEmail() {
        return this.zza;
    }

    @Deprecated
    public Bundle getExtraData() {
        return this.zzf;
    }

    @Deprecated
    public String getGoogleTransactionId() {
        return this.zze;
    }

    public Bundle getLastSavedState() {
        return this.zzh;
    }

    @Deprecated
    public PaymentMethodToken getPaymentMethodToken() {
        return this.zzd;
    }

    @Deprecated
    public UserAddress getShippingAddress() {
        return this.zzc;
    }

    public void putIntoIntent(Intent intent) {
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    public String toJson() {
        return this.zzg;
    }

    public PaymentData withLastSavedState(Bundle bundle) {
        this.zzh = bundle;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBundle(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeBundle(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentData(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) CardInfo cardInfo, @SafeParcelable.Param(mo65742id = 3) UserAddress userAddress, @SafeParcelable.Param(mo65742id = 4) PaymentMethodToken paymentMethodToken, @SafeParcelable.Param(mo65742id = 5) String str2, @SafeParcelable.Param(mo65742id = 6) Bundle bundle, @SafeParcelable.Param(mo65742id = 7) String str3, @SafeParcelable.Param(mo65742id = 8) Bundle bundle2) {
        this.zza = str;
        this.zzb = cardInfo;
        this.zzc = userAddress;
        this.zzd = paymentMethodToken;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = str3;
        this.zzh = bundle2;
    }
}
