package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

public final /* synthetic */ class zzcfd implements zzcfg {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzcfd(String str) {
        this.zza = str;
    }

    public final void zza(JsonWriter jsonWriter) {
        String str = this.zza;
        int i = zzcfh.zza;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
