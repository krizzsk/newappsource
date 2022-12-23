package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public final class zzakc extends zzajp {
    public zzakc() {
    }

    public zzakc(zzakb zzakb, SSLSocketFactory sSLSocketFactory) {
    }

    public static List zza(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String zzait : (List) entry.getValue()) {
                    arrayList.add(new zzait((String) entry.getKey(), zzait));
                }
            }
        }
        return arrayList;
    }
}
