package com.moovit.app.mot.p417qr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.card.MaterialCardView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.util.p339qr.QrCodesPagerView;
import com.tranzmate.R;
import java.util.List;
import p471eq.C16850a;
import p567iq.C17636c;

/* renamed from: com.moovit.app.mot.qr.StationQrCodeCardView */
public class StationQrCodeCardView extends MaterialCardView {

    /* renamed from: q */
    public final ImageView f39078q;

    /* renamed from: r */
    public final TextView f39079r;

    /* renamed from: s */
    public final TextView f39080s;

    /* renamed from: t */
    public final QrCodesPagerView f39081t;

    /* renamed from: u */
    public final View f39082u;

    /* renamed from: v */
    public final Button f39083v;

    /* renamed from: w */
    public C15173b f39084w;

    /* renamed from: com.moovit.app.mot.qr.StationQrCodeCardView$a */
    public class C15172a extends ViewPager.SimpleOnPageChangeListener {
        public C15172a() {
        }

        public final void onPageSelected(int i) {
            C15173b bVar = StationQrCodeCardView.this.f39084w;
            if (bVar != null) {
                bVar.mo45632x0(i);
            }
        }
    }

    /* renamed from: com.moovit.app.mot.qr.StationQrCodeCardView$b */
    public interface C15173b {
        /* renamed from: j1 */
        void mo45631j1();

        /* renamed from: x0 */
        void mo45632x0(int i);
    }

    public StationQrCodeCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public void setAction(CharSequence charSequence) {
        UiUtils.m40234B(this.f39083v, charSequence);
        UiUtils.m40267z(this.f39083v, this.f39082u);
    }

    public void setIcon(Drawable drawable) {
        int i;
        ImageView imageView = this.f39078q;
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public void setListener(C15173b bVar) {
        this.f39084w = bVar;
    }

    public void setQrCodes(List<String> list) {
        this.f39081t.setQrCodes(list);
    }

    public void setStationName(CharSequence charSequence) {
        UiUtils.m40234B(this.f39079r, charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        UiUtils.m40234B(this.f39080s, charSequence);
    }

    public StationQrCodeCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.mot_station_qr_code_card_view, this, true);
        this.f39078q = (ImageView) findViewById(R.id.icon);
        this.f39079r = (TextView) findViewById(R.id.station_name_view);
        this.f39080s = (TextView) findViewById(R.id.title_view);
        QrCodesPagerView qrCodesPagerView = (QrCodesPagerView) findViewById(R.id.qr_pager_view);
        this.f39081t = qrCodesPagerView;
        qrCodesPagerView.f23880h.addOnPageChangeListener(new C15172a());
        this.f39082u = findViewById(R.id.divider);
        Button button = (Button) findViewById(R.id.card_action_view);
        this.f39083v = button;
        button.setOnClickListener(new C16850a(this, 16));
        TypedArray o = UiUtils.m40256o(context, attributeSet, C17636c.StationQrCodeCardView, i);
        try {
            setIcon(o.getDrawable(1));
            setTitle(o.getText(2));
            setAction(o.getText(0));
        } finally {
            o.recycle();
        }
    }
}
