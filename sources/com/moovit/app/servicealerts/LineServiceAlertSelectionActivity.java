package com.moovit.app.servicealerts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import c00.C13717b;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.servicealerts.ServiceAlertAffectedLine;
import com.moovit.servicealerts.ServiceAlertDigestView;
import com.moovit.transit.TransitAgency;
import com.tranzmate.R;
import j80.C12778f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p115i0.C5227c;
import p397bu.C13684b;
import p567iq.C17635b;
import p824tp.C19728f;
import p898wr.C20400b;
import p926xv.C20623d;
import u00.C19826h;

public class LineServiceAlertSelectionActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f39551X = 0;

    /* renamed from: U */
    public Map<String, ServiceAlert> f39552U;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        if (bundle != null) {
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("alert_ids");
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("service_alerts_data_extra");
            if (parcelableArrayList != null) {
                this.f39552U = C13717b.m34254a(parcelableArrayList, new C5227c(0));
                mo45843y2(stringArrayListExtra);
            }
        }
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        Map<String, ServiceAlert> map = this.f39552U;
        if (map != null) {
            bundle.putParcelableArrayList("service_alerts_data_extra", C13717b.m34264k(map.values()));
        }
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        if (this.f39552U == null) {
            mo45844z2();
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("SEARCH_LINE_FTS");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45843y2(List<String> list) {
        SearchLineItem searchLineItem;
        setContentView((int) R.layout.line_service_alerts_selection_activity);
        FixedListView fixedListView = (FixedListView) findViewById(R.id.list);
        Intent intent = getIntent();
        HashSet hashSet = C19728f.f50164e;
        TransitAgency transitAgency = (TransitAgency) ((C19728f) getSystemService("metro_context")).f50167c.get((ServerId) intent.getParcelableExtra("transit_agency_id"));
        ServiceAlertAffectedLine serviceAlertAffectedLine = (ServiceAlertAffectedLine) intent.getParcelableExtra("affected_line");
        ImageOrTextSubtitleListItemView imageOrTextSubtitleListItemView = new ImageOrTextSubtitleListItemView(this);
        ServerId serverId = serviceAlertAffectedLine.f23206d;
        if (serverId != null) {
            C19826h g = ((C20400b) C17635b.m43779f(this).mo52086d((C19728f) getSystemService("metro_context"))).mo51805g();
            g.getClass();
            searchLineItem = (SearchLineItem) g.mo52130j(this, Collections.singleton(serverId)).get(serverId);
        } else {
            searchLineItem = null;
        }
        if (searchLineItem != null) {
            imageOrTextSubtitleListItemView.setIcon(searchLineItem.f41641f);
            imageOrTextSubtitleListItemView.setTitle((CharSequence) searchLineItem.f41642g);
            imageOrTextSubtitleListItemView.setSubtitleItems(searchLineItem.f41643h);
        } else {
            imageOrTextSubtitleListItemView.setIcon(serviceAlertAffectedLine.f23205c);
            imageOrTextSubtitleListItemView.setTitle((CharSequence) serviceAlertAffectedLine.f23204b);
            imageOrTextSubtitleListItemView.setSubtitle((CharSequence) transitAgency.f23673c);
        }
        fixedListView.addView(imageOrTextSubtitleListItemView, FixedListView.m40337h(this, 0, R.drawable.divider_horizontal_full_10, 2));
        for (String str : list) {
            ServiceAlert serviceAlert = this.f39552U.get(str);
            ServiceAlertDigestView serviceAlertDigestView = new ServiceAlertDigestView(this, (AttributeSet) null);
            serviceAlertDigestView.mo23944w(serviceAlert);
            serviceAlertDigestView.setOnClickListener(new C13684b(2, this, serviceAlert, serviceAlertAffectedLine));
            fixedListView.addView(serviceAlertDigestView);
        }
    }

    /* renamed from: z2 */
    public final void mo45844z2() {
        mo19769r2();
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("alert_ids");
        C12778f fVar = C17635b.m43779f(this).f50174d;
        fVar.getClass();
        Tasks.call(MoovitExecutors.f37327IO, new C12778f.C12782d(stringArrayListExtra)).addOnCompleteListener((Activity) this, new C20623d(this, stringArrayListExtra));
    }
}
