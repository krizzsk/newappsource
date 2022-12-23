package p357ae;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p986firebaseauthapi.zzza;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p382be.C13596e0;
import p382be.C13612t;

@VisibleForTesting
/* renamed from: ae.s */
public final class C13432s implements C13612t {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f33288a;

    public C13432s(C13596e0 e0Var) {
        this.f33288a = e0Var;
    }

    /* renamed from: a */
    public final void mo40304a(zzza zzza, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(zzza);
        Preconditions.checkNotNull(firebaseUser);
        firebaseUser.mo43288r2(zzza);
        FirebaseAuth.m35915d(this.f33288a, firebaseUser, zzza, true, true);
    }

    public final void zzb(Status status) {
        if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005 || status.getStatusCode() == 17091) {
            this.f33288a.mo43271b();
        }
    }
}
