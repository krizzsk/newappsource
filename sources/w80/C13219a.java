package w80;

import com.moovit.image.model.Image;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import java.util.List;
import o00.C18676l;

/* renamed from: w80.a */
public final class C13219a<T> extends C18676l.C18678b<T> {

    /* renamed from: d */
    public final Image f32790d;

    /* renamed from: e */
    public final Image f32791e;

    /* renamed from: f */
    public final PurchaseFilters f32792f;

    public C13219a(String str, Image image, Image image2, PurchaseFilters purchaseFilters) {
        super(str, (List) null);
        this.f32790d = image;
        this.f32791e = image2;
        this.f32792f = purchaseFilters;
    }

    /* renamed from: e */
    public final int mo40089e() {
        if (this.f32791e == null) {
            return size();
        }
        return size() + 1;
    }
}
