package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "ContourParcelCreator")
public final class zzlf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlf> CREATOR = new zzlg();
    @SafeParcelable.Field(getter = "getType", mo65739id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getPointList", mo65739id = 2)
    private final List<PointF> zzb;

    @SafeParcelable.Constructor
    public zzlf(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) List<PointF> list) {
        this.zza = i;
        this.zzb = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final List<PointF> zzb() {
        return this.zzb;
    }
}
