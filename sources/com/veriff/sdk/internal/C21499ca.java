package com.veriff.sdk.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.veriff.sdk.internal.C21512ci;

/* renamed from: com.veriff.sdk.internal.ca */
class C21499ca extends C21476bp<ImageView> {
    public C21499ca(C21512ci ciVar, ImageView imageView, C21525cl clVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, C21487bt btVar, boolean z) {
        super(ciVar, imageView, clVar, i, i2, i3, drawable, str, obj, z);
    }

    /* renamed from: a */
    public void mo54395a(Bitmap bitmap, C21512ci.C21518d dVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f54010c.get();
            if (imageView != null) {
                C21512ci ciVar = this.f54008a;
                Bitmap bitmap2 = bitmap;
                C21512ci.C21518d dVar2 = dVar;
                C21522cj.m51436a(imageView, ciVar.f54110c, bitmap2, dVar2, this.f54011d, ciVar.f54118k);
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: a */
    public void mo54396a(Exception exc) {
        ImageView imageView = (ImageView) this.f54010c.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i = this.f54014g;
            if (i != 0) {
                imageView.setImageResource(i);
                return;
            }
            Drawable drawable2 = this.f54015h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
    }

    /* renamed from: a */
    public void mo54394a() {
        super.mo54394a();
    }
}
