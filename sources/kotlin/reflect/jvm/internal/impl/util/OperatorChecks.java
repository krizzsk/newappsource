package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import kotlin.text.Regex;
import lf0.C24236l;
import mf0.C24362h;
import p057d3.C4339c;
import p583jk.C17875h;
import qh0.C24770a;
import qh0.C24776c;
import qh0.C24777d;
import qh0.C24782f;
import qh0.C24783g;
import qh0.C24784h;
import ug0.C25069e;

public final class OperatorChecks extends C4339c {

    /* renamed from: b */
    public static final OperatorChecks f61374b = new OperatorChecks();

    /* renamed from: c */
    public static final List<C24173a> f61375c;

    static {
        C25069e eVar = C24783g.f62694i;
        C24777d.C24779b bVar = C24777d.C24779b.f62683b;
        C24770a[] aVarArr = {bVar, new C24784h.C24785a(1)};
        C25069e eVar2 = C24783g.f62695j;
        C24770a[] aVarArr2 = {bVar, new C24784h.C24785a(2)};
        C25069e eVar3 = C24783g.f62686a;
        C24782f fVar = C24782f.f62685a;
        C24776c cVar = C24776c.f62680a;
        C24770a[] aVarArr3 = {bVar, fVar, new C24784h.C24785a(2), cVar};
        C25069e eVar4 = C24783g.f62687b;
        C24770a[] aVarArr4 = {bVar, fVar, new C24784h.C24785a(3), cVar};
        C25069e eVar5 = C24783g.f62688c;
        C24770a[] aVarArr5 = {bVar, fVar, new C24784h.C24786b(), cVar};
        C25069e eVar6 = C24783g.f62692g;
        C24770a[] aVarArr6 = {bVar};
        C25069e eVar7 = C24783g.f62691f;
        C24784h.C24788d dVar = C24784h.C24788d.f62709b;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.f61381c;
        C24770a[] aVarArr7 = {bVar, dVar, fVar, returnsBoolean};
        C25069e eVar8 = C24783g.f62693h;
        C24784h.C24787c cVar2 = C24784h.C24787c.f62708b;
        C24770a[] aVarArr8 = {bVar, cVar2};
        C25069e eVar9 = C24783g.f62696k;
        C24770a[] aVarArr9 = {bVar, cVar2};
        C25069e eVar10 = C24783g.f62697l;
        C24770a[] aVarArr10 = {bVar, cVar2, returnsBoolean};
        C25069e eVar11 = C24783g.f62701p;
        C24770a[] aVarArr11 = {bVar, dVar, fVar};
        C25069e eVar12 = C24783g.f62689d;
        C24770a[] aVarArr12 = {C24777d.C24778a.f62682b};
        C25069e eVar13 = C24783g.f62690e;
        C24770a[] aVarArr13 = {bVar, ReturnsCheck.ReturnsInt.f61383c, dVar, fVar};
        Set<C25069e> set = C24783g.f62703r;
        C24770a[] aVarArr14 = {bVar, dVar, fVar};
        Set<C25069e> set2 = C24783g.f62702q;
        C24770a[] aVarArr15 = {bVar, cVar2};
        List E = C17875h.m44281E(C24783g.f62699n, C24783g.f62700o);
        C24770a[] aVarArr16 = {bVar};
        Set<C25069e> set3 = C24783g.f62704s;
        C24770a[] aVarArr17 = {bVar, ReturnsCheck.ReturnsUnit.f61385c, dVar, fVar};
        Regex regex = C24783g.f62698m;
        C24770a[] aVarArr18 = {bVar, cVar2};
        Checks$3 checks$3 = Checks$3.f61372f;
        C24362h.m61211f(regex, LinksConfiguration.KEY_REGEX);
        C24362h.m61211f(checks$3, "additionalChecks");
        f61375c = C17875h.m44281E(new C24173a(eVar, aVarArr), new C24173a(eVar2, aVarArr2, (C24236l<? super C23900c, String>) OperatorChecks$checks$1.f61376f), new C24173a(eVar3, aVarArr3), new C24173a(eVar4, aVarArr4), new C24173a(eVar5, aVarArr5), new C24173a(eVar6, aVarArr6), new C24173a(eVar7, aVarArr7), new C24173a(eVar8, aVarArr8), new C24173a(eVar9, aVarArr9), new C24173a(eVar10, aVarArr10), new C24173a(eVar11, aVarArr11), new C24173a(eVar12, aVarArr12, (C24236l<? super C23900c, String>) OperatorChecks$checks$2.f61377f), new C24173a(eVar13, aVarArr13), new C24173a((Set) set, aVarArr14), new C24173a((Set) set2, aVarArr15), new C24173a((Collection<C25069e>) E, aVarArr16, (C24236l<? super C23900c, String>) OperatorChecks$checks$3.f61378f), new C24173a((Set) set3, aVarArr17), new C24173a((C25069e) null, regex, (Collection<C25069e>) null, checks$3, (C24770a[]) Arrays.copyOf(aVarArr18, 2)));
    }
}
