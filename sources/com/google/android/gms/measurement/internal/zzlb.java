package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzex;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzoz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class zzlb extends zzkn {
    public zzlb(zzkz zzkz) {
        super(zzkz);
    }

    public static final boolean zzA(zzaw zzaw, zzq zzq) {
        Preconditions.checkNotNull(zzaw);
        Preconditions.checkNotNull(zzq);
        if (!TextUtils.isEmpty(zzq.zzb) || !TextUtils.isEmpty(zzq.zzq)) {
            return true;
        }
        return false;
    }

    public static final zzfw zzB(zzfs zzfs, String str) {
        for (zzfw zzfw : zzfs.zzi()) {
            if (zzfw.zzg().equals(str)) {
                return zzfw;
            }
        }
        return null;
    }

    public static final Object zzC(zzfs zzfs, String str) {
        zzfw zzB = zzB(zzfs, str);
        if (zzB == null) {
            return null;
        }
        if (zzB.zzy()) {
            return zzB.zzh();
        }
        if (zzB.zzw()) {
            return Long.valueOf(zzB.zzd());
        }
        if (zzB.zzu()) {
            return Double.valueOf(zzB.zza());
        }
        if (zzB.zzc() <= 0) {
            return null;
        }
        List<zzfw> zzi = zzB.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfw zzfw : zzi) {
            if (zzfw != null) {
                Bundle bundle = new Bundle();
                for (zzfw zzfw2 : zzfw.zzi()) {
                    if (zzfw2.zzy()) {
                        bundle.putString(zzfw2.zzg(), zzfw2.zzh());
                    } else if (zzfw2.zzw()) {
                        bundle.putLong(zzfw2.zzg(), zzfw2.zzd());
                    } else if (zzfw2.zzu()) {
                        bundle.putDouble(zzfw2.zzg(), zzfw2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void zzD(StringBuilder sb, int i, List list) {
        String str;
        String str2;
        Long l;
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfw zzfw = (zzfw) it.next();
                if (zzfw != null) {
                    zzF(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (zzfw.zzx()) {
                        str = this.zzs.zzj().zze(zzfw.zzg());
                    } else {
                        str = null;
                    }
                    zzI(sb, i2, "name", str);
                    if (zzfw.zzy()) {
                        str2 = zzfw.zzh();
                    } else {
                        str2 = null;
                    }
                    zzI(sb, i2, "string_value", str2);
                    if (zzfw.zzw()) {
                        l = Long.valueOf(zzfw.zzd());
                    } else {
                        l = null;
                    }
                    zzI(sb, i2, "int_value", l);
                    if (zzfw.zzu()) {
                        d = Double.valueOf(zzfw.zza());
                    }
                    zzI(sb, i2, "double_value", d);
                    if (zzfw.zzc() > 0) {
                        zzD(sb, i2, zzfw.zzi());
                    }
                    zzF(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    private final void zzE(StringBuilder sb, int i, zzel zzel) {
        String str;
        if (zzel != null) {
            zzF(sb, i);
            sb.append("filter {\n");
            if (zzel.zzh()) {
                zzI(sb, i, "complement", Boolean.valueOf(zzel.zzg()));
            }
            if (zzel.zzj()) {
                zzI(sb, i, "param_name", this.zzs.zzj().zze(zzel.zze()));
            }
            if (zzel.zzk()) {
                int i2 = i + 1;
                zzex zzd = zzel.zzd();
                if (zzd != null) {
                    zzF(sb, i2);
                    sb.append("string_filter {\n");
                    if (zzd.zzi()) {
                        switch (zzd.zzj()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        zzI(sb, i2, "match_type", str);
                    }
                    if (zzd.zzh()) {
                        zzI(sb, i2, "expression", zzd.zzd());
                    }
                    if (zzd.zzg()) {
                        zzI(sb, i2, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                    }
                    if (zzd.zza() > 0) {
                        zzF(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : zzd.zze()) {
                            zzF(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    zzF(sb, i2);
                    sb.append("}\n");
                }
            }
            if (zzel.zzi()) {
                zzJ(sb, i + 1, "number_filter", zzel.zzc());
            }
            zzF(sb, i);
            sb.append("}\n");
        }
    }

    private static final void zzF(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static final String zzG(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void zzH(StringBuilder sb, int i, String str, zzgh zzgh) {
        Integer num;
        Integer num2;
        Long l;
        if (zzgh != null) {
            zzF(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (zzgh.zzb() != 0) {
                zzF(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l2 : zzgh.zzk()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (zzgh.zzd() != 0) {
                zzF(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l3 : zzgh.zzn()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l3);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (zzgh.zza() != 0) {
                zzF(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (zzfq zzfq : zzgh.zzj()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    if (zzfq.zzh()) {
                        num2 = Integer.valueOf(zzfq.zza());
                    } else {
                        num2 = null;
                    }
                    sb.append(num2);
                    sb.append(":");
                    if (zzfq.zzg()) {
                        l = Long.valueOf(zzfq.zzb());
                    } else {
                        l = null;
                    }
                    sb.append(l);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (zzgh.zzc() != 0) {
                zzF(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (zzgj zzgj : zzgh.zzm()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    if (zzgj.zzi()) {
                        num = Integer.valueOf(zzgj.zzb());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    sb.append(": [");
                    int i11 = 0;
                    for (Long longValue : zzgj.zzf()) {
                        long longValue2 = longValue.longValue();
                        int i12 = i11 + 1;
                        if (i11 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i11 = i12;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            zzF(sb, 3);
            sb.append("}\n");
        }
    }

    private static final void zzI(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            zzF(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    private static final void zzJ(StringBuilder sb, int i, String str, zzeq zzeq) {
        String str2;
        if (zzeq != null) {
            zzF(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (zzeq.zzg()) {
                int zzm = zzeq.zzm();
                if (zzm == 1) {
                    str2 = "UNKNOWN_COMPARISON_TYPE";
                } else if (zzm == 2) {
                    str2 = "LESS_THAN";
                } else if (zzm == 3) {
                    str2 = "GREATER_THAN";
                } else if (zzm != 4) {
                    str2 = "BETWEEN";
                } else {
                    str2 = "EQUAL";
                }
                zzI(sb, i, "comparison_type", str2);
            }
            if (zzeq.zzi()) {
                zzI(sb, i, "match_as_float", Boolean.valueOf(zzeq.zzf()));
            }
            if (zzeq.zzh()) {
                zzI(sb, i, "comparison_value", zzeq.zzc());
            }
            if (zzeq.zzk()) {
                zzI(sb, i, "min_comparison_value", zzeq.zze());
            }
            if (zzeq.zzj()) {
                zzI(sb, i, "max_comparison_value", zzeq.zzd());
            }
            zzF(sb, i);
            sb.append("}\n");
        }
    }

    public static int zza(zzgb zzgb, String str) {
        if (zzgb != null) {
            for (int i = 0; i < zzgb.zzb(); i++) {
                if (str.equals(zzgb.zzao(i).zzf())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static zzlk zzl(zzlk zzlk, byte[] bArr) throws zzko {
        zzjq zza = zzjq.zza();
        if (zza != null) {
            return zzlk.zzaA(bArr, zza);
        }
        return zzlk.zzaz(bArr);
    }

    public static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static boolean zzv(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
            return true;
        }
        return false;
    }

    public static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void zzz(zzfr zzfr, String str, Object obj) {
        List zzp = zzfr.zzp();
        int i = 0;
        while (true) {
            if (i >= zzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((zzfw) zzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        zzfv zze = zzfw.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i >= 0) {
            zzfr.zzj(i, zze);
        } else {
            zzfr.zze(zze);
        }
    }

    public final boolean zzb() {
        return false;
    }

    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest zzF = zzlh.zzF();
        if (zzF != null) {
            return zzlh.zzp(zzF.digest(bArr));
        }
        C16530d.m42018k(this.zzs, "Failed to get MD5");
        return 0;
    }

    public final Bundle zzf(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(zzf((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.zzs.zzay().zzd().zza("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable zzh(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.zzfy r5 = r4.zzs     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzeo r5 = r5.zzay()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzem r5 = r5.zzd()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.zza(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlb.zzh(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    public final zzaw zzi(zzaa zzaa) {
        String str;
        Object obj;
        Bundle zzf = zzf(zzaa.zze(), true);
        if (!zzf.containsKey("_o") || (obj = zzf.get("_o")) == null) {
            str = "app";
        } else {
            str = obj.toString();
        }
        String str2 = str;
        String zzb = zzgv.zzb(zzaa.zzd());
        if (zzb == null) {
            zzb = zzaa.zzd();
        }
        return new zzaw(zzb, new zzau(zzf), str2, zzaa.zza());
    }

    public final zzfs zzj(zzar zzar) {
        zzfr zze = zzfs.zze();
        zze.zzl(zzar.zze);
        zzat zzat = new zzat(zzar.zzf);
        while (zzat.hasNext()) {
            String zza = zzat.next();
            zzfv zze2 = zzfw.zze();
            zze2.zzj(zza);
            Object zzf = zzar.zzf.zzf(zza);
            Preconditions.checkNotNull(zzf);
            zzt(zze2, zzf);
            zze.zze(zze2);
        }
        return (zzfs) zze.zzaE();
    }

    public final String zzm(zzga zzga) {
        Long l;
        Long l2;
        Double d;
        if (zzga == null) {
            return "";
        }
        StringBuilder k = C13555b.m33972k("\nbatch {\n");
        for (zzgc zzgc : zzga.zzd()) {
            if (zzgc != null) {
                zzF(k, 1);
                k.append("bundle {\n");
                if (zzgc.zzbj()) {
                    zzI(k, 1, "protocol_version", Integer.valueOf(zzgc.zzd()));
                }
                zzoz.zzc();
                if (this.zzs.zzf().zzs((String) null, zzeb.zzar) && zzgc.zzbm()) {
                    zzI(k, 1, "session_stitching_token", zzgc.zzK());
                }
                zzI(k, 1, ServerParameters.PLATFORM, zzgc.zzI());
                if (zzgc.zzbf()) {
                    zzI(k, 1, "gmp_version", Long.valueOf(zzgc.zzm()));
                }
                if (zzgc.zzbq()) {
                    zzI(k, 1, "uploading_gmp_version", Long.valueOf(zzgc.zzr()));
                }
                if (zzgc.zzbd()) {
                    zzI(k, 1, "dynamite_version", Long.valueOf(zzgc.zzj()));
                }
                if (zzgc.zzba()) {
                    zzI(k, 1, "config_version", Long.valueOf(zzgc.zzh()));
                }
                zzI(k, 1, "gmp_app_id", zzgc.zzF());
                zzI(k, 1, "admob_app_id", zzgc.zzw());
                zzI(k, 1, "app_id", zzgc.zzx());
                zzI(k, 1, "app_version", zzgc.zzA());
                if (zzgc.zzaY()) {
                    zzI(k, 1, "app_version_major", Integer.valueOf(zzgc.zza()));
                }
                zzI(k, 1, "firebase_instance_id", zzgc.zzE());
                if (zzgc.zzbc()) {
                    zzI(k, 1, "dev_cert_hash", Long.valueOf(zzgc.zzi()));
                }
                zzI(k, 1, "app_store", zzgc.zzz());
                if (zzgc.zzbp()) {
                    zzI(k, 1, "upload_timestamp_millis", Long.valueOf(zzgc.zzq()));
                }
                if (zzgc.zzbn()) {
                    zzI(k, 1, "start_timestamp_millis", Long.valueOf(zzgc.zzp()));
                }
                if (zzgc.zzbe()) {
                    zzI(k, 1, "end_timestamp_millis", Long.valueOf(zzgc.zzk()));
                }
                if (zzgc.zzbi()) {
                    zzI(k, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgc.zzo()));
                }
                if (zzgc.zzbh()) {
                    zzI(k, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgc.zzn()));
                }
                zzI(k, 1, "app_instance_id", zzgc.zzy());
                zzI(k, 1, "resettable_device_id", zzgc.zzJ());
                zzI(k, 1, "ds_id", zzgc.zzD());
                if (zzgc.zzbg()) {
                    zzI(k, 1, "limited_ad_tracking", Boolean.valueOf(zzgc.zzaW()));
                }
                zzI(k, 1, "os_version", zzgc.zzH());
                zzI(k, 1, "device_model", zzgc.zzC());
                zzI(k, 1, "user_default_language", zzgc.zzL());
                if (zzgc.zzbo()) {
                    zzI(k, 1, "time_zone_offset_minutes", Integer.valueOf(zzgc.zzf()));
                }
                if (zzgc.zzaZ()) {
                    zzI(k, 1, "bundle_sequential_index", Integer.valueOf(zzgc.zzb()));
                }
                if (zzgc.zzbl()) {
                    zzI(k, 1, "service_upload", Boolean.valueOf(zzgc.zzaX()));
                }
                zzI(k, 1, "health_monitor", zzgc.zzG());
                if (zzgc.zzbk()) {
                    zzI(k, 1, "retry_counter", Integer.valueOf(zzgc.zze()));
                }
                if (zzgc.zzbb()) {
                    zzI(k, 1, "consent_signals", zzgc.zzB());
                }
                List<zzgl> zzO = zzgc.zzO();
                if (zzO != null) {
                    for (zzgl zzgl : zzO) {
                        if (zzgl != null) {
                            zzF(k, 2);
                            k.append("user_property {\n");
                            if (zzgl.zzs()) {
                                l = Long.valueOf(zzgl.zzc());
                            } else {
                                l = null;
                            }
                            zzI(k, 2, "set_timestamp_millis", l);
                            zzI(k, 2, "name", this.zzs.zzj().zzf(zzgl.zzf()));
                            zzI(k, 2, "string_value", zzgl.zzg());
                            if (zzgl.zzr()) {
                                l2 = Long.valueOf(zzgl.zzb());
                            } else {
                                l2 = null;
                            }
                            zzI(k, 2, "int_value", l2);
                            if (zzgl.zzq()) {
                                d = Double.valueOf(zzgl.zza());
                            } else {
                                d = null;
                            }
                            zzI(k, 2, "double_value", d);
                            zzF(k, 2);
                            k.append("}\n");
                        }
                    }
                }
                List<zzfo> zzM = zzgc.zzM();
                if (zzM != null) {
                    for (zzfo zzfo : zzM) {
                        if (zzfo != null) {
                            zzF(k, 2);
                            k.append("audience_membership {\n");
                            if (zzfo.zzk()) {
                                zzI(k, 2, "audience_id", Integer.valueOf(zzfo.zza()));
                            }
                            if (zzfo.zzm()) {
                                zzI(k, 2, "new_audience", Boolean.valueOf(zzfo.zzj()));
                            }
                            zzH(k, 2, "current_data", zzfo.zzd());
                            if (zzfo.zzn()) {
                                zzH(k, 2, "previous_data", zzfo.zze());
                            }
                            zzF(k, 2);
                            k.append("}\n");
                        }
                    }
                }
                List<zzfs> zzN = zzgc.zzN();
                if (zzN != null) {
                    for (zzfs zzfs : zzN) {
                        if (zzfs != null) {
                            zzF(k, 2);
                            k.append("event {\n");
                            zzI(k, 2, "name", this.zzs.zzj().zzd(zzfs.zzh()));
                            if (zzfs.zzu()) {
                                zzI(k, 2, "timestamp_millis", Long.valueOf(zzfs.zzd()));
                            }
                            if (zzfs.zzt()) {
                                zzI(k, 2, "previous_timestamp_millis", Long.valueOf(zzfs.zzc()));
                            }
                            if (zzfs.zzs()) {
                                zzI(k, 2, "count", Integer.valueOf(zzfs.zza()));
                            }
                            if (zzfs.zzb() != 0) {
                                zzD(k, 2, zzfs.zzi());
                            }
                            zzF(k, 2);
                            k.append("}\n");
                        }
                    }
                }
                zzF(k, 1);
                k.append("}\n");
            }
        }
        k.append("}\n");
        return k.toString();
    }

    public final String zzo(zzej zzej) {
        if (zzej == null) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        StringBuilder k = C13555b.m33972k("\nevent_filter {\n");
        if (zzej.zzp()) {
            zzI(k, 0, "filter_id", Integer.valueOf(zzej.zzb()));
        }
        zzI(k, 0, "event_name", this.zzs.zzj().zzd(zzej.zzg()));
        String zzG = zzG(zzej.zzk(), zzej.zzm(), zzej.zzn());
        if (!zzG.isEmpty()) {
            zzI(k, 0, "filter_type", zzG);
        }
        if (zzej.zzo()) {
            zzJ(k, 1, "event_count_filter", zzej.zzf());
        }
        if (zzej.zza() > 0) {
            k.append("  filters {\n");
            for (zzel zzE : zzej.zzh()) {
                zzE(k, 2, zzE);
            }
        }
        zzF(k, 1);
        k.append("}\n}\n");
        return k.toString();
    }

    public final String zzp(zzes zzes) {
        if (zzes == null) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        StringBuilder k = C13555b.m33972k("\nproperty_filter {\n");
        if (zzes.zzj()) {
            zzI(k, 0, "filter_id", Integer.valueOf(zzes.zza()));
        }
        zzI(k, 0, "property_name", this.zzs.zzj().zzf(zzes.zze()));
        String zzG = zzG(zzes.zzg(), zzes.zzh(), zzes.zzi());
        if (!zzG.isEmpty()) {
            zzI(k, 0, "filter_type", zzG);
        }
        zzE(k, 1, zzes.zzb());
        k.append("}\n");
        return k.toString();
    }

    public final List zzq(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzs.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    public final Map zzs(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzs((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zzs((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zzs((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public final void zzt(zzfv zzfv, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfv.zzg();
        zzfv.zze();
        zzfv.zzd();
        zzfv.zzf();
        if (obj instanceof String) {
            zzfv.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfv.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfv.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfv zze = zzfw.zze();
                    for (String next : bundle.keySet()) {
                        zzfv zze2 = zzfw.zze();
                        zze2.zzj(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzfw) zze.zzaE());
                    }
                }
            }
            zzfv.zzb(arrayList);
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void zzu(zzgk zzgk, Object obj) {
        Preconditions.checkNotNull(obj);
        zzgk.zzc();
        zzgk.zzb();
        zzgk.zza();
        if (obj instanceof String) {
            zzgk.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzgk.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgk.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean zzw(long j, long j2) {
        if (j == 0 || j2 <= 0 || Math.abs(this.zzs.zzav().currentTimeMillis() - j) > j2) {
            return true;
        }
        return false;
    }

    public final byte[] zzy(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzs.zzay().zzd().zzb("Failed to gzip content", e);
            throw e;
        }
    }
}
