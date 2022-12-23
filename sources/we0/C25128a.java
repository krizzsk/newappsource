package we0;

import java.util.concurrent.Callable;
import je0.C23712e;
import p565io.reactivex.internal.schedulers.C23701a;
import p565io.reactivex.internal.schedulers.C23705b;
import te0.C24948a;
import te0.C24952b;
import te0.C24956e;
import ve0.C25088a;

/* renamed from: we0.a */
public final class C25128a {

    /* renamed from: a */
    public static final C23712e f63408a = C25088a.m62856a(new C25131c());

    /* renamed from: we0.a$a */
    public static final class C25129a {

        /* renamed from: a */
        public static final C23701a f63409a = new C23701a();
    }

    /* renamed from: we0.a$b */
    public static final class C25130b implements Callable<C23712e> {
        public final Object call() throws Exception {
            return C25129a.f63409a;
        }
    }

    /* renamed from: we0.a$c */
    public static final class C25131c implements Callable<C23712e> {
        public final Object call() throws Exception {
            return C25132d.f63410a;
        }
    }

    /* renamed from: we0.a$d */
    public static final class C25132d {

        /* renamed from: a */
        public static final C24948a f63410a = new C24948a();
    }

    /* renamed from: we0.a$e */
    public static final class C25133e {

        /* renamed from: a */
        public static final C24952b f63411a = new C24952b();
    }

    /* renamed from: we0.a$f */
    public static final class C25134f implements Callable<C23712e> {
        public final Object call() throws Exception {
            return C25133e.f63411a;
        }
    }

    /* renamed from: we0.a$g */
    public static final class C25135g {

        /* renamed from: a */
        public static final C23705b f63412a = new C23705b();
    }

    /* renamed from: we0.a$h */
    public static final class C25136h implements Callable<C23712e> {
        public final Object call() throws Exception {
            return C25135g.f63412a;
        }
    }

    static {
        C25088a.m62856a(new C25136h());
        C25088a.m62856a(new C25130b());
        int i = C24956e.f63081a;
        C25088a.m62856a(new C25134f());
    }
}
