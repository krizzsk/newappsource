package com.moovit.app.tod.center.subscriptions;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p091g2.C4746a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Landroidx/lifecycle/k0;", "VM", "Lg2/a;", "invoke", "()Lg2/a;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
/* renamed from: com.moovit.app.tod.center.subscriptions.TodWeeklySubscriptionDetailsFragment$special$$inlined$activityViewModels$default$2 */
public final class C15500xc8ebf062 extends Lambda implements C24225a<C4746a> {
    public final /* synthetic */ C24225a $extrasProducer = null;
    public final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15500xc8ebf062(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    public final Object invoke() {
        C4746a aVar;
        C24225a aVar2 = this.$extrasProducer;
        if (aVar2 != null && (aVar = (C4746a) aVar2.invoke()) != null) {
            return aVar;
        }
        C4746a defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
        C24362h.m61210e(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
