package com.google.android.gms.awareness.fence;

import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.contextmanager.zzbj;
import com.google.android.gms.internal.contextmanager.zzbz;
import com.google.android.gms.internal.contextmanager.zzca;
import com.google.android.gms.internal.contextmanager.zzcb;
import com.google.android.gms.internal.contextmanager.zzec;
import com.google.android.gms.internal.contextmanager.zzef;
import com.google.android.gms.internal.contextmanager.zzeg;
import com.google.android.gms.internal.contextmanager.zzib;
import com.google.android.gms.internal.contextmanager.zzie;
import com.google.android.gms.internal.contextmanager.zzif;
import com.google.android.gms.internal.contextmanager.zzjs;
import java.util.TimeZone;

public final class TimeFence {
    public static final int DAY_OF_WEEK_FRIDAY = 6;
    public static final int DAY_OF_WEEK_MONDAY = 2;
    public static final int DAY_OF_WEEK_SATURDAY = 7;
    public static final int DAY_OF_WEEK_SUNDAY = 1;
    public static final int DAY_OF_WEEK_THURSDAY = 5;
    public static final int DAY_OF_WEEK_TUESDAY = 3;
    public static final int DAY_OF_WEEK_WEDNESDAY = 4;
    public static final int TIME_INSTANT_SUNRISE = 1;
    public static final int TIME_INSTANT_SUNSET = 2;
    public static final int TIME_INTERVAL_AFTERNOON = 5;
    public static final int TIME_INTERVAL_EVENING = 6;
    public static final int TIME_INTERVAL_HOLIDAY = 3;
    public static final int TIME_INTERVAL_MORNING = 4;
    public static final int TIME_INTERVAL_NIGHT = 7;
    public static final int TIME_INTERVAL_WEEKDAY = 1;
    public static final int TIME_INTERVAL_WEEKEND = 2;

    private TimeFence() {
    }

    public static AwarenessFence aroundTimeInstant(int i, long j, long j2) {
        if (i == 1) {
            return zzbj.zze(zzbz.zza(j, j2));
        }
        if (i == 2) {
            return zzbj.zze(zzbz.zzb(j, j2));
        }
        throw new IllegalArgumentException(C13715c.m34241g(40, "Unknown time instant label = ", i));
    }

    public static AwarenessFence inDailyInterval(TimeZone timeZone, long j, long j2) {
        return zzbj.zzf(zzca.zzb(2, timeZone, j, j2));
    }

    @Deprecated
    public static AwarenessFence inFridayInterval(TimeZone timeZone, long j, long j2) {
        return zzbj.zzf(zzca.zzb(10, timeZone, j, j2));
    }

    public static AwarenessFence inInterval(long j, long j2) {
        return zzbj.zzf(zzca.zza(j, j2));
    }

    public static AwarenessFence inIntervalOfDay(int i, TimeZone timeZone, long j, long j2) {
        return zzbj.zzf(zzca.zzc(i, timeZone, j, j2));
    }

    @Deprecated
    public static AwarenessFence inMondayInterval(TimeZone timeZone, long j, long j2) {
        return zzbj.zzf(zzca.zzb(6, timeZone, j, j2));
    }

    @Deprecated
    public static AwarenessFence inSaturdayInterval(TimeZone timeZone, long j, long j2) {
        return zzbj.zzf(zzca.zzb(11, timeZone, j, j2));
    }

    @Deprecated
    public static AwarenessFence inSundayInterval(TimeZone timeZone, long j, long j2) {
        return zzbj.zzf(zzca.zzb(5, timeZone, j, j2));
    }

    @Deprecated
    public static AwarenessFence inThursdayInterval(TimeZone timeZone, long j, long j2) {
        return zzbj.zzf(zzca.zzb(9, timeZone, j, j2));
    }

    public static AwarenessFence inTimeInterval(int i) {
        Preconditions.checkArgument(true);
        zzie zzb = zzie.zzb(1);
        zzjs zzb2 = zzjs.zzb(i);
        zzib zza = zzif.zza();
        zza.zzb(zzb);
        zza.zza(zzb2);
        zzcb zzcb = new zzcb((zzif) zza.zzs());
        Parcelable.Creator<zzbj> creator = zzbj.CREATOR;
        Preconditions.checkNotNull(zzcb);
        zzec zza2 = zzeg.zza();
        zza2.zzk(zzef.TIME_INTERVAL_FENCE);
        zza2.zzj(zzcb.zza());
        return new zzbj((zzeg) zza2.zzs());
    }

    @Deprecated
    public static AwarenessFence inTuesdayInterval(TimeZone timeZone, long j, long j2) {
        return zzbj.zzf(zzca.zzb(7, timeZone, j, j2));
    }

    @Deprecated
    public static AwarenessFence inWednesdayInterval(TimeZone timeZone, long j, long j2) {
        return zzbj.zzf(zzca.zzb(8, timeZone, j, j2));
    }
}
