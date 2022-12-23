package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzi();
    @SafeParcelable.Field(getter = "getPosition", mo65739id = 2)
    private LatLng zza;
    @SafeParcelable.Field(getter = "getTitle", mo65739id = 3)
    private String zzb;
    @SafeParcelable.Field(getter = "getSnippet", mo65739id = 4)
    private String zzc;
    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", mo65739id = 5, type = "android.os.IBinder")
    private BitmapDescriptor zzd;
    @SafeParcelable.Field(getter = "getAnchorU", mo65739id = 6)
    private float zze = 0.5f;
    @SafeParcelable.Field(getter = "getAnchorV", mo65739id = 7)
    private float zzf = 1.0f;
    @SafeParcelable.Field(getter = "isDraggable", mo65739id = 8)
    private boolean zzg;
    @SafeParcelable.Field(getter = "isVisible", mo65739id = 9)
    private boolean zzh = true;
    @SafeParcelable.Field(getter = "isFlat", mo65739id = 10)
    private boolean zzi = false;
    @SafeParcelable.Field(getter = "getRotation", mo65739id = 11)
    private float zzj = BitmapDescriptorFactory.HUE_RED;
    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", mo65739id = 12)
    private float zzk = 0.5f;
    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", mo65739id = 13)
    private float zzl = BitmapDescriptorFactory.HUE_RED;
    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", mo65739id = 14)
    private float zzm = 1.0f;
    @SafeParcelable.Field(getter = "getZIndex", mo65739id = 15)
    private float zzn;

    public MarkerOptions() {
    }

    public MarkerOptions alpha(float f) {
        this.zzm = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.zze = f;
        this.zzf = f2;
        return this;
    }

    public MarkerOptions draggable(boolean z) {
        this.zzg = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.zzi = z;
        return this;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public float getAnchorU() {
        return this.zze;
    }

    public float getAnchorV() {
        return this.zzf;
    }

    public BitmapDescriptor getIcon() {
        return this.zzd;
    }

    public float getInfoWindowAnchorU() {
        return this.zzk;
    }

    public float getInfoWindowAnchorV() {
        return this.zzl;
    }

    public LatLng getPosition() {
        return this.zza;
    }

    public float getRotation() {
        return this.zzj;
    }

    public String getSnippet() {
        return this.zzc;
    }

    public String getTitle() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzn;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.zzd = bitmapDescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.zzk = f;
        this.zzl = f2;
        return this;
    }

    public boolean isDraggable() {
        return this.zzg;
    }

    public boolean isFlat() {
        return this.zzi;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    public MarkerOptions position(LatLng latLng) {
        if (latLng != null) {
            this.zza = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public MarkerOptions rotation(float f) {
        this.zzj = f;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.zzc = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.zzb = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.zzh = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.zzd;
        if (bitmapDescriptor == null) {
            iBinder = null;
        } else {
            iBinder = bitmapDescriptor.zza().asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, iBinder, false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public MarkerOptions zIndex(float f) {
        this.zzn = f;
        return this;
    }

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(mo65742id = 2) LatLng latLng, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) String str2, @SafeParcelable.Param(mo65742id = 5) IBinder iBinder, @SafeParcelable.Param(mo65742id = 6) float f, @SafeParcelable.Param(mo65742id = 7) float f2, @SafeParcelable.Param(mo65742id = 8) boolean z, @SafeParcelable.Param(mo65742id = 9) boolean z2, @SafeParcelable.Param(mo65742id = 10) boolean z3, @SafeParcelable.Param(mo65742id = 11) float f3, @SafeParcelable.Param(mo65742id = 12) float f4, @SafeParcelable.Param(mo65742id = 13) float f5, @SafeParcelable.Param(mo65742id = 14) float f6, @SafeParcelable.Param(mo65742id = 15) float f7) {
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.zze = f;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = f3;
        this.zzk = f4;
        this.zzl = f5;
        this.zzm = f6;
        this.zzn = f7;
    }
}
