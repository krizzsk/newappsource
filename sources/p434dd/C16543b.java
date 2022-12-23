package p434dd;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import p554id.C17573l;

/* renamed from: dd.b */
public final /* synthetic */ class C16543b implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ C16561k f43176a;

    public /* synthetic */ C16543b(C16561k kVar) {
        this.f43176a = kVar;
    }

    public final void binderDied() {
        C16561k kVar = this.f43176a;
        kVar.f43205b.mo977d("reportBinderDeath", new Object[0]);
        C16551f fVar = (C16551f) kVar.f43213j.get();
        if (fVar != null) {
            kVar.f43205b.mo977d("calling onBinderDied", new Object[0]);
            fVar.zza();
        } else {
            kVar.f43205b.mo977d("%s : Binder has died.", kVar.f43206c);
            Iterator it = kVar.f43207d.iterator();
            while (it.hasNext()) {
                RemoteException remoteException = new RemoteException(String.valueOf(kVar.f43206c).concat(" : Binder has died."));
                C17573l lVar = ((C16541a) it.next()).f43175b;
                if (lVar != null) {
                    lVar.mo50024a(remoteException);
                }
            }
            kVar.f43207d.clear();
        }
        kVar.mo49338d();
    }
}
