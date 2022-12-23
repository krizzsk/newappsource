package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.play.core.appupdate.q */
public final class C14239q {

    /* renamed from: a */
    public final Context f35782a;

    public C14239q(Context context) {
        this.f35782a = context;
    }

    /* renamed from: a */
    public static long m35440a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File a : listFiles) {
                j += m35440a(a);
            }
        }
        return j;
    }
}
