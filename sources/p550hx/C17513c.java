package p550hx;

import android.view.ViewGroup;
import com.moovit.app.tod.model.TodOrderConfig;
import com.moovit.app.tod.order.C15529a;
import com.moovit.design.view.NumericStepperView;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.util.Collections;
import p054d0.C4314v;

/* renamed from: hx.c */
public class C17513c extends C15529a {

    /* renamed from: k */
    public static final /* synthetic */ int f45083k = 0;

    /* renamed from: j */
    public NumericStepperView f45084j;

    /* renamed from: S1 */
    public final TodOrderConfig mo46410S1() {
        return new TodOrderConfig(Collections.emptyMap(), mo46411T1(), this.f40367h.getCounter());
    }

    /* renamed from: T1 */
    public final int mo46411T1() {
        return this.f45084j.getCounter() + 1;
    }

    /* renamed from: U1 */
    public final void mo46412U1(ViewGroup viewGroup, TodOrderConfig todOrderConfig) {
        ListItemView listItemView = (ListItemView) C13715c.m34239e(viewGroup, R.layout.tod_order_passenger_count_item, viewGroup, false);
        listItemView.setIcon((int) R.drawable.ic_passengers_24_on_surface_high);
        listItemView.setTitle((int) R.string.tod_passenger_order_setting_passengers);
        NumericStepperView numericStepperView = (NumericStepperView) listItemView.getAccessoryView();
        this.f45084j = numericStepperView;
        numericStepperView.mo47718a(0, 9, true);
        this.f45084j.setCounter(todOrderConfig.f40257c - 1);
        this.f45084j.setListener(new C4314v(this, 10));
        viewGroup.addView(listItemView);
    }
}
