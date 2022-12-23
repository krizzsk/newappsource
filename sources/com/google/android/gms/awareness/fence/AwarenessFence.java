package com.google.android.gms.awareness.fence;

import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.contextmanager.zzbj;
import com.google.android.gms.internal.contextmanager.zzec;
import com.google.android.gms.internal.contextmanager.zzef;
import com.google.android.gms.internal.contextmanager.zzeg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class AwarenessFence extends AbstractSafeParcelable {
    public static AwarenessFence and(Collection<AwarenessFence> collection) {
        boolean z = false;
        if (collection != null && !collection.isEmpty()) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return zzbj.zzg(zza(collection));
    }

    public static AwarenessFence not(AwarenessFence awarenessFence) {
        Preconditions.checkNotNull(awarenessFence);
        zzbj zzbj = (zzbj) awarenessFence;
        Parcelable.Creator<zzbj> creator = zzbj.CREATOR;
        Preconditions.checkNotNull(zzbj);
        zzec zza = zzeg.zza();
        zza.zzk(zzef.NOT);
        zza.zzb(zzbj.zzi());
        return new zzbj((zzeg) zza.zzs());
    }

    /* renamed from: or */
    public static AwarenessFence m63925or(Collection<AwarenessFence> collection) {
        boolean z = false;
        if (collection != null && !collection.isEmpty()) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return zzbj.zzh(zza(collection));
    }

    private static ArrayList<zzbj> zza(Collection<AwarenessFence> collection) {
        ArrayList<zzbj> arrayList = new ArrayList<>(collection.size());
        Iterator<AwarenessFence> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((zzbj) it.next());
        }
        return arrayList;
    }

    private static ArrayList<zzbj> zzb(AwarenessFence[] awarenessFenceArr) {
        ArrayList<zzbj> arrayList = new ArrayList<>(r1);
        for (zzbj add : awarenessFenceArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static AwarenessFence and(AwarenessFence... awarenessFenceArr) {
        boolean z = false;
        if (awarenessFenceArr != null && awarenessFenceArr.length > 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return zzbj.zzg(zzb(awarenessFenceArr));
    }

    /* renamed from: or */
    public static AwarenessFence m63926or(AwarenessFence... awarenessFenceArr) {
        boolean z = false;
        if (awarenessFenceArr != null && awarenessFenceArr.length > 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return zzbj.zzh(zzb(awarenessFenceArr));
    }
}
