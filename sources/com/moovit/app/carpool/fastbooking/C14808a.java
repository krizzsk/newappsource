package com.moovit.app.carpool.fastbooking;

import a00.C13382a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import java.math.BigDecimal;
import java.text.Format;
import p568ir.C17646h;

/* renamed from: com.moovit.app.carpool.fastbooking.a */
public class C14808a extends C15676b<MoovitActivity> {

    /* renamed from: u */
    public static final /* synthetic */ int f37756u = 0;

    /* renamed from: h */
    public TextView f37757h;

    /* renamed from: i */
    public SeekBar f37758i;

    /* renamed from: j */
    public TextView f37759j;

    /* renamed from: k */
    public TextView f37760k;

    /* renamed from: l */
    public long f37761l;

    /* renamed from: m */
    public CurrencyAmount f37762m;

    /* renamed from: n */
    public int f37763n;

    /* renamed from: o */
    public long f37764o;

    /* renamed from: p */
    public float f37765p;

    /* renamed from: q */
    public int f37766q;

    /* renamed from: r */
    public long f37767r;

    /* renamed from: s */
    public long f37768s;

    /* renamed from: t */
    public Format f37769t;

    /* renamed from: com.moovit.app.carpool.fastbooking.a$a */
    public interface C14809a {
        /* renamed from: l0 */
        void mo44860l0(CurrencyAmount currencyAmount);
    }

    public C14808a() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.price_range_picker_layout, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f37757h = (TextView) view.findViewById(R.id.price);
        this.f37758i = (SeekBar) view.findViewById(R.id.price_level);
        this.f37759j = (TextView) view.findViewById(R.id.min);
        this.f37760k = (TextView) view.findViewById(R.id.max);
        view.findViewById(R.id.ok).setOnClickListener(new C4051q(this, 4));
        this.f37762m = (CurrencyAmount) getArguments().getParcelable("currentPrice");
        CurrencyAmount currencyAmount = (CurrencyAmount) getArguments().getParcelable("recommendedPrice");
        this.f37769t = CurrencyAmount.m17928d(currencyAmount.f23844b);
        long longValue = this.f37762m.f23845c.movePointRight(2).longValue();
        this.f37761l = longValue;
        this.f37764o = longValue;
        this.f37757h.setText(this.f37762m.toString());
        C13382a.m33674j(this.f37757h, this.f37762m.toString(), C13382a.m33670f(this.f37762m.f23844b));
        long longValue2 = currencyAmount.f23845c.movePointRight(2).longValue();
        this.f37766q = 10;
        this.f37768s = longValue2;
        this.f37767r = longValue2 * 2;
        this.f37759j.setText(currencyAmount.toString());
        this.f37760k.setText(new CurrencyAmount(currencyAmount.f23844b, BigDecimal.valueOf(this.f37767r).movePointLeft(2)).toString());
        long j = this.f37767r;
        long j2 = this.f37768s;
        float f = ((float) (j - j2)) / 100.0f;
        this.f37765p = f;
        int i = (int) (((float) (this.f37761l - j2)) / f);
        this.f37763n = i;
        this.f37758i.setProgress(i);
        this.f37758i.setOnSeekBarChangeListener(new C17646h(this));
    }
}
