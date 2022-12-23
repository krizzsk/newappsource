package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import p111h9.C5155c;
import p111h9.C5156d;
import p111h9.C5157e;
import p111h9.C5158f;
import p111h9.C5159g;
import p111h9.C5160h;
import p111h9.C5161i;
import p111h9.C5162j;
import p111h9.C5169k;

public class PhotoView extends AppCompatImageView {

    /* renamed from: b */
    public C5162j f13076b;

    /* renamed from: c */
    public ImageView.ScaleType f13077c;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5162j getAttacher() {
        return this.f13076b;
    }

    public RectF getDisplayRect() {
        return this.f13076b.mo20896c();
    }

    public Matrix getImageMatrix() {
        return this.f13076b.f17228m;
    }

    public float getMaximumScale() {
        return this.f13076b.f17221f;
    }

    public float getMediumScale() {
        return this.f13076b.f17220e;
    }

    public float getMinimumScale() {
        return this.f13076b.f17219d;
    }

    public float getScale() {
        return this.f13076b.mo20899f();
    }

    public ImageView.ScaleType getScaleType() {
        return this.f13076b.f17239x;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f13076b.f17222g = z;
    }

    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f13076b.mo20901h();
        }
        return frame;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C5162j jVar = this.f13076b;
        if (jVar != null) {
            jVar.mo20901h();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        C5162j jVar = this.f13076b;
        if (jVar != null) {
            jVar.mo20901h();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C5162j jVar = this.f13076b;
        if (jVar != null) {
            jVar.mo20901h();
        }
    }

    public void setMaximumScale(float f) {
        C5162j jVar = this.f13076b;
        C5169k.m13085a(jVar.f17219d, jVar.f17220e, f);
        jVar.f17221f = f;
    }

    public void setMediumScale(float f) {
        C5162j jVar = this.f13076b;
        C5169k.m13085a(jVar.f17219d, f, jVar.f17221f);
        jVar.f17220e = f;
    }

    public void setMinimumScale(float f) {
        C5162j jVar = this.f13076b;
        C5169k.m13085a(f, jVar.f17220e, jVar.f17221f);
        jVar.f17219d = f;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13076b.f17232q = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f13076b.f17225j.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13076b.f17233r = onLongClickListener;
    }

    public void setOnMatrixChangeListener(C5155c cVar) {
        this.f13076b.getClass();
    }

    public void setOnOutsidePhotoTapListener(C5156d dVar) {
        this.f13076b.getClass();
    }

    public void setOnPhotoTapListener(C5157e eVar) {
        this.f13076b.getClass();
    }

    public void setOnScaleChangeListener(C5158f fVar) {
        this.f13076b.f17234s = fVar;
    }

    public void setOnSingleFlingListener(C5159g gVar) {
        this.f13076b.getClass();
    }

    public void setOnViewDragListener(C5160h hVar) {
        this.f13076b.getClass();
    }

    public void setOnViewTapListener(C5161i iVar) {
        this.f13076b.getClass();
    }

    public void setRotationBy(float f) {
        C5162j jVar = this.f13076b;
        jVar.f17229n.postRotate(f % 360.0f);
        jVar.mo20894a();
    }

    public void setRotationTo(float f) {
        C5162j jVar = this.f13076b;
        jVar.f17229n.setRotate(f % 360.0f);
        jVar.mo20894a();
    }

    public void setScale(float f) {
        C5162j jVar = this.f13076b;
        jVar.mo20900g(f, (float) (jVar.f17224i.getRight() / 2), (float) (jVar.f17224i.getBottom() / 2), false);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        C5162j jVar = this.f13076b;
        if (jVar == null) {
            this.f13077c = scaleType;
            return;
        }
        jVar.getClass();
        boolean z = true;
        if (scaleType == null) {
            z = false;
        } else if (C5169k.C5170a.f17255a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (z && scaleType != jVar.f17239x) {
            jVar.f17239x = scaleType;
            jVar.mo20901h();
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f13076b.f17218c = i;
    }

    public void setZoomable(boolean z) {
        C5162j jVar = this.f13076b;
        jVar.f17238w = z;
        jVar.mo20901h();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13076b = new C5162j(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f13077c;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f13077c = null;
        }
    }
}
