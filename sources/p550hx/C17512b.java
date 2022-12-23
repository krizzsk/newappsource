package p550hx;

import android.os.Bundle;
import android.view.ViewGroup;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.app.taxi.providers.TaxiOrderConfig;
import com.moovit.app.taxi.providers.TaxiOrderProfile;
import com.moovit.app.tod.model.TodOrderConfig;
import com.moovit.app.tod.order.C15529a;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.view.NumericStepperView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p054d0.C4291k0;
import p241s0.C6302b;
import p394br.C13660f;

/* renamed from: hx.b */
public class C17512b extends C15529a {

    /* renamed from: l */
    public static final /* synthetic */ int f45080l = 0;

    /* renamed from: j */
    public TaxiOrderConfig f45081j;

    /* renamed from: k */
    public ArrayList f45082k;

    /* renamed from: S1 */
    public final TodOrderConfig mo46410S1() {
        C6302b bVar = new C6302b(this.f45082k.size());
        Iterator it = this.f45082k.iterator();
        while (it.hasNext()) {
            NumericStepperView numericStepperView = (NumericStepperView) it.next();
            bVar.put((ServerId) numericStepperView.getTag(), Integer.valueOf(numericStepperView.getCounter()));
        }
        return new TodOrderConfig(bVar, mo46411T1(), this.f40367h.getCounter());
    }

    /* renamed from: T1 */
    public final int mo46411T1() {
        return C13717b.m34263j(this.f45082k, new C13660f(4)) + 1;
    }

    /* renamed from: U1 */
    public final void mo46412U1(ViewGroup viewGroup, TodOrderConfig todOrderConfig) {
        C21100e.m49373x(this.f45081j, "taxiOrderConfig");
        List<TaxiOrderProfile> list = this.f45081j.f39948b;
        this.f45082k = new ArrayList(list.size());
        for (TaxiOrderProfile next : list) {
            int i = 0;
            ListItemView listItemView = (ListItemView) C13715c.m34239e(viewGroup, R.layout.tod_order_passenger_count_item, viewGroup, false);
            listItemView.setIcon(next.f39952c);
            listItemView.setTitle((CharSequence) next.f39953d);
            listItemView.setSubtitle((CharSequence) next.f39954e);
            NumericStepperView numericStepperView = (NumericStepperView) listItemView.getAccessoryView();
            ServerId serverId = next.f39951b;
            numericStepperView.setTag(serverId);
            numericStepperView.mo47718a(0, this.f45081j.f39949c, true);
            Integer num = todOrderConfig.f40256b.get(serverId);
            if (num != null) {
                i = num.intValue();
            }
            numericStepperView.setCounter(i);
            numericStepperView.setListener(new C4291k0(this, 11));
            this.f45082k.add(numericStepperView);
            viewGroup.addView(listItemView);
        }
    }

    /* renamed from: V1 */
    public final void mo46413V1() {
        super.mo46413V1();
        int T1 = this.f45081j.f39949c - mo46411T1();
        Iterator it = this.f45082k.iterator();
        while (it.hasNext()) {
            NumericStepperView numericStepperView = (NumericStepperView) it.next();
            numericStepperView.mo47718a(0, numericStepperView.getCounter() + T1, false);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TaxiOrderConfig taxiOrderConfig = (TaxiOrderConfig) mo46752K1().getParcelable("taxiOrderConfig");
        this.f45081j = taxiOrderConfig;
        if (taxiOrderConfig == null) {
            throw new ApplicationBugException("Did you use TodOrderAdditionalProfilesSettingsFragment.newInstance(TaxiOrderConfig)?");
        }
    }
}
