package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.appboy.models.InAppMessageBase;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import mf0.C24362h;
import ug0.C25065b;
import ug0.C25069e;
import zg0.C25492a;
import zg0.C25493b;
import zg0.C25500i;
import zg0.C25514s;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.a */
public final class C23898a {

    /* renamed from: a */
    public static final C25069e f60445a = C25069e.m62820i(InAppMessageBase.MESSAGE);

    /* renamed from: b */
    public static final C25069e f60446b = C25069e.m62820i("replaceWith");

    /* renamed from: c */
    public static final C25069e f60447c = C25069e.m62820i("level");

    /* renamed from: d */
    public static final C25069e f60448d = C25069e.m62820i("expression");

    /* renamed from: e */
    public static final C25069e f60449e = C25069e.m62820i("imports");

    /* renamed from: a */
    public static BuiltInAnnotationDescriptor m58782a(C23867c cVar) {
        C24362h.m61211f(cVar, "<this>");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(cVar, C23872e.C23873a.f60377o, C23826d.m58533X(new Pair(f60448d, new C25514s("")), new Pair(f60449e, new C25493b(EmptyList.f60173b, new C23896xf14e0c1a(cVar)))));
        return new BuiltInAnnotationDescriptor(cVar, C23872e.C23873a.f60375m, C23826d.m58533X(new Pair(f60445a, new C25514s("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new Pair(f60446b, new C25492a(builtInAnnotationDescriptor)), new Pair(f60447c, new C25500i(C25065b.m62790l(C23872e.C23873a.f60376n), C25069e.m62820i("WARNING")))));
    }
}
