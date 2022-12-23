package com.moovit.app.gcm.popup.rate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import java.util.Set;
import p259t5.C6592b;
import p471eq.C16850a;

/* renamed from: com.moovit.app.gcm.popup.rate.b */
public class C14885b extends C14884a {

    /* renamed from: i */
    public static final String f38035i = C14885b.class.getName();

    /* renamed from: h */
    public RateUsCompletePresentationType f38036h;

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return C16530d.m42016i(2, "USER_ACCOUNT", "TRIP_PLANNER_CONFIGURATION");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2131952804);
        this.f38036h = (RateUsCompletePresentationType) mo46752K1().getParcelable("presentationType");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rate_us_complete_dialog_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        AlertMessageView alertMessageView = (AlertMessageView) view;
        alertMessageView.setTitle(this.f38036h.titleResId);
        alertMessageView.setSubtitle(this.f38036h.subtitleResId);
        int actionText = this.f38036h.getActionText();
        if (actionText == 0) {
            i = R.string.close;
        } else {
            i = actionText;
        }
        alertMessageView.setPositiveButton(i);
        alertMessageView.setPositiveButtonClickListener(new C16850a(this, 5));
        if (actionText != 0) {
            alertMessageView.setNegativeButton((int) R.string.not_now_button);
            alertMessageView.setNegativeButtonClickListener(new C6592b(this, 8));
        }
    }
}
