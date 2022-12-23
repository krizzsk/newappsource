package kotlin.reflect.jvm.internal.impl.renderer;

import com.google.android.gms.ads.mediation.MediationConfiguration;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import lf0.C24236l;
import lh0.C24281l0;
import lh0.C24307v;
import mf0.C24362h;
import ug0.C25067d;
import ug0.C25069e;
import zf0.C25452k0;

public abstract class DescriptorRenderer {

    /* renamed from: a */
    public static final DescriptorRendererImpl f61106a = C24100a.m60132a(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1.f61115f);

    /* renamed from: b */
    public static final DescriptorRendererImpl f61107b = C24100a.m60132a(DescriptorRenderer$Companion$DEBUG_TEXT$1.f61114f);

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$a */
    public static final class C24100a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$a$a */
        public /* synthetic */ class C24101a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f61108a;

            static {
                int[] iArr = new int[ClassKind.values().length];
                iArr[ClassKind.CLASS.ordinal()] = 1;
                iArr[ClassKind.INTERFACE.ordinal()] = 2;
                iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                iArr[ClassKind.OBJECT.ordinal()] = 4;
                iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                f61108a = iArr;
            }
        }

        /* renamed from: a */
        public static DescriptorRendererImpl m60132a(C24236l lVar) {
            C24362h.m61211f(lVar, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            lVar.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.f61153a = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b */
    public interface C24102b {

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b$a */
        public static final class C24103a implements C24102b {

            /* renamed from: a */
            public static final C24103a f61109a = new C24103a();

            /* renamed from: a */
            public final void mo60093a(StringBuilder sb) {
                C24362h.m61211f(sb, "builder");
                sb.append("(");
            }

            /* renamed from: b */
            public final void mo60094b(C25452k0 k0Var, int i, int i2, StringBuilder sb) {
                C24362h.m61211f(sb, "builder");
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }

            /* renamed from: c */
            public final void mo60095c(C25452k0 k0Var, StringBuilder sb) {
                C24362h.m61211f(k0Var, MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                C24362h.m61211f(sb, "builder");
            }

            /* renamed from: d */
            public final void mo60096d(StringBuilder sb) {
                C24362h.m61211f(sb, "builder");
                sb.append(")");
            }
        }

        /* renamed from: a */
        void mo60093a(StringBuilder sb);

        /* renamed from: b */
        void mo60094b(C25452k0 k0Var, int i, int i2, StringBuilder sb);

        /* renamed from: c */
        void mo60095c(C25452k0 k0Var, StringBuilder sb);

        /* renamed from: d */
        void mo60096d(StringBuilder sb);
    }

    static {
        C24100a.m60132a(DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1.f61112f);
        C24100a.m60132a(DescriptorRenderer$Companion$COMPACT$1.f61110f);
        C24100a.m60132a(DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1.f61111f);
        C24100a.m60132a(DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1.f61113f);
        C24100a.m60132a(DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1.f61118f);
        C24100a.m60132a(C24104xb65db377.f61116f);
        C24100a.m60132a(DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1.f61119f);
        C24100a.m60132a(DescriptorRenderer$Companion$HTML$1.f61117f);
    }

    /* renamed from: p */
    public abstract String mo60088p(String str, String str2, C23867c cVar);

    /* renamed from: q */
    public abstract String mo60089q(C25067d dVar);

    /* renamed from: r */
    public abstract String mo60090r(C25069e eVar, boolean z);

    /* renamed from: s */
    public abstract String mo60091s(C24307v vVar);

    /* renamed from: t */
    public abstract String mo60092t(C24281l0 l0Var);
}
