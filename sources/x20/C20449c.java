package x20;

import android.app.Application;
import c00.C13720d;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p732pq.C18950k;
import p977zz.C20930c;
import y20.C20691a;
import y20.C20693b;
import y20.C20695c;
import y20.C20697d;
import y20.C20699e;
import z20.C20806a;

/* renamed from: x20.c */
public final class C20449c {

    /* renamed from: c */
    public static volatile C20449c f51792c;

    /* renamed from: a */
    public final Application f51793a;

    /* renamed from: b */
    public final List<C20699e> f51794b;

    public C20449c(Application application) {
        C21100e.m49373x(application, "application");
        this.f51793a = application;
        this.f51794b = Collections.unmodifiableList(C13720d.m34273c(Arrays.asList(new C20699e.C20700a[]{new C20691a.C20692a(), new C20693b.C20694a(), new C20695c.C20696a(), new C20697d.C20698a()}), new C18950k(application, 3), new C20448b(application)));
    }

    /* renamed from: a */
    public static synchronized void m48067a(Application application) {
        synchronized (C20449c.class) {
            if (f51792c == null) {
                f51792c = new C20449c(application);
            }
        }
    }

    /* renamed from: b */
    public final void mo52639b(C20806a aVar) {
        int i = aVar.f52521d;
        if (i < 0 || ((long) i) > C20930c.m49023e(this.f51793a)) {
            for (C20699e next : this.f51794b) {
                next.getClass();
                if (aVar.f52518a.equals(ProductAction.ACTION_PURCHASE)) {
                    next.mo52844b(aVar);
                } else {
                    next.mo52843a(aVar);
                }
            }
        }
    }
}
