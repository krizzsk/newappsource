package com.moovit.app.home.dashboard.suggestions;

import androidx.lifecycle.C1010h;
import androidx.lifecycle.C1037q0;
import bf0.C21049c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p091g2.C4746a;
import p609km.C18097c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Landroidx/lifecycle/k0;", "VM", "Lg2/a;", "invoke", "()Lg2/a;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class SuggestionsSectionFragment$special$$inlined$viewModels$default$4 extends Lambda implements C24225a<C4746a> {
    public final /* synthetic */ C24225a $extrasProducer = null;
    public final /* synthetic */ C21049c $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsSectionFragment$special$$inlined$viewModels$default$4(C21049c cVar) {
        super(0);
        this.$owner$delegate = cVar;
    }

    public final Object invoke() {
        C1010h hVar;
        C4746a aVar;
        C4746a aVar2;
        C24225a aVar3 = this.$extrasProducer;
        if (aVar3 != null && (aVar2 = (C4746a) aVar3.invoke()) != null) {
            return aVar2;
        }
        C1037q0 a = C18097c.m44767a(this.$owner$delegate);
        if (a instanceof C1010h) {
            hVar = (C1010h) a;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            aVar = hVar.getDefaultViewModelCreationExtras();
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return C4746a.C4747a.f16033b;
        }
        return aVar;
    }
}
