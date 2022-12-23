package com.moovit.commons.view.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ce0.C21100e;
import com.moovit.commons.view.list.PositionedListItemView;

public class FramePositionedListItemView extends FrameLayout implements PositionedListItemView {

    /* renamed from: b */
    public PositionedListItemView.ListItemPositionType f41240b;

    public FramePositionedListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PositionedListItemView.ListItemPositionType getPositionType() {
        return this.f41240b;
    }

    public final int[] onCreateDrawableState(int i) {
        if (this.f41240b == null) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = this.f41240b.getAttribute();
        return onCreateDrawableState;
    }

    public void setPositionType(PositionedListItemView.ListItemPositionType listItemPositionType) {
        C21100e.m49373x(listItemPositionType, "positionType");
        if (this.f41240b != listItemPositionType) {
            this.f41240b = listItemPositionType;
            refreshDrawableState();
            Drawable background = getBackground();
            if (background != null && background.isStateful()) {
                setBackgroundDrawable((Drawable) null);
                setBackgroundDrawable(background);
            }
        }
    }

    public FramePositionedListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
