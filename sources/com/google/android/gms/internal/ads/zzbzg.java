package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "AdRequestInfoParcelCreator")
public final class zzbzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzg> CREATOR = new zzbzh();
    @SafeParcelable.Field(mo65739id = 31)
    public final long zzA;
    @SafeParcelable.Field(mo65739id = 33)
    public final String zzB;
    @SafeParcelable.Field(mo65739id = 34)
    public final float zzC;
    @SafeParcelable.Field(mo65739id = 35)
    public final int zzD;
    @SafeParcelable.Field(mo65739id = 36)
    public final int zzE;
    @SafeParcelable.Field(mo65739id = 37)
    public final boolean zzF;
    @SafeParcelable.Field(mo65739id = 39)
    public final String zzG;
    @SafeParcelable.Field(mo65739id = 40)
    public final boolean zzH;
    @SafeParcelable.Field(mo65739id = 41)
    public final String zzI;
    @SafeParcelable.Field(mo65739id = 42)
    public final boolean zzJ;
    @SafeParcelable.Field(mo65739id = 43)
    public final int zzK;
    @SafeParcelable.Field(mo65739id = 44)
    public final Bundle zzL;
    @SafeParcelable.Field(mo65739id = 45)
    public final String zzM;
    @SafeParcelable.Field(mo65739id = 46)
    public final zzdo zzN;
    @SafeParcelable.Field(mo65739id = 47)
    public final boolean zzO;
    @SafeParcelable.Field(mo65739id = 48)
    public final Bundle zzP;
    @SafeParcelable.Field(mo65739id = 49)
    public final String zzQ;
    @SafeParcelable.Field(mo65739id = 50)
    public final String zzR;
    @SafeParcelable.Field(mo65739id = 51)
    public final String zzS;
    @SafeParcelable.Field(mo65739id = 52)
    public final boolean zzT;
    @SafeParcelable.Field(mo65739id = 53)
    public final List zzU;
    @SafeParcelable.Field(mo65739id = 54)
    public final String zzV;
    @SafeParcelable.Field(mo65739id = 55)
    public final List zzW;
    @SafeParcelable.Field(mo65739id = 56)
    public final int zzX;
    @SafeParcelable.Field(mo65739id = 57)
    public final boolean zzY;
    @SafeParcelable.Field(mo65739id = 58)
    public final boolean zzZ;
    @SafeParcelable.Field(mo65739id = 1)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 59)
    public final boolean zzaa;
    @SafeParcelable.Field(mo65739id = 60)
    public final ArrayList zzab;
    @SafeParcelable.Field(mo65739id = 61)
    public final String zzac;
    @SafeParcelable.Field(mo65739id = 63)
    public final zzbqr zzad;
    @SafeParcelable.Field(mo65739id = 64)
    public final String zzae;
    @SafeParcelable.Field(mo65739id = 65)
    public final Bundle zzaf;
    @SafeParcelable.Field(mo65739id = 2)
    public final Bundle zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final zzl zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public final zzq zzd;
    @SafeParcelable.Field(mo65739id = 5)
    public final String zze;
    @SafeParcelable.Field(mo65739id = 6)
    public final ApplicationInfo zzf;
    @SafeParcelable.Field(mo65739id = 7)
    public final PackageInfo zzg;
    @SafeParcelable.Field(mo65739id = 8)
    public final String zzh;
    @SafeParcelable.Field(mo65739id = 9)
    public final String zzi;
    @SafeParcelable.Field(mo65739id = 10)
    public final String zzj;
    @SafeParcelable.Field(mo65739id = 11)
    public final zzcfo zzk;
    @SafeParcelable.Field(mo65739id = 12)
    public final Bundle zzl;
    @SafeParcelable.Field(mo65739id = 13)
    public final int zzm;
    @SafeParcelable.Field(mo65739id = 14)
    public final List zzn;
    @SafeParcelable.Field(mo65739id = 15)
    public final Bundle zzo;
    @SafeParcelable.Field(mo65739id = 16)
    public final boolean zzp;
    @SafeParcelable.Field(mo65739id = 18)
    public final int zzq;
    @SafeParcelable.Field(mo65739id = 19)
    public final int zzr;
    @SafeParcelable.Field(mo65739id = 20)
    public final float zzs;
    @SafeParcelable.Field(mo65739id = 21)
    public final String zzt;
    @SafeParcelable.Field(mo65739id = 25)
    public final long zzu;
    @SafeParcelable.Field(mo65739id = 26)
    public final String zzv;
    @SafeParcelable.Field(mo65739id = 27)
    public final List zzw;
    @SafeParcelable.Field(mo65739id = 28)
    public final String zzx;
    @SafeParcelable.Field(mo65739id = 29)
    public final zzbko zzy;
    @SafeParcelable.Field(mo65739id = 30)
    public final List zzz;

    @SafeParcelable.Constructor
    public zzbzg(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) Bundle bundle, @SafeParcelable.Param(mo65742id = 3) zzl zzl2, @SafeParcelable.Param(mo65742id = 4) zzq zzq2, @SafeParcelable.Param(mo65742id = 5) String str, @SafeParcelable.Param(mo65742id = 6) ApplicationInfo applicationInfo, @SafeParcelable.Param(mo65742id = 7) PackageInfo packageInfo, @SafeParcelable.Param(mo65742id = 8) String str2, @SafeParcelable.Param(mo65742id = 9) String str3, @SafeParcelable.Param(mo65742id = 10) String str4, @SafeParcelable.Param(mo65742id = 11) zzcfo zzcfo, @SafeParcelable.Param(mo65742id = 12) Bundle bundle2, @SafeParcelable.Param(mo65742id = 13) int i2, @SafeParcelable.Param(mo65742id = 14) List list, @SafeParcelable.Param(mo65742id = 15) Bundle bundle3, @SafeParcelable.Param(mo65742id = 16) boolean z, @SafeParcelable.Param(mo65742id = 18) int i3, @SafeParcelable.Param(mo65742id = 19) int i4, @SafeParcelable.Param(mo65742id = 20) float f, @SafeParcelable.Param(mo65742id = 21) String str5, @SafeParcelable.Param(mo65742id = 25) long j, @SafeParcelable.Param(mo65742id = 26) String str6, @SafeParcelable.Param(mo65742id = 27) List list2, @SafeParcelable.Param(mo65742id = 28) String str7, @SafeParcelable.Param(mo65742id = 29) zzbko zzbko, @SafeParcelable.Param(mo65742id = 30) List list3, @SafeParcelable.Param(mo65742id = 31) long j2, @SafeParcelable.Param(mo65742id = 33) String str8, @SafeParcelable.Param(mo65742id = 34) float f2, @SafeParcelable.Param(mo65742id = 40) boolean z2, @SafeParcelable.Param(mo65742id = 35) int i5, @SafeParcelable.Param(mo65742id = 36) int i6, @SafeParcelable.Param(mo65742id = 37) boolean z3, @SafeParcelable.Param(mo65742id = 39) String str9, @SafeParcelable.Param(mo65742id = 41) String str10, @SafeParcelable.Param(mo65742id = 42) boolean z4, @SafeParcelable.Param(mo65742id = 43) int i7, @SafeParcelable.Param(mo65742id = 44) Bundle bundle4, @SafeParcelable.Param(mo65742id = 45) String str11, @SafeParcelable.Param(mo65742id = 46) zzdo zzdo, @SafeParcelable.Param(mo65742id = 47) boolean z5, @SafeParcelable.Param(mo65742id = 48) Bundle bundle5, @SafeParcelable.Param(mo65742id = 49) String str12, @SafeParcelable.Param(mo65742id = 50) String str13, @SafeParcelable.Param(mo65742id = 51) String str14, @SafeParcelable.Param(mo65742id = 52) boolean z6, @SafeParcelable.Param(mo65742id = 53) List list4, @SafeParcelable.Param(mo65742id = 54) String str15, @SafeParcelable.Param(mo65742id = 55) List list5, @SafeParcelable.Param(mo65742id = 56) int i8, @SafeParcelable.Param(mo65742id = 57) boolean z7, @SafeParcelable.Param(mo65742id = 58) boolean z8, @SafeParcelable.Param(mo65742id = 59) boolean z9, @SafeParcelable.Param(mo65742id = 60) ArrayList arrayList, @SafeParcelable.Param(mo65742id = 61) String str16, @SafeParcelable.Param(mo65742id = 63) zzbqr zzbqr, @SafeParcelable.Param(mo65742id = 64) String str17, @SafeParcelable.Param(mo65742id = 65) Bundle bundle6) {
        List list6;
        List list7;
        this.zza = i;
        this.zzb = bundle;
        this.zzc = zzl2;
        this.zzd = zzq2;
        this.zze = str;
        this.zzf = applicationInfo;
        this.zzg = packageInfo;
        this.zzh = str2;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = zzcfo;
        this.zzl = bundle2;
        this.zzm = i2;
        this.zzn = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.zzz = list6;
        this.zzo = bundle3;
        this.zzp = z;
        this.zzq = i3;
        this.zzr = i4;
        this.zzs = f;
        this.zzt = str5;
        this.zzu = j;
        this.zzv = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.zzw = list7;
        this.zzx = str7;
        this.zzy = zzbko;
        this.zzA = j2;
        this.zzB = str8;
        this.zzC = f2;
        this.zzH = z2;
        this.zzD = i5;
        this.zzE = i6;
        this.zzF = z3;
        this.zzG = str9;
        this.zzI = str10;
        this.zzJ = z4;
        this.zzK = i7;
        this.zzL = bundle4;
        this.zzM = str11;
        this.zzN = zzdo;
        this.zzO = z5;
        this.zzP = bundle5;
        this.zzQ = str12;
        this.zzR = str13;
        this.zzS = str14;
        this.zzT = z6;
        this.zzU = list4;
        this.zzV = str15;
        this.zzW = list5;
        this.zzX = i8;
        this.zzY = z7;
        this.zzZ = z8;
        this.zzaa = z9;
        this.zzab = arrayList;
        this.zzac = str16;
        this.zzad = zzbqr;
        this.zzae = str17;
        this.zzaf = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeStringList(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzp);
        SafeParcelWriter.writeInt(parcel, 18, this.zzq);
        SafeParcelWriter.writeInt(parcel, 19, this.zzr);
        SafeParcelWriter.writeFloat(parcel, 20, this.zzs);
        SafeParcelWriter.writeString(parcel, 21, this.zzt, false);
        SafeParcelWriter.writeLong(parcel, 25, this.zzu);
        SafeParcelWriter.writeString(parcel, 26, this.zzv, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.zzw, false);
        SafeParcelWriter.writeString(parcel, 28, this.zzx, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.zzy, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.zzz, false);
        SafeParcelWriter.writeLong(parcel, 31, this.zzA);
        SafeParcelWriter.writeString(parcel, 33, this.zzB, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.zzC);
        SafeParcelWriter.writeInt(parcel, 35, this.zzD);
        SafeParcelWriter.writeInt(parcel, 36, this.zzE);
        SafeParcelWriter.writeBoolean(parcel, 37, this.zzF);
        SafeParcelWriter.writeString(parcel, 39, this.zzG, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.zzH);
        SafeParcelWriter.writeString(parcel, 41, this.zzI, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzJ);
        SafeParcelWriter.writeInt(parcel, 43, this.zzK);
        SafeParcelWriter.writeBundle(parcel, 44, this.zzL, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzM, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.zzN, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzO);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzP, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzQ, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzR, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzS, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.zzT);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.zzU, false);
        SafeParcelWriter.writeString(parcel, 54, this.zzV, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.zzW, false);
        SafeParcelWriter.writeInt(parcel, 56, this.zzX);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzY);
        SafeParcelWriter.writeBoolean(parcel, 58, this.zzZ);
        SafeParcelWriter.writeBoolean(parcel, 59, this.zzaa);
        SafeParcelWriter.writeStringList(parcel, 60, this.zzab, false);
        SafeParcelWriter.writeString(parcel, 61, this.zzac, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.zzad, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.zzae, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.zzaf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
