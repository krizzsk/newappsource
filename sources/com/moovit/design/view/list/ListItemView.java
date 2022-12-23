package com.moovit.design.view.list;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textview.MaterialTextView;

public class ListItemView extends AbstractListItemView<TextView, TextView, ImageView> {
    public ListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: l */
    public final AppCompatImageView mo47796l(int i, Context context) {
        return new AppCompatImageView(context, (AttributeSet) null, i);
    }

    /* renamed from: m */
    public final TextView mo47797m(int i, Context context) {
        return new MaterialTextView(context, (AttributeSet) null, i);
    }

    /* renamed from: n */
    public final TextView mo47798n(int i, Context context) {
        return new MaterialTextView(context, (AttributeSet) null, i);
    }

    public ListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ListItemView(Context context) {
        super(context, (AttributeSet) null);
    }
}
