package p110h8;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import mf0.C24362h;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: h8.a */
public final class C5137a implements ServiceConnection {
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C24362h.m61211f(componentName, "name");
        C24362h.m61211f(iBinder, "service");
        C5139c cVar = C5139c.f17148a;
        C5147f fVar = C5147f.f17185a;
        Context a = C0115o.m210a();
        Class<C5147f> cls = C5147f.class;
        Object obj = null;
        if (!C6606a.m15601b(cls)) {
            try {
                obj = C5147f.f17185a.mo20874h(a, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", (Object) null, new Object[]{iBinder});
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
        C5139c.f17155h = obj;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C24362h.m61211f(componentName, "name");
    }
}
