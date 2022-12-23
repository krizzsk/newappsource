package com.moovit.util.p339qr;

import a00.C13382a;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import c00.C13717b;
import ca0.C7580a;
import ce0.C21100e;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.commons.view.pager.SimplePagerIndicatorStrip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;

/* renamed from: com.moovit.util.qr.QrCodesPagerView */
public class QrCodesPagerView extends ConstraintLayout {

    /* renamed from: l */
    public static final /* synthetic */ int f23879l = 0;

    /* renamed from: h */
    public final ViewPager f23880h;

    /* renamed from: i */
    public final SimplePagerIndicatorStrip f23881i;

    /* renamed from: j */
    public final FormatTextView f23882j;

    /* renamed from: k */
    public List<String> f23883k;

    /* renamed from: com.moovit.util.qr.QrCodesPagerView$a */
    public class C7900a extends ViewPager.SimpleOnPageChangeListener {
        public C7900a() {
        }

        public final void onPageSelected(int i) {
            QrCodesPagerView qrCodesPagerView = QrCodesPagerView.this;
            int i2 = QrCodesPagerView.f23879l;
            qrCodesPagerView.mo24587c(i);
        }
    }

    public QrCodesPagerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public final void mo24587c(int i) {
        int i2 = i + 1;
        this.f23882j.setArguments(Integer.valueOf(i2), Integer.valueOf(this.f23883k.size()));
        Context context = this.f23882j.getContext();
        C13382a.m33665a(this.f23880h, context.getString(C19746x.voiceover_qr_code_image), context.getString(C19746x.voiceover_selected, new Object[]{String.valueOf(i2)}));
    }

    public int getCurrentItemPosition() {
        return this.f23880h.getCurrentItem();
    }

    /* renamed from: l */
    public final void mo24589l() {
        int i;
        this.f23880h.setAdapter(new C7580a(getContext(), this.f23883k));
        if (this.f23883k.size() > 1) {
            i = 0;
        } else {
            i = 8;
        }
        UiUtils.m40238F(i, this.f23881i, this.f23882j);
        mo24587c(0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("qrCodes");
        if (stringArrayList != null) {
            this.f23883k = stringArrayList;
            mo24589l();
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putStringArrayList("qrCodes", C13717b.m34264k(this.f23883k));
        return bundle;
    }

    public void setQrCodes(List<String> list) {
        C21100e.m49373x(list, "qrCodes");
        this.f23883k = list;
        mo24589l();
    }

    public QrCodesPagerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23883k = Collections.emptyList();
        LayoutInflater.from(context).inflate(C19742t.qr_codes_pager_view, this, true);
        ViewPager viewPager = (ViewPager) findViewById(C19740r.pager);
        this.f23880h = viewPager;
        viewPager.addOnPageChangeListener(new C7900a());
        this.f23881i = (SimplePagerIndicatorStrip) findViewById(C19740r.dot_indicator);
        this.f23882j = (FormatTextView) findViewById(C19740r.description);
    }
}
