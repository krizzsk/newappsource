package p903ww;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.C14753n;
import com.moovit.commons.utils.UiUtils;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.ticketing.wallet.UserWalletTab;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;
import p373au.C13535g;
import p397bu.C13685c;
import p450dt.C16703d;
import p543hq.C17474b;
import p716oy.C18860a;
import p80.C12995d;
import p824tp.C19722a0;
import p977zz.C20964s0;
import q00.C19047a;
import s90.C13078f;
import v50.C20101a;
import w40.C25761d;
import y90.C13272f;
import z20.C20806a;

/* renamed from: ww.c */
public class C20424c extends C16703d {

    /* renamed from: q */
    public static final /* synthetic */ int f51743q = 0;

    /* renamed from: o */
    public final C20425a f51744o = new C20425a();

    /* renamed from: p */
    public UserWalletTab f51745p;

    /* renamed from: ww.c$a */
    public class C20425a extends BroadcastReceiver {
        public C20425a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C20424c cVar = C20424c.this;
            int i = C20424c.f51743q;
            cVar.getClass();
            cVar.setHasOptionsMenu(C25761d.m64299a().mo83590e());
            View view = C20424c.this.getView();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                View findViewWithTag = viewGroup.findViewWithTag("emptyState");
                if (findViewWithTag != null) {
                    viewGroup.removeView(findViewWithTag);
                }
                View findViewWithTag2 = viewGroup.findViewWithTag("disconnectedState");
                if (findViewWithTag2 != null) {
                    viewGroup.removeView(findViewWithTag2);
                }
                if (C20424c.this.mo46775H1()) {
                    C20424c.this.mo52619q2(view);
                }
            }
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "CONFIGURATION", "USER_CONTEXT");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo52619q2(view);
    }

    /* renamed from: n2 */
    public final Toolbar mo45130n2() {
        return (Toolbar) UiUtils.m40251j((ViewGroup) getView(), Toolbar.class);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r7.equals(com.appboy.Constants.APPBOY_PUSH_CONTENT_KEY) == false) goto L_0x0027;
     */
    /* renamed from: o2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49409o2(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getHost()
            java.lang.String r1 = "wallet"
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "t"
            java.lang.String r7 = r7.getQueryParameter(r0)
            boolean r0 = p977zz.C20964s0.m49090h(r7)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r0 == 0) goto L_0x001d
            goto L_0x0062
        L_0x001d:
            r7.getClass()
            int r0 = r7.hashCode()
            switch(r0) {
                case 97: goto L_0x004a;
                case 101: goto L_0x003f;
                case 118: goto L_0x0034;
                case 3683: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            r2 = -1
            goto L_0x0053
        L_0x0029:
            java.lang.String r0 = "sv"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            r2 = 3
            goto L_0x0053
        L_0x0034:
            java.lang.String r0 = "v"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003d
            goto L_0x0027
        L_0x003d:
            r2 = 2
            goto L_0x0053
        L_0x003f:
            java.lang.String r0 = "e"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0048
            goto L_0x0027
        L_0x0048:
            r2 = 1
            goto L_0x0053
        L_0x004a:
            java.lang.String r0 = "a"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0053
            goto L_0x0027
        L_0x0053:
            switch(r2) {
                case 0: goto L_0x0060;
                case 1: goto L_0x005d;
                case 2: goto L_0x005a;
                case 3: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x0062
        L_0x0057:
            com.moovit.ticketing.wallet.UserWalletTab r3 = com.moovit.ticketing.wallet.UserWalletTab.STORED_VALUE
            goto L_0x0062
        L_0x005a:
            com.moovit.ticketing.wallet.UserWalletTab r3 = com.moovit.ticketing.wallet.UserWalletTab.VALIDATION
            goto L_0x0062
        L_0x005d:
            com.moovit.ticketing.wallet.UserWalletTab r3 = com.moovit.ticketing.wallet.UserWalletTab.EXPIRED
            goto L_0x0062
        L_0x0060:
            com.moovit.ticketing.wallet.UserWalletTab r3 = com.moovit.ticketing.wallet.UserWalletTab.AVAILABLE
        L_0x0062:
            r6.f51745p = r3
            if (r3 == 0) goto L_0x0087
            androidx.fragment.app.FragmentManager r7 = r6.getChildFragmentManager()
            androidx.fragment.app.Fragment r7 = r7.mo3923A(r1)
            s90.f r7 = (s90.C13078f) r7
            if (r7 == 0) goto L_0x0087
            java.util.List<com.moovit.ticketing.wallet.UserWalletTab> r0 = r7.f32358r
            if (r0 == 0) goto L_0x0087
            com.moovit.commons.view.pager.ViewPager r1 = r7.f32357q
            if (r1 != 0) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            int r0 = r0.indexOf(r3)
            if (r0 != r5) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            com.moovit.commons.view.pager.ViewPager r7 = r7.f32357q
            r7.setCurrentLogicalItem(r0)
        L_0x0087:
            return r4
        L_0x0088:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p903ww.C20424c.mo49409o2(android.net.Uri):boolean");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C25761d.m64300h(requireContext(), this.f51744o);
        setHasOptionsMenu(C25761d.m64299a().mo83590e());
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.ticketing_wallet_menu, menu);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ticketing_wallet_home_fragment, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        C25761d.m64301k(requireContext(), this.f51744o);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.account) {
            return super.onOptionsItemSelected(menuItem);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "wallet_tab_open_payment_account_clicked");
        mo46797j2(aVar.mo49933a());
        startActivity(new Intent().setClass(requireContext(), C18860a.m45884a().f48023k));
        return true;
    }

    public final void onResume() {
        super.onResume();
        new C20806a.C20807a("wallet_tab_view").mo52935c();
        mo52618p2();
    }

    /* renamed from: p2 */
    public final void mo52618p2() {
        View view;
        C17474b bVar;
        if (isResumed() && (view = getView()) != null && (bVar = (C17474b) view.getTag(R.id.view_tag_param1)) != null) {
            mo46797j2(bVar);
        }
    }

    /* renamed from: q2 */
    public final void mo52619q2(View view) {
        FragmentActivity requireActivity = requireActivity();
        C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity, new C20422a(this, view)).addOnFailureListener((Activity) requireActivity, (OnFailureListener) new C20423b(this, view)).addOnSuccessListener((Activity) requireActivity, new C14753n(this, 4));
    }

    /* renamed from: r2 */
    public final void mo52620r2(View view, PaymentAccount paymentAccount) {
        if (this.f40824e) {
            C19047a aVar = (C19047a) mo46776J1("CONFIGURATION");
            if (!((Boolean) aVar.mo51505b(C12995d.f32165a)).booleanValue()) {
                View inflate = View.inflate(view.getContext(), R.layout.ticketing_wallet_home_fragment_empty_state, (ViewGroup) view);
                Context context = inflate.getContext();
                String string = context.getString(R.string.payment_my_rides_unsupported_notify);
                C13272f fVar = ((C19722a0) mo46776J1("USER_CONTEXT")).f50160a;
                String string2 = context.getString(R.string.payment_my_rides_unsupported_notify_url, new Object[]{fVar.f32925a, String.valueOf(fVar.f32927c.f15142b), Long.toString(System.currentTimeMillis())});
                Button button = (Button) inflate.findViewById(R.id.link);
                if (C20964s0.m49090h(string) || C20964s0.m49090h(string2)) {
                    button.setVisibility(8);
                } else {
                    button.setText(string);
                    button.setOnClickListener(new C13685c(2, this, context, string2));
                    button.setVisibility(0);
                }
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "wallet_tab_empty_state");
                aVar2.mo49941i(AnalyticsAttributeKey.IS_LOGGED_IN, C25761d.m64299a().mo83590e());
                view.setTag(R.id.view_tag_param1, aVar2.mo49933a());
                return;
            }
            String str = (String) aVar.mo51505b(C20101a.f51007T);
            PaymentAccountContextStatus paymentAccountContextStatus = PaymentAccountContextStatus.DISCONNECTED;
            if (PaymentAccount.m64175c(paymentAccount, str, paymentAccountContextStatus)) {
                View.inflate(view.getContext(), R.layout.ticketing_wallet_home_fragment_disconnected, (ViewGroup) view).findViewById(R.id.button).setOnClickListener(new C13535g(3, this, str));
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "wallet_tab_disconnected_state");
                aVar3.mo49939g(AnalyticsAttributeKey.STATE, C13555b.m33979s(paymentAccountContextStatus));
                view.setTag(R.id.view_tag_param1, aVar3.mo49933a());
                return;
            }
            C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "wallet_tab_impression");
            aVar4.mo49941i(AnalyticsAttributeKey.IS_LOGGED_IN, C25761d.m64299a().mo83590e());
            view.setTag(R.id.view_tag_param1, aVar4.mo49933a());
            FragmentManager childFragmentManager = getChildFragmentManager();
            if (childFragmentManager.mo3923A("wallet") == null) {
                C0909a aVar5 = new C0909a(childFragmentManager);
                UserWalletTab userWalletTab = this.f51745p;
                HashSet hashSet = C13078f.f32353s;
                Bundle bundle = new Bundle();
                bundle.putParcelable("initialTab", userWalletTab);
                C13078f fVar2 = new C13078f();
                fVar2.setArguments(bundle);
                aVar5.mo4111f(R.id.fragment_container, fVar2, "wallet");
                aVar5.mo4040d();
            }
        }
    }
}
