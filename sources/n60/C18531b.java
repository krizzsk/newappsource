package n60;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import c00.C13717b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.dialog.C15859b;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.ticketing.activation.BaseTicketActivationActivity;
import com.moovit.ticketing.purchase.history.TransactionHistoryActivity;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStep;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStepResult;
import com.moovit.ticketing.ticket.C7762g;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.TicketValidationActivity;
import com.moovit.view.PromotionBannerView;
import com.umo.ads.p348o.zzc;
import com.veriff.sdk.internal.C22392rm;
import com.veriff.sdk.views.camera.p978ui.C22912b;
import d90.C12608b;
import ga0.C12717o;
import gc0.C12730f;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import jc0.C12804b;
import m80.C12873i;
import m80.C12875k;
import mf0.C24362h;
import p066e0.C4454r0;
import p543hq.C17474b;
import r60.C19234e;
import r60.C19242g;
import s60.C19438d;
import wb0.C13233c;

/* renamed from: n60.b */
public final /* synthetic */ class C18531b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f47174b;

    /* renamed from: c */
    public final /* synthetic */ Object f47175c;

    public /* synthetic */ C18531b(Object obj, int i) {
        this.f47174b = i;
        this.f47175c = obj;
    }

    public final void onClick(View view) {
        ViewGroup viewGroup;
        boolean z;
        boolean z2 = true;
        switch (this.f47174b) {
            case 0:
                int i = C18532c.f47176y;
                ((C18532c) this.f47175c).mo50936y2();
                return;
            case 1:
                C19242g gVar = (C19242g) this.f47175c;
                int i2 = C19242g.f48870h;
                gVar.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "switch_device_dialog_cancel_clicked");
                gVar.mo22564R1(aVar.mo49933a());
                gVar.mo46753L1(C19234e.class, new C4454r0(13));
                gVar.dismissAllowingStateLoss();
                return;
            case 2:
                C19438d dVar = (C19438d) this.f47175c;
                String str = C19438d.f49441x;
                dVar.getClass();
                ListItemView listItemView = (ListItemView) view;
                PaymentProfile paymentProfile = (PaymentProfile) view.getTag();
                if (!listItemView.isChecked()) {
                    if (!paymentProfile.f42832f) {
                        viewGroup = dVar.f49448t;
                    } else {
                        viewGroup = dVar.f49450v;
                    }
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        ListItemView listItemView2 = (ListItemView) viewGroup.getChildAt(i3);
                        listItemView2.setChecked(false);
                        dVar.f49444p.remove(((PaymentProfile) listItemView2.getTag()).f42828b);
                    }
                    if (dVar.f49444p.size() < dVar.f49443o) {
                        z = true;
                    } else {
                        z = false;
                    }
                    listItemView.setChecked(z);
                } else {
                    listItemView.setChecked(false);
                }
                boolean isChecked = listItemView.isChecked();
                if (isChecked) {
                    dVar.f49444p.add(paymentProfile.f42828b);
                } else {
                    dVar.f49444p.remove(paymentProfile.f42828b);
                }
                ServerId serverId = paymentProfile.f42828b;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "profile_clicked");
                aVar2.mo49937e(AnalyticsAttributeKey.ID, serverId);
                aVar2.mo49941i(AnalyticsAttributeKey.IS_CHECKED, isChecked);
                dVar.mo46797j2(aVar2.mo49933a());
                dVar.mo51852n2();
                Button button = dVar.f49445q;
                if (dVar.f49444p.size() <= 0) {
                    z2 = false;
                }
                button.setEnabled(z2);
                return;
            case 3:
                TransactionHistoryActivity transactionHistoryActivity = (TransactionHistoryActivity) this.f47175c;
                int i4 = TransactionHistoryActivity.f23372Z;
                transactionHistoryActivity.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "transactions_month_change");
                transactionHistoryActivity.mo44545v2(aVar3.mo49933a());
                Calendar instance = Calendar.getInstance();
                int i5 = instance.get(1);
                int i6 = instance.get(2);
                Calendar calendar = (Calendar) transactionHistoryActivity.f23374X.getTag();
                int i7 = calendar.get(1);
                int i8 = calendar.get(2);
                Bundle bundle = new Bundle();
                bundle.putString("tag", "date_picker_dialog");
                bundle.putInt("minYear", i5 - 10);
                bundle.putInt("maxYear", i5);
                bundle.putInt("maxYearMaxMonth", i6);
                bundle.putInt("year", i7);
                bundle.putInt("month", i8);
                bundle.putInt("title", C12873i.set_month);
                bundle.putInt("positiveButton", C12873i.action_choose);
                bundle.putInt("negativeButton", C12873i.action_cancel);
                C15859b bVar = new C15859b();
                bVar.setArguments(bundle);
                bVar.show(transactionHistoryActivity.getSupportFragmentManager(), "date_picker_dialog");
                return;
            case 4:
                C12608b bVar2 = (C12608b) this.f47175c;
                C12608b.C12609a aVar4 = bVar2.f31160p;
                if (aVar4 != null) {
                    ArrayList l = aVar4.mo39408l();
                    if (!C13717b.m34258e(l)) {
                        PurchaseItineraryLegSelectionStep purchaseItineraryLegSelectionStep = (PurchaseItineraryLegSelectionStep) bVar2.f32728o;
                        PurchaseItineraryLegSelectionStepResult purchaseItineraryLegSelectionStepResult = new PurchaseItineraryLegSelectionStepResult(purchaseItineraryLegSelectionStep.f23246b, l);
                        C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "submit_clicked");
                        aVar5.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, purchaseItineraryLegSelectionStep.f23247c);
                        aVar5.mo49938f(AnalyticsAttributeKey.SELECTED_ITEM, bVar2.f31160p.mo39408l());
                        bVar2.mo46797j2(aVar5.mo49933a());
                        bVar2.mo40058n2(purchaseItineraryLegSelectionStepResult);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                C7762g gVar2 = (C7762g) this.f47175c;
                int i9 = C7762g.f23551y;
                gVar2.getClass();
                Ticket ticket = (Ticket) view.getTag();
                if (ticket != null) {
                    int i11 = C7762g.C7765c.f23565a[ticket.f23475d.ordinal()];
                    if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                        gVar2.mo46797j2(C12875k.m32662b(ticket));
                        Context context = view.getContext();
                        TicketId ticketId = ticket.f23473b;
                        int i12 = TicketDetailsActivity.f23504m0;
                        gVar2.startActivity(BaseTicketActivationActivity.m17425z2(context, TicketDetailsActivity.class, Collections.singletonList(ticketId), Collections.singletonList(ticket)));
                        return;
                    } else if (i11 == 5) {
                        gVar2.mo46797j2(C12875k.m32662b(ticket));
                        Context context2 = view.getContext();
                        TicketId ticketId2 = ticket.f23473b;
                        int i13 = TicketValidationActivity.f23570X;
                        gVar2.startActivity(TicketValidationActivity.m17717y2(context2, ticketId2.f23511b, ticketId2.f23512c, ticketId2));
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                int i14 = PromotionBannerView.f23956n;
                PromotionBannerView.C7926a aVar6 = ((PromotionBannerView) this.f47175c).f23968m;
                if (aVar6 != null) {
                    aVar6.mo24258b();
                    return;
                }
                return;
            case 7:
                int i15 = C12717o.f31400r;
                ((C12717o) this.f47175c).dismissAllowingStateLoss();
                return;
            case 8:
                zzc zzc = (zzc) this.f47175c;
                C24362h.m61211f(zzc, "this$0");
                C13233c.f32843b.post(new C12730f(zzc, 1));
                return;
            case 9:
                C12804b bVar3 = (C12804b) this.f47175c;
                int i16 = C12804b.f31666e;
                C24362h.m61211f(bVar3, "this$0");
                C12804b.C12805a aVar7 = bVar3.f31667b;
                if (aVar7 != null) {
                    aVar7.mo35806c(bVar3);
                    return;
                }
                return;
            case 10:
                ((C22392rm) this.f47175c).m54637a(view);
                return;
            default:
                ((C22912b) this.f47175c).m56543b(view);
                return;
        }
    }
}
