package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.fyber.inneractive.sdk.util.C3702j;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.fyber.inneractive.sdk.util.f0 */
public class C3685f0 {

    /* renamed from: a */
    public final Map<Context, Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener>> f12856a = new WeakHashMap();

    /* renamed from: b */
    public final WeakHashMap<Context, WeakHashMap<View, C3690e>> f12857b = new WeakHashMap<>();

    /* renamed from: c */
    public final C3702j<Rect> f12858c = new C3702j<>(16, new C3686a(this));

    /* renamed from: d */
    public final C3702j<HashSet<View>> f12859d = new C3702j<>(16, new C3687b(this));

    /* renamed from: com.fyber.inneractive.sdk.util.f0$a */
    public class C3686a implements C3702j.C3703a<Rect> {
        public C3686a(C3685f0 f0Var) {
        }

        /* renamed from: a */
        public Object mo15265a() {
            return new Rect();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$b */
    public class C3687b implements C3702j.C3703a<HashSet<View>> {
        public C3687b(C3685f0 f0Var) {
        }

        /* renamed from: a */
        public Object mo15265a() {
            return new HashSet();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$c */
    public class C3688c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ Context f12860a;

        public C3688c(Context context) {
            this.f12860a = context;
        }

        public boolean onPreDraw() {
            WeakHashMap weakHashMap;
            C3685f0 f0Var = C3685f0.this;
            Context context = this.f12860a;
            f0Var.getClass();
            if (context == null || (weakHashMap = f0Var.f12857b.get(context)) == null) {
                return true;
            }
            HashSet a = f0Var.f12859d.mo15362a();
            a.addAll(weakHashMap.keySet());
            Iterator it = a.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                C3690e eVar = (C3690e) weakHashMap.get(view);
                if (eVar != null) {
                    float f = BitmapDescriptorFactory.HUE_RED;
                    Rect a2 = f0Var.f12858c.mo15362a();
                    if (view != null && view.getParent() != null && view.isShown() && view.getGlobalVisibleRect(a2)) {
                        f = ((float) (a2.width() * a2.height())) / ((float) (view.getWidth() * view.getHeight()));
                    }
                    eVar.mo15280a(view, f, a2);
                    f0Var.f12858c.f12882a.offer(a2);
                }
            }
            a.clear();
            f0Var.f12859d.f12882a.offer(a);
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$d */
    public static class C3689d {

        /* renamed from: a */
        public static final C3685f0 f12862a = new C3685f0();
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$e */
    public interface C3690e {
        /* renamed from: a */
        void mo15280a(View view, float f, Rect rect);
    }

    /* renamed from: a */
    public static C3685f0 m9927a() {
        return C3689d.f12862a;
    }

    /* renamed from: b */
    public final String mo15352b() {
        return "IAVisibilityTracker: ";
    }

    /* renamed from: c */
    public final void mo15353c() {
        for (Context next : this.f12857b.keySet()) {
            IAlog.m9902a("%stracking context: %s", mo15352b(), next);
            WeakHashMap weakHashMap = this.f12857b.get(next);
            if (weakHashMap != null) {
                for (View view : weakHashMap.keySet()) {
                    IAlog.m9902a("%stracking view: %s", mo15352b(), view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo15349a(Context context, View view, C3690e eVar) {
        View view2;
        ViewTreeObserver viewTreeObserver;
        IAlog.m9902a("%strackView called with context: %s view: %s", mo15352b(), context, view);
        if (context != null) {
            WeakHashMap weakHashMap = this.f12857b.get(context);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                this.f12857b.put(context, weakHashMap);
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.getWindow() != null) {
                        view2 = activity.getWindow().getDecorView();
                        viewTreeObserver = view2.getViewTreeObserver();
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            C3688c cVar = new C3688c(context);
                            viewTreeObserver.addOnPreDrawListener(cVar);
                            this.f12856a.put(context, new Pair(viewTreeObserver, cVar));
                        }
                    }
                }
                view2 = view.getRootView();
                viewTreeObserver = view2.getViewTreeObserver();
                C3688c cVar2 = new C3688c(context);
                viewTreeObserver.addOnPreDrawListener(cVar2);
                this.f12856a.put(context, new Pair(viewTreeObserver, cVar2));
            }
            weakHashMap.put(view, eVar);
            mo15353c();
            return;
        }
        throw new IllegalStateException("View must be attached to an Activity context");
    }

    /* renamed from: a */
    public void mo15351a(View view) {
        IAlog.m9902a("%sunTrackView called with view", mo15352b());
        if (view == null) {
            IAlog.m9902a("%sunTrackView called with a null view!", mo15352b());
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.m9902a("%sview.getContext() returned null!", mo15352b());
            return;
        }
        Map map = this.f12857b.get(context);
        if (map != null) {
            mo15350a(context, (Map<View, C3690e>) map, view);
        } else {
            Iterator it = new HashSet(this.f12857b.keySet()).iterator();
            while (it.hasNext()) {
                Context context2 = (Context) it.next();
                WeakHashMap weakHashMap = this.f12857b.get(context2);
                if (weakHashMap != null) {
                    mo15350a(context2, (Map<View, C3690e>) weakHashMap, view);
                }
            }
        }
        mo15353c();
    }

    /* renamed from: a */
    public final void mo15350a(Context context, Map<View, C3690e> map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.f12814a <= 2) {
                IAlog.m9905d("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.f12857b.remove(context);
                Pair pair = this.f12856a.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.f12856a.remove(context);
                }
            }
        }
    }
}
