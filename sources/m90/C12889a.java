package m90;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.ticketing.activation.BaseTicketActivationActivity;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.TicketValidationActivity;
import com.moovit.util.ParcelableMemRef;
import java.util.Collections;
import m80.C12869e;
import m80.C12871g;
import m80.C12887v;
import m90.C12890b;
import p543hq.C17474b;
import p688nu.C18630b;

/* renamed from: m90.a */
public abstract class C12889a<V extends C12890b> extends C15682c<TicketValidationActivity> {

    /* renamed from: n */
    public final Class<V> f31899n;

    /* renamed from: o */
    public TicketId f31900o;

    public C12889a(Class<V> cls) {
        super(TicketValidationActivity.class);
        this.f31899n = cls;
        setHasOptionsMenu(true);
    }

    /* renamed from: m2 */
    public static void m32680m2(C12889a aVar, C12890b bVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ticketId", bVar.f31901a);
        bundle.putParcelable("receipt", new ParcelableMemRef(bVar));
        aVar.setArguments(bundle);
    }

    /* renamed from: n2 */
    public abstract void mo24271n2(View view, V v);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TicketId ticketId = (TicketId) mo46782Q1().getParcelable("ticketId");
        this.f31900o = ticketId;
        if (ticketId == null) {
            throw new IllegalStateException("You must pass a non-null ticket id in the AbstractTicketReceiptFragment.newInstance(...");
        }
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C12871g.ticket_receipt_menu, menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C12869e.show_ticket_info) {
            return super.onOptionsItemSelected(menuItem);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "view_ticket_details_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, this.f31900o.f23511b);
        aVar.mo49939g(AnalyticsAttributeKey.ID, this.f31900o.f23513d);
        mo46797j2(aVar.mo49933a());
        Context requireContext = requireContext();
        TicketId ticketId = this.f31900o;
        int i = TicketDetailsActivity.f23504m0;
        Intent z2 = BaseTicketActivationActivity.m17425z2(requireContext, TicketDetailsActivity.class, Collections.singletonList(ticketId), Collections.singletonList((Object) null));
        z2.addFlags(603979776);
        startActivity(z2);
        ((TicketValidationActivity) this.f40822c).finish();
        return true;
    }

    public void onStart() {
        super.onStart();
        ((TicketValidationActivity) this.f40822c).setTitle((CharSequence) null);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            Bundle Q1 = mo46782Q1();
            ParcelableMemRef parcelableMemRef = (ParcelableMemRef) Q1.getParcelable("receipt");
            if (parcelableMemRef == null || parcelableMemRef.mo24562b() == null) {
                TicketId ticketId = (TicketId) Q1.getParcelable("ticketId");
                if (ticketId != null) {
                    C12887v.m32668b().mo39735e(ticketId).addOnSuccessListener((Activity) requireActivity(), new C18630b(5, this, view));
                    return;
                }
                return;
            }
            mo24271n2(view, (C12890b) parcelableMemRef.mo24562b());
        }
    }
}
