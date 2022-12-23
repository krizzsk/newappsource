package p950yw;

import a00.C13382a;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.activity.C0194b;
import androidx.appcompat.widget.C0441n1;
import com.moovit.commons.utils.UiUtils;
import com.moovit.map.MapFragment;
import com.moovit.map.MapOverlaysLayout;
import com.tranzmate.R;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: yw.b */
public final class C20774b {

    /* renamed from: a */
    public final C0194b f52416a = new C0194b(this, 10);

    /* renamed from: b */
    public final TextView f52417b;

    /* renamed from: yw.b$a */
    public class C20775a extends MapFragment.C16236q {

        /* renamed from: a */
        public boolean f52418a = false;

        public C20775a() {
        }

        /* renamed from: c */
        public final void mo48515c(int i) {
            if (MapFragment.C16236q.m41429a(i, 1) && !this.f52418a) {
                if (C20774b.this.f52417b.getVisibility() == 0) {
                    C20774b.this.mo52906b((CharSequence) null);
                }
                this.f52418a = true;
            }
            if (!MapFragment.C16236q.m41430b(i) && this.f52418a) {
                this.f52418a = false;
            }
        }
    }

    public C20774b(Context context, MapFragment mapFragment) {
        LayoutInflater from = LayoutInflater.from(context);
        MapOverlaysLayout mapOverlaysLayout = mapFragment.f42386w;
        TextView textView = (TextView) from.inflate(R.layout.tod_booking_order_map_banner, mapOverlaysLayout, false);
        this.f52417b = textView;
        MapOverlaysLayout.LayoutParams layoutParams = new MapOverlaysLayout.LayoutParams(81);
        layoutParams.width = -1;
        mapOverlaysLayout.addView(textView, layoutParams);
        UiUtils.m40259r(textView, new C20773a(this));
        mapFragment.mo48654s2(new C20775a());
    }

    /* renamed from: a */
    public final void mo52905a(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = this.f52417b.getResources().getText(i);
        } else {
            charSequence = null;
        }
        mo52906b(charSequence);
    }

    /* renamed from: b */
    public final void mo52906b(CharSequence charSequence) {
        this.f52417b.removeCallbacks(this.f52416a);
        if (charSequence == null) {
            C6382p0 a = C6333d0.m15013a(this.f52417b);
            a.mo22499i((float) this.f52417b.getMeasuredHeight());
            a.mo22500j(new C0441n1(this, 14));
            return;
        }
        this.f52417b.setText(charSequence);
        this.f52417b.post(this.f52416a);
        C13382a.m33665a(this.f52417b, charSequence);
    }
}
