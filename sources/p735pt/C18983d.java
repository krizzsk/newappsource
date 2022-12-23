package p735pt;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.ThreadPoolExecutor;
import l30.C5577i;
import m80.C12887v;
import p435de.C16596f;

/* renamed from: pt.d */
public final /* synthetic */ class C18983d implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f48329b;

    public /* synthetic */ C18983d(int i) {
        this.f48329b = i;
    }

    public final void onFailure(Exception exc) {
        switch (this.f48329b) {
            case 0:
                C16596f a = C16596f.m42113a();
                a.mo49363b("Failed end view direction index: " + exc);
                return;
            case 1:
                C5577i.m13789g(exc);
                return;
            default:
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                C16596f.m42113a().mo49364c(exc);
                C12887v.m32672j(exc);
                return;
        }
    }
}
