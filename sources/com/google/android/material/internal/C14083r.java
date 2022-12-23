package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6391t;
import p242s1.C6396v0;

/* renamed from: com.google.android.material.internal.r */
public final class C14083r {

    /* renamed from: com.google.android.material.internal.r$a */
    public class C14084a implements C6391t {

        /* renamed from: b */
        public final /* synthetic */ C14085b f35114b;

        /* renamed from: c */
        public final /* synthetic */ C14086c f35115c;

        public C14084a(C14085b bVar, C14086c cVar) {
            this.f35114b = bVar;
            this.f35115c = cVar;
        }

        public final C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
            return this.f35114b.mo41034a(view, v0Var, new C14086c(this.f35115c));
        }
    }

    /* renamed from: com.google.android.material.internal.r$b */
    public interface C14085b {
        /* renamed from: a */
        C6396v0 mo41034a(View view, C6396v0 v0Var, C14086c cVar);
    }

    /* renamed from: a */
    public static void m35065a(View view, C14085b bVar) {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6342i.m15104u(view, new C14084a(bVar, new C14086c(C6333d0.C6338e.m15065f(view), view.getPaddingTop(), C6333d0.C6338e.m15064e(view), view.getPaddingBottom())));
        if (C6333d0.C6340g.m15075b(view)) {
            C6333d0.C6341h.m15083c(view);
        } else {
            view.addOnAttachStateChangeListener(new C14087s());
        }
    }

    /* renamed from: b */
    public static float m35066b(int i, Context context) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static ViewGroup m35067c(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* renamed from: d */
    public static boolean m35068d(View view) {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m35069e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: com.google.android.material.internal.r$c */
    public static class C14086c {

        /* renamed from: a */
        public int f35116a;

        /* renamed from: b */
        public int f35117b;

        /* renamed from: c */
        public int f35118c;

        /* renamed from: d */
        public int f35119d;

        public C14086c(int i, int i2, int i3, int i4) {
            this.f35116a = i;
            this.f35117b = i2;
            this.f35118c = i3;
            this.f35119d = i4;
        }

        public C14086c(C14086c cVar) {
            this.f35116a = cVar.f35116a;
            this.f35117b = cVar.f35117b;
            this.f35118c = cVar.f35118c;
            this.f35119d = cVar.f35119d;
        }
    }
}
