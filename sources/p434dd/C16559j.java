package p434dd;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: dd.j */
public final class C16559j implements ServiceConnection {

    /* renamed from: b */
    public final /* synthetic */ C16561k f43200b;

    public /* synthetic */ C16559j(C16561k kVar) {
        this.f43200b = kVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f43200b.f43205b.mo977d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C16561k kVar = this.f43200b;
        kVar.mo49335a().post(new C16555h(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f43200b.f43205b.mo977d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C16561k kVar = this.f43200b;
        kVar.mo49335a().post(new C16557i(this));
    }
}
