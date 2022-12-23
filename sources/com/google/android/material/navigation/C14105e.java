package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.C14054g;
import com.google.android.material.internal.NavigationMenuView;

/* renamed from: com.google.android.material.navigation.e */
public final class C14105e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ NavigationView f35218b;

    public C14105e(NavigationView navigationView) {
        this.f35218b = navigationView;
    }

    public final void onGlobalLayout() {
        boolean z;
        boolean z2;
        Activity activity;
        boolean z3;
        boolean z4;
        int i;
        NavigationView navigationView = this.f35218b;
        navigationView.getLocationOnScreen(navigationView.f35138j);
        NavigationView navigationView2 = this.f35218b;
        boolean z5 = true;
        if (navigationView2.f35138j[1] == 0) {
            z = true;
        } else {
            z = false;
        }
        C14054g gVar = navigationView2.f35136h;
        if (gVar.f35079w != z) {
            gVar.f35079w = z;
            if (gVar.f35059c.getChildCount() != 0 || !gVar.f35079w) {
                i = 0;
            } else {
                i = gVar.f35081y;
            }
            NavigationMenuView navigationMenuView = gVar.f35058b;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationView navigationView3 = this.f35218b;
        if (!z || !navigationView3.f35141m) {
            z2 = false;
        } else {
            z2 = true;
        }
        navigationView3.setDrawTopInsetForeground(z2);
        Context context = this.f35218b.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            if (activity.findViewById(16908290).getHeight() == this.f35218b.getHeight()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            NavigationView navigationView4 = this.f35218b;
            if (!z3 || !z4 || !navigationView4.f35142n) {
                z5 = false;
            }
            navigationView4.setDrawBottomInsetForeground(z5);
        }
    }
}
