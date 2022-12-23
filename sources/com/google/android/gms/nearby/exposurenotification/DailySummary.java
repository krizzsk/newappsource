package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import java.util.Locale;

@SafeParcelable.Class(creator = "DailySummaryCreator")
public class DailySummary extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<DailySummary> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getDaysSinceEpoch", mo65739id = 1)
    public int zza;
    @SafeParcelable.Field(getter = "getReportSummaries", mo65739id = 2)
    public List zzb;
    @SafeParcelable.Field(getter = "getSummaryData", mo65739id = 3)
    public ExposureSummaryData zzc;
    @SafeParcelable.Field(getter = "getDeviceName", mo65739id = 4)
    public String zzd;

    @SafeParcelable.Class(creator = "ExposureSummaryDataCreator")
    public static class ExposureSummaryData extends AbstractSafeParcelable implements ReflectedParcelable {
        public static final Parcelable.Creator<ExposureSummaryData> CREATOR = new zzl();
        @SafeParcelable.Field(getter = "getMaximumScore", mo65739id = 1)
        public double zza;
        @SafeParcelable.Field(getter = "getScoreSum", mo65739id = 2)
        public double zzb;
        @SafeParcelable.Field(getter = "getWeightedDurationSum", mo65739id = 3)
        public double zzc;

        @SafeParcelable.Constructor
        public ExposureSummaryData(@SafeParcelable.Param(mo65742id = 1) double d, @SafeParcelable.Param(mo65742id = 2) double d2, @SafeParcelable.Param(mo65742id = 3) double d3) {
            this.zza = d;
            this.zzb = d2;
            this.zzc = d3;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ExposureSummaryData) {
                ExposureSummaryData exposureSummaryData = (ExposureSummaryData) obj;
                if (this.zza == exposureSummaryData.zza && this.zzb == exposureSummaryData.zzb && this.zzc == exposureSummaryData.zzc) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public double getMaximumScore() {
            return this.zza;
        }

        public double getScoreSum() {
            return this.zzb;
        }

        public double getWeightedDurationSum() {
            return this.zzc;
        }

        public int hashCode() {
            return Objects.hashCode(Double.valueOf(this.zza), Double.valueOf(this.zzb), Double.valueOf(this.zzc));
        }

        public String toString() {
            return String.format(Locale.US, "ExposureSummaryData<maximumScore: %.3f, scoreSum: %.3f, weightedDurationSum: %.3f>", new Object[]{Double.valueOf(this.zza), Double.valueOf(this.zzb), Double.valueOf(this.zzc)});
        }

        public void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeDouble(parcel, 1, getMaximumScore());
            SafeParcelWriter.writeDouble(parcel, 2, getScoreSum());
            SafeParcelWriter.writeDouble(parcel, 3, getWeightedDurationSum());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    public DailySummary(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) List list, @SafeParcelable.Param(mo65742id = 3) ExposureSummaryData exposureSummaryData, @SafeParcelable.Param(mo65742id = 4) String str) {
        this.zza = i;
        this.zzb = list;
        this.zzc = exposureSummaryData;
        this.zzd = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DailySummary) {
            DailySummary dailySummary = (DailySummary) obj;
            if (this.zza != dailySummary.zza || !this.zzb.equals(dailySummary.zzb) || !Objects.equal(this.zzc, dailySummary.zzc) || !Objects.equal(this.zzd, dailySummary.zzd)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int getDaysSinceEpoch() {
        return this.zza;
    }

    public ExposureSummaryData getSummaryData() {
        return this.zzc;
    }

    public ExposureSummaryData getSummaryDataForReportType(@ReportType int i) {
        return (ExposureSummaryData) this.zzb.get(i);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    public String toString() {
        return String.format(Locale.US, "DailySummary<daysSinceEpoch: %d, reportSummaries: %s, daySummary: %s, deviceName: %s>", new Object[]{Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getDaysSinceEpoch());
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getSummaryData(), i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
