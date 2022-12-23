package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p001a0.C0017h;

@SafeParcelable.Class(creator = "ContextManagerClientInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzck extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzck> CREATOR = new zzcl();
    @SafeParcelable.Field(mo65739id = 2)
    public final String zza;
    @SafeParcelable.Field(mo65739id = 3)
    public final String zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public final int zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public final String zzd;
    @SafeParcelable.Field(mo65739id = 6)
    public final int zze;
    @SafeParcelable.Field(mo65739id = 7)
    public final int zzf;
    @SafeParcelable.Field(mo65739id = 8)
    public final String zzg;
    @SafeParcelable.Field(mo65739id = 9)
    public final String zzh;
    @SafeParcelable.Field(mo65739id = 10)
    public final int zzi;
    @SafeParcelable.Field(mo65739id = 11)
    public final int zzj;
    @SafeParcelable.Field(mo65739id = 12)
    public final String zzk;
    private zzd zzl;

    @SafeParcelable.Constructor
    public zzck(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) int i, @SafeParcelable.Param(mo65742id = 5) String str3, @SafeParcelable.Param(mo65742id = 6) int i2, @SafeParcelable.Param(mo65742id = 7) int i3, @SafeParcelable.Param(mo65742id = 8) String str4, @SafeParcelable.Param(mo65742id = 9) String str5, @SafeParcelable.Param(mo65742id = 10) int i4, @SafeParcelable.Param(mo65742id = 11) int i5, @SafeParcelable.Param(mo65742id = 12) String str6) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = str3;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = str4;
        this.zzh = str5;
        this.zzi = i4;
        this.zzj = i5;
        this.zzk = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzck zzck = (zzck) obj;
        if (this.zzc != zzck.zzc || this.zze != zzck.zze || this.zzf != zzck.zzf || this.zzi != zzck.zzi || !TextUtils.equals(this.zza, zzck.zza) || !TextUtils.equals(this.zzb, zzck.zzb) || !TextUtils.equals(this.zzd, zzck.zzd) || !TextUtils.equals(this.zzg, zzck.zzg) || !TextUtils.equals(this.zzh, zzck.zzh) || !TextUtils.equals(this.zzk, zzck.zzk)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, Integer.valueOf(this.zze), Integer.valueOf(this.zzf), this.zzg, this.zzh, Integer.valueOf(this.zzi));
    }

    public final String toString() {
        zzd zzd2;
        String str = this.zza;
        if (str == null) {
            zzd2 = null;
        } else {
            if (this.zzl == null) {
                this.zzl = new zzd(str);
            }
            zzd2 = this.zzl;
        }
        String valueOf = String.valueOf(zzd2);
        String str2 = this.zzb;
        int i = this.zzc;
        String str3 = this.zzd;
        int i2 = this.zze;
        String num = Integer.toString(this.zzf);
        String str4 = this.zzg;
        String str5 = this.zzh;
        int i3 = this.zzj;
        String str6 = this.zzk;
        int length = valueOf.length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(num).length();
        int length5 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 105 + length2 + length3 + length4 + length5 + String.valueOf(str5).length() + String.valueOf(str6).length());
        C0017h.m61R(sb, "(accnt=", valueOf, ", ", str2);
        sb.append("(");
        sb.append(i);
        sb.append("):");
        sb.append(str3);
        sb.append(", vrsn=");
        sb.append(i2);
        sb.append(", ");
        sb.append(num);
        C0017h.m61R(sb, ", 3pPkg = ", str4, " ,  3pMdlId = ", str5);
        sb.append(" ,  pid = ");
        sb.append(i3);
        sb.append(" ,  featureId = ");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzi);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
