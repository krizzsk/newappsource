package com.moovit.view.pickers;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Scroller;
import com.moovit.view.pickers.WheelView;
import ia0.C12767e;

/* renamed from: com.moovit.view.pickers.a */
public final class C7969a {

    /* renamed from: a */
    public C7972c f24142a;

    /* renamed from: b */
    public Context f24143b;

    /* renamed from: c */
    public GestureDetector f24144c;

    /* renamed from: d */
    public Scroller f24145d;

    /* renamed from: e */
    public int f24146e;

    /* renamed from: f */
    public float f24147f;

    /* renamed from: g */
    public boolean f24148g;

    /* renamed from: h */
    public C7970a f24149h = new C7970a();

    /* renamed from: i */
    public C7971b f24150i = new C7971b();

    /* renamed from: com.moovit.view.pickers.a$a */
    public class C7970a extends GestureDetector.SimpleOnGestureListener {
        public C7970a() {
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C7969a aVar = C7969a.this;
            aVar.f24146e = 0;
            aVar.f24145d.fling(0, 0, 0, (int) (-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
            C7969a aVar2 = C7969a.this;
            aVar2.f24150i.removeMessages(0);
            aVar2.f24150i.removeMessages(1);
            aVar2.f24150i.sendEmptyMessage(0);
            return true;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }
    }

    /* renamed from: com.moovit.view.pickers.a$b */
    public class C7971b extends Handler {
        public C7971b() {
        }

        public final void handleMessage(Message message) {
            C7969a.this.f24145d.computeScrollOffset();
            int currY = C7969a.this.f24145d.getCurrY();
            C7969a aVar = C7969a.this;
            int i = aVar.f24146e - currY;
            aVar.f24146e = currY;
            if (i != 0) {
                ((WheelView.C7967a) aVar.f24142a).mo24869a(i);
            }
            if (Math.abs(currY - C7969a.this.f24145d.getFinalY()) < 1) {
                C7969a.this.f24145d.getFinalY();
                C7969a.this.f24145d.forceFinished(true);
            }
            if (!C7969a.this.f24145d.isFinished()) {
                C7969a.this.f24150i.sendEmptyMessage(message.what);
            } else if (message.what == 0) {
                C7969a.this.mo24872a();
            } else {
                C7969a aVar2 = C7969a.this;
                if (aVar2.f24148g) {
                    WheelView.C7967a aVar3 = (WheelView.C7967a) aVar2.f24142a;
                    WheelView wheelView = WheelView.this;
                    if (wheelView.f24128g) {
                        for (C12767e b : wheelView.f24136o) {
                            b.mo39617b();
                        }
                        WheelView.this.f24128g = false;
                    }
                    WheelView wheelView2 = WheelView.this;
                    wheelView2.f24129h = 0;
                    wheelView2.invalidate();
                    aVar2.f24148g = false;
                }
            }
        }
    }

    /* renamed from: com.moovit.view.pickers.a$c */
    public interface C7972c {
    }

    public C7969a(Context context, C7972c cVar) {
        GestureDetector gestureDetector = new GestureDetector(context, this.f24149h);
        this.f24144c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f24145d = new Scroller(context);
        this.f24142a = cVar;
        this.f24143b = context;
    }

    /* renamed from: a */
    public final void mo24872a() {
        WheelView.C7967a aVar = (WheelView.C7967a) this.f24142a;
        if (Math.abs(WheelView.this.f24129h) > 1) {
            WheelView wheelView = WheelView.this;
            wheelView.f24127f.mo24873b(wheelView.f24129h);
        }
        this.f24150i.removeMessages(0);
        this.f24150i.removeMessages(1);
        this.f24150i.sendEmptyMessage(1);
    }

    /* renamed from: b */
    public final void mo24873b(int i) {
        this.f24145d.forceFinished(true);
        this.f24146e = 0;
        this.f24145d.startScroll(0, 0, 0, i, 400);
        this.f24150i.removeMessages(0);
        this.f24150i.removeMessages(1);
        this.f24150i.sendEmptyMessage(0);
        mo24874c();
    }

    /* renamed from: c */
    public final void mo24874c() {
        if (!this.f24148g) {
            this.f24148g = true;
            WheelView wheelView = WheelView.this;
            wheelView.f24128g = true;
            for (C12767e a : wheelView.f24136o) {
                a.mo39616a();
            }
        }
    }
}
