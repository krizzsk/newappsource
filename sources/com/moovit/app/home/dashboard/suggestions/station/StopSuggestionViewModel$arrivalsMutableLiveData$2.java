package com.moovit.app.home.dashboard.suggestions.station;

import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p546ht.C17491d;
import p952yy.C20787c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Landroidx/lifecycle/t;", "", "Lyy/c;", "invoke", "()Landroidx/lifecycle/t;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class StopSuggestionViewModel$arrivalsMutableLiveData$2 extends Lambda implements C24225a<C1040t<List<? extends C20787c>>> {
    public final /* synthetic */ StopSuggestionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopSuggestionViewModel$arrivalsMutableLiveData$2(StopSuggestionViewModel stopSuggestionViewModel) {
        super(0);
        this.this$0 = stopSuggestionViewModel;
    }

    public final Object invoke() {
        C1040t tVar = new C1040t();
        StopSuggestionViewModel stopSuggestionViewModel = this.this$0;
        tVar.addSource((C1043v) stopSuggestionViewModel.f38347c.getValue(), new C17491d(new StopSuggestionViewModel$arrivalsMutableLiveData$2$1$1(stopSuggestionViewModel)));
        return tVar;
    }
}
