package p433dc;

import android.view.View;
import com.google.android.material.internal.C14083r;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6396v0;

/* renamed from: dc.c */
public final class C16540c implements C14083r.C14085b {
    /* renamed from: a */
    public final C6396v0 mo41034a(View view, C6396v0 v0Var, C14083r.C14086c cVar) {
        int i;
        cVar.f35119d = v0Var.mo22503b() + cVar.f35119d;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        boolean z = true;
        if (C6333d0.C6338e.m15063d(view) != 1) {
            z = false;
        }
        int c = v0Var.mo22504c();
        int d = v0Var.mo22505d();
        int i2 = cVar.f35116a;
        if (z) {
            i = d;
        } else {
            i = c;
        }
        int i3 = i2 + i;
        cVar.f35116a = i3;
        int i4 = cVar.f35118c;
        if (!z) {
            c = d;
        }
        int i5 = i4 + c;
        cVar.f35118c = i5;
        C6333d0.C6338e.m15070k(view, i3, cVar.f35117b, i5, cVar.f35119d);
        return v0Var;
    }
}
