package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.C23826d;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import qg0.C24757k;
import qg0.C24765o;

public final class LazyJavaPackageFragment$binaryClasses$2 extends Lambda implements C24225a<Map<String, ? extends C24757k>> {
    public final /* synthetic */ LazyJavaPackageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$binaryClasses$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.this$0 = lazyJavaPackageFragment;
    }

    public final Object invoke() {
        LazyJavaPackageFragment lazyJavaPackageFragment = this.this$0;
        C24765o oVar = lazyJavaPackageFragment.f60666i.f60080a.f60066l;
        String b = lazyJavaPackageFragment.f53008f.mo61580b();
        C24362h.m61210e(b, "fqName.asString()");
        EmptyList a = oVar.mo61238a(b);
        ArrayList arrayList = new ArrayList();
        a.getClass();
        return C23826d.m58536a0(arrayList);
    }
}
