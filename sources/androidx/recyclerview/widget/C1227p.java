package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p044ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p204p2.C6033b;
import p204p2.C6034c;
import p242s1.C6333d0;
import p242s1.C6354e;
import p242s1.C6382p0;

/* renamed from: androidx.recyclerview.widget.p */
public final class C1227p extends RecyclerView.C1133l implements RecyclerView.C1139n {

    /* renamed from: A */
    public final C1229b f4622A = new C1229b();

    /* renamed from: B */
    public Rect f4623B;

    /* renamed from: C */
    public long f4624C;

    /* renamed from: b */
    public final ArrayList f4625b = new ArrayList();

    /* renamed from: c */
    public final float[] f4626c = new float[2];

    /* renamed from: d */
    public RecyclerView.C1119a0 f4627d = null;

    /* renamed from: e */
    public float f4628e;

    /* renamed from: f */
    public float f4629f;

    /* renamed from: g */
    public float f4630g;

    /* renamed from: h */
    public float f4631h;

    /* renamed from: i */
    public float f4632i;

    /* renamed from: j */
    public float f4633j;

    /* renamed from: k */
    public float f4634k;

    /* renamed from: l */
    public float f4635l;

    /* renamed from: m */
    public int f4636m = -1;

    /* renamed from: n */
    public C1231d f4637n;

    /* renamed from: o */
    public int f4638o = 0;

    /* renamed from: p */
    public int f4639p;

    /* renamed from: q */
    public ArrayList f4640q = new ArrayList();

    /* renamed from: r */
    public int f4641r;

    /* renamed from: s */
    public RecyclerView f4642s;

    /* renamed from: t */
    public final C1228a f4643t = new C1228a();

    /* renamed from: u */
    public VelocityTracker f4644u;

    /* renamed from: v */
    public ArrayList f4645v;

    /* renamed from: w */
    public ArrayList f4646w;

    /* renamed from: x */
    public View f4647x = null;

    /* renamed from: y */
    public C6354e f4648y;

    /* renamed from: z */
    public C1234e f4649z;

    /* renamed from: androidx.recyclerview.widget.p$a */
    public class C1228a implements Runnable {
        public C1228a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
            if (r11 < 0) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
            if (r11 > 0) goto L_0x007a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0116  */
        /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r17 = this;
                r0 = r17
                androidx.recyclerview.widget.p r1 = androidx.recyclerview.widget.C1227p.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r1.f4627d
                if (r2 == 0) goto L_0x0131
                r2 = -9223372036854775808
                long r4 = java.lang.System.currentTimeMillis()
                long r6 = r1.f4624C
                int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r8 != 0) goto L_0x0017
                r6 = 0
                goto L_0x0019
            L_0x0017:
                long r6 = r4 - r6
            L_0x0019:
                androidx.recyclerview.widget.RecyclerView r8 = r1.f4642s
                androidx.recyclerview.widget.RecyclerView$m r8 = r8.getLayoutManager()
                android.graphics.Rect r9 = r1.f4623B
                if (r9 != 0) goto L_0x002a
                android.graphics.Rect r9 = new android.graphics.Rect
                r9.<init>()
                r1.f4623B = r9
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView$a0 r9 = r1.f4627d
                android.view.View r9 = r9.itemView
                android.graphics.Rect r10 = r1.f4623B
                r8.calculateItemDecorationsForChild(r9, r10)
                boolean r9 = r8.canScrollHorizontally()
                r10 = 0
                if (r9 == 0) goto L_0x0079
                float r9 = r1.f4634k
                float r11 = r1.f4632i
                float r9 = r9 + r11
                int r9 = (int) r9
                android.graphics.Rect r11 = r1.f4623B
                int r11 = r11.left
                int r11 = r9 - r11
                androidx.recyclerview.widget.RecyclerView r12 = r1.f4642s
                int r12 = r12.getPaddingLeft()
                int r11 = r11 - r12
                float r12 = r1.f4632i
                int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r13 >= 0) goto L_0x0056
                if (r11 >= 0) goto L_0x0056
                goto L_0x007a
            L_0x0056:
                int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r11 <= 0) goto L_0x0079
                androidx.recyclerview.widget.RecyclerView$a0 r11 = r1.f4627d
                android.view.View r11 = r11.itemView
                int r11 = r11.getWidth()
                int r11 = r11 + r9
                android.graphics.Rect r9 = r1.f4623B
                int r9 = r9.right
                int r11 = r11 + r9
                androidx.recyclerview.widget.RecyclerView r9 = r1.f4642s
                int r9 = r9.getWidth()
                androidx.recyclerview.widget.RecyclerView r12 = r1.f4642s
                int r12 = r12.getPaddingRight()
                int r9 = r9 - r12
                int r11 = r11 - r9
                if (r11 <= 0) goto L_0x0079
                goto L_0x007a
            L_0x0079:
                r11 = 0
            L_0x007a:
                boolean r8 = r8.canScrollVertically()
                if (r8 == 0) goto L_0x00c1
                float r8 = r1.f4635l
                float r9 = r1.f4633j
                float r8 = r8 + r9
                int r8 = (int) r8
                android.graphics.Rect r9 = r1.f4623B
                int r9 = r9.top
                int r9 = r8 - r9
                androidx.recyclerview.widget.RecyclerView r12 = r1.f4642s
                int r12 = r12.getPaddingTop()
                int r9 = r9 - r12
                float r12 = r1.f4633j
                int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r13 >= 0) goto L_0x009c
                if (r9 >= 0) goto L_0x009c
                goto L_0x00be
            L_0x009c:
                int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x00c1
                androidx.recyclerview.widget.RecyclerView$a0 r9 = r1.f4627d
                android.view.View r9 = r9.itemView
                int r9 = r9.getHeight()
                int r9 = r9 + r8
                android.graphics.Rect r8 = r1.f4623B
                int r8 = r8.bottom
                int r9 = r9 + r8
                androidx.recyclerview.widget.RecyclerView r8 = r1.f4642s
                int r8 = r8.getHeight()
                androidx.recyclerview.widget.RecyclerView r10 = r1.f4642s
                int r10 = r10.getPaddingBottom()
                int r8 = r8 - r10
                int r9 = r9 - r8
                if (r9 <= 0) goto L_0x00c1
            L_0x00be:
                r16 = r9
                goto L_0x00c3
            L_0x00c1:
                r16 = 0
            L_0x00c3:
                if (r11 == 0) goto L_0x00dc
                androidx.recyclerview.widget.p$d r8 = r1.f4637n
                androidx.recyclerview.widget.RecyclerView r9 = r1.f4642s
                androidx.recyclerview.widget.RecyclerView$a0 r10 = r1.f4627d
                android.view.View r10 = r10.itemView
                int r10 = r10.getWidth()
                androidx.recyclerview.widget.RecyclerView r12 = r1.f4642s
                int r12 = r12.getWidth()
                r13 = r6
                int r11 = r8.interpolateOutOfBoundsScroll(r9, r10, r11, r12, r13)
            L_0x00dc:
                r13 = r11
                if (r16 == 0) goto L_0x00fa
                androidx.recyclerview.widget.p$d r8 = r1.f4637n
                androidx.recyclerview.widget.RecyclerView r9 = r1.f4642s
                androidx.recyclerview.widget.RecyclerView$a0 r10 = r1.f4627d
                android.view.View r10 = r10.itemView
                int r10 = r10.getHeight()
                androidx.recyclerview.widget.RecyclerView r11 = r1.f4642s
                int r12 = r11.getHeight()
                r11 = r16
                r15 = r13
                r13 = r6
                int r16 = r8.interpolateOutOfBoundsScroll(r9, r10, r11, r12, r13)
                goto L_0x00fb
            L_0x00fa:
                r15 = r13
            L_0x00fb:
                r6 = r16
                if (r15 != 0) goto L_0x0106
                if (r6 == 0) goto L_0x0102
                goto L_0x0106
            L_0x0102:
                r1.f4624C = r2
                r15 = 0
                goto L_0x0114
            L_0x0106:
                long r7 = r1.f4624C
                int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r9 != 0) goto L_0x010e
                r1.f4624C = r4
            L_0x010e:
                androidx.recyclerview.widget.RecyclerView r1 = r1.f4642s
                r1.scrollBy(r15, r6)
                r15 = 1
            L_0x0114:
                if (r15 == 0) goto L_0x0131
                androidx.recyclerview.widget.p r1 = androidx.recyclerview.widget.C1227p.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r1.f4627d
                if (r2 == 0) goto L_0x011f
                r1.mo5125l(r2)
            L_0x011f:
                androidx.recyclerview.widget.p r1 = androidx.recyclerview.widget.C1227p.this
                androidx.recyclerview.widget.RecyclerView r2 = r1.f4642s
                androidx.recyclerview.widget.p$a r1 = r1.f4643t
                r2.removeCallbacks(r1)
                androidx.recyclerview.widget.p r1 = androidx.recyclerview.widget.C1227p.this
                androidx.recyclerview.widget.RecyclerView r1 = r1.f4642s
                java.util.WeakHashMap<android.view.View, s1.p0> r2 = p242s1.C6333d0.f19990a
                p242s1.C6333d0.C6337d.m15053m(r1, r0)
            L_0x0131:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1227p.C1228a.run():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    public class C1229b implements RecyclerView.C1141p {
        public C1229b() {
        }

        /* renamed from: b */
        public final boolean mo4910b(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C1227p.this.f4648y.mo22474a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            C1235f fVar = null;
            if (actionMasked == 0) {
                C1227p.this.f4636m = motionEvent.getPointerId(0);
                C1227p.this.f4628e = motionEvent.getX();
                C1227p.this.f4629f = motionEvent.getY();
                C1227p pVar = C1227p.this;
                VelocityTracker velocityTracker = pVar.f4644u;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                pVar.f4644u = VelocityTracker.obtain();
                C1227p pVar2 = C1227p.this;
                if (pVar2.f4627d == null) {
                    if (!pVar2.f4640q.isEmpty()) {
                        View i = pVar2.mo5123i(motionEvent);
                        int size = pVar2.f4640q.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            C1235f fVar2 = (C1235f) pVar2.f4640q.get(size);
                            if (fVar2.f4661e.itemView == i) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        C1227p pVar3 = C1227p.this;
                        pVar3.f4628e -= fVar.f4665i;
                        pVar3.f4629f -= fVar.f4666j;
                        pVar3.mo5122h(fVar.f4661e, true);
                        if (C1227p.this.f4625b.remove(fVar.f4661e.itemView)) {
                            C1227p pVar4 = C1227p.this;
                            pVar4.f4637n.clearView(pVar4.f4642s, fVar.f4661e);
                        }
                        C1227p.this.mo5127n(fVar.f4661e, fVar.f4662f);
                        C1227p pVar5 = C1227p.this;
                        pVar5.mo5128o(pVar5.f4639p, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C1227p pVar6 = C1227p.this;
                pVar6.f4636m = -1;
                pVar6.mo5127n((RecyclerView.C1119a0) null, 0);
            } else {
                int i2 = C1227p.this.f4636m;
                if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                    C1227p.this.mo5120f(actionMasked, findPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = C1227p.this.f4644u;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (C1227p.this.f4627d != null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final void mo4911d(boolean z) {
            if (z) {
                C1227p.this.mo5127n((RecyclerView.C1119a0) null, 0);
            }
        }

        public final void onTouchEvent(MotionEvent motionEvent) {
            C1227p.this.f4648y.mo22474a(motionEvent);
            VelocityTracker velocityTracker = C1227p.this.f4644u;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C1227p.this.f4636m != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C1227p.this.f4636m);
                if (findPointerIndex >= 0) {
                    C1227p.this.mo5120f(actionMasked, findPointerIndex, motionEvent);
                }
                C1227p pVar = C1227p.this;
                RecyclerView.C1119a0 a0Var = pVar.f4627d;
                if (a0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = pVar.f4644u;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                C1227p pVar2 = C1227p.this;
                                if (pointerId == pVar2.f4636m) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    pVar2.f4636m = motionEvent.getPointerId(i);
                                    C1227p pVar3 = C1227p.this;
                                    pVar3.mo5128o(pVar3.f4639p, actionIndex, motionEvent);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            pVar.mo5128o(pVar.f4639p, findPointerIndex, motionEvent);
                            C1227p.this.mo5125l(a0Var);
                            C1227p pVar4 = C1227p.this;
                            pVar4.f4642s.removeCallbacks(pVar4.f4643t);
                            C1227p.this.f4643t.run();
                            C1227p.this.f4642s.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    C1227p.this.mo5127n((RecyclerView.C1119a0) null, 0);
                    C1227p.this.f4636m = -1;
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$c */
    public class C1230c extends C1235f {

        /* renamed from: n */
        public final /* synthetic */ int f4652n;

        /* renamed from: o */
        public final /* synthetic */ RecyclerView.C1119a0 f4653o;

        /* renamed from: p */
        public final /* synthetic */ C1227p f4654p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1230c(C1227p pVar, RecyclerView.C1119a0 a0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.C1119a0 a0Var2) {
            super(a0Var, i2, f, f2, f3, f4);
            this.f4654p = pVar;
            this.f4652n = i3;
            this.f4653o = a0Var2;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f4667k) {
                if (this.f4652n <= 0) {
                    C1227p pVar = this.f4654p;
                    pVar.f4637n.clearView(pVar.f4642s, this.f4653o);
                } else {
                    this.f4654p.f4625b.add(this.f4653o.itemView);
                    this.f4664h = true;
                    int i = this.f4652n;
                    if (i > 0) {
                        C1227p pVar2 = this.f4654p;
                        pVar2.f4642s.post(new C1237q(pVar2, this, i));
                    }
                }
                C1227p pVar3 = this.f4654p;
                View view = pVar3.f4647x;
                View view2 = this.f4653o.itemView;
                if (view == view2) {
                    pVar3.mo5126m(view2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$d */
    public static abstract class C1231d {
        private static final Interpolator sDragScrollInterpolator = new C1232a();
        private static final Interpolator sDragViewScrollCapInterpolator = new C1233b();
        private int mCachedMaxScrollSpeed = -1;

        /* renamed from: androidx.recyclerview.widget.p$d$a */
        public class C1232a implements Interpolator {
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.p$d$b */
        public class C1233b implements Interpolator {
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(C6033b.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            int makeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.C1119a0 a0Var, RecyclerView.C1119a0 a0Var2) {
            return true;
        }

        public RecyclerView.C1119a0 chooseDropTarget(RecyclerView.C1119a0 a0Var, List<RecyclerView.C1119a0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            RecyclerView.C1119a0 a0Var2 = a0Var;
            int width = a0Var2.itemView.getWidth() + i;
            int height = a0Var2.itemView.getHeight() + i2;
            int left2 = i - a0Var2.itemView.getLeft();
            int top2 = i2 - a0Var2.itemView.getTop();
            int size = list.size();
            RecyclerView.C1119a0 a0Var3 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.C1119a0 a0Var4 = list.get(i4);
                if (left2 > 0 && (right = a0Var4.itemView.getRight() - width) < 0 && a0Var4.itemView.getRight() > a0Var2.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    a0Var3 = a0Var4;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = a0Var4.itemView.getLeft() - i) > 0 && a0Var4.itemView.getLeft() < a0Var2.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    a0Var3 = a0Var4;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = a0Var4.itemView.getTop() - i2) > 0 && a0Var4.itemView.getTop() < a0Var2.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    a0Var3 = a0Var4;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = a0Var4.itemView.getBottom() - height) < 0 && a0Var4.itemView.getBottom() > a0Var2.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    a0Var3 = a0Var4;
                    i3 = abs;
                }
            }
            return a0Var3;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.C1119a0 a0Var) {
            View view = a0Var.itemView;
            int i = C6034c.item_touch_helper_previous_elevation;
            Object tag = view.getTag(i);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6342i.m15102s(view, floatValue);
            }
            view.setTag(i, (Object) null);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.C1119a0 a0Var) {
            int movementFlags = getMovementFlags(recyclerView, a0Var);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return convertToAbsoluteDirection(movementFlags, C6333d0.C6338e.m15063d(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.C1128j itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200;
                }
                return 250;
            } else if (i == 8) {
                return itemAnimator.f4310e;
            } else {
                return itemAnimator.f4309d;
            }
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.C1119a0 a0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.C1119a0 a0Var);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(RecyclerView.C1119a0 a0Var) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.C1119a0 a0Var) {
            return (getAbsoluteMovementFlags(recyclerView, a0Var) & 16711680) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int maxDragScroll = getMaxDragScroll(recyclerView);
            float f = 1.0f;
            int interpolation = (int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))) * ((float) (((int) Math.signum((float) i2)) * maxDragScroll)));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation2 = (int) (sDragScrollInterpolator.getInterpolation(f) * ((float) interpolation));
            if (interpolation2 != 0) {
                return interpolation2;
            }
            if (i2 > 0) {
                return 1;
            }
            return -1;
        }

        public abstract boolean isItemViewSwipeEnabled();

        public abstract boolean isLongPressDragEnabled();

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1119a0 a0Var, float f, float f2, int i, boolean z) {
            View view = a0Var.itemView;
            if (z && view.getTag(C6034c.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                Float valueOf = Float.valueOf(C6333d0.C6342i.m15092i(view));
                int childCount = recyclerView.getChildCount();
                float f3 = BitmapDescriptorFactory.HUE_RED;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                        float i3 = C6333d0.C6342i.m15092i(childAt);
                        if (i3 > f3) {
                            f3 = i3;
                        }
                    }
                }
                C6333d0.C6342i.m15102s(view, f3 + 1.0f);
                view.setTag(C6034c.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1119a0 a0Var, float f, float f2, int i, boolean z) {
            View view = a0Var.itemView;
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1119a0 a0Var, List<C1235f> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1235f fVar = list.get(i2);
                float f3 = fVar.f4657a;
                float f4 = fVar.f4659c;
                if (f3 == f4) {
                    fVar.f4665i = fVar.f4661e.itemView.getTranslationX();
                } else {
                    fVar.f4665i = C16759e.m42347c(f4, f3, fVar.f4669m, f3);
                }
                float f5 = fVar.f4658b;
                float f6 = fVar.f4660d;
                if (f5 == f6) {
                    fVar.f4666j = fVar.f4661e.itemView.getTranslationY();
                } else {
                    fVar.f4666j = C16759e.m42347c(f6, f5, fVar.f4669m, f5);
                }
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, fVar.f4661e, fVar.f4665i, fVar.f4666j, fVar.f4662f, false);
                canvas.restoreToCount(save);
            }
            if (a0Var != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, a0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1119a0 a0Var, List<C1235f> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            List<C1235f> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C1235f fVar = list2.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, fVar.f4661e, fVar.f4665i, fVar.f4666j, fVar.f4662f, false);
                canvas.restoreToCount(save);
            }
            if (a0Var != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, a0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C1235f fVar2 = list2.get(i3);
                boolean z2 = fVar2.f4668l;
                if (z2 && !fVar2.f4664h) {
                    list2.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.C1119a0 a0Var, RecyclerView.C1119a0 a0Var2);

        public void onMoved(RecyclerView recyclerView, RecyclerView.C1119a0 a0Var, int i, RecyclerView.C1119a0 a0Var2, int i2, int i3, int i4) {
            RecyclerView.C1134m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof C1236g) {
                ((C1236g) layoutManager).prepareForDrop(a0Var.itemView, a0Var2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(a0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.mo4589e0(i2);
                }
                if (layoutManager.getDecoratedRight(a0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.mo4589e0(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(a0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.mo4589e0(i2);
                }
                if (layoutManager.getDecoratedBottom(a0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.mo4589e0(i2);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.C1119a0 a0Var, int i) {
        }

        public abstract void onSwiped(RecyclerView.C1119a0 a0Var, int i);
    }

    /* renamed from: androidx.recyclerview.widget.p$e */
    public class C1234e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f4655b = true;

        public C1234e() {
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            View i;
            RecyclerView.C1119a0 J;
            int i2;
            if (this.f4655b && (i = C1227p.this.mo5123i(motionEvent)) != null && (J = C1227p.this.f4642s.mo4554J(i)) != null) {
                C1227p pVar = C1227p.this;
                if (pVar.f4637n.hasDragFlag(pVar.f4642s, J) && motionEvent.getPointerId(0) == (i2 = C1227p.this.f4636m)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C1227p pVar2 = C1227p.this;
                    pVar2.f4628e = x;
                    pVar2.f4629f = y;
                    pVar2.f4633j = BitmapDescriptorFactory.HUE_RED;
                    pVar2.f4632i = BitmapDescriptorFactory.HUE_RED;
                    if (pVar2.f4637n.isLongPressDragEnabled()) {
                        C1227p.this.mo5127n(J, 2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$f */
    public static class C1235f implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f4657a;

        /* renamed from: b */
        public final float f4658b;

        /* renamed from: c */
        public final float f4659c;

        /* renamed from: d */
        public final float f4660d;

        /* renamed from: e */
        public final RecyclerView.C1119a0 f4661e;

        /* renamed from: f */
        public final int f4662f;

        /* renamed from: g */
        public final ValueAnimator f4663g;

        /* renamed from: h */
        public boolean f4664h;

        /* renamed from: i */
        public float f4665i;

        /* renamed from: j */
        public float f4666j;

        /* renamed from: k */
        public boolean f4667k = false;

        /* renamed from: l */
        public boolean f4668l = false;

        /* renamed from: m */
        public float f4669m;

        public C1235f(RecyclerView.C1119a0 a0Var, int i, float f, float f2, float f3, float f4) {
            this.f4662f = i;
            this.f4661e = a0Var;
            this.f4657a = f;
            this.f4658b = f2;
            this.f4659c = f3;
            this.f4660d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
            this.f4663g = ofFloat;
            ofFloat.addUpdateListener(new C1238r(this));
            ofFloat.setTarget(a0Var.itemView);
            ofFloat.addListener(this);
            this.f4669m = BitmapDescriptorFactory.HUE_RED;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f4669m = 1.0f;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f4668l) {
                this.f4661e.setIsRecyclable(true);
            }
            this.f4668l = true;
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$g */
    public interface C1236g {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    public C1227p(SimpleItemTouchHelperCallback simpleItemTouchHelperCallback) {
        this.f4637n = simpleItemTouchHelperCallback;
    }

    /* renamed from: k */
    public static boolean m3312k(View view, float f, float f2, float f3, float f4) {
        if (f < f3 || f > f3 + ((float) view.getWidth()) || f2 < f4 || f2 > f4 + ((float) view.getHeight())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo4908a(View view) {
        mo5126m(view);
        RecyclerView.C1119a0 J = this.f4642s.mo4554J(view);
        if (J != null) {
            RecyclerView.C1119a0 a0Var = this.f4627d;
            if (a0Var == null || J != a0Var) {
                mo5122h(J, false);
                if (this.f4625b.remove(J.itemView)) {
                    this.f4637n.clearView(this.f4642s, J);
                    return;
                }
                return;
            }
            mo5127n((RecyclerView.C1119a0) null, 0);
        }
    }

    /* renamed from: c */
    public final void mo4909c(View view) {
    }

    /* renamed from: e */
    public final int mo5119e(RecyclerView.C1119a0 a0Var, int i) {
        int i2;
        if ((i & 12) == 0) {
            return 0;
        }
        int i3 = 4;
        if (this.f4632i > BitmapDescriptorFactory.HUE_RED) {
            i2 = 8;
        } else {
            i2 = 4;
        }
        VelocityTracker velocityTracker = this.f4644u;
        if (velocityTracker != null && this.f4636m > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f4637n.getSwipeVelocityThreshold(this.f4631h));
            float xVelocity = this.f4644u.getXVelocity(this.f4636m);
            float yVelocity = this.f4644u.getYVelocity(this.f4636m);
            if (xVelocity > BitmapDescriptorFactory.HUE_RED) {
                i3 = 8;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.f4637n.getSwipeEscapeVelocity(this.f4630g) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float swipeThreshold = this.f4637n.getSwipeThreshold(a0Var) * ((float) this.f4642s.getWidth());
        if ((i & i2) == 0 || Math.abs(this.f4632i) <= swipeThreshold) {
            return 0;
        }
        return i2;
    }

    /* renamed from: f */
    public final void mo5120f(int i, int i2, MotionEvent motionEvent) {
        int absoluteMovementFlags;
        View i3;
        if (this.f4627d == null && i == 2 && this.f4638o != 2 && this.f4637n.isItemViewSwipeEnabled() && this.f4642s.getScrollState() != 1) {
            RecyclerView.C1134m layoutManager = this.f4642s.getLayoutManager();
            int i4 = this.f4636m;
            RecyclerView.C1119a0 a0Var = null;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f4628e);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f4629f);
                float f = (float) this.f4641r;
                if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.canScrollVertically()) && (i3 = mo5123i(motionEvent)) != null))) {
                    a0Var = this.f4642s.mo4554J(i3);
                }
            }
            if (a0Var != null && (absoluteMovementFlags = (this.f4637n.getAbsoluteMovementFlags(this.f4642s, a0Var) & 65280) >> 8) != 0) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                float f2 = x - this.f4628e;
                float f3 = y - this.f4629f;
                float abs3 = Math.abs(f2);
                float abs4 = Math.abs(f3);
                float f4 = (float) this.f4641r;
                if (abs3 >= f4 || abs4 >= f4) {
                    if (abs3 > abs4) {
                        if (f2 < BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f2 > BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else if (f3 < BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 1) == 0) {
                        return;
                    } else {
                        if (f3 > BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.f4633j = BitmapDescriptorFactory.HUE_RED;
                    this.f4632i = BitmapDescriptorFactory.HUE_RED;
                    this.f4636m = motionEvent.getPointerId(0);
                    mo5127n(a0Var, 1);
                }
            }
        }
    }

    /* renamed from: g */
    public final int mo5121g(RecyclerView.C1119a0 a0Var, int i) {
        int i2;
        if ((i & 3) == 0) {
            return 0;
        }
        int i3 = 1;
        if (this.f4633j > BitmapDescriptorFactory.HUE_RED) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        VelocityTracker velocityTracker = this.f4644u;
        if (velocityTracker != null && this.f4636m > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f4637n.getSwipeVelocityThreshold(this.f4631h));
            float xVelocity = this.f4644u.getXVelocity(this.f4636m);
            float yVelocity = this.f4644u.getYVelocity(this.f4636m);
            if (yVelocity > BitmapDescriptorFactory.HUE_RED) {
                i3 = 2;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.f4637n.getSwipeEscapeVelocity(this.f4630g) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float swipeThreshold = this.f4637n.getSwipeThreshold(a0Var) * ((float) this.f4642s.getHeight());
        if ((i & i2) == 0 || Math.abs(this.f4633j) <= swipeThreshold) {
            return 0;
        }
        return i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        rect.setEmpty();
    }

    /* renamed from: h */
    public final void mo5122h(RecyclerView.C1119a0 a0Var, boolean z) {
        C1235f fVar;
        int size = this.f4640q.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (C1235f) this.f4640q.get(size);
            } else {
                return;
            }
        } while (fVar.f4661e != a0Var);
        fVar.f4667k |= z;
        if (!fVar.f4668l) {
            fVar.f4663g.cancel();
        }
        this.f4640q.remove(size);
    }

    /* renamed from: i */
    public final View mo5123i(MotionEvent motionEvent) {
        C1235f fVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.C1119a0 a0Var = this.f4627d;
        if (a0Var != null) {
            View view2 = a0Var.itemView;
            if (m3312k(view2, x, y, this.f4634k + this.f4632i, this.f4635l + this.f4633j)) {
                return view2;
            }
        }
        int size = this.f4640q.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (C1235f) this.f4640q.get(size);
                view = fVar.f4661e.itemView;
            } else {
                RecyclerView recyclerView = this.f4642s;
                int e = recyclerView.f4261f.mo5031e();
                while (true) {
                    e--;
                    if (e < 0) {
                        return null;
                    }
                    View d = recyclerView.f4261f.mo5030d(e);
                    float translationX = d.getTranslationX();
                    float translationY = d.getTranslationY();
                    if (x >= ((float) d.getLeft()) + translationX && x <= ((float) d.getRight()) + translationX && y >= ((float) d.getTop()) + translationY && y <= ((float) d.getBottom()) + translationY) {
                        return d;
                    }
                }
            }
        } while (!m3312k(view, x, y, fVar.f4665i, fVar.f4666j));
        return view;
    }

    /* renamed from: j */
    public final void mo5124j(float[] fArr) {
        if ((this.f4639p & 12) != 0) {
            fArr[0] = (this.f4634k + this.f4632i) - ((float) this.f4627d.itemView.getLeft());
        } else {
            fArr[0] = this.f4627d.itemView.getTranslationX();
        }
        if ((this.f4639p & 3) != 0) {
            fArr[1] = (this.f4635l + this.f4633j) - ((float) this.f4627d.itemView.getTop());
        } else {
            fArr[1] = this.f4627d.itemView.getTranslationY();
        }
    }

    /* renamed from: l */
    public final void mo5125l(RecyclerView.C1119a0 a0Var) {
        int i;
        int i2;
        int i3;
        RecyclerView.C1119a0 a0Var2 = a0Var;
        if (!this.f4642s.isLayoutRequested() && this.f4638o == 2) {
            float moveThreshold = this.f4637n.getMoveThreshold(a0Var2);
            int i4 = (int) (this.f4634k + this.f4632i);
            int i5 = (int) (this.f4635l + this.f4633j);
            if (((float) Math.abs(i5 - a0Var2.itemView.getTop())) >= ((float) a0Var2.itemView.getHeight()) * moveThreshold || ((float) Math.abs(i4 - a0Var2.itemView.getLeft())) >= ((float) a0Var2.itemView.getWidth()) * moveThreshold) {
                ArrayList arrayList = this.f4645v;
                if (arrayList == null) {
                    this.f4645v = new ArrayList();
                    this.f4646w = new ArrayList();
                } else {
                    arrayList.clear();
                    this.f4646w.clear();
                }
                int boundingBoxMargin = this.f4637n.getBoundingBoxMargin();
                int round = Math.round(this.f4634k + this.f4632i) - boundingBoxMargin;
                int round2 = Math.round(this.f4635l + this.f4633j) - boundingBoxMargin;
                int i6 = boundingBoxMargin * 2;
                int width = a0Var2.itemView.getWidth() + round + i6;
                int height = a0Var2.itemView.getHeight() + round2 + i6;
                int i7 = (round + width) / 2;
                int i8 = (round2 + height) / 2;
                RecyclerView.C1134m layoutManager = this.f4642s.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i9 = 0;
                while (i9 < childCount) {
                    View childAt = layoutManager.getChildAt(i9);
                    if (childAt != a0Var2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                        RecyclerView.C1119a0 J = this.f4642s.mo4554J(childAt);
                        i3 = round;
                        i2 = round2;
                        if (this.f4637n.canDropOver(this.f4642s, this.f4627d, J)) {
                            int abs = Math.abs(i7 - ((childAt.getRight() + childAt.getLeft()) / 2));
                            int abs2 = Math.abs(i8 - ((childAt.getBottom() + childAt.getTop()) / 2));
                            int i11 = (abs2 * abs2) + (abs * abs);
                            int size = this.f4645v.size();
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                i = i7;
                                if (i13 >= size || i11 <= ((Integer) this.f4646w.get(i13)).intValue()) {
                                    this.f4645v.add(i12, J);
                                    this.f4646w.add(i12, Integer.valueOf(i11));
                                } else {
                                    i12++;
                                    i13++;
                                    i7 = i;
                                }
                            }
                            this.f4645v.add(i12, J);
                            this.f4646w.add(i12, Integer.valueOf(i11));
                        } else {
                            i = i7;
                        }
                    } else {
                        i = i7;
                        i3 = round;
                        i2 = round2;
                    }
                    i9++;
                    round = i3;
                    round2 = i2;
                    i7 = i;
                }
                ArrayList arrayList2 = this.f4645v;
                if (arrayList2.size() != 0) {
                    RecyclerView.C1119a0 chooseDropTarget = this.f4637n.chooseDropTarget(a0Var2, arrayList2, i4, i5);
                    if (chooseDropTarget == null) {
                        this.f4645v.clear();
                        this.f4646w.clear();
                        return;
                    }
                    int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                    int absoluteAdapterPosition2 = a0Var.getAbsoluteAdapterPosition();
                    if (this.f4637n.onMove(this.f4642s, a0Var2, chooseDropTarget)) {
                        this.f4637n.onMoved(this.f4642s, a0Var, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i4, i5);
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo5126m(View view) {
        if (view == this.f4647x) {
            this.f4647x = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r2 > 0) goto L_0x00b5;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5127n(androidx.recyclerview.widget.RecyclerView.C1119a0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r11.f4627d
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f4638o
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f4624C = r0
            int r4 = r11.f4638o
            r14 = 1
            r11.mo5122h(r12, r14)
            r11.f4638o = r13
            r15 = 2
            if (r13 != r15) goto L_0x002d
            if (r12 == 0) goto L_0x0025
            android.view.View r0 = r12.itemView
            r11.f4647x = r0
            goto L_0x002d
        L_0x0025:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x002d:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$a0 r9 = r11.f4627d
            r8 = 0
            if (r9 == 0) goto L_0x0167
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            r7 = 0
            if (r0 == 0) goto L_0x0152
            if (r4 != r15) goto L_0x0049
            r6 = 0
            goto L_0x00b6
        L_0x0049:
            int r0 = r11.f4638o
            if (r0 != r15) goto L_0x004e
            goto L_0x00b4
        L_0x004e:
            androidx.recyclerview.widget.p$d r0 = r11.f4637n
            androidx.recyclerview.widget.RecyclerView r1 = r11.f4642s
            int r0 = r0.getMovementFlags(r1, r9)
            androidx.recyclerview.widget.p$d r1 = r11.f4637n
            androidx.recyclerview.widget.RecyclerView r2 = r11.f4642s
            java.util.WeakHashMap<android.view.View, s1.p0> r3 = p242s1.C6333d0.f19990a
            int r2 = p242s1.C6333d0.C6338e.m15063d(r2)
            int r1 = r1.convertToAbsoluteDirection(r0, r2)
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 >> r10
            if (r1 != 0) goto L_0x006c
            goto L_0x00b4
        L_0x006c:
            r0 = r0 & r2
            int r0 = r0 >> r10
            float r2 = r11.f4632i
            float r2 = java.lang.Math.abs(r2)
            float r3 = r11.f4633j
            float r3 = java.lang.Math.abs(r3)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0099
            int r2 = r11.mo5119e(r9, r1)
            if (r2 <= 0) goto L_0x0092
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00b5
            androidx.recyclerview.widget.RecyclerView r0 = r11.f4642s
            int r0 = p242s1.C6333d0.C6338e.m15063d(r0)
            int r2 = androidx.recyclerview.widget.C1227p.C1231d.convertToRelativeDirection(r2, r0)
            goto L_0x00b5
        L_0x0092:
            int r2 = r11.mo5121g(r9, r1)
            if (r2 <= 0) goto L_0x00b4
            goto L_0x00b5
        L_0x0099:
            int r2 = r11.mo5121g(r9, r1)
            if (r2 <= 0) goto L_0x00a0
            goto L_0x00b5
        L_0x00a0:
            int r2 = r11.mo5119e(r9, r1)
            if (r2 <= 0) goto L_0x00b4
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00b5
            androidx.recyclerview.widget.RecyclerView r0 = r11.f4642s
            int r0 = p242s1.C6333d0.C6338e.m15063d(r0)
            int r2 = androidx.recyclerview.widget.C1227p.C1231d.convertToRelativeDirection(r2, r0)
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            r6 = r2
        L_0x00b6:
            android.view.VelocityTracker r0 = r11.f4644u
            if (r0 == 0) goto L_0x00bf
            r0.recycle()
            r11.f4644u = r7
        L_0x00bf:
            r0 = 4
            r1 = 0
            if (r6 == r14) goto L_0x00e7
            if (r6 == r15) goto L_0x00e7
            if (r6 == r0) goto L_0x00d3
            if (r6 == r10) goto L_0x00d3
            r2 = 16
            if (r6 == r2) goto L_0x00d3
            r2 = 32
            if (r6 == r2) goto L_0x00d3
            r2 = 0
            goto L_0x00e2
        L_0x00d3:
            float r2 = r11.f4632i
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f4642s
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
        L_0x00e2:
            r17 = r2
            r18 = 0
            goto L_0x00fa
        L_0x00e7:
            float r2 = r11.f4633j
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f4642s
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r2
            r17 = 0
        L_0x00fa:
            if (r4 != r15) goto L_0x00ff
            r5 = 8
            goto L_0x0104
        L_0x00ff:
            if (r6 <= 0) goto L_0x0103
            r5 = 2
            goto L_0x0104
        L_0x0103:
            r5 = 4
        L_0x0104:
            float[] r0 = r11.f4626c
            r11.mo5124j(r0)
            float[] r0 = r11.f4626c
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.p$c r3 = new androidx.recyclerview.widget.p$c
            r0 = r3
            r1 = r23
            r2 = r9
            r14 = r3
            r3 = r5
            r15 = r5
            r5 = r19
            r21 = r6
            r6 = r20
            r13 = r7
            r7 = r17
            r13 = 0
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = 8
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.p$d r0 = r11.f4637n
            androidx.recyclerview.widget.RecyclerView r1 = r11.f4642s
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.getAnimationDuration(r1, r15, r2, r3)
            android.animation.ValueAnimator r2 = r14.f4663g
            r2.setDuration(r0)
            java.util.ArrayList r0 = r11.f4640q
            r0.add(r14)
            r0 = r22
            r0.setIsRecyclable(r13)
            android.animation.ValueAnimator r0 = r14.f4663g
            r0.start()
            r0 = 0
            r8 = 1
            goto L_0x0164
        L_0x0152:
            r0 = r9
            r13 = 0
            r21 = 8
            android.view.View r1 = r0.itemView
            r11.mo5126m(r1)
            androidx.recyclerview.widget.p$d r1 = r11.f4637n
            androidx.recyclerview.widget.RecyclerView r2 = r11.f4642s
            r1.clearView(r2, r0)
            r0 = 0
            r8 = 0
        L_0x0164:
            r11.f4627d = r0
            goto L_0x016b
        L_0x0167:
            r13 = 0
            r21 = 8
            r8 = 0
        L_0x016b:
            if (r12 == 0) goto L_0x019c
            androidx.recyclerview.widget.p$d r0 = r11.f4637n
            androidx.recyclerview.widget.RecyclerView r1 = r11.f4642s
            int r0 = r0.getAbsoluteMovementFlags(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f4638o
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f4639p = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f4634k = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f4635l = r0
            r11.f4627d = r12
            r0 = r25
            r1 = 2
            if (r0 != r1) goto L_0x019c
            android.view.View r0 = r12.itemView
            r0.performHapticFeedback(r13)
        L_0x019c:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f4642s
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01ae
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r11.f4627d
            if (r1 == 0) goto L_0x01aa
            r14 = 1
            goto L_0x01ab
        L_0x01aa:
            r14 = 0
        L_0x01ab:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x01ae:
            if (r8 != 0) goto L_0x01b9
            androidx.recyclerview.widget.RecyclerView r0 = r11.f4642s
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            r0.requestSimpleAnimationsInNextLayout()
        L_0x01b9:
            androidx.recyclerview.widget.p$d r0 = r11.f4637n
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r11.f4627d
            int r2 = r11.f4638o
            r0.onSelectedChanged(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f4642s
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1227p.mo5127n(androidx.recyclerview.widget.RecyclerView$a0, int):void");
    }

    /* renamed from: o */
    public final void mo5128o(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f4628e;
        this.f4632i = f;
        this.f4633j = y - this.f4629f;
        if ((i & 4) == 0) {
            this.f4632i = Math.max(BitmapDescriptorFactory.HUE_RED, f);
        }
        if ((i & 8) == 0) {
            this.f4632i = Math.min(BitmapDescriptorFactory.HUE_RED, this.f4632i);
        }
        if ((i & 1) == 0) {
            this.f4633j = Math.max(BitmapDescriptorFactory.HUE_RED, this.f4633j);
        }
        if ((i & 2) == 0) {
            this.f4633j = Math.min(BitmapDescriptorFactory.HUE_RED, this.f4633j);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        float f;
        float f2;
        if (this.f4627d != null) {
            mo5124j(this.f4626c);
            float[] fArr = this.f4626c;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.f4637n.onDraw(canvas, recyclerView, this.f4627d, this.f4640q, this.f4638o, f2, f);
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        float f;
        float f2;
        if (this.f4627d != null) {
            mo5124j(this.f4626c);
            float[] fArr = this.f4626c;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.f4637n.onDrawOver(canvas, recyclerView, this.f4627d, this.f4640q, this.f4638o, f2, f);
    }
}
