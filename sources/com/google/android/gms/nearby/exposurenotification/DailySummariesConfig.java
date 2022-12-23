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

@SafeParcelable.Class(creator = "DailySummariesConfigCreator")
public class DailySummariesConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<DailySummariesConfig> CREATOR = new zzb();
    @SafeParcelable.Field(getter = "internalGetReportTypeWeights", mo65739id = 1)
    public List zza;
    @SafeParcelable.Field(getter = "internalGetInfectiousnessWeights", mo65739id = 2)
    public List zzb;
    @SafeParcelable.Field(getter = "getAttenuationBucketThresholdDb", mo65739id = 3)
    public List zzc;
    @SafeParcelable.Field(getter = "getAttenuationBucketWeights", mo65739id = 4)
    public List zzd;
    @SafeParcelable.Field(getter = "getDaysSinceExposureThreshold", mo65739id = 5)
    public int zze;
    @SafeParcelable.Field(getter = "getMinimumWindowScore", mo65739id = 6)
    public double zzf;

    public static final class DailySummariesConfigBuilder {
        public int zza = 0;
        public double zzb = 0.0d;
        private Double[] zzc = new Double[6];
        private Double[] zzd = new Double[zzj.values().length];
        private List zze;
        private List zzf;

        public DailySummariesConfigBuilder() {
            Double[] dArr = this.zzc;
            Double valueOf = Double.valueOf(0.0d);
            Arrays.fill(dArr, valueOf);
            Arrays.fill(this.zzd, valueOf);
        }

        private static void zza(List list, int i, String str) {
            boolean z;
            boolean z2;
            if (list != null) {
                z = true;
            } else {
                z = false;
            }
            Locale locale = Locale.ENGLISH;
            Preconditions.checkArgument(z, String.format(locale, "%s must not be null", new Object[]{str}));
            if (list.size() == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, String.format(locale, "%s must must contains %d elements", new Object[]{str, Integer.valueOf(i)}));
        }

        private static void zzb(double d, String str) {
            boolean z;
            if (d < 0.0d || d > 2.5d) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, String.format(Locale.ENGLISH, "Element value of %s must between 0 ~ 2.5", new Object[]{str}));
        }

        public DailySummariesConfig build() {
            boolean z;
            boolean z2 = true;
            if (this.zze != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Must set attenuationBucketThresholdDb");
            if (this.zzf == null) {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "Must set attenuationBucketWeights");
            return new DailySummariesConfig(Arrays.asList(this.zzc), Arrays.asList(this.zzd), this.zze, this.zzf, this.zza, this.zzb);
        }

        public DailySummariesConfigBuilder setAttenuationBuckets(List<Integer> list, List<Double> list2) {
            boolean z;
            boolean z2;
            zza.zza();
            zza(list, 3, "attenuationBucketThresholdDb");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).intValue() < 0 || list.get(i).intValue() > 255) {
                    z = false;
                } else {
                    z = true;
                }
                Preconditions.checkArgument(z, "Element of attenuationBucketThreshold must between 0 ~ 255");
                if (i != 0) {
                    int i2 = i - 1;
                    if (list.get(i2).intValue() < list.get(i).intValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Preconditions.checkArgument(z2, String.format(Locale.ENGLISH, "attenuationBucketThresholdDb of index %d must be larger than index %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
                }
            }
            this.zze = new ArrayList(list);
            zza.zza();
            zza(list2, 4, "attenuationBucketWeights");
            for (Double doubleValue : list2) {
                zzb(doubleValue.doubleValue(), "attenuationBucketWeights");
            }
            this.zzf = new ArrayList(list2);
            return this;
        }

        public DailySummariesConfigBuilder setDaysSinceExposureThreshold(int i) {
            Preconditions.checkArgument(i >= 0, "daysSinceExposureThreshold must not be negative");
            this.zza = i;
            return this;
        }

        public DailySummariesConfigBuilder setInfectiousnessWeight(@Infectiousness int i, double d) {
            zzj zza2 = zzj.zza(i);
            boolean z = false;
            if (!(zza2 == null || zza2 == zzj.INFECTIOUSNESS_NONE)) {
                z = true;
            }
            Preconditions.checkArgument(z, "Incorrect value of infectiousness");
            zzb(d, "infectiousnessWeights");
            this.zzd[i] = Double.valueOf(d);
            return this;
        }

        public DailySummariesConfigBuilder setMinimumWindowScore(double d) {
            Preconditions.checkArgument(d >= 0.0d, "minimumWindowScore must not be negative");
            this.zzb = d;
            return this;
        }

        public DailySummariesConfigBuilder setReportTypeWeight(@ReportType int i, double d) {
            boolean z = false;
            if (i > 0 && i < 5) {
                z = true;
            }
            Preconditions.checkArgument(z, "Incorrect value of reportType");
            zzb(d, "reportTypeWeights");
            this.zzc[i] = Double.valueOf(d);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DailySummariesConfig(@SafeParcelable.Param(mo65742id = 1) List list, @SafeParcelable.Param(mo65742id = 2) List list2, @SafeParcelable.Param(mo65742id = 3) List list3, @SafeParcelable.Param(mo65742id = 4) List list4, @SafeParcelable.Param(mo65742id = 5) int i, @SafeParcelable.Param(mo65742id = 6) double d) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = list3;
        this.zzd = list4;
        this.zze = i;
        this.zzf = d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DailySummariesConfig) {
            DailySummariesConfig dailySummariesConfig = (DailySummariesConfig) obj;
            if (!this.zza.equals(dailySummariesConfig.zza) || !this.zzb.equals(dailySummariesConfig.zzb) || !this.zzc.equals(dailySummariesConfig.zzc) || !this.zzd.equals(dailySummariesConfig.zzd) || this.zze != dailySummariesConfig.zze || this.zzf != dailySummariesConfig.zzf) {
                return false;
            }
            return true;
        }
        return false;
    }

    public List<Integer> getAttenuationBucketThresholdDb() {
        return new ArrayList(this.zzc);
    }

    public List<Double> getAttenuationBucketWeights() {
        return new ArrayList(this.zzd);
    }

    public int getDaysSinceExposureThreshold() {
        return this.zze;
    }

    public Map<Integer, Double> getInfectiousnessWeights() {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.zzb.size(); i++) {
            if (i != 0) {
                hashMap.put(Integer.valueOf(i), (Double) this.zzb.get(i));
            }
        }
        return hashMap;
    }

    public double getMinimumWindowScore() {
        return this.zzf;
    }

    public Map<Integer, Double> getReportTypeWeights() {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.zza.size(); i++) {
            if (!(i == 0 || i == 5)) {
                hashMap.put(Integer.valueOf(i), (Double) this.zza.get(i));
            }
        }
        return hashMap;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Integer.valueOf(this.zze), Double.valueOf(this.zzf));
    }

    public String toString() {
        return String.format(Locale.US, "DailySummariesConfig<reportTypeWeights: %s, infectiousnessWeights: %s, attenuationBucketThresholdDb: %s, attenuationBucketWeights: %sdaysSinceExposureThreshold: %d,minimumWindowScore: %.3f>", new Object[]{this.zza, this.zzb, this.zzc, this.zzd, Integer.valueOf(this.zze), Double.valueOf(this.zzf)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDoubleList(parcel, 1, new ArrayList(this.zza), false);
        SafeParcelWriter.writeDoubleList(parcel, 2, new ArrayList(this.zzb), false);
        SafeParcelWriter.writeIntegerList(parcel, 3, getAttenuationBucketThresholdDb(), false);
        SafeParcelWriter.writeDoubleList(parcel, 4, getAttenuationBucketWeights(), false);
        SafeParcelWriter.writeInt(parcel, 5, getDaysSinceExposureThreshold());
        SafeParcelWriter.writeDouble(parcel, 6, getMinimumWindowScore());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
