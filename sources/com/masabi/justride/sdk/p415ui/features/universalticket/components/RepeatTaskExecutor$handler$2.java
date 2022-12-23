package com.masabi.justride.sdk.p415ui.features.universalticket.components;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.components.RepeatTaskExecutor$handler$2 */
final class RepeatTaskExecutor$handler$2 extends Lambda implements C24225a<Handler> {
    public final /* synthetic */ long $delayMillis;
    public final /* synthetic */ Runnable $runnable;
    public final /* synthetic */ C14670b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatTaskExecutor$handler$2(C14670b bVar, Runnable runnable, long j) {
        super(0);
        this.this$0 = bVar;
        this.$runnable = runnable;
        this.$delayMillis = j;
    }

    public final Object invoke() {
        return new Handler(Looper.getMainLooper(), new C14669a(this));
    }
}
