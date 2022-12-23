package com.google.android.gms.internal.gtm;

import com.google.android.gms.tagmanager.zzdh;
import com.google.android.gms.tagmanager.zzfv;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p001a0.C0016g;

public final class zzsa {
    public static zzak zza(zzak zzak) {
        zzal zzg = zzak.zzg();
        zzg.zzt(1);
        zzg.zzt(zzak.zzO());
        zzg.zzi();
        zzg.zza(zzak.zzq());
        zzg.zzo(zzak.zzN());
        return (zzak) zzg.zzC();
    }

    public static zzrs zzb(zzaa zzaa) throws zzrz {
        zzak[] zzakArr = new zzak[zzaa.zzf()];
        for (int i = 0; i < zzaa.zzf(); i++) {
            zze(i, zzaa, zzakArr, new HashSet(0));
        }
        zzru zzru = new zzru((zzrt) null);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < zzaa.zze(); i2++) {
            arrayList.add(zzf(zzaa.zzi(i2), zzaa, zzakArr, i2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < zzaa.zzc(); i3++) {
            arrayList2.add(zzf(zzaa.zzh(i3), zzaa, zzakArr, i3));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < zzaa.zza(); i4++) {
            zzro zzf = zzf(zzaa.zzg(i4), zzaa, zzakArr, i4);
            zzru.zzb(zzf);
            arrayList3.add(zzf);
        }
        for (zzac next : zzaa.zzr()) {
            zzry zzry = new zzry((zzrx) null);
            for (Integer intValue : next.zzh()) {
                zzry.zzg((zzro) arrayList2.get(intValue.intValue()));
            }
            for (Integer intValue2 : next.zzg()) {
                zzry.zzf((zzro) arrayList2.get(intValue2.intValue()));
            }
            for (Integer intValue3 : next.zze()) {
                zzry.zzd((zzro) arrayList.get(intValue3.intValue()));
            }
            for (Integer intValue4 : next.zzf()) {
                zzry.zze(zzaa.zzn(intValue4.intValue()).zzp());
            }
            for (Integer intValue5 : next.zzk()) {
                zzry.zzj((zzro) arrayList.get(intValue5.intValue()));
            }
            for (Integer intValue6 : next.zzl()) {
                zzry.zzk(zzaa.zzn(intValue6.intValue()).zzp());
            }
            for (Integer intValue7 : next.zzc()) {
                zzry.zzb((zzro) arrayList3.get(intValue7.intValue()));
            }
            for (Integer intValue8 : next.zzd()) {
                zzry.zzc(zzaa.zzn(intValue8.intValue()).zzp());
            }
            for (Integer intValue9 : next.zzi()) {
                zzry.zzh((zzro) arrayList3.get(intValue9.intValue()));
            }
            for (Integer intValue10 : next.zzj()) {
                zzry.zzi(zzaa.zzn(intValue10.intValue()).zzp());
            }
            zzru.zzc(zzry.zza());
        }
        zzru.zze(zzaa.zzo());
        zzru.zzd(zzaa.zzd());
        return zzru.zza();
    }

    public static void zzc(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private static zzae zzd(zzak zzak) throws zzrz {
        zzux zzux = zzae.zza;
        if (!zzak.zzW(zzux)) {
            String valueOf = String.valueOf(zzak);
            zzh(C0016g.m31o(new StringBuilder(valueOf.length() + 54), "Expected a ServingValue and didn't get one. Value is: ", valueOf));
        }
        return (zzae) zzak.zzV(zzux);
    }

    private static zzak zze(int i, zzaa zzaa, zzak[] zzakArr, Set<Integer> set) throws zzrz {
        zzal zzal;
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            String valueOf2 = String.valueOf(set);
            StringBuilder sb = new StringBuilder(valueOf2.length() + 90);
            sb.append("Value cycle detected.  Current value reference: ");
            sb.append(i);
            sb.append(".  Previous value references: ");
            sb.append(valueOf2);
            sb.append(".");
            zzh(sb.toString());
        }
        zzal zzal2 = (zzal) ((zzak) zzg(zzaa.zzs(), i, LinksConfiguration.KEY_VALUES)).zzZ();
        zzak zzak = zzakArr[i];
        if (zzak != null) {
            return zzak;
        }
        set.add(valueOf);
        int zzu = zzal2.zzu();
        if (zzu != 2) {
            if (zzu == 3) {
                zzal = (zzal) zza((zzak) zzal2.zzC()).zzZ();
                zzae zzd = zzd((zzak) zzal2.zzC());
                if (zzd.zzc() != zzd.zzd()) {
                    int zzc = zzd.zzc();
                    int zzd2 = zzd.zzd();
                    StringBuilder sb2 = new StringBuilder(58);
                    sb2.append("Uneven map keys (");
                    sb2.append(zzc);
                    sb2.append(") and map values (");
                    sb2.append(zzd2);
                    sb2.append(")");
                    zzh(sb2.toString());
                }
                zzal.zzk();
                zzal.zzl();
                for (Integer intValue : zzd.zzg()) {
                    zzal.zzf(zze(intValue.intValue(), zzaa, zzakArr, set));
                }
                for (Integer intValue2 : zzd.zzh()) {
                    zzal.zzg(zze(intValue2.intValue(), zzaa, zzakArr, set));
                }
            } else if (zzu == 4) {
                zzal = (zzal) zza((zzak) zzal2.zzC()).zzZ();
                zzal.zzr(zzfv.zzn(zzfv.zzl(zze(zzd((zzak) zzal2.zzC()).zza(), zzaa, zzakArr, set))));
            } else if (zzu == 7) {
                zzal = (zzal) zza((zzak) zzal2.zzC()).zzZ();
                zzae zzd3 = zzd((zzak) zzal2.zzC());
                zzal.zzm();
                for (Integer intValue3 : zzd3.zzi()) {
                    zzal.zzh(zze(intValue3.intValue(), zzaa, zzakArr, set));
                }
            }
            zzal2 = zzal;
        } else {
            zzae zzd4 = zzd((zzak) zzal2.zzC());
            zzal2 = (zzal) zza((zzak) zzal2.zzC()).zzZ();
            zzal2.zzj();
            for (Integer intValue4 : zzd4.zzf()) {
                zzal2.zze(zze(intValue4.intValue(), zzaa, zzakArr, set));
            }
        }
        zzakArr[i] = (zzak) zzal2.zzC();
        set.remove(Integer.valueOf(i));
        return (zzak) zzal2.zzC();
    }

    private static zzro zzf(zzs zzs, zzaa zzaa, zzak[] zzakArr, int i) throws zzrz {
        zzrq zzrq = new zzrq((zzrp) null);
        for (Integer intValue : zzs.zzc()) {
            zzy zzy = (zzy) zzg(zzaa.zzq(), intValue.intValue(), "properties");
            String str = (String) zzg(zzaa.zzp(), zzy.zza(), "keys");
            int zzc = zzy.zzc();
            if (zzc < 0 || zzc >= zzakArr.length) {
                zzh(C13715c.m34242h(51, "Index out of bounds detected: ", zzc, " in values"));
            }
            zzak zzak = zzakArr[zzc];
            if (zzb.PUSH_AFTER_EVALUATE.toString().equals(str)) {
                zzrq.zzc(zzak);
            } else {
                zzrq.zzb(str, zzak);
            }
        }
        return zzrq.zza();
    }

    private static <T> T zzg(List<T> list, int i, String str) throws zzrz {
        if (i < 0 || i >= list.size()) {
            StringBuilder sb = new StringBuilder(str.length() + 45);
            sb.append("Index out of bounds detected: ");
            sb.append(i);
            sb.append(" in ");
            sb.append(str);
            zzh(sb.toString());
        }
        return list.get(i);
    }

    private static void zzh(String str) throws zzrz {
        zzdh.zza(str);
        throw new zzrz(str);
    }
}
