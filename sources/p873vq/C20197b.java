package p873vq;

import androidx.lifecycle.C1044w;
import com.moovit.app.ads.mapitem.MapItemAdBottomSheetDialog;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupInformation;
import com.moovit.design.view.NumericStepperView;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import lf0.C24236l;
import mf0.C24362h;
import p376ax.C13546h;
import p950yw.C20779f;
import p977zz.C20961r;
import x50.C20450a;
import y50.C20703a;

/* renamed from: vq.b */
public final /* synthetic */ class C20197b implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f51236a;

    /* renamed from: b */
    public final /* synthetic */ Object f51237b;

    public /* synthetic */ C20197b(Object obj, int i) {
        this.f51236a = i;
        this.f51237b = obj;
    }

    public final void onChanged(Object obj) {
        T t;
        switch (this.f51236a) {
            case 0:
                C24236l lVar = (C24236l) this.f51237b;
                int i = MapItemAdBottomSheetDialog.f37544p;
                C24362h.m61211f(lVar, "$tmp0");
                lVar.invoke(obj);
                return;
            case 1:
                TodBookingOrderViewModel todBookingOrderViewModel = (TodBookingOrderViewModel) this.f51237b;
                todBookingOrderViewModel.mo46214c(todBookingOrderViewModel.f40077i.getValue(), todBookingOrderViewModel.f40073e.getValue(), (LocationDescriptor) obj);
                return;
            case 2:
                C13546h hVar = (C13546h) this.f51237b;
                C20961r rVar = (C20961r) obj;
                int i2 = C13546h.f33483w;
                hVar.getClass();
                if (rVar != null) {
                    if (!rVar.f52711a || (t = rVar.f52712b) == null) {
                        hVar.mo40437q2(rVar.f52713c);
                        return;
                    }
                    TodBookingPickupInformation todBookingPickupInformation = (TodBookingPickupInformation) t;
                    C20779f o2 = hVar.mo40435o2();
                    o2.getClass();
                    o2.mo52911d(todBookingPickupInformation.f40095c);
                    o2.mo52912e(R.drawable.img_tod_map_pickup_stop_24, todBookingPickupInformation.f40096d);
                    hVar.mo40432z2(todBookingPickupInformation.f40098f);
                    return;
                }
                return;
            default:
                C20450a aVar = (C20450a) this.f51237b;
                C20703a aVar2 = (C20703a) obj;
                if (aVar2 == null) {
                    int i3 = C20450a.f51795q;
                    aVar.getClass();
                    return;
                }
                aVar.f51797o.setListener((NumericStepperView.C15863a) null);
                NumericStepperView numericStepperView = aVar.f51797o;
                int i4 = aVar2.f52277a.f42620b;
                if (numericStepperView.f41367f != i4) {
                    numericStepperView.mo47719b(i4, false);
                }
                aVar.f51797o.setListener(aVar.f51798p);
                return;
        }
    }
}
