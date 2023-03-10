package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.List;

public final class zzenf implements zzetb {
    private final zzfvk zza;
    private final zzfvk zzb;
    private final Context zzc;
    private final zzfby zzd;
    private final View zze;

    public zzenf(zzfvk zzfvk, zzfvk zzfvk2, Context context, zzfby zzfby, ViewGroup viewGroup) {
        this.zza = zzfvk;
        this.zzb = zzfvk2;
        this.zzc = context;
        this.zzd = zzfby;
        this.zze = viewGroup;
    }

    private final List zze() {
        int i;
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewGroup) {
                i = ((ViewGroup) parent).indexOfChild(view);
            } else {
                i = -1;
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    public final int zza() {
        return 3;
    }

    public final zzfvj zzb() {
        zzbhy.zzc(this.zzc);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzim)).booleanValue()) {
            return this.zzb.zzb(new zzend(this));
        }
        return this.zza.zzb(new zzene(this));
    }

    public final /* synthetic */ zzeng zzc() throws Exception {
        return new zzeng(this.zzc, this.zzd.zze, zze());
    }

    public final /* synthetic */ zzeng zzd() throws Exception {
        return new zzeng(this.zzc, this.zzd.zze, zze());
    }
}
