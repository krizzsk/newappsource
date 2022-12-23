package p111h9;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p111h9.C5162j;

/* renamed from: h9.a */
public final class C5152a {

    /* renamed from: a */
    public int f17206a = -1;

    /* renamed from: b */
    public int f17207b = 0;

    /* renamed from: c */
    public final ScaleGestureDetector f17208c;

    /* renamed from: d */
    public VelocityTracker f17209d;

    /* renamed from: e */
    public boolean f17210e;

    /* renamed from: f */
    public float f17211f;

    /* renamed from: g */
    public float f17212g;

    /* renamed from: h */
    public final float f17213h;

    /* renamed from: i */
    public final float f17214i;

    /* renamed from: j */
    public C5154b f17215j;

    /* renamed from: h9.a$a */
    public class C5153a implements ScaleGestureDetector.OnScaleGestureListener {
        public C5153a() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
            ((C5162j.C5163a) C5152a.this.f17215j).mo20905a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C5152a(Context context, C5154b bVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17214i = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17213h = (float) viewConfiguration.getScaledTouchSlop();
        this.f17215j = bVar;
        this.f17208c = new ScaleGestureDetector(context, new C5153a());
    }

    /* renamed from: a */
    public final void mo20884a(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        int i3;
        int i4;
        float f5;
        float f6;
        int i5;
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i6 = 0;
        if (action != 0) {
            int i7 = 1;
            if (action == 1) {
                this.f17206a = -1;
                if (this.f17210e && this.f17209d != null) {
                    try {
                        f3 = motionEvent2.getX(this.f17207b);
                    } catch (Exception unused) {
                        f3 = motionEvent.getX();
                    }
                    this.f17211f = f3;
                    try {
                        f4 = motionEvent2.getY(this.f17207b);
                    } catch (Exception unused2) {
                        f4 = motionEvent.getY();
                    }
                    this.f17212g = f4;
                    this.f17209d.addMovement(motionEvent2);
                    this.f17209d.computeCurrentVelocity(1000);
                    float xVelocity = this.f17209d.getXVelocity();
                    float yVelocity = this.f17209d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f17214i) {
                        C5162j.C5163a aVar = (C5162j.C5163a) this.f17215j;
                        C5162j jVar = C5162j.this;
                        jVar.f17235t = new C5162j.C5168f(jVar.f17224i.getContext());
                        C5162j jVar2 = C5162j.this;
                        C5162j.C5168f fVar = jVar2.f17235t;
                        ImageView imageView = jVar2.f17224i;
                        int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
                        ImageView imageView2 = C5162j.this.f17224i;
                        int height = (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom();
                        int i8 = (int) (-xVelocity);
                        int i9 = (int) (-yVelocity);
                        RectF c = C5162j.this.mo20896c();
                        if (c != null) {
                            int round = Math.round(-c.left);
                            float f7 = (float) width;
                            if (f7 < c.width()) {
                                i2 = Math.round(c.width() - f7);
                                i = 0;
                            } else {
                                i2 = round;
                                i = i2;
                            }
                            int round2 = Math.round(-c.top);
                            float f8 = (float) height;
                            if (f8 < c.height()) {
                                i4 = Math.round(c.height() - f8);
                                i3 = 0;
                            } else {
                                i4 = round2;
                                i3 = i4;
                            }
                            fVar.f17252c = round;
                            fVar.f17253d = round2;
                            if (!(round == i2 && round2 == i4)) {
                                fVar.f17251b.fling(round, round2, i8, i9, i, i2, i3, i4, 0, 0);
                            }
                        }
                        C5162j jVar3 = C5162j.this;
                        jVar3.f17224i.post(jVar3.f17235t);
                    }
                }
                VelocityTracker velocityTracker = this.f17209d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f17209d = null;
                }
            } else if (action == 2) {
                try {
                    f5 = motionEvent2.getX(this.f17207b);
                } catch (Exception unused3) {
                    f5 = motionEvent.getX();
                }
                try {
                    f6 = motionEvent2.getY(this.f17207b);
                } catch (Exception unused4) {
                    f6 = motionEvent.getY();
                }
                float f9 = f5 - this.f17211f;
                float f11 = f6 - this.f17212g;
                if (!this.f17210e) {
                    if (Math.sqrt((double) ((f11 * f11) + (f9 * f9))) >= ((double) this.f17213h)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f17210e = z;
                }
                if (this.f17210e) {
                    C5162j.C5163a aVar2 = (C5162j.C5163a) this.f17215j;
                    if (!C5162j.this.f17226k.f17208c.isInProgress()) {
                        C5162j.this.getClass();
                        C5162j.this.f17229n.postTranslate(f9, f11);
                        C5162j.this.mo20894a();
                        ViewParent parent = C5162j.this.f17224i.getParent();
                        C5162j jVar4 = C5162j.this;
                        if (jVar4.f17222g && !jVar4.f17226k.f17208c.isInProgress()) {
                            C5162j jVar5 = C5162j.this;
                            if (!jVar5.f17223h) {
                                int i11 = jVar5.f17236u;
                                if ((i11 == 2 || ((i11 == 0 && f9 >= 1.0f) || ((i11 == 1 && f9 <= -1.0f) || (((i5 = jVar5.f17237v) == 0 && f11 >= 1.0f) || (i5 == 1 && f11 <= -1.0f))))) && parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(false);
                                }
                            }
                        }
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f17211f = f5;
                    this.f17212g = f6;
                    VelocityTracker velocityTracker2 = this.f17209d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent2);
                    }
                }
            } else if (action == 3) {
                this.f17206a = -1;
                VelocityTracker velocityTracker3 = this.f17209d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f17209d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent2.getPointerId(action2) == this.f17206a) {
                    if (action2 != 0) {
                        i7 = 0;
                    }
                    this.f17206a = motionEvent2.getPointerId(i7);
                    this.f17211f = motionEvent2.getX(i7);
                    this.f17212g = motionEvent2.getY(i7);
                }
            }
        } else {
            this.f17206a = motionEvent2.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f17209d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent2);
            }
            try {
                f = motionEvent2.getX(this.f17207b);
            } catch (Exception unused5) {
                f = motionEvent.getX();
            }
            this.f17211f = f;
            try {
                f2 = motionEvent2.getY(this.f17207b);
            } catch (Exception unused6) {
                f2 = motionEvent.getY();
            }
            this.f17212g = f2;
            this.f17210e = false;
        }
        int i12 = this.f17206a;
        if (i12 != -1) {
            i6 = i12;
        }
        this.f17207b = motionEvent2.findPointerIndex(i6);
    }
}
