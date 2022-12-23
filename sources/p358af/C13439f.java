package p358af;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.C14462a;
import com.google.firebase.installations.local.PersistedInstallation;

/* renamed from: af.f */
public final class C13439f implements C13442i {

    /* renamed from: a */
    public final TaskCompletionSource<String> f33295a;

    public C13439f(TaskCompletionSource<String> taskCompletionSource) {
        this.f33295a = taskCompletionSource;
    }

    /* renamed from: a */
    public final boolean mo40317a(C14462a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (aVar.mo43382f() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (aVar.mo43382f() == PersistedInstallation.RegistrationStatus.REGISTERED) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (aVar.mo43382f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    return false;
                }
            }
        }
        this.f33295a.trySetResult(aVar.f36549b);
        return true;
    }

    /* renamed from: b */
    public final boolean mo40318b(Exception exc) {
        return false;
    }
}
