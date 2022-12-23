package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzesy implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzesy(zzfvk zzfvk, Context context) {
        this.zza = zzfvk;
        this.zzb = context;
    }

    public static Bundle zzc(Context context, JSONArray jSONArray) {
        int i;
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            if (optInt == 0) {
                i = 1;
            } else if (optInt == 1) {
                i = 2;
            } else if (optInt != 2) {
                i = 0;
            } else {
                i = 3;
            }
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = i - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public final int zza() {
        return 37;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzesw(this));
    }

    public final /* synthetic */ zzeta zzd() throws Exception {
        String str = (String) zzay.zzc().zzb(zzbhy.zzfb);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new zzesx(zzc(this.zzb, new JSONArray(str)));
        } catch (JSONException e) {
            zzcfi.zzf("JSON parsing error", e);
            return null;
        }
    }
}
