package kotlin.reflect.jvm.internal.impl.load.java.components;

import ag0.C20986c;
import com.appsflyer.share.Constants;
import java.util.Map;
import jg0.C23725f;
import kg0.C23780d;
import kh0.C23789e;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.jvm.internal.PropertyReference1Impl;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mf0.C24365j;
import og0.C24585a;
import og0.C24587b;
import p845um.C19958a;
import sf0.C24866j;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25435d0;
import zg0.C25498g;

public class JavaAnnotationDescriptor implements C20986c, C23725f {

    /* renamed from: f */
    public static final /* synthetic */ C24866j<Object>[] f60584f = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    public final C25066c f60585a;

    /* renamed from: b */
    public final C25435d0 f60586b;

    /* renamed from: c */
    public final C23789e f60587c;

    /* renamed from: d */
    public final C24587b f60588d;

    /* renamed from: e */
    public final boolean f60589e;

    public JavaAnnotationDescriptor(C23780d dVar, C24585a aVar, C25066c cVar) {
        C25435d0 d0Var;
        C24587b bVar;
        C24362h.m61211f(dVar, Constants.URL_CAMPAIGN);
        C24362h.m61211f(cVar, "fqName");
        this.f60585a = cVar;
        if (aVar == null) {
            d0Var = C25435d0.f63736a;
        } else {
            d0Var = dVar.f60080a.f60064j.mo58430a(aVar);
        }
        this.f60586b = d0Var;
        this.f60587c = dVar.f60080a.f60055a.mo59019d(new JavaAnnotationDescriptor$type$2(dVar, this));
        if (aVar == null) {
            bVar = null;
        } else {
            bVar = (C24587b) C23825c.m58514k0(aVar.mo58475N());
        }
        this.f60588d = bVar;
        if (aVar != null) {
            aVar.mo58479i();
        }
        this.f60589e = false;
    }

    /* renamed from: e */
    public final C25435d0 mo53065e() {
        return this.f60586b;
    }

    /* renamed from: f */
    public final C25066c mo53066f() {
        return this.f60585a;
    }

    /* renamed from: g */
    public Map<C25069e, C25498g<?>> mo53067g() {
        return C23826d.m58530U();
    }

    public final C24307v getType() {
        return (C24312z) C19958a.m47435j(this.f60587c, f60584f[0]);
    }

    /* renamed from: i */
    public final boolean mo58955i() {
        return this.f60589e;
    }
}
