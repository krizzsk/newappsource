package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ig0.C23598d;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24236l;
import lg0.C24248a;
import mf0.C24362h;
import og0.C24602q;
import ug0.C25069e;

public final class LazyJavaScope$declaredFunctions$1 extends Lambda implements C24236l<C25069e, Collection<? extends C23903e>> {
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredFunctions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    public final Object invoke(Object obj) {
        C25069e eVar = (C25069e) obj;
        C24362h.m61211f(eVar, "name");
        LazyJavaScope lazyJavaScope = this.this$0.f60685c;
        if (lazyJavaScope != null) {
            return (Collection) ((LockBasedStorageManager.C24148k) lazyJavaScope.f60688f).invoke(eVar);
        }
        ArrayList arrayList = new ArrayList();
        for (C24602q t : ((C24248a) this.this$0.f60687e.invoke()).mo59515f(eVar)) {
            JavaMethodDescriptor t2 = this.this$0.mo59551t(t);
            if (this.this$0.mo59542r(t2)) {
                ((C23598d.C23599a) this.this$0.f60684b.f60080a.f60061g).getClass();
                arrayList.add(t2);
            }
        }
        this.this$0.mo59535j(arrayList, eVar);
        return arrayList;
    }
}
