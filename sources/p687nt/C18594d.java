package p687nt;

import android.view.View;
import android.view.ViewGroup;
import com.moovit.app.tod.bookingflow.TodBookingOrderActivity;
import com.moovit.map.MapFragment;

/* renamed from: nt.d */
public final /* synthetic */ class C18594d implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f47346b;

    /* renamed from: c */
    public final /* synthetic */ Object f47347c;

    /* renamed from: d */
    public final /* synthetic */ View f47348d;

    /* renamed from: e */
    public final /* synthetic */ View f47349e;

    public /* synthetic */ C18594d(Object obj, View view, View view2, int i) {
        this.f47346b = i;
        this.f47347c = obj;
        this.f47348d = view;
        this.f47349e = view2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f47346b) {
            case 0:
                C18595e eVar = (C18595e) this.f47347c;
                View view2 = this.f47348d;
                View view3 = this.f47349e;
                if (i2 == i6 && i4 == i8) {
                    eVar.getClass();
                    return;
                }
                eVar.getClass();
                eVar.f47351b.mo48645n3(0, 0, 0, view2.getHeight() - view3.getTop());
                return;
            default:
                int i9 = TodBookingOrderActivity.f40067Z;
                ((MapFragment) this.f47347c).mo48645n3(0, 0, 0, ((ViewGroup) this.f47348d).getHeight() - ((ViewGroup) this.f47349e).getTop());
                return;
        }
    }
}
