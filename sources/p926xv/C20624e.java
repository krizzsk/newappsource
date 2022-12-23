package p926xv;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.tranzmate.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p584jl.C17885a;

/* renamed from: xv.e */
public final /* synthetic */ class C20624e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f52138b;

    /* renamed from: c */
    public final /* synthetic */ KeyEvent.Callback f52139c;

    /* renamed from: d */
    public final /* synthetic */ Object f52140d;

    /* renamed from: e */
    public final /* synthetic */ Object f52141e;

    /* renamed from: f */
    public final /* synthetic */ Object f52142f;

    public /* synthetic */ C20624e(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i) {
        this.f52138b = i;
        this.f52139c = callback;
        this.f52140d = obj;
        this.f52141e = obj2;
        this.f52142f = obj3;
    }

    public final void onClick(View view) {
        float f;
        int i;
        switch (this.f52138b) {
            case 0:
                TextView textView = (TextView) this.f52139c;
                Button button = (Button) this.f52140d;
                Drawable drawable = (Drawable) this.f52141e;
                Drawable drawable2 = (Drawable) this.f52142f;
                int i2 = ServiceAlertDetailsActivity.f39553Y;
                if (textView.getMaxLines() == 1) {
                    textView.setMaxLines(Integer.MAX_VALUE);
                    button.setText(R.string.show_less);
                    C17885a.m44465u0(button, drawable, 4);
                    return;
                }
                textView.setMaxLines(1);
                button.setText(R.string.show_more);
                C17885a.m44465u0(button, drawable2, 4);
                return;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f52140d;
                List list = (List) this.f52142f;
                int i3 = TicketDetailsActivity.f23504m0;
                ((TicketDetailsActivity) this.f52139c).getClass();
                boolean z = !atomicBoolean.get();
                atomicBoolean.set(z);
                ViewPropertyAnimator animate = ((View) this.f52141e).animate();
                if (z) {
                    f = 180.0f;
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                animate.rotation(f).start();
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                UiUtils.m40237E(i, list);
                return;
        }
    }
}
