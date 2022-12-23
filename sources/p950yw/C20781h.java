package p950yw;

import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1044w;
import androidx.lifecycle.LiveData;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;

/* renamed from: yw.h */
public final /* synthetic */ class C20781h implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ TodBookingOrderViewModel f52438a;

    /* renamed from: b */
    public final /* synthetic */ LiveData f52439b;

    public /* synthetic */ C20781h(TodBookingOrderViewModel todBookingOrderViewModel, C1040t tVar) {
        this.f52438a = todBookingOrderViewModel;
        this.f52439b = tVar;
    }

    public final void onChanged(Object obj) {
        TodBookingOrderViewModel todBookingOrderViewModel = this.f52438a;
        LiveData liveData = this.f52439b;
        todBookingOrderViewModel.getClass();
        todBookingOrderViewModel.mo46213b((Long) obj, (String) liveData.getValue());
    }
}
