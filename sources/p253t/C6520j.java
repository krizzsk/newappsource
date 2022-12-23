package p253t;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p000a.C0003b;

/* renamed from: t.j */
public abstract class C6520j implements ServiceConnection {
    private Context mApplicationContext;

    /* renamed from: t.j$a */
    public class C6521a extends C6516g {
        public C6521a(C0003b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C6516g gVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0003b bVar;
        if (this.mApplicationContext != null) {
            int i = C0003b.C0004a.f2b;
            if (iBinder == null) {
                bVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C0003b)) {
                    bVar = new C0003b.C0004a.C0005a(iBinder);
                } else {
                    bVar = (C0003b) queryLocalInterface;
                }
            }
            onCustomTabsServiceConnected(componentName, new C6521a(bVar, componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
