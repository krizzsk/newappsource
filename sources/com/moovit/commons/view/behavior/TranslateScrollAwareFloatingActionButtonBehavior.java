package com.moovit.commons.view.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p068e2.C4525b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6386q0;

public class TranslateScrollAwareFloatingActionButtonBehavior extends ScrollAwareFloatingActionButtonBehavior {

    /* renamed from: e */
    public static final C4525b f41180e = new C4525b();

    /* renamed from: d */
    public boolean f41181d = false;

    /* renamed from: com.moovit.commons.view.behavior.TranslateScrollAwareFloatingActionButtonBehavior$a */
    public class C15810a implements C6386q0 {
        public C15810a() {
        }

        /* renamed from: a */
        public final void mo2022a(View view) {
            TranslateScrollAwareFloatingActionButtonBehavior.this.f41181d = false;
        }

        /* renamed from: b */
        public final void mo909b(View view) {
            TranslateScrollAwareFloatingActionButtonBehavior.this.f41181d = false;
            view.setVisibility(8);
        }

        /* renamed from: d */
        public final void mo957d() {
        }
    }

    public TranslateScrollAwareFloatingActionButtonBehavior() {
    }

    /* renamed from: e */
    public final void mo47191e(FloatingActionButton floatingActionButton) {
        floatingActionButton.setVisibility(0);
        C6382p0 a = C6333d0.m15013a(floatingActionButton);
        a.mo22499i(BitmapDescriptorFactory.HUE_RED);
        View view = a.f20040a.get();
        if (view != null) {
            C6382p0.C6383a.m15229b(view.animate());
        }
        a.mo22496f(f41180e);
        a.mo22495e(200);
        a.mo22497g((C6386q0) null);
        a.mo22498h();
    }

    /* renamed from: f */
    public final void mo47192f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
        if (!this.f41181d) {
            this.f41181d = true;
            C6382p0 a = C6333d0.m15013a(floatingActionButton);
            a.mo22499i((float) (coordinatorLayout.getHeight() - floatingActionButton.getTop()));
            View view = a.f20040a.get();
            if (view != null) {
                C6382p0.C6383a.m15229b(view.animate());
            }
            a.mo22496f(f41180e);
            a.mo22495e(200);
            a.mo22497g(new C15810a());
            a.mo22498h();
        }
    }

    public TranslateScrollAwareFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
    }
}
