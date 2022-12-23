package com.masabi.justride.sdk.p415ui.features.ticket;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import p605ki.C18061o;
import p605ki.C18063q;

/* renamed from: com.masabi.justride.sdk.ui.features.ticket.VisualValidationView */
public class VisualValidationView extends FrameLayout {

    /* renamed from: b */
    public View f37199b;

    /* renamed from: c */
    public View[] f37200c;

    /* renamed from: d */
    public TextView f37201d;

    /* renamed from: e */
    public ObjectAnimator f37202e;

    /* renamed from: f */
    public ObjectAnimator f37203f;

    /* renamed from: g */
    public int f37204g = -1;

    public VisualValidationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo44436a();
    }

    /* renamed from: a */
    public final void mo44436a() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C18063q.view_vis_val, this);
        this.f37200c = new View[3];
        this.f37199b = findViewById(C18061o.container_vis_val_cells);
        this.f37200c[0] = findViewById(C18061o.vis_val_cell_0);
        this.f37200c[1] = findViewById(C18061o.vis_val_cell_1);
        this.f37200c[2] = findViewById(C18061o.vis_val_cell_2);
        this.f37201d = (TextView) findViewById(C18061o.textview_vis_val_date_time);
    }

    public void setCellDrawables(Drawable[] drawableArr) {
        for (int i = 0; i < drawableArr.length; i++) {
            this.f37200c[i].setBackground(drawableArr[i]);
        }
    }

    public void setDateTimeText(String str) {
        this.f37201d.setText(str);
    }

    public void setDateTimeTextSize(float f) {
        this.f37201d.setTextSize(f);
    }

    public VisualValidationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo44436a();
    }
}
