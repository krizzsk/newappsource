package x50;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1026n0;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.NumericStepperView;
import p054d0.C4314v;
import p873vq.C20197b;
import v40.C25750e;
import v40.C25751f;
import w50.C20283g;

/* renamed from: x50.a */
public class C20450a extends C15682c<MoovitActivity> {

    /* renamed from: q */
    public static final /* synthetic */ int f51795q = 0;

    /* renamed from: n */
    public C20283g f51796n;

    /* renamed from: o */
    public NumericStepperView f51797o;

    /* renamed from: p */
    public C4314v f51798p;

    public C20450a() {
        super(MoovitActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f51796n = (C20283g) new C1026n0(requireActivity()).mo4313a(C20283g.class);
        this.f51798p = new C4314v(this, 15);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_options_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f51797o = (NumericStepperView) view.findViewById(C25750e.tickets_counter);
        int i2 = mo46782Q1().getInt("quantityLimit");
        this.f51797o.mo47718a(1, Math.min(99, i2), true);
        this.f51797o.setCounter(this.f51796n.mo52453d().f42620b);
        this.f51797o.setListener(this.f51798p);
        if (i2 > 1) {
            i = 0;
        } else {
            i = 8;
        }
        UiUtils.m40238F(i, this.f51797o, view.findViewById(C25750e.quantity));
        this.f51796n.f51437k.observe(getViewLifecycleOwner(), new C20197b(this, 3));
    }
}
