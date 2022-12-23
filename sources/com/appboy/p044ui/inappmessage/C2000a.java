package com.appboy.p044ui.inappmessage;

import com.appboy.models.IInAppMessage;
import com.appboy.p044ui.inappmessage.BackgroundInAppMessagePreparer;

/* renamed from: com.appboy.ui.inappmessage.a */
public final /* synthetic */ class C2000a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ IInAppMessage f6849b;

    public /* synthetic */ C2000a(IInAppMessage iInAppMessage) {
        this.f6849b = iInAppMessage;
    }

    public final void run() {
        BackgroundInAppMessagePreparer.BackgroundPreparationRunnable.lambda$displayPreparedInAppMessage$0(this.f6849b);
    }
}
