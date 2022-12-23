package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

@SafeParcelable.Class(creator = "ExposureInformationCreator")
@Deprecated
public final class ExposureInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExposureInformation> CREATOR = new zzf();
    @SafeParcelable.Field(getter = "getDateMillisSinceEpoch", mo65739id = 1)
    public long zza;
    @SafeParcelable.Field(getter = "getDurationMinutes", mo65739id = 2)
    public int zzb;
    @SafeParcelable.Field(getter = "getAttenuationValue", mo65739id = 3)
    public int zzc;
    @SafeParcelable.Field(getter = "getTransmissionRiskLevel", mo65739id = 4)
    @RiskLevel
    public int zzd;
    @SafeParcelable.Field(getter = "getTotalRiskScore", mo65739id = 5)
    public int zze;
    @SafeParcelable.Field(getter = "getAttenuationDurationsInMinutes", mo65739id = 6)
    public int[] zzf;

    public static final class ExposureInformationBuilder {
        private long zza = 0;
        private int zzb = 0;
        private int zzc = 0;
        @RiskLevel
        private int zzd = 0;
        private int zze = 0;
        private int[] zzf = {0, 0};

        public ExposureInformation build() {
            return new ExposureInformation(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
        }

        public ExposureInformationBuilder setAttenuationDurations(int[] iArr) {
            boolean z;
            for (int i : iArr) {
                if (i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "attenuationDuration (%s) must be >= 0", Integer.valueOf(i));
            }
            this.zzf = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        public ExposureInformationBuilder setAttenuationValue(int i) {
            boolean z;
            if (i < 0 || i > 255) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "attenuationValue (%s) must be >= 0 and <= 255", Integer.valueOf(i));
            this.zzc = i;
            return this;
        }

        public ExposureInformationBuilder setDateMillisSinceEpoch(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "dateMillisSinceEpoch (%s) must be >= 0", Long.valueOf(j));
            this.zza = j;
            return this;
        }

        public ExposureInformationBuilder setDurationMinutes(int i) {
            boolean z;
            boolean z2;
            if (i % 5 == 0) {
                z = true;
            } else {
                z = false;
            }
            Integer valueOf = Integer.valueOf(i);
            Preconditions.checkArgument(z, "durationMinutes (%s) must be an increment of 5", valueOf);
            if (i <= 30) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "durationMinutes (%s) must be <= 30", valueOf);
            this.zzb = i;
            return this;
        }

        public ExposureInformationBuilder setTotalRiskScore(int i) {
            boolean z;
            if (i < 0 || i > 4096) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "totalRiskScore (%s) must be >= 0 and <= 4096", Integer.valueOf(i));
            this.zze = i;
            return this;
        }

        public ExposureInformationBuilder setTransmissionRiskLevel(@RiskLevel int i) {
            boolean z;
            if (i < 0 || i > 8) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "transmissionRiskLevel (%s) must be >= 0 and <= 8", Integer.valueOf(i));
            this.zzd = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ExposureInformation(@SafeParcelable.Param(mo65742id = 1) long j, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) int i2, @SafeParcelable.Param(mo65742id = 4) int i3, @SafeParcelable.Param(mo65742id = 5) int i4, @SafeParcelable.Param(mo65742id = 6) int[] iArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = iArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExposureInformation) {
            ExposureInformation exposureInformation = (ExposureInformation) obj;
            if (!Objects.equal(Long.valueOf(this.zza), Long.valueOf(exposureInformation.getDateMillisSinceEpoch())) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(exposureInformation.getDurationMinutes())) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(exposureInformation.getAttenuationValue())) || !Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(exposureInformation.getTransmissionRiskLevel())) || !Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(exposureInformation.getTotalRiskScore())) || !Arrays.equals(this.zzf, exposureInformation.getAttenuationDurationsInMinutes())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int[] getAttenuationDurationsInMinutes() {
        int[] iArr = this.zzf;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getAttenuationValue() {
        return this.zzc;
    }

    public long getDateMillisSinceEpoch() {
        return this.zza;
    }

    public int getDurationMinutes() {
        return this.zzb;
    }

    public int getTotalRiskScore() {
        return this.zze;
    }

    @RiskLevel
    public int getTransmissionRiskLevel() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf);
    }

    public String toString() {
        return String.format(Locale.US, "ExposureInformation<date: %s, dateMillisSinceEpoch: %d, durationMinutes: %d, attenuationValue: %d, transmissionRiskLevel: %d, totalRiskScore: %d, attenuationDurations: %s>", new Object[]{new Date(this.zza), Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), Arrays.toString(this.zzf)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getDateMillisSinceEpoch());
        SafeParcelWriter.writeInt(parcel, 2, getDurationMinutes());
        SafeParcelWriter.writeInt(parcel, 3, getAttenuationValue());
        SafeParcelWriter.writeInt(parcel, 4, getTransmissionRiskLevel());
        SafeParcelWriter.writeInt(parcel, 5, getTotalRiskScore());
        SafeParcelWriter.writeIntArray(parcel, 6, getAttenuationDurationsInMinutes(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
