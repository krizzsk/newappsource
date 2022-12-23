package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();
    public static final Scope[] zza = new Scope[0];
    public static final Feature[] zzb = new Feature[0];
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zzc;
    @SafeParcelable.Field(mo65739id = 2)
    public final int zzd;
    @SafeParcelable.Field(mo65739id = 3)
    public int zze;
    @SafeParcelable.Field(mo65739id = 4)
    public String zzf;
    @SafeParcelable.Field(mo65739id = 5)
    public IBinder zzg;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", mo65739id = 6)
    public Scope[] zzh;
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", mo65739id = 7)
    public Bundle zzi;
    @SafeParcelable.Field(mo65739id = 8)
    public Account zzj;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", mo65739id = 10)
    public Feature[] zzk;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", mo65739id = 11)
    public Feature[] zzl;
    @SafeParcelable.Field(mo65739id = 12)
    public boolean zzm;
    @SafeParcelable.Field(defaultValue = "0", mo65739id = 13)
    public int zzn;
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", mo65739id = 14)
    public boolean zzo;
    @SafeParcelable.Field(getter = "getAttributionTag", mo65739id = 15)
    private String zzp;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3, @SafeParcelable.Param(mo65742id = 4) String str, @SafeParcelable.Param(mo65742id = 5) IBinder iBinder, @SafeParcelable.Param(mo65742id = 6) Scope[] scopeArr, @SafeParcelable.Param(mo65742id = 7) Bundle bundle, @SafeParcelable.Param(mo65742id = 8) Account account, @SafeParcelable.Param(mo65742id = 10) Feature[] featureArr, @SafeParcelable.Param(mo65742id = 11) Feature[] featureArr2, @SafeParcelable.Param(mo65742id = 12) boolean z, @SafeParcelable.Param(mo65742id = 13) int i4, @SafeParcelable.Param(mo65742id = 14) boolean z2, @SafeParcelable.Param(mo65742id = 15) String str2) {
        Account account2;
        scopeArr = scopeArr == null ? zza : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? zzb : featureArr;
        featureArr2 = featureArr2 == null ? zzb : featureArr2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzf = "com.google.android.gms";
        } else {
            this.zzf = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                account2 = AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder));
            } else {
                account2 = null;
            }
            this.zzj = account2;
        } else {
            this.zzg = iBinder;
            this.zzj = account;
        }
        this.zzh = scopeArr;
        this.zzi = bundle;
        this.zzk = featureArr;
        this.zzl = featureArr2;
        this.zzm = z;
        this.zzn = i4;
        this.zzo = z2;
        this.zzp = str2;
    }

    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzi;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }

    public final String zza() {
        return this.zzp;
    }
}
