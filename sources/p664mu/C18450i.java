package p664mu;

import android.view.View;
import androidx.fragment.app.Fragment;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.ticketing.activation.C7632a;

/* renamed from: mu.i */
public final /* synthetic */ class C18450i implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f47033b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f47034c;

    /* renamed from: d */
    public final /* synthetic */ Object f47035d;

    public /* synthetic */ C18450i(Fragment fragment, Object obj, int i) {
        this.f47033b = i;
        this.f47034c = fragment;
        this.f47035d = obj;
    }

    public final void onFailure(Exception exc) {
        switch (this.f47033b) {
            case 0:
                int i = C18451j.f47036q;
                ((C18451j) this.f47034c).mo50894m2((Trace) this.f47035d);
                return;
            default:
                C7632a aVar = (C7632a) this.f47034c;
                int i2 = C7632a.f23237h;
                aVar.getClass();
                C7632a.m17440T1((View) this.f47035d, false);
                aVar.f40792c.mo44530n2(C13751d.m34341b(aVar.requireContext(), (String) null, exc));
                aVar.dismissAllowingStateLoss();
                return;
        }
    }
}
