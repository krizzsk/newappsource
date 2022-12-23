package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "GetAccountInfoResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyr */
public final class zzyr extends AbstractSafeParcelable implements zzwp<zzyr> {
    public static final Parcelable.Creator<zzyr> CREATOR = new zzys();
    private static final String zza = "zzyr";
    @SafeParcelable.Field(getter = "getUserList", mo65739id = 2)
    private zzyv zzb;

    static {
        Class<zzyr> cls = zzyr.class;
    }

    public zzyr() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final /* bridge */ /* synthetic */ zzwp zza(String str) throws zzui {
        zzyv zzyv;
        int i;
        zzyt zzyt;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                this.zzb = new zzyv();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                Parcelable.Creator<zzyv> creator = zzyv.CREATOR;
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z = false;
                        int i2 = 0;
                        while (i2 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                            if (jSONObject2 == null) {
                                zzyt = new zzyt();
                                i = i2;
                            } else {
                                String emptyToNull = Strings.emptyToNull(jSONObject2.optString("localId", (String) null));
                                String emptyToNull2 = Strings.emptyToNull(jSONObject2.optString("email", (String) null));
                                boolean optBoolean = jSONObject2.optBoolean("emailVerified", z);
                                String emptyToNull3 = Strings.emptyToNull(jSONObject2.optString("displayName", (String) null));
                                String emptyToNull4 = Strings.emptyToNull(jSONObject2.optString("photoUrl", (String) null));
                                zzzi zza2 = zzzi.zza(jSONObject2.optJSONArray("providerUserInfo"));
                                String emptyToNull5 = Strings.emptyToNull(jSONObject2.optString("rawPassword", (String) null));
                                String emptyToNull6 = Strings.emptyToNull(jSONObject2.optString("phoneNumber", (String) null));
                                i = i2;
                                long optLong = jSONObject2.optLong("createdAt", 0);
                                zzyt = new zzyt(emptyToNull, emptyToNull2, optBoolean, emptyToNull3, emptyToNull4, zza2, emptyToNull5, emptyToNull6, optLong, jSONObject2.optLong("lastLoginAt", 0), false, (zze) null, zzze.zzf(jSONObject2.optJSONArray("mfaInfo")));
                            }
                            arrayList.add(zzyt);
                            i2 = i + 1;
                            z = false;
                        }
                        zzyv = new zzyv(arrayList);
                        this.zzb = zzyv;
                    }
                }
                zzyv = new zzyv(new ArrayList());
                this.zzb = zzyv;
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzaam.zza(e, zza, str2);
        }
    }

    public final List zzb() {
        return this.zzb.zzb();
    }

    @SafeParcelable.Constructor
    public zzyr(@SafeParcelable.Param(mo65742id = 2) zzyv zzyv) {
        zzyv zzyv2;
        if (zzyv == null) {
            zzyv2 = new zzyv();
        } else {
            zzyv2 = zzyv.zza(zzyv);
        }
        this.zzb = zzyv2;
    }
}
