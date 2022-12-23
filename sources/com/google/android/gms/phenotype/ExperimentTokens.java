package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.appboy.support.StringUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001a0.C0016g;
import p358af.C13437d;

@KeepForSdk
@SafeParcelable.Class(creator = "ExperimentTokensCreator")
@SafeParcelable.Reserved({1})
public class ExperimentTokens extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new zzh();
    private static final zza zzaa = new zzg();
    private static final byte[][] zzn;
    private static final ExperimentTokens zzo;
    private static final zza zzx = new zzd();
    private static final zza zzy = new zze();
    private static final zza zzz = new zzf();
    @SafeParcelable.Field(mo65739id = 2)
    private final String zzp;
    @SafeParcelable.Field(mo65739id = 3)
    private final byte[] zzq;
    @SafeParcelable.Field(mo65739id = 4)
    private final byte[][] zzr;
    @SafeParcelable.Field(mo65739id = 5)
    private final byte[][] zzs;
    @SafeParcelable.Field(mo65739id = 6)
    private final byte[][] zzt;
    @SafeParcelable.Field(mo65739id = 7)
    private final byte[][] zzu;
    @SafeParcelable.Field(mo65739id = 8)
    private final int[] zzv;
    @SafeParcelable.Field(mo65739id = 9)
    private final byte[][] zzw;

    public interface zza {
    }

    static {
        byte[][] bArr = new byte[0][];
        zzn = bArr;
        zzo = new ExperimentTokens("", (byte[]) null, bArr, bArr, bArr, bArr, (int[]) null, (byte[][]) null);
    }

    @SafeParcelable.Constructor
    public ExperimentTokens(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) byte[] bArr, @SafeParcelable.Param(mo65742id = 4) byte[][] bArr2, @SafeParcelable.Param(mo65742id = 5) byte[][] bArr3, @SafeParcelable.Param(mo65742id = 6) byte[][] bArr4, @SafeParcelable.Param(mo65742id = 7) byte[][] bArr5, @SafeParcelable.Param(mo65742id = 8) int[] iArr, @SafeParcelable.Param(mo65742id = 9) byte[][] bArr6) {
        this.zzp = str;
        this.zzq = bArr;
        this.zzr = bArr2;
        this.zzs = bArr3;
        this.zzt = bArr4;
        this.zzu = bArr5;
        this.zzv = iArr;
        this.zzw = bArr6;
    }

    private static List<Integer> zza(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> zza(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zza(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            return zzn.equals(this.zzp, experimentTokens.zzp) && Arrays.equals(this.zzq, experimentTokens.zzq) && zzn.equals(zza(this.zzr), zza(experimentTokens.zzr)) && zzn.equals(zza(this.zzs), zza(experimentTokens.zzs)) && zzn.equals(zza(this.zzt), zza(experimentTokens.zzt)) && zzn.equals(zza(this.zzu), zza(experimentTokens.zzu)) && zzn.equals(zza(this.zzv), zza(experimentTokens.zzv)) && zzn.equals(zza(this.zzw), zza(experimentTokens.zzw));
        }
    }

    public String toString() {
        StringBuilder n = C13437d.m33708n("ExperimentTokens", "(");
        String str = this.zzp;
        n.append(str == null ? StringUtils.NULL_USER_ID_SUBSTITUTE_STRING : C25541a.m63875e(C0016g.m25h(str, 2), "'", str, "'"));
        n.append(", ");
        byte[] bArr = this.zzq;
        n.append("direct");
        n.append("=");
        if (bArr == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append("'");
            n.append(Base64.encodeToString(bArr, 3));
            n.append("'");
        }
        n.append(", ");
        zza(n, "GAIA", this.zzr);
        n.append(", ");
        zza(n, "PSEUDO", this.zzs);
        n.append(", ");
        zza(n, "ALWAYS", this.zzt);
        n.append(", ");
        zza(n, "OTHER", this.zzu);
        n.append(", ");
        int[] iArr = this.zzv;
        n.append("weak");
        n.append("=");
        if (iArr == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    n.append(", ");
                }
                n.append(i2);
                i++;
                z = false;
            }
            n.append(")");
        }
        n.append(", ");
        zza(n, "directs", this.zzw);
        n.append(")");
        return n.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzp, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzq, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.zzr, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.zzs, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.zzt, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.zzu, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.zzv, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.zzw, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
