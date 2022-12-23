package com.google.android.gms.internal.p986firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "GetAccountInfoUserCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyt */
public final class zzyt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyt> CREATOR = new zzyu();
    @SafeParcelable.Field(getter = "getLocalId", mo65739id = 2)
    private String zza;
    @SafeParcelable.Field(getter = "getEmail", mo65739id = 3)
    private String zzb;
    @SafeParcelable.Field(getter = "isEmailVerified", mo65739id = 4)
    private boolean zzc;
    @SafeParcelable.Field(getter = "getDisplayName", mo65739id = 5)
    private String zzd;
    @SafeParcelable.Field(getter = "getPhotoUrl", mo65739id = 6)
    private String zze;
    @SafeParcelable.Field(getter = "getProviderInfoList", mo65739id = 7)
    private zzzi zzf;
    @SafeParcelable.Field(getter = "getPassword", mo65739id = 8)
    private String zzg;
    @SafeParcelable.Field(getter = "getPhoneNumber", mo65739id = 9)
    private String zzh;
    @SafeParcelable.Field(getter = "getCreationTimestamp", mo65739id = 10)
    private long zzi;
    @SafeParcelable.Field(getter = "getLastSignInTimestamp", mo65739id = 11)
    private long zzj;
    @SafeParcelable.Field(getter = "isNewUser", mo65739id = 12)
    private boolean zzk;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", mo65739id = 13)
    private zze zzl;
    @SafeParcelable.Field(getter = "getMfaInfoList", mo65739id = 14)
    private List zzm;

    public zzyt() {
        this.zzf = new zzzi();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 10, this.zzi);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i, false);
        SafeParcelWriter.writeTypedList(parcel, 14, this.zzm, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.zzi;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final Uri zzc() {
        if (!TextUtils.isEmpty(this.zze)) {
            return Uri.parse(this.zze);
        }
        return null;
    }

    public final zze zzd() {
        return this.zzl;
    }

    public final zzyt zze(zze zze2) {
        this.zzl = zze2;
        return this;
    }

    public final zzyt zzf(String str) {
        this.zzd = str;
        return this;
    }

    public final zzyt zzg(String str) {
        this.zzb = str;
        return this;
    }

    public final zzyt zzh(boolean z) {
        this.zzk = z;
        return this;
    }

    public final zzyt zzi(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzg = str;
        return this;
    }

    public final zzyt zzj(String str) {
        this.zze = str;
        return this;
    }

    public final zzyt zzk(List list) {
        Preconditions.checkNotNull(list);
        zzzi zzzi = new zzzi();
        this.zzf = zzzi;
        zzzi.zzc().addAll(list);
        return this;
    }

    public final zzzi zzl() {
        return this.zzf;
    }

    public final String zzm() {
        return this.zzd;
    }

    public final String zzn() {
        return this.zzb;
    }

    public final String zzo() {
        return this.zza;
    }

    public final String zzp() {
        return this.zzh;
    }

    public final List zzq() {
        return this.zzm;
    }

    public final List zzr() {
        return this.zzf.zzc();
    }

    public final boolean zzs() {
        return this.zzc;
    }

    public final boolean zzt() {
        return this.zzk;
    }

    @SafeParcelable.Constructor
    public zzyt(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) boolean z, @SafeParcelable.Param(mo65742id = 5) String str3, @SafeParcelable.Param(mo65742id = 6) String str4, @SafeParcelable.Param(mo65742id = 7) zzzi zzzi, @SafeParcelable.Param(mo65742id = 8) String str5, @SafeParcelable.Param(mo65742id = 9) String str6, @SafeParcelable.Param(mo65742id = 10) long j, @SafeParcelable.Param(mo65742id = 11) long j2, @SafeParcelable.Param(mo65742id = 12) boolean z2, @SafeParcelable.Param(mo65742id = 13) zze zze2, @SafeParcelable.Param(mo65742id = 14) List list) {
        zzzi zzzi2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = str3;
        this.zze = str4;
        if (zzzi == null) {
            zzzi2 = new zzzi();
        } else {
            zzzi2 = zzzi.zzb(zzzi);
        }
        this.zzf = zzzi2;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j;
        this.zzj = j2;
        this.zzk = z2;
        this.zzl = zze2;
        this.zzm = list == null ? new ArrayList() : list;
    }
}
