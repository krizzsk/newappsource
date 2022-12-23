package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p000a.C0006c;

public class PostMessageService extends Service {

    /* renamed from: b */
    public C0491a f1680b = new C0491a();

    /* renamed from: androidx.browser.customtabs.PostMessageService$a */
    public class C0491a extends C0006c {
    }

    public final IBinder onBind(Intent intent) {
        return this.f1680b;
    }
}
