package m10;

import a00.C13382a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import b00.C13556a;
import ce0.C21100e;
import com.moovit.MoovitActivity;
import com.moovit.genies.Genie;
import java.util.concurrent.TimeUnit;
import p824tp.C19725d;

/* renamed from: m10.a */
public final class C18316a {

    /* renamed from: b */
    public static final long f46707b = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: c */
    public static final C18316a f46708c = new C18316a();

    /* renamed from: a */
    public C18317a f46709a;

    /* renamed from: m10.a$a */
    public class C18317a implements Runnable, C13556a, C19725d.C19726a, ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: b */
        public final MoovitActivity f46710b;

        /* renamed from: c */
        public final Genie f46711c;

        /* renamed from: d */
        public final Handler f46712d;

        /* renamed from: e */
        public final View f46713e;

        /* renamed from: f */
        public final int f46714f;

        /* renamed from: g */
        public final int f46715g;

        /* renamed from: h */
        public PopupWindow f46716h;

        /* renamed from: m10.a$a$a */
        public class C18318a implements View.OnClickListener {
            public C18318a() {
            }

            public final void onClick(View view) {
                C18317a.this.mo50769a();
            }
        }

        /* renamed from: m10.a$a$b */
        public class C18319b implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            public final /* synthetic */ ViewTreeObserver f46719b;

            public C18319b(ViewTreeObserver viewTreeObserver) {
                this.f46719b = viewTreeObserver;
            }

            public final void onDismiss() {
                this.f46719b.removeOnScrollChangedListener(C18317a.this);
            }
        }

        /* renamed from: m10.a$a$c */
        public class C18320c implements View.OnTouchListener {

            /* renamed from: b */
            public final /* synthetic */ Rect f46721b;

            public C18320c(Rect rect) {
                this.f46721b = rect;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                view.getHitRect(this.f46721b);
                int i = 0;
                while (true) {
                    if (i >= motionEvent.getPointerCount()) {
                        break;
                    } else if (!this.f46721b.contains((int) motionEvent.getX(i), (int) motionEvent.getY(i))) {
                        C18317a.this.mo50769a();
                        break;
                    } else {
                        i++;
                    }
                }
                return false;
            }
        }

        public C18317a(MoovitActivity moovitActivity, Genie genie, View view, int i, int i2) {
            C21100e.m49373x(moovitActivity, "activity");
            this.f46710b = moovitActivity;
            C21100e.m49373x(genie, "genie");
            this.f46711c = genie;
            this.f46712d = new Handler(moovitActivity.getMainLooper());
            this.f46713e = view;
            this.f46714f = i;
            this.f46715g = i2;
        }

        /* renamed from: a */
        public final synchronized void mo50769a() {
            cancel(true);
            PopupWindow popupWindow = this.f46716h;
            if (popupWindow != null && popupWindow.isShowing()) {
                this.f46716h.dismiss();
                this.f46716h = null;
            }
            C18316a.this.f46709a = null;
        }

        /* renamed from: b */
        public final void mo44844b(Context context) {
            ((C19725d) context.getSystemService("destruction_notifier")).mo52074c(this);
            cancel(true);
        }

        public final boolean cancel(boolean z) {
            this.f46712d.removeCallbacks(this);
            return true;
        }

        public final void onScrollChanged() {
            mo50769a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x0166  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x017e  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x01d8  */
        /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.moovit.MoovitActivity r0 = r11.f46710b
                tp.d r0 = p824tp.C19725d.m47191a(r0)
                r0.mo52074c(r11)
                com.moovit.MoovitActivity r0 = r11.f46710b
                boolean r1 = r0.f37311x
                r2 = 0
                if (r1 != 0) goto L_0x0015
                m10.a r0 = m10.C18316a.this
                r0.f46709a = r2
                return
            L_0x0015:
                boolean r0 = m10.C18321b.m45096a(r0)
                if (r0 == 0) goto L_0x0020
                m10.a r0 = m10.C18316a.this
                r0.f46709a = r2
                return
            L_0x0020:
                android.view.View r0 = r11.f46713e
                boolean r0 = r0.isShown()
                if (r0 == 0) goto L_0x01fb
                android.view.View r0 = r11.f46713e
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                boolean r0 = r0.getGlobalVisibleRect(r1)
                if (r0 != 0) goto L_0x0037
                goto L_0x01fb
            L_0x0037:
                com.moovit.MoovitActivity r0 = r11.f46710b
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                int r1 = p824tp.C19742t.genie_layout
                r3 = 0
                android.view.View r0 = r0.inflate(r1, r2, r3)
                int r1 = p824tp.C19740r.genie_text
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                com.moovit.genies.Genie r4 = r11.f46711c
                int r4 = r4.getTextResId()
                r1.setText(r4)
                android.widget.PopupWindow r1 = new android.widget.PopupWindow
                r4 = -2
                r1.<init>(r0, r4, r4)
                r11.f46716h = r1
                int r4 = p824tp.C19747y.Animation_Dialog_Genie
                r1.setAnimationStyle(r4)
                int r1 = p824tp.C19740r.genie_close_btn
                android.view.View r1 = r0.findViewById(r1)
                m10.a$a$a r4 = new m10.a$a$a
                r4.<init>()
                r1.setOnClickListener(r4)
                com.moovit.genies.Genie r1 = r11.f46711c
                int r1 = r1.getArrowPosition()
                r4 = 6
                r5 = 5
                r6 = 4
                r7 = 3
                r8 = 2
                if (r1 == r8) goto L_0x00c1
                if (r1 == r7) goto L_0x00b8
                if (r1 == r6) goto L_0x00aa
                if (r1 == r5) goto L_0x009c
                if (r1 == r4) goto L_0x008e
                com.moovit.MoovitActivity r1 = r11.f46710b
                int r9 = p824tp.C19739q.genie_bg_arrow_top_left
                android.graphics.drawable.Drawable r1 = k00.C17988b.m44611b(r9, r1)
                goto L_0x00c9
            L_0x008e:
                k00.d r1 = new k00.d
                com.moovit.MoovitActivity r9 = r11.f46710b
                int r10 = p824tp.C19739q.genie_bg_arrow_top_left
                android.graphics.drawable.Drawable r9 = k00.C17988b.m44611b(r10, r9)
                r1.<init>(r9)
                goto L_0x00c9
            L_0x009c:
                k00.d r1 = new k00.d
                com.moovit.MoovitActivity r9 = r11.f46710b
                int r10 = p824tp.C19739q.genie_bg_arrow_top_center
                android.graphics.drawable.Drawable r9 = k00.C17988b.m44611b(r10, r9)
                r1.<init>(r9)
                goto L_0x00c9
            L_0x00aa:
                k00.d r1 = new k00.d
                com.moovit.MoovitActivity r9 = r11.f46710b
                int r10 = p824tp.C19739q.genie_bg_arrow_top_right
                android.graphics.drawable.Drawable r9 = k00.C17988b.m44611b(r10, r9)
                r1.<init>(r9)
                goto L_0x00c9
            L_0x00b8:
                com.moovit.MoovitActivity r1 = r11.f46710b
                int r9 = p824tp.C19739q.genie_bg_arrow_top_right
                android.graphics.drawable.Drawable r1 = k00.C17988b.m44611b(r9, r1)
                goto L_0x00c9
            L_0x00c1:
                com.moovit.MoovitActivity r1 = r11.f46710b
                int r9 = p824tp.C19739q.genie_bg_arrow_top_center
                android.graphics.drawable.Drawable r1 = k00.C17988b.m44611b(r9, r1)
            L_0x00c9:
                com.moovit.MoovitActivity r9 = r11.f46710b
                int r10 = p824tp.C19735m.colorInfo
                int r9 = p977zz.C20941h.m49043f(r10, r9)
                android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
                if (r1 != 0) goto L_0x00d8
                goto L_0x00e3
            L_0x00d8:
                android.graphics.drawable.Drawable r1 = r1.mutate()
                android.graphics.drawable.Drawable r2 = p141k1.C5450a.m13604g(r1)
                p141k1.C5450a.C5452b.m13617h(r2, r9)
            L_0x00e3:
                java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
                p242s1.C6333d0.C6337d.m15057q(r0, r2)
                com.moovit.MoovitActivity r1 = r11.f46710b
                android.view.Window r1 = r1.getWindow()
                android.view.View r1 = r1.getDecorView()
                int r2 = r1.getWidth()
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r9)
                int r1 = r1.getHeight()
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
                r0.measure(r2, r1)
                com.moovit.genies.Genie r1 = r11.f46711c
                int r1 = r1.getArrowPosition()
                if (r1 == r8) goto L_0x0143
                if (r1 == r7) goto L_0x013b
                if (r1 == r6) goto L_0x0135
                if (r1 == r5) goto L_0x0123
                if (r1 == r4) goto L_0x011e
                android.view.View r0 = r11.f46713e
                int r0 = r0.getHeight()
                goto L_0x0141
            L_0x011e:
                int r0 = r0.getMeasuredHeight()
                goto L_0x0139
            L_0x0123:
                int r1 = r0.getMeasuredHeight()
                int r1 = -r1
                android.view.View r2 = r11.f46713e
                int r2 = r2.getWidth()
                int r2 = r2 / r8
                int r0 = r0.getMeasuredWidth()
                int r0 = r0 / r8
                goto L_0x0155
            L_0x0135:
                int r0 = r0.getMeasuredHeight()
            L_0x0139:
                int r0 = -r0
                goto L_0x0141
            L_0x013b:
                android.view.View r0 = r11.f46713e
                int r0 = r0.getHeight()
            L_0x0141:
                r2 = 0
                goto L_0x0157
            L_0x0143:
                android.view.View r1 = r11.f46713e
                int r1 = r1.getHeight()
                android.view.View r2 = r11.f46713e
                int r2 = r2.getWidth()
                int r2 = r2 / r8
                int r0 = r0.getMeasuredWidth()
                int r0 = r0 / r8
            L_0x0155:
                int r2 = r2 - r0
                r0 = r1
            L_0x0157:
                int r1 = r11.f46714f
                int r2 = r2 + r1
                int r1 = r11.f46715g
                int r0 = r0 + r1
                com.moovit.genies.Genie r1 = r11.f46711c
                int r1 = r1.getDismissType()
                r4 = 1
                if (r1 == r4) goto L_0x017e
                if (r1 == r8) goto L_0x0169
                goto L_0x019c
            L_0x0169:
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                android.widget.PopupWindow r5 = r11.f46716h
                r5.setOutsideTouchable(r4)
                android.widget.PopupWindow r5 = r11.f46716h
                m10.a$a$c r6 = new m10.a$a$c
                r6.<init>(r1)
                r5.setTouchInterceptor(r6)
                goto L_0x019c
            L_0x017e:
                com.moovit.MoovitActivity r1 = r11.f46710b
                r5 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r1 = r1.findViewById(r5)
                android.view.View r1 = r1.getRootView()
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.addOnScrollChangedListener(r11)
                android.widget.PopupWindow r5 = r11.f46716h
                m10.a$a$b r6 = new m10.a$a$b
                r6.<init>(r1)
                r5.setOnDismissListener(r6)
            L_0x019c:
                int[] r1 = new int[r8]
                android.view.View r5 = r11.f46713e
                r5.getLocationInWindow(r1)
                android.widget.PopupWindow r5 = r11.f46716h
                android.view.View r6 = r11.f46713e
                r7 = 8388659(0x800033, float:1.1755015E-38)
                r8 = r1[r3]
                int r8 = r8 + r2
                r1 = r1[r4]
                int r1 = r1 + r0
                r5.showAtLocation(r6, r7, r8, r1)
                m10.a r0 = m10.C18316a.this
                com.moovit.MoovitActivity r1 = r11.f46710b
                com.moovit.genies.Genie r2 = r11.f46711c
                r0.getClass()
                r2.setSeen(r1)
                f00.g$f r0 = m10.C18321b.f46728f
                java.lang.String r5 = "genies_prefs"
                android.content.SharedPreferences r5 = r1.getSharedPreferences(r5, r3)
                long r6 = java.lang.System.currentTimeMillis()
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r0.mo49545d(r5, r6)
                java.lang.String r0 = r2.getAnalyticsConst()
                if (r0 == 0) goto L_0x01fa
                tp.i r2 = p824tp.C19731i.m47197a(r1)
                u2.a r2 = r2.f50173c
                com.moovit.analytics.AnalyticsFlowKey r5 = com.moovit.analytics.AnalyticsFlowKey.GENIE
                hq.b[] r6 = new p543hq.C17474b[r4]
                hq.b$a r7 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r8 = com.moovit.analytics.AnalyticsEventKey.OPEN_ACTIVITY
                r7.<init>(r8)
                com.moovit.analytics.AnalyticsAttributeKey r8 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                r7.mo49939g(r8, r0)
                hq.b r0 = r7.mo49933a()
                r6[r3] = r0
                r2.getClass()
                p269u2.C6677a.m15759j(r1, r5, r4, r6)
            L_0x01fa:
                return
            L_0x01fb:
                m10.a r0 = m10.C18316a.this
                r0.f46709a = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m10.C18316a.C18317a.run():void");
        }
    }

    /* renamed from: a */
    public final void mo50767a(Genie genie, View view, MoovitActivity moovitActivity) {
        mo50768b(genie, view, moovitActivity, 0, 0);
    }

    /* renamed from: b */
    public final void mo50768b(Genie genie, View view, MoovitActivity moovitActivity, int i, int i2) {
        long j;
        if (!moovitActivity.getIntent().getBooleanExtra("suppress_genie_extra", false) && view != null && !C18321b.m45096a(moovitActivity) && C13382a.m33671g(moovitActivity) && this.f46709a == null && genie.canBeShown(moovitActivity)) {
            C18317a aVar = new C18317a(moovitActivity, genie, view, i, i2);
            this.f46709a = aVar;
            Handler handler = aVar.f46712d;
            if (aVar.f46711c.useDefaultDelay()) {
                j = f46707b;
            } else {
                j = 0;
            }
            handler.postDelayed(aVar, j);
            C19725d.m47191a(aVar.f46710b).f50162b.add(aVar);
        }
    }
}
