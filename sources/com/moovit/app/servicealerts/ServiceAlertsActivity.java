package com.moovit.app.servicealerts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.servicealerts.ServiceAlertFragment;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;

public class ServiceAlertsActivity extends MoovitAppActivity {
    /* renamed from: y2 */
    public static Intent m39169y2(Context context, int i, ServiceAlertFragment.ServiceAlertsUiConfig serviceAlertsUiConfig) {
        Intent intent = new Intent(context, ServiceAlertsActivity.class);
        intent.putExtra("title", i);
        intent.putExtra("uiConfig", serviceAlertsUiConfig);
        return intent;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.service_alerts_activity);
        int intExtra = getIntent().getIntExtra("title", 0);
        if (intExtra != 0) {
            setTitle(intExtra);
        }
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.mo3923A("service_alerts_fragment_tag") == null) {
            int i = ServiceAlertFragment.f39556x;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("uiConfig", (ServiceAlertFragment.ServiceAlertsUiConfig) intent.getParcelableExtra("uiConfig"));
            ServiceAlertFragment serviceAlertFragment = new ServiceAlertFragment();
            serviceAlertFragment.setArguments(bundle2);
            C0909a aVar = new C0909a(supportFragmentManager);
            aVar.mo4041e(R.id.fragment_container, serviceAlertFragment, "service_alerts_fragment_tag", 1);
            aVar.mo4040d();
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("SEARCH_LINE_FTS");
        hashSet.add("TWITTER_SERVICE_ALERTS_FEEDS");
        return s1;
    }
}
