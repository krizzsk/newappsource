package com.moovit.app.itinerary.external;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.itinerary.TripPlanResult;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.suggestedroutes.TripPlanParams;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tripplanner.MVGetTripPlanInformationRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k10.C17993a;
import p090g1.C4732a;
import p435de.C16596f;
import p543hq.C17474b;
import p824tp.C19722a0;
import p824tp.C19728f;
import p900wt.C20411a;
import p900wt.C20412b;
import p900wt.C20414d;
import p900wt.C20417g;
import p900wt.C20418h;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20975x0;
import q00.C19047a;

public class ExternalItineraryActivity extends MoovitAppActivity {

    /* renamed from: m0 */
    public static final /* synthetic */ int f38542m0 = 0;

    /* renamed from: U */
    public String f38543U = null;

    /* renamed from: X */
    public ServerId f38544X = null;

    /* renamed from: Y */
    public ServerId f38545Y = null;

    /* renamed from: Z */
    public int f38546Z = 0;

    /* renamed from: l0 */
    public C20412b f38547l0 = null;

    /* renamed from: com.moovit.app.itinerary.external.ExternalItineraryActivity$a */
    public class C15042a extends C20438i<C20417g, C20418h> {
        public C15042a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20417g gVar2 = (C20417g) cVar;
            ExternalItineraryActivity externalItineraryActivity = ExternalItineraryActivity.this;
            int i = ExternalItineraryActivity.f38542m0;
            externalItineraryActivity.getClass();
            TripPlanParams tripPlanParams = ((C20418h) gVar).f51731m;
            List<TripPlanResult> list = tripPlanParams.f23221g;
            ArrayList arrayList = new ArrayList(list.size());
            for (TripPlanResult tripPlanResult : list) {
                Itinerary itinerary = tripPlanResult.f41852c;
                if (itinerary != null) {
                    arrayList.add(itinerary);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(C14226d.m35335A0(externalItineraryActivity).putExtra(C17993a.f46076b, "suppress_popups"));
            arrayList2.add(SuggestRoutesActivity.m39325M2(externalItineraryActivity, tripPlanParams, true));
            arrayList2.add(ItineraryActivity.m37991y2(externalItineraryActivity, (Itinerary) arrayList.get(externalItineraryActivity.f38546Z)));
            if (!arrayList2.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList2.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!C4732a.startActivities(externalItineraryActivity, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    externalItineraryActivity.startActivity(intent);
                }
                externalItineraryActivity.finish();
                return;
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C20417g gVar = (C20417g) cVar;
            ExternalItineraryActivity externalItineraryActivity = ExternalItineraryActivity.this;
            int i = ExternalItineraryActivity.f38542m0;
            externalItineraryActivity.mo45308A2();
            return true;
        }
    }

    /* renamed from: y2 */
    public static void m38066y2(ExternalItineraryActivity externalItineraryActivity, String str, String str2) {
        externalItineraryActivity.getClass();
        AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a((Context) externalItineraryActivity).mo47683l(R.string.change_metro_dialog_title).mo47679h(externalItineraryActivity.getString(R.string.change_metro_dialog_message, new Object[]{str, str2})).mo47681j(R.string.yes).mo47680i(R.string.no).mo47682k("change_metro_tag");
        k.mo47675d(false);
        k.mo47673b().show(externalItineraryActivity.getSupportFragmentManager(), "change_metro_tag");
    }

    /* renamed from: A2 */
    public final void mo45308A2() {
        mo44545v2(new C17474b(AnalyticsEventKey.EXTERNAL_ITINERARY_FALLBACK));
        ArrayList arrayList = new ArrayList();
        arrayList.add(C14226d.m35335A0(this).putExtra(C17993a.f46076b, "suppress_popups"));
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(this, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                startActivity(intent);
            }
            finish();
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: B2 */
    public final void mo45309B2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.EXTERNAL_ITINERARY_REDIRECT);
        aVar.mo49939g(AnalyticsAttributeKey.REDIRECT_TYPE, str);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: E1 */
    public final void mo44504E1(Bundle bundle, String str) {
        mo45308A2();
    }

    /* renamed from: T1 */
    public final void mo19422T1() {
        super.mo19422T1();
        C20412b bVar = this.f38547l0;
        if (bVar != null) {
            bVar.cancel(true);
            this.f38547l0 = null;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        ServerId serverId;
        int i;
        super.mo19425e2(bundle);
        Intent intent = getIntent();
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
            Bundle extras = intent.getExtras();
            this.f38543U = extras.getString("extra_guid");
            this.f38544X = (ServerId) extras.getParcelable("guid_metro_id");
            this.f38545Y = null;
            this.f38546Z = Math.max(0, extras.getInt("initial_index", 0));
        } else {
            Uri data = intent.getData();
            try {
                this.f38543U = data.getQueryParameter("guid");
                this.f38544X = ServerId.m11392b(data.getQueryParameter("search_metro_id"));
                String queryParameter = data.getQueryParameter("user_location_metro_id");
                if (TextUtils.isEmpty(queryParameter)) {
                    serverId = null;
                } else {
                    serverId = ServerId.m11392b(queryParameter);
                }
                this.f38545Y = serverId;
                String queryParameter2 = data.getQueryParameter("index");
                if (TextUtils.isDigitsOnly(queryParameter2)) {
                    i = Math.max(0, Integer.parseInt(queryParameter2));
                } else {
                    i = 0;
                }
                this.f38546Z = i;
            } catch (Exception e) {
                this.f38543U = null;
                this.f38544X = null;
                this.f38545Y = null;
                this.f38546Z = 0;
                C16596f a = C16596f.m42113a();
                StringBuilder k = C13555b.m33972k("URI: ");
                k.append(data.toString());
                a.mo49363b(k.toString());
                a.mo49364c(new IllegalStateException("Bad Itinerary Deep Link", e));
            }
        }
        if (TextUtils.isEmpty(this.f38543U) || this.f38544X == null) {
            mo45308A2();
            return;
        }
        ServerId serverId2 = ((C19722a0) getSystemService("user_context")).f50160a.f32927c;
        if (C20975x0.m49118e(this.f38544X, this.f38545Y)) {
            if (serverId2.equals(this.f38545Y)) {
                mo45310z2(this.f38543U);
                return;
            }
            ServerId serverId3 = this.f38545Y;
            C20412b bVar = new C20412b(this, serverId3);
            bVar.execute(new ServerId[]{serverId3});
            this.f38547l0 = bVar;
            mo45309B2("silent_metro_change");
        } else if (serverId2.equals(this.f38544X)) {
            mo45310z2(this.f38543U);
        } else {
            mo45309B2("show_metro_change_dialog");
            C20414d dVar = new C20414d(mo44548x1(), Arrays.asList(new ServerId[]{serverId2, this.f38544X}));
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            mo44527k2("getMetroAreasByIdsRequest", dVar, requestOptions, new C20411a(this, serverId2));
        }
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("change_metro_tag".equals(str)) {
            if (i == -1) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.DIALOG_ACTION_TYPE, "dialog_positive_btn");
                mo44545v2(aVar.mo49933a());
                ServerId serverId = this.f38544X;
                C20412b bVar = new C20412b(this, serverId);
                bVar.execute(new ServerId[]{serverId});
                this.f38547l0 = bVar;
            } else {
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.DIALOG_ACTION_TYPE, "dialog_negative_btn");
                mo44545v2(aVar2.mo49933a());
                mo45308A2();
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: z2 */
    public final void mo45310z2(String str) {
        mo45309B2("itinerary");
        C20417g gVar = new C20417g(mo44548x1(), (C19728f) mo44537r1("METRO_CONTEXT"), (C19047a) mo44537r1("CONFIGURATION"), str);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C20417g.class, sb, "_");
        sb.append(((MVGetTripPlanInformationRequest) gVar.f33922v).guid);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2(sb2, gVar, requestOptions, new C15042a());
    }
}
