package p244s3;

import a00.C13382a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import androidx.lifecycle.C1043v;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.servicealerts.LineServiceAlertDigestView;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.ImageProviderFragment;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.servicealerts.ServiceStatus;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueConfirmedActivity;
import com.moovit.ticketing.ticket.C7761f;
import com.moovit.ticketing.ticket.C7762g;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketListItemView;
import com.moovit.ticketing.validation.receipt.offline.TicketReceiptSyncManager;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import h90.C12740b;
import j90.C12789b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import k00.C17988b;
import m80.C12868d;
import m80.C12873i;
import m80.C12875k;
import m80.C12887v;
import p030bo.app.C1637m4;
import p030bo.app.C1700u1;
import p543hq.C17474b;
import p80.C12991b;
import p80.C12995d;
import p853uu.C19996f;
import p862vf.C20121e;
import p977zz.C20941h;
import q00.C19047a;
import q80.C13019h;
import s90.C13076d;
import s90.C13078f;
import w50.C20283g;
import x80.C13239a;
import y80.C13263b;
import z00.C20795a;

/* renamed from: s3.s */
public final /* synthetic */ class C6444s implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f20141b;

    /* renamed from: c */
    public final /* synthetic */ Object f20142c;

    public /* synthetic */ C6444s(Object obj, int i) {
        this.f20141b = i;
        this.f20142c = obj;
    }

    public final void onSuccess(Object obj) {
        CharSequence charSequence;
        boolean z;
        int i;
        boolean z2;
        int i2 = 0;
        int i3 = 4;
        CharSequence charSequence2 = null;
        switch (this.f20141b) {
            case 0:
                C1637m4.m4486a((C1700u1) this.f20142c, (Void) obj);
                return;
            case 1:
                LineServiceAlertDigestView lineServiceAlertDigestView = (LineServiceAlertDigestView) this.f20142c;
                LineServiceAlertDigestView.C15303b bVar = (LineServiceAlertDigestView.C15303b) obj;
                int i4 = LineServiceAlertDigestView.f39539m;
                lineServiceAlertDigestView.setVisibility(0);
                ServiceStatus serviceStatus = bVar.f39548b.f23186c;
                lineServiceAlertDigestView.f39541i.setText(serviceStatus.f23214c);
                C15780a.m40272e(lineServiceAlertDigestView.f39541i, serviceStatus.f23213b.getSmallIconResId());
                lineServiceAlertDigestView.f39540h.setBackgroundResource(R.drawable.bg_top_rounded_corners);
                lineServiceAlertDigestView.f39540h.setBackgroundTintList(C20941h.m49044g(serviceStatus.f23213b.getColorAttrId(), lineServiceAlertDigestView.getContext()));
                ServiceAlert serviceAlert = bVar.f39550d;
                if (serviceAlert != null) {
                    charSequence2 = serviceAlert.f23200l;
                }
                UiUtils.m40234B(lineServiceAlertDigestView.f39543k, charSequence2);
                UiUtils.m40267z(lineServiceAlertDigestView.f39543k, lineServiceAlertDigestView.f39542j);
                lineServiceAlertDigestView.setBackgroundResource(R.drawable.bg_line_service_alert);
                lineServiceAlertDigestView.setOnClickListener(new LineServiceAlertDigestView.C15302a(bVar));
                lineServiceAlertDigestView.setContentDescription(C13382a.m33667c(serviceStatus.f23214c, charSequence2));
                return;
            case 2:
                ((C1043v) this.f20142c).setValue((MoovitSubscriptionsManager.C15361d) obj);
                return;
            case 3:
                ImageProviderFragment imageProviderFragment = (ImageProviderFragment) this.f20142c;
                File file = (File) obj;
                Bitmap.CompressFormat compressFormat = ImageProviderFragment.f41701o;
                imageProviderFragment.getClass();
                C21100e.m49369v(1);
                Tasks.call(MoovitExecutors.SINGLE, new C20121e(imageProviderFragment, 1)).addOnSuccessListener(new C19996f(imageProviderFragment, 1));
                return;
            case 4:
                C12887v vVar = (C12887v) this.f20142c;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                vVar.getClass();
                if (((C13019h) obj).f32216m) {
                    TicketReceiptSyncManager.m17739a(vVar.f31895a);
                    return;
                }
                return;
            case 5:
                C13239a aVar = (C13239a) this.f20142c;
                C13263b bVar2 = (C13263b) obj;
                aVar.getClass();
                aVar.f32862c.postValue(bVar2.f32913m);
                C20283g gVar = aVar.f32863d;
                if (gVar != null) {
                    gVar.f51435i.postValue(bVar2.f32914n);
                    return;
                }
                return;
            case 6:
                Button button = (Button) this.f20142c;
                C12789b bVar3 = (C12789b) obj;
                int i5 = PurchaseStoredValueConfirmedActivity.f23436U;
                if (bVar3 == null) {
                    i2 = 4;
                }
                button.setVisibility(i2);
                return;
            case 7:
                C12740b bVar4 = (C12740b) this.f20142c;
                ArrayList arrayList = (ArrayList) obj;
                int i6 = C12740b.f31473s;
                bVar4.getClass();
                if (C13717b.m34258e(arrayList)) {
                    RecyclerView recyclerView = bVar4.f31478r;
                    Context context = recyclerView.getContext();
                    C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
                    Drawable b = C17988b.m44611b(C12868d.img_empty_wallet, context);
                    int i7 = C12873i.tickets_center_stored_empty_title;
                    if (i7 == 0) {
                        charSequence = null;
                    } else {
                        charSequence = context.getText(i7);
                    }
                    int i8 = C12873i.tickets_center_stored_empty_msg;
                    if (i8 != 0) {
                        charSequence2 = context.getText(i8);
                    }
                    recyclerView.setAdapter(new C20795a(b, charSequence, charSequence2));
                    return;
                }
                C12740b.C12743c cVar = bVar4.f31476p;
                cVar.f31481g.clear();
                cVar.f31481g.addAll(arrayList);
                cVar.notifyDataSetChanged();
                if (bVar4.f31476p != bVar4.f31478r.getAdapter()) {
                    bVar4.f31478r.mo4627l0(bVar4.f31476p);
                    return;
                }
                return;
            case 8:
                C7762g gVar2 = (C7762g) this.f20142c;
                C7762g.C7766d dVar = (C7762g.C7766d) obj;
                UiUtils.m40260s(gVar2.f23558t);
                if (((Boolean) ((C19047a) gVar2.mo46776J1("CONFIGURATION")).mo51505b(C12995d.f32166b)).booleanValue() || (dVar.f23567b.isEmpty() && dVar.f23568c.isEmpty() && dVar.f23569d.isEmpty())) {
                    z = false;
                } else {
                    z = true;
                }
                View accessoryView = gVar2.f23560v.getAccessoryView();
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                accessoryView.setVisibility(i);
                int e = C12875k.m32665e((C12991b) gVar2.mo46776J1("TICKETING_CONFIGURATION"));
                if (e == 0) {
                    gVar2.f23562x.setVisibility(8);
                } else {
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, ProductAction.ACTION_PURCHASE);
                    gVar2.mo46797j2(aVar2.mo49933a());
                    gVar2.f23562x.setText(e);
                    gVar2.f23562x.setVisibility(0);
                }
                if (!dVar.f23566a.isEmpty() || !dVar.f23567b.isEmpty() || !dVar.f23568c.isEmpty()) {
                    int i9 = 3;
                    if (!dVar.f23566a.isEmpty() && (!dVar.f23569d.isEmpty() || !dVar.f23568c.isEmpty() || !dVar.f23567b.isEmpty())) {
                        List<C12789b> list = dVar.f23566a;
                        int min = Math.min(list.size(), 3);
                        gVar2.mo24253m2(min);
                        int i11 = 0;
                        while (i11 < min) {
                            int i12 = i9 + 1;
                            ListItemView listItemView = (ListItemView) gVar2.f23558t.getChildAt(i9);
                            listItemView.setTag(list.get(i11));
                            listItemView.setIcon((Image) new ResourceImage(C12868d.ic_qr_code_24_on_surface_emphasis_medium, new String[0]));
                            listItemView.setTitle(C12873i.payment_touchpass_code_title);
                            listItemView.setSubtitle(C12873i.tap_to_view);
                            listItemView.setOnClickListener(gVar2.f23552n);
                            listItemView.setVisibility(0);
                            i11++;
                            i9 = i12;
                        }
                        gVar2.mo24254n2(AnalyticsEventKey.CONTENT_SHOWN, min, 0, 0);
                    } else if (dVar.f23567b.size() >= 2) {
                        List<Ticket> list2 = dVar.f23567b;
                        int min2 = Math.min(list2.size(), 3);
                        gVar2.mo24253m2(min2);
                        int i13 = 0;
                        while (i13 < min2) {
                            Ticket ticket = list2.get(i13);
                            int i14 = i9 + 1;
                            TicketListItemView ticketListItemView = (TicketListItemView) gVar2.f23558t.getChildAt(i9);
                            ticketListItemView.setTag(ticket);
                            ticketListItemView.setTicket(ticket);
                            ticketListItemView.setOnClickListener(gVar2.f23553o);
                            ticketListItemView.setVisibility(0);
                            i13++;
                            i9 = i14;
                        }
                        gVar2.mo24254n2(AnalyticsEventKey.CONTENT_SHOWN, 0, min2, 0);
                    } else {
                        List<Ticket> list3 = dVar.f23567b;
                        List<Ticket> list4 = dVar.f23568c;
                        boolean z3 = !list3.isEmpty();
                        int size = list4.size();
                        if (size > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        gVar2.mo24253m2((z2 ? 1 : 0) + (z3 ? 1 : 0));
                        if (z3) {
                            Ticket ticket2 = list3.get(0);
                            TicketListItemView ticketListItemView2 = (TicketListItemView) gVar2.f23558t.getChildAt(3);
                            ticketListItemView2.setTag(ticket2);
                            ticketListItemView2.setTicket(ticket2);
                            ticketListItemView2.setOnClickListener(gVar2.f23553o);
                            ticketListItemView2.setVisibility(0);
                        } else {
                            i3 = 3;
                        }
                        if (size > 0) {
                            TicketListItemView ticketListItemView3 = (TicketListItemView) gVar2.f23558t.getChildAt(i3);
                            int size2 = list4.size();
                            if (size2 > 1) {
                                ticketListItemView3.setOnClickListener(new C7761f(gVar2, size2));
                                ticketListItemView3.setIcon((Image) new ResourceImage(C12868d.img_multiple_tickets_24, new String[0]));
                                ticketListItemView3.setTitle((CharSequence) gVar2.getString(C12873i.tickets_section_available_tickets, Integer.valueOf(size2)));
                                ticketListItemView3.setSubtitle((CharSequence) null);
                                ticketListItemView3.setAccessoryView((View) null);
                                ticketListItemView3.setVisibility(0);
                            } else {
                                Ticket ticket3 = list4.get(0);
                                ticketListItemView3.setTag(ticket3);
                                ticketListItemView3.setTicket(ticket3);
                                ticketListItemView3.setOnClickListener(gVar2.f23553o);
                                ticketListItemView3.setVisibility(0);
                            }
                        }
                        gVar2.mo24254n2(AnalyticsEventKey.CONTENT_SHOWN, 0, z3, size);
                    }
                    gVar2.mo24254n2(AnalyticsEventKey.WALLET_CONTENT, dVar.f23566a.size(), dVar.f23567b.size(), dVar.f23568c.size());
                    return;
                }
                return;
            default:
                HashSet hashSet = C13078f.f32353s;
                ((C13078f) this.f20142c).mo39947n2((C13076d) obj);
                return;
        }
    }
}
