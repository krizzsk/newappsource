package com.moovit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.moovit.commons.utils.UiUtils;
import k00.C17988b;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19748z;

public class CheckListView extends LinearLayout {

    /* renamed from: b */
    public final Drawable f23938b;

    public CheckListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo24677a(int i, Object... objArr) {
        View inflate = LayoutInflater.from(getContext()).inflate(C19742t.check_list_view_item_layout, this, false);
        ((ImageView) inflate.findViewById(C19740r.check_icon)).setImageDrawable(this.f23938b);
        ((TextView) inflate.findViewById(C19740r.text)).setText(getResources().getString(i, objArr));
        addView(inflate);
    }

    public CheckListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setShowDividers(2);
        setDividerDrawable(C17988b.m44611b(C19739q.wdg_check_list_divider, context));
        TypedArray o = UiUtils.m40256o(context, attributeSet, C19748z.CheckListView, i);
        try {
            this.f23938b = o.getDrawable(C19748z.CheckListView_checkedIcon);
        } finally {
            o.recycle();
        }
    }
}
