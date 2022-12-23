package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzars implements Parcelable {
    public static final Parcelable.Creator<zzars> CREATOR = new zzarr();
    private int zzA;
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final zzawd zzd;
    public final String zze;
    public final String zzf;
    public final int zzg;
    public final List zzh;
    public final zzatr zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final float zzn;
    public final int zzo;
    public final byte[] zzp;
    public final zzazq zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final int zzu;
    public final int zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    public zzars(Parcel parcel) {
        this.zza = parcel.readString();
        this.zze = parcel.readString();
        this.zzf = parcel.readString();
        this.zzc = parcel.readString();
        this.zzb = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzk = parcel.readInt();
        this.zzl = parcel.readFloat();
        this.zzm = parcel.readInt();
        this.zzn = parcel.readFloat();
        this.zzp = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzo = parcel.readInt();
        this.zzq = (zzazq) parcel.readParcelable(zzazq.class.getClassLoader());
        this.zzr = parcel.readInt();
        this.zzs = parcel.readInt();
        this.zzt = parcel.readInt();
        this.zzu = parcel.readInt();
        this.zzv = parcel.readInt();
        this.zzx = parcel.readInt();
        this.zzy = parcel.readString();
        this.zzz = parcel.readInt();
        this.zzw = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzh = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.zzh.add(parcel.createByteArray());
        }
        this.zzi = (zzatr) parcel.readParcelable(zzatr.class.getClassLoader());
        this.zzd = (zzawd) parcel.readParcelable(zzawd.class.getClassLoader());
    }

    public static zzars zzg(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, zzatr zzatr, int i5, String str4) {
        return zzh(str, str2, (String) null, -1, -1, i3, i4, -1, -1, -1, (List) null, zzatr, 0, str4, (zzawd) null);
    }

    public static zzars zzh(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, zzatr zzatr, int i8, String str4, zzawd zzawd) {
        return new zzars(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzazq) null, i3, i4, i5, -1, -1, i8, str4, -1, Long.MAX_VALUE, list, zzatr, (zzawd) null);
    }

    public static zzars zzi(String str, String str2, String str3, int i, List list, String str4, zzatr zzatr) {
        return new zzars(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzazq) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzatr, (zzawd) null);
    }

    public static zzars zzj(String str, String str2, String str3, int i, zzatr zzatr) {
        return new zzars(str, (String) null, "application/x-camera-motion", (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzazq) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List) null, zzatr, (zzawd) null);
    }

    public static zzars zzk(String str, String str2, String str3, int i, int i2, String str4, int i3, zzatr zzatr, long j, List list) {
        return new zzars(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzazq) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzatr, (zzawd) null);
    }

    public static zzars zzl(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, int i5, float f2, byte[] bArr, int i6, zzazq zzazq, zzatr zzatr) {
        return new zzars(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzazq, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, zzatr, (zzawd) null);
    }

    @TargetApi(16)
    private static void zzm(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzars.class == obj.getClass()) {
            zzars zzars = (zzars) obj;
            if (this.zzb == zzars.zzb && this.zzg == zzars.zzg && this.zzj == zzars.zzj && this.zzk == zzars.zzk && this.zzl == zzars.zzl && this.zzm == zzars.zzm && this.zzn == zzars.zzn && this.zzo == zzars.zzo && this.zzr == zzars.zzr && this.zzs == zzars.zzs && this.zzt == zzars.zzt && this.zzu == zzars.zzu && this.zzv == zzars.zzv && this.zzw == zzars.zzw && this.zzx == zzars.zzx && zzazn.zzo(this.zza, zzars.zza) && zzazn.zzo(this.zzy, zzars.zzy) && this.zzz == zzars.zzz && zzazn.zzo(this.zze, zzars.zze) && zzazn.zzo(this.zzf, zzars.zzf) && zzazn.zzo(this.zzc, zzars.zzc) && zzazn.zzo(this.zzi, zzars.zzi) && zzazn.zzo(this.zzd, zzars.zzd) && zzazn.zzo(this.zzq, zzars.zzq) && Arrays.equals(this.zzp, zzars.zzp) && this.zzh.size() == zzars.zzh.size()) {
                for (int i = 0; i < this.zzh.size(); i++) {
                    if (!Arrays.equals((byte[]) this.zzh.get(i), (byte[]) zzars.zzh.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.zzA;
        if (i7 != 0) {
            return i7;
        }
        String str = this.zza;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (i + 527) * 31;
        String str2 = this.zze;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i11 = (i9 + i2) * 31;
        String str3 = this.zzf;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i12 = (i11 + i3) * 31;
        String str4 = this.zzc;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i13 = (((((((((((i12 + i4) * 31) + this.zzb) * 31) + this.zzj) * 31) + this.zzk) * 31) + this.zzr) * 31) + this.zzs) * 31;
        String str5 = this.zzy;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i14 = (((i13 + i5) * 31) + this.zzz) * 31;
        zzatr zzatr = this.zzi;
        if (zzatr == null) {
            i6 = 0;
        } else {
            i6 = zzatr.hashCode();
        }
        int i15 = (i14 + i6) * 31;
        zzawd zzawd = this.zzd;
        if (zzawd != null) {
            i8 = zzawd.hashCode();
        }
        int i16 = i15 + i8;
        this.zzA = i16;
        return i16;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zze;
        String str3 = this.zzf;
        int i = this.zzb;
        String str4 = this.zzy;
        int i2 = this.zzj;
        int i3 = this.zzk;
        float f = this.zzl;
        int i4 = this.zzr;
        int i5 = this.zzs;
        StringBuilder h = C16759e.m42352h("Format(", str, ", ", str2, ", ");
        h.append(str3);
        h.append(", ");
        h.append(i);
        h.append(", ");
        h.append(str4);
        h.append(", [");
        h.append(i2);
        h.append(", ");
        h.append(i3);
        h.append(", ");
        h.append(f);
        h.append("], [");
        h.append(i4);
        h.append(", ");
        h.append(i5);
        h.append("])");
        return h.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.zza);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzg);
        parcel.writeInt(this.zzj);
        parcel.writeInt(this.zzk);
        parcel.writeFloat(this.zzl);
        parcel.writeInt(this.zzm);
        parcel.writeFloat(this.zzn);
        if (this.zzp != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        byte[] bArr = this.zzp;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzo);
        parcel.writeParcelable(this.zzq, i);
        parcel.writeInt(this.zzr);
        parcel.writeInt(this.zzs);
        parcel.writeInt(this.zzt);
        parcel.writeInt(this.zzu);
        parcel.writeInt(this.zzv);
        parcel.writeInt(this.zzx);
        parcel.writeString(this.zzy);
        parcel.writeInt(this.zzz);
        parcel.writeLong(this.zzw);
        int size = this.zzh.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray((byte[]) this.zzh.get(i3));
        }
        parcel.writeParcelable(this.zzi, 0);
        parcel.writeParcelable(this.zzd, 0);
    }

    public final int zza() {
        int i;
        int i2 = this.zzj;
        if (i2 == -1 || (i = this.zzk) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat zzb() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzf);
        String str = this.zzy;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zzm(mediaFormat, "max-input-size", this.zzg);
        zzm(mediaFormat, "width", this.zzj);
        zzm(mediaFormat, "height", this.zzk);
        float f = this.zzl;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        zzm(mediaFormat, "rotation-degrees", this.zzm);
        zzm(mediaFormat, "channel-count", this.zzr);
        zzm(mediaFormat, "sample-rate", this.zzs);
        zzm(mediaFormat, "encoder-delay", this.zzu);
        zzm(mediaFormat, "encoder-padding", this.zzv);
        for (int i = 0; i < this.zzh.size(); i++) {
            mediaFormat.setByteBuffer(C16759e.m42349e("csd-", i), ByteBuffer.wrap((byte[]) this.zzh.get(i)));
        }
        zzazq zzazq = this.zzq;
        if (zzazq != null) {
            zzm(mediaFormat, "color-transfer", zzazq.zzc);
            zzm(mediaFormat, "color-standard", zzazq.zza);
            zzm(mediaFormat, "color-range", zzazq.zzb);
            byte[] bArr = zzazq.zzd;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final zzars zzc(zzatr zzatr) {
        String str = this.zza;
        return new zzars(str, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, zzatr, this.zzd);
    }

    public final zzars zzd(int i, int i2) {
        String str = this.zza;
        return new zzars(str, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, i, i2, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzars zze(int i) {
        String str = this.zza;
        return new zzars(str, this.zze, this.zzf, this.zzc, this.zzb, i, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzars zzf(zzawd zzawd) {
        String str = this.zza;
        return new zzars(str, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, zzawd);
    }

    public zzars(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzazq zzazq, int i7, int i8, int i9, int i11, int i12, int i13, String str5, int i14, long j, List list, zzatr zzatr, zzawd zzawd) {
        this.zza = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzc = str4;
        this.zzb = i;
        this.zzg = i2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = f;
        this.zzm = i5;
        this.zzn = f2;
        this.zzp = bArr;
        this.zzo = i6;
        this.zzq = zzazq;
        this.zzr = i7;
        this.zzs = i8;
        this.zzt = i9;
        this.zzu = i11;
        this.zzv = i12;
        this.zzx = i13;
        this.zzy = str5;
        this.zzz = i14;
        this.zzw = j;
        this.zzh = list == null ? Collections.emptyList() : list;
        this.zzi = zzatr;
        this.zzd = zzawd;
    }
}
