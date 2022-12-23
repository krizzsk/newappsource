package com.moovit.ticketing.activation;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.ContentLoadingProgressBar;
import c00.C13717b;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.bottomsheet.C13924b;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.ticketing.ticket.C7755c;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import java.util.Arrays;
import l30.C5592u;
import m80.C12869e;
import m80.C12870f;
import m80.C12887v;
import p054d0.C4291k0;
import p543hq.C17474b;
import p664mu.C18450i;
import p926xv.C20626g;

/* renamed from: com.moovit.ticketing.activation.a */
public class C7632a extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f23237h = 0;

    /* renamed from: com.moovit.ticketing.activation.a$a */
    public interface C7633a {
        /* renamed from: k */
        void mo23973k(Ticket ticket);
    }

    public C7632a() {
        super(MoovitActivity.class);
    }

    /* renamed from: T1 */
    public static void m17440T1(View view, boolean z) {
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) view.findViewById(C12869e.progress_bar);
        if (z) {
            contentLoadingProgressBar.mo3436b();
            int[] iArr = {C12869e.activation_image, C12869e.title, C12869e.message, C12869e.confirm, C12869e.cancel};
            for (int i = 0; i < 5; i++) {
                View findViewById = view.findViewById(iArr[i]);
                if (findViewById != null) {
                    findViewById.setVisibility(4);
                }
            }
            return;
        }
        contentLoadingProgressBar.mo3435a();
        int[] iArr2 = {C12869e.activation_image, C12869e.title, C12869e.message, C12869e.confirm, C12869e.cancel};
        for (int i2 = 0; i2 < 5; i2++) {
            View findViewById2 = view.findViewById(iArr2[i2]);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        }
    }

    /* renamed from: S1 */
    public final void mo23975S1(Ticket ticket) {
        mo23976U1(ticket, "confirm_clicked");
        mo46753L1(C7633a.class, new C4291k0(ticket, 17));
        dismissAllowingStateLoss();
    }

    /* renamed from: U1 */
    public final void mo23976U1(Ticket ticket, String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        aVar.mo49939g(AnalyticsAttributeKey.ID, ticket.f23474c);
        C7755c cVar = ticket.f23487p;
        if (cVar != null) {
            aVar.mo49935c(AnalyticsAttributeKey.COUNT, cVar.f23536d);
            aVar.mo49935c(AnalyticsAttributeKey.ACTIVE_COUNT, C13717b.m34263j(Arrays.asList(new Ticket.Status[]{Ticket.Status.ACTIVE, Ticket.Status.EXPIRED}), new C20626g(cVar, 1)) + 1);
        }
        mo22564R1(aVar.mo49933a());
    }

    /* renamed from: V1 */
    public final void mo23977V1(String str, C7755c cVar, String str2) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "activate_ticket_confirm_dialog");
        aVar.mo49939g(AnalyticsAttributeKey.ACTIVATION_DIALOG_STATE, str);
        aVar.mo49939g(AnalyticsAttributeKey.ID, str2);
        if (cVar != null) {
            aVar.mo49935c(AnalyticsAttributeKey.COUNT, cVar.f23536d);
            aVar.mo49935c(AnalyticsAttributeKey.ACTIVE_COUNT, C13717b.m34263j(Arrays.asList(new Ticket.Status[]{Ticket.Status.ACTIVE, Ticket.Status.EXPIRED}), new C20626g(cVar, 1)) + 1);
        }
        mo22564R1(aVar.mo49933a());
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new C13924b(requireContext());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.ticket_activation_confirmation_dialog_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TicketId ticketId = (TicketId) mo46752K1().getParcelable("ticket_id");
        if (ticketId != null) {
            m17440T1(view, true);
            C12887v.m32668b().mo39736g(false).addOnSuccessListener((Activity) requireActivity(), new C5592u(1, this, view, ticketId)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C18450i(this, view, 1));
            return;
        }
        throw new IllegalStateException("Did you use TicketActivationConfirmationDialogFragment.newInstance(...)?");
    }
}
