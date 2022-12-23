package com.cubic.umo.pass.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import p222q7.C6211a;

public class GraphicOverlay extends View {

    /* renamed from: b */
    public final Object f7832b = new Object();

    /* renamed from: c */
    public final ArrayList f7833c = new ArrayList();

    /* renamed from: com.cubic.umo.pass.camera.GraphicOverlay$a */
    public static abstract class C2239a {
        /* renamed from: a */
        public abstract void mo11647a();
    }

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Matrix();
        addOnLayoutChangeListener(new C6211a(0, this));
    }

    public int getImageHeight() {
        return 0;
    }

    public int getImageWidth() {
        return 0;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.f7832b) {
            Iterator it = this.f7833c.iterator();
            while (it.hasNext()) {
                ((C2239a) it.next()).mo11647a();
            }
        }
    }
}
