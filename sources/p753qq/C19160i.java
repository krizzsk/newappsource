package p753qq;

import a00.C13382a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.editing.EditStopOverviewActivity;
import com.moovit.app.editing.welcome.EditorWelcomeActivity;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.ConnectEditorActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.metro.ReportCategoryType;
import com.moovit.network.model.ServerId;
import com.moovit.view.dialogs.BottomSheetMenuDialogFragment;
import com.tranzmate.R;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;
import p824tp.C19728f;
import p874vr.C20199a;
import q00.C19047a;
import r00.C19209a;

/* renamed from: qq.i */
public class C19160i extends C18116c<StopDetailActivity> implements BottomSheetMenuDialogFragment.C7965a {
    public C19160i() {
        super(StopDetailActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(3);
        hashSet.add("CONFIGURATION");
        hashSet.add("USER_ACCOUNT");
        hashSet.add("METRO_CONTEXT");
        return hashSet;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24850l0(com.moovit.view.dialogs.BottomSheetMenuDialogFragment.MenuItem r9) {
        /*
            r8 = this;
            java.lang.String r9 = r9.f24112b
            r9.getClass()
            int r0 = r9.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = -1
            r6 = 0
            switch(r0) {
                case 49: goto L_0x003f;
                case 50: goto L_0x0034;
                case 51: goto L_0x0029;
                case 52: goto L_0x001e;
                case 53: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x004a
        L_0x0013:
            java.lang.String r0 = "5"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x001c
            goto L_0x004a
        L_0x001c:
            r9 = 4
            goto L_0x004b
        L_0x001e:
            java.lang.String r0 = "4"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0027
            goto L_0x004a
        L_0x0027:
            r9 = 3
            goto L_0x004b
        L_0x0029:
            java.lang.String r0 = "3"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0032
            goto L_0x004a
        L_0x0032:
            r9 = 2
            goto L_0x004b
        L_0x0034:
            java.lang.String r0 = "2"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x003d
            goto L_0x004a
        L_0x003d:
            r9 = 1
            goto L_0x004b
        L_0x003f:
            java.lang.String r0 = "1"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r9 = 0
            goto L_0x004b
        L_0x004a:
            r9 = -1
        L_0x004b:
            r0 = 0
            java.lang.String r7 = "entityId"
            if (r9 == 0) goto L_0x0112
            if (r9 == r4) goto L_0x00d9
            if (r9 == r3) goto L_0x00c0
            if (r9 == r2) goto L_0x0086
            if (r9 == r1) goto L_0x005a
            goto L_0x013e
        L_0x005a:
            hq.b$a r9 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r0 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r9.<init>(r0)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r1 = "add_service_report_clicked"
            r9.mo49939g(r0, r1)
            hq.b r9 = r9.mo49933a()
            r8.mo46797j2(r9)
            com.moovit.app.reports.service.ReportEntityType r9 = com.moovit.app.reports.service.ReportEntityType.STOP
            A r0 = r8.f40822c
            com.moovit.app.stopdetail.StopDetailActivity r0 = (com.moovit.app.stopdetail.StopDetailActivity) r0
            com.moovit.network.model.ServerId r0 = r0.f39657Z
            kv.f r9 = p618kv.C18145f.m44854S1(r9, r0, r6)
            androidx.fragment.app.FragmentManager r0 = r8.getParentFragmentManager()
            java.lang.String r1 = "report_stop_dialog_fragment_tag"
            r9.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r1)
            goto L_0x013e
        L_0x0086:
            hq.b$a r9 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r9.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "stop_reports_clicked"
            r9.mo49939g(r1, r2)
            hq.b r9 = r9.mo49933a()
            r8.mo46797j2(r9)
            android.content.Context r9 = r8.requireContext()
            A r1 = r8.f40822c
            com.moovit.app.stopdetail.StopDetailActivity r1 = (com.moovit.app.stopdetail.StopDetailActivity) r1
            com.moovit.network.model.ServerId r1 = r1.f39657Z
            int r2 = com.moovit.app.reports.list.StopsReportsListActivity.f39203o0
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.moovit.app.reports.list.StopsReportsListActivity> r3 = com.moovit.app.reports.list.StopsReportsListActivity.class
            r2.<init>(r9, r3)
            ce0.C21100e.m49373x(r1, r7)
            java.lang.String r9 = "reportsListDataId"
            r2.putExtra(r9, r1)
            java.lang.String r9 = "reportsListData"
            r2.putExtra(r9, r0)
            r8.startActivity(r2)
            goto L_0x013e
        L_0x00c0:
            hq.b$a r9 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r0 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r9.<init>(r0)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r1 = "edit_station_clicked_top"
            r9.mo49939g(r0, r1)
            hq.b r9 = r9.mo49933a()
            r8.mo46797j2(r9)
            r8.mo51598z2()
            goto L_0x013e
        L_0x00d9:
            hq.b$a r9 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r9.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "report_wrong_data_clicked"
            r9.mo49939g(r1, r2)
            hq.b r9 = r9.mo49933a()
            r8.mo46797j2(r9)
            android.content.Context r9 = r8.requireContext()
            A r1 = r8.f40822c
            com.moovit.app.stopdetail.StopDetailActivity r1 = (com.moovit.app.stopdetail.StopDetailActivity) r1
            com.moovit.network.model.ServerId r1 = r1.f39657Z
            int r2 = com.moovit.app.reports.community.CommunityStopReportsActivity.f39181Z
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.moovit.app.reports.community.CommunityStopReportsActivity> r3 = com.moovit.app.reports.community.CommunityStopReportsActivity.class
            r2.<init>(r9, r3)
            ce0.C21100e.m49373x(r1, r7)
            java.lang.String r9 = "entityIdExtra"
            r2.putExtra(r9, r1)
            java.lang.String r9 = "entityExtra"
            r2.putExtra(r9, r0)
            r8.startActivity(r2)
            goto L_0x013e
        L_0x0112:
            hq.b$a r9 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r0 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r9.<init>(r0)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r1 = "report_crowdedness_clicked"
            r9.mo49939g(r0, r1)
            hq.b r9 = r9.mo49933a()
            r8.mo46797j2(r9)
            A r9 = r8.f40822c
            com.moovit.app.stopdetail.StopDetailActivity r9 = (com.moovit.app.stopdetail.StopDetailActivity) r9
            com.moovit.network.model.ServerId r9 = r9.f39657Z
            com.moovit.metro.ReportCategoryType r0 = com.moovit.metro.ReportCategoryType.STOP_CROWDEDNESS
            com.moovit.app.reports.service.ReportEntityType r1 = com.moovit.app.reports.service.ReportEntityType.STOP
            com.moovit.app.reports.service.d r9 = com.moovit.app.reports.service.C15222d.m38901S1(r5, r0, r1, r9)
            androidx.fragment.app.FragmentManager r0 = r8.getChildFragmentManager()
            java.lang.String r1 = "stop_report"
            r9.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r1)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p753qq.C19160i.mo24850l0(com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            if (i != 1002) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                mo51598z2();
            }
        } else if (i2 == -1) {
            Context requireContext = requireContext();
            TrackingEvent trackingEvent = TrackingEvent.EDITOR_WELCOME_SCREEN_ACKNOWLEDGED;
            SharedPreferences sharedPreferences = requireContext.getSharedPreferences("events_tracker_store", 0);
            sharedPreferences.edit().putInt(trackingEvent.getPrefsKey(), sharedPreferences.getInt(trackingEvent.getPrefsKey(), 0) + 1).apply();
            mo51598z2();
        }
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        C17885a.m44441i(button, 0, R.attr.outlinedRoundedButtonMediumStyle, 2131953333);
        button.setText(R.string.tripplan_itinerary_live_directions_report);
        C17885a.m44467v0(button, R.drawable.ic_report_16);
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        boolean z;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "report_bottom_dialog");
        mo46797j2(aVar.mo49933a());
        C19047a aVar2 = (C19047a) mo46776J1("CONFIGURATION");
        C19728f fVar = (C19728f) mo46776J1("METRO_CONTEXT");
        Context context = view.getContext();
        ArrayList arrayList = new ArrayList(4);
        if (!C13382a.m33671g(context) || !((Boolean) aVar2.mo51505b(C20199a.f51284k0)).booleanValue() || !fVar.f50165a.f16138m.contains(ReportCategoryType.STOP_CROWDEDNESS)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            arrayList.add(new BottomSheetMenuDialogFragment.MenuItem(DiskLruCache.VERSION_1, R.drawable.ic_general_crowdedness_16_on_surface_emphasis_medium, R.string.action_crowdedness_report));
        }
        C19209a aVar3 = C20199a.f51282j0;
        if (((Boolean) aVar2.mo51505b(aVar3)).booleanValue() || !((Boolean) aVar2.mo51505b(C20199a.f51284k0)).booleanValue()) {
            arrayList.add(new BottomSheetMenuDialogFragment.MenuItem("2", R.drawable.ic_edit_16_on_surface_emphasis_medium, R.string.station_report_data));
        }
        if (((Boolean) aVar2.mo51505b(aVar3)).booleanValue()) {
            arrayList.add(new BottomSheetMenuDialogFragment.MenuItem("3", R.drawable.ic_edit_16_on_surface_emphasis_medium, R.string.edit_station_button));
        }
        arrayList.add(new BottomSheetMenuDialogFragment.MenuItem("4", R.drawable.ic_news_16_on_surface_medium, R.string.stop_reports_view));
        if (((Boolean) aVar2.mo51505b(C20199a.f51284k0)).booleanValue()) {
            arrayList.add(new BottomSheetMenuDialogFragment.MenuItem("5", R.drawable.ic_report_16_on_surface_emphasis_medium, R.string.action_service_report));
        }
        BottomSheetMenuDialogFragment.m18151S1(arrayList).show(getChildFragmentManager(), "report_action_dialog");
    }

    /* renamed from: z2 */
    public final void mo51598z2() {
        Context requireContext = requireContext();
        TrackingEvent trackingEvent = TrackingEvent.EDITOR_WELCOME_SCREEN_ACKNOWLEDGED;
        boolean z = false;
        if (requireContext.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) >= trackingEvent.getMaxOccurrences()) {
            z = true;
        }
        if (!z) {
            int i = EditorWelcomeActivity.f38007X;
            startActivityForResult(new Intent(requireContext, EditorWelcomeActivity.class), 1001);
        } else if (!((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46576g()) {
            int i2 = ConnectEditorActivity.f40550l0;
            startActivityForResult(new Intent(requireContext, ConnectEditorActivity.class), 1002);
        } else {
            ServerId serverId = ((StopDetailActivity) this.f40822c).f39657Z;
            int i3 = EditStopOverviewActivity.f37922C0;
            Intent intent = new Intent(requireContext, EditStopOverviewActivity.class);
            intent.putExtra("extra_transit_stop_server_id", serverId);
            startActivity(intent);
        }
    }
}
