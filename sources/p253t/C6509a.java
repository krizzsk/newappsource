package p253t;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: t.a */
public final class C6509a extends C6520j {

    /* renamed from: b */
    public final /* synthetic */ Context f20303b;

    public C6509a(Context context) {
        this.f20303b = context;
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, C6516g gVar) {
        gVar.getClass();
        try {
            gVar.f20315a.mo7q(0);
        } catch (RemoteException unused) {
        }
        this.f20303b.unbindService(this);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
