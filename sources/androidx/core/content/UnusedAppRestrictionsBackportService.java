package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p079f1.C4645c;

public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: b */
    public C0773a f3341b = new C0773a();

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$a */
    public class C0773a extends C4645c {
        public C0773a() {
        }
    }

    /* renamed from: a */
    public abstract void mo3425a();

    public final IBinder onBind(Intent intent) {
        return this.f3341b;
    }
}
