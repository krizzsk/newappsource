package h90;

import android.content.Context;
import android.widget.CompoundButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAutoLoadIntent;
import h90.C12740b;
import m80.C12873i;
import p543hq.C17474b;

/* renamed from: h90.c */
public final /* synthetic */ class C12744c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C12740b.C12743c f31483a;

    /* renamed from: b */
    public final /* synthetic */ C12739a f31484b;

    /* renamed from: c */
    public final /* synthetic */ SwitchMaterial f31485c;

    public /* synthetic */ C12744c(C12740b.C12743c cVar, C12739a aVar, SwitchMaterial switchMaterial) {
        this.f31483a = cVar;
        this.f31484b = aVar;
        this.f31485c = switchMaterial;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C12740b.C12743c cVar = this.f31483a;
        C12739a aVar = this.f31484b;
        SwitchMaterial switchMaterial = this.f31485c;
        cVar.getClass();
        switchMaterial.setImportantForAccessibility(2);
        C12740b bVar = C12740b.this;
        int i = C12740b.f31473s;
        bVar.getClass();
        ServerId serverId = aVar.f31467a;
        String str = aVar.f31468b.f23495b;
        if (z) {
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "toggle_on_clicked");
            aVar2.mo49938f(AnalyticsAttributeKey.AMOUNT, aVar.f31472f);
            bVar.mo46797j2(aVar2.mo49933a());
            bVar.startActivityForResult(PurchaseTicketActivity.m17465z2(bVar.requireContext(), new PurchaseStoredValueAutoLoadIntent(serverId, str)), 2505);
            return;
        }
        C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "toggle_off_clicked");
        aVar3.mo49938f(AnalyticsAttributeKey.AMOUNT, aVar.f31472f);
        bVar.mo46797j2(aVar3.mo49933a());
        AlertDialogFragment.C15856a i2 = new AlertDialogFragment.C15856a((Context) bVar.requireActivity()).mo47682k("disable_auto_load_dialog_tag").mo47684m(bVar.getString(C12873i.payment_autoload_deactivate_popup_title, aVar.f31468b.mo24223c())).mo47678g(C12873i.payment_autoload_deactivate_popup_msg).mo47681j(C12873i.payment_autoload_deactivate_popup_yes_button).mo47680i(C12873i.action_cancel);
        i2.f41328b.putParcelable("providerId", serverId);
        i2.f41328b.putString("agencyKey", str);
        i2.mo47675d(false);
        i2.mo47673b().show(bVar.getChildFragmentManager(), "disable_auto_load_dialog_tag");
    }
}
