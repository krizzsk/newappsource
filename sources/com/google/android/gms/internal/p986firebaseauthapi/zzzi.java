package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "ProviderUserInfoListCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzi */
public final class zzzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzi> CREATOR = new zzzj();
    @SafeParcelable.Field(getter = "getProviderUserInfos", mo65739id = 2)
    private final List zza;

    public zzzi() {
        this.zza = new ArrayList();
    }

    public static zzzi zza(JSONArray jSONArray) throws JSONException {
        zzzg zzzg;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzzi(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject == null) {
                zzzg = new zzzg();
            } else {
                zzzg = new zzzg(Strings.emptyToNull(jSONObject.optString("federatedId", (String) null)), Strings.emptyToNull(jSONObject.optString("displayName", (String) null)), Strings.emptyToNull(jSONObject.optString("photoUrl", (String) null)), Strings.emptyToNull(jSONObject.optString("providerId", (String) null)), (String) null, Strings.emptyToNull(jSONObject.optString("phoneNumber", (String) null)), Strings.emptyToNull(jSONObject.optString("email", (String) null)));
            }
            arrayList.add(zzzg);
        }
        return new zzzi(arrayList);
    }

    public static zzzi zzb(zzzi zzzi) {
        List list = zzzi.zza;
        zzzi zzzi2 = new zzzi();
        if (list != null) {
            zzzi2.zza.addAll(list);
        }
        return zzzi2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final List zzc() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzzi(@SafeParcelable.Param(mo65742id = 2) List list) {
        if (list == null || list.isEmpty()) {
            this.zza = Collections.emptyList();
        } else {
            this.zza = Collections.unmodifiableList(list);
        }
    }
}
