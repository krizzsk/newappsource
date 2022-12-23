package com.moovit.commons.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ce0.C21100e;
import com.google.android.material.textview.MaterialTextView;
import com.moovit.commons.utils.UiUtils;
import p622kz.C18165g;
import p977zz.C20930c;
import p977zz.C20958p0;

public class FormatTextView extends MaterialTextView {

    /* renamed from: h */
    public String f41077h;

    public FormatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public String getFormat() {
        return this.f41077h;
    }

    public void setArguments(Object... objArr) {
        setText(String.format(C20930c.m49020b(getContext()), this.f41077h, objArr));
    }

    public void setFormat(int i) {
        setFormat(getResources().getString(i));
    }

    public void setSpannedArguments(Object... objArr) {
        setText(C20958p0.m49078b(C20930c.m49020b(getContext()), this.f41077h, objArr));
    }

    public FormatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.FormatTextView, i);
        try {
            String string = o.getString(C18165g.FormatTextView_format);
            if (string != null) {
                setFormat(string);
            }
        } finally {
            o.recycle();
        }
    }

    public void setFormat(String str) {
        C21100e.m49373x(str, "format");
        this.f41077h = str;
    }
}
