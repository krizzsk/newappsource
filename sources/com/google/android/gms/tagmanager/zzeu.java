package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzal;
import com.google.android.gms.internal.gtm.zzao;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzro;
import com.google.android.gms.internal.gtm.zzrs;
import com.google.android.gms.internal.gtm.zzrw;
import com.google.android.gms.internal.gtm.zzsa;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0017h;

@VisibleForTesting
final class zzeu {
    private static final zzds<zzak> zza = new zzds<>(zzfv.zzb(), true);
    private final zzrs zzb;
    private final Map<String, zzbu> zzc;
    private final Map<String, zzbu> zzd;
    private final Map<String, zzbu> zze;
    private final Set<zzrw> zzf;
    private final DataLayer zzg;
    private final Map<String, zzet> zzh = new HashMap();
    private volatile String zzi;
    private int zzj;
    private final zzdl zzk;
    private final zzdb zzl;
    private final zzdb zzm;

    public zzeu(Context context, zzrs zzrs, DataLayer dataLayer, zzaq zzaq, zzaq zzaq2, zzdl zzdl, byte[] bArr) {
        this.zzb = zzrs;
        HashSet<zzrw> hashSet = new HashSet<>(zzrs.zzc());
        this.zzf = hashSet;
        this.zzg = dataLayer;
        this.zzk = zzdl;
        zzen zzen = new zzen(this);
        new zzs();
        this.zzl = zzs.zza(1048576, zzen);
        zzeo zzeo = new zzeo(this);
        new zzs();
        this.zzm = zzs.zza(1048576, zzeo);
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        zzj(hashMap, new zzo(context));
        zzj(hashMap, new zzar(zzaq2));
        zzj(hashMap, new zzbf(dataLayer));
        zzj(hashMap, new zzfw(context, dataLayer));
        HashMap hashMap2 = new HashMap();
        this.zzd = hashMap2;
        zzj(hashMap2, new zzao());
        zzj(hashMap2, new zzbr());
        zzj(hashMap2, new zzbs());
        zzj(hashMap2, new zzbw());
        zzj(hashMap2, new zzbx());
        zzj(hashMap2, new zzdd());
        zzj(hashMap2, new zzde());
        zzj(hashMap2, new zzee());
        zzj(hashMap2, new zzfk());
        HashMap hashMap3 = new HashMap();
        this.zze = hashMap3;
        zzj(hashMap3, new zze(zzd.zzb(context)));
        zzj(hashMap3, new zzf(zzd.zzb(context)));
        zzj(hashMap3, new zzh(context));
        zzj(hashMap3, new zzi(context));
        zzj(hashMap3, new zzj(context));
        zzj(hashMap3, new zzk(context));
        zzj(hashMap3, new zzl(context));
        zzj(hashMap3, new zzt());
        zzj(hashMap3, new zzan(zzrs.zzb()));
        zzj(hashMap3, new zzar(zzaq));
        zzj(hashMap3, new zzay(dataLayer));
        zzj(hashMap3, new zzbi(context));
        zzj(hashMap3, new zzbj());
        zzj(hashMap3, new zzbq());
        zzj(hashMap3, new zzbt(this));
        zzj(hashMap3, new zzby());
        zzj(hashMap3, new zzbz());
        zzj(hashMap3, new zzcw(context));
        zzj(hashMap3, new zzcy());
        zzj(hashMap3, new zzdc());
        zzj(hashMap3, new zzdi());
        zzj(hashMap3, new zzdj(context));
        zzj(hashMap3, new zzdt());
        zzj(hashMap3, new zzdx());
        zzj(hashMap3, new zzeb());
        zzj(hashMap3, new zzed());
        zzj(hashMap3, new zzef(context));
        zzj(hashMap3, new zzev());
        zzj(hashMap3, new zzew());
        zzj(hashMap3, new zzfq());
        zzj(hashMap3, new zzfx());
        for (zzrw zzrw : hashSet) {
            for (int i = 0; i < zzrw.zza().size(); i++) {
                zzro zzro = zzrw.zza().get(i);
                zzet zzg2 = zzg(this.zzh, zzh(zzro));
                zzg2.zzk(zzrw);
                zzg2.zzg(zzrw, zzro);
                zzg2.zzh(zzrw, "Unknown");
            }
            for (int i2 = 0; i2 < zzrw.zzf().size(); i2++) {
                zzro zzro2 = zzrw.zzf().get(i2);
                zzet zzg3 = zzg(this.zzh, zzh(zzro2));
                zzg3.zzk(zzrw);
                zzg3.zzi(zzrw, zzro2);
                zzg3.zzj(zzrw, "Unknown");
            }
        }
        for (Map.Entry next : this.zzb.zzd().entrySet()) {
            for (zzro zzro3 : (List) next.getValue()) {
                if (!zzfv.zzg(zzfv.zzl(zzro3.zzc().get(zzb.NOT_DEFAULT_MACRO.toString()))).booleanValue()) {
                    zzg(this.zzh, (String) next.getKey()).zzl(zzro3);
                }
            }
        }
    }

    private static zzet zzg(Map<String, zzet> map, String str) {
        zzet zzet = map.get(str);
        if (zzet != null) {
            return zzet;
        }
        zzet zzet2 = new zzet();
        map.put(str, zzet2);
        return zzet2;
    }

    private static String zzh(zzro zzro) {
        return zzfv.zzn(zzfv.zzl(zzro.zzc().get(zzb.INSTANCE_NAME.toString())));
    }

    private final String zzi() {
        if (this.zzj <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.zzj));
        for (int i = 2; i < this.zzj; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    private static void zzj(Map<String, zzbu> map, zzbu zzbu) {
        String str;
        if (map.containsKey(zzbu.zze())) {
            String valueOf = String.valueOf(zzbu.zze());
            if (valueOf.length() != 0) {
                str = "Duplicate function type name: ".concat(valueOf);
            } else {
                str = new String("Duplicate function type name: ");
            }
            throw new IllegalArgumentException(str);
        }
        map.put(zzbu.zze(), zzbu);
    }

    private final void zzk(zzak zzak, Set<String> set) {
        zzds<zzak> zzo;
        if (zzak != null && (zzo = zzo(zzak, set, new zzdq())) != zza) {
            Object zzl2 = zzfv.zzl(zzo.zza());
            if (zzl2 instanceof Map) {
                this.zzg.push((Map) zzl2);
            } else if (zzl2 instanceof List) {
                for (Object next : (List) zzl2) {
                    if (next instanceof Map) {
                        this.zzg.push((Map) next);
                    } else {
                        zzdh.zzc("pushAfterEvaluate: value not a Map");
                    }
                }
            } else {
                zzdh.zzc("pushAfterEvaluate: value not a Map or List");
            }
        }
    }

    private final zzds<Set<zzro>> zzl(Set<zzrw> set, Set<String> set2, zzer zzer, zzdp zzdp) {
        boolean z;
        zzds zzds;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<zzrw> it = set.iterator();
        while (true) {
            boolean z2 = true;
            while (true) {
                if (it.hasNext()) {
                    zzrw next = it.next();
                    zzdo zzdo = new zzdo();
                    Iterator<zzro> it2 = next.zzd().iterator();
                    while (true) {
                        boolean z3 = true;
                        while (true) {
                            if (!it2.hasNext()) {
                                Iterator<zzro> it3 = next.zze().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        Boolean bool = Boolean.TRUE;
                                        zzfv.zzc(bool);
                                        zzds = new zzds(bool, z);
                                        break;
                                    }
                                    zzds<Boolean> zzf2 = zzf(it3.next(), set2, new zzdn());
                                    if (!zzf2.zza().booleanValue()) {
                                        Boolean bool2 = Boolean.FALSE;
                                        zzfv.zzc(bool2);
                                        zzds = new zzds(bool2, zzf2.zzb());
                                        break;
                                    } else if (!z || !zzf2.zzb()) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                }
                            } else {
                                zzds<Boolean> zzf3 = zzf(it2.next(), set2, new zzdn());
                                if (zzf3.zza().booleanValue()) {
                                    Boolean bool3 = Boolean.FALSE;
                                    zzfv.zzc(bool3);
                                    zzds = new zzds(bool3, zzf3.zzb());
                                    break;
                                } else if (!z || !zzf3.zzb()) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                    if (((Boolean) zzds.zza()).booleanValue()) {
                        zzer.zza(next, hashSet, hashSet2, zzdo);
                    }
                    if (!z2 || !zzds.zzb()) {
                        z2 = false;
                    }
                } else {
                    hashSet.removeAll(hashSet2);
                    return new zzds<>(hashSet, z2);
                }
            }
        }
    }

    private final zzds<zzak> zzm(String str, Set<String> set, zzdm zzdm) {
        zzro zzro;
        boolean z = true;
        this.zzj++;
        zzes zzes = (zzes) this.zzm.zza(str);
        if (zzes == null) {
            zzet zzet = this.zzh.get(str);
            if (zzet == null) {
                String zzi2 = zzi();
                StringBuilder sb = new StringBuilder(String.valueOf(zzi2).length() + 15 + String.valueOf(str).length());
                sb.append(zzi2);
                sb.append("Invalid macro: ");
                sb.append(str);
                zzdh.zza(sb.toString());
                this.zzj--;
                return zza;
            }
            zzds<Set<zzro>> zzl2 = zzl(zzet.zzf(), set, new zzep(this, zzet.zzc(), zzet.zzb(), zzet.zze(), zzet.zzd()), new zzdp());
            if (zzl2.zza().isEmpty()) {
                zzro = zzet.zza();
            } else {
                if (zzl2.zza().size() > 1) {
                    String zzi3 = zzi();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzi3).length() + 37 + String.valueOf(str).length());
                    sb2.append(zzi3);
                    sb2.append("Multiple macros active for macroName ");
                    sb2.append(str);
                    zzdh.zzc(sb2.toString());
                }
                zzro = (zzro) zzl2.zza().iterator().next();
            }
            if (zzro == null) {
                this.zzj--;
                return zza;
            }
            zzds<zzak> zzn = zzn(this.zze, zzro, set, new zzdn());
            if (!zzl2.zzb() || !zzn.zzb()) {
                z = false;
            }
            zzds<zzak> zzds = zza;
            if (zzn != zzds) {
                zzds = new zzds<>(zzn.zza(), z);
            }
            zzak zza2 = zzro.zza();
            if (zzds.zzb()) {
                this.zzm.zzb(str, new zzes(zzds, zza2));
            }
            zzk(zza2, set);
            this.zzj--;
            return zzds;
        }
        zzk(zzes.zzb(), set);
        this.zzj--;
        return zzes.zzc();
    }

    private final zzds<zzak> zzn(Map<String, zzbu> map, zzro zzro, Set<String> set, zzdn zzdn) {
        zzak zzak = zzro.zzc().get(zzb.FUNCTION.toString());
        if (zzak == null) {
            zzdh.zza("No function id in properties");
            return zza;
        }
        String zzn = zzak.zzn();
        zzbu zzbu = map.get(zzn);
        if (zzbu == null) {
            zzdh.zza(String.valueOf(zzn).concat(" has no backing implementation."));
            return zza;
        }
        zzds<zzak> zzds = (zzds) this.zzl.zza(zzro);
        if (zzds != null) {
            return zzds;
        }
        HashMap hashMap = new HashMap();
        boolean z = true;
        boolean z2 = true;
        for (Map.Entry next : zzro.zzc().entrySet()) {
            String str = (String) next.getKey();
            zzak zzak2 = (zzak) next.getValue();
            zzds<zzak> zzo = zzo((zzak) next.getValue(), set, new zzdq());
            zzds<zzak> zzds2 = zza;
            if (zzo == zzds2) {
                return zzds2;
            }
            if (zzo.zzb()) {
                zzro.zzd((String) next.getKey(), zzo.zza());
            } else {
                z2 = false;
            }
            hashMap.put((String) next.getKey(), zzo.zza());
        }
        if (!zzbu.zzg(hashMap.keySet())) {
            String valueOf = String.valueOf(zzbu.zzf());
            String valueOf2 = String.valueOf(hashMap.keySet());
            StringBuilder sb = new StringBuilder(C16530d.m42011d(String.valueOf(zzn).length(), 43, valueOf.length(), valueOf2.length()));
            C0017h.m61R(sb, "Incorrect keys for function ", zzn, " required ", valueOf);
            sb.append(" had ");
            sb.append(valueOf2);
            zzdh.zza(sb.toString());
            return zza;
        }
        if (!z2 || !zzbu.zzb()) {
            z = false;
        }
        zzds<zzak> zzds3 = new zzds<>(zzbu.zza(hashMap), z);
        if (z) {
            this.zzl.zzb(zzro, zzds3);
        }
        zzak zza2 = zzds3.zza();
        return zzds3;
    }

    private final zzds<zzak> zzo(zzak zzak, Set<String> set, zzdq zzdq) {
        String str;
        if (!zzak.zzN()) {
            return new zzds<>(zzak, true);
        }
        int zzO = zzak.zzO();
        if (zzO == 2) {
            zzal zzal = (zzal) zzsa.zza(zzak).zzZ();
            zzal.zzj();
            for (int i = 0; i < zzak.zza(); i++) {
                zzds<zzak> zzo = zzo(zzak.zzj(i), set, new zzdq());
                zzds<zzak> zzds = zza;
                if (zzo == zzds) {
                    return zzds;
                }
                zzal.zze(zzo.zza());
            }
            return new zzds<>((zzak) zzal.zzC(), false);
        } else if (zzO == 3) {
            zzal zzal2 = (zzal) zzsa.zza(zzak).zzZ();
            if (zzak.zzc() != zzak.zzd()) {
                String valueOf = String.valueOf(zzak.toString());
                if (valueOf.length() != 0) {
                    str = "Invalid serving value: ".concat(valueOf);
                } else {
                    str = new String("Invalid serving value: ");
                }
                zzdh.zza(str);
                return zza;
            }
            zzal2.zzk();
            zzal2.zzl();
            for (int i2 = 0; i2 < zzak.zzc(); i2++) {
                zzds<zzak> zzo2 = zzo(zzak.zzk(i2), set, new zzdq());
                zzds<zzak> zzo3 = zzo(zzak.zzl(i2), set, new zzdq());
                zzds<zzak> zzds2 = zza;
                if (zzo2 == zzds2 || zzo3 == zzds2) {
                    return zzds2;
                }
                zzal2.zzf(zzo2.zza());
                zzal2.zzg(zzo3.zza());
            }
            return new zzds<>((zzak) zzal2.zzC(), false);
        } else if (zzO != 4) {
            if (zzO != 7) {
                String num = Integer.toString(zzak.zzO());
                StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 14);
                sb.append("Unknown type: ");
                sb.append(num);
                zzdh.zza(sb.toString());
                return zza;
            }
            zzal zzal3 = (zzal) zzsa.zza(zzak).zzZ();
            zzal3.zzm();
            for (int i3 = 0; i3 < zzak.zze(); i3++) {
                zzds<zzak> zzo4 = zzo(zzak.zzm(i3), set, new zzdq());
                zzds<zzak> zzds3 = zza;
                if (zzo4 == zzds3) {
                    return zzds3;
                }
                zzal3.zzh(zzo4.zza());
            }
            return new zzds<>((zzak) zzal3.zzC(), false);
        } else if (set.contains(zzak.zzo())) {
            String zzo5 = zzak.zzo();
            String obj = set.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzo5).length() + 79 + String.valueOf(obj).length());
            C0017h.m61R(sb2, "Macro cycle detected.  Current macro reference: ", zzo5, ".  Previous macro references: ", obj);
            sb2.append(".");
            zzdh.zza(sb2.toString());
            return zza;
        } else {
            set.add(zzak.zzo());
            zzds<zzak> zzm2 = zzm(zzak.zzo(), set, new zzdm());
            for (zzao zzao : (zzao[]) zzak.zzq().toArray(new zzao[0])) {
                if (!(zzfv.zzl(zzm2.zza()) instanceof String)) {
                    zzdh.zza("Escaping can only be applied to strings.");
                } else {
                    zzao zzao2 = zzao.ESCAPE_HTML;
                    if (zzao.ordinal() != 11) {
                        String valueOf2 = String.valueOf(zzao);
                        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 28);
                        sb3.append("Unsupported Value Escaping: ");
                        sb3.append(valueOf2);
                        zzdh.zza(sb3.toString());
                    } else {
                        try {
                            zzm2 = new zzds<>(zzfv.zzc(zzfy.zza(zzfv.zzn(zzfv.zzl(zzm2.zza())))), zzm2.zzb());
                        } catch (UnsupportedEncodingException e) {
                            zzdh.zzb("Escape URI: unsupported encoding", e);
                        }
                    }
                }
            }
            set.remove(zzak.zzo());
            return zzm2;
        }
    }

    public final zzds<zzak> zza(String str) {
        this.zzj = 0;
        return zzm(str, new HashSet(), new zzdm());
    }

    public final synchronized String zzb() {
        return this.zzi;
    }

    public final synchronized void zzc(String str) {
        zzd(str);
        for (zzro zzn : zzl(this.zzf, new HashSet(), new zzeq(this), new zzdp()).zza()) {
            zzn(this.zzc, zzn, new HashSet(), new zzdn());
        }
        zzd((String) null);
    }

    @VisibleForTesting
    public final synchronized void zzd(String str) {
        this.zzi = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zze(java.util.List<com.google.android.gms.internal.gtm.zzag> r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x01a6 }
        L_0x0005:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x01a6 }
            com.google.android.gms.internal.gtm.zzag r0 = (com.google.android.gms.internal.gtm.zzag) r0     // Catch:{ all -> 0x01a6 }
            boolean r1 = r0.zzf()     // Catch:{ all -> 0x01a6 }
            if (r1 == 0) goto L_0x0182
            java.lang.String r1 = r0.zzd()     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = "gaExperiment:"
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x01a6 }
            if (r1 != 0) goto L_0x0025
            goto L_0x0182
        L_0x0025:
            com.google.android.gms.tagmanager.DataLayer r1 = r13.zzg     // Catch:{ all -> 0x01a6 }
            boolean r2 = r0.zze()     // Catch:{ all -> 0x01a6 }
            if (r2 != 0) goto L_0x0033
            java.lang.String r0 = "supplemental missing experimentSupplemental"
            com.google.android.gms.tagmanager.zzdh.zzc(r0)     // Catch:{ all -> 0x01a6 }
            goto L_0x0005
        L_0x0033:
            com.google.android.gms.internal.gtm.zzw r2 = r0.zza()     // Catch:{ all -> 0x01a6 }
            java.util.List r2 = r2.zze()     // Catch:{ all -> 0x01a6 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01a6 }
        L_0x003f:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x01a6 }
            if (r3 == 0) goto L_0x0057
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x01a6 }
            com.google.android.gms.internal.gtm.zzak r3 = (com.google.android.gms.internal.gtm.zzak) r3     // Catch:{ all -> 0x01a6 }
            java.lang.Object r3 = com.google.android.gms.tagmanager.zzfv.zzl(r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = com.google.android.gms.tagmanager.zzfv.zzn(r3)     // Catch:{ all -> 0x01a6 }
            r1.zzd(r3)     // Catch:{ all -> 0x01a6 }
            goto L_0x003f
        L_0x0057:
            com.google.android.gms.internal.gtm.zzw r2 = r0.zza()     // Catch:{ all -> 0x01a6 }
            java.util.List r2 = r2.zzf()     // Catch:{ all -> 0x01a6 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01a6 }
        L_0x0063:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x01a6 }
            r4 = 0
            if (r3 == 0) goto L_0x00a6
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x01a6 }
            com.google.android.gms.internal.gtm.zzak r3 = (com.google.android.gms.internal.gtm.zzak) r3     // Catch:{ all -> 0x01a6 }
            java.lang.Object r3 = com.google.android.gms.tagmanager.zzfv.zzl(r3)     // Catch:{ all -> 0x01a6 }
            boolean r5 = r3 instanceof java.util.Map     // Catch:{ all -> 0x01a6 }
            if (r5 != 0) goto L_0x009d
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01a6 }
            int r5 = r3.length()     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            int r5 = r5 + 36
            r6.<init>(r5)     // Catch:{ all -> 0x01a6 }
            java.lang.String r5 = "value: "
            r6.append(r5)     // Catch:{ all -> 0x01a6 }
            r6.append(r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = " is not a map value, ignored."
            r6.append(r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x01a6 }
            com.google.android.gms.tagmanager.zzdh.zzc(r3)     // Catch:{ all -> 0x01a6 }
            goto L_0x00a0
        L_0x009d:
            r4 = r3
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x01a6 }
        L_0x00a0:
            if (r4 == 0) goto L_0x0063
            r1.push(r4)     // Catch:{ all -> 0x01a6 }
            goto L_0x0063
        L_0x00a6:
            com.google.android.gms.internal.gtm.zzw r0 = r0.zza()     // Catch:{ all -> 0x01a6 }
            java.util.List r0 = r0.zzd()     // Catch:{ all -> 0x01a6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01a6 }
        L_0x00b2:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x01a6 }
            if (r2 == 0) goto L_0x0005
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x01a6 }
            com.google.android.gms.internal.gtm.zzu r2 = (com.google.android.gms.internal.gtm.zzu) r2     // Catch:{ all -> 0x01a6 }
            boolean r3 = r2.zzh()     // Catch:{ all -> 0x01a6 }
            if (r3 != 0) goto L_0x00ca
            java.lang.String r2 = "GaExperimentRandom: No key"
            com.google.android.gms.tagmanager.zzdh.zzc(r2)     // Catch:{ all -> 0x01a6 }
            goto L_0x00b2
        L_0x00ca:
            java.lang.String r3 = r2.zzf()     // Catch:{ all -> 0x01a6 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x01a6 }
            boolean r5 = r3 instanceof java.lang.Number     // Catch:{ all -> 0x01a6 }
            if (r5 != 0) goto L_0x00d8
            r5 = r4
            goto L_0x00e3
        L_0x00d8:
            r5 = r3
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x01a6 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x01a6 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01a6 }
        L_0x00e3:
            long r6 = r2.zzd()     // Catch:{ all -> 0x01a6 }
            long r8 = r2.zzc()     // Catch:{ all -> 0x01a6 }
            boolean r10 = r2.zzg()     // Catch:{ all -> 0x01a6 }
            if (r10 == 0) goto L_0x0103
            if (r5 == 0) goto L_0x0103
            long r10 = r5.longValue()     // Catch:{ all -> 0x01a6 }
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 < 0) goto L_0x0103
            long r10 = r5.longValue()     // Catch:{ all -> 0x01a6 }
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0119
        L_0x0103:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x017b
            double r10 = java.lang.Math.random()     // Catch:{ all -> 0x01a6 }
            long r8 = r8 - r6
            double r8 = (double) r8     // Catch:{ all -> 0x01a6 }
            double r10 = r10 * r8
            double r5 = (double) r6     // Catch:{ all -> 0x01a6 }
            double r10 = r10 + r5
            long r5 = java.lang.Math.round(r10)     // Catch:{ all -> 0x01a6 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01a6 }
        L_0x0119:
            java.lang.String r5 = r2.zzf()     // Catch:{ all -> 0x01a6 }
            r1.zzd(r5)     // Catch:{ all -> 0x01a6 }
            java.lang.String r5 = r2.zzf()     // Catch:{ all -> 0x01a6 }
            java.util.Map r3 = r1.zza(r5, r3)     // Catch:{ all -> 0x01a6 }
            long r5 = r2.zza()     // Catch:{ all -> 0x01a6 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0176
            java.lang.String r5 = "gtm"
            boolean r5 = r3.containsKey(r5)     // Catch:{ all -> 0x01a6 }
            if (r5 != 0) goto L_0x0157
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a6 }
            r6 = 0
            java.lang.String r7 = "lifetime"
            r5[r6] = r7     // Catch:{ all -> 0x01a6 }
            r6 = 1
            long r7 = r2.zza()     // Catch:{ all -> 0x01a6 }
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01a6 }
            r5[r6] = r2     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = "gtm"
            java.util.Map r5 = com.google.android.gms.tagmanager.DataLayer.mapOf(r5)     // Catch:{ all -> 0x01a6 }
            r3.put(r2, r5)     // Catch:{ all -> 0x01a6 }
            goto L_0x0176
        L_0x0157:
            java.lang.String r5 = "gtm"
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x01a6 }
            boolean r6 = r5 instanceof java.util.Map     // Catch:{ all -> 0x01a6 }
            if (r6 == 0) goto L_0x0171
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x01a6 }
            java.lang.String r6 = "lifetime"
            long r7 = r2.zza()     // Catch:{ all -> 0x01a6 }
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01a6 }
            r5.put(r6, r2)     // Catch:{ all -> 0x01a6 }
            goto L_0x0176
        L_0x0171:
            java.lang.String r2 = "GaExperimentRandom: gtm not a map"
            com.google.android.gms.tagmanager.zzdh.zzc(r2)     // Catch:{ all -> 0x01a6 }
        L_0x0176:
            r1.push(r3)     // Catch:{ all -> 0x01a6 }
            goto L_0x00b2
        L_0x017b:
            java.lang.String r2 = "GaExperimentRandom: random range invalid"
            com.google.android.gms.tagmanager.zzdh.zzc(r2)     // Catch:{ all -> 0x01a6 }
            goto L_0x00b2
        L_0x0182:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01a6 }
            int r1 = r0.length()     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            int r1 = r1 + 22
            r2.<init>(r1)     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "Ignored supplemental: "
            r2.append(r1)     // Catch:{ all -> 0x01a6 }
            r2.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a6 }
            com.google.android.gms.tagmanager.zzbg r1 = com.google.android.gms.tagmanager.zzdh.zzb     // Catch:{ all -> 0x01a6 }
            r1.zzd(r0)     // Catch:{ all -> 0x01a6 }
            goto L_0x0005
        L_0x01a4:
            monitor-exit(r13)
            return
        L_0x01a6:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzeu.zze(java.util.List):void");
    }

    @VisibleForTesting
    public final zzds<Boolean> zzf(zzro zzro, Set<String> set, zzdn zzdn) {
        zzds<zzak> zzn = zzn(this.zzd, zzro, set, zzdn);
        Boolean zzg2 = zzfv.zzg(zzfv.zzl(zzn.zza()));
        zzfv.zzc(zzg2);
        return new zzds<>(zzg2, zzn.zzb());
    }
}
