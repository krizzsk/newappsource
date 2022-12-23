package p735pt;

import com.google.android.gms.tasks.OnFailureListener;
import l30.C5577i;
import p435de.C16596f;
import p832tx.C19791a;

/* renamed from: pt.e */
public final /* synthetic */ class C18984e implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f48330b;

    public /* synthetic */ C18984e(int i) {
        this.f48330b = i;
    }

    public final void onFailure(Exception exc) {
        switch (this.f48330b) {
            case 0:
                C16596f a = C16596f.m42113a();
                a.mo49363b("Failed start view direction index: " + exc);
                return;
            case 1:
                int i = C19791a.f50312p;
                exc.getMessage();
                return;
            default:
                C5577i.m13789g(exc);
                return;
        }
    }
}
