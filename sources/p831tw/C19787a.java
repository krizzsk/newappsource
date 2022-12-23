package p831tw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce0.C21100e;
import com.moovit.app.taxi.MVViewFlipper;
import com.moovit.app.taxi.providers.TaxiFabConfig;
import com.moovit.commons.view.FormatTextView;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p583jk.C17884p;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import y10.C20686a;

@SuppressLint({"ViewConstructor"})
/* renamed from: tw.a */
public final class C19787a extends FrameLayout {

    /* renamed from: b */
    public final C19788a f50304b = new C19788a();

    /* renamed from: c */
    public final ServerId f50305c;

    /* renamed from: d */
    public final TaxiFabConfig f50306d;

    /* renamed from: e */
    public final MVViewFlipper f50307e;

    /* renamed from: tw.a$a */
    public class C19788a extends C20438i<C19789b, C19790c> {
        public C19788a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19789b bVar = (C19789b) cVar;
            C19787a aVar = C19787a.this;
            int i = ((C19790c) gVar).f50311m;
            if (i <= 0) {
                ViewGroup viewGroup = (ViewGroup) aVar.f50307e.findViewWithTag("realTime");
                if (viewGroup != null) {
                    aVar.f50307e.removeView(viewGroup);
                    return;
                }
                return;
            }
            View view = (ViewGroup) aVar.f50307e.findViewWithTag("realTime");
            if (view == null) {
                view = (LinearLayout) LayoutInflater.from(aVar.getContext()).inflate(R.layout.taxi_floating_button_real_time_page, aVar.f50307e, false);
                Image image = aVar.f50306d.f39942e;
                if (image != null) {
                    C17884p.m44354Y(view).mo51642v(image).mo51628o0(image).mo10848R(new C20686a(view));
                }
                View findViewById = view.findViewById(R.id.realTime);
                findViewById.setActivated(true);
                Drawable background = findViewById.getBackground();
                if (background != null) {
                    Drawable current = background.getCurrent();
                    if (current instanceof AnimationDrawable) {
                        ((AnimationDrawable) current).start();
                    }
                }
                aVar.f50307e.addView(view, 1);
            }
            ((FormatTextView) view.findViewById(R.id.realTime)).setArguments(Integer.valueOf(i));
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19789b bVar = (C19789b) cVar;
            C19787a aVar = C19787a.this;
            ViewGroup viewGroup = (ViewGroup) aVar.f50307e.findViewWithTag("realTime");
            if (viewGroup == null) {
                return true;
            }
            aVar.f50307e.removeView(viewGroup);
            return true;
        }
    }

    public C19787a(Context context, ServerId serverId, TaxiFabConfig taxiFabConfig) {
        super(context);
        C21100e.m49373x(serverId, "providerId");
        this.f50305c = serverId;
        this.f50306d = taxiFabConfig;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15059s(this, 4);
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(R.layout.taxi_floating_button_layout, this, true);
        this.f50307e = (MVViewFlipper) findViewById(R.id.flipper);
        for (TaxiFabConfig.TaxiFabPage next : taxiFabConfig.f39939b) {
            TextView textView = (TextView) from.inflate(R.layout.taxi_floating_button_page, this.f50307e, false);
            textView.setText(next.f39945c);
            textView.setTextColor(next.f39946d.f41007b);
            C17884p.m44354Y(textView).mo51642v(next.f39944b).mo51628o0(next.f39944b).mo10848R(new C20686a(textView));
            this.f50307e.addView(textView);
        }
        if (taxiFabConfig.f39939b.size() > 1) {
            this.f50307e.setAutoStart(true);
            this.f50307e.setFlipInterval(2000);
        }
    }
}
