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

public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* renamed from: h */
    public static final /* synthetic */ C24866j<Object>[] f60595h = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(JavaRetentionAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    public final C23789e f60596g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(C24585a aVar, C23780d dVar) {
        super(dVar, aVar, C23872e.C23873a.f60384v);
        C24362h.m61211f(aVar, "annotation");
        C24362h.m61211f(dVar, Constants.URL_CAMPAIGN);
        this.f60596g = dVar.f60080a.f60055a.mo59019d(new JavaRetentionAnnotationDescriptor$allValueArguments$2(this));
    }

    /* renamed from: g */
    public final Map<C25069e, C25498g<?>> mo53067g() {
        return (Map) C19958a.m47435j(this.f60596g, f60595h[0]);
    }
}
