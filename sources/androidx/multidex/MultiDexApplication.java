package androidx.multidex;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import p166m2.C5663a;

public class MultiDexApplication extends Application {
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        if (!C5663a.f18433b) {
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                try {
                    C5663a.m13934b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                } catch (Exception e) {
                    StringBuilder k = C13555b.m33972k("MultiDex installation failed (");
                    k.append(e.getMessage());
                    k.append(").");
                    throw new RuntimeException(k.toString());
                }
            }
        }
    }
}
