package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import mf0.C24362h;
import p256t2.C6552c;
import p256t2.C6556e;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/n;", "a", "savedstate_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class Recreator implements C1025n {

    /* renamed from: b */
    public final C6556e f4750b;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C1262a implements C6552c.C6554b {

        /* renamed from: a */
        public final LinkedHashSet f4751a = new LinkedHashSet();

        public C1262a(C6552c cVar) {
            C24362h.m61211f(cVar, "registry");
            cVar.mo22665c("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public final Bundle mo747a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f4751a));
            return bundle;
        }
    }

    public Recreator(C6556e eVar) {
        C24362h.m61211f(eVar, "owner");
        this.f4750b = eVar;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            pVar.getLifecycle().mo4226c(this);
            Bundle a = this.f4750b.getSavedStateRegistry().mo22663a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C6552c.C6553a.class);
                            C24362h.m61210e(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                    C24362h.m61210e(newInstance, "{\n                constr…wInstance()\n            }");
                                    ((C6552c.C6553a) newInstance).mo4305a(this.f4750b);
                                } catch (Exception e) {
                                    throw new RuntimeException(C25541a.m63881k("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalStateException(C13437d.m33705j(asSubclass, C13555b.m33972k("Class "), " must have default constructor in order to be automatically recreated"), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(C13437d.m33706k("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
