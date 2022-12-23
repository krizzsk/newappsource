package p434dd;

import com.google.android.play.core.internal.zzat;
import java.util.Iterator;
import p554id.C17573l;

/* renamed from: dd.d */
public final class C16547d extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ C16541a f43182c;

    /* renamed from: d */
    public final /* synthetic */ C16561k f43183d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16547d(C16561k kVar, C17573l lVar, C16541a aVar) {
        super(lVar);
        this.f43183d = kVar;
        this.f43182c = aVar;
    }

    /* renamed from: a */
    public final void mo42765a() {
        C16561k kVar = this.f43183d;
        C16541a aVar = this.f43182c;
        if (kVar.f43217n == null && !kVar.f43210g) {
            kVar.f43205b.mo977d("Initiate binding to the service.", new Object[0]);
            kVar.f43207d.add(aVar);
            C16559j jVar = new C16559j(kVar);
            kVar.f43216m = jVar;
            kVar.f43210g = true;
            if (!kVar.f43204a.bindService(kVar.f43211h, jVar, 1)) {
                kVar.f43205b.mo977d("Failed to bind to the service.", new Object[0]);
                kVar.f43210g = false;
                Iterator it = kVar.f43207d.iterator();
                while (it.hasNext()) {
                    zzat zzat = new zzat();
                    C17573l lVar = ((C16541a) it.next()).f43175b;
                    if (lVar != null) {
                        lVar.mo50024a(zzat);
                    }
                }
                kVar.f43207d.clear();
            }
        } else if (kVar.f43210g) {
            kVar.f43205b.mo977d("Waiting to bind to the service.", new Object[0]);
            kVar.f43207d.add(aVar);
        } else {
            aVar.run();
        }
    }
}
