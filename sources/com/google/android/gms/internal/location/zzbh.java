package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzbi;
import com.google.android.gms.location.zzbk;
import com.google.android.gms.location.zzbl;

@SafeParcelable.Class(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.Reserved({1000})
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_UNKNOWN", getter = "getOperation", mo65739id = 1)
    private final int zza;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationRequest", mo65739id = 2)
    private final zzbf zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationListenerAsBinder", mo65739id = 3, type = "android.os.IBinder")
    private final zzbl zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationCallbackAsBinder", mo65739id = 5, type = "android.os.IBinder")
    private final zzbi zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getPendingIntent", mo65739id = 4)
    private final PendingIntent zze;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackAsBinder", mo65739id = 6, type = "android.os.IBinder")
    private final zzai zzf;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getListenerId", mo65739id = 8)
    private final String zzg;

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) zzbf zzbf, @SafeParcelable.Param(mo65742id = 3) IBinder iBinder, @SafeParcelable.Param(mo65742id = 5) IBinder iBinder2, @SafeParcelable.Param(mo65742id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(mo65742id = 6) IBinder iBinder3, @SafeParcelable.Param(mo65742id = 8) String str) {
        zzbl zzbl;
        zzbi zzbi;
        this.zza = i;
        this.zzb = zzbf;
        zzai zzai = null;
        if (iBinder != null) {
            zzbl = zzbk.zzb(iBinder);
        } else {
            zzbl = null;
        }
        this.zzc = zzbl;
        this.zze = pendingIntent;
        if (iBinder2 != null) {
            zzbi = com.google.android.gms.location.zzbh.zzb(iBinder2);
        } else {
            zzbi = null;
        }
        this.zzd = zzbi;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzai = (zzai) queryLocalInterface;
            } else {
                zzai = new zzag(iBinder3);
            }
        }
        this.zzf = zzai;
        this.zzg = str;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbh zza(com.google.android.gms.location.zzbi r9, com.google.android.gms.internal.location.zzai r10) {
        /*
            com.google.android.gms.internal.location.zzbh r8 = new com.google.android.gms.internal.location.zzbh
            if (r10 != 0) goto L_0x0005
            r10 = 0
        L_0x0005:
            r6 = r10
            r1 = 2
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r0 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbh.zza(com.google.android.gms.location.zzbi, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbh");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbh zzb(com.google.android.gms.location.zzbl r9, com.google.android.gms.internal.location.zzai r10) {
        /*
            com.google.android.gms.internal.location.zzbh r8 = new com.google.android.gms.internal.location.zzbh
            if (r10 != 0) goto L_0x0005
            r10 = 0
        L_0x0005:
            r6 = r10
            r1 = 2
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r0 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbh.zzb(com.google.android.gms.location.zzbl, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbh");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        zzbl zzbl = this.zzc;
        IBinder iBinder3 = null;
        if (zzbl == null) {
            iBinder = null;
        } else {
            iBinder = zzbl.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, iBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zze, i, false);
        zzbi zzbi = this.zzd;
        if (zzbi == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzbi.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, iBinder2, false);
        zzai zzai = this.zzf;
        if (zzai != null) {
            iBinder3 = zzai.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder3, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
