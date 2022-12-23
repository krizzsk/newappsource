package com.google.common.collect;

import com.google.common.collect.MultimapBuilder;
import java.util.TreeMap;

/* renamed from: com.google.common.collect.l0 */
public final class C14410l0 extends MultimapBuilder.C14379a<Object, Object> {

    /* renamed from: a */
    public final /* synthetic */ int f36297a = 2;

    /* renamed from: b */
    public final /* synthetic */ MultimapBuilder.C14380b f36298b;

    public C14410l0(C14408k0 k0Var) {
        this.f36298b = k0Var;
    }

    /* renamed from: b */
    public final <K, V> C14387c0<K, V> mo43224b() {
        C14408k0 k0Var = (C14408k0) this.f36298b;
        k0Var.getClass();
        return new Multimaps$CustomListMultimap(new TreeMap(k0Var.f36292a), new MultimapBuilder.ArrayListSupplier(this.f36297a));
    }
}
