package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.text.Regex;
import lf0.C24236l;
import mf0.C24362h;
import qh0.C24770a;
import ug0.C25069e;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.a */
public final class C24173a {

    /* renamed from: a */
    public final C25069e f61387a;

    /* renamed from: b */
    public final Regex f61388b;

    /* renamed from: c */
    public final Collection<C25069e> f61389c;

    /* renamed from: d */
    public final C24236l<C23900c, String> f61390d;

    /* renamed from: e */
    public final C24770a[] f61391e;

    public C24173a() {
        throw null;
    }

    public C24173a(C25069e eVar, Regex regex, Collection<C25069e> collection, C24236l<? super C23900c, String> lVar, C24770a... aVarArr) {
        this.f61387a = eVar;
        this.f61388b = regex;
        this.f61389c = collection;
        this.f61390d = lVar;
        this.f61391e = aVarArr;
    }

    public /* synthetic */ C24173a(C25069e eVar, C24770a[] aVarArr) {
        this(eVar, aVarArr, (C24236l<? super C23900c, String>) Checks$2.f61371f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C24173a(C25069e eVar, C24770a[] aVarArr, C24236l<? super C23900c, String> lVar) {
        this(eVar, (Regex) null, (Collection<C25069e>) null, lVar, (C24770a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(lVar, "additionalChecks");
    }

    public /* synthetic */ C24173a(Set set, C24770a[] aVarArr) {
        this((Collection<C25069e>) set, aVarArr, (C24236l<? super C23900c, String>) Checks$4.f61373f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C24173a(Collection<C25069e> collection, C24770a[] aVarArr, C24236l<? super C23900c, String> lVar) {
        this((C25069e) null, (Regex) null, collection, lVar, (C24770a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        C24362h.m61211f(collection, "nameList");
        C24362h.m61211f(lVar, "additionalChecks");
    }
}
