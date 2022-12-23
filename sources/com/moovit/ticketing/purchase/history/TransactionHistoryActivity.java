package com.moovit.ticketing.purchase.history;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C1026n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c90.C7579b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.dialog.C15859b;
import com.moovit.design.view.list.ListItemView;
import com.moovit.web.WebViewActivity;
import ja0.C12791b;
import ja0.C12793c;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import n60.C18531b;
import o00.C18665b;
import p102h0.C5021e;
import p430cx.C16522d;
import p431cy.C16525b;
import p471eq.C16851b;
import p471eq.C16855d;
import p495fq.C17060e;
import p543hq.C17474b;
import p669mz.C18489e;
import p977zz.C20964s0;

public class TransactionHistoryActivity extends MoovitActivity implements C12791b.C12792a<Transaction>, C15859b.C15861b {

    /* renamed from: Z */
    public static final /* synthetic */ int f23372Z = 0;

    /* renamed from: U */
    public C7579b f23373U;

    /* renamed from: X */
    public ListItemView f23374X;

    /* renamed from: Y */
    public RecyclerView f23375Y;

    /* renamed from: C */
    public final /* synthetic */ void mo24110C() {
    }

    /* renamed from: d1 */
    public final C16855d mo19507d1() {
        int i = C12869e.root;
        C16525b c = new C17060e(this).mo49508c();
        c.mo49314a(TimeUnit.SECONDS.toMillis(30));
        return new C16855d(this, i, Collections.singletonList((C16851b) c.f43144b));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C12870f.tranaction_history_activity);
        setSupportActionBar((Toolbar) findViewById(C12869e.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
        }
        ListItemView listItemView = (ListItemView) findViewById(C12869e.header);
        this.f23374X = listItemView;
        listItemView.setTag(Calendar.getInstance());
        this.f23374X.getAccessoryView().setOnClickListener(new C18531b(this, 3));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(C12869e.swipe_refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(new C5021e(this, 17));
        RecyclerView recyclerView = (RecyclerView) findViewById(C12869e.recycler_view);
        this.f23375Y = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        this.f23375Y.mo4593g(new C18665b(this, C12868d.divider_horizontal), -1);
        this.f23375Y.setAdapter(new C12793c());
        C7579b bVar = (C7579b) new C1026n0(this).mo4313a(C7579b.class);
        this.f23373U = bVar;
        bVar.f23079e.observe(this, new C16522d(this, 4));
        this.f23373U.f23080f.observe(this, new C18489e(1, this, swipeRefreshLayout));
    }

    /* renamed from: f */
    public final void mo20740f(List list, Object obj, int i) {
        String str = ((Transaction) obj).f23371f;
        if (!C20964s0.m49090h(str)) {
            startActivity(WebViewActivity.m18168y2(this, str, (CharSequence) null));
        }
    }

    /* renamed from: o0 */
    public final /* synthetic */ void mo24111o0() {
    }

    /* renamed from: v */
    public final void mo24112v(int i, int i2, String str) {
        if ("date_picker_dialog".equals(str)) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirm_clicked");
            mo44545v2(aVar.mo49933a());
            C7579b bVar = this.f23373U;
            bVar.f23078d.set(1, i);
            bVar.f23078d.set(2, i2);
            bVar.f23077c.mo4295e(bVar.f23078d, "month");
            bVar.f23079e.postValue(bVar.f23078d);
        }
    }
}
