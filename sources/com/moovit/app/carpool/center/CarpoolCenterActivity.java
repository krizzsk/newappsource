package com.moovit.app.carpool.center;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b00.C13556a;
import ci0.C21211f;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.carpool.CarpoolRidesProvider;
import com.moovit.app.carpool.center.C14797a;
import com.moovit.app.carpool.driver.CarpoolCompanyEditor;
import com.moovit.app.carpool.history.CarpoolHistoryActivity;
import com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity;
import com.moovit.app.carpool.payment.PassengerCredit;
import com.moovit.carpool.CarpoolRideRequest;
import com.moovit.carpool.HasCarpoolRide;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.design.view.AlertMessageView;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.request.RequestOptions;
import com.moovit.util.CurrencyAmount;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o00.C18681n;
import p039c7.C1800c;
import p297w5.C6994a;
import p471eq.C16850a;
import p520gr.C17217a;
import p527gy.C17261e;
import p543hq.C17474b;
import p614kr.C18124f;
import p614kr.C18125g;
import p874vr.C20199a;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20944i0;
import q00.C19047a;

public class CarpoolCenterActivity extends MoovitAppActivity implements CarpoolRidesProvider.C14793d, C14797a.C14799b {

    /* renamed from: p0 */
    public static final /* synthetic */ int f37683p0 = 0;

    /* renamed from: U */
    public CarpoolRidesProvider f37684U = CarpoolRidesProvider.f37661j;

    /* renamed from: X */
    public C14797a f37685X = new C14797a();

    /* renamed from: Y */
    public ProgressBar f37686Y;

    /* renamed from: Z */
    public ViewGroup f37687Z;

    /* renamed from: l0 */
    public AlertMessageView f37688l0;

    /* renamed from: m0 */
    public CurrencyAmount f37689m0 = null;

    /* renamed from: n0 */
    public C13556a f37690n0 = null;

    /* renamed from: o0 */
    public boolean f37691o0 = false;

    /* renamed from: com.moovit.app.carpool.center.CarpoolCenterActivity$a */
    public class C14796a extends C21211f {
        public C14796a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C18124f fVar = (C18124f) cVar;
            CarpoolCenterActivity carpoolCenterActivity = CarpoolCenterActivity.this;
            carpoolCenterActivity.f37690n0 = null;
            PassengerCredit passengerCredit = ((C18125g) gVar).f46339m;
            TextView textView = (TextView) carpoolCenterActivity.findViewById(R.id.passenger_credit);
            CurrencyAmount currencyAmount = passengerCredit.f37807b;
            if (currencyAmount == null || currencyAmount.f23845c.longValue() == 0) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            CurrencyAmount currencyAmount2 = passengerCredit.f37808c;
            carpoolCenterActivity.f37689m0 = currencyAmount2;
            textView.setText(carpoolCenterActivity.getString(R.string.carpool_referral_credit_updated_banner, new Object[]{currencyAmount, currencyAmount2.toString()}));
            C14797a aVar = carpoolCenterActivity.f37685X;
            CurrencyAmount currencyAmount3 = carpoolCenterActivity.f37689m0;
            aVar.f37696j = currencyAmount3;
            if (currencyAmount3 != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: y2 */
    public static Intent m37255y2(Context context) {
        Intent intent = new Intent(context, CarpoolCenterActivity.class);
        intent.addFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.addFlags(67108864);
        return intent;
    }

    /* renamed from: A2 */
    public final void mo44846A2() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_about_clicked");
        mo44545v2(aVar.mo49933a());
        startActivity(WebViewActivity.m18168y2(this, getString(R.string.carpool_explanation_link), (CharSequence) null));
    }

    /* renamed from: B2 */
    public final void mo44847B2() {
        if (this.f37684U.mo44834d(23)) {
            this.f37686Y.setVisibility(0);
            this.f37687Z.setVisibility(8);
            this.f37688l0.setVisibility(8);
            return;
        }
        mo44841F0(23);
    }

    /* renamed from: F0 */
    public final void mo44841F0(int i) {
        if ((i & 23) != 0) {
            this.f37687Z.setVisibility(0);
            this.f37686Y.setVisibility(8);
            this.f37688l0.setVisibility(8);
            CarpoolRidesProvider carpoolRidesProvider = this.f37684U;
            carpoolRidesProvider.getClass();
            ArrayList arrayList = new ArrayList();
            List<T> list = carpoolRidesProvider.f37667f.f37671a;
            if (list != null) {
                arrayList.addAll(list);
            }
            CarpoolRidesProvider carpoolRidesProvider2 = this.f37684U;
            carpoolRidesProvider2.getClass();
            ArrayList arrayList2 = new ArrayList();
            List<T> list2 = carpoolRidesProvider2.f37665d.f37671a;
            if (list2 != null) {
                arrayList2.addAll(list2);
            }
            List<T> list3 = carpoolRidesProvider2.f37663b.f37671a;
            if (list3 != null) {
                arrayList2.addAll(list3);
            }
            List<T> list4 = carpoolRidesProvider2.f37664c.f37671a;
            if (list4 != null) {
                arrayList2.addAll(list4);
            }
            C14797a aVar = this.f37685X;
            aVar.f37696j = this.f37689m0;
            aVar.f37695i.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                aVar.f37695i.add(new C14797a.C14798a((HasCarpoolRide) it.next()));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                aVar.f37695i.add(new C14797a.C14798a((CarpoolRideRequest) it2.next()));
            }
            Collections.sort(aVar.f37695i);
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(R.menu.carpool_center_menu, menu);
        menu.findItem(R.id.add_credit_card).setVisible(((C17261e) getSystemService("user_profile_manager_service")).mo49805e().f44613l.f40608b);
        return true;
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        this.f37684U.f37668g.remove(this);
        C13556a aVar = this.f37690n0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f37690n0 = null;
            this.f37691o0 = true;
        }
    }

    /* renamed from: d0 */
    public final void mo44842d0(GcmPayload gcmPayload) {
        mo44847B2();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.carpool_center_activity);
        init();
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        this.f37684U.f37668g.put(this, 23);
        mo44847B2();
        if (this.f37691o0) {
            mo44849z2();
        }
    }

    /* renamed from: g1 */
    public final void mo44843g1(int i) {
        this.f37688l0.setVisibility(0);
        this.f37686Y.setVisibility(8);
        this.f37687Z.setVisibility(8);
    }

    public final void init() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C14797a aVar = this.f37685X;
        aVar.f37694h = this;
        recyclerView.setAdapter(aVar);
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        sparseIntArray.put(0, R.drawable.divider_horizontal_full);
        sparseIntArray.put(2, R.drawable.divider_horizontal_full);
        sparseIntArray.put(4, R.drawable.divider_horizontal_full);
        recyclerView.mo4593g(new C18681n(recyclerView.getContext(), sparseIntArray, true), -1);
        this.f37686Y = (ProgressBar) findViewById(R.id.progress);
        this.f37687Z = (ViewGroup) findViewById(R.id.rides_container);
        findViewById(R.id.book_new_ride).setOnClickListener(new C16850a(this, 3));
        AlertMessageView alertMessageView = (AlertMessageView) findViewById(R.id.noNetworkErrorLayout);
        this.f37688l0 = alertMessageView;
        alertMessageView.setPositiveButtonClickListener(new C1800c(this, 1));
        this.f37688l0.setNegativeButtonClickListener(new C6994a(this, 3));
        C20944i0 i0Var = (C20944i0) ((C19047a) mo44537r1("CONFIGURATION")).mo51505b(C20199a.f51292o0);
        if (i0Var != null) {
            C14797a aVar2 = this.f37685X;
            aVar2.f37693g = new C20944i0<>((String) i0Var.f52692a, (String) i0Var.f52693b);
            aVar2.notifyDataSetChanged();
        }
        mo44849z2();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 5566) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            Snackbar.m35158k(0, findViewById(R.id.root), getString(R.string.report_thank_you)).mo42259p();
        }
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        if (i == 108 && menu != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "context_menu_clicked");
            mo44545v2(aVar.mo49933a());
        }
        return super.onMenuOpened(i, menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.about_carpool_service:
                mo44846A2();
                return true;
            case R.id.add_credit_card:
                startActivity(new Intent(this, CarpoolAddCreditCardActivity.class));
                return true;
            case R.id.company_info:
                mo44547w2("add_company_info");
                startActivityForResult(new Intent(this, CarpoolCompanyEditor.class), 5566);
                return true;
            case R.id.rides_history:
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_ride_history_clicked");
                mo44545v2(aVar.mo49933a());
                startActivity(new Intent(this, CarpoolHistoryActivity.class));
                return true;
            case R.id.send_coupon_code:
                mo44547w2("manual");
                new C17217a().show(getSupportFragmentManager(), "send_coupon_code");
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("CONFIGURATION");
        hashSet.add("CARPOOL_SUPPORT_VALIDATOR");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: z2 */
    public final void mo44849z2() {
        C18124f fVar = new C18124f(mo44548x1());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f37690n0 = mo44527k2("get_passenger_credit", fVar, requestOptions, new C14796a());
    }
}
