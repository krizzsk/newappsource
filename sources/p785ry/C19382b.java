package p785ry;

import com.google.android.gms.tasks.OnFailureListener;
import l30.C5577i;
import m80.C12887v;

/* renamed from: ry.b */
public final /* synthetic */ class C19382b implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f49309b;

    public /* synthetic */ C19382b(int i) {
        this.f49309b = i;
    }

    public final void onFailure(Exception exc) {
        switch (this.f49309b) {
            case 0:
                return;
            case 1:
                C5577i.m13789g(exc);
                return;
            default:
                C12887v.m32672j(exc);
                return;
        }
    }
}
