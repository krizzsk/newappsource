package com.moovit.app.stopdetail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.CongestionLevel;
import com.tranzmate.R;
import p453dw.C16745s;
import p471eq.C16850a;
import p543hq.C17474b;

/* renamed from: com.moovit.app.stopdetail.f */
public class C15356f extends C15676b<MoovitAppActivity> {

    /* renamed from: h */
    public static final String f39753h = C15356f.class.getSimpleName();

    /* renamed from: com.moovit.app.stopdetail.f$a */
    public interface C15357a {
        /* renamed from: A */
        void mo45899A(ServerId serverId, CongestionLevel congestionLevel);
    }

    public C15356f() {
        super(MoovitAppActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.user_report_dialog_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "user_crowdedness_report_dialog_impression");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.action_view);
        findViewById.setOnClickListener(new C16850a(this, 21));
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.crowdedness);
        boolean z = false;
        radioGroup.setOnCheckedChangeListener(new C16745s(findViewById, 0));
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        findViewById.setTag(Integer.valueOf(checkedRadioButtonId));
        if (checkedRadioButtonId != -1) {
            z = true;
        }
        findViewById.setEnabled(z);
    }
}
