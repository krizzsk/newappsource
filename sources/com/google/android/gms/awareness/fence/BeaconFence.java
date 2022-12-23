package com.google.android.gms.awareness.fence;

import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.contextmanager.zzbe;
import com.google.android.gms.internal.contextmanager.zzbj;
import java.util.Collection;

public final class BeaconFence {
    private BeaconFence() {
    }

    public static AwarenessFence found(Collection<BeaconState.TypeFilter> collection) {
        boolean z = false;
        if (collection != null && !collection.isEmpty()) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return found((BeaconState.TypeFilter[]) collection.toArray(new BeaconState.TypeFilter[collection.size()]));
    }

    public static AwarenessFence lost(Collection<BeaconState.TypeFilter> collection) {
        boolean z = false;
        if (collection != null && !collection.isEmpty()) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return lost((BeaconState.TypeFilter[]) collection.toArray(new BeaconState.TypeFilter[collection.size()]));
    }

    public static AwarenessFence near(Collection<BeaconState.TypeFilter> collection) {
        boolean z = false;
        if (collection != null && !collection.isEmpty()) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return near((BeaconState.TypeFilter[]) collection.toArray(new BeaconState.TypeFilter[collection.size()]));
    }

    public static AwarenessFence found(BeaconState.TypeFilter... typeFilterArr) {
        boolean z = false;
        if (typeFilterArr != null && typeFilterArr.length > 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return zzbj.zzc(zzbe.zza(typeFilterArr));
    }

    public static AwarenessFence lost(BeaconState.TypeFilter... typeFilterArr) {
        boolean z = false;
        if (typeFilterArr != null && typeFilterArr.length > 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return zzbj.zzc(zzbe.zzb(typeFilterArr));
    }

    public static AwarenessFence near(BeaconState.TypeFilter... typeFilterArr) {
        boolean z = false;
        if (typeFilterArr != null && typeFilterArr.length > 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return zzbj.zzc(zzbe.zzc(typeFilterArr));
    }
}
