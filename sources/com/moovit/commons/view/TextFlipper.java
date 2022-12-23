package com.moovit.commons.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextFlipper extends ViewFlipper {

    /* renamed from: b */
    public final ArrayList f41156b = new ArrayList();

    /* renamed from: c */
    public int f41157c = -1;

    public TextFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private CharSequence getNextText() {
        if (this.f41156b.isEmpty()) {
            return null;
        }
        int size = (this.f41157c + 1) % this.f41156b.size();
        this.f41157c = size;
        return (CharSequence) this.f41156b.get(size);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof TextView) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Text flipper allow only TextView children");
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 2) {
            throw new IllegalStateException("Text flipper need exactly 2 TextView children");
        } else if (!(getChildAt(0) instanceof TextView) || !(getChildAt(1) instanceof TextView)) {
            throw new IllegalStateException("Text flipper allow only TextView children");
        }
    }

    public void setDisplayedChild(int i) {
        int i2;
        int childCount = getChildCount();
        if (i >= childCount) {
            i2 = 0;
        } else if (i < 0) {
            i2 = childCount - 1;
        } else {
            i2 = i;
        }
        TextView textView = (TextView) getChildAt(i2);
        if (textView != null) {
            textView.setText(getNextText());
        }
        super.setDisplayedChild(i);
    }

    public void setTexts(CharSequence... charSequenceArr) {
        setTexts((List<? extends CharSequence>) charSequenceArr == null ? null : Arrays.asList(charSequenceArr));
    }

    public void setTexts(List<? extends CharSequence> list) {
        this.f41156b.clear();
        if (list != null) {
            this.f41156b.addAll(list);
        }
        this.f41157c = -1;
        if (this.f41156b.size() < 2) {
            if (isFlipping()) {
                stopFlipping();
            }
            showNext();
        } else if (!isFlipping()) {
            startFlipping();
        }
    }
}
