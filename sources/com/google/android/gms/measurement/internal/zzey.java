package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.appboy.Constants;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzey {
    public final /* synthetic */ zzfd zza;
    private final String zzb = "default_event_parameters";
    private final Bundle zzc = new Bundle();
    private Bundle zzd;

    public zzey(zzfd zzfd, String str, Bundle bundle) {
        this.zza = zzfd;
        Preconditions.checkNotEmpty("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r10.zza.zzs.zzay().zzd().zza("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[Catch:{ NumberFormatException | JSONException -> 0x00a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zza() {
        /*
            r10 = this;
            android.os.Bundle r0 = r10.zzd
            if (r0 == 0) goto L_0x0006
            goto L_0x00cc
        L_0x0006:
            com.google.android.gms.measurement.internal.zzfd r0 = r10.zza
            android.content.SharedPreferences r0 = r0.zza()
            java.lang.String r1 = r10.zzb
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x00c4
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x00bb }
            r1.<init>()     // Catch:{ JSONException -> 0x00bb }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00bb }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00bb }
            r0 = 0
        L_0x0020:
            int r3 = r2.length()     // Catch:{ JSONException -> 0x00bb }
            if (r0 >= r3) goto L_0x00b8
            org.json.JSONObject r3 = r2.getJSONObject(r0)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r4 = "n"
            java.lang.String r4 = r3.getString(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "t"
            java.lang.String r5 = r3.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            int r6 = r5.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r7 = 100
            r8 = 2
            r9 = 1
            if (r6 == r7) goto L_0x005d
            r7 = 108(0x6c, float:1.51E-43)
            if (r6 == r7) goto L_0x0053
            r7 = 115(0x73, float:1.61E-43)
            if (r6 == r7) goto L_0x0049
            goto L_0x0067
        L_0x0049:
            java.lang.String r6 = "s"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0067
            r6 = 0
            goto L_0x0068
        L_0x0053:
            java.lang.String r6 = "l"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0067
            r6 = 2
            goto L_0x0068
        L_0x005d:
            java.lang.String r6 = "d"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0067
            r6 = 1
            goto L_0x0068
        L_0x0067:
            r6 = -1
        L_0x0068:
            java.lang.String r7 = "v"
            if (r6 == 0) goto L_0x009b
            if (r6 == r9) goto L_0x008f
            if (r6 == r8) goto L_0x0083
            com.google.android.gms.measurement.internal.zzfd r3 = r10.zza     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.zzfy r3 = r3.zzs     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzd()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r4 = "Unrecognized persisted bundle type. Type"
            r3.zzb(r4, r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x0083:
            java.lang.String r3 = r3.getString(r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            long r5 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putLong(r4, r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x008f:
            java.lang.String r3 = r3.getString(r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            double r5 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putDouble(r4, r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x009b:
            java.lang.String r3 = r3.getString(r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putString(r4, r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x00a3:
            com.google.android.gms.measurement.internal.zzfd r3 = r10.zza     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.zzfy r3 = r3.zzs     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzd()     // Catch:{ JSONException -> 0x00bb }
            java.lang.String r4 = "Error reading value from SharedPreferences. Value dropped"
            r3.zza(r4)     // Catch:{ JSONException -> 0x00bb }
        L_0x00b4:
            int r0 = r0 + 1
            goto L_0x0020
        L_0x00b8:
            r10.zzd = r1     // Catch:{ JSONException -> 0x00bb }
            goto L_0x00c4
        L_0x00bb:
            com.google.android.gms.measurement.internal.zzfd r0 = r10.zza
            com.google.android.gms.measurement.internal.zzfy r0 = r0.zzs
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            p379.C16530d.m42018k(r0, r1)
        L_0x00c4:
            android.os.Bundle r0 = r10.zzd
            if (r0 != 0) goto L_0x00cc
            android.os.Bundle r0 = r10.zzc
            r10.zzd = r0
        L_0x00cc:
            android.os.Bundle r0 = r10.zzd
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzey.zza():android.os.Bundle");
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.zza.zza().edit();
        if (bundle.size() == 0) {
            edit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put(Constants.APPBOY_PUSH_TITLE_KEY, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
                        } else if (obj instanceof Long) {
                            jSONObject.put(Constants.APPBOY_PUSH_TITLE_KEY, "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put(Constants.APPBOY_PUSH_TITLE_KEY, "d");
                        } else {
                            this.zza.zzs.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.zza.zzs.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.zzd = bundle;
    }
}
