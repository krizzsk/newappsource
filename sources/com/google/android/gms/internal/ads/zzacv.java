package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzacv implements zzbk {
    public static final Parcelable.Creator<zzacv> CREATOR = new zzact();
    public final float zza;
    public final int zzb;

    public zzacv(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    public /* synthetic */ zzacv(Parcel parcel, zzacu zzacu) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacv.class == obj.getClass()) {
            zzacv zzacv = (zzacv) obj;
            return this.zza == zzacv.zza && this.zzb == zzacv.zzb;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f = this.zza;
        int i = this.zzb;
        return "smta: captureFrameRate=" + f + ", svcTemporalLayerCount=" + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    public final /* synthetic */ void zza(zzbf zzbf) {
    }
}
