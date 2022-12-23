package com.google.common.collect;

import java.util.Set;
import p988j$.util.function.Predicate;

/* renamed from: com.google.common.collect.r0 */
public final /* synthetic */ class C14427r0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f36318a;

    public /* synthetic */ C14427r0(Set set) {
        this.f36318a = set;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo43234or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return this.f36318a.contains(obj);
    }
}
