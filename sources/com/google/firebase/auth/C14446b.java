package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* renamed from: com.google.firebase.auth.b */
public final class C14446b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FirebaseAuth f36418b;

    public C14446b(FirebaseAuth firebaseAuth) {
        this.f36418b = firebaseAuth;
    }

    public final void run() {
        Iterator it = this.f36418b.f36384d.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.C14443a) it.next()).mo43273a();
        }
    }
}
