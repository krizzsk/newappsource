package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;

@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzv();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getTileProviderDelegate", mo65739id = 2, type = "android.os.IBinder")
    public zzaj zza;
    private TileProvider zzb;
    @SafeParcelable.Field(getter = "isVisible", mo65739id = 3)
    private boolean zzc = true;
    @SafeParcelable.Field(getter = "getZIndex", mo65739id = 4)
    private float zzd;
    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", mo65739id = 5)
    private boolean zze = true;
    @SafeParcelable.Field(getter = "getTransparency", mo65739id = 6)
    private float zzf = BitmapDescriptorFactory.HUE_RED;

    public TileOverlayOptions() {
    }

    public TileOverlayOptions fadeIn(boolean z) {
        this.zze = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    public TileProvider getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.zzb = (TileProvider) Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.zza = new zzu(this, tileProvider);
        return this;
    }

    public TileOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.zzf = f;
        return this;
    }

    public TileOverlayOptions visible(boolean z) {
        this.zzc = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzaj zzaj = this.zza;
        if (zzaj == null) {
            iBinder = null;
        } else {
            iBinder = zzaj.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public TileOverlayOptions zIndex(float f) {
        this.zzd = f;
        return this;
    }

    @SafeParcelable.Constructor
    public TileOverlayOptions(@SafeParcelable.Param(mo65742id = 2) IBinder iBinder, @SafeParcelable.Param(mo65742id = 3) boolean z, @SafeParcelable.Param(mo65742id = 4) float f, @SafeParcelable.Param(mo65742id = 5) boolean z2, @SafeParcelable.Param(mo65742id = 6) float f2) {
        zzt zzt;
        zzaj zzc2 = zzai.zzc(iBinder);
        this.zza = zzc2;
        if (zzc2 == null) {
            zzt = null;
        } else {
            zzt = new zzt(this);
        }
        this.zzb = zzt;
        this.zzc = z;
        this.zzd = f;
        this.zze = z2;
        this.zzf = f2;
    }
}
