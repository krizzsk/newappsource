package p484ff;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C14475c;
import java.util.concurrent.Executor;
import p028ba.C1512f;
import p145k5.C5487f;

@KeepForSdk
/* renamed from: ff.k */
public final class C16981k {

    /* renamed from: c */
    public static final Object f44081c = new Object();

    /* renamed from: d */
    public static C14475c f44082d;

    /* renamed from: a */
    public final Context f44083a;

    /* renamed from: b */
    public final C16979j f44084b = new C16979j();

    public C16981k(Context context) {
        this.f44083a = context;
    }

    /* renamed from: a */
    public static Task<Integer> m42820a(Context context, Intent intent) {
        C14475c cVar;
        C14475c cVar2;
        if (C16958a0.m42795a().mo49582c(context)) {
            synchronized (f44081c) {
                if (f44082d == null) {
                    f44082d = new C14475c(context);
                }
                cVar2 = f44082d;
            }
            synchronized (C16980j0.f44079b) {
                if (C16980j0.f44080c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    C16980j0.f44080c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    C16980j0.f44080c.acquire(C16980j0.f44078a);
                }
                cVar2.mo43440b(intent).addOnCompleteListener((Executor) new C16979j(), new C16978i0(intent, 0));
            }
        } else {
            synchronized (f44081c) {
                if (f44082d == null) {
                    f44082d = new C14475c(context);
                }
                cVar = f44082d;
            }
            cVar.mo43440b(intent);
        }
        return Tasks.forResult(-1);
    }

    @KeepForSdk
    /* renamed from: b */
    public final Task<Integer> mo49610b(Intent intent) {
        boolean z;
        boolean z2;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f44083a;
        if (!PlatformVersion.isAtLeastO() || context.getApplicationInfo().targetSdkVersion < 26) {
            z = false;
        } else {
            z = true;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || z2) {
            return Tasks.call(this.f44084b, new C5487f(1, context, intent)).continueWithTask(this.f44084b, new C1512f(0, context, intent));
        }
        return m42820a(context, intent);
    }
}
