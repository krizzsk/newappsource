package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "GetAccountInfoUserListCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyv */
public final class zzyv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyv> CREATOR = new zzyw();
    @SafeParcelable.Field(getter = "getUsers", mo65739id = 2)
    private final List zza;

    public zzyv() {
        this.zza = new ArrayList();
    }

    public static zzyv zza(zzyv zzyv) {
        Preconditions.checkNotNull(zzyv);
        List list = zzyv.zza;
        zzyv zzyv2 = new zzyv();
        if (list != null && !list.isEmpty()) {
            zzyv2.zza.addAll(list);
        }
        return zzyv2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final List zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzyv(@SafeParcelable.Param(mo65742id = 2) List list) {
        List list2;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.zza = list2;
    }
}
