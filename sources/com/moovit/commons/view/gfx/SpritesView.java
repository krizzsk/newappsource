package com.moovit.commons.view.gfx;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import l00.C18166a;

public class SpritesView extends View implements GestureDetector.OnGestureListener {

    /* renamed from: b */
    public final ArrayList f41183b = new ArrayList();

    /* renamed from: c */
    public final RectF f41184c;

    /* renamed from: d */
    public final GestureDetector f41185d;

    /* renamed from: e */
    public C18166a f41186e;

    public SpritesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        this.f41184c = new RectF();
        this.f41185d = new GestureDetector(context, this);
        setWillNotDraw(false);
    }

    public RectF getHelpRectF() {
        return this.f41184c;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        C18166a aVar;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int size = this.f41183b.size();
        while (true) {
            size--;
            if (size < 0) {
                aVar = null;
                break;
            }
            aVar = (C18166a) this.f41183b.get(size);
            RectF rectF = this.f41184c;
            if (rectF == null) {
                aVar.getClass();
                rectF = new RectF();
            }
            rectF.set(aVar.f46399a);
            if (rectF.contains(x, y) && aVar.f46399a.contains(x, y)) {
                break;
            }
        }
        if (aVar == null) {
            return false;
        }
        this.f41186e = aVar;
        return false;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f41183b.size();
        for (int i = 0; i < size; i++) {
            C18166a aVar = (C18166a) this.f41183b.get(i);
            RectF rectF = this.f41184c;
            if (rectF == null) {
                aVar.getClass();
                rectF = new RectF();
            }
            rectF.set(aVar.f46399a);
            if (!canvas.quickReject(rectF, Canvas.EdgeType.BW)) {
                canvas.save();
                canvas.clipRect(aVar.f46399a);
                RectF rectF2 = aVar.f46399a;
                canvas.translate(rectF2.left, rectF2.top);
                aVar.mo50586a();
                canvas.restore();
            }
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C18166a aVar = this.f41186e;
        if (aVar == null) {
            return false;
        }
        aVar.getClass();
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C18166a aVar = this.f41186e;
        if (aVar == null) {
            return false;
        }
        aVar.getClass();
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f41185d.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (onTouchEvent) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }
}
