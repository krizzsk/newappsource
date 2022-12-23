package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import je0.C23715f;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import mf0.C24362h;
import mh0.C24373a;
import mh0.C24378d;
import oh0.C24617f;
import oh0.C24618g;
import oh0.C24623l;
import p057d3.C4339c;
import rh0.C24823d;

public final class TypeCheckerState {

    /* renamed from: a */
    public final boolean f61342a;

    /* renamed from: b */
    public final boolean f61343b;

    /* renamed from: c */
    public final C24623l f61344c;

    /* renamed from: d */
    public final C23715f f61345d;

    /* renamed from: e */
    public final C4339c f61346e;

    /* renamed from: f */
    public int f61347f;

    /* renamed from: g */
    public ArrayDeque<C24618g> f61348g;

    /* renamed from: h */
    public C24823d f61349h;

    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a */
    public static abstract class C24156a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$a */
        public static abstract class C24157a extends C24156a {
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$b */
        public static final class C24158b extends C24156a {

            /* renamed from: a */
            public static final C24158b f61350a = new C24158b();

            /* renamed from: a */
            public final C24618g mo60247a(TypeCheckerState typeCheckerState, C24617f fVar) {
                C24362h.m61211f(typeCheckerState, "state");
                C24362h.m61211f(fVar, "type");
                return typeCheckerState.f61344c.mo42738h0(fVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$c */
        public static final class C24159c extends C24156a {

            /* renamed from: a */
            public static final C24159c f61351a = new C24159c();

            /* renamed from: a */
            public final C24618g mo60247a(TypeCheckerState typeCheckerState, C24617f fVar) {
                C24362h.m61211f(typeCheckerState, "state");
                C24362h.m61211f(fVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$d */
        public static final class C24160d extends C24156a {

            /* renamed from: a */
            public static final C24160d f61352a = new C24160d();

            /* renamed from: a */
            public final C24618g mo60247a(TypeCheckerState typeCheckerState, C24617f fVar) {
                C24362h.m61211f(typeCheckerState, "state");
                C24362h.m61211f(fVar, "type");
                return typeCheckerState.f61344c.mo42711O(fVar);
            }
        }

        /* renamed from: a */
        public abstract C24618g mo60247a(TypeCheckerState typeCheckerState, C24617f fVar);
    }

    public TypeCheckerState(boolean z, boolean z2, C24373a aVar, KotlinTypePreparator kotlinTypePreparator, C24378d dVar) {
        this.f61342a = z;
        this.f61343b = z2;
        this.f61344c = aVar;
        this.f61345d = kotlinTypePreparator;
        this.f61346e = dVar;
    }

    /* renamed from: a */
    public final void mo60244a() {
        ArrayDeque<C24618g> arrayDeque = this.f61348g;
        C24362h.m61208c(arrayDeque);
        arrayDeque.clear();
        C24823d dVar = this.f61349h;
        C24362h.m61208c(dVar);
        dVar.clear();
    }

    /* renamed from: b */
    public final void mo60245b() {
        if (this.f61348g == null) {
            this.f61348g = new ArrayDeque<>(4);
        }
        if (this.f61349h == null) {
            this.f61349h = new C24823d();
        }
    }

    /* renamed from: c */
    public final C24617f mo60246c(C24617f fVar) {
        C24362h.m61211f(fVar, "type");
        return this.f61345d.mo58949d(fVar);
    }
}
