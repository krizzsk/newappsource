package p358af;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.C14462a;
import com.google.firebase.installations.local.PersistedInstallation;

/* renamed from: af.e */
public final class C13438e implements C13442i {

    /* renamed from: a */
    public final C13443j f33293a;

    /* renamed from: b */
    public final TaskCompletionSource<C13440g> f33294b;

    public C13438e(C13443j jVar, TaskCompletionSource<C13440g> taskCompletionSource) {
        this.f33293a = jVar;
        this.f33294b = taskCompletionSource;
    }

    /* renamed from: a */
    public final boolean mo40317a(C14462a aVar) {
        boolean z;
        String str;
        if (aVar.mo43382f() == PersistedInstallation.RegistrationStatus.REGISTERED) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f33293a.mo40319a(aVar)) {
            return false;
        }
        TaskCompletionSource<C13440g> taskCompletionSource = this.f33294b;
        String str2 = aVar.f36551d;
        if (str2 != null) {
            Long valueOf = Long.valueOf(aVar.f36553f);
            Long valueOf2 = Long.valueOf(aVar.f36554g);
            if (valueOf == null) {
                str = " tokenExpirationTimestamp";
            } else {
                str = "";
            }
            if (valueOf2 == null) {
                str = C25541a.m63881k(str, " tokenCreationTimestamp");
            }
            if (str.isEmpty()) {
                taskCompletionSource.setResult(new C13434a(str2, valueOf.longValue(), valueOf2.longValue()));
                return true;
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
        throw new NullPointerException("Null token");
    }

    /* renamed from: b */
    public final boolean mo40318b(Exception exc) {
        this.f33294b.trySetException(exc);
        return true;
    }
}
