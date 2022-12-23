package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import bg0.C21051a;
import bg0.C21053b;
import bg0.C21054c;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24225a;
import mf0.C24362h;
import mf0.C24365j;
import p845um.C19958a;
import sf0.C24866j;
import zf0.C25485t;

public final class JvmBuiltIns extends C23867c {

    /* renamed from: h */
    public static final /* synthetic */ C24866j<Object>[] f60392h = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: f */
    public C24225a<C23876a> f60393f;

    /* renamed from: g */
    public final C23789e f60394g;

    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a */
    public static final class C23876a {

        /* renamed from: a */
        public final C25485t f60395a;

        /* renamed from: b */
        public final boolean f60396b;

        public C23876a(C25485t tVar, boolean z) {
            C24362h.m61211f(tVar, "ownerModuleDescriptor");
            this.f60395a = tVar;
            this.f60396b = z;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$b */
    public /* synthetic */ class C23877b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60397a;

        static {
            int[] iArr = new int[Kind.values().length];
            iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[Kind.FALLBACK.ordinal()] = 3;
            f60397a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(LockBasedStorageManager lockBasedStorageManager, Kind kind) {
        super(lockBasedStorageManager);
        C24362h.m61211f(kind, "kind");
        this.f60394g = lockBasedStorageManager.mo59019d(new JvmBuiltIns$customizer$2(this, lockBasedStorageManager));
        int i = C23877b.f60397a[kind.ordinal()];
        if (i == 2) {
            mo59381d(false);
        } else if (i == 3) {
            mo59381d(true);
        }
    }

    /* renamed from: L */
    public final JvmBuiltInsCustomizer mo59406L() {
        return (JvmBuiltInsCustomizer) C19958a.m47435j(this.f60394g, f60392h[0]);
    }

    /* renamed from: M */
    public final void mo59407M(C23909c cVar) {
        this.f60393f = new JvmBuiltIns$initialize$1(cVar);
    }

    /* renamed from: e */
    public final C21051a mo59382e() {
        return mo59406L();
    }

    /* renamed from: m */
    public final Iterable mo59390m() {
        Iterable<C21053b> m = super.mo59390m();
        C23792h hVar = this.f60313d;
        if (hVar != null) {
            C23909c l = mo59389l();
            C24362h.m61210e(l, "builtInsModule");
            return C23825c.m58526w0(m, new C23882a(hVar, l));
        }
        C23867c.m58681a(6);
        throw null;
    }

    /* renamed from: q */
    public final C21054c mo59394q() {
        return mo59406L();
    }
}
