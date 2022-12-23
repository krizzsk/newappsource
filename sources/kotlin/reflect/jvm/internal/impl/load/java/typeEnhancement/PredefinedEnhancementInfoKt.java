package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.LinkedHashMap;
import mf0.C24362h;
import pg0.C24698d;
import pg0.C24702h;

public final class PredefinedEnhancementInfoKt {

    /* renamed from: a */
    public static final C24698d f60725a = new C24698d(NullabilityQualifier.NULLABLE, (MutabilityQualifier) null, false, false);

    /* renamed from: b */
    public static final C24698d f60726b;

    /* renamed from: c */
    public static final C24698d f60727c;

    /* renamed from: d */
    public static final LinkedHashMap f60728d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f60726b = new C24698d(nullabilityQualifier, (MutabilityQualifier) null, false, false);
        f60727c = new C24698d(nullabilityQualifier, (MutabilityQualifier) null, true, false);
        String k = C24362h.m61216k("Object", "java/lang/");
        String k2 = C24362h.m61216k("Predicate", "java/util/function/");
        String k3 = C24362h.m61216k("Function", "java/util/function/");
        String k4 = C24362h.m61216k("Consumer", "java/util/function/");
        String k5 = C24362h.m61216k("BiFunction", "java/util/function/");
        String k6 = C24362h.m61216k("BiConsumer", "java/util/function/");
        String k7 = C24362h.m61216k("UnaryOperator", "java/util/function/");
        String k8 = C24362h.m61216k("stream/Stream", "java/util/");
        String k9 = C24362h.m61216k("Optional", "java/util/");
        C24702h hVar = new C24702h();
        new C24702h.C24703a(hVar, C24362h.m61216k("Iterator", "java/util/")).mo61184a("forEachRemaining", new C23944xb250426d(k4));
        new C24702h.C24703a(hVar, C24362h.m61216k("Iterable", "java/lang/")).mo61184a("spliterator", new C23950xb250462e());
        C24702h.C24703a aVar = new C24702h.C24703a(hVar, C24362h.m61216k("Collection", "java/util/"));
        aVar.mo61184a("removeIf", new C23951xb25049ef(k2));
        aVar.mo61184a("stream", new C23952xb25049f0(k8));
        aVar.mo61184a("parallelStream", new C23953xb25049f1(k8));
        new C24702h.C24703a(hVar, C24362h.m61216k("List", "java/util/")).mo61184a("replaceAll", new C23954xb2504db0(k7));
        C24702h.C24703a aVar2 = new C24702h.C24703a(hVar, C24362h.m61216k("Map", "java/util/"));
        aVar2.mo61184a("forEach", new C23955xb2505171(k6));
        aVar2.mo61184a("putIfAbsent", new C23956xb2505172(k));
        aVar2.mo61184a("replace", new C23957xb2505173(k));
        aVar2.mo61184a("replace", new C23958xb2505174(k));
        aVar2.mo61184a("replaceAll", new C23959xb2505175(k5));
        aVar2.mo61184a("compute", new C23960xb2505176(k, k5));
        aVar2.mo61184a("computeIfAbsent", new C23961xb2505177(k, k3));
        aVar2.mo61184a("computeIfPresent", new C23962xb2505178(k, k5));
        aVar2.mo61184a("merge", new C23963xb2505179(k, k5));
        C24702h.C24703a aVar3 = new C24702h.C24703a(hVar, k9);
        aVar3.mo61184a("empty", new C23964xb2505532(k9));
        aVar3.mo61184a("of", new C23965xb2505533(k, k9));
        aVar3.mo61184a("ofNullable", new C23966xb2505534(k, k9));
        aVar3.mo61184a("get", new C23967xb2505535(k));
        aVar3.mo61184a("ifPresent", new C23968xb2505536(k4));
        new C24702h.C24703a(hVar, C24362h.m61216k("ref/Reference", "java/lang/")).mo61184a("get", new C23969xb25058f3(k));
        new C24702h.C24703a(hVar, k2).mo61184a("test", new C23970xb2505cb4(k));
        new C24702h.C24703a(hVar, C24362h.m61216k("BiPredicate", "java/util/function/")).mo61184a("test", new C23971xb2506075(k));
        new C24702h.C24703a(hVar, k4).mo61184a("accept", new C23945x97b836dd(k));
        new C24702h.C24703a(hVar, k6).mo61184a("accept", new C23946x97b83a9e(k));
        new C24702h.C24703a(hVar, k3).mo61184a("apply", new C23947x97b83e5f(k));
        new C24702h.C24703a(hVar, k5).mo61184a("apply", new C23948x97b84220(k));
        new C24702h.C24703a(hVar, C24362h.m61216k("Supplier", "java/util/function/")).mo61184a("get", new C23949x97b845e1(k));
        f60728d = hVar.f62541a;
    }
}
