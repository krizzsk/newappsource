package p030bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import com.appboy.support.AppboyLogger;

/* renamed from: bo.app.j1 */
public class C1609j1 {

    /* renamed from: c */
    public static final String f5755c = AppboyLogger.getBrazeLogTag(C1609j1.class);

    /* renamed from: a */
    public final Context f5756a;

    /* renamed from: b */
    public final C1742z1 f5757b;

    public C1609j1(Context context, C1742z1 z1Var) {
        this.f5756a = context;
        this.f5757b = z1Var;
    }

    /* renamed from: a */
    public static boolean m4325a(Context context) {
        return m4324a() && m4326b(context);
    }

    /* renamed from: b */
    public void mo6160b() {
        if (this.f5757b.mo5912a() != null) {
            String str = f5755c;
            AppboyLogger.m5453i(str, "The device is already registered with the ADM server and is eligible to receive ADM messages.");
            AppboyLogger.m5453i(str, "ADM registration id: " + this.f5757b.mo5912a());
            C1742z1 z1Var = this.f5757b;
            z1Var.mo5913a(z1Var.mo5912a());
            return;
        }
        ADM adm = new ADM(this.f5756a);
        if (adm.isSupported()) {
            AppboyLogger.m5453i(f5755c, "Registering with ADM server...");
            adm.startRegister();
        }
    }

    /* renamed from: a */
    public static boolean m4324a() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (Exception unused) {
            AppboyLogger.m5453i(f5755c, "com.amazon.device.messaging.ADM not found");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m4326b(Context context) {
        try {
            ADMManifest.checkManifestAuthoredProperly(context);
            return true;
        } catch (Exception e) {
            AppboyLogger.m5453i(f5755c, "Manifest not authored properly to support ADM.");
            AppboyLogger.m5454i(f5755c, "ADM manifest exception: ", (Throwable) e);
            return false;
        }
    }
}
