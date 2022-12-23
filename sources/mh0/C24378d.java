package mh0;

import java.util.Collection;
import lh0.C24307v;
import mf0.C24362h;
import oh0.C24617f;
import p057d3.C4339c;
import ug0.C25065b;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25485t;

/* renamed from: mh0.d */
public abstract class C24378d extends C4339c {

    /* renamed from: mh0.d$a */
    public static final class C24379a extends C24378d {

        /* renamed from: b */
        public static final C24379a f61715b = new C24379a();

        /* renamed from: A */
        public final C24307v mo60522A(C24617f fVar) {
            C24362h.m61211f(fVar, "type");
            return (C24307v) fVar;
        }

        /* renamed from: u */
        public final C24307v mo19845u(C24617f fVar) {
            C24362h.m61211f(fVar, "type");
            return (C24307v) fVar;
        }

        /* renamed from: v */
        public final void mo60523v(C25065b bVar) {
        }

        /* renamed from: w */
        public final void mo60524w(C25485t tVar) {
        }

        /* renamed from: x */
        public final void mo60525x(C25437e eVar) {
            C24362h.m61211f(eVar, "descriptor");
        }

        /* renamed from: z */
        public final Collection<C24307v> mo60526z(C25432c cVar) {
            C24362h.m61211f(cVar, "classDescriptor");
            Collection<C24307v> n = cVar.mo53481j().mo53459n();
            C24362h.m61210e(n, "classDescriptor.typeConstructor.supertypes");
            return n;
        }
    }

    /* renamed from: A */
    public abstract C24307v mo60522A(C24617f fVar);

    /* renamed from: v */
    public abstract void mo60523v(C25065b bVar);

    /* renamed from: w */
    public abstract void mo60524w(C25485t tVar);

    /* renamed from: x */
    public abstract void mo60525x(C25437e eVar);

    /* renamed from: z */
    public abstract Collection<C24307v> mo60526z(C25432c cVar);
}
