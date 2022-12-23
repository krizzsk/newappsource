package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import lf0.C24225a;
import og0.C24605t;

public final class LazyJavaPackageFragmentProvider$getPackageFragment$1 extends Lambda implements C24225a<LazyJavaPackageFragment> {
    public final /* synthetic */ C24605t $jPackage;
    public final /* synthetic */ LazyJavaPackageFragmentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragmentProvider$getPackageFragment$1(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, C24605t tVar) {
        super(0);
        this.this$0 = lazyJavaPackageFragmentProvider;
        this.$jPackage = tVar;
    }

    public final Object invoke() {
        return new LazyJavaPackageFragment(this.this$0.f60609a, this.$jPackage);
    }
}
