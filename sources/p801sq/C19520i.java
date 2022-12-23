package p801sq;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import c00.C13717b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.purchase.PurchaseGenericIntent;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryIntent;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.TicketValidationActivity;
import com.moovit.ticketing.wallet.UserWalletActivity;
import com.moovit.view.dialogs.BottomSheetMenuDialogFragment;
import com.tranzmate.R;
import com.usebutton.sdk.internal.util.DiskLruCache;
import e20.C16783l;
import j90.C12789b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m80.C12887v;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;
import p80.C12991b;
import p977zz.C20930c;
import s90.C13076d;

/* renamed from: sq.i */
public abstract class C19520i<A extends MoovitAppActivity> extends C18116c<A> implements BottomSheetMenuDialogFragment.C7965a {

    /* renamed from: w */
    public static final /* synthetic */ int f49609w = 0;

    /* renamed from: s */
    public Runnable f49610s = null;

    /* renamed from: t */
    public C13076d f49611t = null;

    /* renamed from: u */
    public int f49612u;

    /* renamed from: v */
    public final AtomicBoolean f49613v = new AtomicBoolean(false);

    public C19520i(Class<A> cls) {
        super(cls);
    }

    /* renamed from: A2 */
    public static boolean m46876A2(C12991b bVar, Itinerary itinerary) {
        if (!bVar.mo39881b(TicketingAgencyCapability.JOURNEY_TICKETS) || itinerary == null || !C16783l.m42470b(itinerary, 2, 9)) {
            return false;
        }
        return true;
    }

    /* renamed from: B2 */
    public final void mo51887B2() {
        PurchaseIntent purchaseIntent;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "purchase_button_clicked");
        mo46797j2(aVar.mo49933a());
        Itinerary z2 = mo51886z2();
        if (m46876A2((C12991b) mo46776J1("TICKETING_CONFIGURATION"), z2)) {
            purchaseIntent = new PurchaseItineraryIntent(z2);
        } else {
            purchaseIntent = new PurchaseGenericIntent();
        }
        startActivity(PurchaseTicketActivity.m17465z2(requireContext(), purchaseIntent));
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("TICKETING_CONFIGURATION");
    }

    /* renamed from: l0 */
    public final void mo24850l0(BottomSheetMenuDialogFragment.MenuItem menuItem) {
        C12789b bVar;
        String str = menuItem.f24112b;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals(DiskLruCache.VERSION_1)) {
                    c = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tickets");
                mo46797j2(aVar.mo49933a());
                startActivity(UserWalletActivity.m17744y2(requireActivity()));
                return;
            case 1:
                C13076d dVar = this.f49611t;
                if (dVar != null && (bVar = (C12789b) C13717b.m34256c(dVar.f32348c)) != null) {
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "provider_validation_clicked");
                    aVar2.mo49937e(AnalyticsAttributeKey.ID, bVar.f31612a);
                    mo46797j2(aVar2.mo49933a());
                    startActivity(TicketValidationActivity.m17717y2(requireContext(), bVar.f31612a, (String) null, (TicketId) null));
                    return;
                }
                return;
            case 2:
                mo51887B2();
                return;
            default:
                return;
        }
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        C17885a.m44441i(button, 0, R.attr.roundedButtonMediumStyle, 2131953355);
        button.setText((CharSequence) null);
        C17885a.m44465u0(button, (Drawable) null, 2);
    }

    /* renamed from: q2 */
    public final Task<Boolean> mo50555q2() {
        boolean z;
        C12991b bVar = (C12991b) mo46776J1("TICKETING_CONFIGURATION");
        if (m46876A2(bVar, mo51886z2())) {
            return Tasks.forResult(Boolean.TRUE);
        }
        if (bVar.mo39881b(TicketingAgencyCapability.TICKETS) || bVar.mo39881b(TicketingAgencyCapability.STORED_VALUE)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Tasks.forResult(Boolean.TRUE);
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        String str;
        String str2;
        if (this.f49610s != null) {
            Itinerary z2 = mo51886z2();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
            if (view.isActivated()) {
                str = "tickets_button_clicked";
            } else {
                str = "purchase_button_clicked";
            }
            aVar.mo49939g(analyticsAttributeKey, str);
            AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.ITINERARY_GUID;
            if (z2 != null) {
                str2 = z2.f41894b;
            } else {
                str2 = null;
            }
            aVar.mo49939g(analyticsAttributeKey2, str2);
            aVar.mo49939g(AnalyticsAttributeKey.SOURCE, "bar");
            mo46797j2(aVar.mo49933a());
            this.f49610s.run();
        }
    }

    /* renamed from: s2 */
    public final void mo50557s2(Button button) {
        String str;
        mo50553o2();
        if (!button.isActivated()) {
            str = getString(R.string.quick_action_pay);
        } else if (this.f49612u == 0) {
            str = getString(R.string.quick_action_tickets);
        } else {
            str = String.format(C20930c.m49020b(button.getContext()), "%s (%d)", new Object[]{getString(R.string.quick_action_tickets), Integer.valueOf(this.f49612u)});
        }
        button.setText(str);
        C17885a.m44467v0(button, R.drawable.ic_ticket_full_16);
    }

    /* renamed from: u2 */
    public final void mo50559u2() {
        super.mo50559u2();
        this.f49610s = null;
    }

    /* renamed from: y2 */
    public final void mo50563y2(Button button) {
        if (this.f49613v.compareAndSet(false, true)) {
            mo50561w2(true);
            C12887v.m32668b().mo39736g(false).addOnCompleteListener((Activity) requireActivity(), new C19519h(this, 0));
        }
    }

    /* renamed from: z2 */
    public Itinerary mo51886z2() {
        return null;
    }
}
