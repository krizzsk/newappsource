package com.moovit.ticketing.ticket;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.widget.TextView;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.ContentSwipeRefreshLayout;
import com.moovit.commons.view.FormatTextView;
import com.moovit.ticketing.activation.BaseTicketActivationActivity;
import com.moovit.util.time.C7925b;
import java.util.HashSet;
import java.util.Set;
import m80.C12869e;
import m80.C12870f;
import m80.C12871g;
import m80.C12887v;
import p054d0.C4291k0;
import p543hq.C17474b;
import p80.C12995d;
import q00.C19047a;

public class TicketDetailsActivity extends BaseTicketActivationActivity {

    /* renamed from: m0 */
    public static final /* synthetic */ int f23504m0 = 0;

    /* renamed from: Y */
    public final C7745a f23505Y = new C7745a();

    /* renamed from: Z */
    public final C7746b f23506Z = new C7746b(this);

    /* renamed from: l0 */
    public ContentSwipeRefreshLayout f23507l0;

    /* renamed from: com.moovit.ticketing.ticket.TicketDetailsActivity$a */
    public class C7745a extends BroadcastReceiver {
        public C7745a() {
        }

        public final void onReceive(Context context, Intent intent) {
            TicketDetailsActivity ticketDetailsActivity = TicketDetailsActivity.this;
            int i = TicketDetailsActivity.f23504m0;
            ticketDetailsActivity.mo23966C2(true);
        }
    }

    /* renamed from: com.moovit.ticketing.ticket.TicketDetailsActivity$b */
    public class C7746b extends TicketRefreshHelper {
        public C7746b(Context context) {
            super(context);
        }

        /* renamed from: f */
        public final void mo24235f() {
            C12887v.m32668b().mo39737i();
        }
    }

    /* renamed from: com.moovit.ticketing.ticket.TicketDetailsActivity$c */
    public static /* synthetic */ class C7747c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23509a;

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
                f23509a = r0
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.ISSUING_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23509a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.NOT_YET_VALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23509a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.VALID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23509a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.VALID_AUTO_ACTIVATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23509a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.ACTIVE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23509a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.ticket.TicketDetailsActivity.C7747c.<clinit>():void");
        }
    }

    /* renamed from: I2 */
    public static void m17681I2(TextView textView, FormatTextView formatTextView, int i, long j) {
        Context context = textView.getContext();
        if (i == 0 || j < 0) {
            UiUtils.m40238F(8, textView, formatTextView);
            return;
        }
        textView.setText(i);
        formatTextView.setArguments(C7925b.m18022j(context, j), C7925b.m18024l(context, j));
        UiUtils.m40238F(0, textView, formatTextView);
    }

    /* renamed from: B2 */
    public final void mo23965B2() {
        int i;
        setContentView(C12870f.ticket_details_activity);
        boolean booleanValue = ((Boolean) ((C19047a) mo44537r1("CONFIGURATION")).mo51505b(C12995d.f32168d)).booleanValue();
        ViewStub viewStub = (ViewStub) findViewById(C12869e.ticket_view);
        if (booleanValue) {
            i = C12870f.ticket_card_view_item;
        } else {
            i = C12870f.ticket_view;
        }
        viewStub.setLayoutResource(i);
        viewStub.inflate();
        ContentSwipeRefreshLayout contentSwipeRefreshLayout = (ContentSwipeRefreshLayout) findViewById(C12869e.swipe_refresh_layout);
        this.f23507l0 = contentSwipeRefreshLayout;
        contentSwipeRefreshLayout.setOnRefreshListener(new C4291k0(this, 19));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0065  */
    /* renamed from: G2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23970G2(java.util.List<com.moovit.ticketing.ticket.Ticket> r19) {
        /*
            r18 = this;
            r6 = r18
            java.lang.Object r0 = c00.C13717b.m34256c(r19)
            r7 = r0
            com.moovit.ticketing.ticket.Ticket r7 = (com.moovit.ticketing.ticket.Ticket) r7
            int r0 = m80.C12869e.ticket_view
            android.view.View r0 = r6.findViewById(r0)
            com.moovit.ticketing.ticket.d r0 = (com.moovit.ticketing.ticket.C7757d) r0
            r0.setTicket(r7)
            int r0 = m80.C12869e.passbook_info
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.moovit.ticketing.ticket.c r1 = r7.f23487p
            r8 = 8
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L_0x004c
            java.util.Set<com.moovit.ticketing.ticket.Ticket$Status> r2 = s90.C13076d.f32344g
            com.moovit.ticketing.ticket.Ticket$Status r3 = r7.f23475d
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x004c
            xv.g r3 = new xv.g
            r3.<init>(r1, r9)
            int r1 = c00.C13717b.m34263j(r2, r3)
            int r2 = m80.C12873i.ticket_details_passbook_remaining_banner
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r10] = r1
            java.lang.String r1 = r6.getString(r2, r3)
            r0.setText(r1)
            r0.setVisibility(r10)
            goto L_0x004f
        L_0x004c:
            r0.setVisibility(r8)
        L_0x004f:
            int r0 = m80.C12869e.valid_from_date_title
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = m80.C12869e.valid_from_date_value
            android.view.View r1 = r6.findViewById(r1)
            com.moovit.commons.view.FormatTextView r1 = (com.moovit.commons.view.FormatTextView) r1
            com.moovit.ticketing.ticket.c r2 = r7.f23487p
            if (r2 == 0) goto L_0x0065
            r2 = 1
            goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            if (r2 != 0) goto L_0x006b
            long r2 = r7.f23481j
            goto L_0x006d
        L_0x006b:
            r2 = -1
        L_0x006d:
            int r4 = m80.C12873i.ticket_details_label_valid_from
            m17681I2(r0, r1, r4, r2)
            int r0 = m80.C12869e.expire_date_title
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = m80.C12869e.expire_date_value
            android.view.View r1 = r6.findViewById(r1)
            com.moovit.commons.view.FormatTextView r1 = (com.moovit.commons.view.FormatTextView) r1
            com.moovit.ticketing.ticket.Ticket$Status r2 = r7.f23475d
            int[] r11 = com.moovit.ticketing.ticket.TicketDetailsActivity.C7747c.f23509a
            int r2 = r2.ordinal()
            r2 = r11[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x00b1;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00a9;
                case 6: goto L_0x0095;
                default: goto L_0x0091;
            }
        L_0x0091:
            m17681I2(r0, r1, r10, r3)
            goto L_0x00b8
        L_0x0095:
            long r12 = r7.f23483l
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x00a1
            int r2 = m80.C12873i.ticket_details_label_activated_on
            m17681I2(r0, r1, r2, r12)
            goto L_0x00b8
        L_0x00a1:
            int r2 = m80.C12873i.ticket_details_label_expired_on
            long r3 = r7.f23482k
            m17681I2(r0, r1, r2, r3)
            goto L_0x00b8
        L_0x00a9:
            int r2 = m80.C12873i.ticket_details_label_active_until
            long r3 = r7.f23484m
            m17681I2(r0, r1, r2, r3)
            goto L_0x00b8
        L_0x00b1:
            int r2 = m80.C12873i.ticket_details_label_expires_on
            long r3 = r7.f23482k
            m17681I2(r0, r1, r2, r3)
        L_0x00b8:
            int r0 = m80.C12869e.help_title
            android.view.View r0 = r6.findViewById(r0)
            int r1 = m80.C12869e.call_customer_support_button
            android.view.View r1 = r6.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            int r2 = m80.C12869e.send_email_button
            android.view.View r2 = r6.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            java.lang.String r3 = r7.f23486o
            boolean r4 = p977zz.C20964s0.m49090h(r3)
            r4 = r4 ^ r9
            java.lang.String r5 = r7.f23485n
            boolean r12 = p977zz.C20964s0.m49090h(r5)
            r12 = r12 ^ r9
            r13 = 5
            r15 = 2
            r14 = 3
            if (r4 != 0) goto L_0x00ef
            if (r12 != 0) goto L_0x00ef
            android.view.View[] r3 = new android.view.View[r14]
            r3[r10] = r0
            r3[r9] = r1
            r3[r15] = r2
            com.moovit.commons.utils.UiUtils.m40238F(r8, r3)
            goto L_0x0115
        L_0x00ef:
            r0.setVisibility(r10)
            if (r4 == 0) goto L_0x0100
            qu.g r0 = new qu.g
            r0.<init>(r13, r6, r7, r3)
            r1.setOnClickListener(r0)
            r1.setVisibility(r10)
            goto L_0x0103
        L_0x0100:
            r1.setVisibility(r8)
        L_0x0103:
            if (r12 == 0) goto L_0x0112
            bu.h r0 = new bu.h
            r1 = 4
            r0.<init>(r1, r6, r7, r5)
            r2.setOnClickListener(r0)
            r2.setVisibility(r10)
            goto L_0x0115
        L_0x0112:
            r2.setVisibility(r8)
        L_0x0115:
            int r0 = m80.C12869e.more_info_general
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            long r1 = r7.f23480i
            int r3 = m80.C12869e.purchase_date
            android.view.View r3 = r6.findViewById(r3)
            com.moovit.commons.view.FormatTextView r3 = (com.moovit.commons.view.FormatTextView) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = m80.C12873i.ticket_details_label_purchased_on
            java.lang.String r5 = r6.getString(r5)
            r4.append(r5)
            java.lang.String r5 = " %s %s"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.setFormat((java.lang.String) r4)
            java.lang.Object[] r4 = new java.lang.Object[r15]
            java.lang.String r5 = com.moovit.util.time.C7925b.m18022j(r6, r1)
            r4[r10] = r5
            java.lang.String r1 = com.moovit.util.time.C7925b.m18024l(r6, r1)
            r4[r9] = r1
            r3.setArguments(r4)
            int r1 = m80.C12869e.ticket_id
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.util.Locale r2 = p977zz.C20930c.m49020b(r18)
            int r4 = m80.C12873i.ticket_details_label_id
            java.lang.String r4 = r6.getString(r4)
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r12 = r7.f23474c
            r5[r10] = r12
            java.lang.String r2 = java.lang.String.format(r2, r4, r5)
            r1.setText(r2)
            int r2 = m80.C12869e.ticket_description
            android.view.View r2 = r6.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r4 = r7.f23477f
            boolean r4 = p977zz.C20964s0.m49090h(r4)
            if (r4 != 0) goto L_0x0195
            java.lang.String r4 = r7.f23477f
            android.text.Spanned r4 = p216q1.C6133b.m14694a(r4)
            r2.setText(r4)
            android.text.method.MovementMethod r4 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r4)
            r2.setVisibility(r10)
            goto L_0x0198
        L_0x0195:
            r2.setVisibility(r8)
        L_0x0198:
            java.util.concurrent.atomic.AtomicBoolean r12 = new java.util.concurrent.atomic.AtomicBoolean
            r12.<init>(r10)
            r4 = 4
            android.view.View[] r5 = new android.view.View[r4]
            r5[r10] = r0
            r5[r9] = r3
            r5[r15] = r1
            r5[r14] = r2
            java.util.List r5 = java.util.Arrays.asList(r5)
            int r0 = m80.C12869e.expanded_container_action_button
            android.view.View r4 = r6.findViewById(r0)
            int r0 = m80.C12869e.expanded_icon
            android.view.View r16 = r6.findViewById(r0)
            xv.e r3 = new xv.e
            r17 = 1
            r0 = r3
            r1 = r18
            r2 = r12
            r8 = r3
            r3 = r16
            r9 = r4
            r4 = r5
            r10 = r5
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r9.setOnClickListener(r8)
            boolean r0 = r12.get()
            android.view.ViewPropertyAnimator r1 = r16.animate()
            if (r0 == 0) goto L_0x01db
            r2 = 1127481344(0x43340000, float:180.0)
            goto L_0x01dc
        L_0x01db:
            r2 = 0
        L_0x01dc:
            android.view.ViewPropertyAnimator r1 = r1.rotation(r2)
            r1.start()
            if (r0 == 0) goto L_0x01e7
            r0 = 0
            goto L_0x01e9
        L_0x01e7:
            r0 = 8
        L_0x01e9:
            com.moovit.commons.utils.UiUtils.m40237E(r0, r10)
            int r0 = m80.C12869e.divider
            android.view.View r0 = r6.findViewById(r0)
            int r1 = m80.C12869e.action_button
            android.view.View r1 = r6.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            com.moovit.ticketing.ticket.Ticket$Status r2 = r7.f23475d
            int r2 = r2.ordinal()
            r2 = r11[r2]
            r3 = 7
            if (r2 == r14) goto L_0x0233
            r4 = 4
            if (r2 == r4) goto L_0x0218
            if (r2 == r13) goto L_0x0218
            android.view.View[] r2 = new android.view.View[r15]
            r4 = 0
            r2[r4] = r0
            r0 = 1
            r2[r0] = r1
            r0 = 8
            com.moovit.commons.utils.UiUtils.m40238F(r0, r2)
            goto L_0x024b
        L_0x0218:
            int r2 = m80.C12873i.ticket_details_action_show_ticket
            r1.setText(r2)
            x5.c r2 = new x5.c
            r4 = 9
            r2.<init>(r4, r6, r7)
            r1.setOnClickListener(r2)
            android.view.View[] r2 = new android.view.View[r15]
            r4 = 0
            r2[r4] = r0
            r5 = 1
            r2[r5] = r1
            com.moovit.commons.utils.UiUtils.m40238F(r4, r2)
            goto L_0x024b
        L_0x0233:
            r4 = 0
            r5 = 1
            int r2 = m80.C12873i.purchased_ticket_confirmed_action_activate
            r1.setText(r2)
            x5.b r2 = new x5.b
            r2.<init>(r3, r6, r7)
            r1.setOnClickListener(r2)
            android.view.View[] r2 = new android.view.View[r15]
            r2[r4] = r0
            r2[r5] = r1
            com.moovit.commons.utils.UiUtils.m40238F(r4, r2)
        L_0x024b:
            java.lang.String r0 = "CONFIGURATION"
            java.lang.Object r0 = r6.mo44537r1(r0)
            q00.a r0 = (q00.C19047a) r0
            r00.h r1 = p80.C12995d.f32169e
            java.lang.Object r0 = r0.mo51505b(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = m80.C12869e.how_to_use_button
            android.view.View r1 = r6.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            if (r0 == 0) goto L_0x027a
            boolean r2 = android.webkit.URLUtil.isValidUrl(r0)
            if (r2 == 0) goto L_0x027a
            fr.b r2 = new fr.b
            r4 = 10
            r2.<init>(r4, r6, r0)
            r1.setOnClickListener(r2)
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x027f
        L_0x027a:
            r0 = 8
            r1.setVisibility(r0)
        L_0x027f:
            e0.j0 r0 = r7.f23493v
            int r1 = m80.C12869e.view_pass_button
            android.view.View r1 = r6.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            if (r0 == 0) goto L_0x0298
            x5.d r2 = new x5.d
            r2.<init>(r3, r6, r0)
            r1.setOnClickListener(r2)
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x029d
        L_0x0298:
            r0 = 8
            r1.setVisibility(r0)
        L_0x029d:
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.ticketing.ticket.TicketId r2 = r7.f23473b
            java.lang.String r2 = r2.f23513d
            r0.mo49939g(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            com.moovit.ticketing.ticket.c r2 = r7.f23487p
            if (r2 != 0) goto L_0x02b6
            java.lang.String r2 = "single_ticket"
            goto L_0x02b8
        L_0x02b6:
            java.lang.String r2 = "passbook_ticket"
        L_0x02b8:
            r0.mo49939g(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.STATUS
            com.moovit.ticketing.ticket.Ticket$Status r2 = r7.f23475d
            java.lang.String r2 = p379.C25541a.m63894y(r2)
            r0.mo49939g(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AGENCY_ID
            com.moovit.ticketing.ticket.TicketAgency r2 = r7.f23478g
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitAgency> r2 = r2.f23498e
            r3 = 0
            if (r2 == 0) goto L_0x02d3
            com.moovit.network.model.ServerId r3 = r2.getServerId()
        L_0x02d3:
            r0.mo49943k(r1, r3)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AGENCY_NAME
            com.moovit.ticketing.ticket.TicketAgency r2 = r7.f23478g
            java.lang.String r2 = r2.mo24223c()
            r0.mo49945m(r1, r2)
            hq.b r0 = r0.mo49933a()
            r6.mo44545v2(r0)
            com.moovit.ticketing.ticket.TicketDetailsActivity$b r0 = r6.f23506Z
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<androidx.lifecycle.p, com.moovit.ticketing.ticket.TicketRefreshHelper$TicketLifecycleHelper> r1 = r0.f23522g
            java.lang.Object r1 = r1.remove(r6)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r2 = c00.C13717b.m34258e(r1)
            if (r2 == 0) goto L_0x02f9
            goto L_0x0327
        L_0x02f9:
            androidx.lifecycle.Lifecycle r2 = r18.getLifecycle()
            java.util.Iterator r1 = r1.iterator()
        L_0x0301:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0327
            java.lang.Object r3 = r1.next()
            com.moovit.ticketing.ticket.TicketRefreshHelper$TicketLifecycleHelper r3 = (com.moovit.ticketing.ticket.TicketRefreshHelper.TicketLifecycleHelper) r3
            r2.mo4226c(r3)
            com.moovit.ticketing.ticket.Ticket r3 = r3.f23524c
            java.lang.String r4 = r3.f23474c
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<com.moovit.network.model.ServerId, com.moovit.ticketing.ticket.Ticket> r4 = r0.f23521f
            com.moovit.ticketing.ticket.TicketId r5 = r3.f23473b
            com.moovit.network.model.ServerId r5 = r5.f23511b
            boolean r3 = r4.mo47007p(r5, r3)
            if (r3 == 0) goto L_0x0325
            r3 = 0
            r0.mo24247g(r3)
            goto L_0x0301
        L_0x0325:
            r3 = 0
            goto L_0x0301
        L_0x0327:
            com.moovit.ticketing.ticket.TicketDetailsActivity$b r0 = r6.f23506Z
            r0.getClass()
            com.moovit.ticketing.ticket.TicketRefreshHelper$TicketLifecycleHelper r1 = new com.moovit.ticketing.ticket.TicketRefreshHelper$TicketLifecycleHelper
            r1.<init>(r0, r7)
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<androidx.lifecycle.p, com.moovit.ticketing.ticket.TicketRefreshHelper$TicketLifecycleHelper> r0 = r0.f23522g
            r0.mo47001a(r6, r1)
            androidx.lifecycle.Lifecycle r0 = r18.getLifecycle()
            r0.mo4224a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.ticket.TicketDetailsActivity.mo23970G2(java.util.List):void");
    }

    /* renamed from: H2 */
    public final void mo23972H2(boolean z) {
        this.f23507l0.setRefreshing(z);
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(C12871g.ticket_details_menu, menu);
        return true;
    }

    /* renamed from: T1 */
    public final void mo19422T1() {
        super.mo19422T1();
        C12887v.m32674l(this, this.f23505Y);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        C12887v.m32673k(this, this.f23505Y);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1546) {
            super.onActivityResult(i, i2, intent);
        } else {
            C12887v.m32668b().mo39737i();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C12869e.refresh) {
            return super.onOptionsItemSelected(menuItem);
        }
        mo44545v2(new C17474b.C17475a(AnalyticsEventKey.REFRESH_CLICKED).mo49933a());
        this.f23506Z.mo23803d();
        mo23966C2(true);
        return true;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("CONFIGURATION");
        return s1;
    }
}
