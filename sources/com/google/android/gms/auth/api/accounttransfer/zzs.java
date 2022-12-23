package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;

@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    private static final C6302b zzb;
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", mo65739id = 2)
    private List zzc;
    @SafeParcelable.Field(getter = "getInProgressAccountTypes", mo65739id = 3)
    private List zzd;
    @SafeParcelable.Field(getter = "getSuccessAccountTypes", mo65739id = 4)
    private List zze;
    @SafeParcelable.Field(getter = "getFailedAccountTypes", mo65739id = 5)
    private List zzf;
    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", mo65739id = 6)
    private List zzg;

    static {
        C6302b bVar = new C6302b();
        zzb = bVar;
        bVar.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        bVar.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        bVar.put(WidgetMessageParser.KEY_SUCCESS, FastJsonResponse.Field.forStrings(WidgetMessageParser.KEY_SUCCESS, 4));
        bVar.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        bVar.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzs() {
        this.zza = 1;
    }

    public final Map getFieldMappings() {
        return zzb;
    }

    public final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zza);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                throw new IllegalStateException(C16759e.m42349e("Unknown SafeParcelable id=", field.getSafeParcelableFieldId()));
        }
    }

    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    public final void setStringsInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzc = arrayList;
        } else if (safeParcelableFieldId == 3) {
            this.zzd = arrayList;
        } else if (safeParcelableFieldId == 4) {
            this.zze = arrayList;
        } else if (safeParcelableFieldId == 5) {
            this.zzf = arrayList;
        } else if (safeParcelableFieldId == 6) {
            this.zzg = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(safeParcelableFieldId)}));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zze, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) List list, @SafeParcelable.Param(mo65742id = 3) List list2, @SafeParcelable.Param(mo65742id = 4) List list3, @SafeParcelable.Param(mo65742id = 5) List list4, @SafeParcelable.Param(mo65742id = 6) List list5) {
        this.zza = i;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }
}
