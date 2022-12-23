package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabz */
final class zzabz {
    private static final zzabz zzb = new zzabz(true);
    public final zzael zza = new zzaeb(16);
    private boolean zzc;
    private boolean zzd;

    private zzabz() {
    }

    public static zzabz zza() {
        throw null;
    }

    private static final void zzd(zzaby zzaby, Object obj) {
        boolean z;
        zzaff zzb2 = zzaby.zzb();
        zzacn.zze(obj);
        zzaff zzaff = zzaff.DOUBLE;
        zzafg zzafg = zzafg.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzabe) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzacj)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzadm) || (obj instanceof zzacr)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzaby.zza()), zzaby.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzabz zzabz = new zzabz();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzabz.zzc((zzaby) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzabz.zzc((zzaby) entry.getKey(), entry.getValue());
        }
        zzabz.zzd = this.zzd;
        return zzabz;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzabz)) {
            return false;
        }
        return this.zza.equals(((zzabz) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(zzaby zzaby, Object obj) {
        if (!zzaby.zzc()) {
            zzd(zzaby, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzaby, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzacr) {
            this.zzd = true;
        }
        this.zza.put(zzaby, obj);
    }

    private zzabz(boolean z) {
        zzb();
        zzb();
    }
}
