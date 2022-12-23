package com.moovit.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import com.moovit.commons.utils.UiUtils;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p824tp.C19735m;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p824tp.C19748z;
import p977zz.C20930c;
import p977zz.C20941h;

public class PriceView extends LinearLayout {

    /* renamed from: b */
    public final String f23943b;

    /* renamed from: c */
    public final String f23944c;

    /* renamed from: d */
    public final TextView f23945d;

    /* renamed from: e */
    public final Space f23946e;

    /* renamed from: f */
    public final TextView f23947f;

    /* renamed from: g */
    public final Space f23948g;

    /* renamed from: h */
    public final TextView f23949h;

    /* renamed from: i */
    public CurrencyAmount f23950i;

    /* renamed from: j */
    public CurrencyAmount f23951j;

    /* renamed from: k */
    public CharSequence f23952k;

    /* renamed from: l */
    public CharSequence f23953l;

    /* renamed from: m */
    public ColorStateList f23954m;

    /* renamed from: n */
    public ColorStateList f23955n;

    public PriceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19735m.priceViewStyle);
    }

    /* renamed from: a */
    public final void mo24682a(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, String str) {
        this.f23951j = currencyAmount;
        if (currencyAmount2 != null) {
            currencyAmount = currencyAmount2;
        }
        this.f23950i = currencyAmount;
        this.f23952k = str;
        mo24684c();
    }

    /* renamed from: b */
    public final void mo24683b(int i, Space space) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) space.getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.height = i;
            layoutParams.width = 0;
        } else {
            layoutParams.height = 0;
            layoutParams.width = i;
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15076c(space)) {
            space.requestLayout();
        }
    }

    /* renamed from: c */
    public final void mo24684c() {
        boolean z;
        String str;
        if (this.f23951j == null || this.f23950i == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (this.f23953l == null || this.f23951j.f23845c.compareTo(BigDecimal.ZERO) != 0) {
            this.f23947f.setText(this.f23951j.toString());
            if (this.f23951j.f23845c.compareTo(this.f23950i.f23845c) < 0) {
                z = true;
            } else {
                z = false;
            }
            TextView textView = this.f23945d;
            if (z) {
                str = this.f23950i.toString();
            } else {
                str = null;
            }
            UiUtils.m40234B(textView, str);
            if (this.f23955n != null) {
                this.f23947f.setTextColor(this.f23954m);
            }
        } else {
            this.f23947f.setText(this.f23953l);
            this.f23945d.setVisibility(8);
            ColorStateList colorStateList = this.f23955n;
            if (colorStateList != null) {
                this.f23947f.setTextColor(colorStateList);
            }
        }
        UiUtils.m40234B(this.f23949h, this.f23952k);
        UiUtils.m40267z(this.f23945d, this.f23946e);
        UiUtils.m40267z(this.f23949h, this.f23948g);
        if (this.f23945d.getVisibility() == 0) {
            setContentDescription(String.format(C20930c.m49020b(getContext()), this.f23944c, new Object[]{this.f23947f.getText(), this.f23945d.getText()}));
            return;
        }
        setContentDescription(String.format(C20930c.m49020b(getContext()), this.f23943b, new Object[]{this.f23947f.getText()}));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        this.f23950i = (CurrencyAmount) bundle.getParcelable("fullPrice");
        this.f23951j = (CurrencyAmount) bundle.getParcelable(InAppPurchaseMetaData.KEY_PRICE);
        this.f23952k = bundle.getCharSequence("label");
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putParcelable("fullPrice", this.f23950i);
        bundle.putParcelable(InAppPurchaseMetaData.KEY_PRICE, this.f23951j);
        bundle.putCharSequence("label", this.f23952k);
        return bundle;
    }

    public void setFreeColor(int i) {
        setFreeColor(ColorStateList.valueOf(i));
    }

    public void setFreeColorResId(int i) {
        ColorStateList colorStateList;
        if (i == 0) {
            colorStateList = null;
        } else {
            colorStateList = C4732a.getColorStateList(getContext(), i);
        }
        setFreeColor(colorStateList);
    }

    public void setFreeText(int i) {
        setFreeText((CharSequence) i == 0 ? null : getResources().getString(i));
    }

    public void setFreeThemeColor(int i) {
        setFreeColor(C20941h.m49044g(i, getContext()));
    }

    public void setFullPriceTextAppearance(int i) {
        C0801k.m2424f(this.f23945d, i);
    }

    public void setFullPriceTextColor(ColorStateList colorStateList) {
        this.f23945d.setTextColor(colorStateList);
    }

    public void setFullPriceTextColorRes(int i) {
        if (i != 0) {
            setFullPriceTextColor(C4732a.getColorStateList(getContext(), i));
        }
    }

    public void setFullPriceTextThemeColor(int i) {
        if (i != 0) {
            setFullPriceTextColor(C20941h.m49044g(i, getContext()));
        }
    }

    public void setLabelColor(int i) {
        setLabelColor(ColorStateList.valueOf(i));
    }

    public void setLabelColorResId(int i) {
        ColorStateList colorStateList;
        if (i == 0) {
            colorStateList = null;
        } else {
            colorStateList = C4732a.getColorStateList(getContext(), i);
        }
        setLabelColor(colorStateList);
    }

    public void setLabelText(int i) {
        setLabelText((CharSequence) i == 0 ? null : getResources().getString(i));
    }

    public void setLabelTextAppearance(int i) {
        C0801k.m2424f(this.f23949h, i);
    }

    public void setLabelThemeColor(int i) {
        setLabelColor(C20941h.m49044g(i, getContext()));
    }

    public void setPrice(CurrencyAmount currencyAmount) {
        mo24682a(currencyAmount, (CurrencyAmount) null, (String) null);
    }

    public void setPriceTextAppearance(int i) {
        C0801k.m2424f(this.f23947f, i);
        this.f23954m = this.f23947f.getTextColors();
    }

    public void setPriceTextColor(ColorStateList colorStateList) {
        this.f23947f.setTextColor(colorStateList);
        this.f23954m = this.f23947f.getTextColors();
    }

    public void setPriceTextColorRes(int i) {
        if (i != 0) {
            setPriceTextColor(C4732a.getColorStateList(getContext(), i));
        }
    }

    public void setPriceTextThemeColor(int i) {
        if (i != 0) {
            setPriceTextColor(C20941h.m49044g(i, getContext()));
        }
    }

    public void setSpacing(int i) {
        setSpacingPixels(i == 0 ? 0 : getResources().getDimensionPixelSize(i));
    }

    public void setSpacingPixels(int i) {
        mo24683b(i, this.f23946e);
        mo24683b(i, this.f23948g);
    }

    public PriceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C19742t.price_view, this);
        this.f23943b = context.getString(C19746x.voiceover_suggested_routes_fare);
        this.f23944c = context.getString(C19746x.voiceover_discount_price);
        TextView textView = (TextView) findViewById(C19740r.full_price);
        this.f23945d = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 16);
        this.f23946e = (Space) findViewById(C19740r.spacer);
        TextView textView2 = (TextView) findViewById(C19740r.price);
        this.f23947f = textView2;
        this.f23948g = (Space) findViewById(C19740r.text_spacer);
        this.f23949h = (TextView) findViewById(C19740r.price_label);
        TypedArray o = UiUtils.m40256o(context, attributeSet, C19748z.PriceView, i);
        try {
            int resourceId = o.getResourceId(C19748z.PriceView_fullPriceTextAppearance, 0);
            if (resourceId != 0) {
                setFullPriceTextAppearance(resourceId);
            }
            ColorStateList b = C20941h.m49039b(context, o, C19748z.PriceView_fullPriceTextColor);
            if (b != null) {
                setFullPriceTextColor(b);
            }
            int resourceId2 = o.getResourceId(C19748z.PriceView_priceTextAppearance, 0);
            if (resourceId2 != 0) {
                setPriceTextAppearance(resourceId2);
            }
            ColorStateList b2 = C20941h.m49039b(context, o, C19748z.PriceView_priceTextColor);
            if (b2 != null) {
                setPriceTextColor(b2);
            }
            this.f23954m = textView2.getTextColors();
            int resourceId3 = o.getResourceId(C19748z.PriceView_labelTextAppearance, 0);
            if (resourceId3 != 0) {
                setLabelTextAppearance(resourceId3);
            }
            ColorStateList b3 = C20941h.m49039b(context, o, C19748z.PriceView_labelTextColor);
            if (b3 != null) {
                setLabelColor(b3);
            }
            int dimensionPixelSize = o.getDimensionPixelSize(C19748z.PriceView_spacing, -1);
            if (dimensionPixelSize != -1) {
                setSpacingPixels(dimensionPixelSize);
            }
            this.f23953l = o.getText(C19748z.PriceView_freeText);
            this.f23955n = C20941h.m49039b(context, o, C19748z.PriceView_freeColor);
        } finally {
            o.recycle();
        }
    }

    public void setFreeColor(ColorStateList colorStateList) {
        this.f23955n = colorStateList;
        mo24684c();
    }

    public void setFreeText(CharSequence charSequence) {
        this.f23953l = charSequence;
        mo24684c();
    }

    public void setLabelColor(ColorStateList colorStateList) {
        this.f23949h.setTextColor(colorStateList);
    }

    public void setLabelText(CharSequence charSequence) {
        this.f23952k = charSequence;
        mo24684c();
    }

    public void setPriceTextColor(int i) {
        setPriceTextColor(ColorStateList.valueOf(i));
    }
}
