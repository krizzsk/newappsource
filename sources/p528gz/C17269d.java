package p528gz;

import android.app.Activity;
import android.app.Application;
import ce0.C21100e;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.braze.Braze;
import p824tp.C19736n;

/* renamed from: gz.d */
public final class C17269d {

    /* renamed from: e */
    public static volatile C17269d f44636e;

    /* renamed from: a */
    public final Application f44637a;

    /* renamed from: b */
    public final boolean f44638b;

    /* renamed from: c */
    public final C17268c f44639c;

    /* renamed from: d */
    public final C17272g f44640d;

    public C17269d(Application application) {
        C21100e.m49373x(application, "application");
        this.f44637a = application;
        boolean z = application.getResources().getBoolean(C19736n.is_braze_supported);
        this.f44638b = z;
        C17268c cVar = new C17268c();
        this.f44639c = cVar;
        C17267b bVar = new C17267b(application);
        this.f44640d = new C17272g(application);
        if (z) {
            Braze.getInstance(application).setImageLoader(new C17266a());
            AppboyInAppMessageManager.getInstance().setCustomInAppMessageManagerListener(bVar);
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }

    /* renamed from: a */
    public static C17269d m43283a() {
        C17269d dVar = f44636e;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("You must call initialize first");
    }

    /* renamed from: b */
    public final void mo49812b(Class<? extends Activity> cls) {
        this.f44639c.f44635b.add(cls);
    }
}
