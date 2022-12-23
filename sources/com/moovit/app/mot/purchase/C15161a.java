package com.moovit.app.mot.purchase;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.tranzmate.R;
import p009a8.C0112l;
import p259t5.C6592b;
import p451du.C16723t;
import p543hq.C17474b;
import p757qu.C19183f;

/* renamed from: com.moovit.app.mot.purchase.a */
public class C15161a extends C15676b<MoovitActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f39052i = 0;

    /* renamed from: h */
    public CheckBox f39053h;

    /* renamed from: com.moovit.app.mot.purchase.a$a */
    public interface C15162a {
        /* renamed from: j */
        void mo45596j(LatLonE6 latLonE6);

        /* renamed from: j0 */
        void mo45597j0();
    }

    public C15161a() {
        super(MoovitActivity.class);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        mo46753L1(C15162a.class, new C0112l(14));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mot_station_entrance_explanation_dialog, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_station_entrance_explanation_dialog_impression");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.dont_show_again);
        this.f39053h = checkBox;
        checkBox.setOnCheckedChangeListener(new C19183f(this));
        view.findViewById(R.id.primary_button).setOnClickListener(new C16723t(1, this, (LatLonE6) mo46752K1().getParcelable("userLocation")));
        view.findViewById(R.id.secondary_button).setOnClickListener(new C6592b(this, 20));
    }
}
