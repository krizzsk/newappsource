package com.moovit.app.tod.pincode;

import androidx.lifecycle.C1034p0;
import bf0.C21049c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p609km.C18097c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Landroidx/lifecycle/k0;", "VM", "Landroidx/lifecycle/p0;", "invoke", "()Landroidx/lifecycle/p0;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
/* renamed from: com.moovit.app.tod.pincode.TodAutonomousRidePinCodeDialogFragment$special$$inlined$viewModels$default$3 */
public final class C15533x8834e6b2 extends Lambda implements C24225a<C1034p0> {
    public final /* synthetic */ C21049c $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15533x8834e6b2(C21049c cVar) {
        super(0);
        this.$owner$delegate = cVar;
    }

    public final Object invoke() {
        C1034p0 viewModelStore = C18097c.m44767a(this.$owner$delegate).getViewModelStore();
        C24362h.m61210e(viewModelStore, "owner.viewModelStore");
        return viewModelStore;
    }
}
