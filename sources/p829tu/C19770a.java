package p829tu;

import com.moovit.app.mot.model.MotActivationRegionFare;
import com.moovit.app.mot.model.MotActivationRegionalFare;
import com.moovit.app.mot.purchase.model.MotQrCodeActivationFare;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: tu.a */
public final class C19770a implements Callable<List<MotQrCodeActivationFare>> {

    /* renamed from: b */
    public final MotQrCodeScanResult f50258b;

    public C19770a(MotQrCodeScanResult motQrCodeScanResult) {
        this.f50258b = motQrCodeScanResult;
    }

    public final Object call() throws Exception {
        List<MotActivationRegionalFare> list = this.f50258b.f39066f;
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (MotActivationRegionalFare next : list) {
            for (MotActivationRegionFare motQrCodeActivationFare : next.f39019e) {
                arrayList.add(new MotQrCodeActivationFare(next, motQrCodeActivationFare));
            }
        }
        return arrayList;
    }
}
