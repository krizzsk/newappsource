package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.os.Build;
import java.io.File;

final class zzbv {
    @TargetApi(9)
    public static boolean zza(String str) {
        String str2;
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(str);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
                return true;
            }
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(Build.VERSION.SDK);
            if (valueOf.length() != 0) {
                str2 = "Invalid version number: ".concat(valueOf);
            } else {
                str2 = new String("Invalid version number: ");
            }
            zzdh.zza(str2);
        }
        return false;
    }
}
