package p553ic;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: ic.a */
public final class C17561a implements View.OnTouchListener {

    /* renamed from: b */
    public final Dialog f45174b;

    /* renamed from: c */
    public final int f45175c;

    /* renamed from: d */
    public final int f45176d;

    /* renamed from: e */
    public final int f45177e;

    public C17561a(Dialog dialog, Rect rect) {
        this.f45174b = dialog;
        this.f45175c = rect.left;
        this.f45176d = rect.top;
        this.f45177e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f45175c;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f45176d;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f45177e;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f45174b.onTouchEvent(obtain);
    }
}
