package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "ParcelablePayloadCreator")
@SafeParcelable.Reserved({1000})
public final class zzmb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmb> CREATOR = new zzmc();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getId", mo65739id = 1)
    public long zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getType", mo65739id = 2)
    public int zzb;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getBytes", mo65739id = 3)
    public byte[] zzc;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getDataPfd", mo65739id = 4)
    public ParcelFileDescriptor zzd;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getJavaFilePath", mo65739id = 5)
    public String zze;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValue = "-1", getter = "getJavaFileSize", mo65739id = 6)
    public long zzf;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getStatusPfd", mo65739id = 7)
    public ParcelFileDescriptor zzg;
    @SafeParcelable.Field(getter = "getUri", mo65739id = 8)
    private Uri zzh;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValue = "0", getter = "getOffset", mo65739id = 9)
    public long zzi;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValue = "false", getter = "getIsSensitive", mo65739id = 10)
    public boolean zzj;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getSharedBytes", mo65739id = 11)
    public zzlx zzk;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValue = "0", getter = "getPayloadSize", mo65739id = 12)
    public long zzl;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getFileName", mo65739id = 13)
    public String zzm;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getParentFolder", mo65739id = 14)
    public String zzn;

    private zzmb() {
        this.zzf = -1;
        this.zzi = 0;
        this.zzj = false;
        this.zzl = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmb) {
            zzmb zzmb = (zzmb) obj;
            if (!Objects.equal(Long.valueOf(this.zza), Long.valueOf(zzmb.zza)) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzmb.zzb)) || !Arrays.equals(this.zzc, zzmb.zzc) || !Objects.equal(this.zzd, zzmb.zzd) || !Objects.equal(this.zze, zzmb.zze) || !Objects.equal(Long.valueOf(this.zzf), Long.valueOf(zzmb.zzf)) || !Objects.equal(this.zzg, zzmb.zzg) || !Objects.equal(this.zzh, zzmb.zzh) || !Objects.equal(Long.valueOf(this.zzi), Long.valueOf(zzmb.zzi)) || !Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(zzmb.zzj)) || !Objects.equal(this.zzk, zzmb.zzk) || !Objects.equal(Long.valueOf(this.zzl), Long.valueOf(zzmb.zzl)) || !Objects.equal(this.zzm, zzmb.zzm) || !Objects.equal(this.zzn, zzmb.zzn)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, this.zze, Long.valueOf(this.zzf), this.zzg, this.zzh, Long.valueOf(this.zzi), Boolean.valueOf(this.zzj), this.zzk, Long.valueOf(this.zzl), this.zzm, this.zzn);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeLong(parcel, 12, this.zzl);
        SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final Uri zzd() {
        return this.zzh;
    }

    public final ParcelFileDescriptor zze() {
        return this.zzd;
    }

    public final ParcelFileDescriptor zzf() {
        return this.zzg;
    }

    public final zzlx zzg() {
        return this.zzk;
    }

    public final String zzh() {
        return this.zze;
    }

    public final byte[] zzv() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    public zzmb(@SafeParcelable.Param(mo65742id = 1) long j, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) byte[] bArr, @SafeParcelable.Param(mo65742id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(mo65742id = 5) String str, @SafeParcelable.Param(mo65742id = 6) long j2, @SafeParcelable.Param(mo65742id = 7) ParcelFileDescriptor parcelFileDescriptor2, @SafeParcelable.Param(mo65742id = 8) Uri uri, @SafeParcelable.Param(mo65742id = 9) long j3, @SafeParcelable.Param(mo65742id = 10) boolean z, @SafeParcelable.Param(mo65742id = 11) zzlx zzlx, @SafeParcelable.Param(mo65742id = 12) long j4, @SafeParcelable.Param(mo65742id = 13) String str2, @SafeParcelable.Param(mo65742id = 14) String str3) {
        this.zza = j;
        this.zzb = i;
        this.zzc = bArr;
        this.zzd = parcelFileDescriptor;
        this.zze = str;
        this.zzf = j2;
        this.zzg = parcelFileDescriptor2;
        this.zzh = uri;
        this.zzi = j3;
        this.zzj = z;
        this.zzk = zzlx;
        this.zzl = j4;
        this.zzm = str2;
        this.zzn = str3;
    }

    public /* synthetic */ zzmb(zzma zzma) {
        this.zzf = -1;
        this.zzi = 0;
        this.zzj = false;
        this.zzl = 0;
    }
}
