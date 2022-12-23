package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WeatherImplCreator")
@SafeParcelable.Reserved({1})
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    @SafeParcelable.Field(getter = "getTemperatureFahrenheit", mo65739id = 2)
    private final float zza;
    @SafeParcelable.Field(getter = "getFeelsLikeTemperatureFahrenheit", mo65739id = 3)
    private final float zzb;
    @SafeParcelable.Field(getter = "getDewPointFahrenheit", mo65739id = 4)
    private final float zzc;
    @SafeParcelable.Field(getter = "getHumidity", mo65739id = 5)
    private final int zzd;
    @SafeParcelable.Field(getter = "getConditions", mo65739id = 6)
    private final int[] zze;

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(mo65742id = 2) float f, @SafeParcelable.Param(mo65742id = 3) float f2, @SafeParcelable.Param(mo65742id = 4) float f3, @SafeParcelable.Param(mo65742id = 5) int i, @SafeParcelable.Param(mo65742id = 6) int[] iArr) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
        this.zzd = i;
        this.zze = iArr;
    }

    private static float zza(float f) {
        return ((f - 0.125f) * 5.0f) / 9.0f;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Temp=");
        k.append(this.zza);
        k.append("F/");
        k.append(zza(this.zza));
        k.append("C, Feels=");
        k.append(this.zzb);
        k.append("F/");
        k.append(zza(this.zzb));
        k.append("C, Dew=");
        k.append(this.zzc);
        k.append("F/");
        k.append(zza(this.zzc));
        k.append("C, Humidity=");
        k.append(this.zzd);
        k.append(", Condition=");
        if (this.zze == null) {
            k.append("unknown");
        } else {
            k.append("[");
            int[] iArr = this.zze;
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
                k.append(i2);
                i++;
                z = false;
            }
            k.append("]");
        }
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.zza);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzb);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeIntArray(parcel, 6, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
