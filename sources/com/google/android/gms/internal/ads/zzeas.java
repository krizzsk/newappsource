package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeas {
    private final zzcnf zza;
    private final Context zzb;
    private final zzcfo zzc;
    private final zzfby zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfhq zzg;
    private final zzfck zzh;
    private final zzdwb zzi;

    public zzeas(zzcnf zzcnf, Context context, zzcfo zzcfo, zzfby zzfby, Executor executor, String str, zzfhq zzfhq, zzdwb zzdwb) {
        this.zza = zzcnf;
        this.zzb = context;
        this.zzc = zzcfo;
        this.zzd = zzfby;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfhq;
        this.zzh = zzcnf.zzv();
        this.zzi = zzdwb;
    }

    private final zzfvj zzc(String str, String str2) {
        zzfhg zza2 = zzfhf.zza(this.zzb, 11);
        zza2.zzf();
        zzbsz zza3 = zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy());
        zzbst zzbst = zzbsw.zza;
        zzfvj zzn = zzfva.zzn(zzfva.zzn(zzfva.zzn(zzfva.zzi(""), new zzeap(this, str, str2), this.zze), new zzeaq(zza3.zza("google.afma.response.normalize", zzbst, zzbst)), this.zze), new zzear(this), this.zze);
        zzfhp.zza(zzn, this.zzg, zza2);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzcfi.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfvj zza() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzfby r0 = r10.zzd
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd
            java.lang.String r0 = r0.zzx
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "true"
            if (r1 != 0) goto L_0x010d
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzfT
            com.google.android.gms.internal.ads.zzbhw r3 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r3.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x010d
            java.lang.String r1 = zze(r0)
            com.google.android.gms.internal.ads.zzbhq r3 = com.google.android.gms.internal.ads.zzbhy.zzgf
            com.google.android.gms.internal.ads.zzbhw r4 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r4 = r4.zzb(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = -1
            if (r4 == 0) goto L_0x004e
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x004e
            java.lang.String r1 = "&request_id="
            int r1 = r0.lastIndexOf(r1)
            if (r1 == r5) goto L_0x004c
            int r1 = r1 + 12
            java.lang.String r1 = r0.substring(r1)
            goto L_0x004e
        L_0x004c:
            java.lang.String r1 = ""
        L_0x004e:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzeio r0 = new com.google.android.gms.internal.ads.zzeio
            r1 = 15
            java.lang.String r2 = "Invalid ad string."
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzfvj r0 = com.google.android.gms.internal.ads.zzfva.zzh(r0)
            return r0
        L_0x0062:
            com.google.android.gms.internal.ads.zzcnf r4 = r10.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzc r4 = r4.zzm()
            com.google.android.gms.internal.ads.zzdwb r6 = r10.zzi
            java.lang.String r4 = r4.zzb(r1, r6)
            com.google.android.gms.internal.ads.zzbhw r6 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r3 = r6.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00fd
            com.google.android.gms.internal.ads.zzdwb r3 = r10.zzi
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x00fd
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r7 = "is_gbid"
            java.lang.String r6 = r6.optString(r7)     // Catch:{ JSONException -> 0x009a }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x009a }
            if (r6 == 0) goto L_0x009a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x009a }
            goto L_0x009c
        L_0x009a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L_0x009c:
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00fd
            java.lang.String r6 = "&"
            int r6 = r0.lastIndexOf(r6)     // Catch:{ UnsupportedEncodingException -> 0x00e6 }
            r7 = 0
            if (r6 == r5) goto L_0x00b1
            r5 = 0
            java.lang.String r5 = r0.substring(r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x00e6 }
            goto L_0x00b2
        L_0x00b1:
            r5 = r7
        L_0x00b2:
            r6 = 11
            byte[] r5 = android.util.Base64.decode(r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x00e6 }
            java.lang.String r6 = "UTF-8"
            byte[] r1 = r1.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x00e6 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ca }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x00ca }
            java.lang.String r8 = "arek"
            java.lang.String r7 = r6.getString(r8)     // Catch:{ JSONException -> 0x00ca }
            goto L_0x00e1
        L_0x00ca:
            r6 = move-exception
            java.lang.String r8 = "Failed to get key from QueryJSONMap"
            java.lang.String r9 = r6.toString()     // Catch:{ UnsupportedEncodingException -> 0x00e6 }
            java.lang.String r8 = r8.concat(r9)     // Catch:{ UnsupportedEncodingException -> 0x00e6 }
            com.google.android.gms.ads.internal.util.zze.zza(r8)     // Catch:{ UnsupportedEncodingException -> 0x00e6 }
            com.google.android.gms.internal.ads.zzcer r8 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ UnsupportedEncodingException -> 0x00e6 }
            java.lang.String r9 = "CryptoUtils.getKeyFromQueryJsonMap"
            r8.zzt(r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x00e6 }
        L_0x00e1:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfck.zzb(r5, r1, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x00e6 }
            goto L_0x00fd
        L_0x00e6:
            r1 = move-exception
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = "Failed to decode the adResponse. "
            java.lang.String r3 = r5.concat(r3)
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            com.google.android.gms.internal.ads.zzcer r3 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r5 = "PreloadedLoader.decryptAdResponseIfNecessary"
            r3.zzt(r1, r5)
        L_0x00fd:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x0104
            goto L_0x010d
        L_0x0104:
            java.lang.String r1 = r10.zzd(r4)
            com.google.android.gms.internal.ads.zzfvj r0 = r10.zzc(r0, r1)
            return r0
        L_0x010d:
            com.google.android.gms.internal.ads.zzfby r0 = r10.zzd
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs
            if (r0 == 0) goto L_0x016c
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzfR
            com.google.android.gms.internal.ads.zzbhw r3 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r3.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0128
            goto L_0x0154
        L_0x0128:
            java.lang.String r1 = r0.zza
            java.lang.String r1 = zze(r1)
            java.lang.String r3 = r0.zzb
            java.lang.String r3 = zze(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0161
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0161
            com.google.android.gms.internal.ads.zzcnf r2 = r10.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzc r2 = r2.zzm()
            r2.zzf(r1)
            com.google.android.gms.internal.ads.zzdwb r2 = r10.zzi
            java.util.Map r2 = r2.zza()
            java.lang.String r3 = "rid"
            r2.put(r3, r1)
        L_0x0154:
            java.lang.String r1 = r0.zza
            java.lang.String r0 = r0.zzb
            java.lang.String r0 = r10.zzd(r0)
            com.google.android.gms.internal.ads.zzfvj r0 = r10.zzc(r1, r0)
            return r0
        L_0x0161:
            com.google.android.gms.internal.ads.zzdwb r0 = r10.zzi
            java.util.Map r0 = r0.zza()
            java.lang.String r1 = "ridmm"
            r0.put(r1, r2)
        L_0x016c:
            com.google.android.gms.internal.ads.zzeio r0 = new com.google.android.gms.internal.ads.zzeio
            r1 = 14
            java.lang.String r2 = "Mismatch request IDs."
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzfvj r0 = com.google.android.gms.internal.ads.zzfva.zzh(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeas.zza():com.google.android.gms.internal.ads.zzfvj");
    }

    public final /* synthetic */ zzfvj zzb(JSONObject jSONObject) throws Exception {
        return zzfva.zzi(new zzfbs(new zzfbp(this.zzd), zzfbr.zza(new StringReader(jSONObject.toString()))));
    }
}
