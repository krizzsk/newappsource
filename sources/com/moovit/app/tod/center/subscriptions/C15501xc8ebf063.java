package com.moovit.app.tod.center.subscriptions;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1026n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Landroidx/lifecycle/k0;", "VM", "Landroidx/lifecycle/n0$b;", "invoke", "()Landroidx/lifecycle/n0$b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
/* renamed from: com.moovit.app.tod.center.subscriptions.TodWeeklySubscriptionDetailsFragment$special$$inlined$activityViewModels$default$3 */
public final class C15501xc8ebf063 extends Lambda implements C24225a<C1026n0.C1028b> {
    public final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15501xc8ebf063(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    public final Object invoke() {
        C1026n0.C1028b defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        C24362h.m61210e(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
