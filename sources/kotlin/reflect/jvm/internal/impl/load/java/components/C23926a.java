package kotlin.reflect.jvm.internal.impl.load.java.components;

import cf0.C21136j;
import cf0.C21140n;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import mf0.C24362h;
import og0.C24598m;
import ug0.C25065b;
import ug0.C25069e;
import zg0.C25493b;
import zg0.C25500i;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a */
public final class C23926a {

    /* renamed from: a */
    public static final Map<String, EnumSet<KotlinTarget>> f60599a = C23826d.m58533X(new Pair("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new Pair("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(KotlinTarget.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* renamed from: b */
    public static final Map<String, KotlinRetention> f60600b = C23826d.m58533X(new Pair("RUNTIME", KotlinRetention.RUNTIME), new Pair("CLASS", KotlinRetention.BINARY), new Pair("SOURCE", KotlinRetention.SOURCE));

    /* renamed from: a */
    public static C25493b m59000a(List list) {
        String str;
        C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof C24598m) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C25069e d = ((C24598m) it.next()).mo58501d();
            if (d == null) {
                str = null;
            } else {
                str = d.mo61604f();
            }
            Iterable iterable = f60599a.get(str);
            if (iterable == null) {
                iterable = EmptySet.f60175b;
            }
            C21140n.m49439a0(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(C21136j.m49436X(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new C25500i(C25065b.m62790l(C23872e.C23873a.f60382t), C25069e.m62820i(((KotlinTarget) it2.next()).name())));
        }
        return new C25493b(arrayList3, JavaAnnotationTargetMapper$mapJavaTargetArguments$1.f60591f);
    }
}
