package p244s3;

import com.google.android.gms.tasks.OnFailureListener;
import l30.C5577i;
import m80.C12887v;
import p030bo.app.C1637m4;

/* renamed from: s3.p */
public final /* synthetic */ class C6441p implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f20136b;

    public /* synthetic */ C6441p(int i) {
        this.f20136b = i;
    }

    public final void onFailure(Exception exc) {
        switch (this.f20136b) {
            case 0:
                C1637m4.m4492b(exc);
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
