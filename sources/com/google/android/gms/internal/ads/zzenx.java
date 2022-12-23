package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

public final /* synthetic */ class zzenx implements zzeta {
    public final /* synthetic */ ArrayList zza;

    public /* synthetic */ zzenx(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public final void zzf(Object obj) {
        ((Bundle) obj).putStringArrayList("ad_types", this.zza);
    }
}
