package l30;

import com.google.android.gms.tasks.OnFailureListener;
import m80.C12887v;
import p435de.C16596f;

/* renamed from: l30.g */
public final /* synthetic */ class C5575g implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f18271b;

    public /* synthetic */ C5575g(int i) {
        this.f18271b = i;
    }

    public final void onFailure(Exception exc) {
        switch (this.f18271b) {
            case 0:
                C16596f.m42113a().mo49364c(exc);
                C5577i.m13789g(exc);
                return;
            default:
                C12887v.m32672j(exc);
                return;
        }
    }
}
