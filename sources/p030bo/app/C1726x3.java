package p030bo.app;

import com.appboy.support.AppboyLogger;

/* renamed from: bo.app.x3 */
public class C1726x3 implements C1537b4 {

    /* renamed from: c */
    public static final String f6076c = AppboyLogger.getBrazeLogTag(C1726x3.class);

    /* renamed from: a */
    public final C1537b4 f6077a;

    /* renamed from: b */
    public final C1600i0 f6078b;

    public C1726x3(C1537b4 b4Var, C1600i0 i0Var) {
        this.f6077a = b4Var;
        this.f6078b = i0Var;
    }

    /* renamed from: a */
    public void mo5923a(C1619k2 k2Var) {
        try {
            this.f6077a.mo5923a(k2Var);
        } catch (Exception e) {
            AppboyLogger.m5452e(f6076c, "Failed to upsert active session in the storage.", e);
            mo6455a(this.f6078b, e);
        }
    }

    /* renamed from: b */
    public void mo5924b(C1619k2 k2Var) {
        try {
            this.f6077a.mo5924b(k2Var);
        } catch (Exception e) {
            AppboyLogger.m5452e(f6076c, "Failed to delete the sealed session from the storage.", e);
            mo6455a(this.f6078b, e);
        }
    }

    /* renamed from: a */
    public C1619k2 mo5922a() {
        try {
            return this.f6077a.mo5922a();
        } catch (Exception e) {
            AppboyLogger.m5452e(f6076c, "Failed to get the active session from the storage.", e);
            mo6455a(this.f6078b, e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo6455a(C1600i0 i0Var, Throwable th) {
        try {
            i0Var.mo6134a(new C1555d1("A storage exception has occurred. Please view the stack trace for more details.", th), C1555d1.class);
        } catch (Exception e) {
            AppboyLogger.m5452e(f6076c, "Failed to log throwable.", e);
        }
    }
}
