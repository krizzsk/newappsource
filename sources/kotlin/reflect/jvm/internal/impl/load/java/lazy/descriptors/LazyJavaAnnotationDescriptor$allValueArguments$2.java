package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import hg0.C23480p;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import og0.C24587b;
import ug0.C25069e;
import zg0.C25498g;

public final class LazyJavaAnnotationDescriptor$allValueArguments$2 extends Lambda implements C24225a<Map<C25069e, ? extends C25498g<?>>> {
    public final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$allValueArguments$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.this$0 = lazyJavaAnnotationDescriptor;
    }

    public final Object invoke() {
        Pair pair;
        ArrayList<C24587b> N = this.this$0.f60629b.mo58475N();
        LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (C24587b bVar : N) {
            C25069e name = bVar.getName();
            if (name == null) {
                name = C23480p.f59269b;
            }
            C25498g<?> a = lazyJavaAnnotationDescriptor.mo59519a(bVar);
            if (a == null) {
                pair = null;
            } else {
                pair = new Pair(name, a);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return C23826d.m58536a0(arrayList);
    }
}
