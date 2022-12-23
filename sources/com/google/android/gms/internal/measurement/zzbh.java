package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import p001a0.C0016g;

public final class zzbh extends zzaw {
    public zzbh() {
        this.zza.add(zzbl.FOR_IN);
        this.zza.add(zzbl.FOR_IN_CONST);
        this.zza.add(zzbl.FOR_IN_LET);
        this.zza.add(zzbl.FOR_LET);
        this.zza.add(zzbl.FOR_OF);
        this.zza.add(zzbl.FOR_OF_CONST);
        this.zza.add(zzbl.FOR_OF_LET);
        this.zza.add(zzbl.WHILE);
    }

    private static zzap zzc(zzbf zzbf, Iterator it, zzap zzap) {
        if (it != null) {
            while (it.hasNext()) {
                zzap zzc = zzbf.zza((zzap) it.next()).zzc((zzae) zzap);
                if (zzc instanceof zzag) {
                    zzag zzag = (zzag) zzc;
                    if ("break".equals(zzag.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzag.zzc())) {
                        return zzag;
                    }
                }
            }
        }
        return zzap.zzf;
    }

    private static zzap zzd(zzbf zzbf, zzap zzap, zzap zzap2) {
        return zzc(zzbf, zzap.zzl(), zzap2);
    }

    private static zzap zze(zzbf zzbf, zzap zzap, zzap zzap2) {
        if (zzap instanceof Iterable) {
            return zzc(zzbf, ((Iterable) zzap).iterator(), zzap2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public final zzap zza(String str, zzg zzg, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    if (C0016g.m26i(zzbl.FOR_IN, 3, list, 0) instanceof zzat) {
                        String zzi = ((zzap) list.get(0)).zzi();
                        return zzd(new zzbg(zzg, zzi), zzg.zzb((zzap) list.get(1)), zzg.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    if (C0016g.m26i(zzbl.FOR_IN_CONST, 3, list, 0) instanceof zzat) {
                        String zzi2 = ((zzap) list.get(0)).zzi();
                        return zzd(new zzbd(zzg, zzi2), zzg.zzb((zzap) list.get(1)), zzg.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    if (C0016g.m26i(zzbl.FOR_IN_LET, 3, list, 0) instanceof zzat) {
                        String zzi3 = ((zzap) list.get(0)).zzi();
                        return zzd(new zzbe(zzg, zzi3), zzg.zzb((zzap) list.get(1)), zzg.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    zzap zzb = zzg.zzb((zzap) C0016g.m26i(zzbl.FOR_LET, 4, list, 0));
                    if (zzb instanceof zzae) {
                        zzae zzae = (zzae) zzb;
                        zzap zzap = (zzap) list.get(1);
                        zzap zzap2 = (zzap) list.get(2);
                        zzap zzb2 = zzg.zzb((zzap) list.get(3));
                        zzg zza = zzg.zza();
                        for (int i = 0; i < zzae.zzc(); i++) {
                            String zzi4 = zzae.zze(i).zzi();
                            zza.zzg(zzi4, zzg.zzd(zzi4));
                        }
                        while (zzg.zzb(zzap).zzg().booleanValue()) {
                            zzap zzc = zzg.zzc((zzae) zzb2);
                            if (zzc instanceof zzag) {
                                zzag zzag = (zzag) zzc;
                                if ("break".equals(zzag.zzc())) {
                                    return zzap.zzf;
                                }
                                if ("return".equals(zzag.zzc())) {
                                    return zzag;
                                }
                            }
                            zzg zza2 = zzg.zza();
                            for (int i2 = 0; i2 < zzae.zzc(); i2++) {
                                String zzi5 = zzae.zze(i2).zzi();
                                zza2.zzg(zzi5, zza.zzd(zzi5));
                            }
                            zza2.zzb(zzap2);
                            zza = zza2;
                        }
                        return zzap.zzf;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    if (C0016g.m26i(zzbl.FOR_OF, 3, list, 0) instanceof zzat) {
                        String zzi6 = ((zzap) list.get(0)).zzi();
                        return zze(new zzbg(zzg, zzi6), zzg.zzb((zzap) list.get(1)), zzg.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    if (C0016g.m26i(zzbl.FOR_OF_CONST, 3, list, 0) instanceof zzat) {
                        String zzi7 = ((zzap) list.get(0)).zzi();
                        return zze(new zzbd(zzg, zzi7), zzg.zzb((zzap) list.get(1)), zzg.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    if (C0016g.m26i(zzbl.FOR_OF_LET, 3, list, 0) instanceof zzat) {
                        String zzi8 = ((zzap) list.get(0)).zzi();
                        return zze(new zzbe(zzg, zzi8), zzg.zzb((zzap) list.get(1)), zzg.zzb((zzap) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.zzb(str);
            }
        } else {
            zzap zzap3 = (zzap) C0016g.m26i(zzbl.WHILE, 4, list, 0);
            zzap zzap4 = (zzap) list.get(1);
            zzap zzb3 = zzg.zzb((zzap) list.get(3));
            if (zzg.zzb((zzap) list.get(2)).zzg().booleanValue()) {
                zzap zzc2 = zzg.zzc((zzae) zzb3);
                if (zzc2 instanceof zzag) {
                    zzag zzag2 = (zzag) zzc2;
                    if ("break".equals(zzag2.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzag2.zzc())) {
                        return zzag2;
                    }
                }
            }
            while (zzg.zzb(zzap3).zzg().booleanValue()) {
                zzap zzc3 = zzg.zzc((zzae) zzb3);
                if (zzc3 instanceof zzag) {
                    zzag zzag3 = (zzag) zzc3;
                    if ("break".equals(zzag3.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzag3.zzc())) {
                        return zzag3;
                    }
                }
                zzg.zzb(zzap4);
            }
            return zzap.zzf;
        }
    }
}
