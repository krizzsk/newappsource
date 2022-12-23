package com.moovit.ticketing.ticket;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import c00.C13717b;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.util.time.C7925b;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12875k;
import p926xv.C20626g;
import s90.C13076d;

public class TicketListItemView extends ListItemView {

    /* renamed from: com.moovit.ticketing.ticket.TicketListItemView$a */
    public static /* synthetic */ class C7750a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23515a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.ticketing.ticket.Ticket$Status[] r0 = com.moovit.ticketing.ticket.Ticket.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23515a = r0
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.NOT_YET_VALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23515a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.VALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23515a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.VALID_AUTO_ACTIVATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23515a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23515a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.EXPIRED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.ticket.TicketListItemView.C7750a.<clinit>():void");
        }
    }

    public TicketListItemView() {
        throw null;
    }

    public TicketListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private View getActivateActionAccessoryView() {
        View accessoryView = getAccessoryView();
        if (accessoryView != null && "activate".equals(accessoryView.getTag(C12869e.view_tag_param1))) {
            return accessoryView;
        }
        setAccessoryLayoutMode(2);
        setAccessoryView(C12870f.ticket_list_item_accessory);
        View accessoryView2 = getAccessoryView();
        accessoryView2.setTag(C12869e.view_tag_param1, "activate");
        return accessoryView2;
    }

    private void setSingleTicket(Ticket ticket) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        Image b = ticket.f23478g.mo24222b();
        int i2 = 0;
        if (b == null) {
            b = new ResourceImage(C12868d.img_single_ticket_24, new String[0]);
        }
        setIcon(b);
        setTitle((CharSequence) ticket.f23476e);
        setIconTopStartDecorationDrawable(C12875k.m32666f(ticket.f23488q));
        Ticket.Alert alert = ticket.f23488q;
        if (alert != null && C12875k.C12876a.f31877a[alert.ordinal()] == 1) {
            i = C12873i.tickets_center_ticketing_failed;
        } else {
            i = 0;
        }
        if (i != 0) {
            setSubtitle(i);
        } else {
            int i3 = C7750a.f23515a[ticket.f23475d.ordinal()];
            if (i3 == 1) {
                long j = ticket.f23481j;
                if (j != -1) {
                    Context context = getContext();
                    str = context.getString(C12873i.ticket_item_valid_from, new Object[]{C7925b.m18023k(context, j)});
                } else {
                    str = m17693u(getContext(), ticket.f23480i);
                }
                setSubtitle((CharSequence) str);
            } else if (i3 == 2) {
                if (Ticket.Alert.EXPIRING.equals(ticket.f23488q)) {
                    Context context2 = getContext();
                    long j2 = ticket.f23484m;
                    long n = C7925b.m18026n(System.currentTimeMillis(), j2);
                    if (n > 120) {
                        str2 = context2.getString(C12873i.ticket_item_expires_on, new Object[]{C7925b.m18023k(context2, j2)});
                    } else {
                        str2 = context2.getString(C12873i.ticket_item_expires_in, new Object[]{C7925b.m18019g(context2, TimeUnit.MINUTES.toMillis(n))});
                    }
                } else {
                    str2 = m17693u(getContext(), ticket.f23480i);
                }
                setSubtitle((CharSequence) str2);
            } else if (i3 == 3) {
                long j3 = ticket.f23481j;
                if (j3 != -1) {
                    Context context3 = getContext();
                    str3 = context3.getString(C12873i.ticket_item_valid_from, new Object[]{C7925b.m18023k(context3, j3)});
                } else {
                    str3 = m17693u(getContext(), ticket.f23480i);
                }
                setSubtitle((CharSequence) str3);
            } else if (i3 == 4) {
                long j4 = ticket.f23484m;
                if (j4 > System.currentTimeMillis() || Ticket.Alert.EXPIRING.equals(ticket.f23488q)) {
                    Context context4 = getContext();
                    str4 = context4.getString(C12873i.ticket_item_active_to, new Object[]{C7925b.m18023k(context4, j4)});
                } else {
                    str4 = m17693u(getContext(), ticket.f23480i);
                }
                setSubtitle((CharSequence) str4);
            } else if (i3 == 5) {
                long j5 = ticket.f23483l;
                long j6 = ticket.f23484m;
                if (j6 <= -1) {
                    j6 = ticket.f23482k;
                }
                if (j5 > -1) {
                    Context context5 = getContext();
                    setSubtitle((CharSequence) context5.getString(C12873i.ticket_item_activated_on, new Object[]{C7925b.m18023k(context5, j5)}));
                } else if (j6 > -1) {
                    Context context6 = getContext();
                    setSubtitle((CharSequence) context6.getString(C12873i.ticket_item_expired_on, new Object[]{C7925b.m18023k(context6, j6)}));
                } else {
                    setSubtitle((CharSequence) m17693u(getContext(), ticket.f23480i));
                }
            }
        }
        View activateActionAccessoryView = getActivateActionAccessoryView();
        if (!Ticket.Status.VALID.equals(ticket.f23475d)) {
            i2 = 8;
        }
        activateActionAccessoryView.setVisibility(i2);
    }

    /* renamed from: u */
    public static String m17693u(Context context, long j) {
        return context.getString(C12873i.ticket_item_purchased_on, new Object[]{C7925b.m18023k(context, j)});
    }

    public void setTicket(Ticket ticket) {
        C7755c cVar = ticket.f23487p;
        if (cVar != null) {
            Set<Ticket.Status> set = C13076d.f32344g;
            if (set.contains(ticket.f23475d)) {
                Image b = ticket.f23478g.mo24222b();
                int i = 0;
                if (b == null) {
                    b = new ResourceImage(C12868d.img_single_ticket_24, new String[0]);
                }
                setIcon(b);
                setTitle((CharSequence) cVar.f23534b);
                setIconTopStartDecorationDrawable(C12875k.m32666f(ticket.f23488q));
                int j = C13717b.m34263j(set, new C20626g(cVar, 1));
                setSubtitle((CharSequence) getContext().getString(C12873i.ticket_details_passbook_remaining_banner, new Object[]{Integer.valueOf(j)}));
                View activateActionAccessoryView = getActivateActionAccessoryView();
                if (!Ticket.Status.VALID.equals(ticket.f23475d)) {
                    i = 8;
                }
                activateActionAccessoryView.setVisibility(i);
                return;
            }
        }
        setSingleTicket(ticket);
    }

    public TicketListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
