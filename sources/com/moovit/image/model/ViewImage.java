package com.moovit.image.model;

import android.graphics.PointF;
import android.view.View;

public class ViewImage extends Image {

    /* renamed from: f */
    public final View f41824f;

    /* renamed from: g */
    public final PointF f41825g;

    public ViewImage(String str, View view, PointF pointF) {
        super("ViewImage", str, (String[]) null, false);
        this.f41824f = view;
        this.f41825g = pointF;
    }
}
