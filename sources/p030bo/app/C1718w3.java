package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bo.app.w3 */
public class C1718w3 implements C1526a4 {

    /* renamed from: d */
    public static final String f6061d = AppboyLogger.getBrazeLogTag(C1718w3.class);

    /* renamed from: a */
    public final C1526a4 f6062a;

    /* renamed from: b */
    public final C1600i0 f6063b;

    /* renamed from: c */
    public boolean f6064c = false;

    public C1718w3(C1526a4 a4Var, C1600i0 i0Var) {
        this.f6062a = a4Var;
        this.f6063b = i0Var;
    }

    /* renamed from: a */
    public void mo5895a(C1594h2 h2Var) {
        if (this.f6064c) {
            String str = f6061d;
            AppboyLogger.m5459w(str, "Storage provider is closed. Not adding event: " + h2Var);
            return;
        }
        try {
            this.f6062a.mo5895a(h2Var);
        } catch (Exception e) {
            String str2 = f6061d;
            AppboyLogger.m5452e(str2, "Failed to insert event into storage. " + h2Var, e);
            m4875a(this.f6063b, e);
        }
    }

    public void close() {
        AppboyLogger.m5459w(f6061d, "Setting this provider and internal storage provider to closed.");
        this.f6064c = true;
        this.f6062a.close();
    }

    /* renamed from: a */
    public void mo5896a(List<C1594h2> list) {
        if (this.f6064c) {
            String str = f6061d;
            AppboyLogger.m5459w(str, "Storage provider is closed. Not deleting event: " + list);
            return;
        }
        try {
            this.f6062a.mo5896a(list);
        } catch (Exception e) {
            String str2 = f6061d;
            AppboyLogger.m5452e(str2, "Failed to delete events from storage. " + list, e);
            m4875a(this.f6063b, e);
        }
    }

    /* renamed from: a */
    public Collection<C1594h2> mo5894a() {
        if (this.f6064c) {
            AppboyLogger.m5459w(f6061d, "Storage provider is closed. Not getting all events.");
            return Collections.emptyList();
        }
        try {
            return this.f6062a.mo5894a();
        } catch (Exception e) {
            AppboyLogger.m5452e(f6061d, "Failed to get all events from storage.", e);
            m4875a(this.f6063b, e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public static void m4875a(C1600i0 i0Var, Throwable th) {
        if (i0Var == null) {
            AppboyLogger.m5448d(f6061d, "Not logging storage exception on null IEventPublisher");
            return;
        }
        try {
            i0Var.mo6134a(new C1555d1("A storage exception has occurred. Please view the stack trace for more details.", th), C1555d1.class);
        } catch (Exception e) {
            AppboyLogger.m5452e(f6061d, "Failed to log throwable.", e);
        }
    }
}
