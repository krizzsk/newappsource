package com.google.android.gms.internal.measurement;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class zzae implements Iterable, zzap, zzal {
    public final SortedMap zza;
    public final Map zzb;

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzae = (zzae) obj;
        if (zzc() != zzae.zzc()) {
            return false;
        }
        if (this.zza.isEmpty()) {
            return zzae.zza.isEmpty();
        }
        for (int intValue = ((Integer) this.zza.firstKey()).intValue(); intValue <= ((Integer) this.zza.lastKey()).intValue(); intValue++) {
            if (!zze(intValue).equals(zzae.zze(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    public final Iterator iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzj(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final zzap zzbN(String str, zzg zzg, List list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return zzbb.zza(str, this, zzg, list);
        }
        return zzaj.zza(this, new zzat(str), zzg, list);
    }

    public final int zzc() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return ((Integer) this.zza.lastKey()).intValue() + 1;
    }

    public final zzap zzd() {
        zzae zzae = new zzae();
        for (Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzae.zza.put((Integer) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzae.zza.put((Integer) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzae;
    }

    public final zzap zze(int i) {
        zzap zzap;
        if (i >= zzc()) {
            throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
        } else if (!zzs(i) || (zzap = (zzap) this.zza.get(Integer.valueOf(i))) == null) {
            return zzap.zzf;
        } else {
            return zzap;
        }
    }

    public final zzap zzf(String str) {
        zzap zzap;
        if ("length".equals(str)) {
            return new zzah(Double.valueOf((double) zzc()));
        }
        if (!zzt(str) || (zzap = (zzap) this.zzb.get(str)) == null) {
            return zzap.zzf;
        }
        return zzap;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        if (this.zza.size() == 1) {
            return zze(0).zzh();
        }
        if (this.zza.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return zzj(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
    }

    public final String zzj(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.zza.isEmpty()) {
            for (int i = 0; i < zzc(); i++) {
                zzap zze = zze(i);
                sb.append(str);
                if (!(zze instanceof zzau) && !(zze instanceof zzan)) {
                    sb.append(zze.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator zzk() {
        return this.zza.keySet().iterator();
    }

    public final Iterator zzl() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i = 0; i < zzc(); i++) {
            arrayList.add(zze(i));
        }
        return arrayList;
    }

    public final void zzn() {
        this.zza.clear();
    }

    public final void zzo(int i, zzap zzap) {
        if (i < 0) {
            throw new IllegalArgumentException(C16759e.m42349e("Invalid value index: ", i));
        } else if (i >= zzc()) {
            zzq(i, zzap);
        } else {
            for (int intValue = ((Integer) this.zza.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.zza;
                Integer valueOf = Integer.valueOf(intValue);
                zzap zzap2 = (zzap) sortedMap.get(valueOf);
                if (zzap2 != null) {
                    zzq(intValue + 1, zzap2);
                    this.zza.remove(valueOf);
                }
            }
            zzq(i, zzap);
        }
    }

    public final void zzp(int i) {
        int intValue = ((Integer) this.zza.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.zza.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.zza;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.zza.put(valueOf, zzap.zzf);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.zza.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.zza;
                    Integer valueOf2 = Integer.valueOf(i);
                    zzap zzap = (zzap) sortedMap2.get(valueOf2);
                    if (zzap != null) {
                        this.zza.put(Integer.valueOf(i - 1), zzap);
                        this.zza.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void zzq(int i, zzap zzap) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException(C16759e.m42349e("Out of bounds index: ", i));
        } else if (zzap == null) {
            this.zza.remove(Integer.valueOf(i));
        } else {
            this.zza.put(Integer.valueOf(i), zzap);
        }
    }

    public final void zzr(String str, zzap zzap) {
        if (zzap == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzap);
        }
    }

    public final boolean zzs(int i) {
        if (i >= 0 && i <= ((Integer) this.zza.lastKey()).intValue()) {
            return this.zza.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(C16759e.m42349e("Out of bounds index: ", i));
    }

    public final boolean zzt(String str) {
        return "length".equals(str) || this.zzb.containsKey(str);
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                zzq(i, (zzap) list.get(i));
            }
        }
    }
}
