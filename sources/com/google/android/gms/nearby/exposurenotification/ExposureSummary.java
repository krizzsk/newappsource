package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

@SafeParcelable.Class(creator = "ExposureSummaryCreator")
@Deprecated
public final class ExposureSummary extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ExposureSummary> CREATOR = new zzk();
    @SafeParcelable.Field(getter = "getDaysSinceLastExposure", mo65739id = 1)
    public int zza;
    @SafeParcelable.Field(getter = "getMatchedKeyCount", mo65739id = 2)
    public int zzb;
    @SafeParcelable.Field(getter = "getMaximumRiskScore", mo65739id = 3)
    public int zzc;
    @SafeParcelable.Field(getter = "getAttenuationDurationsInMinutes", mo65739id = 4)
    public int[] zzd;
    @SafeParcelable.Field(getter = "getSummationRiskScore", mo65739id = 5)
    public int zze;

    public static final class ExposureSummaryBuilder {
        private int zza = 0;
        private int zzb = 0;
        private int zzc = 0;
        private int[] zzd = {0, 0, 0};
        private int zze = 0;

        public ExposureSummary build() {
            return new ExposureSummary(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public ExposureSummaryBuilder setAttenuationDurations(int[] iArr) {
            boolean z;
            boolean z2;
            if (r0 == 3) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            for (int i : iArr) {
                if (i >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.checkArgument(z2, "attenuationDuration (%s) must be >= 0", Integer.valueOf(i));
            }
            this.zzd = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        public ExposureSummaryBuilder setDaysSinceLastExposure(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "daysSinceLastExposure (%s) must be >= 0", Integer.valueOf(i));
            this.zza = i;
            return this;
        }

        public ExposureSummaryBuilder setMatchedKeyCount(int i) {
            Preconditions.checkArgument(i >= 0, "matchedKeyCount (%s) must be >= 0", Integer.valueOf(i));
            this.zzb = i;
            return this;
        }

        public ExposureSummaryBuilder setMaximumRiskScore(int i) {
            boolean z;
            if (i < 0 || i > 4096) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "maximumRiskScore (%s) must be >= 0 and <= 4096", Integer.valueOf(i));
            this.zzc = i;
            return this;
        }

        public ExposureSummaryBuilder setSummationRiskScore(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "summationRiskScore (%s) must be >= 0", Integer.valueOf(i));
            this.zze = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ExposureSummary(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3, @SafeParcelable.Param(mo65742id = 4) int[] iArr, @SafeParcelable.Param(mo65742id = 5) int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = iArr;
        this.zze = i4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExposureSummary) {
            ExposureSummary exposureSummary = (ExposureSummary) obj;
            if (!Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(exposureSummary.getDaysSinceLastExposure())) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(exposureSummary.getMatchedKeyCount())) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(exposureSummary.getMaximumRiskScore())) || !Arrays.equals(this.zzd, exposureSummary.getAttenuationDurationsInMinutes()) || !Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(exposureSummary.getSummationRiskScore()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int[] getAttenuationDurationsInMinutes() {
        int[] iArr = this.zzd;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getDaysSinceLastExposure() {
        return this.zza;
    }

    public int getMatchedKeyCount() {
        return this.zzb;
    }

    public int getMaximumRiskScore() {
        return this.zzc;
    }

    public int getSummationRiskScore() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, Integer.valueOf(this.zze));
    }

    public String toString() {
        return String.format(Locale.US, "ExposureSummary<daysSinceLastExposure: %d, matchedKeyCount: %d, maximumRiskScore: %d, attenuationDurations: %s, summationRiskScore: %d>", new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Arrays.toString(this.zzd), Integer.valueOf(this.zze)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getDaysSinceLastExposure());
        SafeParcelWriter.writeInt(parcel, 2, getMatchedKeyCount());
        SafeParcelWriter.writeInt(parcel, 3, getMaximumRiskScore());
        SafeParcelWriter.writeIntArray(parcel, 4, getAttenuationDurationsInMinutes(), false);
        SafeParcelWriter.writeInt(parcel, 5, getSummationRiskScore());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
