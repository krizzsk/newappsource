package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ag0.C20986c;
import cf0.C21136j;
import cg0.C21174i;
import com.appsflyer.share.Constants;
import hg0.C23480p;
import java.util.ArrayList;
import java.util.Map;
import jg0.C23725f;
import kg0.C23780d;
import kh0.C23789e;
import kh0.C23790f;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24281l0;
import lh0.C24289p;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mf0.C24365j;
import mg0.C24372b;
import ng0.C24501a;
import og0.C24585a;
import og0.C24587b;
import og0.C24588c;
import og0.C24590e;
import og0.C24593h;
import og0.C24598m;
import og0.C24600o;
import p389bl.C13637c;
import p626lf.C18201b;
import p845um.C19958a;
import sf0.C24866j;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25435d0;
import zf0.C25437e;
import zf0.C25448i0;
import zf0.C25452k0;
import zg0.C25492a;
import zg0.C25498g;
import zg0.C25500i;
import zg0.C25507o;
import zg0.C25512q;

public final class LazyJavaAnnotationDescriptor implements C20986c, C23725f {

    /* renamed from: i */
    public static final /* synthetic */ C24866j<Object>[] f60627i;

    /* renamed from: a */
    public final C23780d f60628a;

    /* renamed from: b */
    public final C24585a f60629b;

    /* renamed from: c */
    public final C23790f f60630c;

    /* renamed from: d */
    public final C23789e f60631d;

    /* renamed from: e */
    public final C24501a f60632e;

    /* renamed from: f */
    public final C23789e f60633f;

    /* renamed from: g */
    public final boolean f60634g = false;

    /* renamed from: h */
    public final boolean f60635h;

    static {
        Class<LazyJavaAnnotationDescriptor> cls = LazyJavaAnnotationDescriptor.class;
        f60627i = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public LazyJavaAnnotationDescriptor(C23780d dVar, C24585a aVar, boolean z) {
        C24362h.m61211f(dVar, Constants.URL_CAMPAIGN);
        C24362h.m61211f(aVar, "javaAnnotation");
        this.f60628a = dVar;
        this.f60629b = aVar;
        this.f60630c = dVar.f60080a.f60055a.mo59022g(new LazyJavaAnnotationDescriptor$fqName$2(this));
        this.f60631d = dVar.f60080a.f60055a.mo59019d(new LazyJavaAnnotationDescriptor$type$2(this));
        this.f60632e = dVar.f60080a.f60064j.mo58430a(aVar);
        this.f60633f = dVar.f60080a.f60055a.mo59019d(new LazyJavaAnnotationDescriptor$allValueArguments$2(this));
        aVar.mo58479i();
        boolean z2 = false;
        aVar.mo58474K();
        this.f60635h = z ? true : z2;
    }

    /* renamed from: a */
    public final C25498g<?> mo59519a(C24587b bVar) {
        C25498g<?> oVar;
        C24307v vVar;
        if (bVar instanceof C24600o) {
            return ConstantValueFactory.m60274c(((C24600o) bVar).getValue());
        }
        if (bVar instanceof C24598m) {
            C24598m mVar = (C24598m) bVar;
            C25065b c = mVar.mo58500c();
            C25069e d = mVar.mo58501d();
            if (c == null || d == null) {
                return null;
            }
            return new C25500i(c, d);
        }
        if (bVar instanceof C24590e) {
            C24590e eVar = (C24590e) bVar;
            C25069e name = eVar.getName();
            if (name == null) {
                name = C23480p.f59269b;
            }
            C24362h.m61210e(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            ArrayList<C24587b> elements = eVar.getElements();
            C24312z zVar = (C24312z) C19958a.m47435j(this.f60631d, f60627i[1]);
            C24362h.m61210e(zVar, "type");
            if (C13637c.m34082y(zVar)) {
                return null;
            }
            C25432c d2 = DescriptorUtilsKt.m60283d(this);
            C24362h.m61208c(d2);
            C25452k0 p = C18201b.m44919p(name, d2);
            if (p == null) {
                vVar = this.f60628a.f60080a.f60069o.mo59460m().mo59386i(C24289p.m60914d("Unknown array element type"), Variance.INVARIANT);
            } else {
                vVar = p.getType();
            }
            C24362h.m61210e(vVar, "DescriptorResolverUtils.… type\")\n                )");
            ArrayList arrayList = new ArrayList(C21136j.m49436X(elements, 10));
            for (C24587b a : elements) {
                Object a2 = mo59519a(a);
                if (a2 == null) {
                    a2 = new C25512q();
                }
                arrayList.add(a2);
            }
            oVar = ConstantValueFactory.m60273b(arrayList, vVar);
        } else if (bVar instanceof C24588c) {
            return new C25492a(new LazyJavaAnnotationDescriptor(this.f60628a, ((C24588c) bVar).mo58483a(), false));
        } else if (!(bVar instanceof C24593h)) {
            return null;
        } else {
            C24307v d3 = this.f60628a.f60084e.mo59572d(((C24593h) bVar).mo58490b(), C24372b.m61251b(TypeUsage.COMMON, false, (C21174i) null, 3));
            C24362h.m61211f(d3, "argumentType");
            if (C13637c.m34082y(d3)) {
                return null;
            }
            C24307v vVar2 = d3;
            int i = 0;
            while (C23867c.m58687z(vVar2)) {
                vVar2 = ((C24281l0) C23825c.m58491C0(vVar2.mo60410N0())).getType();
                C24362h.m61210e(vVar2, "type.arguments.single().type");
                i++;
            }
            C25437e o = vVar2.mo60411O0().mo53460o();
            if (o instanceof C25432c) {
                C25065b f = DescriptorUtilsKt.m60285f(o);
                if (f == null) {
                    return new C25507o(new C25507o.C25508a.C25509a(d3));
                }
                oVar = new C25507o(f, i);
            } else if (!(o instanceof C25448i0)) {
                return null;
            } else {
                oVar = new C25507o(C25065b.m62790l(C23872e.C23873a.f60361a.mo61600i()), 0);
            }
        }
        return oVar;
    }

    /* renamed from: e */
    public final C25435d0 mo53065e() {
        return this.f60632e;
    }

    /* renamed from: f */
    public final C25066c mo53066f() {
        C23790f fVar = this.f60630c;
        C24866j<Object> jVar = f60627i[0];
        C24362h.m61211f(fVar, "<this>");
        C24362h.m61211f(jVar, com.appboy.Constants.APPBOY_PUSH_PRIORITY_KEY);
        return (C25066c) fVar.invoke();
    }

    /* renamed from: g */
    public final Map<C25069e, C25498g<?>> mo53067g() {
        return (Map) C19958a.m47435j(this.f60633f, f60627i[2]);
    }

    public final C24307v getType() {
        return (C24312z) C19958a.m47435j(this.f60631d, f60627i[1]);
    }

    /* renamed from: i */
    public final boolean mo58955i() {
        return this.f60634g;
    }

    public final String toString() {
        return DescriptorRenderer.f61106a.mo60101F(this, (AnnotationUseSiteTarget) null);
    }
}
