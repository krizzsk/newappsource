package com.moovit.app.home.dashboard.suggestions;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1010h;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1037q0;
import bf0.C21049c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p609km.C18097c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Landroidx/lifecycle/k0;", "VM", "Landroidx/lifecycle/n0$b;", "invoke", "()Landroidx/lifecycle/n0$b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class SuggestionsSectionFragment$special$$inlined$viewModels$default$5 extends Lambda implements C24225a<C1026n0.C1028b> {
    public final /* synthetic */ C21049c $owner$delegate;
    public final /* synthetic */ Fragment $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsSectionFragment$special$$inlined$viewModels$default$5(Fragment fragment, C21049c cVar) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = cVar;
    }

    public final Object invoke() {
        C1010h hVar;
        C1026n0.C1028b bVar;
        C1037q0 a = C18097c.m44767a(this.$owner$delegate);
        if (a instanceof C1010h) {
            hVar = (C1010h) a;
        } else {
            hVar = null;
        }
        if (hVar == null || (bVar = hVar.getDefaultViewModelProviderFactory()) == null) {
            bVar = this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        C24362h.m61210e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
        return bVar;
    }
}
