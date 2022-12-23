package com.moovit.ticketing.purchase.filter;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b90.C7562a;
import b90.C7563b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.image.model.Image;
import com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep;
import com.moovit.ticketing.ticket.TicketAgency;
import g50.C25731e;
import java.util.Collections;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import o00.C18676l;
import o00.C18681n;
import p495fq.C17057b;
import p543hq.C17474b;
import v80.C13183a;
import w80.C13219a;

/* renamed from: com.moovit.ticketing.purchase.filter.a */
public class C7688a extends C13183a<PurchaseFilterSelectionStep, PurchaseFilterSelectionStepResult> {

    /* renamed from: q */
    public static final /* synthetic */ int f23363q = 0;

    /* renamed from: p */
    public C18676l f23364p;

    /* renamed from: com.moovit.ticketing.purchase.filter.a$a */
    public static /* synthetic */ class C7689a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23365a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep$FilterPresentationType[] r0 = com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep.FilterPresentationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23365a = r0
                com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep$FilterPresentationType r1 = com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep.FilterPresentationType.INDICATORS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23365a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep$FilterPresentationType r1 = com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep.FilterPresentationType.CARDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.purchase.filter.C7688a.C7689a.<clinit>():void");
        }
    }

    /* renamed from: p2 */
    public static void m17558p2(C7688a aVar, PurchaseFilter purchaseFilter) {
        PurchaseFilterSelectionStep purchaseFilterSelectionStep = (PurchaseFilterSelectionStep) aVar.f32728o;
        PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult = new PurchaseFilterSelectionStepResult(purchaseFilterSelectionStep.f23246b, purchaseFilterSelectionStep.f23353h, purchaseFilter.f23339b);
        PurchaseFilterConfirmation purchaseFilterConfirmation = purchaseFilter.f23343f;
        if (purchaseFilterConfirmation != null) {
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "confirmation_dialog");
            aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, ((PurchaseFilterSelectionStep) aVar.f32728o).f23247c);
            aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_ID, purchaseFilterSelectionStepResult.f23359d);
            aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, purchaseFilter.f23341d);
            aVar.mo46797j2(aVar2.mo49933a());
            AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a(aVar.requireContext()).mo47682k("ConfirmationDialog");
            k.mo47676e(C12868d.img_location, false);
            AlertDialogFragment.C15856a h = k.mo47684m(purchaseFilterConfirmation.f23345b).mo47679h(purchaseFilterConfirmation.f23346c);
            h.mo47672a(purchaseFilterConfirmation.f23347d, "positiveButton");
            h.mo47672a(purchaseFilterConfirmation.f23348e, "negativeButton");
            h.f41328b.putParcelable("result", purchaseFilterSelectionStepResult);
            h.mo47675d(false);
            AlertDialogFragment b = h.mo47673b();
            b.setTargetFragment(aVar, 0);
            aVar.mo46795h2(b);
            return;
        }
        C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "item_selected");
        aVar3.mo49939g(AnalyticsAttributeKey.SELECTED_ID, purchaseFilterSelectionStepResult.f23359d);
        aVar3.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, purchaseFilter.f23341d);
        aVar3.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, purchaseFilterSelectionStep.f23247c);
        aVar.mo46797j2(aVar3.mo49933a());
        aVar.mo40058n2(purchaseFilterSelectionStepResult);
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        super.mo19423V0(bundle, str);
        mo24105q2((PurchaseFilterSelectionStepResult) null);
    }

    public final void onCreate(Bundle bundle) {
        C18676l lVar;
        C13219a aVar;
        super.onCreate(bundle);
        PurchaseFilterSelectionStep purchaseFilterSelectionStep = (PurchaseFilterSelectionStep) this.f32728o;
        int i = C7689a.f23365a[purchaseFilterSelectionStep.f23354i.ordinal()];
        if (i == 1) {
            lVar = new C7563b(new C25731e(this, 1));
            TicketAgency ticketAgency = purchaseFilterSelectionStep.f23356k;
            if (ticketAgency != null) {
                aVar = new C13219a(ticketAgency.mo24223c(), ticketAgency.mo24222b(), (Image) null, (PurchaseFilters) null);
            } else {
                aVar = new C13219a((String) null, (Image) null, (Image) null, (PurchaseFilters) null);
            }
            aVar.addAll(purchaseFilterSelectionStep.f23355j);
            lVar.mo51055y(Collections.singletonList(aVar));
        } else if (i == 2) {
            lVar = new C7562a(purchaseFilterSelectionStep.f23350e, purchaseFilterSelectionStep.f23352g, new C17057b(this, 5));
            lVar.mo51055y(Collections.singletonList(new C18676l.C18678b(purchaseFilterSelectionStep.f23351f, purchaseFilterSelectionStep.f23355j)));
        } else {
            StringBuilder k = C13555b.m33972k("Unexpected value: ");
            k.append(purchaseFilterSelectionStep.f23354i);
            throw new IllegalStateException(k.toString());
        }
        this.f23364p = lVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.purchase_ticket_filter_selection_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C12869e.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        if (((PurchaseFilterSelectionStep) this.f32728o).f23354i == PurchaseFilterSelectionStep.FilterPresentationType.INDICATORS) {
            Context context = view.getContext();
            SparseIntArray sparseIntArray = new SparseIntArray(1);
            sparseIntArray.append(1, C12868d.divider_horizontal);
            recyclerView.mo4593g(new C18681n(context, sparseIntArray, false), -1);
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        C18676l lVar = this.f23364p;
        if (adapter != lVar) {
            recyclerView.mo4627l0(lVar);
        }
    }

    /* renamed from: q2 */
    public final void mo24105q2(PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult) {
        boolean z;
        String str;
        if (purchaseFilterSelectionStepResult != null) {
            z = true;
        } else {
            z = false;
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
        if (z) {
            str = "confirmation_dialog_confirmed";
        } else {
            str = "confirmation_dialog_dismiss";
        }
        aVar.mo49939g(analyticsAttributeKey, str);
        mo46797j2(aVar.mo49933a());
        if (z) {
            mo40058n2(purchaseFilterSelectionStepResult);
        }
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("ConfirmationDialog".equals(str)) {
            PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult = (PurchaseFilterSelectionStepResult) bundle.getParcelable("result");
            if (i == -1 && purchaseFilterSelectionStepResult != null) {
                mo24105q2(purchaseFilterSelectionStepResult);
            } else if (i == -2) {
                mo24105q2((PurchaseFilterSelectionStepResult) null);
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
