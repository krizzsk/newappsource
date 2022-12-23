package p824tp;

import android.content.Context;
import android.content.SharedPreferences;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import f00.C16919g;
import java.lang.Thread;
import p977zz.C20967t0;

/* renamed from: tp.k */
public final class C19733k extends C20967t0 {

    /* renamed from: c */
    public static final C16919g.C16920a f50178c = new C16919g.C16920a("is_last_app_load_crash", false);

    /* renamed from: b */
    public final Context f50179b;

    public C19733k(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(uncaughtExceptionHandler);
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f50179b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo50094a(Throwable th) {
        SharedPreferences.Editor edit = this.f50179b.getSharedPreferences("uncaught_exception_handler", 0).edit();
        f50178c.mo19760c(edit, Boolean.TRUE);
        edit.commit();
    }
}
