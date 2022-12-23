package com.google.android.exoplayer2.p052ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.InAppMessageBase;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.p052ui.C4032c0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p099ga.C4879e1;
import p099ga.C4883f;
import p099ga.C4886g;
import p099ga.C4896h;
import p099ga.C4897h0;
import p099ga.C4901j0;
import p099ga.C4910k0;
import p099ga.C4932s0;
import p099ga.C4934t0;
import p099ga.C4936u0;
import p252sb.C6505e;
import p277ub.C6774a0;
import p304x.C7082o;
import p304x.C7099r1;
import p389bl.C13641g;
import p583jk.C17875h;

/* renamed from: com.google.android.exoplayer2.ui.PlayerControlView */
public class PlayerControlView extends FrameLayout {

    /* renamed from: r0 */
    public static final /* synthetic */ int f14203r0 = 0;

    /* renamed from: A */
    public final String f14204A;

    /* renamed from: B */
    public final Drawable f14205B;

    /* renamed from: C */
    public final Drawable f14206C;

    /* renamed from: D */
    public final float f14207D;

    /* renamed from: E */
    public final float f14208E;

    /* renamed from: F */
    public final String f14209F;

    /* renamed from: G */
    public final String f14210G;

    /* renamed from: H */
    public C4936u0 f14211H;

    /* renamed from: I */
    public C4886g f14212I;

    /* renamed from: J */
    public boolean f14213J;

    /* renamed from: K */
    public boolean f14214K;

    /* renamed from: L */
    public boolean f14215L;

    /* renamed from: M */
    public boolean f14216M;

    /* renamed from: N */
    public int f14217N;

    /* renamed from: O */
    public int f14218O;

    /* renamed from: P */
    public int f14219P;

    /* renamed from: Q */
    public boolean f14220Q;

    /* renamed from: R */
    public boolean f14221R;

    /* renamed from: S */
    public boolean f14222S;

    /* renamed from: T */
    public boolean f14223T;

    /* renamed from: U */
    public boolean f14224U;

    /* renamed from: b */
    public final C4005a f14225b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<C4007c> f14226c;

    /* renamed from: d */
    public final View f14227d;

    /* renamed from: e */
    public final View f14228e;

    /* renamed from: f */
    public final View f14229f;

    /* renamed from: g */
    public final View f14230g;

    /* renamed from: h */
    public final View f14231h;

    /* renamed from: i */
    public final View f14232i;

    /* renamed from: j */
    public final ImageView f14233j;

    /* renamed from: k */
    public final ImageView f14234k;

    /* renamed from: l */
    public final View f14235l;

    /* renamed from: l0 */
    public long f14236l0;

    /* renamed from: m */
    public final TextView f14237m;

    /* renamed from: m0 */
    public long[] f14238m0;

    /* renamed from: n */
    public final TextView f14239n;

    /* renamed from: n0 */
    public boolean[] f14240n0;

    /* renamed from: o */
    public final C4032c0 f14241o;

    /* renamed from: o0 */
    public long[] f14242o0;

    /* renamed from: p */
    public final StringBuilder f14243p;

    /* renamed from: p0 */
    public boolean[] f14244p0;

    /* renamed from: q */
    public final Formatter f14245q;

    /* renamed from: q0 */
    public long f14246q0;

    /* renamed from: r */
    public final C4879e1.C4881b f14247r;

    /* renamed from: s */
    public final C4879e1.C4882c f14248s;

    /* renamed from: t */
    public final C7082o f14249t;

    /* renamed from: u */
    public final C7099r1 f14250u;

    /* renamed from: v */
    public final Drawable f14251v;

    /* renamed from: w */
    public final Drawable f14252w;

    /* renamed from: x */
    public final Drawable f14253x;

    /* renamed from: y */
    public final String f14254y;

    /* renamed from: z */
    public final String f14255z;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$a */
    public final class C4005a implements C4936u0.C4938b, C4032c0.C4033a, View.OnClickListener {
        public C4005a() {
        }

        /* renamed from: K */
        public final /* synthetic */ void mo16423K(ExoPlaybackException exoPlaybackException) {
        }

        /* renamed from: L */
        public final /* synthetic */ void mo16424L(boolean z) {
        }

        /* renamed from: M */
        public final /* synthetic */ void mo16425M(int i, boolean z) {
        }

        /* renamed from: P */
        public final /* synthetic */ void mo16426P(C4901j0 j0Var, int i) {
        }

        /* renamed from: Q */
        public final /* synthetic */ void mo16427Q(TrackGroupArray trackGroupArray, C6505e eVar) {
        }

        /* renamed from: S */
        public final /* synthetic */ void mo16428S(int i, C4936u0.C4941e eVar, C4936u0.C4941e eVar2) {
        }

        /* renamed from: V */
        public final /* synthetic */ void mo16429V(int i) {
        }

        /* renamed from: X */
        public final /* synthetic */ void mo16430X() {
        }

        /* renamed from: Z */
        public final /* synthetic */ void mo16431Z(int i, boolean z) {
        }

        /* renamed from: a */
        public final void mo16432a(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.f14216M = true;
            TextView textView = playerControlView.f14239n;
            if (textView != null) {
                textView.setText(C6774a0.m15958r(playerControlView.f14243p, playerControlView.f14245q, j));
            }
        }

        /* renamed from: b */
        public final /* synthetic */ void mo16433b() {
        }

        /* renamed from: b0 */
        public final /* synthetic */ void mo16434b0(C4932s0 s0Var) {
        }

        /* renamed from: c */
        public final void mo16435c(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.f14239n;
            if (textView != null) {
                textView.setText(C6774a0.m15958r(playerControlView.f14243p, playerControlView.f14245q, j));
            }
        }

        /* renamed from: d */
        public final void mo16436d(long j, boolean z) {
            C4936u0 u0Var;
            PlayerControlView playerControlView = PlayerControlView.this;
            int i = 0;
            playerControlView.f14216M = false;
            if (!z && (u0Var = playerControlView.f14211H) != null) {
                C4879e1 s = u0Var.mo20400s();
                if (playerControlView.f14215L && !s.mo20464p()) {
                    int o = s.mo20463o();
                    while (true) {
                        long b = C4883f.m12377b(s.mo20462m(i, playerControlView.f14248s).f16437n);
                        if (j < b) {
                            break;
                        } else if (i == o - 1) {
                            j = b;
                            break;
                        } else {
                            j -= b;
                            i++;
                        }
                    }
                } else {
                    i = u0Var.mo20393k();
                }
                ((C4896h) playerControlView.f14212I).getClass();
                u0Var.mo20405x(i, j);
                playerControlView.mo16400j();
            }
        }

        /* renamed from: d0 */
        public final void mo16437d0(C4936u0.C4939c cVar) {
            if (cVar.mo20608b(5, 6)) {
                PlayerControlView playerControlView = PlayerControlView.this;
                int i = PlayerControlView.f14203r0;
                playerControlView.mo16399i();
            }
            if (cVar.mo20608b(5, 6, 8)) {
                PlayerControlView playerControlView2 = PlayerControlView.this;
                int i2 = PlayerControlView.f14203r0;
                playerControlView2.mo16400j();
            }
            if (cVar.mo20607a(9)) {
                PlayerControlView playerControlView3 = PlayerControlView.this;
                int i3 = PlayerControlView.f14203r0;
                playerControlView3.mo16401k();
            }
            if (cVar.mo20607a(10)) {
                PlayerControlView playerControlView4 = PlayerControlView.this;
                int i4 = PlayerControlView.f14203r0;
                playerControlView4.mo16402l();
            }
            if (cVar.mo20608b(9, 10, 12, 0)) {
                PlayerControlView playerControlView5 = PlayerControlView.this;
                int i5 = PlayerControlView.f14203r0;
                playerControlView5.mo16398h();
            }
            if (cVar.mo20608b(12, 0)) {
                PlayerControlView playerControlView6 = PlayerControlView.this;
                int i6 = PlayerControlView.f14203r0;
                playerControlView6.mo16403m();
            }
        }

        /* renamed from: g */
        public final /* synthetic */ void mo16438g() {
        }

        /* renamed from: h */
        public final /* synthetic */ void mo16439h() {
        }

        /* renamed from: h0 */
        public final /* synthetic */ void mo16440h0(boolean z) {
        }

        /* renamed from: i */
        public final /* synthetic */ void mo16441i() {
        }

        /* renamed from: l */
        public final /* synthetic */ void mo16442l(int i) {
        }

        public final void onClick(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            C4936u0 u0Var = playerControlView.f14211H;
            if (u0Var != null) {
                if (playerControlView.f14228e == view) {
                    ((C4896h) playerControlView.f14212I).mo20534b(u0Var);
                } else if (playerControlView.f14227d == view) {
                    ((C4896h) playerControlView.f14212I).mo20535c(u0Var);
                } else if (playerControlView.f14231h == view) {
                    if (u0Var.mo20364H() != 4) {
                        ((C4896h) PlayerControlView.this.f14212I).mo20533a(u0Var);
                    }
                } else if (playerControlView.f14232i == view) {
                    ((C4896h) playerControlView.f14212I).mo20536d(u0Var);
                } else if (playerControlView.f14229f == view) {
                    playerControlView.mo16385b(u0Var);
                } else if (playerControlView.f14230g == view) {
                    ((C4896h) playerControlView.f14212I).getClass();
                    u0Var.mo20395m(false);
                } else if (playerControlView.f14233j == view) {
                    C4886g gVar = playerControlView.f14212I;
                    int o = C13641g.m34126o(u0Var.mo20368M(), PlayerControlView.this.f14219P);
                    ((C4896h) gVar).getClass();
                    u0Var.mo20366J(o);
                } else if (playerControlView.f14234k == view) {
                    ((C4896h) playerControlView.f14212I).getClass();
                    u0Var.mo20358A(!u0Var.mo20369N());
                }
            }
        }

        /* renamed from: p */
        public final /* synthetic */ void mo16444p(List list) {
        }

        /* renamed from: s */
        public final /* synthetic */ void mo16445s(C4910k0 k0Var) {
        }

        /* renamed from: u */
        public final /* synthetic */ void mo16446u(int i) {
        }

        /* renamed from: w */
        public final /* synthetic */ void mo16447w(boolean z) {
        }

        /* renamed from: y */
        public final /* synthetic */ void mo16448y(int i) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$b */
    public interface C4006b {
        /* renamed from: a */
        void mo16449a();
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$c */
    public interface C4007c {
        /* renamed from: a */
        void mo16450a();
    }

    static {
        C4897h0.m12445a();
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final boolean mo16384a(KeyEvent keyEvent) {
        boolean z;
        int keyCode = keyEvent.getKeyCode();
        C4936u0 u0Var = this.f14211H;
        if (u0Var != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (u0Var.mo20364H() != 4) {
                            ((C4896h) this.f14212I).mo20533a(u0Var);
                        }
                    } else if (keyCode == 89) {
                        ((C4896h) this.f14212I).mo20536d(u0Var);
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            int H = u0Var.mo20364H();
                            if (H == 1 || H == 4 || !u0Var.mo20407z()) {
                                mo16385b(u0Var);
                            } else {
                                ((C4896h) this.f14212I).getClass();
                                u0Var.mo20395m(false);
                            }
                        } else if (keyCode == 87) {
                            ((C4896h) this.f14212I).mo20534b(u0Var);
                        } else if (keyCode == 88) {
                            ((C4896h) this.f14212I).mo20535c(u0Var);
                        } else if (keyCode == 126) {
                            mo16385b(u0Var);
                        } else if (keyCode == 127) {
                            ((C4896h) this.f14212I).getClass();
                            u0Var.mo20395m(false);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo16385b(C4936u0 u0Var) {
        int H = u0Var.mo20364H();
        if (H == 1) {
            ((C4896h) this.f14212I).getClass();
            u0Var.mo20384c();
        } else if (H == 4) {
            int k = u0Var.mo20393k();
            ((C4896h) this.f14212I).getClass();
            u0Var.mo20405x(k, -9223372036854775807L);
        }
        ((C4896h) this.f14212I).getClass();
        u0Var.mo20395m(true);
    }

    /* renamed from: c */
    public final void mo16386c() {
        if (mo16390e()) {
            setVisibility(8);
            Iterator<C4007c> it = this.f14226c.iterator();
            while (it.hasNext()) {
                getVisibility();
                it.next().mo16450a();
            }
            removeCallbacks(this.f14249t);
            removeCallbacks(this.f14250u);
            this.f14236l0 = -9223372036854775807L;
        }
    }

    /* renamed from: d */
    public final void mo16387d() {
        removeCallbacks(this.f14250u);
        if (this.f14217N > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = (long) this.f14217N;
            this.f14236l0 = uptimeMillis + j;
            if (this.f14213J) {
                postDelayed(this.f14250u, j);
                return;
            }
            return;
        }
        this.f14236l0 = -9223372036854775807L;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return mo16384a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f14250u);
        } else if (motionEvent.getAction() == 1) {
            mo16387d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final boolean mo16390e() {
        return getVisibility() == 0;
    }

    /* renamed from: f */
    public final boolean mo16391f() {
        C4936u0 u0Var = this.f14211H;
        if (u0Var == null || u0Var.mo20364H() == 4 || this.f14211H.mo20364H() == 1 || !this.f14211H.mo20407z()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void mo16392g(View view, boolean z, boolean z2) {
        float f;
        int i;
        if (view != null) {
            view.setEnabled(z2);
            if (z2) {
                f = this.f14207D;
            } else {
                f = this.f14208E;
            }
            view.setAlpha(f);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public C4936u0 getPlayer() {
        return this.f14211H;
    }

    public int getRepeatToggleModes() {
        return this.f14219P;
    }

    public boolean getShowShuffleButton() {
        return this.f14224U;
    }

    public int getShowTimeoutMs() {
        return this.f14217N;
    }

    public boolean getShowVrButton() {
        View view = this.f14235l;
        return view != null && view.getVisibility() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16398h() {
        /*
            r11 = this;
            boolean r0 = r11.mo16390e()
            if (r0 == 0) goto L_0x00af
            boolean r0 = r11.f14213J
            if (r0 != 0) goto L_0x000c
            goto L_0x00af
        L_0x000c:
            ga.u0 r0 = r11.f14211H
            r1 = 0
            if (r0 == 0) goto L_0x0088
            ga.e1 r2 = r0.mo20400s()
            boolean r3 = r2.mo20464p()
            if (r3 != 0) goto L_0x0088
            boolean r3 = r0.mo20385d()
            if (r3 != 0) goto L_0x0088
            r3 = 4
            boolean r3 = r0.mo20454p(r3)
            int r4 = r0.mo20393k()
            ga.e1$c r5 = r11.f14248s
            r2.mo20462m(r4, r5)
            r2 = 1
            if (r3 != 0) goto L_0x0044
            ga.e1$c r4 = r11.f14248s
            boolean r4 = r4.mo20470a()
            if (r4 == 0) goto L_0x0044
            r4 = 6
            boolean r4 = r0.mo20454p(r4)
            if (r4 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r4 = 0
            goto L_0x0045
        L_0x0044:
            r4 = 1
        L_0x0045:
            r5 = 0
            if (r3 == 0) goto L_0x005a
            ga.g r7 = r11.f14212I
            ga.h r7 = (p099ga.C4896h) r7
            long r7 = r7.f16508b
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0055
            r7 = 1
            goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            if (r7 == 0) goto L_0x005a
            r7 = 1
            goto L_0x005b
        L_0x005a:
            r7 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x006e
            ga.g r8 = r11.f14212I
            ga.h r8 = (p099ga.C4896h) r8
            long r8 = r8.f16509c
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0069
            r5 = 1
            goto L_0x006a
        L_0x0069:
            r5 = 0
        L_0x006a:
            if (r5 == 0) goto L_0x006e
            r5 = 1
            goto L_0x006f
        L_0x006e:
            r5 = 0
        L_0x006f:
            ga.e1$c r6 = r11.f14248s
            boolean r6 = r6.mo20470a()
            if (r6 == 0) goto L_0x007d
            ga.e1$c r6 = r11.f14248s
            boolean r6 = r6.f16432i
            if (r6 != 0) goto L_0x0084
        L_0x007d:
            r6 = 5
            boolean r0 = r0.mo20454p(r6)
            if (r0 == 0) goto L_0x0085
        L_0x0084:
            r1 = 1
        L_0x0085:
            r0 = r1
            r1 = r4
            goto L_0x008c
        L_0x0088:
            r0 = 0
            r3 = 0
            r5 = 0
            r7 = 0
        L_0x008c:
            boolean r2 = r11.f14222S
            android.view.View r4 = r11.f14227d
            r11.mo16392g(r4, r2, r1)
            boolean r1 = r11.f14220Q
            android.view.View r2 = r11.f14232i
            r11.mo16392g(r2, r1, r7)
            boolean r1 = r11.f14221R
            android.view.View r2 = r11.f14231h
            r11.mo16392g(r2, r1, r5)
            boolean r1 = r11.f14223T
            android.view.View r2 = r11.f14228e
            r11.mo16392g(r2, r1, r0)
            com.google.android.exoplayer2.ui.c0 r0 = r11.f14241o
            if (r0 == 0) goto L_0x00af
            r0.setEnabled(r3)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.PlayerControlView.mo16398h():void");
    }

    /* renamed from: i */
    public final void mo16399i() {
        boolean z;
        View view;
        View view2;
        boolean z2;
        int i;
        if (mo16390e() && this.f14213J) {
            boolean f = mo16391f();
            View view3 = this.f14229f;
            boolean z3 = true;
            int i2 = 8;
            if (view3 != null) {
                if (!f || !view3.isFocused()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z = z2 | false;
                View view4 = this.f14229f;
                if (f) {
                    i = 8;
                } else {
                    i = 0;
                }
                view4.setVisibility(i);
            } else {
                z = false;
            }
            View view5 = this.f14230g;
            if (view5 != null) {
                if (f || !view5.isFocused()) {
                    z3 = false;
                }
                z |= z3;
                View view6 = this.f14230g;
                if (f) {
                    i2 = 0;
                }
                view6.setVisibility(i2);
            }
            if (z) {
                boolean f2 = mo16391f();
                if (!f2 && (view2 = this.f14229f) != null) {
                    view2.requestFocus();
                } else if (f2 && (view = this.f14230g) != null) {
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo16400j() {
        long j;
        int i;
        long j2;
        if (mo16390e() && this.f14213J) {
            C4936u0 u0Var = this.f14211H;
            long j3 = 0;
            if (u0Var != null) {
                j3 = this.f14246q0 + u0Var.mo20362E();
                j = this.f14246q0 + u0Var.mo20370O();
            } else {
                j = 0;
            }
            TextView textView = this.f14239n;
            if (textView != null && !this.f14216M) {
                textView.setText(C6774a0.m15958r(this.f14243p, this.f14245q, j3));
            }
            C4032c0 c0Var = this.f14241o;
            if (c0Var != null) {
                c0Var.setPosition(j3);
                this.f14241o.setBufferedPosition(j);
            }
            removeCallbacks(this.f14249t);
            if (u0Var == null) {
                i = 1;
            } else {
                i = u0Var.mo20364H();
            }
            long j4 = 1000;
            if (u0Var != null && u0Var.isPlaying()) {
                C4032c0 c0Var2 = this.f14241o;
                if (c0Var2 != null) {
                    j2 = c0Var2.getPreferredUpdateDelay();
                } else {
                    j2 = 1000;
                }
                long min = Math.min(j2, 1000 - (j3 % 1000));
                float f = u0Var.mo20382b().f16696a;
                if (f > BitmapDescriptorFactory.HUE_RED) {
                    j4 = (long) (((float) min) / f);
                }
                postDelayed(this.f14249t, C6774a0.m15948h(j4, (long) this.f14218O, 1000));
            } else if (i != 4 && i != 1) {
                postDelayed(this.f14249t, 1000);
            }
        }
    }

    /* renamed from: k */
    public final void mo16401k() {
        ImageView imageView;
        if (mo16390e() && this.f14213J && (imageView = this.f14233j) != null) {
            if (this.f14219P == 0) {
                mo16392g(imageView, false, false);
                return;
            }
            C4936u0 u0Var = this.f14211H;
            if (u0Var == null) {
                mo16392g(imageView, true, false);
                this.f14233j.setImageDrawable(this.f14251v);
                this.f14233j.setContentDescription(this.f14254y);
                return;
            }
            mo16392g(imageView, true, true);
            int M = u0Var.mo20368M();
            if (M == 0) {
                this.f14233j.setImageDrawable(this.f14251v);
                this.f14233j.setContentDescription(this.f14254y);
            } else if (M == 1) {
                this.f14233j.setImageDrawable(this.f14252w);
                this.f14233j.setContentDescription(this.f14255z);
            } else if (M == 2) {
                this.f14233j.setImageDrawable(this.f14253x);
                this.f14233j.setContentDescription(this.f14204A);
            }
            this.f14233j.setVisibility(0);
        }
    }

    /* renamed from: l */
    public final void mo16402l() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (mo16390e() && this.f14213J && (imageView = this.f14234k) != null) {
            C4936u0 u0Var = this.f14211H;
            if (!this.f14224U) {
                mo16392g(imageView, false, false);
            } else if (u0Var == null) {
                mo16392g(imageView, true, false);
                this.f14234k.setImageDrawable(this.f14206C);
                this.f14234k.setContentDescription(this.f14210G);
            } else {
                mo16392g(imageView, true, true);
                ImageView imageView2 = this.f14234k;
                if (u0Var.mo20369N()) {
                    drawable = this.f14205B;
                } else {
                    drawable = this.f14206C;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f14234k;
                if (u0Var.mo20369N()) {
                    str = this.f14209F;
                } else {
                    str = this.f14210G;
                }
                imageView3.setContentDescription(str);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0144  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16403m() {
        /*
            r21 = this;
            r0 = r21
            ga.u0 r1 = r0.f14211H
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r2 = r0.f14214K
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x003c
            ga.e1 r2 = r1.mo20400s()
            ga.e1$c r7 = r0.f14248s
            int r8 = r2.mo20463o()
            r9 = 100
            if (r8 <= r9) goto L_0x0021
            goto L_0x0032
        L_0x0021:
            int r8 = r2.mo20463o()
            r9 = 0
        L_0x0026:
            if (r9 >= r8) goto L_0x0037
            ga.e1$c r10 = r2.mo20462m(r9, r7)
            long r10 = r10.f16437n
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x0034
        L_0x0032:
            r2 = 0
            goto L_0x0038
        L_0x0034:
            int r9 = r9 + 1
            goto L_0x0026
        L_0x0037:
            r2 = 1
        L_0x0038:
            if (r2 == 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            r0.f14215L = r2
            r7 = 0
            r0.f14246q0 = r7
            ga.e1 r2 = r1.mo20400s()
            boolean r9 = r2.mo20464p()
            if (r9 != 0) goto L_0x012a
            int r1 = r1.mo20393k()
            boolean r9 = r0.f14215L
            if (r9 == 0) goto L_0x0057
            r10 = 0
            goto L_0x0058
        L_0x0057:
            r10 = r1
        L_0x0058:
            if (r9 == 0) goto L_0x0060
            int r9 = r2.mo20463o()
            int r9 = r9 - r6
            goto L_0x0061
        L_0x0060:
            r9 = r1
        L_0x0061:
            r11 = r7
            r13 = 0
        L_0x0063:
            if (r10 > r9) goto L_0x0128
            if (r10 != r1) goto L_0x006d
            long r14 = p099ga.C4883f.m12377b(r11)
            r0.f14246q0 = r14
        L_0x006d:
            ga.e1$c r14 = r0.f14248s
            r2.mo20462m(r10, r14)
            ga.e1$c r14 = r0.f14248s
            long r7 = r14.f16437n
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 != 0) goto L_0x0082
            boolean r1 = r0.f14215L
            r1 = r1 ^ r6
            p583jk.C17875h.m44304o(r1)
            goto L_0x0128
        L_0x0082:
            int r7 = r14.f16438o
        L_0x0084:
            ga.e1$c r8 = r0.f14248s
            int r14 = r8.f16439p
            if (r7 > r14) goto L_0x0116
            ga.e1$b r8 = r0.f14247r
            r2.mo20345f(r7, r8, r5)
            ga.e1$b r8 = r0.f14247r
            hb.a r8 = r8.f16421g
            int r8 = r8.f17303b
            r14 = 0
        L_0x0096:
            if (r14 >= r8) goto L_0x0105
            ga.e1$b r15 = r0.f14247r
            hb.a r5 = r15.f16421g
            long[] r5 = r5.f17304c
            r17 = r5[r14]
            r19 = -9223372036854775808
            int r5 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            r19 = r7
            if (r5 != 0) goto L_0x00b4
            long r6 = r15.f16418d
            int r17 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r17 != 0) goto L_0x00b2
            r5 = 1
            r6 = 0
            goto L_0x00f9
        L_0x00b2:
            r17 = r6
        L_0x00b4:
            long r6 = r15.f16419e
            long r17 = r17 + r6
            r6 = 0
            int r15 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r15 < 0) goto L_0x00f8
            long[] r15 = r0.f14238m0
            int r3 = r15.length
            if (r13 != r3) goto L_0x00d9
            int r3 = r15.length
            if (r3 != 0) goto L_0x00c8
            r3 = 1
            goto L_0x00cb
        L_0x00c8:
            int r3 = r15.length
            int r3 = r3 * 2
        L_0x00cb:
            long[] r4 = java.util.Arrays.copyOf(r15, r3)
            r0.f14238m0 = r4
            boolean[] r4 = r0.f14240n0
            boolean[] r3 = java.util.Arrays.copyOf(r4, r3)
            r0.f14240n0 = r3
        L_0x00d9:
            long[] r3 = r0.f14238m0
            long r17 = r11 + r17
            long r17 = p099ga.C4883f.m12377b(r17)
            r3[r13] = r17
            boolean[] r3 = r0.f14240n0
            ga.e1$b r4 = r0.f14247r
            hb.a r4 = r4.f16421g
            hb.a$a[] r4 = r4.f17305d
            r4 = r4[r14]
            boolean r4 = r4.mo20994b()
            r5 = 1
            r4 = r4 ^ r5
            r3[r13] = r4
            int r13 = r13 + 1
            goto L_0x00f9
        L_0x00f8:
            r5 = 1
        L_0x00f9:
            int r14 = r14 + 1
            r7 = r19
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            goto L_0x0096
        L_0x0105:
            r19 = r7
            r5 = 1
            r6 = 0
            int r3 = r19 + 1
            r7 = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            goto L_0x0084
        L_0x0116:
            r5 = 1
            r6 = 0
            long r3 = r8.f16437n
            long r11 = r11 + r3
            int r10 = r10 + 1
            r7 = r6
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            goto L_0x0063
        L_0x0128:
            r7 = r11
            goto L_0x012d
        L_0x012a:
            r6 = r7
            r7 = r6
            r13 = 0
        L_0x012d:
            long r1 = p099ga.C4883f.m12377b(r7)
            android.widget.TextView r3 = r0.f14237m
            if (r3 == 0) goto L_0x0140
            java.lang.StringBuilder r4 = r0.f14243p
            java.util.Formatter r5 = r0.f14245q
            java.lang.String r4 = p277ub.C6774a0.m15958r(r4, r5, r1)
            r3.setText(r4)
        L_0x0140:
            com.google.android.exoplayer2.ui.c0 r3 = r0.f14241o
            if (r3 == 0) goto L_0x0177
            r3.setDuration(r1)
            long[] r1 = r0.f14242o0
            int r1 = r1.length
            int r2 = r13 + r1
            long[] r3 = r0.f14238m0
            int r4 = r3.length
            if (r2 <= r4) goto L_0x015f
            long[] r3 = java.util.Arrays.copyOf(r3, r2)
            r0.f14238m0 = r3
            boolean[] r3 = r0.f14240n0
            boolean[] r3 = java.util.Arrays.copyOf(r3, r2)
            r0.f14240n0 = r3
        L_0x015f:
            long[] r3 = r0.f14242o0
            long[] r4 = r0.f14238m0
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r13, r1)
            boolean[] r3 = r0.f14244p0
            boolean[] r4 = r0.f14240n0
            java.lang.System.arraycopy(r3, r5, r4, r13, r1)
            com.google.android.exoplayer2.ui.c0 r1 = r0.f14241o
            long[] r3 = r0.f14238m0
            boolean[] r4 = r0.f14240n0
            r1.mo16353b(r3, r4, r2)
        L_0x0177:
            r21.mo16400j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.PlayerControlView.mo16403m():void");
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14213J = true;
        long j = this.f14236l0;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                mo16386c();
            } else {
                postDelayed(this.f14250u, uptimeMillis);
            }
        } else if (mo16390e()) {
            mo16387d();
        }
        mo16399i();
        mo16398h();
        mo16401k();
        mo16402l();
        mo16403m();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14213J = false;
        removeCallbacks(this.f14249t);
        removeCallbacks(this.f14250u);
    }

    public void setControlDispatcher(C4886g gVar) {
        if (this.f14212I != gVar) {
            this.f14212I = gVar;
            mo16398h();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        C4886g gVar = this.f14212I;
        if (gVar instanceof C4896h) {
            ((C4896h) gVar).f16509c = (long) i;
            mo16398h();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(C4934t0 t0Var) {
    }

    public void setPlayer(C4936u0 u0Var) {
        boolean z;
        boolean z2 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        if (u0Var == null || u0Var.mo20401t() == Looper.getMainLooper()) {
            z2 = true;
        }
        C17875h.m44301k(z2);
        C4936u0 u0Var2 = this.f14211H;
        if (u0Var2 != u0Var) {
            if (u0Var2 != null) {
                u0Var2.mo20404w(this.f14225b);
            }
            this.f14211H = u0Var;
            if (u0Var != null) {
                u0Var.mo20388g(this.f14225b);
            }
            mo16399i();
            mo16398h();
            mo16401k();
            mo16402l();
            mo16403m();
        }
    }

    public void setProgressUpdateListener(C4006b bVar) {
    }

    public void setRepeatToggleModes(int i) {
        this.f14219P = i;
        C4936u0 u0Var = this.f14211H;
        if (u0Var != null) {
            int M = u0Var.mo20368M();
            if (i == 0 && M != 0) {
                C4886g gVar = this.f14212I;
                C4936u0 u0Var2 = this.f14211H;
                ((C4896h) gVar).getClass();
                u0Var2.mo20366J(0);
            } else if (i == 1 && M == 2) {
                C4886g gVar2 = this.f14212I;
                C4936u0 u0Var3 = this.f14211H;
                ((C4896h) gVar2).getClass();
                u0Var3.mo20366J(1);
            } else if (i == 2 && M == 1) {
                C4886g gVar3 = this.f14212I;
                C4936u0 u0Var4 = this.f14211H;
                ((C4896h) gVar3).getClass();
                u0Var4.mo20366J(2);
            }
        }
        mo16401k();
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        C4886g gVar = this.f14212I;
        if (gVar instanceof C4896h) {
            ((C4896h) gVar).f16508b = (long) i;
            mo16398h();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        this.f14221R = z;
        mo16398h();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f14214K = z;
        mo16403m();
    }

    public void setShowNextButton(boolean z) {
        this.f14223T = z;
        mo16398h();
    }

    public void setShowPreviousButton(boolean z) {
        this.f14222S = z;
        mo16398h();
    }

    public void setShowRewindButton(boolean z) {
        this.f14220Q = z;
        mo16398h();
    }

    public void setShowShuffleButton(boolean z) {
        this.f14224U = z;
        mo16402l();
    }

    public void setShowTimeoutMs(int i) {
        this.f14217N = i;
        if (mo16390e()) {
            mo16387d();
        }
    }

    public void setShowVrButton(boolean z) {
        int i;
        View view = this.f14235l;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f14218O = C6774a0.m15947g(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z;
        View view = this.f14235l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            mo16392g(this.f14235l, showVrButton, z);
        }
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = C4042k.exo_player_control_view;
        int i3 = InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        this.f14217N = InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        this.f14219P = 0;
        this.f14218O = 200;
        this.f14236l0 = -9223372036854775807L;
        this.f14220Q = true;
        this.f14221R = true;
        this.f14222S = true;
        this.f14223T = true;
        this.f14224U = false;
        int i4 = 15000;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C4046o.PlayerControlView, 0, 0);
            try {
                i3 = obtainStyledAttributes.getInt(C4046o.PlayerControlView_rewind_increment, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
                i4 = obtainStyledAttributes.getInt(C4046o.PlayerControlView_fastforward_increment, 15000);
                this.f14217N = obtainStyledAttributes.getInt(C4046o.PlayerControlView_show_timeout, this.f14217N);
                i2 = obtainStyledAttributes.getResourceId(C4046o.PlayerControlView_controller_layout_id, i2);
                this.f14219P = obtainStyledAttributes.getInt(C4046o.PlayerControlView_repeat_toggle_modes, this.f14219P);
                this.f14220Q = obtainStyledAttributes.getBoolean(C4046o.PlayerControlView_show_rewind_button, this.f14220Q);
                this.f14221R = obtainStyledAttributes.getBoolean(C4046o.PlayerControlView_show_fastforward_button, this.f14221R);
                this.f14222S = obtainStyledAttributes.getBoolean(C4046o.PlayerControlView_show_previous_button, this.f14222S);
                this.f14223T = obtainStyledAttributes.getBoolean(C4046o.PlayerControlView_show_next_button, this.f14223T);
                this.f14224U = obtainStyledAttributes.getBoolean(C4046o.PlayerControlView_show_shuffle_button, this.f14224U);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(C4046o.PlayerControlView_time_bar_min_update_interval, this.f14218O));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f14226c = new CopyOnWriteArrayList<>();
        this.f14247r = new C4879e1.C4881b();
        this.f14248s = new C4879e1.C4882c();
        StringBuilder sb = new StringBuilder();
        this.f14243p = sb;
        this.f14245q = new Formatter(sb, Locale.getDefault());
        this.f14238m0 = new long[0];
        this.f14240n0 = new boolean[0];
        this.f14242o0 = new long[0];
        this.f14244p0 = new boolean[0];
        C4005a aVar = new C4005a();
        this.f14225b = aVar;
        this.f14212I = new C4896h((long) i4, (long) i3);
        this.f14249t = new C7082o(this, 7);
        this.f14250u = new C7099r1(this, 7);
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        int i5 = C4040i.exo_progress;
        C4032c0 c0Var = (C4032c0) findViewById(i5);
        View findViewById = findViewById(C4040i.exo_progress_placeholder);
        if (c0Var != null) {
            this.f14241o = c0Var;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, (AttributeSet) null, 0, attributeSet2);
            defaultTimeBar.setId(i5);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f14241o = defaultTimeBar;
        } else {
            this.f14241o = null;
        }
        this.f14237m = (TextView) findViewById(C4040i.exo_duration);
        this.f14239n = (TextView) findViewById(C4040i.exo_position);
        C4032c0 c0Var2 = this.f14241o;
        if (c0Var2 != null) {
            c0Var2.mo16352a(aVar);
        }
        View findViewById2 = findViewById(C4040i.exo_play);
        this.f14229f = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(aVar);
        }
        View findViewById3 = findViewById(C4040i.exo_pause);
        this.f14230g = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(aVar);
        }
        View findViewById4 = findViewById(C4040i.exo_prev);
        this.f14227d = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(aVar);
        }
        View findViewById5 = findViewById(C4040i.exo_next);
        this.f14228e = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(aVar);
        }
        View findViewById6 = findViewById(C4040i.exo_rew);
        this.f14232i = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(aVar);
        }
        View findViewById7 = findViewById(C4040i.exo_ffwd);
        this.f14231h = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(aVar);
        }
        ImageView imageView = (ImageView) findViewById(C4040i.exo_repeat_toggle);
        this.f14233j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(aVar);
        }
        ImageView imageView2 = (ImageView) findViewById(C4040i.exo_shuffle);
        this.f14234k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(aVar);
        }
        View findViewById8 = findViewById(C4040i.exo_vr);
        this.f14235l = findViewById8;
        setShowVrButton(false);
        mo16392g(findViewById8, false, false);
        Resources resources = context.getResources();
        this.f14207D = ((float) resources.getInteger(C4041j.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.f14208E = ((float) resources.getInteger(C4041j.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        this.f14251v = resources.getDrawable(C4038g.exo_controls_repeat_off);
        this.f14252w = resources.getDrawable(C4038g.exo_controls_repeat_one);
        this.f14253x = resources.getDrawable(C4038g.exo_controls_repeat_all);
        this.f14205B = resources.getDrawable(C4038g.exo_controls_shuffle_on);
        this.f14206C = resources.getDrawable(C4038g.exo_controls_shuffle_off);
        this.f14254y = resources.getString(C4044m.exo_controls_repeat_off_description);
        this.f14255z = resources.getString(C4044m.exo_controls_repeat_one_description);
        this.f14204A = resources.getString(C4044m.exo_controls_repeat_all_description);
        this.f14209F = resources.getString(C4044m.exo_controls_shuffle_on_description);
        this.f14210G = resources.getString(C4044m.exo_controls_shuffle_off_description);
    }
}
