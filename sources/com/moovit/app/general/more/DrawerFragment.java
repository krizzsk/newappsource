package com.moovit.app.general.more;

import a00.C13382a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c00.C13717b;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.HomeActivity;
import com.moovit.app.home.tab.HomeTab;
import com.moovit.app.servicealerts.ServiceAlertFragment;
import com.moovit.app.servicealerts.ServiceAlertsActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import k00.C17988b;
import mf0.C24361g;
import p130j2.C5367a;
import p172m9.C5720b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p431cy.C16525b;
import p484ff.C16984m;
import p496fr.C17064a;
import p503fy.C17125a;
import p527gy.C17261e;
import p543hq.C17474b;
import p583jk.C17884p;
import p589jq.C17909a;
import p613kq.C18114a;
import p615ks.C18126a;
import p662ms.C18430b;
import p662ms.C18431c;
import p664mu.C18454l;
import p692ny.C18646a;
import p785ry.C19385e;
import p80.C12995d;
import p824tp.C19722a0;
import p874vr.C20199a;
import p875vs.C20222a;
import p875vs.C20224c;
import q00.C19047a;
import q00.C19053d;
import v50.C20101a;
import v90.C13187a;

public class DrawerFragment extends C15682c<HomeActivity> {

    /* renamed from: t */
    public static final /* synthetic */ int f38045t = 0;

    /* renamed from: n */
    public final C18430b f38046n = new C18430b(this);

    /* renamed from: o */
    public final C20224c f38047o = new C20224c(this);

    /* renamed from: p */
    public final C14890a f38048p = new C14890a();

    /* renamed from: q */
    public final C14891b f38049q = new C14891b();

    /* renamed from: r */
    public final C14892c f38050r = new C14892c();

    /* renamed from: s */
    public int[] f38051s;

    /* renamed from: com.moovit.app.general.more.DrawerFragment$a */
    public class C14890a extends BroadcastReceiver {
        public C14890a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (DrawerFragment.this.getView() != null) {
                String action = intent.getAction();
                if ("com.moovit.useraccount.manager.notifications.user_notifications_update_success".equals(action) || "com.moovit.useraccount.manager.notifications.user_notifications_update_failure".equals(action)) {
                    DrawerFragment drawerFragment = DrawerFragment.this;
                    View view = drawerFragment.getView();
                    int i = DrawerFragment.f38045t;
                    drawerFragment.mo44996n2(view);
                }
            }
        }
    }

    /* renamed from: com.moovit.app.general.more.DrawerFragment$b */
    public class C14891b extends BroadcastReceiver {
        public C14891b() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (DrawerFragment.this.getView() != null) {
                String action = intent.getAction();
                if ("com.moovit.useraccount.manager.campaigns.user_campaigns_update_success".equals(action) || "com.moovit.useraccount.manager.campaigns.user_campaigns_update_failure".equals(action)) {
                    DrawerFragment drawerFragment = DrawerFragment.this;
                    View view = drawerFragment.getView();
                    int i = DrawerFragment.f38045t;
                    drawerFragment.mo44995m2(view);
                }
            }
        }
    }

    /* renamed from: com.moovit.app.general.more.DrawerFragment$c */
    public class C14892c extends BroadcastReceiver {
        public C14892c() {
        }

        public final void onReceive(Context context, Intent intent) {
            String str;
            View view = DrawerFragment.this.getView();
            if (view != null) {
                if (intent == null) {
                    str = null;
                } else {
                    str = intent.getAction();
                }
                if ("com.moovit.useraccount.manager.user_profile_update_success".equals(str)) {
                    DrawerFragment drawerFragment = DrawerFragment.this;
                    int i = DrawerFragment.f38045t;
                    drawerFragment.mo44998p2(view);
                }
            }
        }
    }

    public DrawerFragment() {
        super(HomeActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(6);
        hashSet.add("CONFIGURATION");
        hashSet.add("TRANSPORTATION_MAPS");
        hashSet.add("WEB_PAGES");
        hashSet.add("USER_ACCOUNT");
        hashSet.add("USER_CONTEXT");
        hashSet.add("TRIP_PLANNER_CONFIGURATION");
        hashSet.add("ACCESSIBILITY_CONFIGURATION");
        return hashSet;
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo44998p2(view);
    }

    /* renamed from: m2 */
    public final void mo44995m2(View view) {
        List list;
        int i;
        ListItemView listItemView = (ListItemView) view.findViewById(R.id.menu_campaigns);
        if (listItemView != null && mo46785T1("USER_ACCOUNT")) {
            C16525b bVar = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46572c().f43139d;
            synchronized (bVar) {
                list = (List) bVar.f43144b;
            }
            boolean z = !list.isEmpty();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            listItemView.setVisibility(i);
            if (z) {
                listItemView.setTag(list.get(0));
            }
        }
    }

    /* renamed from: n2 */
    public final void mo44996n2(View view) {
        ListItemView listItemView = (ListItemView) view.findViewById(R.id.menu_notifications_center);
        if (listItemView != null && mo46785T1("USER_ACCOUNT")) {
            int c = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46574e().f44338d.mo49718c();
            if (c > 0) {
                listItemView.setAccessoryText((CharSequence) String.valueOf(c));
                listItemView.setAccessoryThemeTextAppearance(R.attr.textAppearanceFootnote);
                listItemView.setAccessoryThemeTextColor(R.attr.colorOnStatus);
                Drawable c2 = C17988b.m44612c(listItemView.getContext(), R.drawable.bg_badge, R.attr.colorCritical);
                View accessoryView = listItemView.getAccessoryView();
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15057q(accessoryView, c2);
                C13382a.m33674j(listItemView, getString(R.string.more_menu_notification_center), getString(R.string.voice_over_notification_center_hint));
                return;
            }
            listItemView.setAccessoryText((CharSequence) null);
        }
    }

    /* renamed from: o2 */
    public final void mo44997o2(View view) {
        int i;
        int i2;
        int i3;
        if (mo46785T1("CONFIGURATION")) {
            C19047a aVar = (C19047a) mo46776J1("CONFIGURATION");
            boolean booleanValue = ((Boolean) aVar.mo51505b(C12995d.f32165a)).booleanValue();
            boolean contains = ((List) aVar.mo51505b(C20199a.f51268c0)).contains(HomeTab.TICKETING_WALLET);
            View findViewById = view.findViewById(R.id.menu_tickets_center);
            int i4 = 8;
            if (findViewById != null) {
                if (!booleanValue || contains) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                findViewById.setVisibility(i3);
            }
            View findViewById2 = view.findViewById(R.id.menu_transactions);
            if (findViewById2 != null) {
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                findViewById2.setVisibility(i2);
            }
            View findViewById3 = view.findViewById(R.id.menu_redeem);
            if (findViewById3 != null) {
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                findViewById3.setVisibility(i);
            }
            View findViewById4 = view.findViewById(R.id.menu_account_id);
            if (findViewById4 != null) {
                if (booleanValue) {
                    i4 = 0;
                }
                findViewById4.setVisibility(i4);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedArray obtainTypedArray = getResources().obtainTypedArray(R.array.supported_menu_ids);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = obtainTypedArray.getResourceId(i, 0);
        }
        obtainTypedArray.recycle();
        this.f38051s = iArr;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.drawer_fragment, viewGroup, false);
        int[] iArr = this.f38051s;
        int length = iArr.length;
        while (i < length) {
            int i2 = iArr[i];
            View findViewById = inflate.findViewById(i2);
            if (findViewById != null) {
                findViewById.setOnClickListener(this.f38046n);
                i++;
            } else {
                StringBuilder k = C13555b.m33972k("Missing view for menu id: ");
                k.append(Integer.toHexString(i2));
                throw new IllegalStateException(k.toString());
            }
        }
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            mo44998p2(view);
        }
    }

    public final void onStart() {
        super.onStart();
        C17125a.m43088h(requireContext(), this.f38048p);
        Context requireContext = requireContext();
        C14891b bVar = this.f38049q;
        List<String> asList = Arrays.asList(new String[]{"com.moovit.useraccount.manager.campaigns.user_campaigns_update_failure", "com.moovit.useraccount.manager.campaigns.user_campaigns_update_success"});
        C5367a a = C5367a.m13473a(requireContext);
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : asList) {
            intentFilter.addAction(addAction);
        }
        a.mo21146b(bVar, intentFilter);
        C17261e.m43266g(requireContext(), this.f38050r);
    }

    public final void onStop() {
        super.onStop();
        Context requireContext = requireContext();
        C14890a aVar = this.f38048p;
        Set<String> set = C17125a.f44334f;
        C5367a.m13473a(requireContext).mo21148d(aVar);
        Context requireContext2 = requireContext();
        C5367a.m13473a(requireContext2).mo21148d(this.f38049q);
        C17261e.m43267h(requireContext(), this.f38050r);
    }

    /* renamed from: p2 */
    public final void mo44998p2(View view) {
        boolean z;
        int i;
        Intent a;
        int i2;
        View findViewById;
        int i3;
        int i4;
        String str;
        boolean z2;
        int i5;
        List list;
        int i6;
        ListItemView listItemView;
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        View view2 = view;
        boolean k = C18454l.m45315k();
        View findViewById2 = view2.findViewById(R.id.menu_mot_center);
        int i19 = 1;
        if (findViewById2 != null) {
            if (k) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            findViewById2.setVisibility(i18);
            C13382a.m33674j(findViewById2, getString(R.string.more_payment_mot_rides), getString(R.string.voiceover_more_my_rides_hint));
        }
        mo44997o2(view);
        if (mo46785T1("CONFIGURATION")) {
            boolean booleanValue = ((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20101a.f51012Y)).booleanValue();
            View findViewById3 = view2.findViewById(R.id.menu_redeem_benefit);
            if (findViewById3 != null) {
                if (booleanValue) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                findViewById3.setVisibility(i17);
                if (booleanValue) {
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "home_menu_item_redeem_benefit_impression");
                    mo46797j2(aVar.mo49933a());
                }
            }
        }
        mo44997o2(view);
        if (mo46785T1("USER_ACCOUNT")) {
            boolean g = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46576g();
            ListItemView listItemView2 = (ListItemView) view2.findViewById(R.id.menu_favorites_sync);
            if (listItemView2 != null) {
                listItemView2.setTag(R.id.view_tag_param1, Boolean.valueOf(g));
                if (g) {
                    i16 = R.drawable.ic_check_mark_circ_16_good;
                } else {
                    i16 = 0;
                }
                listItemView2.setAccessoryDrawable(i16);
                listItemView2.setVisibility(0);
                C13382a.m33674j(listItemView2, getString(R.string.more_sync_favorites), getString(R.string.voice_over_connect_hint));
            }
        }
        if (mo46785T1("CONFIGURATION")) {
            C19047a aVar2 = (C19047a) mo46776J1("CONFIGURATION");
            View findViewById4 = view2.findViewById(R.id.menu_carpool_center);
            if (findViewById4 != null) {
                if (((Boolean) aVar2.mo51505b(C19053d.f48487z)).booleanValue()) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                findViewById4.setVisibility(i15);
            }
        }
        if (mo46785T1("CONFIGURATION")) {
            C19047a aVar3 = (C19047a) mo46776J1("CONFIGURATION");
            View findViewById5 = view2.findViewById(R.id.menu_tod_rides_center);
            if (findViewById5 != null) {
                if (((Boolean) aVar3.mo51505b(C19053d.f48449A)).booleanValue()) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                findViewById5.setVisibility(i14);
                C13382a.m33674j(findViewById5, getString(R.string.tod_passenger_rides_center_menu_label), getString(R.string.voiceover_more_tod_hint));
            }
        }
        AttributeSet attributeSet = null;
        if (mo46785T1("CONFIGURATION") && mo46785T1("USER_ACCOUNT")) {
            C19047a aVar4 = (C19047a) mo46776J1("CONFIGURATION");
            boolean booleanValue2 = ((Boolean) aVar4.mo51505b(C20199a.f51300s0)).booleanValue();
            boolean booleanValue3 = ((Boolean) aVar4.mo51505b(C20199a.f51302t0)).booleanValue();
            if (booleanValue2) {
                z3 = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46575f().mo49805e().f44614m.f40611b;
            } else {
                z3 = false;
            }
            ListItemView listItemView3 = (ListItemView) view2.findViewById(R.id.menu_ride_sharing_login);
            if (listItemView3 != null) {
                listItemView3.setTag(R.id.view_tag_param1, Boolean.valueOf(z3));
                listItemView3.setTag(R.id.view_tag_param2, (Object) null);
                if (z3) {
                    i12 = R.string.ride_sharing_profile_title;
                } else {
                    i12 = R.string.ride_sharing_register_login_button;
                }
                listItemView3.setTitle(i12);
                if (booleanValue2) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                listItemView3.setVisibility(i13);
                if (!z3) {
                    C19385e.f49315c.mo51791a("connect").addOnSuccessListener(new C18114a(listItemView3, 3));
                }
            }
            View findViewById6 = view2.findViewById(R.id.menu_ride_sharing_center);
            if (findViewById6 != null) {
                if (booleanValue3) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                findViewById6.setVisibility(i11);
            }
        }
        mo44995m2(view);
        if (mo46785T1("CONFIGURATION") && mo46785T1("USER_ACCOUNT")) {
            boolean booleanValue4 = ((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51307y0)).booleanValue();
            boolean z4 = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46575f().mo49805e().f44614m.f40611b;
            ListItemView listItemView4 = (ListItemView) view2.findViewById(R.id.menu_wondo_offers);
            if (listItemView4 != null) {
                listItemView4.setTag((Object) null);
                if (booleanValue4) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                listItemView4.setVisibility(i9);
                if (!z4) {
                    C19385e.f49315c.mo51791a(ProductAction.ACTION_PURCHASE).addOnSuccessListener(new C16984m(listItemView4, 4));
                }
            }
            ListItemView listItemView5 = (ListItemView) view2.findViewById(R.id.menu_wondo_codes);
            if (listItemView5 != null) {
                listItemView5.setTag((Object) null);
                if (!booleanValue4 || !z4) {
                    i8 = 8;
                } else {
                    i8 = 0;
                }
                listItemView5.setVisibility(i8);
            }
            ListItemView listItemView6 = (ListItemView) view2.findViewById(R.id.menu_wondo_rewards);
            if (listItemView6 != null) {
                listItemView6.setTag((Object) null);
            }
            ListItemView listItemView7 = (ListItemView) view2.findViewById(R.id.menu_wondo_faq);
            if (listItemView7 != null) {
                listItemView7.setTag((Object) null);
                if (booleanValue4) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                listItemView7.setVisibility(i7);
            }
            ListItemView listItemView8 = (ListItemView) view2.findViewById(R.id.menu_wondo_invite);
            if (listItemView8 != null) {
                listItemView8.setTag((Object) null);
                listItemView8.setVisibility(8);
                if (booleanValue4) {
                    C19385e.f49315c.mo51791a("invite").addOnSuccessListener(new C18431c(listItemView8, z4));
                }
            }
        }
        mo44996n2(view);
        if (mo46785T1("CONFIGURATION") && (listItemView = (ListItemView) view2.findViewById(R.id.menu_service_alerts)) != null) {
            int intValue = ((Integer) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48485x)).intValue();
            if (intValue == 1) {
                Context context = view.getContext();
                ServiceAlertFragment.ServiceAlertsUiConfig serviceAlertsUiConfig = new ServiceAlertFragment.ServiceAlertsUiConfig();
                serviceAlertsUiConfig.f39567b = true;
                serviceAlertsUiConfig.f39569d = true;
                serviceAlertsUiConfig.f39570e = true;
                serviceAlertsUiConfig.f39571f = true;
                listItemView.setTag(ServiceAlertsActivity.m39169y2(context, R.string.service_alerts_activity_title, serviceAlertsUiConfig));
                listItemView.setTitle((int) R.string.service_alerts_activity_title);
                listItemView.setVisibility(0);
            } else if (intValue != 3) {
                listItemView.setVisibility(8);
            } else {
                Context context2 = view.getContext();
                ServiceAlertFragment.ServiceAlertsUiConfig serviceAlertsUiConfig2 = new ServiceAlertFragment.ServiceAlertsUiConfig();
                serviceAlertsUiConfig2.f39567b = true;
                serviceAlertsUiConfig2.f39569d = true;
                serviceAlertsUiConfig2.f39570e = true;
                listItemView.setTag(ServiceAlertsActivity.m39169y2(context2, R.string.agency_alerts_title, serviceAlertsUiConfig2));
                listItemView.setTitle((int) R.string.agency_alerts_title);
                listItemView.setVisibility(0);
            }
        }
        ListItemView listItemView9 = (ListItemView) view2.findViewById(R.id.menu_transportation_maps);
        if (listItemView9 != null) {
            if (mo46785T1("TRANSPORTATION_MAPS")) {
                list = (List) mo46776J1("TRANSPORTATION_MAPS");
            } else {
                list = Collections.emptyList();
            }
            if (list.isEmpty()) {
                i6 = 8;
            } else {
                i6 = 0;
            }
            listItemView9.setVisibility(i6);
        }
        ListItemView listItemView10 = (ListItemView) view2.findViewById(R.id.menu_feedback);
        if (listItemView10 != null && mo46785T1("CONFIGURATION") && mo46785T1("USER_ACCOUNT")) {
            boolean booleanValue5 = ((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51256R0)).booleanValue();
            boolean v = C5720b.m14071v((UserAccountManager) mo46776J1("USER_ACCOUNT"));
            if (booleanValue5 || v) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            listItemView10.setVisibility(i5);
        }
        ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.web_pages);
        viewGroup.removeAllViews();
        List<C20222a> emptyList = Collections.emptyList();
        if (mo46785T1("WEB_PAGES")) {
            emptyList = (List) mo46776J1("WEB_PAGES");
        }
        Context context3 = view.getContext();
        for (C20222a aVar5 : emptyList) {
            if (aVar5.f51318b == i19) {
                ListItemView listItemView11 = new ListItemView(context3, attributeSet, R.attr.listItemMenuStyle);
                listItemView11.setTag(aVar5);
                listItemView11.setOnClickListener(this.f38047o);
                listItemView11.setIcon(aVar5.f51321e);
                listItemView11.setTitle((CharSequence) aVar5.f51319c);
                if (aVar5.f51325i >= aVar5.f51324h) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    listItemView11.setAccessoryText((int) R.string.new_badge);
                    listItemView11.setAccessoryThemeTextAppearance(R.attr.textAppearanceFootnote);
                    listItemView11.setAccessoryThemeTextColor(R.attr.colorOnStatus);
                    listItemView11.getAccessoryView().setBackground(C17988b.m44612c(listItemView11.getContext(), R.drawable.bg_badge, R.attr.colorInfo));
                } else {
                    listItemView11.setAccessoryText((CharSequence) null);
                }
                viewGroup.addView(listItemView11);
            }
            i19 = 1;
            attributeSet = null;
        }
        if (viewGroup.getChildCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        viewGroup.setVisibility(i);
        if (C24361g.m61132B(this.f38051s, R.id.menu_version_details)) {
            Context context4 = view.getContext();
            if (C18126a.m44816a(context4)) {
                str = getString(R.string.new_version_available);
            } else {
                str = getString(R.string.new_in_this_version);
            }
            ListItemView listItemView12 = (ListItemView) mo46799l2(R.id.menu_version_details);
            listItemView12.setTitle((CharSequence) str);
            if (!C18126a.f46340a.mo19759a(context4.getSharedPreferences("com.moovit.general.ApplicationVersionPrefs", 0)).equals(C18126a.f46341b)) {
                listItemView12.setAccessoryText((int) R.string.new_badge);
                listItemView12.setAccessoryThemeTextAppearance(R.attr.textAppearanceFootnote);
                listItemView12.setAccessoryThemeTextColor(R.attr.colorOnStatus);
                Drawable c = C17988b.m44612c(listItemView12.getContext(), R.drawable.bg_badge, R.attr.colorInfo);
                View accessoryView = listItemView12.getAccessoryView();
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15057q(accessoryView, c);
            } else {
                listItemView12.setAccessoryText((CharSequence) null);
            }
        }
        ListItemView listItemView13 = (ListItemView) mo46799l2(R.id.menu_rate_us);
        if (listItemView13 != null) {
            if (C17884p.m44338I(view.getContext())) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            listItemView13.setVisibility(i4);
        }
        if (mo46785T1("ACCESSIBILITY_CONFIGURATION") && (findViewById = view2.findViewById(R.id.menu_accessibility)) != null) {
            if (!C13717b.m34258e(((C17909a) mo46776J1("ACCESSIBILITY_CONFIGURATION")).f45950a)) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            findViewById.setVisibility(i3);
            C13382a.m33674j(findViewById, getString(R.string.settings_accessibility), getString(R.string.voiceover_more_accessibility_hint));
        }
        C13382a.m33674j((ListItemView) view2.findViewById(R.id.menu_settings), getString(R.string.settings), getString(R.string.voiceover_more_settings_hint));
        ListItemView listItemView14 = (ListItemView) view2.findViewById(R.id.menu_accessibility_statement);
        if (listItemView14 != null && mo46785T1("CONFIGURATION")) {
            if (((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51242D0)).booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            listItemView14.setVisibility(i2);
        }
        if (mo46785T1("USER_CONTEXT") && mo46785T1("USER_ACCOUNT") && mo46785T1("TRIP_PLANNER_CONFIGURATION") && ((ListItemView) view2.findViewById(R.id.menu_employee_feedback)) == null && (a = C18646a.m45603a(view.getContext(), (C19722a0) mo46776J1("USER_CONTEXT"), (UserAccountManager) mo46776J1("USER_ACCOUNT"), (C13187a) mo46776J1("TRIP_PLANNER_CONFIGURATION"))) != null) {
            ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(R.id.menu_items_container);
            View.inflate(viewGroup2.getContext(), R.layout.drawer_fragment_employee_feedback_menu_item, viewGroup2);
            ((ListItemView) view2.findViewById(R.id.menu_employee_feedback)).setOnClickListener(new C17064a(1, this, a));
        }
    }
}
