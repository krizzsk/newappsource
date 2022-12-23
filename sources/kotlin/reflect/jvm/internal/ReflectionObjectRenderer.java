package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.collections.C23825c;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import lh0.C24307v;
import mf0.C24362h;
import tf0.C24979k;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25452k0;
import zf0.C25491z;

public final class ReflectionObjectRenderer {

    /* renamed from: a */
    public static final DescriptorRendererImpl f60280a = DescriptorRenderer.f61106a;

    /* renamed from: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$a */
    public /* synthetic */ class C23852a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60281a;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            iArr[KParameter.Kind.INSTANCE.ordinal()] = 2;
            iArr[KParameter.Kind.VALUE.ordinal()] = 3;
            f60281a = iArr;
        }
    }

    /* renamed from: a */
    public static void m58641a(StringBuilder sb, C23894a aVar) {
        C25433c0 c0Var;
        boolean z;
        C25066c cVar = C24979k.f63116a;
        C24362h.m61211f(aVar, "<this>");
        if (aVar.mo53422O() != null) {
            c0Var = ((C25432c) aVar.mo53399b()).mo53404M0();
        } else {
            c0Var = null;
        }
        C25433c0 R = aVar.mo53423R();
        if (c0Var != null) {
            C24307v type = c0Var.getType();
            C24362h.m61210e(type, "receiver.type");
            sb.append(m58644d(type));
            sb.append(".");
        }
        if (c0Var == null || R == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            sb.append("(");
        }
        if (R != null) {
            C24307v type2 = R.getType();
            C24362h.m61210e(type2, "receiver.type");
            sb.append(m58644d(type2));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    /* renamed from: b */
    public static String m58642b(C23900c cVar) {
        C24362h.m61211f(cVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        m58641a(sb, cVar);
        DescriptorRendererImpl descriptorRendererImpl = f60280a;
        C25069e name = cVar.getName();
        C24362h.m61210e(name, "descriptor.name");
        sb.append(descriptorRendererImpl.mo60090r(name, true));
        List<C25452k0> h = cVar.mo53442h();
        C24362h.m61210e(h, "descriptor.valueParameters");
        C23825c.m58518o0(h, sb, ", ", "(", ")", ReflectionObjectRenderer$renderFunction$1$1.f60282f, 48);
        sb.append(": ");
        C24307v i = cVar.mo53443i();
        C24362h.m61208c(i);
        sb.append(m58644d(i));
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    public static String m58643c(C25491z zVar) {
        String str;
        C24362h.m61211f(zVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        if (zVar.mo53526Q()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb.append(str);
        m58641a(sb, zVar);
        DescriptorRendererImpl descriptorRendererImpl = f60280a;
        C25069e name = zVar.getName();
        C24362h.m61210e(name, "descriptor.name");
        sb.append(descriptorRendererImpl.mo60090r(name, true));
        sb.append(": ");
        C24307v type = zVar.getType();
        C24362h.m61210e(type, "descriptor.type");
        sb.append(m58644d(type));
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: d */
    public static String m58644d(C24307v vVar) {
        C24362h.m61211f(vVar, "type");
        return f60280a.mo60091s(vVar);
    }
}
