package com.moovit.app.home.dashboard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.promotion.model.Promotion;
import com.moovit.app.useraccount.manager.UserAccountDataProvider;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p130j2.C5367a;
import p452dv.C16724a;
import p496fr.C17064a;
import p527gy.C17261e;
import p543hq.C17474b;
import p551hy.C17515a;
import p551hy.C17517b;

/* renamed from: com.moovit.app.home.dashboard.u */
public class C14985u extends C15682c<MoovitActivity> {

    /* renamed from: r */
    public static final /* synthetic */ int f38351r = 0;

    /* renamed from: n */
    public ListItemView f38352n;

    /* renamed from: o */
    public ViewGroup f38353o;

    /* renamed from: p */
    public C17515a f38354p;

    /* renamed from: q */
    public final C14986a f38355q = new C14986a();

    /* renamed from: com.moovit.app.home.dashboard.u$a */
    public class C14986a extends BroadcastReceiver {
        public C14986a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String str;
            if (C14985u.this.f38354p != null) {
                if (intent == null) {
                    str = null;
                } else {
                    str = intent.getAction();
                }
                if ("com.moovit.useraccount.manager.user_profile_update_success".equals(str)) {
                    C17515a aVar = C14985u.this.f38354p;
                    synchronized (aVar) {
                        if (aVar.f45091e == null) {
                            C17515a.C17516a aVar2 = new C17515a.C17516a();
                            aVar.f45091e = aVar2;
                            aVar2.execute(new Void[0]);
                        }
                    }
                } else if ("com.moovit.useraccount.manager.promotions.user_promotions_update_success".equals(str)) {
                    C14985u.this.mo45188m2();
                }
            }
        }
    }

    public C14985u() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("USER_ACCOUNT");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        UserAccountDataProvider orDefault = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).f40569d.getOrDefault(UserAccountDataProvider.ProviderType.PROMOTIONS, null);
        C21100e.m49373x(orDefault, "promotionsController");
        this.f38354p = (C17515a) orDefault;
        if (this.f40824e) {
            mo45188m2();
        }
    }

    /* renamed from: m2 */
    public final void mo45188m2() {
        C16724a aVar;
        if (mo46775H1() && getView() != null) {
            C17517b bVar = this.f38354p.f45090d;
            synchronized (bVar) {
                aVar = (C16724a) bVar.f45096d;
            }
            int i = 0;
            if (aVar == null) {
                C17515a aVar2 = this.f38354p;
                synchronized (aVar2) {
                    if (aVar2.f45091e == null) {
                        C17515a.C17516a aVar3 = new C17515a.C17516a();
                        aVar2.f45091e = aVar3;
                        aVar3.execute(new Void[0]);
                        return;
                    }
                    return;
                }
            }
            String str = aVar.f43562a;
            List<Promotion> list = aVar.f43563b;
            this.f38352n.setTitle((CharSequence) str);
            if (this.f38353o.getChildCount() > 1) {
                ViewGroup viewGroup = this.f38353o;
                viewGroup.removeViews(1, viewGroup.getChildCount() - 1);
            }
            for (Promotion next : list) {
                ListItemView listItemView = (ListItemView) LayoutInflater.from(this.f40822c).inflate(R.layout.promotion_section_item, this.f38353o, false);
                listItemView.setIcon(next.f39168b);
                listItemView.setTitle((CharSequence) next.f39169c);
                listItemView.setSubtitle((CharSequence) next.f39170d);
                AppDeepLink appDeepLink = next.f39172f;
                TextView textView = (TextView) listItemView.getAccessoryView();
                if (appDeepLink != null) {
                    textView.setText(next.f39171e);
                    textView.setVisibility(0);
                    listItemView.setOnClickListener(new C17064a(2, this, next));
                } else {
                    textView.setVisibility(8);
                }
                this.f38353o.addView(listItemView);
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "promotion_exposed");
                aVar4.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, next.f39169c);
                mo46797j2(aVar4.mo49933a());
            }
            ViewGroup viewGroup2 = this.f38353o;
            if (viewGroup2.getChildCount() <= 1) {
                i = 8;
            }
            viewGroup2.setVisibility(i);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.promotion_section_fragment, viewGroup, false);
        this.f38352n = (ListItemView) inflate.findViewById(R.id.header);
        this.f38353o = (ViewGroup) inflate.findViewById(R.id.container);
        C17261e.m43265f(requireContext(), this.f38355q, Collections.singletonList("com.moovit.useraccount.manager.user_profile_update_success"));
        Context requireContext = requireContext();
        C14986a aVar = this.f38355q;
        List<String> asList = Arrays.asList(new String[]{"com.moovit.useraccount.manager.promotions.user_promotions_update_failure", "com.moovit.useraccount.manager.promotions.user_promotions_update_success"});
        C5367a a = C5367a.m13473a(requireContext);
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : asList) {
            intentFilter.addAction(addAction);
        }
        a.mo21146b(aVar, intentFilter);
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C17261e.m43267h(requireContext(), this.f38355q);
        Context requireContext = requireContext();
        C5367a.m13473a(requireContext).mo21148d(this.f38355q);
    }

    public final void onStart() {
        super.onStart();
        if (mo46775H1()) {
            mo45188m2();
        }
    }
}
