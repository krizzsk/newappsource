package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import com.google.firebase.messaging.C14475c;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.concurrent.Executor;
import p484ff.C16979j;
import p484ff.C16982k0;

/* renamed from: com.google.firebase.messaging.b */
public final class C14473b extends Binder {

    /* renamed from: b */
    public final C14474a f36593b;

    /* renamed from: com.google.firebase.messaging.b$a */
    public interface C14474a {
    }

    public C14473b(EnhancedIntentService.C14469a aVar) {
        this.f36593b = aVar;
    }

    /* renamed from: a */
    public final void mo43438a(C14475c.C14476a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            C14474a aVar2 = this.f36593b;
            EnhancedIntentService.this.processIntent(aVar.f36600a).addOnCompleteListener((Executor) new C16979j(), new C16982k0(aVar, 0));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
