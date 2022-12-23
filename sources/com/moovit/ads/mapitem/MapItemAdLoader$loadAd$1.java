package com.moovit.ads.mapitem;

import android.content.Context;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p393bq.C13652a;

@C23413c(mo58554c = "com.moovit.ads.mapitem.MapItemAdLoader", mo58555f = "MapItemAdLoader.kt", mo58556l = {26}, mo58557m = "loadAd")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class MapItemAdLoader$loadAd$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C14709a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapItemAdLoader$loadAd$1(C14709a aVar, C23349c<? super MapItemAdLoader$loadAd$1> cVar) {
        super(cVar);
        this.this$0 = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C14709a.m37025a(this.this$0, (Context) null, (C13652a) null, this);
    }
}
