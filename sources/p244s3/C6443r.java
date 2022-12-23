package p244s3;

import com.google.android.gms.tasks.OnFailureListener;
import l30.C5577i;
import m80.C12887v;
import p030bo.app.C1637m4;

/* renamed from: s3.r */
public final /* synthetic */ class C6443r implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f20140b;

    public /* synthetic */ C6443r(int i) {
        this.f20140b = i;
    }

    public final void onFailure(Exception exc) {
        switch (this.f20140b) {
            case 0:
                C1637m4.m4487a(exc);
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
