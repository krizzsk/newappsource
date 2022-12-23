package p110h8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.FeatureManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.C24179b;
import mf0.C24362h;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: h8.h */
public final class C5149h {

    /* renamed from: a */
    public static final C5149h f17195a = new C5149h();

    /* renamed from: b */
    public static final AtomicBoolean f17196b = new AtomicBoolean(false);

    /* renamed from: a */
    public static final void m13061a() {
        Class<C5149h> cls = C5149h.class;
        if (!C6606a.m15601b(cls)) {
            try {
                if (f17196b.get()) {
                    if (f17195a.mo20882b()) {
                        FeatureManager featureManager = FeatureManager.f8588a;
                        if (FeatureManager.m6257c(FeatureManager.Feature.IapLoggingLib2)) {
                            C5140d dVar = C5140d.f17156a;
                            C5140d.m13032b(C0115o.m210a());
                            return;
                        }
                    }
                    C5139c.m13031b();
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo20882b() {
        if (C6606a.m15601b(this)) {
            return false;
        }
        try {
            Context a = C0115o.m210a();
            ApplicationInfo applicationInfo = a.getPackageManager().getApplicationInfo(a.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE);
            C24362h.m61210e(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string != null && Integer.parseInt((String) C24179b.m60577Y(string, new String[]{"."}, 3, 2).get(0)) >= 2) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return false;
        }
    }
}
