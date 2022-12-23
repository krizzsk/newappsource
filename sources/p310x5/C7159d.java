package p310x5;

import a30.C0072d;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p044ui.widget.TextAnnouncementCardView;
import com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketActivity;
import com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketScreenConfiguration;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.map.DocklessVehicleBottomSheetDialog;
import com.moovit.app.wondo.tickets.fullscreen.WondoFullScreenView;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.micromobility.MicroMobilityConfirmationInfo;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.AccountAuthType;
import com.moovit.payment.registration.PaymentRegistrationInfo;
import com.moovit.payment.registration.alternative.AlternativeAuthProvider;
import com.moovit.payment.registration.steps.phone.PhoneAlternativeAuthInstructions;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.usebutton.sdk.internal.events.Events;
import i60.C17559a;
import m30.C5679b;
import mf0.C24362h;
import p066e0.C4436j0;
import p543hq.C17474b;
import p605ki.C18047b;
import r60.C19229a;

/* renamed from: x5.d */
public final /* synthetic */ class C7159d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f22236b;

    /* renamed from: c */
    public final /* synthetic */ Object f22237c;

    /* renamed from: d */
    public final /* synthetic */ Object f22238d;

    public /* synthetic */ C7159d(int i, Object obj, Object obj2) {
        this.f22236b = i;
        this.f22237c = obj;
        this.f22238d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f22236b) {
            case 0:
                ((TextAnnouncementCardView) this.f22237c).lambda$onSetCard$0((TextAnnouncementCard) this.f22238d, view);
                return;
            case 1:
                DocklessVehicleBottomSheetDialog docklessVehicleBottomSheetDialog = (DocklessVehicleBottomSheetDialog) this.f22237c;
                int i = DocklessVehicleBottomSheetDialog.f38877w;
                docklessVehicleBottomSheetDialog.getClass();
                Context context = view.getContext();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "open_app");
                docklessVehicleBottomSheetDialog.mo22564R1(aVar.mo49933a());
                ((AppDeepLink) this.f22238d).mo46946c(context);
                return;
            case 2:
                int i2 = WondoFullScreenView.f40690h;
                ((WondoFullScreenView.C15651a) this.f22237c).mo46677A0((WondoFullScreenDisplayInfo) this.f22238d);
                return;
            case 3:
                C5679b bVar = (C5679b) this.f22237c;
                MicroMobilityAction microMobilityAction = (MicroMobilityAction) this.f22238d;
                ServerId serverId = bVar.f18461n;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
                aVar2.mo49939g(analyticsAttributeKey, "action_clicked");
                AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.ID;
                aVar2.mo49939g(analyticsAttributeKey2, microMobilityAction.f14844b);
                AnalyticsAttributeKey analyticsAttributeKey3 = AnalyticsAttributeKey.ACTION;
                aVar2.mo49939g(analyticsAttributeKey3, microMobilityAction.f14845c);
                AnalyticsAttributeKey analyticsAttributeKey4 = AnalyticsAttributeKey.RIDE_ID;
                aVar2.mo49937e(analyticsAttributeKey4, serverId);
                bVar.mo46797j2(aVar2.mo49933a());
                bVar.f18463p = microMobilityAction;
                MicroMobilityConfirmationInfo microMobilityConfirmationInfo = microMobilityAction.f14847e;
                if (microMobilityConfirmationInfo != null) {
                    C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar3.mo49939g(analyticsAttributeKey, "confirmation_dialog");
                    aVar3.mo49939g(analyticsAttributeKey2, microMobilityAction.f14844b);
                    aVar3.mo49939g(analyticsAttributeKey3, microMobilityAction.f14845c);
                    aVar3.mo49937e(analyticsAttributeKey4, serverId);
                    bVar.mo46797j2(aVar3.mo49933a());
                    AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a(bVar.requireContext()).mo47682k("action_confirmation_dialog");
                    k.mo47677f(microMobilityConfirmationInfo.f14806b);
                    AlertDialogFragment.C15856a h = k.mo47684m(microMobilityConfirmationInfo.f14807c).mo47679h(microMobilityConfirmationInfo.f14808d);
                    h.mo47672a(microMobilityConfirmationInfo.f14809e, "positiveButton");
                    h.mo47672a(microMobilityConfirmationInfo.f14810f, "negativeButton");
                    h.f41328b.putParcelable("rideId", serverId);
                    h.f41328b.putParcelable(Events.PROPERTY_ACTION, microMobilityAction);
                    h.mo47673b().show(bVar.getChildFragmentManager(), "action_confirmation_dialog");
                    return;
                }
                microMobilityAction.f14846d.mo19450e1(serverId, microMobilityAction, bVar);
                return;
            case 4:
                C19229a aVar4 = (C19229a) this.f22237c;
                int i3 = C19229a.f48829A;
                aVar4.getClass();
                AlternativeAuthProvider alternativeAuthProvider = ((PhoneAlternativeAuthInstructions) this.f22238d).f42824c;
                PaymentRegistrationInfo o2 = aVar4.mo50499o2();
                o2.f42745c = AccountAuthType.EXTERNAL;
                o2.f42746d = alternativeAuthProvider;
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "alternative_signup");
                aVar4.mo46797j2(aVar5.mo49933a());
                aVar4.mo50504u2((C17559a) null);
                return;
            case 5:
                int i4 = C7632a.f23237h;
                ((C7632a) this.f22237c).mo23975S1((Ticket) this.f22238d);
                return;
            case 6:
                int i5 = PurchaseTicketConfirmedActivity.f23294l0;
                ((PurchaseTicketConfirmedActivity) this.f22237c).mo24057I2((Ticket) this.f22238d);
                return;
            default:
                TicketDetailsActivity ticketDetailsActivity = (TicketDetailsActivity) this.f22237c;
                int i6 = TicketDetailsActivity.f23504m0;
                ticketDetailsActivity.getClass();
                Context context2 = view.getContext();
                C0072d dVar = (C0072d) ((C4436j0) this.f22238d).f15501b;
                String str = dVar.f152a;
                C18047b.f46173p.getClass();
                C18047b a = C18047b.C18048a.m44717a(str);
                String str2 = dVar.f153b;
                UniversalTicketScreenConfiguration universalTicketScreenConfiguration = new UniversalTicketScreenConfiguration();
                C24362h.m61211f(context2, AppActionRequest.KEY_CONTEXT);
                C24362h.m61211f(str2, "ticketId");
                Intent intent = new Intent(context2, UniversalTicketActivity.class);
                intent.putExtra("KEY_SDK_INSTANCE_IDENTIFIER", a.mo50524c());
                intent.putExtra("KEY_TICKET_ID", str2);
                intent.putExtra("KEY_UNIVERSAL_TICKET_SCREEN_CONFIGURATION", universalTicketScreenConfiguration);
                try {
                    ticketDetailsActivity.startActivityForResult(intent, 1546, (Bundle) null);
                    return;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
        }
    }
}
