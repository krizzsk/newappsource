package i00;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.moovit.commons.utils.Color;
import p622kz.C18160b;

/* renamed from: i00.d */
public final class C17525d {

    /* renamed from: a */
    public final Color f45111a;

    public C17525d(Color color) {
        this.f45111a = color;
    }

    /* renamed from: c */
    public static C17525d m43657c(Context context) {
        int i;
        if (context.getResources().getBoolean(C18160b.draw_fake_window_bg)) {
            i = 16842801;
        } else {
            i = 0;
        }
        return new C17525d(Color.m40220d(i, context));
    }

    /* renamed from: a */
    public final void mo49975a(Canvas canvas, View view, int i, int i2, int i3, int i4) {
        if (this.f45111a != null && i < i3 && i2 < i4) {
            Drawable background = view.getBackground();
            if (background == null || background.getOpacity() != -1) {
                canvas.save();
                canvas.clipRect(i, i2, i3, i4);
                canvas.drawColor(this.f45111a.f41007b);
                canvas.restore();
            }
        }
    }

    /* renamed from: b */
    public final void mo49976b(Canvas canvas, View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        Canvas canvas2 = canvas;
        View view2 = view;
        mo49975a(canvas2, view2, 0, 0, width, view.getPaddingTop());
        int i = height;
        mo49975a(canvas2, view2, 0, 0, view.getPaddingLeft(), i);
        int i2 = width;
        mo49975a(canvas2, view2, 0, height - view.getPaddingBottom(), i2, i);
        mo49975a(canvas2, view2, width - view.getPaddingRight(), 0, i2, i);
    }
}
