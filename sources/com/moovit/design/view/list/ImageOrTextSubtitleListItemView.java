package com.moovit.design.view.list;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import c00.C13717b;
import com.moovit.design.view.ImagesOrTextsView;
import java.util.List;
import x00.C20440a;

public class ImageOrTextSubtitleListItemView extends AbstractListItemView<TextView, ImagesOrTextsView, ImageView> {
    public ImageOrTextSubtitleListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: l */
    public final AppCompatImageView mo47796l(int i, Context context) {
        return new AppCompatImageView(context, (AttributeSet) null, i);
    }

    /* renamed from: m */
    public final TextView mo47797m(int i, Context context) {
        return new ImagesOrTextsView(context, (AttributeSet) null, i);
    }

    /* renamed from: n */
    public final TextView mo47798n(int i, Context context) {
        return new AppCompatTextView(context, (AttributeSet) null, i);
    }

    public void setSubtitleItems(List<C20440a> list) {
        if (C13717b.m34258e(list)) {
            SV sv = this.f41431t;
            if (sv != null) {
                removeView(sv);
                this.f41431t = null;
                return;
            }
            return;
        }
        mo47807r();
        ImagesOrTextsView imagesOrTextsView = (ImagesOrTextsView) getSubtitleView();
        imagesOrTextsView.setItems(list);
        imagesOrTextsView.setVerticalAlignment(2);
    }

    public ImageOrTextSubtitleListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ImageOrTextSubtitleListItemView(Context context) {
        super(context, (AttributeSet) null);
    }
}
