package p484ff;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* renamed from: ff.e0 */
public final class C16969e0 {

    /* renamed from: c */
    public static WeakReference<C16969e0> f44041c;

    /* renamed from: a */
    public C16960b0 f44042a;

    /* renamed from: b */
    public final Executor f44043b;

    public C16969e0(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.f44043b = scheduledExecutorService;
    }

    /* renamed from: a */
    public final synchronized C16966d0 mo49596a() {
        String peek;
        C16966d0 d0Var;
        C16960b0 b0Var = this.f44042a;
        synchronized (b0Var.f44024d) {
            peek = b0Var.f44024d.peek();
        }
        Pattern pattern = C16966d0.f44034d;
        d0Var = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                d0Var = new C16966d0(split[0], split[1]);
            }
        }
        return d0Var;
    }
}
