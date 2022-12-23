package com.moovit.app.home.dashboard.suggestions;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p474et.C16873e;
import p474et.C16876h;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel", mo58555f = "SuggestionsSectionViewModel.kt", mo58556l = {168}, mo58557m = "loadProviderCards-0E7RQCE")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class SuggestionsSectionViewModel$loadProviderCards$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SuggestionsSectionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsSectionViewModel$loadProviderCards$1(SuggestionsSectionViewModel suggestionsSectionViewModel, C23349c<? super SuggestionsSectionViewModel$loadProviderCards$1> cVar) {
        super(cVar);
        this.this$0 = suggestionsSectionViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = SuggestionsSectionViewModel.m37812b(this.this$0, (C16873e) null, (C16876h) null, this);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return new Result(b);
    }
}
