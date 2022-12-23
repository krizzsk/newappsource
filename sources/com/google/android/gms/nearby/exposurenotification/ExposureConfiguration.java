package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

@SafeParcelable.Class(creator = "ExposureConfigurationCreator")
@Deprecated
public final class ExposureConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExposureConfiguration> CREATOR = new zze();
    @SafeParcelable.Field(getter = "getMinimumRiskScore", mo65739id = 1)
    public int zza;
    @SafeParcelable.Field(getter = "getAttenuationScores", mo65739id = 2)
    public int[] zzb;
    @SafeParcelable.Field(getter = "getAttenuationWeight", mo65739id = 3)
    public int zzc;
    @SafeParcelable.Field(getter = "getDaysSinceLastExposureScores", mo65739id = 4)
    public int[] zzd;
    @SafeParcelable.Field(getter = "getDaysSinceLastExposureWeight", mo65739id = 5)
    public int zze;
    @SafeParcelable.Field(getter = "getDurationScores", mo65739id = 6)
    public int[] zzf;
    @SafeParcelable.Field(getter = "getDurationWeight", mo65739id = 7)
    public int zzg;
    @SafeParcelable.Field(getter = "getTransmissionRiskScores", mo65739id = 8)
    public int[] zzh;
    @SafeParcelable.Field(getter = "getTransmissionRiskWeight", mo65739id = 9)
    public int zzi;
    @SafeParcelable.Field(getter = "getDurationAtAttenuationThresholds", mo65739id = 10)
    public int[] zzj;

    public static final class ExposureConfigurationBuilder {
        private int zza = 4;
        private int[] zzb = {4, 4, 4, 4, 4, 4, 4, 4};
        private int zzc = 50;
        private int[] zzd = {4, 4, 4, 4, 4, 4, 4, 4};
        private int zze = 50;
        private int[] zzf = {4, 4, 4, 4, 4, 4, 4, 4};
        private int zzg = 50;
        private int[] zzh = {4, 4, 4, 4, 4, 4, 4, 4};
        private int zzi = 50;
        private int[] zzj = {50, 74};

        public ExposureConfiguration build() {
            return new ExposureConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
        }

        public ExposureConfigurationBuilder setAttenuationScores(int... iArr) {
            boolean z;
            boolean z2;
            if (r0 == 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "attenuationScores (%s) must have exactly 8 elements", Arrays.toString(iArr));
            for (int i : iArr) {
                if (i < 0 || i > 8) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Preconditions.checkArgument(z2, "attenuationScore (%s) must be >= 0 and <= 8", Integer.valueOf(i));
            }
            this.zzb = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        public ExposureConfigurationBuilder setAttenuationWeight(int i) {
            boolean z;
            if (i < 0 || i > 100) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "attenuationWeight (%s) must be >= 0 and <= 100", Integer.valueOf(i));
            this.zzc = i;
            return this;
        }

        public ExposureConfigurationBuilder setDaysSinceLastExposureScores(int... iArr) {
            boolean z;
            boolean z2;
            if (r0 == 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "daysSinceLastExposureScores (%s) must have exactly 8 elements", Arrays.toString(iArr));
            for (int i : iArr) {
                if (i < 0 || i > 8) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Preconditions.checkArgument(z2, "daysSinceLastExposureScore (%s) must be >= 0 and <= 8", Integer.valueOf(i));
            }
            this.zzd = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        public ExposureConfigurationBuilder setDaysSinceLastExposureWeight(int i) {
            boolean z;
            if (i < 0 || i > 100) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "daysSinceLastExposureWeight (%s) must be >= 0 and <= 100", Integer.valueOf(i));
            this.zze = i;
            return this;
        }

        public ExposureConfigurationBuilder setDurationAtAttenuationThresholds(int... iArr) {
            boolean z;
            boolean z2;
            boolean z3;
            if (r0 == 2) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "durationAtAttenuationThresholds (%s) must have exactly 2 elements", Arrays.toString(iArr));
            for (int i : iArr) {
                if (i < 0 || i > 255) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                Preconditions.checkArgument(z3, "durationAtAttenuationThreshold (%s) must be >= 0 and <= 255", Integer.valueOf(i));
            }
            int i2 = iArr[0];
            if (i2 <= iArr[1]) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "durationAtAttenuationThresholds[0] (%s) must be <= than durationAtAttenuationThresholds[1] (%s)", Integer.valueOf(i2), Integer.valueOf(iArr[1]));
            this.zzj = iArr;
            return this;
        }

        public ExposureConfigurationBuilder setDurationScores(int... iArr) {
            boolean z;
            boolean z2;
            if (r0 == 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "durationScores (%s) must have exactly 8 elements", Arrays.toString(iArr));
            for (int i : iArr) {
                if (i < 0 || i > 8) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Preconditions.checkArgument(z2, "durationScore (%s) must be >= 0 and <= 8", Integer.valueOf(i));
            }
            this.zzf = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        public ExposureConfigurationBuilder setDurationWeight(int i) {
            boolean z;
            if (i < 0 || i > 100) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "durationWeight (%s) must be >= 0 and <= 100", Integer.valueOf(i));
            this.zzg = i;
            return this;
        }

        public ExposureConfigurationBuilder setMinimumRiskScore(int i) {
            boolean z;
            if (i <= 0 || i > 4096) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "minimumRiskScore (%s) must be >= 1 and <= 4096", Integer.valueOf(i));
            this.zza = i;
            return this;
        }

        public ExposureConfigurationBuilder setTransmissionRiskScores(int... iArr) {
            boolean z;
            boolean z2;
            if (r0 == 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "transmissionRiskScores (%s) must have exactly 8 elements", Arrays.toString(iArr));
            for (int i : iArr) {
                if (i < 0 || i > 8) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Preconditions.checkArgument(z2, "transmissionRiskScore (%s) must be >= 0 and <= 8", Integer.valueOf(i));
            }
            this.zzh = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        public ExposureConfigurationBuilder setTransmissionRiskWeight(int i) {
            boolean z;
            if (i < 0 || i > 100) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "transmissionRiskWeight (%s) must be >= 0 and <= 100", Integer.valueOf(i));
            this.zzi = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ExposureConfiguration(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int[] iArr, @SafeParcelable.Param(mo65742id = 3) int i2, @SafeParcelable.Param(mo65742id = 4) int[] iArr2, @SafeParcelable.Param(mo65742id = 5) int i3, @SafeParcelable.Param(mo65742id = 6) int[] iArr3, @SafeParcelable.Param(mo65742id = 7) int i4, @SafeParcelable.Param(mo65742id = 8) int[] iArr4, @SafeParcelable.Param(mo65742id = 9) int i5, @SafeParcelable.Param(mo65742id = 10) int[] iArr5) {
        this.zza = i;
        this.zzb = iArr;
        this.zzc = i2;
        this.zzd = iArr2;
        this.zze = i3;
        this.zzf = iArr3;
        this.zzg = i4;
        this.zzh = iArr4;
        this.zzi = i5;
        this.zzj = iArr5;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExposureConfiguration) {
            ExposureConfiguration exposureConfiguration = (ExposureConfiguration) obj;
            if (!Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(exposureConfiguration.getMinimumRiskScore())) || !Arrays.equals(this.zzb, exposureConfiguration.getAttenuationScores()) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(exposureConfiguration.getAttenuationWeight())) || !Arrays.equals(this.zzd, exposureConfiguration.getDaysSinceLastExposureScores()) || !Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(exposureConfiguration.getDaysSinceLastExposureWeight())) || !Arrays.equals(this.zzf, exposureConfiguration.getDurationScores()) || !Objects.equal(Integer.valueOf(this.zzg), Integer.valueOf(exposureConfiguration.getDurationWeight())) || !Arrays.equals(this.zzh, exposureConfiguration.getTransmissionRiskScores()) || !Objects.equal(Integer.valueOf(this.zzi), Integer.valueOf(exposureConfiguration.getTransmissionRiskWeight())) || !Arrays.equals(this.zzj, exposureConfiguration.getDurationAtAttenuationThresholds())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int[] getAttenuationScores() {
        int[] iArr = this.zzb;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getAttenuationWeight() {
        return this.zzc;
    }

    public int[] getDaysSinceLastExposureScores() {
        int[] iArr = this.zzd;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getDaysSinceLastExposureWeight() {
        return this.zze;
    }

    public int[] getDurationAtAttenuationThresholds() {
        int[] iArr = this.zzj;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int[] getDurationScores() {
        int[] iArr = this.zzf;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getDurationWeight() {
        return this.zzg;
    }

    public int getMinimumRiskScore() {
        return this.zza;
    }

    public int[] getTransmissionRiskScores() {
        int[] iArr = this.zzh;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getTransmissionRiskWeight() {
        return this.zzi;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Integer.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Integer.valueOf(this.zzi), this.zzj);
    }

    public String toString() {
        return String.format(Locale.US, "ExposureConfiguration<minimumRiskScore: %d, attenuationScores: %s, attenuationWeight: %d, daysSinceLastExposureScores: %s, daysSinceLastExposureWeight: %d, durationScores: %s, durationWeight: %d, transmissionRiskScores: %s, transmissionRiskWeight: %d, durationAtAttenuationThresholds: %s>", new Object[]{Integer.valueOf(this.zza), Arrays.toString(this.zzb), Integer.valueOf(this.zzc), Arrays.toString(this.zzd), Integer.valueOf(this.zze), Arrays.toString(this.zzf), Integer.valueOf(this.zzg), Arrays.toString(this.zzh), Integer.valueOf(this.zzi), Arrays.toString(this.zzj)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getMinimumRiskScore());
        SafeParcelWriter.writeIntArray(parcel, 2, getAttenuationScores(), false);
        SafeParcelWriter.writeInt(parcel, 3, getAttenuationWeight());
        SafeParcelWriter.writeIntArray(parcel, 4, getDaysSinceLastExposureScores(), false);
        SafeParcelWriter.writeInt(parcel, 5, getDaysSinceLastExposureWeight());
        SafeParcelWriter.writeIntArray(parcel, 6, getDurationScores(), false);
        SafeParcelWriter.writeInt(parcel, 7, getDurationWeight());
        SafeParcelWriter.writeIntArray(parcel, 8, getTransmissionRiskScores(), false);
        SafeParcelWriter.writeInt(parcel, 9, getTransmissionRiskWeight());
        SafeParcelWriter.writeIntArray(parcel, 10, getDurationAtAttenuationThresholds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
