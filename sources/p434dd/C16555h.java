package p434dd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: dd.h */
public final class C16555h extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ IBinder f43192c;

    /* renamed from: d */
    public final /* synthetic */ C16559j f43193d;

    public C16555h(C16559j jVar, IBinder iBinder) {
        this.f43193d = jVar;
        this.f43192c = iBinder;
    }

    /* renamed from: a */
    public final void mo42765a() {
        C16561k kVar = this.f43193d.f43200b;
        kVar.f43217n = (IInterface) kVar.f43212i.zza(this.f43192c);
        C16561k kVar2 = this.f43193d.f43200b;
        kVar2.f43205b.mo977d("linkToDeath", new Object[0]);
        try {
            kVar2.f43217n.asBinder().linkToDeath(kVar2.f43214k, 0);
        } catch (RemoteException e) {
            kVar2.f43205b.mo976c("linkToDeath failed", e, new Object[0]);
        }
        C16561k kVar3 = this.f43193d.f43200b;
        kVar3.f43210g = false;
        Iterator it = kVar3.f43207d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f43193d.f43200b.f43207d.clear();
    }
}
