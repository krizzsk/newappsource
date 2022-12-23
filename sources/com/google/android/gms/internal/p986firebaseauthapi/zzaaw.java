package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaw */
final class zzaaw implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzabe zzabe = (zzabe) obj;
        zzabe zzabe2 = (zzabe) obj2;
        zzaav zzaav = new zzaav(zzabe);
        zzaav zzaav2 = new zzaav(zzabe2);
        while (zzaav.hasNext() && zzaav2.hasNext()) {
            int compareTo = Integer.valueOf(zzaav.zza() & 255).compareTo(Integer.valueOf(zzaav2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzabe.zzd()).compareTo(Integer.valueOf(zzabe2.zzd()));
    }
}
