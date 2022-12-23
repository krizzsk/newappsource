package m80;

import android.content.Intent;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.ticketing.validation.receipt.offline.TicketReceiptSyncManager;
import p130j2.C5367a;
import q80.C13023l;

/* renamed from: m80.m */
public final /* synthetic */ class C12878m implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f31878b;

    /* renamed from: c */
    public final /* synthetic */ C12887v f31879c;

    public /* synthetic */ C12878m(C12887v vVar, int i) {
        this.f31878b = i;
        this.f31879c = vVar;
    }

    public final void onSuccess(Object obj) {
        switch (this.f31878b) {
            case 0:
                Void voidR = (Void) obj;
                C5367a.m13473a(this.f31879c.f31895a).mo21147c(new Intent("com.moovit.ticketing.action.updated"));
                return;
            default:
                C12887v vVar = this.f31879c;
                vVar.getClass();
                if (((C13023l) obj).f32226m) {
                    TicketReceiptSyncManager.m17739a(vVar.f31895a);
                    return;
                }
                return;
        }
    }
}
