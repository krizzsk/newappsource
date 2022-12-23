package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzsq;
import java.util.List;
import java.util.Locale;

@SafeParcelable.Class(creator = "ExposureWindowCreator")
public final class ExposureWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExposureWindow> CREATOR = new zzm();
    @SafeParcelable.Field(getter = "getDateMillisSinceEpoch", mo65739id = 1)
    public long zza;
    @SafeParcelable.Field(getter = "getScanInstances", mo65739id = 2)
    public final List zzb;
    @SafeParcelable.Field(getter = "getReportType", mo65739id = 3)
    @ReportType
    public final int zzc;
    @SafeParcelable.Field(getter = "getInfectiousness", mo65739id = 4)
    @Infectiousness
    public final int zzd;
    @SafeParcelable.Field(getter = "getCalibrationConfidence", mo65739id = 5)
    @CalibrationConfidence
    public final int zze;
    @SafeParcelable.Field(getter = "getDeviceName", mo65739id = 6)
    public final String zzf;
    @SafeParcelable.Field(getter = "getVariantOfConcern", mo65739id = 7)
    @VariantOfConcern
    public final int zzg;

    public static class Builder {
        private long zza = 0;
        private List zzb = zzsq.zzl();
        @ReportType
        private int zzc = 1;
        @Infectiousness
        private int zzd = 1;
        @CalibrationConfidence
        private int zze = 0;
        @VariantOfConcern
        private int zzf = 0;

        public ExposureWindow build() {
            return new ExposureWindow(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (String) null, this.zzf);
        }

        public Builder setCalibrationConfidence(@CalibrationConfidence int i) {
            Preconditions.checkNotNull(zzh.zza(i), String.format(Locale.getDefault(), "calibrationConfidence (%d) is invalid", new Object[]{Integer.valueOf(i)}));
            this.zze = i;
            return this;
        }

        public Builder setDateMillisSinceEpoch(long j) {
            this.zza = j;
            return this;
        }

        public Builder setInfectiousness(@Infectiousness int i) {
            Preconditions.checkNotNull(zzj.zza(i), String.format(Locale.getDefault(), "infectiousness (%d) is invalid", new Object[]{Integer.valueOf(i)}));
            this.zzd = i;
            return this;
        }

        public Builder setReportType(@ReportType int i) {
            boolean z;
            if (i <= 0 || i >= 5) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "reportType (%d) is not allowed", Integer.valueOf(i));
            this.zzc = i;
            return this;
        }

        public Builder setScanInstances(List<ScanInstance> list) {
            this.zzb = (List) Preconditions.checkNotNull(list);
            return this;
        }

        public Builder setVariantOfConcern(@VariantOfConcern int i) {
            boolean z;
            if (i < 0 || i > 4) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, String.format(Locale.getDefault(), "variantOfConcern (%d) is not allowed", new Object[]{Integer.valueOf(i)}));
            this.zzf = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ExposureWindow(@SafeParcelable.Param(mo65742id = 1) long j, @SafeParcelable.Param(mo65742id = 2) List list, @SafeParcelable.Param(mo65742id = 3) @ReportType int i, @SafeParcelable.Param(mo65742id = 4) @Infectiousness int i2, @SafeParcelable.Param(mo65742id = 5) @CalibrationConfidence int i3, @SafeParcelable.Param(mo65742id = 6) String str, @SafeParcelable.Param(mo65742id = 7) @VariantOfConcern int i4) {
        this.zza = j;
        this.zzb = zzsq.zzk(list);
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        this.zzg = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ExposureWindow.class == obj.getClass()) {
            ExposureWindow exposureWindow = (ExposureWindow) obj;
            if (this.zzc == exposureWindow.zzc && this.zza == exposureWindow.zza && this.zzb.equals(exposureWindow.zzb) && this.zzd == exposureWindow.zzd && this.zze == exposureWindow.zze && Objects.equal(this.zzf, exposureWindow.zzf) && this.zzg == exposureWindow.zzg) {
                return true;
            }
            return false;
        }
        return false;
    }

    @CalibrationConfidence
    public int getCalibrationConfidence() {
        return this.zze;
    }

    public long getDateMillisSinceEpoch() {
        return this.zza;
    }

    @Infectiousness
    public int getInfectiousness() {
        return this.zzd;
    }

    @ReportType
    public int getReportType() {
        return this.zzc;
    }

    public List<ScanInstance> getScanInstances() {
        return this.zzb;
    }

    @VariantOfConcern
    public int getVariantOfConcern() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg));
    }

    public String toString() {
        long j = this.zza;
        int i = this.zzc;
        String valueOf = String.valueOf(this.zzb);
        int i2 = this.zzd;
        int i3 = this.zze;
        String str = this.zzf;
        return "ExposureWindow{dateMillisSinceEpoch=" + j + ", reportType=" + i + ", scanInstances=" + valueOf + ", infectiousness=" + i2 + ", calibrationConfidence=" + i3 + ", deviceName=" + str + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getDateMillisSinceEpoch());
        SafeParcelWriter.writeTypedList(parcel, 2, getScanInstances(), false);
        SafeParcelWriter.writeInt(parcel, 3, getReportType());
        SafeParcelWriter.writeInt(parcel, 4, getInfectiousness());
        SafeParcelWriter.writeInt(parcel, 5, getCalibrationConfidence());
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 7, getVariantOfConcern());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
