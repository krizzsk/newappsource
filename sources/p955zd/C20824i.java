package p955zd;

import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: zd.i */
public final /* synthetic */ class C20824i implements OnFailureListener {

    /* renamed from: b */
    public final C20827l f52545b;

    public C20824i(C20827l lVar) {
        this.f52545b = lVar;
    }

    public final void onFailure(Exception exc) {
        C20827l lVar;
        C20827l lVar2 = this.f52545b;
        synchronized (lVar2.f52551c.f52554d) {
            if (lVar2.f52551c.f52554d.peek() == lVar2) {
                lVar2.f52551c.f52554d.remove();
                C20828m mVar = lVar2.f52551c;
                mVar.f52555e = 0;
                lVar = (C20827l) mVar.f52554d.peek();
            } else {
                lVar = null;
            }
        }
        lVar2.f52550b.trySetException(exc);
        if (lVar != null) {
            lVar.mo52957a();
        }
    }
}
