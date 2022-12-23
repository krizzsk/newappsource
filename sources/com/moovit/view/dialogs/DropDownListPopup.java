package com.moovit.view.dialogs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;

public class DropDownListPopup extends ListPopupWindow {

    /* renamed from: a */
    public final Context f24117a;

    /* renamed from: b */
    public ListAdapter f24118b = null;

    public DropDownListPopup(Context context) {
        super(context);
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f24117a = context;
    }

    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f24118b = listAdapter;
    }

    public final void show() {
        int i;
        ListAdapter listAdapter = this.f24118b;
        if (listAdapter != null) {
            FrameLayout frameLayout = new FrameLayout(this.f24117a);
            View anchorView = getAnchorView();
            if (anchorView != null) {
                i = anchorView.getWidth();
            } else {
                i = 0;
            }
            int count = listAdapter.getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                int itemViewType = listAdapter.getItemViewType(i3);
                if (itemViewType != i2) {
                    view = null;
                    i2 = itemViewType;
                }
                view = listAdapter.getView(i3, view, frameLayout);
                view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredWidth = view.getMeasuredWidth();
                if (measuredWidth > i) {
                    i = measuredWidth;
                }
            }
            setContentWidth(i);
        }
        super.show();
    }

    public DropDownListPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f24117a = context;
    }

    public DropDownListPopup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f24117a = context;
    }
}
