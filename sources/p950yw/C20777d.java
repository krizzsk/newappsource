package p950yw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import ce0.C21100e;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.commons.geo.Polyline;
import com.moovit.map.LineStyle;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.payment.account.deposit.C25643a;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStep;
import com.moovit.ticketing.validation.receipt.media.C7772a;
import com.moovit.ticketing.validation.receipt.media.C7774b;
import com.usebutton.sdk.internal.api.AppActionRequest;
import e90.C12618b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k00.C17988b;
import l30.C5580k;
import l30.C5585p;
import m80.C12868d;
import m80.C12869e;
import m80.C12873i;
import o00.C18676l;
import p977zz.C20944i0;
import z00.C20795a;
import z70.C13337m;

/* renamed from: yw.d */
public final /* synthetic */ class C20777d implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f52423b;

    /* renamed from: c */
    public final /* synthetic */ Object f52424c;

    /* renamed from: d */
    public final /* synthetic */ Object f52425d;

    public /* synthetic */ C20777d(int i, Object obj, Object obj2) {
        this.f52423b = i;
        this.f52424c = obj;
        this.f52425d = obj2;
    }

    public final void onSuccess(Object obj) {
        int i;
        int i2;
        CharSequence charSequence;
        int i3 = 0;
        switch (this.f52423b) {
            case 0:
                ((C20779f) this.f52424c).f52430b.mo48662w2((Polyline) obj, (LineStyle) this.f52425d);
                return;
            case 1:
                C5585p pVar = (C5585p) this.f52424c;
                pVar.f18304c.mo48656t2(new C5580k((C20944i0) obj, pVar, (MicroMobilityRide) this.f52425d));
                return;
            case 2:
                C25643a aVar = (C25643a) this.f52424c;
                aVar.f63965e.setValue((DepositInstructions) obj);
                aVar.f63968h.setValue((PaymentMethod) this.f52425d);
                return;
            case 3:
                C12618b bVar = (C12618b) this.f52424c;
                String str = (String) this.f52425d;
                List<C18676l.C18678b> list = (List) obj;
                int i4 = C12618b.f31181w;
                Map singletonMap = Collections.singletonMap(AnalyticsAttributeKey.SELECTED_TYPE, ((PurchaseStationSelectionStep) bVar.f32728o).f23247c);
                C13337m mVar = bVar.f31183q;
                if (list == null) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (C18676l.C18678b size : list) {
                        i2 += size.size();
                    }
                }
                mVar.mo40230e(str, i2, singletonMap, (Set<String>) null);
                if (C13717b.m34258e(list)) {
                    bVar.f31186t.setVisibility(4);
                    RecyclerView recyclerView = bVar.f31187u;
                    Context context = recyclerView.getContext();
                    C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
                    Drawable b = C17988b.m44611b(C12868d.img_empty_state_search_location, context);
                    int i5 = C12873i.purchase_ticket_selection_station_search_empty_message;
                    if (i5 == 0) {
                        charSequence = null;
                    } else {
                        charSequence = context.getText(i5);
                    }
                    recyclerView.mo4627l0(new C20795a(b, (CharSequence) null, charSequence));
                    return;
                }
                bVar.f31182p.mo51055y(list);
                if (bVar.f31187u.getAdapter() != bVar.f31182p) {
                    bVar.f31186t.setVisibility(0);
                    bVar.f31187u.mo4627l0(bVar.f31182p);
                    return;
                }
                return;
            default:
                C7774b bVar2 = (C7774b) this.f52424c;
                C7772a aVar2 = (C7772a) this.f52425d;
                List list2 = (List) obj;
                int i6 = C7774b.f23597v;
                bVar2.getClass();
                for (int i7 = 0; i7 < list2.size(); i7++) {
                    View view = (View) list2.get(i7);
                    if (view != null) {
                        if (i7 == 0) {
                            i = 0;
                        } else {
                            i = 4;
                        }
                        view.setVisibility(i);
                        bVar2.f23602t.addView(view);
                    }
                }
                ViewGroup viewGroup = bVar2.f23603u;
                if (bVar2.f23602t.getChildCount() <= 1) {
                    i3 = 8;
                }
                viewGroup.setVisibility(i3);
                bVar2.f23601s.setTag(C12869e.view_tag_param1, aVar2);
                bVar2.mo24272q2();
                return;
        }
    }
}
