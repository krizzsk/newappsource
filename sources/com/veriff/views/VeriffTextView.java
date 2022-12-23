package com.veriff.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.R$styleable;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/views/VeriffTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class VeriffTextView extends AppCompatTextView {
    public VeriffTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VeriffTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        int i2 = 2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.vrffTextView);
            C24362h.m61210e(obtainStyledAttributes, "context.obtainStyledAttr…utes(attrs, vrffTextView)");
            i2 = obtainStyledAttributes.getInt(R$styleable.vrffTextView_vrff_text_color, 2);
            obtainStyledAttributes.recycle();
        }
        if (i2 != 1) {
            setTextColor(C24469n.f61931a.mo60713a().mo57099n());
        } else {
            setTextColor(C24469n.f61931a.mo60713a().mo57098m());
        }
    }
}
