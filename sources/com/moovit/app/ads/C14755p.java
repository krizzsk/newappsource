package com.moovit.app.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import f00.C16919g;

/* renamed from: com.moovit.app.ads.p */
public final /* synthetic */ class C14755p implements OnCompleteListener {
    public final void onComplete(Task task) {
        C16919g.C16920a aVar = MobileAdsFenceReceiver.f37450a;
        task.getException();
        task.isSuccessful();
    }
}
