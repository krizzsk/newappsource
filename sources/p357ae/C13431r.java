package p357ae;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p986firebaseauthapi.zzza;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p382be.C13616x;

@VisibleForTesting
/* renamed from: ae.r */
public final class C13431r implements C13616x {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f33287a;

    public C13431r(FirebaseAuth firebaseAuth) {
        this.f33287a = firebaseAuth;
    }

    /* renamed from: a */
    public final void mo40304a(zzza zzza, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(zzza);
        Preconditions.checkNotNull(firebaseUser);
        firebaseUser.mo43288r2(zzza);
        FirebaseAuth firebaseAuth = this.f33287a;
        firebaseAuth.getClass();
        FirebaseAuth.m35915d(firebaseAuth, firebaseUser, zzza, true, false);
    }
}
