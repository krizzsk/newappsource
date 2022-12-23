package com.moovit.ticketing.ticket;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.view.PromotionBannerView;
import com.usebutton.sdk.internal.widget.FullScreenWidgetActivity;
import h90.C12739a;
import j90.C12789b;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l30.C5591t;
import m80.C12869e;
import m80.C12870f;
import m80.C12887v;
import n60.C18531b;
import p453dw.C16740o;
import p501fw.C17102a;
import p543hq.C17474b;
import p739px.C19037a;
import p80.C12991b;
import p853uu.C19996f;
import p858uz.C20061g;
import w40.C25761d;

/* renamed from: com.moovit.ticketing.ticket.g */
public class C7762g extends C15682c<MoovitActivity> {

    /* renamed from: y */
    public static final /* synthetic */ int f23551y = 0;

    /* renamed from: n */
    public final C17102a f23552n = new C17102a(this, 25);

    /* renamed from: o */
    public final C18531b f23553o = new C18531b(this, 5);

    /* renamed from: p */
    public final C19037a f23554p = new C19037a(this, 17);

    /* renamed from: q */
    public final C16740o f23555q = new C16740o(this, 25);

    /* renamed from: r */
    public final C7763a f23556r = new C7763a();

    /* renamed from: s */
    public final C7764b f23557s = new C7764b();

    /* renamed from: t */
    public ViewGroup f23558t;

    /* renamed from: u */
    public PromotionBannerView f23559u;

    /* renamed from: v */
    public ListItemView f23560v;

    /* renamed from: w */
    public View f23561w;

    /* renamed from: x */
    public ListItemView f23562x;

    /* renamed from: com.moovit.ticketing.ticket.g$a */
    public class C7763a implements PromotionBannerView.C7926a {
        public C7763a() {
        }

        /* renamed from: a */
        public final void mo24257a() {
            C7762g gVar = C7762g.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, FullScreenWidgetActivity.EXTRA_DISMISS);
            gVar.mo46797j2(aVar.mo49933a());
        }

        /* renamed from: b */
        public final void mo24258b() {
            C7762g gVar = C7762g.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "purchase_banner_clicked");
            gVar.mo46797j2(aVar.mo49933a());
            C7762g gVar2 = C7762g.this;
            gVar2.startActivity(PurchaseTicketActivity.m17465z2(gVar2.requireContext(), (PurchaseIntent) null));
        }
    }

    /* renamed from: com.moovit.ticketing.ticket.g$b */
    public class C7764b extends BroadcastReceiver {
        public C7764b() {
        }

        public final void onReceive(Context context, Intent intent) {
            C7762g gVar = C7762g.this;
            int i = C7762g.f23551y;
            gVar.mo24255o2();
        }
    }

    /* renamed from: com.moovit.ticketing.ticket.g$c */
    public static /* synthetic */ class C7765c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23565a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.ticketing.ticket.Ticket$Status[] r0 = com.moovit.ticketing.ticket.Ticket.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23565a = r0
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.NOT_YET_VALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23565a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.ISSUING_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23565a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.VALID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23565a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.VALID_AUTO_ACTIVATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23565a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.ACTIVE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23565a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.ticket.C7762g.C7765c.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.ticketing.ticket.g$d */
    public static class C7766d {

        /* renamed from: a */
        public final List<C12789b> f23566a;

        /* renamed from: b */
        public final List<Ticket> f23567b;

        /* renamed from: c */
        public final List<Ticket> f23568c;

        /* renamed from: d */
        public final List<C12739a> f23569d;

        public C7766d() {
            throw null;
        }

        public C7766d(List list, List list2, List list3, List list4) {
            C21100e.m49373x(list, "providerValidations");
            this.f23566a = list;
            C21100e.m49373x(list2, "activeTickets");
            this.f23567b = list2;
            C21100e.m49373x(list3, "validTickets");
            this.f23568c = list3;
            C21100e.m49373x(list4, "storedValues");
            this.f23569d = list4;
        }
    }

    public C7762g() {
        super(MoovitActivity.class);
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireContext()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(3);
        hashSet.add("CONFIGURATION");
        hashSet.add("TICKETING_CONFIGURATION");
        hashSet.add("METRO_CONTEXT");
        return hashSet;
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo24255o2();
    }

    /* renamed from: m2 */
    public final void mo24253m2(int i) {
        int childCount = this.f23558t.getChildCount() - 4;
        int i2 = childCount - i;
        if (i2 != 0) {
            if (i2 > 0) {
                this.f23558t.removeViews(i + 3, i2);
                return;
            }
            Context context = this.f23558t.getContext();
            while (childCount < i) {
                TicketListItemView ticketListItemView = new TicketListItemView(context, (AttributeSet) null);
                ticketListItemView.setLayoutParams(new FixedListView.LayoutParams());
                this.f23558t.addView(ticketListItemView, childCount + 3);
                childCount++;
            }
        }
    }

    /* renamed from: n2 */
    public final void mo24254n2(AnalyticsEventKey analyticsEventKey, int i, int i2, int i3) {
        C17474b.C17475a aVar = new C17474b.C17475a(analyticsEventKey);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tickets");
        aVar.mo49935c(AnalyticsAttributeKey.PROVIDER_VALIDATION_COUNT, i);
        aVar.mo49935c(AnalyticsAttributeKey.ACTIVE_COUNT, i2);
        aVar.mo49935c(AnalyticsAttributeKey.VALID_COUNT, i3);
        aVar.mo49941i(AnalyticsAttributeKey.IS_STORED_VALUE_SUPPORTED, ((C12991b) mo46776J1("TICKETING_CONFIGURATION")).mo39881b(TicketingAgencyCapability.STORED_VALUE));
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: o2 */
    public final void mo24255o2() {
        if (getView() != null && this.f40824e && mo46775H1()) {
            C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C19996f(this, 7)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C5591t(this, 4));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C12870f.tickets_section, viewGroup, false);
        this.f23558t = viewGroup2;
        PromotionBannerView promotionBannerView = (PromotionBannerView) viewGroup2.findViewById(C12869e.first_time_use_view);
        this.f23559u = promotionBannerView;
        promotionBannerView.setListener(this.f23556r);
        ListItemView listItemView = (ListItemView) this.f23558t.findViewById(C12869e.header);
        this.f23560v = listItemView;
        listItemView.getAccessoryView().setOnClickListener(this.f23554p);
        this.f23560v.getAccessoryView().setVisibility(8);
        this.f23561w = this.f23558t.findViewById(C12869e.reconnect_view);
        ListItemView listItemView2 = (ListItemView) this.f23558t.findViewById(C12869e.buy_ticket_view);
        this.f23562x = listItemView2;
        listItemView2.setOnClickListener(this.f23555q);
        return this.f23558t;
    }

    public final void onStart() {
        super.onStart();
        C12887v.m32673k(requireContext(), this.f23557s);
        mo24255o2();
    }

    public final void onStop() {
        super.onStop();
        C12887v.m32674l(requireContext(), this.f23557s);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ac  */
    /* renamed from: p2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24256p2(com.moovit.payment.account.model.PaymentAccount r9) {
        /*
            r8 = this;
            java.lang.String r0 = "CONFIGURATION"
            java.lang.Object r0 = r8.mo46776J1(r0)
            q00.a r0 = (q00.C19047a) r0
            r00.a r1 = p80.C12995d.f32165a
            java.lang.Object r1 = r0.mo51505b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x001c
            android.view.ViewGroup r9 = r8.f23558t
            com.moovit.commons.utils.UiUtils.m40260s(r9)
            return
        L_0x001c:
            w40.d r1 = w40.C25761d.m64299a()
            boolean r1 = r1.mo83590e()
            r2 = 4
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 8
            if (r1 != 0) goto L_0x00bf
            android.view.ViewGroup r9 = r8.f23558t
            com.moovit.commons.utils.UiUtils.m40260s(r9)
            java.lang.String r9 = "TICKETING_CONFIGURATION"
            java.lang.Object r9 = r8.mo46776J1(r9)
            p80.b r9 = (p80.C12991b) r9
            java.util.Set<com.moovit.commons.geo.Polygon> r0 = r9.f32163e
            java.lang.String r1 = "METRO_CONTEXT"
            java.lang.Object r1 = r8.mo46776J1(r1)
            tp.f r1 = (p824tp.C19728f) r1
            android.location.Location r7 = r8.mo46780O1()
            if (r7 == 0) goto L_0x004e
            com.moovit.commons.geo.LatLonE6 r1 = com.moovit.commons.geo.LatLonE6.m40177j(r7)
            goto L_0x0052
        L_0x004e:
            g30.h r1 = r1.f50165a
            com.moovit.commons.geo.LatLonE6 r1 = r1.f16139n
        L_0x0052:
            com.moovit.ticketing.configuration.TicketingAgencyCapability r7 = com.moovit.ticketing.configuration.TicketingAgencyCapability.TICKETS
            boolean r7 = r9.mo39881b(r7)
            if (r7 != 0) goto L_0x0062
            com.moovit.ticketing.configuration.TicketingAgencyCapability r7 = com.moovit.ticketing.configuration.TicketingAgencyCapability.STORED_VALUE
            boolean r7 = r9.mo39881b(r7)
            if (r7 == 0) goto L_0x0075
        L_0x0062:
            java.util.Set<com.moovit.commons.geo.Polygon> r9 = r9.f32163e
            if (r9 != 0) goto L_0x0068
            r9 = 1
            goto L_0x0071
        L_0x0068:
            jq.h r7 = new jq.h
            r7.<init>(r1, r2)
            boolean r9 = c00.C13723g.m34280a(r9, r7)
        L_0x0071:
            if (r9 == 0) goto L_0x0075
            r9 = 1
            goto L_0x0076
        L_0x0075:
            r9 = 0
        L_0x0076:
            if (r9 == 0) goto L_0x00ac
            hq.b$a r9 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r9.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "purchase_banner"
            r9.mo49939g(r1, r2)
            hq.b r9 = r9.mo49933a()
            r8.mo46797j2(r9)
            if (r0 == 0) goto L_0x0099
            z20.a$a r9 = new z20.a$a
            java.lang.String r0 = "ticketing_polygon_se"
            r9.<init>(r0)
            r9.mo52935c()
        L_0x0099:
            com.moovit.design.view.list.ListItemView r9 = r8.f23562x
            r9.setVisibility(r6)
            android.view.View[] r9 = new android.view.View[r3]
            com.moovit.design.view.list.ListItemView r0 = r8.f23560v
            r9[r4] = r0
            com.moovit.view.PromotionBannerView r0 = r8.f23559u
            r9[r5] = r0
            com.moovit.commons.utils.UiUtils.m40238F(r4, r9)
            goto L_0x00be
        L_0x00ac:
            r9 = 3
            android.view.View[] r9 = new android.view.View[r9]
            com.moovit.design.view.list.ListItemView r0 = r8.f23562x
            r9[r4] = r0
            com.moovit.design.view.list.ListItemView r0 = r8.f23560v
            r9[r5] = r0
            com.moovit.view.PromotionBannerView r0 = r8.f23559u
            r9[r3] = r0
            com.moovit.commons.utils.UiUtils.m40238F(r6, r9)
        L_0x00be:
            return
        L_0x00bf:
            r00.h r1 = v50.C20101a.f51007T
            java.lang.Object r0 = r0.mo51505b(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.moovit.payment.account.model.PaymentAccountContextStatus[] r1 = new com.moovit.payment.account.model.PaymentAccountContextStatus[r5]
            com.moovit.payment.account.model.PaymentAccountContextStatus r7 = com.moovit.payment.account.model.PaymentAccountContextStatus.DISCONNECTED
            r1[r4] = r7
            boolean r9 = com.moovit.payment.account.model.PaymentAccount.m64175c(r9, r0, r1)
            if (r9 == 0) goto L_0x010c
            android.view.ViewGroup r9 = r8.f23558t
            com.moovit.commons.utils.UiUtils.m40260s(r9)
            hq.b$a r9 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r9.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "reconnect_banner"
            r9.mo49939g(r1, r2)
            hq.b r9 = r9.mo49933a()
            r8.mo46797j2(r9)
            android.view.View r9 = r8.f23561w
            au.g r1 = new au.g
            r2 = 9
            r1.<init>(r2, r8, r0)
            r9.setOnClickListener(r1)
            com.moovit.design.view.list.ListItemView r9 = r8.f23562x
            r9.setVisibility(r6)
            android.view.View[] r9 = new android.view.View[r3]
            com.moovit.design.view.list.ListItemView r0 = r8.f23560v
            r9[r4] = r0
            android.view.View r0 = r8.f23561w
            r9[r5] = r0
            com.moovit.commons.utils.UiUtils.m40238F(r4, r9)
            return
        L_0x010c:
            A r9 = r8.f40822c
            m80.v r0 = m80.C12887v.m32668b()
            com.google.android.gms.tasks.Task r0 = r0.mo39736g(r4)
            java.util.concurrent.ExecutorService r1 = com.moovit.MoovitExecutors.COMPUTATION
            a0.g r3 = new a0.g
            r3.<init>()
            com.google.android.gms.tasks.Task r0 = r0.continueWithTask(r1, r3)
            s3.s r1 = new s3.s
            r1.<init>(r8, r6)
            com.google.android.gms.tasks.Task r0 = r0.addOnSuccessListener((android.app.Activity) r9, r1)
            zy.d r1 = new zy.d
            r1.<init>(r2)
            com.google.android.gms.tasks.Task r0 = r0.addOnFailureListener((android.app.Activity) r9, (com.google.android.gms.tasks.OnFailureListener) r1)
            g70.a r1 = new g70.a
            r1.<init>(r8, r2)
            r0.addOnCompleteListener((android.app.Activity) r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.ticket.C7762g.mo24256p2(com.moovit.payment.account.model.PaymentAccount):void");
    }
}
