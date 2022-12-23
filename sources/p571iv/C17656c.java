package p571iv;

import android.view.View;
import android.widget.RadioGroup;
import com.moovit.app.reports.data.UserReportFeedback;
import com.moovit.app.reports.list.ReportsListActivity;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import p548hv.C17502d;
import p594jv.C17940j;
import p594jv.C17946n;

/* renamed from: iv.c */
public final /* synthetic */ class C17656c implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ReportsListActivity.C15206e f45380a;

    /* renamed from: b */
    public final /* synthetic */ C17502d f45381b;

    /* renamed from: c */
    public final /* synthetic */ View f45382c;

    public /* synthetic */ C17656c(ReportsListActivity.C15206e eVar, C17502d dVar, View view) {
        this.f45380a = eVar;
        this.f45381b = dVar;
        this.f45382c = view;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        ReportsListActivity.C15206e eVar = this.f45380a;
        C17502d dVar = this.f45381b;
        View view = this.f45382c;
        eVar.getClass();
        if (i == R.id.likes_radio_button) {
            if (dVar.f45072g.equals(UserReportFeedback.DISLIKE)) {
                int i2 = dVar.f45069d;
                if (i2 > 0) {
                    dVar.f45069d = i2 - 1;
                }
                StringBuilder k = C13555b.m33972k("");
                k.append(dVar.f45069d);
                ReportsListActivity.C15206e.m38875J(R.id.dislikes_count, view, k.toString());
            }
            dVar.f45068c++;
            dVar.f45072g = UserReportFeedback.LIKE;
            StringBuilder k2 = C13555b.m33972k("");
            k2.append(dVar.f45068c);
            ReportsListActivity.C15206e.m38875J(R.id.likes_count, view, k2.toString());
            ReportsListActivity reportsListActivity = ReportsListActivity.this;
            String str = dVar.f45066a;
            int i3 = ReportsListActivity.f39183n0;
            reportsListActivity.getClass();
            C17940j jVar = new C17940j(reportsListActivity.mo44548x1(), str);
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            reportsListActivity.mo44527k2("likeReportRequest", jVar, requestOptions, new C17654a(reportsListActivity, str));
        } else if (i == R.id.dislikes_radio_button) {
            if (dVar.f45072g.equals(UserReportFeedback.LIKE)) {
                int i4 = dVar.f45068c;
                if (i4 > 0) {
                    dVar.f45068c = i4 - 1;
                }
                StringBuilder k3 = C13555b.m33972k("");
                k3.append(dVar.f45068c);
                ReportsListActivity.C15206e.m38875J(R.id.likes_count, view, k3.toString());
            }
            dVar.f45069d++;
            dVar.f45072g = UserReportFeedback.DISLIKE;
            StringBuilder k4 = C13555b.m33972k("");
            k4.append(dVar.f45069d);
            ReportsListActivity.C15206e.m38875J(R.id.dislikes_count, view, k4.toString());
            ReportsListActivity reportsListActivity2 = ReportsListActivity.this;
            String str2 = dVar.f45066a;
            int i5 = ReportsListActivity.f39183n0;
            reportsListActivity2.getClass();
            C17946n nVar = new C17946n(reportsListActivity2.mo44548x1(), str2);
            RequestOptions requestOptions2 = new RequestOptions();
            requestOptions2.f42909f = true;
            reportsListActivity2.mo44527k2("unLikeReportRequest", nVar, requestOptions2, new C17655b(reportsListActivity2, str2));
        }
    }
}
