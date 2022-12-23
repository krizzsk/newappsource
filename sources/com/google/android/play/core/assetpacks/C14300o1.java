package com.google.android.play.core.assetpacks;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p382be.C13599g;
import p382be.C13600h;
import p743qd.C19107d;

/* renamed from: com.google.android.play.core.assetpacks.o1 */
public final /* synthetic */ class C14300o1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f35968b = 1;

    /* renamed from: c */
    public final Object f35969c;

    /* renamed from: d */
    public final /* synthetic */ Object f35970d;

    public /* synthetic */ C14300o1(C14304p1 p1Var, Intent intent) {
        this.f35969c = p1Var;
        this.f35970d = intent;
    }

    public final void run() {
        switch (this.f35968b) {
            case 0:
                C14304p1 p1Var = (C14304p1) this.f35969c;
                p1Var.f35988b.mo42763a(p1Var.f35989c, (Intent) this.f35970d);
                return;
            default:
                FirebaseAuth instance = FirebaseAuth.getInstance(C19107d.m46266e((String) this.f35969c));
                if (instance.f36386f != null) {
                    Task a = instance.mo43270a(true);
                    C13600h.f33565e.mo65858v("Token refreshing started", new Object[0]);
                    a.addOnFailureListener(new C13599g(this));
                    return;
                }
                return;
        }
    }

    public C14300o1(C13600h hVar, String str) {
        this.f35970d = hVar;
        this.f35969c = Preconditions.checkNotEmpty(str);
    }
}
