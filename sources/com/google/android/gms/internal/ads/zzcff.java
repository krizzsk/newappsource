package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;

public final /* synthetic */ class zzcff implements zzcfg {
    public final /* synthetic */ byte[] zza;

    public /* synthetic */ zzcff(byte[] bArr) {
        this.zza = bArr;
    }

    public final void zza(JsonWriter jsonWriter) {
        byte[] bArr = this.zza;
        int i = zzcfh.zza;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encode = Base64Utils.encode(bArr);
        if (length < 10000) {
            jsonWriter.name(GroupedInventoryCardActivity.EXTRA_BODY).value(encode);
        } else {
            String zze = zzcfb.zze(encode);
            if (zze != null) {
                jsonWriter.name("bodydigest").value(zze);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}
