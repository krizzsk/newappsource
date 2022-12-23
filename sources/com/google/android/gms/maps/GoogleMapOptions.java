package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzab();
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", mo65739id = 2, type = "byte")
    private Boolean zza;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", mo65739id = 3, type = "byte")
    private Boolean zzb;
    @SafeParcelable.Field(getter = "getMapType", mo65739id = 4)
    private int zzc = -1;
    @SafeParcelable.Field(getter = "getCamera", mo65739id = 5)
    private CameraPosition zzd;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", mo65739id = 6, type = "byte")
    private Boolean zze;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", mo65739id = 7, type = "byte")
    private Boolean zzf;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", mo65739id = 8, type = "byte")
    private Boolean zzg;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", mo65739id = 9, type = "byte")
    private Boolean zzh;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", mo65739id = 10, type = "byte")
    private Boolean zzi;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", mo65739id = 11, type = "byte")
    private Boolean zzj;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", mo65739id = 12, type = "byte")
    private Boolean zzk;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", mo65739id = 14, type = "byte")
    private Boolean zzl;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", mo65739id = 15, type = "byte")
    private Boolean zzm;
    @SafeParcelable.Field(getter = "getMinZoomPreference", mo65739id = 16)
    private Float zzn = null;
    @SafeParcelable.Field(getter = "getMaxZoomPreference", mo65739id = 17)
    private Float zzo = null;
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", mo65739id = 18)
    private LatLngBounds zzp = null;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", mo65739id = 19, type = "byte")
    private Boolean zzq;
    @SafeParcelable.Field(getter = "getBackgroundColor", mo65739id = 20)
    private Integer zzr = null;
    @SafeParcelable.Field(getter = "getMapId", mo65739id = 21)
    private String zzs = null;

    public GoogleMapOptions() {
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C25597R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = C25597R.styleable.MapAttrs_mapType;
        if (obtainAttributes.hasValue(i)) {
            googleMapOptions.mapType(obtainAttributes.getInt(i, -1));
        }
        int i2 = C25597R.styleable.MapAttrs_zOrderOnTop;
        if (obtainAttributes.hasValue(i2)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(i2, false));
        }
        int i3 = C25597R.styleable.MapAttrs_useViewLifecycle;
        if (obtainAttributes.hasValue(i3)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(i3, false));
        }
        int i4 = C25597R.styleable.MapAttrs_uiCompass;
        if (obtainAttributes.hasValue(i4)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(i4, true));
        }
        int i5 = C25597R.styleable.MapAttrs_uiRotateGestures;
        if (obtainAttributes.hasValue(i5)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(i5, true));
        }
        int i6 = C25597R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (obtainAttributes.hasValue(i6)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(obtainAttributes.getBoolean(i6, true));
        }
        int i7 = C25597R.styleable.MapAttrs_uiScrollGestures;
        if (obtainAttributes.hasValue(i7)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(i7, true));
        }
        int i8 = C25597R.styleable.MapAttrs_uiTiltGestures;
        if (obtainAttributes.hasValue(i8)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(i8, true));
        }
        int i9 = C25597R.styleable.MapAttrs_uiZoomGestures;
        if (obtainAttributes.hasValue(i9)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(i9, true));
        }
        int i11 = C25597R.styleable.MapAttrs_uiZoomControls;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(i11, true));
        }
        int i12 = C25597R.styleable.MapAttrs_liteMode;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(i12, false));
        }
        int i13 = C25597R.styleable.MapAttrs_uiMapToolbar;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(i13, true));
        }
        int i14 = C25597R.styleable.MapAttrs_ambientEnabled;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(i14, false));
        }
        int i15 = C25597R.styleable.MapAttrs_cameraMinZoomPreference;
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(i15, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(C25597R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, new int[]{zzc(context, "backgroundColor"), zzc(context, "mapId")});
        if (obtainAttributes2.hasValue(0)) {
            googleMapOptions.backgroundColor(Integer.valueOf(obtainAttributes2.getColor(0, 0)));
        }
        if (obtainAttributes2.hasValue(1) && (string = obtainAttributes2.getString(1)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        obtainAttributes2.recycle();
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public static CameraPosition zza(Context context, AttributeSet attributeSet) {
        float f;
        float f2;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C25597R.styleable.MapAttrs);
        int i = C25597R.styleable.MapAttrs_cameraTargetLat;
        if (obtainAttributes.hasValue(i)) {
            f = obtainAttributes.getFloat(i, BitmapDescriptorFactory.HUE_RED);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        int i2 = C25597R.styleable.MapAttrs_cameraTargetLng;
        if (obtainAttributes.hasValue(i2)) {
            f2 = obtainAttributes.getFloat(i2, BitmapDescriptorFactory.HUE_RED);
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        LatLng latLng = new LatLng((double) f, (double) f2);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i3 = C25597R.styleable.MapAttrs_cameraZoom;
        if (obtainAttributes.hasValue(i3)) {
            builder.zoom(obtainAttributes.getFloat(i3, BitmapDescriptorFactory.HUE_RED));
        }
        int i4 = C25597R.styleable.MapAttrs_cameraBearing;
        if (obtainAttributes.hasValue(i4)) {
            builder.bearing(obtainAttributes.getFloat(i4, BitmapDescriptorFactory.HUE_RED));
        }
        int i5 = C25597R.styleable.MapAttrs_cameraTilt;
        if (obtainAttributes.hasValue(i5)) {
            builder.tilt(obtainAttributes.getFloat(i5, BitmapDescriptorFactory.HUE_RED));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    public static LatLngBounds zzb(Context context, AttributeSet attributeSet) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C25597R.styleable.MapAttrs);
        int i = C25597R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        if (obtainAttributes.hasValue(i)) {
            f = Float.valueOf(obtainAttributes.getFloat(i, BitmapDescriptorFactory.HUE_RED));
        } else {
            f = null;
        }
        int i2 = C25597R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        if (obtainAttributes.hasValue(i2)) {
            f2 = Float.valueOf(obtainAttributes.getFloat(i2, BitmapDescriptorFactory.HUE_RED));
        } else {
            f2 = null;
        }
        int i3 = C25597R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        if (obtainAttributes.hasValue(i3)) {
            f3 = Float.valueOf(obtainAttributes.getFloat(i3, BitmapDescriptorFactory.HUE_RED));
        } else {
            f3 = null;
        }
        int i4 = C25597R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        if (obtainAttributes.hasValue(i4)) {
            f4 = Float.valueOf(obtainAttributes.getFloat(i4, BitmapDescriptorFactory.HUE_RED));
        } else {
            f4 = null;
        }
        obtainAttributes.recycle();
        if (f == null || f2 == null || f3 == null || f4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) f.floatValue(), (double) f2.floatValue()), new LatLng((double) f3.floatValue(), (double) f4.floatValue()));
    }

    private static int zzc(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    public GoogleMapOptions ambientEnabled(boolean z) {
        this.zzm = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions backgroundColor(Integer num) {
        this.zzr = num;
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zzd = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z) {
        this.zzf = Boolean.valueOf(z);
        return this;
    }

    public Boolean getAmbientEnabled() {
        return this.zzm;
    }

    public Integer getBackgroundColor() {
        return this.zzr;
    }

    public CameraPosition getCamera() {
        return this.zzd;
    }

    public Boolean getCompassEnabled() {
        return this.zzf;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzp;
    }

    public Boolean getLiteMode() {
        return this.zzk;
    }

    public String getMapId() {
        return this.zzs;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzl;
    }

    public int getMapType() {
        return this.zzc;
    }

    public Float getMaxZoomPreference() {
        return this.zzo;
    }

    public Float getMinZoomPreference() {
        return this.zzn;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzj;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzg;
    }

    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzq;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzi;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzb;
    }

    public Boolean getZOrderOnTop() {
        return this.zza;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zze;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzh;
    }

    public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzp = latLngBounds;
        return this;
    }

    public GoogleMapOptions liteMode(boolean z) {
        this.zzk = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapId(String str) {
        this.zzs = str;
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzl = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapType(int i) {
        this.zzc = i;
        return this;
    }

    public GoogleMapOptions maxZoomPreference(float f) {
        this.zzo = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions minZoomPreference(float f) {
        this.zzn = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzj = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzg = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.zzq = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzi = Boolean.valueOf(z);
        return this;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzc)).add("LiteMode", this.zzk).add("Camera", this.zzd).add("CompassEnabled", this.zzf).add("ZoomControlsEnabled", this.zze).add("ScrollGesturesEnabled", this.zzg).add("ZoomGesturesEnabled", this.zzh).add("TiltGesturesEnabled", this.zzi).add("RotateGesturesEnabled", this.zzj).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzq).add("MapToolbarEnabled", this.zzl).add("AmbientEnabled", this.zzm).add("MinZoomPreference", this.zzn).add("MaxZoomPreference", this.zzo).add("BackgroundColor", this.zzr).add("LatLngBoundsForCameraTarget", this.zzp).add("ZOrderOnTop", this.zza).add("UseViewLifecycleInFragment", this.zzb).toString();
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, zza.zza(this.zza));
        SafeParcelWriter.writeByte(parcel, 3, zza.zza(this.zzb));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, zza.zza(this.zze));
        SafeParcelWriter.writeByte(parcel, 7, zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 8, zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 9, zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 10, zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 11, zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 12, zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 14, zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 15, zza.zza(this.zzm));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, zza.zza(this.zzq));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.zza = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zze = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzh = Boolean.valueOf(z);
        return this;
    }

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(mo65742id = 2) byte b, @SafeParcelable.Param(mo65742id = 3) byte b2, @SafeParcelable.Param(mo65742id = 4) int i, @SafeParcelable.Param(mo65742id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(mo65742id = 6) byte b3, @SafeParcelable.Param(mo65742id = 7) byte b4, @SafeParcelable.Param(mo65742id = 8) byte b5, @SafeParcelable.Param(mo65742id = 9) byte b6, @SafeParcelable.Param(mo65742id = 10) byte b7, @SafeParcelable.Param(mo65742id = 11) byte b8, @SafeParcelable.Param(mo65742id = 12) byte b9, @SafeParcelable.Param(mo65742id = 14) byte b11, @SafeParcelable.Param(mo65742id = 15) byte b12, @SafeParcelable.Param(mo65742id = 16) Float f, @SafeParcelable.Param(mo65742id = 17) Float f2, @SafeParcelable.Param(mo65742id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(mo65742id = 19) byte b13, @SafeParcelable.Param(mo65742id = 20) Integer num, @SafeParcelable.Param(mo65742id = 21) String str) {
        this.zza = zza.zzb(b);
        this.zzb = zza.zzb(b2);
        this.zzc = i;
        this.zzd = cameraPosition;
        this.zze = zza.zzb(b3);
        this.zzf = zza.zzb(b4);
        this.zzg = zza.zzb(b5);
        this.zzh = zza.zzb(b6);
        this.zzi = zza.zzb(b7);
        this.zzj = zza.zzb(b8);
        this.zzk = zza.zzb(b9);
        this.zzl = zza.zzb(b11);
        this.zzm = zza.zzb(b12);
        this.zzn = f;
        this.zzo = f2;
        this.zzp = latLngBounds;
        this.zzq = zza.zzb(b13);
        this.zzr = num;
        this.zzs = str;
    }
}
