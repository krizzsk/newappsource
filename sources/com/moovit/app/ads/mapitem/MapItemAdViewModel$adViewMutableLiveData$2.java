package com.moovit.app.ads.mapitem;

import android.view.View;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p873vq.C20198c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Landroidx/lifecycle/t;", "Landroid/view/View;", "invoke", "()Landroidx/lifecycle/t;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class MapItemAdViewModel$adViewMutableLiveData$2 extends Lambda implements C24225a<C1040t<View>> {
    public final /* synthetic */ MapItemAdViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapItemAdViewModel$adViewMutableLiveData$2(MapItemAdViewModel mapItemAdViewModel) {
        super(0);
        this.this$0 = mapItemAdViewModel;
    }

    public final Object invoke() {
        C1040t tVar = new C1040t();
        MapItemAdViewModel mapItemAdViewModel = this.this$0;
        tVar.addSource((C1043v) mapItemAdViewModel.f37554c.getValue(), new C20198c(new MapItemAdViewModel$adViewMutableLiveData$2$1$1(mapItemAdViewModel)));
        return tVar;
    }
}
