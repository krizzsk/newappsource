package p357ae;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p986firebaseauthapi.zzza;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p382be.C13612t;

/* renamed from: ae.q */
public final class C13430q implements C13612t {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f33286a;

    public C13430q(FirebaseAuth firebaseAuth) {
        this.f33286a = firebaseAuth;
    }

    /* renamed from: a */
    public final void mo40304a(zzza zzza, FirebaseUser firebaseUser) {
        FirebaseAuth.m35915d(this.f33286a, firebaseUser, zzza, true, true);
    }

    public final void zzb(Status status) {
        int statusCode = status.getStatusCode();
        if (statusCode == 17011 || statusCode == 17021 || statusCode == 17005) {
            this.f33286a.mo43271b();
        }
    }
}
