package p524gv;

import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.reports.community.CommunityReportsActivity;
import com.moovit.app.reports.service.CreateReportRequestData;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.metro.ReportCategoryType;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import ga0.C12704f;
import p297w5.C6996c;
import p543hq.C17474b;
import p594jv.C17930a;
import p977zz.C20964s0;

/* renamed from: gv.d */
public abstract class C17237d extends C15682c<CommunityReportsActivity> {

    /* renamed from: r */
    public static final /* synthetic */ int f44558r = 0;

    /* renamed from: n */
    public EditText f44559n;

    /* renamed from: o */
    public TextInputLayout f44560o;

    /* renamed from: p */
    public EditText f44561p;

    /* renamed from: q */
    public Button f44562q;

    public C17237d() {
        super(CommunityReportsActivity.class);
    }

    /* renamed from: m2 */
    public abstract String mo49796m2();

    /* renamed from: n2 */
    public final void mo49797n2() {
        boolean z;
        String str;
        String obj = this.f44561p.getText().toString();
        if (C20964s0.m49090h(obj) || Patterns.EMAIL_ADDRESS.matcher(obj).matches()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String obj2 = this.f44559n.getText().toString();
            String m2 = mo49796m2();
            ReportCategoryType reportCategoryType = (ReportCategoryType) getArguments().getParcelable("reportEntityType");
            CommunityReportsActivity communityReportsActivity = (CommunityReportsActivity) this.f40822c;
            communityReportsActivity.getClass();
            switch (CommunityReportsActivity.C15201a.f39180a[reportCategoryType.ordinal()]) {
                case 1:
                    str = "station_closed";
                    break;
                case 2:
                    str = "wrong_location";
                    break;
                case 3:
                    str = "wrong_or_missing_line";
                    break;
                case 4:
                    str = "wrong_schedule";
                    break;
                case 5:
                    str = "line_not_active";
                    break;
                case 6:
                    str = "wrong_route";
                    break;
                case 7:
                    str = "missing_line_after_search";
                    break;
                default:
                    str = "";
                    break;
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "send_report_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.REPORT_TYPE, str);
            communityReportsActivity.mo44545v2(aVar.mo49933a());
            CreateReportRequestData createReportRequestData = r5;
            CreateReportRequestData createReportRequestData2 = new CreateReportRequestData(communityReportsActivity.mo45689z2(), communityReportsActivity.f39178U, (String) null, LatLonE6.m40177j(C16202a.get(communityReportsActivity).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i()), reportCategoryType, obj2, (Integer) null, System.currentTimeMillis());
            if (communityReportsActivity.f39179X == null) {
                C12704f S1 = C12704f.m32465S1(R.string.reports_thank_you, false);
                communityReportsActivity.f39179X = S1;
                S1.show(communityReportsActivity.getSupportFragmentManager(), C12704f.f31376m);
            }
            C17930a aVar2 = new C17930a(communityReportsActivity.mo44548x1(), createReportRequestData, obj, m2);
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            communityReportsActivity.mo44527k2("createUserReportRequest", aVar2, requestOptions, new C17239f(communityReportsActivity, createReportRequestData, obj, m2));
            return;
        }
        this.f44560o.setError(getString(R.string.email_error));
    }

    /* renamed from: o2 */
    public abstract boolean mo49798o2();

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.edit_community_fragment_layout, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f44559n = (EditText) view.findViewById(R.id.additionalInfo);
        this.f44560o = (TextInputLayout) view.findViewById(R.id.email_container);
        this.f44561p = (EditText) view.findViewById(R.id.email);
        this.f44562q = (Button) view.findViewById(R.id.submitButton);
        ((ListItemView) view.findViewById(R.id.header)).setTitle(mo46782Q1().getInt("reportEntityLabelType"));
        this.f44562q.setOnClickListener(new C6996c(this, 23));
        this.f44559n.addTextChangedListener(new C17234a(this));
        this.f44561p.addTextChangedListener(new C17235b(this));
        this.f44561p.setOnEditorActionListener(new C17236c(this));
        mo49799p2(view);
    }

    /* renamed from: p2 */
    public abstract void mo49799p2(View view);
}
