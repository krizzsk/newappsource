package com.cubic.umo.auth.activity;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1026n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, mo59060d2 = {"Landroidx/lifecycle/k0;", "VM", "Landroidx/lifecycle/n0$b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class AuthActivity$special$$inlined$viewModels$default$1 extends Lambda implements C24225a<C1026n0.C1028b> {
    public final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthActivity$special$$inlined$viewModels$default$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    public final Object invoke() {
        C1026n0.C1028b defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        C24362h.m61210e(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
