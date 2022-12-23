package p976zy;

import ce0.C21100e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.auth.FirebaseAuthUtils;
import com.moovit.util.time.C7925b;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p357ae.C13415b;
import p977zz.C20976y;

/* renamed from: zy.c */
public final /* synthetic */ class C20922c implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ boolean f52671b;

    /* renamed from: c */
    public final /* synthetic */ int f52672c;

    public /* synthetic */ C20922c(boolean z, int i) {
        this.f52671b = z;
        this.f52672c = i;
    }

    public final Object then(Task task) {
        C13415b bVar;
        long j;
        boolean z;
        boolean z2 = this.f52671b;
        int i = this.f52672c;
        String str = null;
        if (task.isSuccessful()) {
            bVar = (C13415b) task.getResult();
        } else {
            bVar = null;
        }
        if (bVar != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            Integer num = (Integer) bVar.f33285b.get("exp");
            long j2 = 0;
            if (num == null) {
                j = 0;
            } else {
                j = num.longValue();
            }
            long j3 = j - FirebaseAuthUtils.f40780a;
            if (j3 > seconds) {
                z = true;
            } else {
                z = false;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C7925b.m18013a(timeUnit.toMillis(seconds));
            Integer num2 = (Integer) bVar.f33285b.get("iat");
            if (num2 != null) {
                j2 = num2.longValue();
            }
            C7925b.m18013a(timeUnit.toMillis(j2));
            C7925b.m18013a(timeUnit.toMillis(j3));
            if (z) {
                return Tasks.forResult(bVar.f33284a);
            }
        }
        if (!z2) {
            return FirebaseAuthUtils.m40012b(i, true);
        }
        if (((long) i) < 3) {
            Random random = C20976y.f52734b;
            if (i > 0) {
                C21100e.m49355o();
                try {
                    Thread.sleep((long) Math.round((float) (TimeUnit.SECONDS.toMillis(Math.round(Math.pow(2.0d, (double) i))) + ((long) C20976y.f52734b.nextInt(1001)))));
                } catch (Throwable unused) {
                }
            }
            return FirebaseAuthUtils.m40012b(i + 1, true);
        }
        if (bVar != null) {
            str = bVar.f33284a;
        }
        return Tasks.forResult(str);
    }
}
