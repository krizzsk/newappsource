package com.moovit.app.carpool;

import android.os.Bundle;
import android.widget.TextView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;
import p259t5.C6592b;
import p472er.C16865g;
import p543hq.C17474b;

public class CarpoolIntroActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f37626U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.carpool_intro_activity);
        findViewById(R.id.button).setOnClickListener(new C6592b(this, 5));
        C16865g.m42682e(this, (TextView) findViewById(R.id.eula_link));
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        ServerId serverId = (ServerId) getIntent().getParcelableExtra("ride_id");
        if (serverId != null) {
            m1.mo49937e(AnalyticsAttributeKey.CARPOOL_RIDE_ID, serverId);
        }
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("CARPOOL_SUPPORT_VALIDATOR");
        return s1;
    }
}
