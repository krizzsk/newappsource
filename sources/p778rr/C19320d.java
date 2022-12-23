package p778rr;

import android.view.View;
import android.widget.RatingBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.tranzmate.R;
import p543hq.C17474b;
import p778rr.C19321e;

/* renamed from: rr.d */
public final class C19320d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C19321e f49167b;

    public C19320d(C19321e eVar) {
        this.f49167b = eVar;
    }

    public final void onClick(View view) {
        C19321e eVar = this.f49167b;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_driver_rate_clicked");
        eVar.mo22564R1(aVar.mo49933a());
        C19321e eVar2 = this.f49167b;
        float rating = ((RatingBar) eVar2.getView().findViewById(R.id.rating)).getRating();
        Fragment targetFragment = eVar2.getTargetFragment();
        if (targetFragment instanceof C19321e.C19322a) {
            ((C19321e.C19322a) targetFragment).mo44901a(rating);
        }
        FragmentActivity activity = eVar2.getActivity();
        if (activity instanceof C19321e.C19322a) {
            ((C19321e.C19322a) activity).mo44901a(rating);
        }
        this.f49167b.dismiss();
    }
}
