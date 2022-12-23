package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Landroidx/lifecycle/e0;", "invoke", "()Landroidx/lifecycle/e0;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class SavedStateHandlesProvider$viewModel$2 extends Lambda implements C24225a<C1005e0> {
    public final /* synthetic */ C1037q0 $viewModelStoreOwner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedStateHandlesProvider$viewModel$2(C1037q0 q0Var) {
        super(0);
        this.$viewModelStoreOwner = q0Var;
    }

    public final Object invoke() {
        return SavedStateHandleSupport.m2851c(this.$viewModelStoreOwner);
    }
}
