package com.moovit.app.general.settings.notifications;

import a00.C13382a;
import android.os.Bundle;
import android.view.MenuItem;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import f10.C16935f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import p297w5.C6994a;
import p543hq.C17474b;
import p567iq.C17635b;
import p638lr.C18267n;
import p734ps.C18976d;
import p734ps.C18977e;
import p734ps.C18978f;
import p824tp.C19722a0;
import p977zz.C20964s0;

public class NotificationSettingsActivity extends MoovitAppActivity {

    /* renamed from: n0 */
    public static final /* synthetic */ int f38057n0 = 0;

    /* renamed from: U */
    public C18977e f38058U;

    /* renamed from: X */
    public TreeMap f38059X;

    /* renamed from: Y */
    public TreeMap f38060Y;

    /* renamed from: Z */
    public ListItemView f38061Z;

    /* renamed from: l0 */
    public UserDeliverySchedule f38062l0;

    /* renamed from: m0 */
    public final ArrayList f38063m0 = new ArrayList();

    /* renamed from: com.moovit.app.general.settings.notifications.NotificationSettingsActivity$a */
    public class C14893a implements AbstractListItemView.C15871b {

        /* renamed from: a */
        public final UserNotificationSetting f38064a;

        public C14893a(UserNotificationSetting userNotificationSetting) {
            C21100e.m49373x(userNotificationSetting, "userNotificationSetting");
            this.f38064a = userNotificationSetting;
        }

        /* renamed from: a */
        public final void mo23219a(AbstractListItemView<?, ?, ?> abstractListItemView, boolean z) {
            String str;
            NotificationSettingsActivity.this.f38059X.put(this.f38064a, Boolean.valueOf(z));
            NotificationSettingsActivity notificationSettingsActivity = NotificationSettingsActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.NOTIFICATION_SETTINGS_CHANGED);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, this.f38064a.getAnalyticsName());
            aVar.mo49941i(AnalyticsAttributeKey.IS_CHECKED, z);
            notificationSettingsActivity.mo44545v2(aVar.mo49933a());
            CharSequence[] charSequenceArr = new CharSequence[3];
            charSequenceArr[0] = abstractListItemView.getTitle();
            charSequenceArr[1] = abstractListItemView.getSubtitle();
            if (abstractListItemView.isChecked()) {
                str = NotificationSettingsActivity.this.getString(R.string.voice_over_checked);
            } else {
                str = NotificationSettingsActivity.this.getString(R.string.voice_over_unchecked);
            }
            charSequenceArr[2] = str;
            C13382a.m33674j(abstractListItemView, charSequenceArr);
        }
    }

    /* renamed from: A2 */
    public final void mo45005A2() {
        if (this.f38058U == null) {
            this.f38058U = C18977e.m46090a(this);
        }
        if (this.f38059X == null) {
            this.f38059X = this.f38058U.mo51488b();
        }
        if (this.f38060Y == null) {
            this.f38060Y = this.f38058U.mo51488b();
        }
        if (this.f38062l0 == null) {
            this.f38062l0 = this.f38058U.mo51489c();
        }
    }

    /* renamed from: B2 */
    public final void mo45006B2() {
        C18977e eVar = this.f38058U;
        TreeMap treeMap = this.f38059X;
        C18977e.f48314d.mo49545d(eVar.f48319a, (Boolean) treeMap.get(UserNotificationSetting.PushNotificationNewsAndUpdate));
        C18977e.f48315e.mo49545d(eVar.f48319a, (Boolean) treeMap.get(UserNotificationSetting.PushNotificationMyFavorite));
        C18977e.f48317g.mo49545d(eVar.f48319a, (Boolean) treeMap.get(UserNotificationSetting.PushNotificationServiceAlert));
        C18977e.f48318h.mo49545d(eVar.f48319a, (Boolean) treeMap.get(UserNotificationSetting.PushNotificationMobileTicketing));
        C18977e.f48316f.mo49545d(eVar.f48319a, (Boolean) treeMap.get(UserNotificationSetting.PushNotificationStopGeofence));
        int i = 0;
        C17635b.m43779f(this).f50172b.mo42913b(new C18978f(this, this.f38059X, this.f38058U.mo51489c()), false);
        for (Map.Entry entry : this.f38059X.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue() ^ ((Boolean) this.f38060Y.get((UserNotificationSetting) entry.getKey())).booleanValue()) {
                i++;
            }
        }
        if (!this.f38062l0.equals(this.f38058U.mo51489c())) {
            i++;
        }
        if (i != 0) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.NOTIFICATION_SETTINGS_CHANGED);
            aVar.mo49935c(AnalyticsAttributeKey.CHANGES_SUM, i);
            mo44545v2(aVar.mo49933a());
        }
        new C18976d((MoovitApplication) getApplication()).mo49820a();
        C16935f.m42764g(this, Boolean.TRUE.equals(this.f38058U.mo51488b().get(UserNotificationSetting.PushNotificationNewsAndUpdate)), (C19722a0) getSystemService("user_context"));
    }

    /* renamed from: C2 */
    public final void mo45007C2(ListItemView listItemView, UserNotificationSetting userNotificationSetting) {
        int i;
        listItemView.setChecked(((Boolean) this.f38059X.get(userNotificationSetting)).booleanValue());
        listItemView.setOnCheckedChangeListener(new C14893a(userNotificationSetting));
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = listItemView.getTitle();
        charSequenceArr[1] = listItemView.getSubtitle();
        if (listItemView.isChecked()) {
            i = R.string.voice_over_checked;
        } else {
            i = R.string.voice_over_unchecked;
        }
        charSequenceArr[2] = getString(i);
        C13382a.m33674j(listItemView, charSequenceArr);
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        mo45006B2();
        return this instanceof AdjustAdsPreferencesActivity;
    }

    /* renamed from: e1 */
    public final C17474b.C17475a mo44521e1() {
        C17474b.C17475a e1 = super.mo44521e1();
        e1.mo49939g(AnalyticsAttributeKey.STATE, C20964s0.m49100r(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, mo45008y2()));
        return e1;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.notifications_settings_activity);
        mo45005A2();
        ListItemView listItemView = (ListItemView) findViewById(R.id.deliverySchedule);
        this.f38061Z = listItemView;
        listItemView.setSubtitle(this.f38062l0.name);
        this.f38061Z.setOnClickListener(new C6994a(this, 6));
        ListItemView listItemView2 = (ListItemView) findViewById(R.id.pnNewsAndUpdates);
        mo45007C2(listItemView2, UserNotificationSetting.PushNotificationNewsAndUpdate);
        this.f38063m0.add(listItemView2);
        ListItemView listItemView3 = (ListItemView) findViewById(R.id.pnMyFavorites);
        mo45007C2(listItemView3, UserNotificationSetting.PushNotificationMyFavorite);
        this.f38063m0.add(listItemView3);
        ListItemView listItemView4 = (ListItemView) findViewById(R.id.pnStopGeofence);
        mo45007C2(listItemView4, UserNotificationSetting.PushNotificationStopGeofence);
        this.f38063m0.add(listItemView4);
        ListItemView listItemView5 = (ListItemView) findViewById(R.id.pnServiceAlerts);
        mo45007C2(listItemView5, UserNotificationSetting.PushNotificationServiceAlert);
        this.f38063m0.add(listItemView5);
        mo45009z2(this.f38058U.mo51489c());
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        mo45005A2();
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49939g(AnalyticsAttributeKey.STATE, C20964s0.m49100r(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, mo45008y2()));
        return m1;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            mo45006B2();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: y2 */
    public final ArrayList mo45008y2() {
        ArrayList arrayList = new ArrayList(this.f38060Y.size() + 1);
        C13720d.m34276f(this.f38060Y.entrySet(), (C13722f) null, new C18267n(2), arrayList);
        arrayList.add(String.format(Locale.ENGLISH, "%1$s:%2$s", new Object[]{"push_notification_delivery_schedule", this.f38062l0.analyticsName}));
        return arrayList;
    }

    /* renamed from: z2 */
    public final void mo45009z2(UserDeliverySchedule userDeliverySchedule) {
        if (userDeliverySchedule == UserDeliverySchedule.Never) {
            TreeMap treeMap = this.f38059X;
            UserNotificationSetting userNotificationSetting = UserNotificationSetting.PushNotificationMobileTicketing;
            Boolean bool = Boolean.FALSE;
            treeMap.put(userNotificationSetting, bool);
            this.f38059X.put(UserNotificationSetting.PushNotificationMyFavorite, bool);
            this.f38059X.put(UserNotificationSetting.PushNotificationNewsAndUpdate, bool);
            this.f38059X.put(UserNotificationSetting.PushNotificationServiceAlert, bool);
            this.f38059X.put(UserNotificationSetting.PushNotificationStopGeofence, bool);
            Iterator it = this.f38063m0.iterator();
            while (it.hasNext()) {
                ListItemView listItemView = (ListItemView) it.next();
                listItemView.setChecked(false);
                listItemView.setClickable(false);
            }
            return;
        }
        Iterator it2 = this.f38063m0.iterator();
        while (it2.hasNext()) {
            ((ListItemView) it2.next()).setClickable(true);
        }
    }
}
