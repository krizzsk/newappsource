package com.moovit.commons.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class TextViewWithIcon extends CenteredView<TextView> {
    public TextViewWithIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final View mo47023a(String str, Context context, AttributeSet attributeSet, int i) {
        return new TextView(context, attributeSet, i);
    }

    public CharSequence getText() {
        return getTextView().getText();
    }

    public TextView getTextView() {
        return (TextView) getView();
    }

    public void setText(CharSequence charSequence) {
        getTextView().setText(charSequence);
    }

    public TextViewWithIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setText(int i) {
        getTextView().setText(i);
    }
}
