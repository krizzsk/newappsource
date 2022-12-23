package kc0;

import android.view.ViewGroup;
import fc0.C12675e;
import mf0.C24362h;

/* renamed from: kc0.e */
public final /* synthetic */ class C12840e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31720b;

    /* renamed from: c */
    public final /* synthetic */ C12844i f31721c;

    public /* synthetic */ C12840e(C12844i iVar, int i) {
        this.f31720b = i;
        this.f31721c = iVar;
    }

    public final void run() {
        switch (this.f31720b) {
            case 0:
                C12844i iVar = this.f31721c;
                C24362h.m61211f(iVar, "this$0");
                iVar.mo39695p();
                return;
            default:
                C12844i iVar2 = this.f31721c;
                C24362h.m61211f(iVar2, "this$0");
                C12675e eVar = iVar2.f31736A;
                if (eVar != null) {
                    eVar.setLayoutParams(iVar2.f31740E);
                }
                iVar2.addView(iVar2.f31736A);
                ViewGroup viewGroup = iVar2.f31742G;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
        }
    }
}
