package p694oc;

import android.view.View;
import com.google.android.material.internal.C14083r;
import com.google.android.material.navigationrail.NavigationRailView;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6396v0;

/* renamed from: oc.c */
public final class C18724c implements C14083r.C14085b {

    /* renamed from: a */
    public final /* synthetic */ NavigationRailView f47636a;

    public C18724c(NavigationRailView navigationRailView) {
        this.f47636a = navigationRailView;
    }

    /* renamed from: a */
    public final C6396v0 mo41034a(View view, C6396v0 v0Var, C14083r.C14086c cVar) {
        boolean z;
        boolean z2;
        NavigationRailView navigationRailView = this.f47636a;
        Boolean bool = navigationRailView.f35221i;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            z = C6333d0.C6337d.m15042b(navigationRailView);
        }
        if (z) {
            cVar.f35117b += v0Var.f20044a.mo22517f(7).f17647b;
        }
        NavigationRailView navigationRailView2 = this.f47636a;
        Boolean bool2 = navigationRailView2.f35222j;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            z2 = C6333d0.C6337d.m15042b(navigationRailView2);
        }
        if (z2) {
            cVar.f35119d += v0Var.f20044a.mo22517f(7).f17649d;
        }
        WeakHashMap<View, C6382p0> weakHashMap3 = C6333d0.f19990a;
        boolean z3 = true;
        if (C6333d0.C6338e.m15063d(view) != 1) {
            z3 = false;
        }
        int c = v0Var.mo22504c();
        int d = v0Var.mo22505d();
        int i = cVar.f35116a;
        if (z3) {
            c = d;
        }
        int i2 = i + c;
        cVar.f35116a = i2;
        C6333d0.C6338e.m15070k(view, i2, cVar.f35117b, cVar.f35118c, cVar.f35119d);
        return v0Var;
    }
}
