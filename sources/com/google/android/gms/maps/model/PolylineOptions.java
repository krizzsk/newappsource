package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzm();
    @SafeParcelable.Field(getter = "getPoints", mo65739id = 2)
    private final List<LatLng> zza;
    @SafeParcelable.Field(getter = "getWidth", mo65739id = 3)
    private float zzb;
    @SafeParcelable.Field(getter = "getColor", mo65739id = 4)
    private int zzc;
    @SafeParcelable.Field(getter = "getZIndex", mo65739id = 5)
    private float zzd;
    @SafeParcelable.Field(getter = "isVisible", mo65739id = 6)
    private boolean zze;
    @SafeParcelable.Field(getter = "isGeodesic", mo65739id = 7)
    private boolean zzf;
    @SafeParcelable.Field(getter = "isClickable", mo65739id = 8)
    private boolean zzg;
    @SafeParcelable.Field(getter = "getStartCap", mo65739id = 9)
    private Cap zzh;
    @SafeParcelable.Field(getter = "getEndCap", mo65739id = 10)
    private Cap zzi;
    @SafeParcelable.Field(getter = "getJointType", mo65739id = 11)
    private int zzj;
    @SafeParcelable.Field(getter = "getPattern", mo65739id = 12)
    private List<PatternItem> zzk;

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zzd = BitmapDescriptorFactory.HUE_RED;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zza = new ArrayList();
    }

    public PolylineOptions add(LatLng latLng) {
        Preconditions.checkNotNull(this.zza, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        for (LatLng add : iterable) {
            this.zza.add(add);
        }
        return this;
    }

    public PolylineOptions clickable(boolean z) {
        this.zzg = z;
        return this;
    }

    public PolylineOptions color(int i) {
        this.zzc = i;
        return this;
    }

    public PolylineOptions endCap(Cap cap) {
        this.zzi = (Cap) Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    public PolylineOptions geodesic(boolean z) {
        this.zzf = z;
        return this;
    }

    public int getColor() {
        return this.zzc;
    }

    public Cap getEndCap() {
        return this.zzi;
    }

    public int getJointType() {
        return this.zzj;
    }

    public List<PatternItem> getPattern() {
        return this.zzk;
    }

    public List<LatLng> getPoints() {
        return this.zza;
    }

    public Cap getStartCap() {
        return this.zzh;
    }

    public float getWidth() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isClickable() {
        return this.zzg;
    }

    public boolean isGeodesic() {
        return this.zzf;
    }

    public boolean isVisible() {
        return this.zze;
    }

    public PolylineOptions jointType(int i) {
        this.zzj = i;
        return this;
    }

    public PolylineOptions pattern(List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    public PolylineOptions startCap(Cap cap) {
        this.zzh = (Cap) Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    public PolylineOptions visible(boolean z) {
        this.zze = z;
        return this;
    }

    public PolylineOptions width(float f) {
        this.zzb = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getColor());
        SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i, false);
        SafeParcelWriter.writeInt(parcel, 11, getJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public PolylineOptions zIndex(float f) {
        this.zzd = f;
        return this;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        this.zza.addAll(Arrays.asList(latLngArr));
        return this;
    }

    @SafeParcelable.Constructor
    public PolylineOptions(@SafeParcelable.Param(mo65742id = 2) List list, @SafeParcelable.Param(mo65742id = 3) float f, @SafeParcelable.Param(mo65742id = 4) int i, @SafeParcelable.Param(mo65742id = 5) float f2, @SafeParcelable.Param(mo65742id = 6) boolean z, @SafeParcelable.Param(mo65742id = 7) boolean z2, @SafeParcelable.Param(mo65742id = 8) boolean z3, @SafeParcelable.Param(mo65742id = 9) Cap cap, @SafeParcelable.Param(mo65742id = 10) Cap cap2, @SafeParcelable.Param(mo65742id = 11) int i2, @SafeParcelable.Param(mo65742id = 12) List<PatternItem> list2) {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zzd = BitmapDescriptorFactory.HUE_RED;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zza = list;
        this.zzb = f;
        this.zzc = i;
        this.zzd = f2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        if (cap != null) {
            this.zzh = cap;
        }
        if (cap2 != null) {
            this.zzi = cap2;
        }
        this.zzj = i2;
        this.zzk = list2;
    }
}
