package zf0;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.collections.builders.MapBuilder;

/* renamed from: zf0.m0 */
public final class C25468m0 {

    /* renamed from: a */
    public static final MapBuilder f63756a;

    /* renamed from: zf0.m0$a */
    public static final class C25469a extends C25479n0 {

        /* renamed from: c */
        public static final C25469a f63757c = new C25469a();

        public C25469a() {
            super("inherited", false);
        }
    }

    /* renamed from: zf0.m0$b */
    public static final class C25470b extends C25479n0 {

        /* renamed from: c */
        public static final C25470b f63758c = new C25470b();

        public C25470b() {
            super("internal", false);
        }
    }

    /* renamed from: zf0.m0$c */
    public static final class C25471c extends C25479n0 {

        /* renamed from: c */
        public static final C25471c f63759c = new C25471c();

        public C25471c() {
            super("invisible_fake", false);
        }
    }

    /* renamed from: zf0.m0$d */
    public static final class C25472d extends C25479n0 {

        /* renamed from: c */
        public static final C25472d f63760c = new C25472d();

        public C25472d() {
            super(ImagesContract.LOCAL, false);
        }
    }

    /* renamed from: zf0.m0$e */
    public static final class C25473e extends C25479n0 {

        /* renamed from: c */
        public static final C25473e f63761c = new C25473e();

        public C25473e() {
            super("private", false);
        }
    }

    /* renamed from: zf0.m0$f */
    public static final class C25474f extends C25479n0 {

        /* renamed from: c */
        public static final C25474f f63762c = new C25474f();

        public C25474f() {
            super("private_to_this", false);
        }

        /* renamed from: b */
        public final String mo58407b() {
            return "private/*private to this*/";
        }
    }

    /* renamed from: zf0.m0$g */
    public static final class C25475g extends C25479n0 {

        /* renamed from: c */
        public static final C25475g f63763c = new C25475g();

        public C25475g() {
            super("protected", true);
        }
    }

    /* renamed from: zf0.m0$h */
    public static final class C25476h extends C25479n0 {

        /* renamed from: c */
        public static final C25476h f63764c = new C25476h();

        public C25476h() {
            super("public", true);
        }
    }

    /* renamed from: zf0.m0$i */
    public static final class C25477i extends C25479n0 {

        /* renamed from: c */
        public static final C25477i f63765c = new C25477i();

        public C25477i() {
            super("unknown", false);
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(C25474f.f63762c, 0);
        mapBuilder.put(C25473e.f63761c, 0);
        mapBuilder.put(C25470b.f63758c, 1);
        mapBuilder.put(C25475g.f63763c, 1);
        mapBuilder.put(C25476h.f63764c, 2);
        mapBuilder.mo59208h();
        f63756a = mapBuilder;
    }
}
