package p277ub;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import p277ub.C6780f;
import p277ub.C6786k;

/* renamed from: ub.i */
public final /* synthetic */ class C6784i implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ C6786k f20986b;

    public /* synthetic */ C6784i(C6786k kVar) {
        this.f20986b = kVar;
    }

    public final boolean handleMessage(Message message) {
        C6786k kVar = this.f20986b;
        kVar.getClass();
        int i = message.what;
        if (i == 0) {
            Iterator<C6786k.C6789c<T>> it = kVar.f20993d.iterator();
            while (it.hasNext()) {
                C6786k.C6789c next = it.next();
                C6786k.C6788b<T> bVar = kVar.f20992c;
                if (!next.f21000d && next.f20999c) {
                    C6780f b = next.f20998b.mo22954b();
                    next.f20998b = new C6780f.C6781a();
                    next.f20999c = false;
                    bVar.mo6655a(next.f20997a, b);
                }
                if (((C6809w) kVar.f20991b).f21063a.hasMessages(0)) {
                    break;
                }
            }
        } else if (i == 1) {
            kVar.mo22959b(message.arg1, (C6786k.C6787a) message.obj);
            kVar.mo22958a();
            kVar.mo22960c();
        }
        return true;
    }
}
