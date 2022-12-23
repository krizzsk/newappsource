package lh0;

import ag0.C20986c;
import ag0.C20989e;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import lf0.C24236l;
import mf0.C24362h;
import oh0.C24618g;
import oh0.C24619h;

/* renamed from: lh0.z */
public abstract class C24312z extends C24306u0 implements C24618g, C24619h {
    /* renamed from: V0 */
    public abstract C24312z mo59559S0(boolean z);

    /* renamed from: W0 */
    public abstract C24312z mo59561U0(C20989e eVar);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C20986c F : getAnnotations()) {
            String[] strArr = {"[", DescriptorRenderer.f61107b.mo60101F(F, (AnnotationUseSiteTarget) null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(mo60411O0());
        if (!mo60410N0().isEmpty()) {
            C23825c.m58518o0(mo60410N0(), sb, ", ", "<", ">", (C24236l) null, 112);
        }
        if (mo60412P0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
