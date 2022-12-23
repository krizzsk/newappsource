package p627lg;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import p404ce.C13796k;

@KeepForSdk
/* renamed from: lg.g */
public final class C18208g {

    /* renamed from: b */
    public static final Object f46464b = new Object();

    /* renamed from: c */
    public static C18208g f46465c;

    /* renamed from: a */
    public C13796k f46466a;

    @KeepForSdk
    /* renamed from: c */
    public static C18208g m44941c() {
        boolean z;
        C18208g gVar;
        synchronized (f46464b) {
            if (f46465c != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MlKitContext has not been initialized");
            gVar = (C18208g) Preconditions.checkNotNull(f46465c);
        }
        return gVar;
    }

    @KeepForSdk
    /* renamed from: a */
    public final <T> T mo50622a(Class<T> cls) {
        boolean z;
        if (f46465c == this) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f46466a);
        return this.f46466a.mo314b(cls);
    }

    @KeepForSdk
    /* renamed from: b */
    public final Context mo50623b() {
        return (Context) mo50622a(Context.class);
    }
}
