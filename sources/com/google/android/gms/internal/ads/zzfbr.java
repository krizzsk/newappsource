package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfbr {
    public final List zza;
    public final zzfbj zzb;
    public final List zzc;

    public zzfbr(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        List list;
        ArrayList arrayList;
        List emptyList = Collections.emptyList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        zzfbj zzfbj = null;
        List list2 = emptyList;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                List list3 = list2;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        ArrayList arrayList3 = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList3.add(new zzfbg(jsonReader));
                        }
                        jsonReader.endArray();
                        arrayList = arrayList3;
                    } else if (nextName2.equals("common")) {
                        zzfbj = new zzfbj(jsonReader);
                        arrayList = list3;
                    } else {
                        jsonReader.skipValue();
                        arrayList = list3;
                    }
                    list3 = arrayList;
                }
                jsonReader.endObject();
                jsonReader.endArray();
                list = list3;
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = zzbu.zzh(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList2.add(new zzfbq(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
                list = list2;
            } else {
                list = list2;
            }
            list2 = list;
        }
        this.zzc = arrayList2;
        this.zza = list2;
        this.zzb = zzfbj == null ? new zzfbj(new JsonReader(new StringReader("{}"))) : zzfbj;
    }

    public static zzfbr zza(Reader reader) throws zzfbk {
        try {
            zzfbr zzfbr = new zzfbr(new JsonReader(reader));
            IOUtils.closeQuietly((Closeable) reader);
            return zzfbr;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfbk("unable to parse ServerResponse", e);
        } catch (Throwable th) {
            IOUtils.closeQuietly((Closeable) reader);
            throw th;
        }
    }
}
