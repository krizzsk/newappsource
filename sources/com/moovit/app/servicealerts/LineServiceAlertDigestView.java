package com.moovit.app.servicealerts;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.reports.list.LinesReportsListActivity;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.TransitLine;
import com.tranzmate.R;
import j80.C12778f;
import j80.C12786g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p001a0.C0016g;
import p239rb.C6298j;
import p244s3.C6444s;
import p244s3.C6445t;
import p269u2.C6677a;
import p543hq.C17474b;
import p824tp.C19731i;
import p926xv.C20620a;
import p926xv.C20622c;

public class LineServiceAlertDigestView extends ConstraintLayout {

    /* renamed from: m */
    public static final /* synthetic */ int f39539m = 0;

    /* renamed from: h */
    public final View f39540h;

    /* renamed from: i */
    public final TextView f39541i;

    /* renamed from: j */
    public final ImageView f39542j;

    /* renamed from: k */
    public final TextView f39543k;

    /* renamed from: l */
    public List<LineServiceAlertDigest> f39544l;

    /* renamed from: com.moovit.app.servicealerts.LineServiceAlertDigestView$a */
    public static class C15302a implements View.OnClickListener {

        /* renamed from: b */
        public final C15303b f39545b;

        /* renamed from: c */
        public final String f39546c = "service_alert_clicked";

        public C15302a(C15303b bVar) {
            C21100e.m49373x(bVar, "result");
            this.f39545b = bVar;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            Context context = view.getContext();
            C15303b bVar = this.f39545b;
            LineServiceAlertDigest lineServiceAlertDigest = bVar.f39548b;
            List<String> list = lineServiceAlertDigest.f23187d;
            ServerId serverId = lineServiceAlertDigest.f23185b.f23206d;
            C12786g gVar = bVar.f39549c;
            if (gVar == null || serverId == null || !gVar.f31609e.containsKey(serverId)) {
                z = false;
            } else {
                z = true;
            }
            AnalyticsFlowKey analyticsFlowKey = null;
            if (this.f39545b.f39547a.size() > 1) {
                if (context instanceof FragmentActivity) {
                    FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    List<LineServiceAlertDigest> list2 = this.f39545b.f39547a;
                    int i = C20622c.f52134i;
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList("digests", C13717b.m34264k(list2));
                    C20622c cVar = new C20622c();
                    cVar.setArguments(bundle);
                    cVar.show(supportFragmentManager, (String) null);
                }
                str = "line_digests_chooser";
            } else if (serverId != null && (list.size() > 1 || z)) {
                context.startActivity(LinesReportsListActivity.m38851E2(context, (ServerId) null, (TransitLine) null, serverId));
                str = "line_service_alerts";
            } else if (!list.isEmpty()) {
                context.startActivity(ServiceAlertDetailsActivity.m39148z2(context, serverId, list.get(0)));
                str = "service_alert_details";
            } else {
                str = null;
            }
            if (context instanceof MoovitActivity) {
                analyticsFlowKey = ((MoovitActivity) context).f37306O;
            }
            if (analyticsFlowKey != null) {
                C6677a aVar = C19731i.m47197a(context).f50173c;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, this.f39546c);
                aVar2.mo49945m(AnalyticsAttributeKey.ACTION, str);
                aVar2.mo49939g(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(this.f39545b.f39548b.f23186c.f23213b));
                aVar2.mo49941i(AnalyticsAttributeKey.TWITTER_SHOWN, z);
                aVar.mo22850h(analyticsFlowKey, aVar2.mo49933a());
            }
        }
    }

    /* renamed from: com.moovit.app.servicealerts.LineServiceAlertDigestView$b */
    public static class C15303b {

        /* renamed from: a */
        public final List<LineServiceAlertDigest> f39547a;

        /* renamed from: b */
        public final LineServiceAlertDigest f39548b;

        /* renamed from: c */
        public final C12786g f39549c;

        /* renamed from: d */
        public final ServiceAlert f39550d;

        public C15303b() {
            throw null;
        }

        public C15303b(List list, LineServiceAlertDigest lineServiceAlertDigest, C12786g gVar, ServiceAlert serviceAlert) {
            C21100e.m49373x(list, "digests");
            this.f39547a = list;
            C21100e.m49373x(lineServiceAlertDigest, "mostImportant");
            this.f39548b = lineServiceAlertDigest;
            C21100e.m49373x(gVar, "feeds");
            this.f39549c = gVar;
            this.f39550d = serviceAlert;
        }
    }

    public LineServiceAlertDigestView() {
        throw null;
    }

    public LineServiceAlertDigestView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("digests");
        if (parcelableArrayList != null) {
            setLineServiceAlertDigests(parcelableArrayList);
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putParcelableArrayList("digests", C13717b.m34264k(this.f39544l));
        return bundle;
    }

    public void setLineServiceAlertDigest(LineServiceAlertDigest lineServiceAlertDigest) {
        setLineServiceAlertDigests(Collections.singletonList(lineServiceAlertDigest));
    }

    public void setLineServiceAlertDigests(List<LineServiceAlertDigest> list) {
        Task task;
        C21100e.m49373x(list, "digests");
        this.f39544l = list;
        setOnClickListener((View.OnClickListener) null);
        if (list.isEmpty()) {
            setVisibility(8);
            return;
        }
        LineServiceAlertDigest lineServiceAlertDigest = (LineServiceAlertDigest) Collections.min(list, new C6298j(2));
        if (ServiceStatusCategory.CRITICAL_LEVEL.contains(lineServiceAlertDigest.f23186c.f23213b)) {
            C12778f fVar = C19731i.m47197a(getContext()).f50174d;
            fVar.getClass();
            task = Tasks.call(MoovitExecutors.f37327IO, new C12778f.C12781c(lineServiceAlertDigest.f23187d.get(0)));
        } else {
            task = Tasks.forResult(null);
        }
        Task continueWith = task.continueWith(MoovitExecutors.SINGLE, new C20620a(list, lineServiceAlertDigest));
        Executor executor = MoovitExecutors.MAIN_THREAD;
        continueWith.addOnSuccessListener(executor, new C6444s(this, 1));
        continueWith.addOnFailureListener(executor, (OnFailureListener) new C6445t(this, 1));
    }

    public LineServiceAlertDigestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39544l = Collections.emptyList();
        LayoutInflater.from(context).inflate(R.layout.line_service_alert_digest_view, this, true);
        this.f39540h = findViewById(R.id.status_color_badge);
        this.f39541i = (TextView) findViewById(R.id.status);
        this.f39542j = (ImageView) findViewById(R.id.divider);
        this.f39543k = (TextView) findViewById(R.id.preview);
    }
}
