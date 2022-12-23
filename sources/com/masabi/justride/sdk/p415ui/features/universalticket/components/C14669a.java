package com.masabi.justride.sdk.p415ui.features.universalticket.components;

import android.os.Handler;
import android.os.Message;
import com.appboy.models.InAppMessageBase;
import mf0.C24362h;

/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.components.a */
public final class C14669a implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ RepeatTaskExecutor$handler$2 f37236b;

    public C14669a(RepeatTaskExecutor$handler$2 repeatTaskExecutor$handler$2) {
        this.f37236b = repeatTaskExecutor$handler$2;
    }

    public final boolean handleMessage(Message message) {
        C24362h.m61211f(message, InAppMessageBase.MESSAGE);
        if (message.what != 0) {
            return false;
        }
        RepeatTaskExecutor$handler$2 repeatTaskExecutor$handler$2 = this.f37236b;
        if (repeatTaskExecutor$handler$2.this$0.f37238b) {
            repeatTaskExecutor$handler$2.$runnable.run();
            ((Handler) this.f37236b.this$0.f37237a.getValue()).sendEmptyMessageDelayed(0, this.f37236b.$delayMillis);
        }
        return true;
    }
}
