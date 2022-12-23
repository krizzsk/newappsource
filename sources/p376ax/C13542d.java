package p376ax;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tranzmate.R;
import p297w5.C6994a;
import p923xs.C20576h;

/* renamed from: ax.d */
public class C13542d extends C13541c {

    /* renamed from: r */
    public static final /* synthetic */ int f33471r = 0;

    /* renamed from: o */
    public TextView f33472o;

    /* renamed from: p */
    public TextView f33473p;

    /* renamed from: q */
    public TextView f33474q;

    /* renamed from: m2 */
    public final String mo40433m2() {
        return "tod_order_summary_impression";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.tod_booking_order_confirmation_step_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f33472o = (TextView) view.findViewById(R.id.origin);
        this.f33473p = (TextView) view.findViewById(R.id.destination);
        this.f33474q = (TextView) view.findViewById(R.id.time);
        ((Button) view.findViewById(R.id.action)).setOnClickListener(new C6994a(this, 25));
        mo40436p2().f40081m.observe(getViewLifecycleOwner(), new C20576h(this, 2));
    }
}
