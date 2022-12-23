package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "FaceParcelCreator")
public final class zzlj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlj> CREATOR = new zzlk();
    @SafeParcelable.Field(getter = "getId", mo65739id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getBoundingBox", mo65739id = 2)
    private final Rect zzb;
    @SafeParcelable.Field(getter = "getRollAngle", mo65739id = 3)
    private final float zzc;
    @SafeParcelable.Field(getter = "getPanAngle", mo65739id = 4)
    private final float zzd;
    @SafeParcelable.Field(getter = "getTiltAngle", mo65739id = 5)
    private final float zze;
    @SafeParcelable.Field(getter = "getLeftEyeOpenProbability", mo65739id = 6)
    private final float zzf;
    @SafeParcelable.Field(getter = "getRightEyeOpenProbability", mo65739id = 7)
    private final float zzg;
    @SafeParcelable.Field(getter = "getSmileProbability", mo65739id = 8)
    private final float zzh;
    @SafeParcelable.Field(getter = "getConfidenceScore", mo65739id = 9)
    private final float zzi;
    @SafeParcelable.Field(getter = "getLandmarkParcelList", mo65739id = 10)
    private final List<zzlp> zzj;
    @SafeParcelable.Field(getter = "getContourParcelList", mo65739id = 11)
    private final List<zzlf> zzk;

    @SafeParcelable.Constructor
    public zzlj(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) Rect rect, @SafeParcelable.Param(mo65742id = 3) float f, @SafeParcelable.Param(mo65742id = 4) float f2, @SafeParcelable.Param(mo65742id = 5) float f3, @SafeParcelable.Param(mo65742id = 6) float f4, @SafeParcelable.Param(mo65742id = 7) float f5, @SafeParcelable.Param(mo65742id = 8) float f6, @SafeParcelable.Param(mo65742id = 9) float f7, @SafeParcelable.Param(mo65742id = 10) List<zzlp> list, @SafeParcelable.Param(mo65742id = 11) List<zzlf> list2) {
        this.zza = i;
        this.zzb = rect;
        this.zzc = f;
        this.zzd = f2;
        this.zze = f3;
        this.zzf = f4;
        this.zzg = f5;
        this.zzh = f6;
        this.zzi = f7;
        this.zzj = list;
        this.zzk = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzc);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzd);
        SafeParcelWriter.writeFloat(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeFloat(parcel, 8, this.zzh);
        SafeParcelWriter.writeFloat(parcel, 9, this.zzi);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeTypedList(parcel, 11, this.zzk, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final Rect zzb() {
        return this.zzb;
    }

    public final float zzc() {
        return this.zzc;
    }

    public final float zzd() {
        return this.zzd;
    }

    public final float zze() {
        return this.zze;
    }

    public final float zzf() {
        return this.zzf;
    }

    public final float zzg() {
        return this.zzg;
    }

    public final float zzh() {
        return this.zzh;
    }

    public final List<zzlp> zzi() {
        return this.zzj;
    }

    public final List<zzlf> zzj() {
        return this.zzk;
    }
}
