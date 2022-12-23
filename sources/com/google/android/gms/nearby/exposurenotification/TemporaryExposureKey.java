package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Hex;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@SafeParcelable.Class(creator = "TemporaryExposureKeyCreator")
public final class TemporaryExposureKey extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TemporaryExposureKey> CREATOR = new zzp();
    public static final int DAYS_SINCE_ONSET_OF_SYMPTOMS_UNKNOWN = Integer.MAX_VALUE;
    @SafeParcelable.Field(getter = "getKeyData", mo65739id = 1)
    public byte[] zza;
    @SafeParcelable.Field(getter = "getRollingStartIntervalNumber", mo65739id = 2)
    public int zzb;
    @SafeParcelable.Field(getter = "getTransmissionRiskLevel", mo65739id = 3)
    @RiskLevel
    public int zzc;
    @SafeParcelable.Field(getter = "getRollingPeriod", mo65739id = 4)
    public int zzd;
    @SafeParcelable.Field(getter = "getReportType", mo65739id = 5)
    @ReportType
    public int zze;
    @SafeParcelable.Field(getter = "getDaysSinceOnsetOfSymptoms", mo65739id = 6)
    public int zzf;
    @SafeParcelable.Field(getter = "getVariantOfConcern", mo65739id = 7)
    public int zzg;

    public static final class TemporaryExposureKeyBuilder {
        private byte[] zza = new byte[0];
        private int zzb = 0;
        @RiskLevel
        private int zzc = 0;
        private int zzd = 1;
        @ReportType
        private int zze = 0;
        private int zzf = Integer.MAX_VALUE;
        private int zzg = 0;

        public TemporaryExposureKey build() {
            return new TemporaryExposureKey(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        public TemporaryExposureKeyBuilder setDaysSinceOnsetOfSymptoms(int i) {
            boolean z;
            if (i < -14 || i > 14) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "daysSinceOnsetOfSymptoms (%d) must be >= -14 and <= 14", Integer.valueOf(i));
            this.zzf = i;
            return this;
        }

        public TemporaryExposureKeyBuilder setKeyData(byte[] bArr) {
            this.zza = Arrays.copyOf(bArr, bArr.length);
            return this;
        }

        public TemporaryExposureKeyBuilder setReportType(@ReportType int i) {
            boolean z;
            if (i < 0 || i > 5) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, String.format(Locale.getDefault(), "reportType (%d) is invalid", new Object[]{Integer.valueOf(i)}));
            this.zze = i;
            return this;
        }

        public TemporaryExposureKeyBuilder setRollingPeriod(int i) {
            Preconditions.checkArgument(i > 0, "rollingPeriod (%s) must be > 0", Integer.valueOf(i));
            this.zzd = i;
            return this;
        }

        public TemporaryExposureKeyBuilder setRollingStartIntervalNumber(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "rollingStartIntervalNumber (%s) must be >= 0", Integer.valueOf(i));
            this.zzb = i;
            return this;
        }

        public TemporaryExposureKeyBuilder setTransmissionRiskLevel(@RiskLevel int i) {
            boolean z;
            if (i < 0 || i > 8) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "transmissionRiskLevel (%s) must be >= 0 and <= 8", Integer.valueOf(i));
            this.zzc = i;
            return this;
        }

        public TemporaryExposureKeyBuilder setVariantOfConcern(@VariantOfConcern int i) {
            boolean z;
            if (i < 0 || i > 4) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, String.format(Locale.getDefault(), "variantOfConcern (%d) is not allowed", new Object[]{Integer.valueOf(i)}));
            this.zzg = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public TemporaryExposureKey(@SafeParcelable.Param(mo65742id = 1) byte[] bArr, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) @RiskLevel int i2, @SafeParcelable.Param(mo65742id = 4) int i3, @SafeParcelable.Param(mo65742id = 5) @ReportType int i4, @SafeParcelable.Param(mo65742id = 6) int i5, @SafeParcelable.Param(mo65742id = 7) int i6) {
        this.zza = bArr;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TemporaryExposureKey) {
            TemporaryExposureKey temporaryExposureKey = (TemporaryExposureKey) obj;
            if (!Arrays.equals(this.zza, temporaryExposureKey.getKeyData()) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(temporaryExposureKey.getRollingStartIntervalNumber())) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(temporaryExposureKey.getTransmissionRiskLevel())) || !Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(temporaryExposureKey.getRollingPeriod())) || !Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(temporaryExposureKey.getReportType())) || this.zzf != temporaryExposureKey.zzf || this.zzg != temporaryExposureKey.zzg) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int getDaysSinceOnsetOfSymptoms() {
        return this.zzf;
    }

    public byte[] getKeyData() {
        byte[] bArr = this.zza;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @ReportType
    public int getReportType() {
        return this.zze;
    }

    public int getRollingPeriod() {
        return this.zzd;
    }

    public int getRollingStartIntervalNumber() {
        return this.zzb;
    }

    @RiskLevel
    public int getTransmissionRiskLevel() {
        return this.zzc;
    }

    public int getVariantOfConcern() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg));
    }

    public String toString() {
        Object obj;
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        objArr[0] = Hex.bytesToStringLowercase(this.zza);
        objArr[1] = new Date(TimeUnit.MINUTES.toMillis(((long) this.zzb) * 10));
        objArr[2] = Integer.valueOf(this.zzc);
        objArr[3] = Integer.valueOf(this.zzd);
        objArr[4] = Integer.valueOf(this.zze);
        int i = this.zzf;
        if (i == Integer.MAX_VALUE) {
            obj = "unknown";
        } else {
            obj = Integer.valueOf(i);
        }
        objArr[5] = obj;
        return String.format(locale, "TemporaryExposureKey<keyData: %s, rollingStartIntervalNumber: %s, transmissionRiskLevel: %d, rollingPeriod: %d, reportType: %d, daysSinceOnsetOfSymptoms: %s>", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, getKeyData(), false);
        SafeParcelWriter.writeInt(parcel, 2, getRollingStartIntervalNumber());
        SafeParcelWriter.writeInt(parcel, 3, getTransmissionRiskLevel());
        SafeParcelWriter.writeInt(parcel, 4, getRollingPeriod());
        SafeParcelWriter.writeInt(parcel, 5, getReportType());
        SafeParcelWriter.writeInt(parcel, 6, getDaysSinceOnsetOfSymptoms());
        SafeParcelWriter.writeInt(parcel, 7, getVariantOfConcern());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
