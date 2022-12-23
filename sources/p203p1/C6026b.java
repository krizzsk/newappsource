package p203p1;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import mf0.C24362h;
import p394br.C13660f;

/* renamed from: p1.b */
public class C6026b {

    /* renamed from: a */
    public final Activity f19246a;

    /* renamed from: b */
    public C6031d f19247b = new C13660f(0);

    /* renamed from: p1.b$a */
    public static final class C6027a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final /* synthetic */ C6026b f19248b;

        /* renamed from: c */
        public final /* synthetic */ View f19249c;

        public C6027a(C6026b bVar, View view) {
            this.f19248b = bVar;
            this.f19249c = view;
        }

        public final boolean onPreDraw() {
            if (this.f19248b.f19247b.mo19808a()) {
                return false;
            }
            this.f19249c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f19248b.getClass();
            return true;
        }
    }

    public C6026b(Activity activity) {
        C24362h.m61211f(activity, "activity");
        this.f19246a = activity;
    }

    /* renamed from: a */
    public void mo22022a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.f19246a.getTheme();
        theme.resolveAttribute(C6025a.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(C6025a.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(C6025a.splashScreenIconSize, typedValue, true);
        mo22024c(theme, typedValue);
    }

    /* renamed from: b */
    public void mo22023b(C6031d dVar) {
        this.f19247b = dVar;
        View findViewById = this.f19246a.findViewById(16908290);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new C6027a(this, findViewById));
    }

    /* renamed from: c */
    public final void mo22024c(Resources.Theme theme, TypedValue typedValue) {
        int i;
        if (theme.resolveAttribute(C6025a.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            this.f19246a.setTheme(i);
        }
    }
}
