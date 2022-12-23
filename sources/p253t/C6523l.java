package p253t;

import android.app.PendingIntent;
import android.os.IBinder;
import p000a.C0000a;

/* renamed from: t.l */
public final class C6523l {

    /* renamed from: a */
    public final C0000a f20327a;

    /* renamed from: b */
    public final PendingIntent f20328b;

    public C6523l(C0000a aVar, PendingIntent pendingIntent) {
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f20327a = aVar;
        this.f20328b = pendingIntent;
    }

    /* renamed from: a */
    public final IBinder mo22626a() {
        C0000a aVar = this.f20327a;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof C6523l)) {
            return false;
        }
        C6523l lVar = (C6523l) obj;
        PendingIntent pendingIntent = lVar.f20328b;
        PendingIntent pendingIntent2 = this.f20328b;
        boolean z2 = true;
        if (pendingIntent2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (pendingIntent != null) {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        return mo22626a().equals(lVar.mo22626a());
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f20328b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return mo22626a().hashCode();
    }
}
