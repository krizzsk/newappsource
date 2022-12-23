package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

public final /* synthetic */ class zzeon implements zzeta {
    public final /* synthetic */ ArrayList zza;

    public /* synthetic */ zzeon(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public final void zzf(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.zza);
    }
}
