package ga0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19747y;

/* renamed from: ga0.f */
public class C12704f extends C15676b<MoovitActivity> {

    /* renamed from: m */
    public static final String f31376m = C12704f.class.getName();

    /* renamed from: h */
    public final C12705a f31377h = new C12705a();

    /* renamed from: i */
    public int f31378i;

    /* renamed from: j */
    public int f31379j;

    /* renamed from: k */
    public boolean f31380k;

    /* renamed from: l */
    public ProgressBar f31381l;

    /* renamed from: ga0.f$a */
    public class C12705a extends Snackbar.C14123a {
        public C12705a() {
        }

        /* renamed from: a */
        public final void mo39496a(int i, Object obj) {
            Snackbar snackbar = (Snackbar) obj;
            C12704f.this.dismissAllowingStateLoss();
            C12704f fVar = C12704f.this;
            String str = C12704f.f31376m;
            Fragment targetFragment = fVar.getTargetFragment();
            if (targetFragment instanceof C12706b) {
                ((C12706b) targetFragment).mo39497K();
            }
            FragmentActivity activity = fVar.getActivity();
            if (activity instanceof C12706b) {
                ((C12706b) activity).mo39497K();
            }
        }
    }

    /* renamed from: ga0.f$b */
    public interface C12706b {
        /* renamed from: K */
        void mo39497K();
    }

    public C12704f() {
        super(MoovitActivity.class);
        setStyle(0, C19747y.ThemeOverlay_Moovit_Dialog_FullScreen_Translucent);
        setCancelable(false);
    }

    /* renamed from: S1 */
    public static C12704f m32465S1(int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("textResId", i);
        bundle.putInt("showDuration", -1);
        bundle.putBoolean("startCompleted", z);
        C12704f fVar = new C12704f();
        fVar.setArguments(bundle);
        return fVar;
    }

    /* renamed from: T1 */
    public final void mo39495T1() {
        mo46752K1().putBoolean("startCompleted", true);
        if (isResumed()) {
            this.f31381l.setVisibility(8);
            Snackbar l = Snackbar.m35159l(this.f31381l, this.f31378i, this.f31379j);
            l.mo42224a(this.f31377h);
            l.mo42259p();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        this.f31378i = K1.getInt("textResId");
        this.f31379j = K1.getInt("showDuration");
        this.f31380k = K1.getBoolean("startCompleted");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C19742t.progress_dialog_fragment, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        if (this.f31380k) {
            mo39495T1();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C19740r.progress_bar);
        this.f31381l = progressBar;
        progressBar.setVisibility(0);
    }
}
