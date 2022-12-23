package p382be;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;

/* renamed from: be.v */
public final class C13614v {

    /* renamed from: b */
    public static final C13614v f33582b = new C13614v();

    /* renamed from: a */
    public final C13607o f33583a;

    public C13614v() {
        C13607o oVar = C13607o.f33574b;
        if (C13603k.f33570a == null) {
            C13603k.f33570a = new C13603k();
        }
        this.f33583a = oVar;
    }

    /* renamed from: b */
    public static void m34025b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.getStatusCode());
        edit.putString("statusMessage", status.getStatusMessage());
        edit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    /* renamed from: a */
    public final void mo40508a(Context context) {
        this.f33583a.getClass();
        Preconditions.checkNotNull(context);
        C13607o.m34022a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }
}
