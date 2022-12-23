package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import java.util.List;

@SafeParcelable.Class(creator = "ProvideDiagnosisKeysParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzef extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzef> CREATOR = new zzeg();
    @SafeParcelable.Field(getter = "getKeys", mo65739id = 1)
    private List zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", mo65739id = 2, type = "android.os.IBinder")
    public IStatusCallback zzb;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getKeyFiles", mo65739id = 3)
    public List zzc;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getExposureConfiguration", mo65739id = 4)
    public ExposureConfiguration zzd;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getToken", mo65739id = 5)
    public String zze;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getDiagnosisKeyFileSupplierAsBinder", mo65739id = 6, type = "android.os.IBinder")
    public zzcv zzf;

    private zzef() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzef) {
            zzef zzef = (zzef) obj;
            if (!Objects.equal(this.zza, zzef.zza) || !Objects.equal(this.zzb, zzef.zzb) || !Objects.equal(this.zzc, zzef.zzc) || !Objects.equal(this.zzd, zzef.zzd) || !Objects.equal(this.zze, zzef.zze) || !Objects.equal(this.zzf, zzef.zzf)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb.asBinder(), false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        zzcv zzcv = this.zzf;
        if (zzcv == null) {
            iBinder = null;
        } else {
            iBinder = zzcv.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public /* synthetic */ zzef(zzee zzee) {
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzef(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) java.util.List r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) java.util.List r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 4) com.google.android.gms.nearby.exposurenotification.ExposureConfiguration r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 5) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 6) android.os.IBinder r8) {
        /*
            r2 = this;
            com.google.android.gms.common.api.internal.IStatusCallback r4 = com.google.android.gms.common.api.internal.IStatusCallback.Stub.asInterface(r4)
            if (r8 != 0) goto L_0x0008
            r8 = 0
            goto L_0x001c
        L_0x0008:
            java.lang.String r0 = "com.google.android.gms.nearby.exposurenotification.internal.IDiagnosisKeyFileSupplier"
            android.os.IInterface r0 = r8.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.nearby.zzcv
            if (r1 == 0) goto L_0x0016
            r8 = r0
            com.google.android.gms.internal.nearby.zzcv r8 = (com.google.android.gms.internal.nearby.zzcv) r8
            goto L_0x001c
        L_0x0016:
            com.google.android.gms.internal.nearby.zzct r0 = new com.google.android.gms.internal.nearby.zzct
            r0.<init>(r8)
            r8 = r0
        L_0x001c:
            r2.<init>()
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r6
            r2.zze = r7
            r2.zzf = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzef.<init>(java.util.List, android.os.IBinder, java.util.List, com.google.android.gms.nearby.exposurenotification.ExposureConfiguration, java.lang.String, android.os.IBinder):void");
    }
}
