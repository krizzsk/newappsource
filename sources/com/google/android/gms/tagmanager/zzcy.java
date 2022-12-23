package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class zzcy extends zzbu {
    private static final String zza = zza.JOINER.toString();
    private static final String zzb = zzb.ARG0.toString();
    private static final String zzc = zzb.ITEM_SEPARATOR.toString();
    private static final String zzd = zzb.KEY_VALUE_SEPARATOR.toString();
    private static final String zze = zzb.ESCAPE.toString();

    public zzcy() {
        super(zza, zzb);
    }

    private static final void zzc(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    private static final String zzd(String str, int i, Set<Character> set) {
        String str2;
        int i2 = i - 1;
        if (i2 == 1) {
            try {
                return zzfy.zza(str);
            } catch (UnsupportedEncodingException e) {
                zzdh.zzb("Joiner: unsupported encoding", e);
                return str;
            }
        } else if (i2 != 2) {
            return str;
        } else {
            String replace = str.replace("\\", "\\\\");
            for (Character ch : set) {
                String ch2 = ch.toString();
                String valueOf = String.valueOf(ch2);
                if (valueOf.length() != 0) {
                    str2 = "\\".concat(valueOf);
                } else {
                    str2 = new String("\\");
                }
                replace = replace.replace(ch2, str2);
            }
            return replace;
        }
    }

    public final zzak zza(Map<String, zzak> map) {
        String str;
        String str2;
        int i;
        String str3;
        zzak zzak = map.get(zzb);
        if (zzak == null) {
            return zzfv.zzb();
        }
        zzak zzak2 = map.get(zzc);
        if (zzak2 != null) {
            str = zzfv.zzn(zzfv.zzl(zzak2));
        } else {
            str = "";
        }
        zzak zzak3 = map.get(zzd);
        if (zzak3 != null) {
            str2 = zzfv.zzn(zzfv.zzl(zzak3));
        } else {
            str2 = "=";
        }
        zzak zzak4 = map.get(zze);
        HashSet hashSet = null;
        boolean z = true;
        if (zzak4 != null) {
            String zzn = zzfv.zzn(zzfv.zzl(zzak4));
            if ("url".equals(zzn)) {
                i = 2;
            } else if ("backslash".equals(zzn)) {
                hashSet = new HashSet();
                zzc(hashSet, str);
                zzc(hashSet, str2);
                hashSet.remove('\\');
                i = 3;
            } else {
                String valueOf = String.valueOf(zzn);
                if (valueOf.length() != 0) {
                    str3 = "Joiner: unsupported escape type: ".concat(valueOf);
                } else {
                    str3 = new String("Joiner: unsupported escape type: ");
                }
                zzdh.zza(str3);
                return zzfv.zzb();
            }
        } else {
            i = 1;
        }
        StringBuilder sb = new StringBuilder();
        int zzO = zzak.zzO();
        if (zzO == 2) {
            for (zzak next : zzak.zzr()) {
                if (!z) {
                    sb.append(str);
                }
                sb.append(zzd(zzfv.zzn(zzfv.zzl(next)), i, hashSet));
                z = false;
            }
        } else if (zzO != 3) {
            sb.append(zzd(zzfv.zzn(zzfv.zzl(zzak)), i, hashSet));
        } else {
            for (int i2 = 0; i2 < zzak.zzc(); i2++) {
                if (i2 > 0) {
                    sb.append(str);
                }
                String zzn2 = zzfv.zzn(zzfv.zzl(zzak.zzk(i2)));
                String zzn3 = zzfv.zzn(zzfv.zzl(zzak.zzl(i2)));
                sb.append(zzd(zzn2, i, hashSet));
                sb.append(str2);
                sb.append(zzd(zzn3, i, hashSet));
            }
        }
        return zzfv.zzc(sb.toString());
    }

    public final boolean zzb() {
        return true;
    }
}
