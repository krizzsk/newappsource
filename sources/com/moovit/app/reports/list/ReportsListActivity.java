package com.moovit.app.reports.list;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import c00.C13717b;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.play.core.assetpacks.C14314s;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.app.reports.service.ActionReportDialog;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.commons.view.list.C15819a;
import com.moovit.commons.view.list.SectionedListView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.servicealerts.ServiceAlertDigestView;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m00.C18313e;
import p001a0.C0016g;
import p543hq.C17474b;
import p548hv.C17501c;
import p548hv.C17502d;
import p594jv.C17934e;
import p594jv.C17935f;
import p858uz.C20061g;
import p874vr.C20199a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import q00.C19047a;

public abstract class ReportsListActivity<T extends Parcelable> extends MoovitAppActivity {

    /* renamed from: n0 */
    public static final /* synthetic */ int f39183n0 = 0;

    /* renamed from: U */
    public ReportsListActivity<T>.C16759e f39184U;

    /* renamed from: X */
    public ServerId f39185X;

    /* renamed from: Y */
    public T f39186Y;

    /* renamed from: Z */
    public SectionedListView f39187Z;

    /* renamed from: l0 */
    public int f39188l0 = -1;

    /* renamed from: m0 */
    public final C15203b f39189m0 = new C15203b();

    /* renamed from: com.moovit.app.reports.list.ReportsListActivity$a */
    public class C15202a extends C20438i<C17934e, C17935f> {

        /* renamed from: b */
        public final /* synthetic */ C17501c f39190b;

        public C15202a(C17501c cVar) {
            this.f39190b = cVar;
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17934e eVar = (C17934e) cVar;
            View findViewById = ReportsListActivity.this.findViewById(R.id.reports_loading_indicator);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17934e eVar = (C17934e) cVar;
            C14314s sVar = ((C17935f) gVar).f45997m;
            if (this.f39190b.f45065d) {
                ReportsListActivity.m38861y2(ReportsListActivity.this, sVar);
            } else {
                ReportsListActivity reportsListActivity = ReportsListActivity.this;
                ReportsListActivity<T>.g I = reportsListActivity.f39184U.mo45702I();
                if (I != null) {
                    I.f39202c.addAll((List) sVar.f36023b);
                    reportsListActivity.f39184U.notifyDataSetChanged();
                }
            }
            String str = (String) sVar.f36025d;
            if (!C20964s0.m49090h(str)) {
                T t = this.f39190b;
                t.f45064c = str;
                t.f45065d = false;
                ReportsListActivity.this.f39189m0.f46703c = t;
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17934e eVar = (C17934e) cVar;
            if (!this.f39190b.f45065d) {
                return true;
            }
            ReportsListActivity.m38861y2(ReportsListActivity.this, new C14314s((Object) Collections.emptyList(), (Object) Collections.emptyList(), (Object) null));
            return true;
        }
    }

    /* renamed from: com.moovit.app.reports.list.ReportsListActivity$b */
    public class C15203b extends C18313e<C17501c> {
        public C15203b() {
        }

        /* renamed from: a */
        public final void mo45697a(Object obj) {
            ReportsListActivity reportsListActivity = ReportsListActivity.this;
            int i = ReportsListActivity.f39183n0;
            reportsListActivity.mo45695A2((C17501c) obj);
        }
    }

    /* renamed from: com.moovit.app.reports.list.ReportsListActivity$c */
    public static /* synthetic */ class C15204c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39193a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39194b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                com.moovit.app.reports.service.ActionReportDialog$ReportUserAction[] r0 = com.moovit.app.reports.service.ActionReportDialog.ReportUserAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39194b = r0
                r1 = 1
                com.moovit.app.reports.service.ActionReportDialog$ReportUserAction r2 = com.moovit.app.reports.service.ActionReportDialog.ReportUserAction.DELETE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f39194b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.reports.service.ActionReportDialog$ReportUserAction r3 = com.moovit.app.reports.service.ActionReportDialog.ReportUserAction.INAPPROPRIATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.moovit.app.reports.data.UserReportFeedback[] r2 = com.moovit.app.reports.data.UserReportFeedback.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f39193a = r2
                com.moovit.app.reports.data.UserReportFeedback r3 = com.moovit.app.reports.data.UserReportFeedback.LIKE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f39193a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.moovit.app.reports.data.UserReportFeedback r2 = com.moovit.app.reports.data.UserReportFeedback.DISLIKE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.reports.list.ReportsListActivity.C15204c.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.reports.list.ReportsListActivity$d */
    public class C15205d extends ReportsListActivity<T>.f<ServiceAlert> {

        /* renamed from: b */
        public String f39195b;

        /* renamed from: c */
        public List<ServiceAlert> f39196c;

        public C15205d(ReportsListActivity reportsListActivity, ArrayList arrayList) {
            this.f39195b = reportsListActivity.getString(R.string.user_reports_service_alert_section_title);
            this.f39196c = arrayList;
        }

        /* renamed from: a */
        public final int mo45698a() {
            return 5;
        }

        /* renamed from: e */
        public final int mo45699e() {
            return this.f39196c.size();
        }

        public final Object getItem(int i) {
            return this.f39196c.get(i);
        }

        public final CharSequence getName() {
            return this.f39195b;
        }
    }

    /* renamed from: com.moovit.app.reports.list.ReportsListActivity$e */
    public class C15206e extends C15819a<Object, Void, ReportsListActivity<T>.f<?>, Void> {

        /* renamed from: y */
        public static final /* synthetic */ int f39197y = 0;

        /* renamed from: com.moovit.app.reports.list.ReportsListActivity$e$a */
        public class C15207a implements PopupMenu.OnMenuItemClickListener {

            /* renamed from: a */
            public String f39199a;

            public C15207a(String str) {
                this.f39199a = str;
            }

            public final boolean onMenuItemClick(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.delete_report) {
                    ReportsListActivity reportsListActivity = ReportsListActivity.this;
                    String str = this.f39199a;
                    int i = ReportsListActivity.f39183n0;
                    reportsListActivity.getClass();
                    ActionReportDialog.ReportUserAction reportUserAction = ActionReportDialog.ReportUserAction.DELETE;
                    ActionReportDialog actionReportDialog = new ActionReportDialog();
                    Bundle bundle = new Bundle();
                    bundle.putInt("userAction", reportUserAction.ordinal());
                    bundle.putString("reportId", str);
                    actionReportDialog.setArguments(bundle);
                    actionReportDialog.show(reportsListActivity.getSupportFragmentManager(), "deleteReport");
                    return true;
                } else if (itemId != R.id.inappropriate_report) {
                    return true;
                } else {
                    ReportsListActivity reportsListActivity2 = ReportsListActivity.this;
                    String str2 = this.f39199a;
                    int i2 = ReportsListActivity.f39183n0;
                    reportsListActivity2.getClass();
                    ActionReportDialog.ReportUserAction reportUserAction2 = ActionReportDialog.ReportUserAction.INAPPROPRIATE;
                    ActionReportDialog actionReportDialog2 = new ActionReportDialog();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("userAction", reportUserAction2.ordinal());
                    bundle2.putString("reportId", str2);
                    actionReportDialog2.setArguments(bundle2);
                    actionReportDialog2.show(reportsListActivity2.getSupportFragmentManager(), "inappropriateReport");
                    return true;
                }
            }
        }

        public C15206e() {
            super(ReportsListActivity.this, false, 0);
        }

        /* renamed from: J */
        public static void m38875J(int i, View view, String str) {
            TextView textView = (TextView) view.findViewById(i);
            if (str == null || str.length() == 0) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
            r6 = (p548hv.C17502d) r6;
            r4 = r6.f45067b;
         */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo45034D(android.view.View r3, com.moovit.commons.view.list.C15819a.C15821b r4, int r5, java.lang.Object r6, int r7, android.view.ViewGroup r8) {
            /*
                r2 = this;
                com.moovit.app.reports.list.ReportsListActivity$f r4 = (com.moovit.app.reports.list.ReportsListActivity.C15208f) r4
                int r4 = r2.mo45704u(r5)
                r5 = 1
                r7 = 5
                if (r4 != r7) goto L_0x001c
                com.moovit.servicealerts.ServiceAlert r6 = (com.moovit.servicealerts.ServiceAlert) r6
                r4 = r3
                com.moovit.servicealerts.ServiceAlertDigestView r4 = (com.moovit.servicealerts.ServiceAlertDigestView) r4
                r4.mo23944w(r6)
                au.g r4 = new au.g
                r4.<init>(r5, r2, r6)
                r3.setOnClickListener(r4)
                goto L_0x016e
            L_0x001c:
                r7 = 6
                if (r4 != r7) goto L_0x016e
                hv.d r6 = (p548hv.C17502d) r6
                hv.a r4 = r6.f45067b
                fv.p r7 = r4.f45056a
                if (r7 != 0) goto L_0x0029
                goto L_0x016e
            L_0x0029:
                r8 = 2131363971(0x7f0a0883, float:1.8347766E38)
                android.view.View r8 = r3.findViewById(r8)
                android.widget.ImageView r8 = (android.widget.ImageView) r8
                int r0 = r7.mo49681f()
                r8.setImageResource(r0)
                com.moovit.app.reports.list.ReportsListActivity r8 = com.moovit.app.reports.list.ReportsListActivity.this
                int r0 = r7.mo49682g()
                java.lang.String r8 = r8.getString(r0)
                android.content.Context r0 = r2.f46688b
                int r1 = r4.f45057b
                java.lang.String r7 = r7.mo49677d(r1, r0)
                if (r7 == 0) goto L_0x0053
                java.lang.String r0 = ": "
                java.lang.String r8 = p358af.C13437d.m33706k(r8, r0, r7)
            L_0x0053:
                r7 = 2131362262(0x7f0a01d6, float:1.83443E38)
                m38875J(r7, r3, r8)
                r7 = 2131363375(0x7f0a062f, float:1.8346557E38)
                java.lang.String r8 = r4.f45059d
                m38875J(r7, r3, r8)
                java.lang.String r4 = r4.f45058c
                if (r4 == 0) goto L_0x0072
                boolean r7 = r4.isEmpty()
                if (r7 == 0) goto L_0x006c
                goto L_0x0072
            L_0x006c:
                java.lang.String r7 = "\""
                java.lang.String r4 = p358af.C13437d.m33706k(r7, r4, r7)
            L_0x0072:
                com.moovit.app.reports.list.ReportsListActivity r7 = com.moovit.app.reports.list.ReportsListActivity.this
                int r8 = com.moovit.app.reports.list.ReportsListActivity.f39183n0
                r7.getClass()
                r7 = 2131363006(0x7f0a04be, float:1.8345809E38)
                android.view.View r7 = r3.findViewById(r7)
                android.widget.TextView r7 = (android.widget.TextView) r7
                if (r4 == 0) goto L_0x009d
                boolean r8 = r4.isEmpty()
                if (r8 == 0) goto L_0x008b
                goto L_0x009d
            L_0x008b:
                r8 = 0
                r7.setVisibility(r8)
                r7.setText(r4)
                com.google.android.exoplayer2.ui.r r4 = new com.google.android.exoplayer2.ui.r
                r8 = 16
                r4.<init>(r7, r8)
                r7.setOnClickListener(r4)
                goto L_0x00a2
            L_0x009d:
                r4 = 8
                r7.setVisibility(r4)
            L_0x00a2:
                java.lang.String r4 = r6.f45071f
                if (r4 == 0) goto L_0x00b0
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x00ad
                goto L_0x00b0
            L_0x00ad:
                java.lang.String r4 = r6.f45071f
                goto L_0x00b9
            L_0x00b0:
                com.moovit.app.reports.list.ReportsListActivity r4 = com.moovit.app.reports.list.ReportsListActivity.this
                r7 = 2131889510(0x7f120d66, float:1.9413686E38)
                java.lang.String r4 = r4.getString(r7)
            L_0x00b9:
                boolean r7 = r6.f45070e
                if (r7 == 0) goto L_0x00d8
                java.lang.String r7 = "("
                java.lang.StringBuilder r4 = p001a0.C0016g.m36t(r4, r7)
                com.moovit.app.reports.list.ReportsListActivity r7 = com.moovit.app.reports.list.ReportsListActivity.this
                r8 = 2131888585(0x7f1209c9, float:1.941181E38)
                java.lang.String r7 = r7.getString(r8)
                r4.append(r7)
                java.lang.String r7 = ")"
                r4.append(r7)
                java.lang.String r4 = r4.toString()
            L_0x00d8:
                r7 = 2131364639(0x7f0a0b1f, float:1.834912E38)
                m38875J(r7, r3, r4)
                r4 = 2131363975(0x7f0a0887, float:1.8347774E38)
                android.view.View r4 = r3.findViewById(r4)
                android.widget.Button r4 = (android.widget.Button) r4
                bu.a r7 = new bu.a
                r8 = 2
                r7.<init>(r8, r2, r4, r6)
                r4.setOnClickListener(r7)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = ""
                r4.append(r7)
                int r0 = r6.f45068c
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r0 = 2131363341(0x7f0a060d, float:1.8346488E38)
                m38875J(r0, r3, r4)
                r4 = 2131362700(0x7f0a038c, float:1.8345188E38)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                int r7 = r6.f45069d
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                m38875J(r4, r3, r7)
                r4 = 2131364641(0x7f0a0b21, float:1.8349125E38)
                android.view.View r4 = r3.findViewById(r4)
                android.widget.RadioGroup r4 = (android.widget.RadioGroup) r4
                r7 = 0
                r4.setOnCheckedChangeListener(r7)
                int[] r7 = com.moovit.app.reports.list.ReportsListActivity.C15204c.f39193a
                com.moovit.app.reports.data.UserReportFeedback r0 = r6.f45072g
                int r0 = r0.ordinal()
                r7 = r7[r0]
                if (r7 == r5) goto L_0x0147
                if (r7 == r8) goto L_0x0140
                r5 = -1
                r4.check(r5)
                goto L_0x014d
            L_0x0140:
                r5 = 2131362701(0x7f0a038d, float:1.834519E38)
                r4.check(r5)
                goto L_0x014d
            L_0x0147:
                r5 = 2131363342(0x7f0a060e, float:1.834649E38)
                r4.check(r5)
            L_0x014d:
                iv.c r5 = new iv.c
                r5.<init>(r2, r6, r3)
                r4.setOnCheckedChangeListener(r5)
                hv.a r4 = r6.f45067b
                long r4 = r4.f45060e
                android.content.Context r6 = r2.f46688b
                long r7 = java.lang.System.currentTimeMillis()
                long r7 = r7 - r4
                long r4 = java.lang.Math.abs(r7)
                java.lang.String r4 = com.moovit.util.time.C7925b.m18021i(r6, r4)
                r5 = 2131363977(0x7f0a0889, float:1.8347778E38)
                m38875J(r5, r3, r4)
            L_0x016e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.reports.list.ReportsListActivity.C15206e.mo45034D(android.view.View, com.moovit.commons.view.list.a$b, int, java.lang.Object, int, android.view.ViewGroup):void");
        }

        /* renamed from: F */
        public final void mo45035F(View view, C15819a.C15821b bVar, int i) {
            ListItemView listItemView = (ListItemView) view;
            listItemView.setTitle(((C15208f) bVar).getName());
            listItemView.getAccessoryView().setVisibility(8);
        }

        /* renamed from: I */
        public final ReportsListActivity<T>.g mo45702I() {
            for (T t : Collections.unmodifiableList(this.f41251g)) {
                if (t.mo45698a() == 6) {
                    return (C15209g) t;
                }
            }
            return null;
        }

        public final int getViewTypeCount() {
            return 7;
        }

        /* renamed from: i */
        public final View mo45036i(int i, int i2, int i3, ViewGroup viewGroup, LayoutInflater layoutInflater) {
            int u = mo45704u(i2);
            if (u == 5) {
                return new ServiceAlertDigestView(this.f46688b, (AttributeSet) null);
            }
            if (u == 6) {
                return layoutInflater.inflate(R.layout.reports_section_layout, viewGroup, false);
            }
            throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", u));
        }

        /* renamed from: n */
        public final View mo45037n(int i, int i2, ViewGroup viewGroup, LayoutInflater layoutInflater) {
            ListItemView listItemView = new ListItemView(this.f46688b, (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
            listItemView.setAccessoryView((int) R.layout.section_header_accessory_text_button);
            return listItemView;
        }

        /* renamed from: u */
        public final int mo45704u(int i) {
            return ((C15208f) mo47315x(i)).mo45698a();
        }
    }

    /* renamed from: com.moovit.app.reports.list.ReportsListActivity$f */
    public abstract class C15208f<K> implements C15819a.C15821b<K> {
        /* renamed from: a */
        public abstract int mo45698a();
    }

    /* renamed from: com.moovit.app.reports.list.ReportsListActivity$g */
    public class C15209g extends ReportsListActivity<T>.f<C17502d> {

        /* renamed from: b */
        public String f39201b;

        /* renamed from: c */
        public List<C17502d> f39202c;

        public C15209g(ReportsListActivity reportsListActivity, List list) {
            this.f39201b = reportsListActivity.getString(R.string.user_reports_section_title);
            this.f39202c = list;
        }

        /* renamed from: a */
        public final int mo45698a() {
            return 6;
        }

        /* renamed from: e */
        public final int mo45699e() {
            return this.f39202c.size();
        }

        public final Object getItem(int i) {
            return this.f39202c.get(i);
        }

        public final CharSequence getName() {
            return this.f39201b;
        }
    }

    /* renamed from: y2 */
    public static void m38861y2(ReportsListActivity reportsListActivity, C14314s sVar) {
        reportsListActivity.f39184U.f41267w = false;
        reportsListActivity.f39187Z.mo47264b(reportsListActivity.f39188l0);
        reportsListActivity.f39188l0 = 0;
        C15203b bVar = reportsListActivity.f39189m0;
        SectionedListView sectionedListView = reportsListActivity.f39187Z;
        AbsListView absListView = bVar.f46702b;
        if (absListView != null) {
            absListView.setOnScrollListener((AbsListView.OnScrollListener) null);
        }
        bVar.f46702b = sectionedListView;
        if (sectionedListView != null) {
            sectionedListView.setOnScrollListener(bVar.f46704d);
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList((List) sVar.f36024c);
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C15205d(reportsListActivity, arrayList2));
            reportsListActivity.f39188l0++;
        }
        List list = (List) sVar.f36023b;
        if (C13717b.m34258e(list)) {
            arrayList.add(new C15209g(reportsListActivity, Collections.emptyList()));
            reportsListActivity.f39187Z.mo47261a(reportsListActivity.f39188l0, reportsListActivity.getLayoutInflater().inflate(R.layout.empty_reports_layout, reportsListActivity.f39187Z, false));
        } else {
            arrayList.add(new C15209g(reportsListActivity, list));
        }
        reportsListActivity.f39184U.mo47288G(arrayList);
        reportsListActivity.f39187Z.setSectionedAdapter(reportsListActivity.f39184U);
        View z2 = reportsListActivity.mo45696z2();
        if (z2 != null) {
            reportsListActivity.f39187Z.mo47261a(reportsListActivity.f39188l0, z2);
        }
        ReportsListActivity<T>.C16759e eVar = reportsListActivity.f39184U;
        eVar.f41267w = true;
        eVar.notifyDataSetChanged();
    }

    /* renamed from: A2 */
    public final void mo45695A2(C17501c cVar) {
        C17934e eVar = new C17934e(mo44548x1(), cVar.f45063b, cVar.f45062a, cVar.f45064c);
        String l = Long.toString(System.currentTimeMillis());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2(l, eVar, requestOptions, new C15202a(cVar));
    }

    /* renamed from: B2 */
    public abstract void mo45690B2();

    /* renamed from: C2 */
    public void mo45691C2(ServiceAlert serviceAlert) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "service_alert_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.ALERT_ID, serviceAlert.f23190b);
        aVar.mo49939g(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(serviceAlert.f23191c.f23213b));
        mo44545v2(aVar.mo49933a());
        startActivity(ServiceAlertDetailsActivity.m39147A2(this, serviceAlert, (ServerId) null));
    }

    /* renamed from: D2 */
    public abstract void mo45692D2(T t);

    /* renamed from: e2 */
    public void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.reports_list_activity);
        this.f39187Z = (SectionedListView) findViewById(R.id.reports_sectioned_list_view);
        this.f39184U = new C15206e();
        if (this.f39186Y == null) {
            this.f39186Y = getIntent().getParcelableExtra("reportsListData");
        }
        if (this.f39185X == null) {
            this.f39185X = (ServerId) getIntent().getParcelableExtra("reportsListDataId");
        }
        mo45692D2(this.f39186Y);
        C14741h hVar = new C14741h();
        hVar.mo44745a(1, mo44542u1());
        ((MoovitAnchoredBannerAdFragment) ((FragmentContainerView) findViewById(R.id.banner_ad_fragment)).getFragment()).mo44739o2(AdSource.REPORTS_SCREEN_BANNER, hVar);
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: z2 */
    public final View mo45696z2() {
        C19047a.C19048a aVar = C19047a.f48441d;
        if (!((Boolean) ((C19047a) getSystemService("user_configuration")).mo51505b(C20199a.f51284k0)).booleanValue()) {
            return null;
        }
        View inflate = getLayoutInflater().inflate(R.layout.reports_footer_layout, this.f39187Z, false);
        inflate.findViewById(R.id.add_report).setOnClickListener(new C4051q(this, 24));
        return inflate;
    }
}
