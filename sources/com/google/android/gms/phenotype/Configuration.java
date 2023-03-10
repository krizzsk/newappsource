package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.appboy.support.StringUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import p001a0.C0016g;

@KeepForSdk
@SafeParcelable.Class(creator = "ConfigurationCreator")
@SafeParcelable.Reserved({1})
public class Configuration extends AbstractSafeParcelable implements Comparable<Configuration> {
    @KeepForSdk
    public static final Parcelable.Creator<Configuration> CREATOR = new zzc();
    @SafeParcelable.Field(mo65739id = 2)
    private final int zzc;
    @SafeParcelable.Field(mo65739id = 3)
    private final zzi[] zzd;
    @SafeParcelable.Field(mo65739id = 4)
    private final String[] zze;
    private final Map<String, zzi> zzf = new TreeMap();

    @SafeParcelable.Constructor
    public Configuration(@SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) zzi[] zziArr, @SafeParcelable.Param(mo65742id = 4) String[] strArr) {
        this.zzc = i;
        this.zzd = zziArr;
        for (zzi zzi : zziArr) {
            this.zzf.put(zzi.name, zzi);
        }
        this.zze = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return this.zzc - ((Configuration) obj).zzc;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            return this.zzc == configuration.zzc && zzn.equals(this.zzf, configuration.zzf) && Arrays.equals(this.zze, configuration.zze);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        C0016g.m42z(sb, this.zzc, ", ", "(");
        for (zzi append : this.zzf.values()) {
            sb.append(append);
            sb.append(", ");
        }
        C16530d.m42019l(sb, ")", ", ", "(");
        String[] strArr = this.zze;
        if (strArr != null) {
            for (String append2 : strArr) {
                sb.append(append2);
                sb.append(", ");
            }
        } else {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        }
        return C0016g.m31o(sb, ")", ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzd, i, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
