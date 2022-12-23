package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.appsflyer.share.Constants;
import java.util.Map;
import kg0.C23780d;
import kh0.C23789e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import mf0.C24362h;
import mf0.C24365j;
import og0.C24585a;
import p845um.C19958a;
import sf0.C24866j;
import ug0.C25069e;
import zg0.C25498g;

public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* renamed from: h */
    public static final /* synthetic */ C24866j<Object>[] f60592h = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(JavaDeprecatedAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    public final C23789e f60593g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(C24585a aVar, C23780d dVar) {
        super(dVar, aVar, C23872e.C23873a.f60375m);
        C24362h.m61211f(dVar, Constants.URL_CAMPAIGN);
        this.f60593g = dVar.f60080a.f60055a.mo59019d(JavaDeprecatedAnnotationDescriptor$allValueArguments$2.f60594f);
    }

    /* renamed from: g */
    public final Map<C25069e, C25498g<?>> mo53067g() {
        return (Map) C19958a.m47435j(this.f60593g, f60592h[0]);
    }
}
