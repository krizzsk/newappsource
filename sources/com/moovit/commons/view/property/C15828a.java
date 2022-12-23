package com.moovit.commons.view.property;

import android.view.View;
import android.view.ViewTreeObserver;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.moovit.commons.view.property.a */
public interface C15828a {

    /* renamed from: com.moovit.commons.view.property.a$a */
    public static class C15829a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final C15828a f41312b;

        /* renamed from: c */
        public final View f41313c;

        /* renamed from: d */
        public float f41314d = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: e */
        public float f41315e = BitmapDescriptorFactory.HUE_RED;

        public C15829a(C15828a aVar, View view) {
            C21100e.m49373x(aVar, "fractionalView");
            this.f41312b = aVar;
            C21100e.m49373x(view, Promotion.ACTION_VIEW);
            this.f41313c = view;
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }

        public final boolean onPreDraw() {
            this.f41313c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f41312b.setFractionX(this.f41314d);
            this.f41312b.setFractionY(this.f41315e);
            return false;
        }
    }

    void setFractionX(float f);

    void setFractionY(float f);
}
