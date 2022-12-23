package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import p382be.C13587a;
import p460ef.C16818b;

/* renamed from: com.google.firebase.auth.a */
public final class C14445a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FirebaseAuth f36417b;

    public C14445a(FirebaseAuth firebaseAuth, C16818b bVar) {
        this.f36417b = firebaseAuth;
    }

    public final void run() {
        Iterator it = this.f36417b.f36383c.iterator();
        while (it.hasNext()) {
            ((C13587a) it.next()).mo40485a();
        }
        Iterator it2 = this.f36417b.f36382b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.C14444b) it2.next()).mo43274a();
        }
    }
}
