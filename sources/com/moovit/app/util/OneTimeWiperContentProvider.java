package com.moovit.app.util;

import android.annotation.SuppressLint;
import android.content.Context;
import com.moovit.commons.utils.contentprovider.AbstractContentProvider;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p090g1.C4732a;
import p435de.C16596f;
import p786rz.C19387a;
import p810sz.C19610m;

@SuppressLint({"LogNotTimber"})
public final class OneTimeWiperContentProvider extends AbstractContentProvider {
    /* renamed from: a */
    public static File m39952a(Context context) {
        return new File(context.getFilesDir(), C25541a.m63881k(context.getApplicationInfo().packageName, ".onetimewiper.data"));
    }

    public final boolean onCreate() {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        File cacheDir;
        Context context = getContext();
        if (context == null) {
            return false;
        }
        try {
            if (m39952a(context).exists()) {
                return false;
            }
            File dataDir = C4732a.getDataDir(context);
            if (dataDir == null && (cacheDir = context.getCacheDir()) != null) {
                dataDir = cacheDir.getParentFile();
            }
            if (dataDir != null) {
                C19387a.m46674f(dataDir);
            }
            bufferedOutputStream = null;
            try {
                bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(m39952a(context)));
                new C19610m(bufferedOutputStream2).mo51955t("WIPED");
                C19387a.m46677i(bufferedOutputStream2);
                return false;
            } catch (IOException unused) {
                C19387a.m46677i(bufferedOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                C19387a.m46677i(bufferedOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedOutputStream = bufferedOutputStream2;
            C19387a.m46677i(bufferedOutputStream);
            return false;
        } catch (Throwable th2) {
            C16596f.m42113a().mo49364c(new RuntimeException("Failed to wipe the application data!", th2));
            return false;
        }
    }
}
