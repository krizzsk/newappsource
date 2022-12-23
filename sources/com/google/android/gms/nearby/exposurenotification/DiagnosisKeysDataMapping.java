package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@SafeParcelable.Class(creator = "DiagnosisKeysDataMappingCreator")
public class DiagnosisKeysDataMapping extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<DiagnosisKeysDataMapping> CREATOR = new zzd();
    @SafeParcelable.Field(getter = "internalGetDaysSinceOnsetToInfectiousness", mo65739id = 1)
    public List zza;
    @SafeParcelable.Field(getter = "getReportTypeWhenMissing", mo65739id = 2)
    @ReportType
    public int zzb;
    @SafeParcelable.Field(getter = "getInfectiousnessWhenDaysSinceOnsetMissing", mo65739id = 3)
    @Infectiousness
    public int zzc;

    public static final class DiagnosisKeysDataMappingBuilder {
        private List zza;
        @ReportType
        private int zzb = 0;
        @Infectiousness
        private Integer zzc;

        public DiagnosisKeysDataMapping build() {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (this.zza != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Must set daysSinceOnsetToInfectiousness");
            if (this.zzb != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "Must set reportTypeWhenMissing");
            if (this.zzc == null) {
                z3 = false;
            }
            Preconditions.checkArgument(z3, "Must set infectiousnessWhenDaysSinceOnsetMissing");
            return new DiagnosisKeysDataMapping(this.zza, this.zzb, this.zzc.intValue());
        }

        public DiagnosisKeysDataMappingBuilder setDaysSinceOnsetToInfectiousness(Map<Integer, Integer> map) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            if (map != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "daysSinceOnsetToInfectiousness must not be null.");
            if (map.size() <= 29) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "the size of daysSinceOnsetToInfectiousness exceeds maximum size %d.", 29);
            Integer[] numArr = new Integer[29];
            Arrays.fill(numArr, 0);
            for (Map.Entry next : map.entrySet()) {
                int intValue = ((Integer) next.getKey()).intValue();
                int intValue2 = ((Integer) next.getValue()).intValue();
                if (Math.abs(intValue) <= 14) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Preconditions.checkArgument(z3, "Invalid day since onset %d", Integer.valueOf(intValue));
                if (zzj.zza(intValue2) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Integer valueOf = Integer.valueOf(intValue2);
                Preconditions.checkArgument(z4, "Invalid value of Infectiousness %d", valueOf);
                numArr[intValue + 14] = valueOf;
            }
            this.zza = Arrays.asList(numArr);
            return this;
        }

        public DiagnosisKeysDataMappingBuilder setInfectiousnessWhenDaysSinceOnsetMissing(@Infectiousness int i) {
            boolean z;
            if (zzj.zza(i) != null) {
                z = true;
            } else {
                z = false;
            }
            Integer valueOf = Integer.valueOf(i);
            Preconditions.checkArgument(z, "Invalid value of Infectiousness %d", valueOf);
            this.zzc = valueOf;
            return this;
        }

        public DiagnosisKeysDataMappingBuilder setReportTypeWhenMissing(@ReportType int i) {
            boolean z;
            boolean z2;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Invalid reportTypeWhenMissing value");
            if (i < 0 || i > 5) {
                z2 = false;
            } else {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "Invalid value of ReportType %d", Integer.valueOf(i));
            this.zzb = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DiagnosisKeysDataMapping(@SafeParcelable.Param(mo65742id = 1) List list, @SafeParcelable.Param(mo65742id = 2) @ReportType int i, @SafeParcelable.Param(mo65742id = 3) @Infectiousness int i2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DiagnosisKeysDataMapping) {
            DiagnosisKeysDataMapping diagnosisKeysDataMapping = (DiagnosisKeysDataMapping) obj;
            if (this.zza.equals(diagnosisKeysDataMapping.zza) && this.zzb == diagnosisKeysDataMapping.zzb && this.zzc == diagnosisKeysDataMapping.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public Map<Integer, Integer> getDaysSinceOnsetToInfectiousness() {
        HashMap hashMap = new HashMap((int) Math.ceil(38.666666666666664d));
        for (int i = 0; i < this.zza.size(); i++) {
            hashMap.put(Integer.valueOf(i - 14), (Integer) this.zza.get(i));
        }
        return hashMap;
    }

    @Infectiousness
    public int getInfectiousnessWhenDaysSinceOnsetMissing() {
        return this.zzc;
    }

    @ReportType
    public int getReportTypeWhenMissing() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public String toString() {
        return String.format(Locale.US, "DiagnosisKeysDataMapping<daysSinceOnsetToInfectiousness: %s, reportTypeWhenMissing: %d, infectiousnessWhenDaysSinceOnsetMissing: %d>", new Object[]{getDaysSinceOnsetToInfectiousness(), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, new ArrayList(this.zza), false);
        SafeParcelWriter.writeInt(parcel, 2, getReportTypeWhenMissing());
        SafeParcelWriter.writeInt(parcel, 3, getInfectiousnessWhenDaysSinceOnsetMissing());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
