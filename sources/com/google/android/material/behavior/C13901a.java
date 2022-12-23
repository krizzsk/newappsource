package com.google.android.material.behavior;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.C14129f;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6541k;

/* renamed from: com.google.android.material.behavior.a */
public final class C13901a implements C6541k {

    /* renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f34296a;

    public C13901a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f34296a = swipeDismissBehavior;
    }

    /* renamed from: a */
    public final boolean mo3589a(View view) {
        boolean z;
        boolean z2 = false;
        if (!this.f34296a.mo41000a(view)) {
            return false;
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(view) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = this.f34296a.f34285d;
        if ((i == 0 && z) || (i == 1 && !z)) {
            z2 = true;
        }
        int width = view.getWidth();
        if (z2) {
            width = -width;
        }
        C6333d0.m15022j(width, view);
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        SwipeDismissBehavior.C13899b bVar = this.f34296a.f34283b;
        if (bVar != null) {
            ((C14129f) bVar).mo42272a(view);
        }
        return true;
    }
}
