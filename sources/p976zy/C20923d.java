package p976zy;

import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.auth.FirebaseAuthUtils;
import com.moovit.ticketing.ticket.C7762g;
import l30.C5577i;
import m80.C12887v;
import p435de.C16596f;

/* renamed from: zy.d */
public final /* synthetic */ class C20923d implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f52673b;

    public /* synthetic */ C20923d(int i) {
        this.f52673b = i;
    }

    public final void onFailure(Exception exc) {
        switch (this.f52673b) {
            case 0:
                C16596f.m42113a().mo49364c(new FirebaseAuthUtils.FirebaseAuthException("Unable to retrieve auth token.", exc));
                return;
            case 1:
                C5577i iVar = C5577i.f18275d;
                C16596f.m42113a().mo49364c(exc);
                C5577i.m13789g(exc);
                return;
            case 2:
                C12887v.m32672j(exc);
                return;
            case 3:
                C12887v.m32672j(exc);
                return;
            default:
                int i = C7762g.f23551y;
                return;
        }
    }
}
