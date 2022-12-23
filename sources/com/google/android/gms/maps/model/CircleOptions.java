package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getCenter", mo65739id = 2)
    private LatLng zza;
    @SafeParcelable.Field(getter = "getRadius", mo65739id = 3)
    private double zzb;
    @SafeParcelable.Field(getter = "getStrokeWidth", mo65739id = 4)
    private float zzc;
    @SafeParcelable.Field(getter = "getStrokeColor", mo65739id = 5)
    private int zzd;
    @SafeParcelable.Field(getter = "getFillColor", mo65739id = 6)
    private int zze;
    @SafeParcelable.Field(getter = "getZIndex", mo65739id = 7)
    private float zzf;
    @SafeParcelable.Field(getter = "isVisible", mo65739id = 8)
    private boolean zzg;
    @SafeParcelable.Field(getter = "isClickable", mo65739id = 9)
    private boolean zzh;
    @SafeParcelable.Field(getter = "getStrokePattern", mo65739id = 10)
    private List<PatternItem> zzi;

    public CircleOptions() {
        this.zza = null;
        this.zzb = 0.0d;
        this.zzc = 10.0f;
        this.zzd = -16777216;
        this.zze = 0;
        this.zzf = BitmapDescriptorFactory.HUE_RED;
        this.zzg = true;
        this.zzh = false;
        this.zzi = null;
    }

    public CircleOptions center(LatLng latLng) {
        Preconditions.checkNotNull(latLng, "center must not be null.");
        this.zza = latLng;
        return this;
    }

    public CircleOptions clickable(boolean z) {
        this.zzh = z;
        return this;
    }

    public CircleOptions fillColor(int i) {
        this.zze = i;
        return this;
    }

    public LatLng getCenter() {
        return this.zza;
    }

    public int getFillColor() {
        return this.zze;
    }

    public double getRadius() {
        return this.zzb;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    public List<PatternItem> getStrokePattern() {
        return this.zzi;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    public CircleOptions radius(double d) {
        this.zzb = d;
        return this;
    }

    public CircleOptions strokeColor(int i) {
        this.zzd = i;
        return this;
    }

    public CircleOptions strokePattern(List<PatternItem> list) {
        this.zzi = list;
        return this;
    }

    public CircleOptions strokeWidth(float f) {
        this.zzc = f;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.zzg = z;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public CircleOptions zIndex(float f) {
        this.zzf = f;
        return this;
    }

    @SafeParcelable.Constructor
    public CircleOptions(@SafeParcelable.Param(mo65742id = 2) LatLng latLng, @SafeParcelable.Param(mo65742id = 3) double d, @SafeParcelable.Param(mo65742id = 4) float f, @SafeParcelable.Param(mo65742id = 5) int i, @SafeParcelable.Param(mo65742id = 6) int i2, @SafeParcelable.Param(mo65742id = 7) float f2, @SafeParcelable.Param(mo65742id = 8) boolean z, @SafeParcelable.Param(mo65742id = 9) boolean z2, @SafeParcelable.Param(mo65742id = 10) List<PatternItem> list) {
        this.zza = latLng;
        this.zzb = d;
        this.zzc = f;
        this.zzd = i;
        this.zze = i2;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = list;
    }
}
