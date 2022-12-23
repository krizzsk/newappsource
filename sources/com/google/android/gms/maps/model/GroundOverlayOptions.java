package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzd();
    public static final float NO_DIMENSION = -1.0f;
    @SafeParcelable.Field(getter = "getWrappedImageDescriptorImplBinder", mo65739id = 2, type = "android.os.IBinder")
    private BitmapDescriptor zza;
    @SafeParcelable.Field(getter = "getLocation", mo65739id = 3)
    private LatLng zzb;
    @SafeParcelable.Field(getter = "getWidth", mo65739id = 4)
    private float zzc;
    @SafeParcelable.Field(getter = "getHeight", mo65739id = 5)
    private float zzd;
    @SafeParcelable.Field(getter = "getBounds", mo65739id = 6)
    private LatLngBounds zze;
    @SafeParcelable.Field(getter = "getBearing", mo65739id = 7)
    private float zzf;
    @SafeParcelable.Field(getter = "getZIndex", mo65739id = 8)
    private float zzg;
    @SafeParcelable.Field(getter = "isVisible", mo65739id = 9)
    private boolean zzh = true;
    @SafeParcelable.Field(getter = "getTransparency", mo65739id = 10)
    private float zzi = BitmapDescriptorFactory.HUE_RED;
    @SafeParcelable.Field(getter = "getAnchorU", mo65739id = 11)
    private float zzj = 0.5f;
    @SafeParcelable.Field(getter = "getAnchorV", mo65739id = 12)
    private float zzk = 0.5f;
    @SafeParcelable.Field(getter = "isClickable", mo65739id = 13)
    private boolean zzl = false;

    public GroundOverlayOptions() {
    }

    private final GroundOverlayOptions zza(LatLng latLng, float f, float f2) {
        this.zzb = latLng;
        this.zzc = f;
        this.zzd = f2;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f2) {
        this.zzj = f;
        this.zzk = f2;
        return this;
    }

    public GroundOverlayOptions bearing(float f) {
        this.zzf = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public GroundOverlayOptions clickable(boolean z) {
        this.zzl = z;
        return this;
    }

    public float getAnchorU() {
        return this.zzj;
    }

    public float getAnchorV() {
        return this.zzk;
    }

    public float getBearing() {
        return this.zzf;
    }

    public LatLngBounds getBounds() {
        return this.zze;
    }

    public float getHeight() {
        return this.zzd;
    }

    public BitmapDescriptor getImage() {
        return this.zza;
    }

    public LatLng getLocation() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzi;
    }

    public float getWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzg;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        this.zza = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.zzl;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    public GroundOverlayOptions position(LatLng latLng, float f) {
        boolean z = true;
        Preconditions.checkState(this.zze == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        if (f < BitmapDescriptorFactory.HUE_RED) {
            z = false;
        }
        Preconditions.checkArgument(z, "Width must be non-negative");
        zza(latLng, f, -1.0f);
        return this;
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        LatLng latLng = this.zzb;
        Preconditions.checkState(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.zze = latLngBounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.zzi = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean z) {
        this.zzh = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zza.zza().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i, false);
        SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i, false);
        SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public GroundOverlayOptions zIndex(float f) {
        this.zzg = f;
        return this;
    }

    @SafeParcelable.Constructor
    public GroundOverlayOptions(@SafeParcelable.Param(mo65742id = 2) IBinder iBinder, @SafeParcelable.Param(mo65742id = 3) LatLng latLng, @SafeParcelable.Param(mo65742id = 4) float f, @SafeParcelable.Param(mo65742id = 5) float f2, @SafeParcelable.Param(mo65742id = 6) LatLngBounds latLngBounds, @SafeParcelable.Param(mo65742id = 7) float f3, @SafeParcelable.Param(mo65742id = 8) float f4, @SafeParcelable.Param(mo65742id = 9) boolean z, @SafeParcelable.Param(mo65742id = 10) float f5, @SafeParcelable.Param(mo65742id = 11) float f6, @SafeParcelable.Param(mo65742id = 12) float f7, @SafeParcelable.Param(mo65742id = 13) boolean z2) {
        this.zza = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzb = latLng;
        this.zzc = f;
        this.zzd = f2;
        this.zze = latLngBounds;
        this.zzf = f3;
        this.zzg = f4;
        this.zzh = z;
        this.zzi = f5;
        this.zzj = f6;
        this.zzk = f7;
        this.zzl = z2;
    }

    public GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        boolean z = true;
        Preconditions.checkState(this.zze == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f >= BitmapDescriptorFactory.HUE_RED, "Width must be non-negative");
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            z = false;
        }
        Preconditions.checkArgument(z, "Height must be non-negative");
        zza(latLng, f, f2);
        return this;
    }
}
