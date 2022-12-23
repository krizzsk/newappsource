package p459ee;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ee.d */
public final class C16814d {

    /* renamed from: a */
    public final Context f43775a;

    /* renamed from: b */
    public C16815a f43776b = null;

    /* renamed from: ee.d$a */
    public class C16815a {

        /* renamed from: a */
        public final String f43777a;

        /* renamed from: b */
        public final String f43778b;

        public C16815a(C16814d dVar) {
            int f = CommonUtils.m35968f(dVar.f43775a, "com.google.firebase.crashlytics.unity_version", "string");
            if (f != 0) {
                this.f43777a = "Unity";
                this.f43778b = dVar.f43775a.getResources().getString(f);
                return;
            }
            boolean z = false;
            if (dVar.f43775a.getAssets() != null) {
                try {
                    InputStream open = dVar.f43775a.getAssets().open("flutter_assets/NOTICES.Z");
                    if (open != null) {
                        open.close();
                    }
                    z = true;
                } catch (IOException unused) {
                }
            }
            if (z) {
                this.f43777a = "Flutter";
                this.f43778b = null;
                return;
            }
            this.f43777a = null;
            this.f43778b = null;
        }
    }

    public C16814d(Context context) {
        this.f43775a = context;
    }
}
