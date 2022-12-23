package p484ff;

import com.google.firebase.messaging.FirebaseMessaging;
import p885we.C20291a;
import p885we.C20292b;

/* renamed from: ff.n */
public final /* synthetic */ class C16985n implements C20292b {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging.C14470a f44090a;

    public /* synthetic */ C16985n(FirebaseMessaging.C14470a aVar) {
        this.f44090a = aVar;
    }

    /* renamed from: a */
    public final void mo49618a(C20291a aVar) {
        boolean z;
        FirebaseMessaging.C14470a aVar2 = this.f44090a;
        synchronized (aVar2) {
            aVar2.mo43431a();
            Boolean bool = aVar2.f36583d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.firebaseApp.mo51541j();
            }
        }
        if (z) {
            FirebaseMessaging.this.startSyncIfNecessary();
        }
    }
}
