package p203p1;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.window.SplashScreenView;
import mf0.C24362h;

/* renamed from: p1.c */
public final class C6028c extends C6026b {

    /* renamed from: c */
    public C6030b f19250c;

    /* renamed from: d */
    public final C6029a f19251d;

    /* renamed from: p1.c$a */
    public static final class C6029a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public final /* synthetic */ C6028c f19252b;

        /* renamed from: c */
        public final /* synthetic */ Activity f19253c;

        public C6029a(C6028c cVar, Activity activity) {
            this.f19252b = cVar;
            this.f19253c = activity;
        }

        public final void onChildViewAdded(View view, View view2) {
            if (view2 instanceof SplashScreenView) {
                this.f19252b.getClass();
                C6028c.m14518d((SplashScreenView) view2);
                ((ViewGroup) this.f19253c.getWindow().getDecorView()).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
        }
    }

    /* renamed from: p1.c$b */
    public static final class C6030b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final /* synthetic */ C6028c f19254b;

        /* renamed from: c */
        public final /* synthetic */ View f19255c;

        public C6030b(C6028c cVar, View view) {
            this.f19254b = cVar;
            this.f19255c = view;
        }

        public final boolean onPreDraw() {
            if (this.f19254b.f19247b.mo19808a()) {
                return false;
            }
            this.f19255c.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6028c(Activity activity) {
        super(activity);
        C24362h.m61211f(activity, "activity");
        this.f19251d = new C6029a(this, activity);
    }

    /* renamed from: d */
    public static void m14518d(SplashScreenView splashScreenView) {
        C24362h.m61211f(splashScreenView, "child");
        WindowInsets build = new WindowInsets$Builder().build();
        C24362h.m61210e(build, "Builder().build()");
        Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        if (build == splashScreenView.getRootView().computeSystemWindowInsets(build, rect)) {
            rect.isEmpty();
        }
    }

    /* renamed from: a */
    public final void mo22022a() {
        Resources.Theme theme = this.f19246a.getTheme();
        C24362h.m61210e(theme, "activity.theme");
        mo22024c(theme, new TypedValue());
        ((ViewGroup) this.f19246a.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f19251d);
    }

    /* renamed from: b */
    public final void mo22023b(C6031d dVar) {
        this.f19247b = dVar;
        View findViewById = this.f19246a.findViewById(16908290);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.f19250c != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f19250c);
        }
        C6030b bVar = new C6030b(this, findViewById);
        this.f19250c = bVar;
        viewTreeObserver.addOnPreDrawListener(bVar);
    }
}
