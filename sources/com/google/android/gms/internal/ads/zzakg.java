package com.google.android.gms.internal.ads;

import com.amazonaws.http.HttpHeader;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class zzakg extends zzajb {
    private final Object zza = new Object();
    private final zzajg zzb;

    public zzakg(int i, String str, zzajg zzajg, zzajf zzajf) {
        super(i, str, zzajf);
        this.zzb = zzajg;
    }

    public final zzajh zzh(zzaix zzaix) {
        String str;
        try {
            byte[] bArr = zzaix.zzb;
            Map map = zzaix.zzc;
            String str2 = "ISO-8859-1";
            if (map != null) {
                String str3 = (String) map.get(HttpHeader.CONTENT_TYPE);
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaix.zzb);
        }
        return zzajh.zzb(str, zzajy.zzb(zzaix));
    }

    /* renamed from: zzz */
    public void zzo(String str) {
        zzajg zzajg;
        synchronized (this.zza) {
            zzajg = this.zzb;
        }
        zzajg.zza(str);
    }
}
