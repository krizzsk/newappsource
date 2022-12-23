package com.google.android.gms.internal.contextmanager;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.awareness.fence.FenceStateMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class(creator = "FenceStateMapImplCreator")
@SafeParcelable.Reserved({1})
public final class zzbq extends AbstractSafeParcelable implements FenceStateMap {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();
    @SafeParcelable.Field(getter = "getFenceStatesAsBundle", mo65739id = 2, type = "android.os.Bundle")
    public final Map<String, zzbo> zza = new HashMap();

    @SafeParcelable.Constructor
    public zzbq(@SafeParcelable.Param(mo65742id = 2) Bundle bundle) {
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                this.zza.put(next, (zzbo) SafeParcelableSerializer.deserializeFromBytes((byte[]) Preconditions.checkNotNull(bundle.getByteArray(next)), zzbo.CREATOR));
            }
        }
    }

    public final Set<String> getFenceKeys() {
        return this.zza.keySet();
    }

    public final /* bridge */ /* synthetic */ FenceState getFenceState(String str) {
        if (this.zza.containsKey(str)) {
            return this.zza.get(str);
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        if (this.zza == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            for (Map.Entry next : this.zza.entrySet()) {
                bundle.putByteArray((String) next.getKey(), SafeParcelableSerializer.serializeToBytes((zzbo) next.getValue()));
            }
        }
        SafeParcelWriter.writeBundle(parcel, 2, bundle, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
