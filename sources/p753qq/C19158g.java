package p753qq;

import a00.C13382a;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.metro.ReportCategoryType;
import com.moovit.transit.TransitLine;
import com.moovit.view.dialogs.BottomSheetMenuDialogFragment;
import com.tranzmate.R;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;
import p824tp.C19728f;
import p874vr.C20199a;
import q00.C19047a;
import r00.C19209a;

/* renamed from: qq.g */
public abstract class C19158g<A extends MoovitAppActivity> extends C18116c<A> implements BottomSheetMenuDialogFragment.C7965a {

    /* renamed from: s */
    public ArrayList f48740s = null;

    public C19158g(Class<A> cls) {
        super(cls);
    }

    /* renamed from: A2 */
    public abstract TransitLine mo51596A2();

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
    public final void mo24850l0(com.moovit.view.dialogs.BottomSheetMenuDialogFragment.MenuItem r7) {
        /*
            r6 = this;
            java.lang.String r7 = r7.f24112b
            r7.getClass()
            int r0 = r7.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = -1
            r5 = 0
            switch(r0) {
                case 49: goto L_0x0033;
                case 50: goto L_0x0028;
                case 51: goto L_0x001d;
                case 52: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x003e
        L_0x0012:
            java.lang.String r0 = "4"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x001b
            goto L_0x003e
        L_0x001b:
            r7 = 3
            goto L_0x003f
        L_0x001d:
            java.lang.String r0 = "3"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0026
            goto L_0x003e
        L_0x0026:
            r7 = 2
            goto L_0x003f
        L_0x0028:
            java.lang.String r0 = "2"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0031
            goto L_0x003e
        L_0x0031:
            r7 = 1
            goto L_0x003f
        L_0x0033:
            java.lang.String r0 = "1"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r7 = 0
            goto L_0x003f
        L_0x003e:
            r7 = -1
        L_0x003f:
            r0 = 0
            if (r7 == 0) goto L_0x00ef
            if (r7 == r3) goto L_0x00b3
            if (r7 == r2) goto L_0x0080
            if (r7 == r1) goto L_0x004a
            goto L_0x0120
        L_0x004a:
            hq.b$a r7 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r7.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "line_reports_clicked"
            r7.mo49939g(r1, r2)
            hq.b r7 = r7.mo49933a()
            r6.mo46797j2(r7)
            com.moovit.transit.TransitLine r7 = r6.mo51596A2()
            if (r7 == 0) goto L_0x006b
            com.moovit.transit.TransitLineGroup r7 = r7.mo24369b()
            com.moovit.network.model.ServerId r0 = r7.f23694b
        L_0x006b:
            com.moovit.transit.TransitLine r7 = r6.mo51596A2()
            if (r0 == 0) goto L_0x0120
            if (r7 == 0) goto L_0x0120
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            android.content.Intent r7 = com.moovit.app.reports.list.LinesReportsListActivity.m38851E2(r1, r0, r7, r0)
            r6.startActivity(r7)
            goto L_0x0120
        L_0x0080:
            hq.b$a r7 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r7.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "add_service_report_clicked"
            r7.mo49939g(r1, r2)
            hq.b r7 = r7.mo49933a()
            r6.mo46797j2(r7)
            com.moovit.transit.TransitLine r7 = r6.mo51596A2()
            if (r7 == 0) goto L_0x009d
            com.moovit.network.model.ServerId r0 = r7.f23687c
        L_0x009d:
            if (r0 == 0) goto L_0x0120
            com.moovit.app.reports.service.ReportEntityType r7 = com.moovit.app.reports.service.ReportEntityType.LINE
            kv.f r7 = p618kv.C18145f.m44854S1(r7, r0, r5)
            A r0 = r6.f40822c
            com.moovit.app.MoovitAppActivity r0 = (com.moovit.app.MoovitAppActivity) r0
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            java.lang.String r1 = "report_line_dialog_fragment_tag"
            r7.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r1)
            goto L_0x0120
        L_0x00b3:
            hq.b$a r7 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r7.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "report_wrong_data_clicked"
            r7.mo49939g(r1, r2)
            hq.b r7 = r7.mo49933a()
            r6.mo46797j2(r7)
            com.moovit.transit.TransitLine r7 = r6.mo51596A2()
            if (r7 == 0) goto L_0x00d1
            com.moovit.network.model.ServerId r7 = r7.f23687c
            goto L_0x00d2
        L_0x00d1:
            r7 = r0
        L_0x00d2:
            if (r7 == 0) goto L_0x0120
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            int r2 = com.moovit.app.reports.community.CommunityLineReportsActivity.f39176Z
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.moovit.app.reports.community.CommunityLineReportsActivity> r3 = com.moovit.app.reports.community.CommunityLineReportsActivity.class
            r2.<init>(r1, r3)
            java.lang.String r1 = "entityIdExtra"
            r2.putExtra(r1, r7)
            java.lang.String r7 = "entityExtra"
            r2.putExtra(r7, r0)
            r6.startActivity(r2)
            goto L_0x0120
        L_0x00ef:
            com.moovit.transit.TransitLine r7 = r6.mo51596A2()
            if (r7 == 0) goto L_0x00f7
            com.moovit.network.model.ServerId r0 = r7.f23687c
        L_0x00f7:
            if (r0 != 0) goto L_0x00fa
            goto L_0x0120
        L_0x00fa:
            hq.b$a r7 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r7.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "report_crowdedness_clicked"
            r7.mo49939g(r1, r2)
            hq.b r7 = r7.mo49933a()
            r6.mo46797j2(r7)
            com.moovit.metro.ReportCategoryType r7 = com.moovit.metro.ReportCategoryType.LINE_CROWDEDNESS
            com.moovit.app.reports.service.ReportEntityType r1 = com.moovit.app.reports.service.ReportEntityType.LINE
            com.moovit.app.reports.service.d r7 = com.moovit.app.reports.service.C15222d.m38901S1(r4, r7, r1, r0)
            androidx.fragment.app.FragmentManager r0 = r6.getChildFragmentManager()
            java.lang.String r1 = "line_report"
            r7.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r1)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p753qq.C19158g.mo24850l0(com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem):void");
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        C17885a.m44441i(button, 0, R.attr.outlinedRoundedButtonMediumStyle, 2131953333);
        button.setText(R.string.tripplan_itinerary_live_directions_report);
        C17885a.m44467v0(button, R.drawable.ic_report_16);
    }

    /* renamed from: q2 */
    public final Task<Boolean> mo50555q2() {
        return Tasks.forResult(Boolean.valueOf(!mo51597z2().isEmpty()));
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "report_bottom_dialog");
        mo46797j2(aVar.mo49933a());
        BottomSheetMenuDialogFragment.m18151S1(mo51597z2()).show(getChildFragmentManager(), "report_action_dialog");
    }

    /* renamed from: z2 */
    public final List<BottomSheetMenuDialogFragment.MenuItem> mo51597z2() {
        boolean z;
        if (this.f48740s == null) {
            C19047a aVar = (C19047a) mo46776J1("CONFIGURATION");
            C19728f fVar = (C19728f) mo46776J1("METRO_CONTEXT");
            Context requireContext = requireContext();
            ArrayList arrayList = new ArrayList(4);
            if (!C13382a.m33671g(requireContext) || !((Boolean) aVar.mo51505b(C20199a.f51284k0)).booleanValue() || !fVar.f50165a.f16137l.contains(ReportCategoryType.LINE_CROWDEDNESS)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(new BottomSheetMenuDialogFragment.MenuItem(DiskLruCache.VERSION_1, R.drawable.ic_general_crowdedness_16_on_surface_emphasis_medium, R.string.action_crowdedness_report));
            }
            C19209a aVar2 = C20199a.f51284k0;
            if (((Boolean) aVar.mo51505b(aVar2)).booleanValue()) {
                arrayList.add(new BottomSheetMenuDialogFragment.MenuItem("2", R.drawable.ic_edit_16_on_surface_emphasis_medium, R.string.line_report_data));
            }
            if (C13382a.m33671g(requireContext) && ((Boolean) aVar.mo51505b(aVar2)).booleanValue()) {
                arrayList.add(new BottomSheetMenuDialogFragment.MenuItem("3", R.drawable.ic_report_16_on_surface_emphasis_medium, R.string.action_service_report));
            }
            if (C13382a.m33671g(requireContext)) {
                arrayList.add(new BottomSheetMenuDialogFragment.MenuItem("4", R.drawable.ic_news_16_on_surface_medium, R.string.line_reports_view));
            }
            this.f48740s = arrayList;
        }
        return this.f48740s;
    }
}
