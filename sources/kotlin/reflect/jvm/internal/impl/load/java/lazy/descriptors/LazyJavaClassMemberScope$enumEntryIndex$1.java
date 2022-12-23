package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import og0.C24599n;
import p389bl.C13637c;
import ug0.C25069e;

public final class LazyJavaClassMemberScope$enumEntryIndex$1 extends Lambda implements C24225a<Map<C25069e, ? extends C24599n>> {
    public final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$enumEntryIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.this$0 = lazyJavaClassMemberScope;
    }

    public final Object invoke() {
        List J = this.this$0.f60655o.mo59470J();
        ArrayList arrayList = new ArrayList();
        for (Object next : J) {
            if (((C24599n) next).mo58502M()) {
                arrayList.add(next);
            }
        }
        int z = C13637c.m34083z(C21136j.m49436X(arrayList, 10));
        if (z < 16) {
            z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            linkedHashMap.put(((C24599n) next2).getName(), next2);
        }
        return linkedHashMap;
    }
}
