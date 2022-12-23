package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;

@KeepName
@SafeParcelable.Class(creator = "CommonWalletObjectCreator")
@SafeParcelable.Reserved({1})
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new zzc();
    @SafeParcelable.Field(mo65739id = 2)
    public String zza;
    @SafeParcelable.Field(mo65739id = 3)
    public String zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public String zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public String zzd;
    @SafeParcelable.Field(mo65739id = 6)
    public String zze;
    @SafeParcelable.Field(mo65739id = 7)
    public String zzf;
    @SafeParcelable.Field(mo65739id = 8)
    public String zzg;
    @SafeParcelable.Field(mo65739id = 9)
    @Deprecated
    public String zzh;
    @SafeParcelable.Field(mo65739id = 10)
    public int zzi;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo65739id = 11)
    public ArrayList zzj;
    @SafeParcelable.Field(mo65739id = 12)
    public TimeInterval zzk;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo65739id = 13)
    public ArrayList zzl;
    @SafeParcelable.Field(mo65739id = 14)
    @Deprecated
    public String zzm;
    @SafeParcelable.Field(mo65739id = 15)
    @Deprecated
    public String zzn;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo65739id = 16)
    public ArrayList zzo;
    @SafeParcelable.Field(mo65739id = 17)
    public boolean zzp;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo65739id = 18)
    public ArrayList zzq;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo65739id = 19)
    public ArrayList zzr;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo65739id = 20)
    public ArrayList zzs;

    public CommonWalletObject() {
        this.zzj = ArrayUtils.newArrayList();
        this.zzl = ArrayUtils.newArrayList();
        this.zzo = ArrayUtils.newArrayList();
        this.zzq = ArrayUtils.newArrayList();
        this.zzr = ArrayUtils.newArrayList();
        this.zzs = ArrayUtils.newArrayList();
    }

    public static zzb zzb() {
        return new zzb(new CommonWalletObject(), (zza) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzi);
        SafeParcelWriter.writeTypedList(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeTypedList(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeTypedList(parcel, 18, this.zzq, false);
        SafeParcelWriter.writeTypedList(parcel, 19, this.zzr, false);
        SafeParcelWriter.writeTypedList(parcel, 20, this.zzs, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzi;
    }

    public final TimeInterval zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zze;
    }

    @Deprecated
    public final String zze() {
        return this.zzh;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    @Deprecated
    public final String zzj() {
        return this.zzn;
    }

    @Deprecated
    public final String zzk() {
        return this.zzm;
    }

    public final String zzl() {
        return this.zzd;
    }

    public final String zzm() {
        return this.zzc;
    }

    public final ArrayList zzn() {
        return this.zzq;
    }

    public final ArrayList zzo() {
        return this.zzo;
    }

    public final ArrayList zzp() {
        return this.zzs;
    }

    public final ArrayList zzq() {
        return this.zzl;
    }

    public final ArrayList zzr() {
        return this.zzj;
    }

    public final ArrayList zzs() {
        return this.zzr;
    }

    public final boolean zzt() {
        return this.zzp;
    }

    @SafeParcelable.Constructor
    public CommonWalletObject(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) String str3, @SafeParcelable.Param(mo65742id = 5) String str4, @SafeParcelable.Param(mo65742id = 6) String str5, @SafeParcelable.Param(mo65742id = 7) String str6, @SafeParcelable.Param(mo65742id = 8) String str7, @SafeParcelable.Param(mo65742id = 9) String str8, @SafeParcelable.Param(mo65742id = 10) int i, @SafeParcelable.Param(mo65742id = 11) ArrayList arrayList, @SafeParcelable.Param(mo65742id = 12) TimeInterval timeInterval, @SafeParcelable.Param(mo65742id = 13) ArrayList arrayList2, @SafeParcelable.Param(mo65742id = 14) String str9, @SafeParcelable.Param(mo65742id = 15) String str10, @SafeParcelable.Param(mo65742id = 16) ArrayList arrayList3, @SafeParcelable.Param(mo65742id = 17) boolean z, @SafeParcelable.Param(mo65742id = 18) ArrayList arrayList4, @SafeParcelable.Param(mo65742id = 19) ArrayList arrayList5, @SafeParcelable.Param(mo65742id = 20) ArrayList arrayList6) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = i;
        this.zzj = arrayList;
        this.zzk = timeInterval;
        this.zzl = arrayList2;
        this.zzm = str9;
        this.zzn = str10;
        this.zzo = arrayList3;
        this.zzp = z;
        this.zzq = arrayList4;
        this.zzr = arrayList5;
        this.zzs = arrayList6;
    }
}
