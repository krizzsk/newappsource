package m80;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import c00.C13723g;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.wallet.center.WalletActivity;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo;
import com.moovit.ticketing.wallet.UserWalletActivity;
import com.moovit.ticketing.wallet.UserWalletTab;
import h90.C12739a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p543hq.C17474b;
import p644lx.C18292g;
import p80.C12991b;
import p899ws.C20406f;
import p977zz.C20964s0;
import s90.C13076d;
import y60.C20709e;

/* renamed from: m80.k */
public final class C12875k {

    /* renamed from: m80.k$a */
    public static /* synthetic */ class C12876a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31877a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.ticketing.ticket.Ticket$Alert[] r0 = com.moovit.ticketing.ticket.Ticket.Alert.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31877a = r0
                com.moovit.ticketing.ticket.Ticket$Alert r1 = com.moovit.ticketing.ticket.Ticket.Alert.PURCHASE_FAILURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31877a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ticketing.ticket.Ticket$Alert r1 = com.moovit.ticketing.ticket.Ticket.Alert.EXPIRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31877a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ticketing.ticket.Ticket$Alert r1 = com.moovit.ticketing.ticket.Ticket.Alert.PASSBOOK_LOW_TRIP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m80.C12875k.C12876a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static SpannableStringBuilder m32661a(PurchaseFilters purchaseFilters) {
        if (purchaseFilters == null || purchaseFilters.f23361b.size() == 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < purchaseFilters.f23361b.size(); i++) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(C20964s0.f52718a);
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(purchaseFilters.f23361b.get(i)).append(": ");
            spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(purchaseFilters.f23362c.get(i));
        }
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public static C17474b m32662b(Ticket ticket) {
        TicketId ticketId = ticket.f23473b;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ticket_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.ID, ticketId.f23513d);
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ticketId.f23511b);
        aVar.mo49939g(AnalyticsAttributeKey.STATUS, C25541a.m63894y(ticket.f23475d));
        return aVar.mo49933a();
    }

    /* renamed from: c */
    public static ArrayList m32663c(C12991b bVar, HashSet hashSet, C13076d dVar) {
        List<C12739a> list;
        boolean z;
        ArrayList arrayList = new ArrayList(4);
        UserWalletTab userWalletTab = UserWalletTab.VALIDATION;
        if (hashSet.contains(userWalletTab) && bVar.mo39881b(TicketingAgencyCapability.PROVIDER_LEVEL_VALIDATION_INFO)) {
            arrayList.add(userWalletTab);
        }
        UserWalletTab userWalletTab2 = UserWalletTab.STORED_VALUE;
        List<Ticket> list2 = null;
        boolean z2 = true;
        if (hashSet.contains(userWalletTab2)) {
            if (dVar != null) {
                list = dVar.f32349d;
            } else {
                list = null;
            }
            if (bVar.mo39881b(TicketingAgencyCapability.STORED_VALUE) || C13723g.m34280a(list, new C18292g(3))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(userWalletTab2);
            }
        }
        UserWalletTab userWalletTab3 = UserWalletTab.AVAILABLE;
        if (hashSet.contains(userWalletTab3)) {
            if (dVar != null) {
                list2 = dVar.f32346a;
            }
            if (!bVar.mo39881b(TicketingAgencyCapability.TICKETS) && !bVar.mo39881b(TicketingAgencyCapability.JOURNEY_TICKETS) && !C13723g.m34280a(list2, new C20406f(7))) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(userWalletTab3);
            }
        }
        UserWalletTab userWalletTab4 = UserWalletTab.EXPIRED;
        if (hashSet.contains(userWalletTab4)) {
            arrayList.add(userWalletTab4);
        }
        return arrayList;
    }

    /* renamed from: d */
    public static String m32664d(Context context, AgencySummaryInfo agencySummaryInfo) {
        int i = agencySummaryInfo.f23576e;
        String str = agencySummaryInfo.f23577f;
        if (i == 1 && str != null) {
            return str;
        }
        if (i <= 0) {
            return null;
        }
        return context.getResources().getQuantityString(C12872h.payment_available_passes, i, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: e */
    public static int m32665e(C12991b bVar) {
        TicketingAgencyCapability ticketingAgencyCapability = TicketingAgencyCapability.STORED_VALUE;
        if (bVar.mo39881b(ticketingAgencyCapability) && bVar.mo39881b(TicketingAgencyCapability.TICKETS)) {
            return C12873i.tickets_center_action_buy_ticket_or_stored_value;
        }
        if (bVar.mo39881b(ticketingAgencyCapability)) {
            return C12873i.tickets_center_stored_topup_bottom_btn;
        }
        if (bVar.mo39881b(TicketingAgencyCapability.TICKETS)) {
            return C12873i.tickets_center_action_buy_ticket;
        }
        return 0;
    }

    /* renamed from: f */
    public static int m32666f(Ticket.Alert alert) {
        if (alert == null) {
            return 0;
        }
        if (C12876a.f31877a[alert.ordinal()] != 1) {
            return C12868d.ic_alert_16_problem;
        }
        return C12868d.ic_alert_ring_16_critical;
    }

    /* renamed from: g */
    public static Intent m32667g(Context context) {
        if (!(!C20709e.m48682a().f52295b.f52291a.isEmpty())) {
            return UserWalletActivity.m17744y2(context);
        }
        int i = WalletActivity.f42881l0;
        Intent intent = new Intent(context, WalletActivity.class);
        intent.putExtra("tab", (Parcelable) null);
        return intent;
    }
}
