package ag0;

import ag0.C20986c;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import lh0.C24307v;
import lh0.C24312z;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25435d0;
import zg0.C25498g;

/* renamed from: ag0.d */
public final class C20988d implements C20986c {

    /* renamed from: a */
    public final C24307v f52736a;

    /* renamed from: b */
    public final Map<C25069e, C25498g<?>> f52737b;

    /* renamed from: c */
    public final C25435d0 f52738c;

    public C20988d(C24312z zVar, Map map, C25435d0 d0Var) {
        if (zVar == null) {
            m49141a(0);
            throw null;
        } else if (map == null) {
            m49141a(1);
            throw null;
        } else if (d0Var != null) {
            this.f52736a = zVar;
            this.f52737b = map;
            this.f52738c = d0Var;
        } else {
            m49141a(2);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m49141a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: e */
    public final C25435d0 mo53065e() {
        C25435d0 d0Var = this.f52738c;
        if (d0Var != null) {
            return d0Var;
        }
        m49141a(5);
        throw null;
    }

    /* renamed from: f */
    public final C25066c mo53066f() {
        return C20986c.C20987a.m49140a(this);
    }

    /* renamed from: g */
    public final Map<C25069e, C25498g<?>> mo53067g() {
        Map<C25069e, C25498g<?>> map = this.f52737b;
        if (map != null) {
            return map;
        }
        m49141a(4);
        throw null;
    }

    public final C24307v getType() {
        C24307v vVar = this.f52736a;
        if (vVar != null) {
            return vVar;
        }
        m49141a(3);
        throw null;
    }

    public final String toString() {
        return DescriptorRenderer.f61106a.mo60101F(this, (AnnotationUseSiteTarget) null);
    }
}
