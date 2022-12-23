package p591js;

import android.view.View;
import android.widget.ScrollView;
import android.widget.ViewAnimator;
import androidx.activity.C0199g;

/* renamed from: js.c */
public final /* synthetic */ class C17922c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C17923d f45979b;

    /* renamed from: c */
    public final /* synthetic */ ScrollView f45980c;

    /* renamed from: d */
    public final /* synthetic */ ViewAnimator f45981d;

    /* renamed from: e */
    public final /* synthetic */ ViewAnimator f45982e;

    public /* synthetic */ C17922c(C17923d dVar, ScrollView scrollView, ViewAnimator viewAnimator, ViewAnimator viewAnimator2) {
        this.f45979b = dVar;
        this.f45980c = scrollView;
        this.f45981d = viewAnimator;
        this.f45982e = viewAnimator2;
    }

    public final void onClick(View view) {
        C17923d dVar = this.f45979b;
        ScrollView scrollView = this.f45980c;
        ViewAnimator viewAnimator = this.f45981d;
        ViewAnimator viewAnimator2 = this.f45982e;
        int i = C17923d.f45983i;
        dVar.getClass();
        scrollView.setVerticalScrollBarEnabled(false);
        viewAnimator.showNext();
        viewAnimator2.showNext();
        view.postDelayed(new C0199g(dVar, 11), 3000);
        dVar.mo50466S1("finished");
    }
}
