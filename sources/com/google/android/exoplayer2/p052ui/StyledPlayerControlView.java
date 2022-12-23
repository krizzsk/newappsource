package com.google.android.exoplayer2.p052ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C0441n1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.p052ui.C4032c0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C4000c;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p099ga.C4879e1;
import p099ga.C4883f;
import p099ga.C4886g;
import p099ga.C4896h;
import p099ga.C4897h0;
import p099ga.C4901j0;
import p099ga.C4910k0;
import p099ga.C4914m;
import p099ga.C4932s0;
import p099ga.C4934t0;
import p099ga.C4936u0;
import p252sb.C6505e;
import p252sb.C6506f;
import p259t5.C6592b;
import p259t5.C6593c;
import p277ub.C6774a0;
import p297w5.C6994a;
import p389bl.C13641g;
import p583jk.C17875h;

/* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView */
public class StyledPlayerControlView extends FrameLayout {

    /* renamed from: O0 */
    public static final /* synthetic */ int f14287O0 = 0;

    /* renamed from: A */
    public final String f14288A;

    /* renamed from: A0 */
    public C4012d f14289A0;

    /* renamed from: B */
    public final Drawable f14290B;

    /* renamed from: B0 */
    public PopupWindow f14291B0;

    /* renamed from: C */
    public final Drawable f14292C;

    /* renamed from: C0 */
    public boolean f14293C0;

    /* renamed from: D */
    public final float f14294D;

    /* renamed from: D0 */
    public int f14295D0;

    /* renamed from: E */
    public final float f14296E;

    /* renamed from: E0 */
    public DefaultTrackSelector f14297E0;

    /* renamed from: F */
    public final String f14298F;

    /* renamed from: F0 */
    public C4017i f14299F0;

    /* renamed from: G */
    public final String f14300G;

    /* renamed from: G0 */
    public C4009a f14301G0;

    /* renamed from: H */
    public final Drawable f14302H;

    /* renamed from: H0 */
    public C4031c f14303H0;

    /* renamed from: I */
    public final Drawable f14304I;

    /* renamed from: I0 */
    public ImageView f14305I0;

    /* renamed from: J */
    public final String f14306J;

    /* renamed from: J0 */
    public ImageView f14307J0;

    /* renamed from: K */
    public final String f14308K;

    /* renamed from: K0 */
    public ImageView f14309K0;

    /* renamed from: L */
    public final Drawable f14310L;

    /* renamed from: L0 */
    public View f14311L0;

    /* renamed from: M */
    public final Drawable f14312M;

    /* renamed from: M0 */
    public View f14313M0;

    /* renamed from: N */
    public final String f14314N;

    /* renamed from: N0 */
    public View f14315N0;

    /* renamed from: O */
    public final String f14316O;

    /* renamed from: P */
    public C4936u0 f14317P;

    /* renamed from: Q */
    public C4886g f14318Q;

    /* renamed from: R */
    public boolean f14319R;

    /* renamed from: S */
    public boolean f14320S;

    /* renamed from: T */
    public boolean f14321T;

    /* renamed from: U */
    public boolean f14322U;

    /* renamed from: b */
    public final C4010b f14323b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<C4020l> f14324c;

    /* renamed from: d */
    public final View f14325d;

    /* renamed from: e */
    public final View f14326e;

    /* renamed from: f */
    public final View f14327f;

    /* renamed from: g */
    public final View f14328g;

    /* renamed from: h */
    public final View f14329h;

    /* renamed from: i */
    public final TextView f14330i;

    /* renamed from: j */
    public final TextView f14331j;

    /* renamed from: k */
    public final ImageView f14332k;

    /* renamed from: l */
    public final ImageView f14333l;

    /* renamed from: l0 */
    public boolean f14334l0;

    /* renamed from: m */
    public final View f14335m;

    /* renamed from: m0 */
    public int f14336m0;

    /* renamed from: n */
    public final TextView f14337n;

    /* renamed from: n0 */
    public int f14338n0;

    /* renamed from: o */
    public final TextView f14339o;

    /* renamed from: o0 */
    public int f14340o0;

    /* renamed from: p */
    public final C4032c0 f14341p;

    /* renamed from: p0 */
    public long[] f14342p0;

    /* renamed from: q */
    public final StringBuilder f14343q;

    /* renamed from: q0 */
    public boolean[] f14344q0;

    /* renamed from: r */
    public final Formatter f14345r;

    /* renamed from: r0 */
    public long[] f14346r0;

    /* renamed from: s */
    public final C4879e1.C4881b f14347s;

    /* renamed from: s0 */
    public boolean[] f14348s0;

    /* renamed from: t */
    public final C4879e1.C4882c f14349t;

    /* renamed from: t0 */
    public long f14350t0;

    /* renamed from: u */
    public final C0441n1 f14351u;

    /* renamed from: u0 */
    public long f14352u0;

    /* renamed from: v */
    public final Drawable f14353v;

    /* renamed from: v0 */
    public long f14354v0;

    /* renamed from: w */
    public final Drawable f14355w;

    /* renamed from: w0 */
    public C4060z f14356w0;

    /* renamed from: x */
    public final Drawable f14357x;

    /* renamed from: x0 */
    public Resources f14358x0;

    /* renamed from: y */
    public final String f14359y;

    /* renamed from: y0 */
    public RecyclerView f14360y0;

    /* renamed from: z */
    public final String f14361z;

    /* renamed from: z0 */
    public C4015g f14362z0;

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$a */
    public final class C4009a extends C4019k {
        public C4009a() {
            super();
        }

        /* renamed from: k */
        public final void mo16566k(C4016h hVar) {
            boolean z;
            hVar.f14377d.setText(C4044m.exo_track_selection_auto);
            DefaultTrackSelector defaultTrackSelector = StyledPlayerControlView.this.f14297E0;
            defaultTrackSelector.getClass();
            DefaultTrackSelector.Parameters d = defaultTrackSelector.mo16302d();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f14385g.size()) {
                    z = false;
                    break;
                }
                int intValue = this.f14385g.get(i2).intValue();
                C4000c.C4001a aVar = this.f14387i;
                aVar.getClass();
                if (d.mo16304b(intValue, aVar.f14148c[intValue])) {
                    z = true;
                    break;
                }
                i2++;
            }
            View view = hVar.f14378e;
            if (z) {
                i = 4;
            }
            view.setVisibility(i);
            hVar.itemView.setOnClickListener(new C6994a(this, 1));
        }

        /* renamed from: l */
        public final void mo16567l(String str) {
            StyledPlayerControlView.this.f14362z0.f14374h[1] = str;
        }

        /* renamed from: m */
        public final void mo16568m(ArrayList arrayList, ArrayList arrayList2, C4000c.C4001a aVar) {
            boolean z;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    z = false;
                    break;
                }
                int intValue = ((Integer) arrayList.get(i2)).intValue();
                TrackGroupArray trackGroupArray = aVar.f14148c[intValue];
                DefaultTrackSelector defaultTrackSelector = StyledPlayerControlView.this.f14297E0;
                if (defaultTrackSelector != null && defaultTrackSelector.mo16302d().mo16304b(intValue, trackGroupArray)) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!arrayList2.isEmpty()) {
                if (z) {
                    while (true) {
                        if (i >= arrayList2.size()) {
                            break;
                        }
                        C4018j jVar = (C4018j) arrayList2.get(i);
                        if (jVar.f14384e) {
                            C4015g gVar = StyledPlayerControlView.this.f14362z0;
                            gVar.f14374h[1] = jVar.f14383d;
                            break;
                        }
                        i++;
                    }
                } else {
                    StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                    C4015g gVar2 = styledPlayerControlView.f14362z0;
                    gVar2.f14374h[1] = styledPlayerControlView.getResources().getString(C4044m.exo_track_selection_auto);
                }
            } else {
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                C4015g gVar3 = styledPlayerControlView2.f14362z0;
                gVar3.f14374h[1] = styledPlayerControlView2.getResources().getString(C4044m.exo_track_selection_none);
            }
            this.f14385g = arrayList;
            this.f14386h = arrayList2;
            this.f14387i = aVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$b */
    public final class C4010b implements C4936u0.C4938b, C4032c0.C4033a, View.OnClickListener, PopupWindow.OnDismissListener {
        public C4010b() {
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
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            styledPlayerControlView.f14334l0 = true;
            TextView textView = styledPlayerControlView.f14339o;
            if (textView != null) {
                textView.setText(C6774a0.m15958r(styledPlayerControlView.f14343q, styledPlayerControlView.f14345r, j));
            }
            StyledPlayerControlView.this.f14356w0.mo16676f();
        }

        /* renamed from: b */
        public final /* synthetic */ void mo16433b() {
        }

        /* renamed from: b0 */
        public final /* synthetic */ void mo16434b0(C4932s0 s0Var) {
        }

        /* renamed from: c */
        public final void mo16435c(long j) {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            TextView textView = styledPlayerControlView.f14339o;
            if (textView != null) {
                textView.setText(C6774a0.m15958r(styledPlayerControlView.f14343q, styledPlayerControlView.f14345r, j));
            }
        }

        /* renamed from: d */
        public final void mo16436d(long j, boolean z) {
            C4936u0 u0Var;
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            int i = 0;
            styledPlayerControlView.f14334l0 = false;
            if (!z && (u0Var = styledPlayerControlView.f14317P) != null) {
                C4879e1 s = u0Var.mo20400s();
                if (styledPlayerControlView.f14322U && !s.mo20464p()) {
                    int o = s.mo20463o();
                    while (true) {
                        long b = C4883f.m12377b(s.mo20462m(i, styledPlayerControlView.f14349t).f16437n);
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
                ((C4896h) styledPlayerControlView.f14318Q).getClass();
                u0Var.mo20405x(i, j);
                styledPlayerControlView.mo16539o();
            }
            StyledPlayerControlView.this.f14356w0.mo16677g();
        }

        /* renamed from: d0 */
        public final void mo16437d0(C4936u0.C4939c cVar) {
            if (cVar.mo20608b(5, 6)) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                int i = StyledPlayerControlView.f14287O0;
                styledPlayerControlView.mo16537m();
            }
            if (cVar.mo20608b(5, 6, 8)) {
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                int i2 = StyledPlayerControlView.f14287O0;
                styledPlayerControlView2.mo16539o();
            }
            if (cVar.mo20607a(9)) {
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                int i3 = StyledPlayerControlView.f14287O0;
                styledPlayerControlView3.mo16543p();
            }
            if (cVar.mo20607a(10)) {
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                int i4 = StyledPlayerControlView.f14287O0;
                styledPlayerControlView4.mo16545r();
            }
            if (cVar.mo20608b(9, 10, 12, 0)) {
                StyledPlayerControlView styledPlayerControlView5 = StyledPlayerControlView.this;
                int i5 = StyledPlayerControlView.f14287O0;
                styledPlayerControlView5.mo16536l();
            }
            if (cVar.mo20608b(12, 0)) {
                StyledPlayerControlView styledPlayerControlView6 = StyledPlayerControlView.this;
                int i6 = StyledPlayerControlView.f14287O0;
                styledPlayerControlView6.mo16546s();
            }
            if (cVar.mo20607a(13)) {
                StyledPlayerControlView styledPlayerControlView7 = StyledPlayerControlView.this;
                int i7 = StyledPlayerControlView.f14287O0;
                styledPlayerControlView7.mo16538n();
            }
            if (cVar.mo20607a(2)) {
                StyledPlayerControlView styledPlayerControlView8 = StyledPlayerControlView.this;
                int i8 = StyledPlayerControlView.f14287O0;
                styledPlayerControlView8.mo16565t();
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
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            C4936u0 u0Var = styledPlayerControlView.f14317P;
            if (u0Var != null) {
                styledPlayerControlView.f14356w0.mo16677g();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                if (styledPlayerControlView2.f14326e == view) {
                    ((C4896h) styledPlayerControlView2.f14318Q).mo20534b(u0Var);
                } else if (styledPlayerControlView2.f14325d == view) {
                    ((C4896h) styledPlayerControlView2.f14318Q).mo20535c(u0Var);
                } else if (styledPlayerControlView2.f14328g == view) {
                    if (u0Var.mo20364H() != 4) {
                        ((C4896h) StyledPlayerControlView.this.f14318Q).mo20533a(u0Var);
                    }
                } else if (styledPlayerControlView2.f14329h == view) {
                    ((C4896h) styledPlayerControlView2.f14318Q).mo20536d(u0Var);
                } else if (styledPlayerControlView2.f14327f == view) {
                    int H = u0Var.mo20364H();
                    if (H == 1 || H == 4 || !u0Var.mo20407z()) {
                        styledPlayerControlView2.mo16521d(u0Var);
                        return;
                    }
                    ((C4896h) styledPlayerControlView2.f14318Q).getClass();
                    u0Var.mo20395m(false);
                } else if (styledPlayerControlView2.f14332k == view) {
                    C4886g gVar = styledPlayerControlView2.f14318Q;
                    int o = C13641g.m34126o(u0Var.mo20368M(), StyledPlayerControlView.this.f14340o0);
                    ((C4896h) gVar).getClass();
                    u0Var.mo20366J(o);
                } else if (styledPlayerControlView2.f14333l == view) {
                    ((C4896h) styledPlayerControlView2.f14318Q).getClass();
                    u0Var.mo20358A(!u0Var.mo20369N());
                } else if (styledPlayerControlView2.f14311L0 == view) {
                    styledPlayerControlView2.f14356w0.mo16676f();
                    StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                    styledPlayerControlView3.mo16523e(styledPlayerControlView3.f14362z0);
                } else if (styledPlayerControlView2.f14313M0 == view) {
                    styledPlayerControlView2.f14356w0.mo16676f();
                    StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                    styledPlayerControlView4.mo16523e(styledPlayerControlView4.f14289A0);
                } else if (styledPlayerControlView2.f14315N0 == view) {
                    styledPlayerControlView2.f14356w0.mo16676f();
                    StyledPlayerControlView styledPlayerControlView5 = StyledPlayerControlView.this;
                    styledPlayerControlView5.mo16523e(styledPlayerControlView5.f14301G0);
                } else if (styledPlayerControlView2.f14305I0 == view) {
                    styledPlayerControlView2.f14356w0.mo16676f();
                    StyledPlayerControlView styledPlayerControlView6 = StyledPlayerControlView.this;
                    styledPlayerControlView6.mo16523e(styledPlayerControlView6.f14299F0);
                }
            }
        }

        public final void onDismiss() {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            if (styledPlayerControlView.f14293C0) {
                styledPlayerControlView.f14356w0.mo16677g();
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

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$c */
    public interface C4011c {
        /* renamed from: a */
        void mo16571a();
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$d */
    public final class C4012d extends RecyclerView.Adapter<C4016h> {

        /* renamed from: g */
        public final String[] f14365g;

        /* renamed from: h */
        public final int[] f14366h;

        /* renamed from: i */
        public int f14367i;

        public C4012d(String[] strArr, int[] iArr) {
            this.f14365g = strArr;
            this.f14366h = iArr;
        }

        public final int getItemCount() {
            return this.f14365g.length;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            int i2;
            C4016h hVar = (C4016h) a0Var;
            String[] strArr = this.f14365g;
            if (i < strArr.length) {
                hVar.f14377d.setText(strArr[i]);
            }
            View view = hVar.f14378e;
            if (i == this.f14367i) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view.setVisibility(i2);
            hVar.itemView.setOnClickListener(new C4053s(i, 0, this));
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C4016h(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C4042k.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$e */
    public interface C4013e {
        /* renamed from: a */
        void mo16572a();
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$f */
    public final class C4014f extends RecyclerView.C1119a0 {

        /* renamed from: d */
        public final TextView f14369d;

        /* renamed from: e */
        public final TextView f14370e;

        /* renamed from: f */
        public final ImageView f14371f;

        public C4014f(View view) {
            super(view);
            if (C6774a0.f20959a < 26) {
                view.setFocusable(true);
            }
            this.f14369d = (TextView) view.findViewById(C4040i.exo_main_text);
            this.f14370e = (TextView) view.findViewById(C4040i.exo_sub_text);
            this.f14371f = (ImageView) view.findViewById(C4040i.exo_icon);
            view.setOnClickListener(new C6592b(this, 1));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$g */
    public class C4015g extends RecyclerView.Adapter<C4014f> {

        /* renamed from: g */
        public final String[] f14373g;

        /* renamed from: h */
        public final String[] f14374h;

        /* renamed from: i */
        public final Drawable[] f14375i;

        public C4015g(String[] strArr, Drawable[] drawableArr) {
            this.f14373g = strArr;
            this.f14374h = new String[strArr.length];
            this.f14375i = drawableArr;
        }

        public final int getItemCount() {
            return this.f14373g.length;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C4014f fVar = (C4014f) a0Var;
            fVar.f14369d.setText(this.f14373g[i]);
            String str = this.f14374h[i];
            if (str == null) {
                fVar.f14370e.setVisibility(8);
            } else {
                fVar.f14370e.setText(str);
            }
            Drawable drawable = this.f14375i[i];
            if (drawable == null) {
                fVar.f14371f.setVisibility(8);
            } else {
                fVar.f14371f.setImageDrawable(drawable);
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C4014f(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C4042k.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$h */
    public static class C4016h extends RecyclerView.C1119a0 {

        /* renamed from: d */
        public final TextView f14377d;

        /* renamed from: e */
        public final View f14378e;

        public C4016h(View view) {
            super(view);
            if (C6774a0.f20959a < 26) {
                view.setFocusable(true);
            }
            this.f14377d = (TextView) view.findViewById(C4040i.exo_text);
            this.f14378e = view.findViewById(C4040i.exo_check);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$i */
    public final class C4017i extends C4019k {
        public C4017i() {
            super();
        }

        /* renamed from: j */
        public final void onBindViewHolder(C4016h hVar, int i) {
            int i2;
            super.onBindViewHolder(hVar, i);
            if (i > 0) {
                View view = hVar.f14378e;
                if (this.f14386h.get(i - 1).f14384e) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                view.setVisibility(i2);
            }
        }

        /* renamed from: k */
        public final void mo16566k(C4016h hVar) {
            boolean z;
            hVar.f14377d.setText(C4044m.exo_track_selection_none);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f14386h.size()) {
                    z = true;
                    break;
                } else if (this.f14386h.get(i2).f14384e) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            View view = hVar.f14378e;
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
            hVar.itemView.setOnClickListener(new C6593c(this, 2));
        }

        /* renamed from: l */
        public final void mo16567l(String str) {
        }

        /* renamed from: m */
        public final void mo16574m(ArrayList arrayList, ArrayList arrayList2, C4000c.C4001a aVar) {
            Drawable drawable;
            String str;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= arrayList2.size()) {
                    break;
                } else if (((C4018j) arrayList2.get(i)).f14384e) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            ImageView imageView = styledPlayerControlView.f14305I0;
            if (imageView != null) {
                if (z) {
                    drawable = styledPlayerControlView.f14302H;
                } else {
                    drawable = styledPlayerControlView.f14304I;
                }
                imageView.setImageDrawable(drawable);
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                ImageView imageView2 = styledPlayerControlView2.f14305I0;
                if (z) {
                    str = styledPlayerControlView2.f14306J;
                } else {
                    str = styledPlayerControlView2.f14308K;
                }
                imageView2.setContentDescription(str);
            }
            this.f14385g = arrayList;
            this.f14386h = arrayList2;
            this.f14387i = aVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$j */
    public static final class C4018j {

        /* renamed from: a */
        public final int f14380a;

        /* renamed from: b */
        public final int f14381b;

        /* renamed from: c */
        public final int f14382c;

        /* renamed from: d */
        public final String f14383d;

        /* renamed from: e */
        public final boolean f14384e;

        public C4018j(int i, String str, int i2, boolean z, int i3) {
            this.f14380a = i;
            this.f14381b = i2;
            this.f14382c = i3;
            this.f14383d = str;
            this.f14384e = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$k */
    public abstract class C4019k extends RecyclerView.Adapter<C4016h> {

        /* renamed from: g */
        public List<Integer> f14385g = new ArrayList();

        /* renamed from: h */
        public List<C4018j> f14386h = new ArrayList();

        /* renamed from: i */
        public C4000c.C4001a f14387i = null;

        public C4019k() {
        }

        public final int getItemCount() {
            if (this.f14386h.isEmpty()) {
                return 0;
            }
            return this.f14386h.size() + 1;
        }

        /* renamed from: j */
        public void onBindViewHolder(C4016h hVar, int i) {
            int i2;
            if (StyledPlayerControlView.this.f14297E0 != null && this.f14387i != null) {
                if (i == 0) {
                    mo16566k(hVar);
                    return;
                }
                boolean z = true;
                C4018j jVar = this.f14386h.get(i - 1);
                C4000c.C4001a aVar = this.f14387i;
                TrackGroupArray trackGroupArray = aVar.f14148c[jVar.f14380a];
                DefaultTrackSelector defaultTrackSelector = StyledPlayerControlView.this.f14297E0;
                defaultTrackSelector.getClass();
                if (!defaultTrackSelector.mo16302d().mo16304b(jVar.f14380a, trackGroupArray) || !jVar.f14384e) {
                    z = false;
                }
                hVar.f14377d.setText(jVar.f14383d);
                View view = hVar.f14378e;
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                view.setVisibility(i2);
                hVar.itemView.setOnClickListener(new C4054t(0, this, jVar));
            }
        }

        /* renamed from: k */
        public abstract void mo16566k(C4016h hVar);

        /* renamed from: l */
        public abstract void mo16567l(String str);

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C4016h(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C4042k.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$l */
    public interface C4020l {
        /* renamed from: a */
        void mo16575a();
    }

    static {
        C4897h0.m12445a();
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m10795a(StyledPlayerControlView styledPlayerControlView) {
        styledPlayerControlView.getClass();
    }

    /* access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        C4936u0 u0Var = this.f14317P;
        if (u0Var != null) {
            C4886g gVar = this.f14318Q;
            C4932s0 s0Var = new C4932s0(f, u0Var.mo20382b().f16697b);
            ((C4896h) gVar).getClass();
            u0Var.mo20380a(s0Var);
        }
    }

    /* renamed from: c */
    public final boolean mo16520c(KeyEvent keyEvent) {
        boolean z;
        int keyCode = keyEvent.getKeyCode();
        C4936u0 u0Var = this.f14317P;
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
                            ((C4896h) this.f14318Q).mo20533a(u0Var);
                        }
                    } else if (keyCode == 89) {
                        ((C4896h) this.f14318Q).mo20536d(u0Var);
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            int H = u0Var.mo20364H();
                            if (H == 1 || H == 4 || !u0Var.mo20407z()) {
                                mo16521d(u0Var);
                            } else {
                                ((C4896h) this.f14318Q).getClass();
                                u0Var.mo20395m(false);
                            }
                        } else if (keyCode == 87) {
                            ((C4896h) this.f14318Q).mo20534b(u0Var);
                        } else if (keyCode == 88) {
                            ((C4896h) this.f14318Q).mo20535c(u0Var);
                        } else if (keyCode == 126) {
                            mo16521d(u0Var);
                        } else if (keyCode == 127) {
                            ((C4896h) this.f14318Q).getClass();
                            u0Var.mo20395m(false);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo16521d(C4936u0 u0Var) {
        int H = u0Var.mo20364H();
        if (H == 1) {
            ((C4896h) this.f14318Q).getClass();
            u0Var.mo20384c();
        } else if (H == 4) {
            int k = u0Var.mo20393k();
            ((C4896h) this.f14318Q).getClass();
            u0Var.mo20405x(k, -9223372036854775807L);
        }
        ((C4896h) this.f14318Q).getClass();
        u0Var.mo20395m(true);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return mo16520c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e */
    public final void mo16523e(RecyclerView.Adapter<?> adapter) {
        this.f14360y0.setAdapter(adapter);
        mo16544q();
        this.f14293C0 = false;
        this.f14291B0.dismiss();
        this.f14293C0 = true;
        this.f14291B0.showAsDropDown(this, (getWidth() - this.f14291B0.getWidth()) - this.f14295D0, (-this.f14291B0.getHeight()) - this.f14295D0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16524f(com.google.android.exoplayer2.trackselection.C4000c.C4001a r22, int r23, java.util.ArrayList r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            com.google.android.exoplayer2.source.TrackGroupArray[] r2 = r1.f14148c
            r8 = r2[r23]
            ga.u0 r2 = r0.f14317P
            r2.getClass()
            sb.e r2 = r2.mo20403v()
            sb.d[] r2 = r2.f20295b
            r9 = r2[r23]
            r10 = 0
            r11 = 0
        L_0x0017:
            int r2 = r8.f14012b
            if (r11 >= r2) goto L_0x01ac
            com.google.android.exoplayer2.source.TrackGroup[] r2 = r8.f14013c
            r12 = r2[r11]
            r13 = 0
        L_0x0020:
            int r2 = r12.f14008b
            if (r13 >= r2) goto L_0x01a2
            com.google.android.exoplayer2.Format[] r2 = r12.f14009c
            r2 = r2[r13]
            int[][][] r3 = r1.f14149d
            r3 = r3[r23]
            r3 = r3[r11]
            r3 = r3[r13]
            r4 = 7
            r3 = r3 & r4
            r5 = 4
            if (r3 != r5) goto L_0x0198
            r3 = -1
            if (r9 == 0) goto L_0x0040
            int r6 = r9.mo22608j(r2)
            if (r6 == r3) goto L_0x0040
            r6 = 1
            goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            com.google.android.exoplayer2.ui.StyledPlayerControlView$j r14 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$j
            com.google.android.exoplayer2.ui.c r7 = r0.f14303H0
            r7.getClass()
            java.lang.String r15 = r2.f13418m
            int r15 = p277ub.C6792n.m15994g(r15)
            if (r15 == r3) goto L_0x0052
            goto L_0x00d5
        L_0x0052:
            java.lang.String r15 = r2.f13415j
            r17 = 0
            java.lang.String r5 = "(\\s*,\\s*)"
            if (r15 != 0) goto L_0x005b
            goto L_0x0084
        L_0x005b:
            int r18 = p277ub.C6774a0.f20959a
            boolean r18 = android.text.TextUtils.isEmpty(r15)
            if (r18 == 0) goto L_0x0066
            java.lang.String[] r15 = new java.lang.String[r10]
            goto L_0x006e
        L_0x0066:
            java.lang.String r15 = r15.trim()
            java.lang.String[] r15 = r15.split(r5, r3)
        L_0x006e:
            int r4 = r15.length
            r3 = 0
        L_0x0070:
            if (r3 >= r4) goto L_0x0084
            r19 = r15[r3]
            java.lang.String r19 = p277ub.C6792n.m15990c(r19)
            if (r19 == 0) goto L_0x0081
            boolean r20 = p277ub.C6792n.m15997j(r19)
            if (r20 == 0) goto L_0x0081
            goto L_0x0086
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0070
        L_0x0084:
            r19 = r17
        L_0x0086:
            if (r19 == 0) goto L_0x0089
            goto L_0x00d4
        L_0x0089:
            java.lang.String r3 = r2.f13415j
            if (r3 != 0) goto L_0x008e
            goto L_0x00ba
        L_0x008e:
            int r4 = p277ub.C6774a0.f20959a
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0099
            java.lang.String[] r3 = new java.lang.String[r10]
            goto L_0x00a2
        L_0x0099:
            java.lang.String r3 = r3.trim()
            r4 = -1
            java.lang.String[] r3 = r3.split(r5, r4)
        L_0x00a2:
            int r4 = r3.length
            r5 = 0
        L_0x00a4:
            if (r5 >= r4) goto L_0x00ba
            r15 = r3[r5]
            java.lang.String r15 = p277ub.C6792n.m15990c(r15)
            if (r15 == 0) goto L_0x00b7
            boolean r19 = p277ub.C6792n.m15995h(r15)
            if (r19 == 0) goto L_0x00b7
            r17 = r15
            goto L_0x00ba
        L_0x00b7:
            int r5 = r5 + 1
            goto L_0x00a4
        L_0x00ba:
            if (r17 == 0) goto L_0x00bd
            goto L_0x00d2
        L_0x00bd:
            int r3 = r2.f13423r
            r4 = -1
            if (r3 != r4) goto L_0x00d4
            int r3 = r2.f13424s
            if (r3 == r4) goto L_0x00c7
            goto L_0x00d4
        L_0x00c7:
            int r3 = r2.f13431z
            if (r3 != r4) goto L_0x00d2
            int r3 = r2.f13400A
            if (r3 == r4) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r15 = -1
            goto L_0x00d5
        L_0x00d2:
            r15 = 1
            goto L_0x00d5
        L_0x00d4:
            r15 = 2
        L_0x00d5:
            java.lang.String r3 = ""
            r4 = 3
            r5 = 2
            if (r15 != r5) goto L_0x0118
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r15 = r7.mo16663c(r2)
            r4[r10] = r15
            int r15 = r2.f13423r
            int r10 = r2.f13424s
            r5 = -1
            if (r15 == r5) goto L_0x0108
            if (r10 != r5) goto L_0x00ed
            goto L_0x0108
        L_0x00ed:
            android.content.res.Resources r3 = r7.f14488a
            int r5 = com.google.android.exoplayer2.p052ui.C4044m.exo_track_resolution
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r16 = 0
            r1[r16] = r15
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r15 = 1
            r1[r15] = r10
            java.lang.String r3 = r3.getString(r5, r1)
            goto L_0x010a
        L_0x0108:
            r0 = 2
            r15 = 1
        L_0x010a:
            r4[r15] = r3
            java.lang.String r1 = r7.mo16661a(r2)
            r4[r0] = r1
            java.lang.String r0 = r7.mo16664d(r4)
            r10 = 0
            goto L_0x017b
        L_0x0118:
            r0 = 1
            if (r15 != r0) goto L_0x0176
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r4 = r7.mo16662b(r2)
            r10 = 0
            r1[r10] = r4
            int r4 = r2.f13431z
            r5 = -1
            if (r4 == r5) goto L_0x0167
            if (r4 >= r0) goto L_0x012c
            goto L_0x0167
        L_0x012c:
            if (r4 == r0) goto L_0x015f
            r0 = 2
            if (r4 == r0) goto L_0x0156
            r0 = 6
            if (r4 == r0) goto L_0x014d
            r0 = 7
            if (r4 == r0) goto L_0x014d
            r0 = 8
            if (r4 == r0) goto L_0x0144
            android.content.res.Resources r0 = r7.f14488a
            int r3 = com.google.android.exoplayer2.p052ui.C4044m.exo_track_surround
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0167
        L_0x0144:
            android.content.res.Resources r0 = r7.f14488a
            int r3 = com.google.android.exoplayer2.p052ui.C4044m.exo_track_surround_7_point_1
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0167
        L_0x014d:
            android.content.res.Resources r0 = r7.f14488a
            int r3 = com.google.android.exoplayer2.p052ui.C4044m.exo_track_surround_5_point_1
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0167
        L_0x0156:
            android.content.res.Resources r0 = r7.f14488a
            int r3 = com.google.android.exoplayer2.p052ui.C4044m.exo_track_stereo
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0167
        L_0x015f:
            android.content.res.Resources r0 = r7.f14488a
            int r3 = com.google.android.exoplayer2.p052ui.C4044m.exo_track_mono
            java.lang.String r3 = r0.getString(r3)
        L_0x0167:
            r0 = 1
            r1[r0] = r3
            java.lang.String r0 = r7.mo16661a(r2)
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = r7.mo16664d(r1)
            goto L_0x017b
        L_0x0176:
            r10 = 0
            java.lang.String r0 = r7.mo16662b(r2)
        L_0x017b:
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0189
            android.content.res.Resources r0 = r7.f14488a
            int r1 = com.google.android.exoplayer2.p052ui.C4044m.exo_track_unknown
            java.lang.String r0 = r0.getString(r1)
        L_0x0189:
            r4 = r0
            r2 = r14
            r3 = r23
            r5 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r24
            r0.add(r14)
            goto L_0x019a
        L_0x0198:
            r0 = r24
        L_0x019a:
            int r13 = r13 + 1
            r0 = r21
            r1 = r22
            goto L_0x0020
        L_0x01a2:
            r0 = r24
            int r11 = r11 + 1
            r0 = r21
            r1 = r22
            goto L_0x0017
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.StyledPlayerControlView.mo16524f(com.google.android.exoplayer2.trackselection.c$a, int, java.util.ArrayList):void");
    }

    /* renamed from: g */
    public final void mo16525g() {
        C4060z zVar = this.f14356w0;
        int i = zVar.f14545z;
        if (i != 3 && i != 2) {
            zVar.mo16676f();
            if (!zVar.f14519C) {
                zVar.mo16679i(2);
            } else if (zVar.f14545z == 1) {
                zVar.f14532m.start();
            } else {
                zVar.f14533n.start();
            }
        }
    }

    public C4936u0 getPlayer() {
        return this.f14317P;
    }

    public int getRepeatToggleModes() {
        return this.f14340o0;
    }

    public boolean getShowShuffleButton() {
        return this.f14356w0.mo16675c(this.f14333l);
    }

    public boolean getShowSubtitleButton() {
        return this.f14356w0.mo16675c(this.f14305I0);
    }

    public int getShowTimeoutMs() {
        return this.f14336m0;
    }

    public boolean getShowVrButton() {
        return this.f14356w0.mo16675c(this.f14335m);
    }

    /* renamed from: h */
    public final boolean mo16532h() {
        C4060z zVar = this.f14356w0;
        if (zVar.f14545z != 0 || !zVar.f14520a.mo16533i()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo16533i() {
        return getVisibility() == 0;
    }

    /* renamed from: j */
    public final void mo16534j() {
        mo16537m();
        mo16536l();
        mo16543p();
        mo16545r();
        mo16565t();
        mo16538n();
        mo16546s();
    }

    /* renamed from: k */
    public final void mo16535k(View view, boolean z) {
        float f;
        if (view != null) {
            view.setEnabled(z);
            if (z) {
                f = this.f14294D;
            } else {
                f = this.f14296E;
            }
            view.setAlpha(f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16536l() {
        /*
            r15 = this;
            boolean r0 = r15.mo16533i()
            if (r0 == 0) goto L_0x0112
            boolean r0 = r15.f14320S
            if (r0 != 0) goto L_0x000c
            goto L_0x0112
        L_0x000c:
            ga.u0 r0 = r15.f14317P
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0088
            ga.e1 r3 = r0.mo20400s()
            boolean r4 = r3.mo20464p()
            if (r4 != 0) goto L_0x0088
            boolean r4 = r0.mo20385d()
            if (r4 != 0) goto L_0x0088
            r4 = 4
            boolean r4 = r0.mo20454p(r4)
            int r5 = r0.mo20393k()
            ga.e1$c r6 = r15.f14349t
            r3.mo20462m(r5, r6)
            if (r4 != 0) goto L_0x0044
            ga.e1$c r3 = r15.f14349t
            boolean r3 = r3.mo20470a()
            if (r3 == 0) goto L_0x0044
            r3 = 6
            boolean r3 = r0.mo20454p(r3)
            if (r3 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r3 = 0
            goto L_0x0045
        L_0x0044:
            r3 = 1
        L_0x0045:
            r5 = 0
            if (r4 == 0) goto L_0x005a
            ga.g r7 = r15.f14318Q
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
            if (r4 == 0) goto L_0x006e
            ga.g r8 = r15.f14318Q
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
            ga.e1$c r6 = r15.f14349t
            boolean r6 = r6.mo20470a()
            if (r6 == 0) goto L_0x007d
            ga.e1$c r6 = r15.f14349t
            boolean r6 = r6.f16432i
            if (r6 != 0) goto L_0x0084
        L_0x007d:
            r6 = 5
            boolean r0 = r0.mo20454p(r6)
            if (r0 == 0) goto L_0x0086
        L_0x0084:
            r0 = 1
            goto L_0x008d
        L_0x0086:
            r0 = 0
            goto L_0x008d
        L_0x0088:
            r0 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
        L_0x008d:
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r7 == 0) goto L_0x00c3
            ga.g r6 = r15.f14318Q
            boolean r10 = r6 instanceof p099ga.C4896h
            if (r10 == 0) goto L_0x009d
            ga.h r6 = (p099ga.C4896h) r6
            long r10 = r6.f16508b
            r15.f14352u0 = r10
        L_0x009d:
            long r10 = r15.f14352u0
            long r10 = r10 / r8
            int r6 = (int) r10
            android.widget.TextView r10 = r15.f14331j
            if (r10 == 0) goto L_0x00ac
            java.lang.String r11 = java.lang.String.valueOf(r6)
            r10.setText(r11)
        L_0x00ac:
            android.view.View r10 = r15.f14329h
            if (r10 == 0) goto L_0x00c3
            android.content.res.Resources r11 = r15.f14358x0
            int r12 = com.google.android.exoplayer2.p052ui.C4043l.exo_controls_rewind_by_amount_description
            java.lang.Object[] r13 = new java.lang.Object[r1]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            r13[r2] = r14
            java.lang.String r6 = r11.getQuantityString(r12, r6, r13)
            r10.setContentDescription(r6)
        L_0x00c3:
            if (r5 == 0) goto L_0x00f7
            ga.g r6 = r15.f14318Q
            boolean r10 = r6 instanceof p099ga.C4896h
            if (r10 == 0) goto L_0x00d1
            ga.h r6 = (p099ga.C4896h) r6
            long r10 = r6.f16509c
            r15.f14354v0 = r10
        L_0x00d1:
            long r10 = r15.f14354v0
            long r10 = r10 / r8
            int r6 = (int) r10
            android.widget.TextView r8 = r15.f14330i
            if (r8 == 0) goto L_0x00e0
            java.lang.String r9 = java.lang.String.valueOf(r6)
            r8.setText(r9)
        L_0x00e0:
            android.view.View r8 = r15.f14328g
            if (r8 == 0) goto L_0x00f7
            android.content.res.Resources r9 = r15.f14358x0
            int r10 = com.google.android.exoplayer2.p052ui.C4043l.exo_controls_fastforward_by_amount_description
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r1[r2] = r11
            java.lang.String r1 = r9.getQuantityString(r10, r6, r1)
            r8.setContentDescription(r1)
        L_0x00f7:
            android.view.View r1 = r15.f14325d
            r15.mo16535k(r1, r3)
            android.view.View r1 = r15.f14329h
            r15.mo16535k(r1, r7)
            android.view.View r1 = r15.f14328g
            r15.mo16535k(r1, r5)
            android.view.View r1 = r15.f14326e
            r15.mo16535k(r1, r0)
            com.google.android.exoplayer2.ui.c0 r0 = r15.f14341p
            if (r0 == 0) goto L_0x0112
            r0.setEnabled(r4)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.StyledPlayerControlView.mo16536l():void");
    }

    /* renamed from: m */
    public final void mo16537m() {
        if (mo16533i() && this.f14320S && this.f14327f != null) {
            C4936u0 u0Var = this.f14317P;
            boolean z = true;
            if (u0Var == null || u0Var.mo20364H() == 4 || this.f14317P.mo20364H() == 1 || !this.f14317P.mo20407z()) {
                z = false;
            }
            if (z) {
                ((ImageView) this.f14327f).setImageDrawable(this.f14358x0.getDrawable(C4038g.exo_styled_controls_pause));
                this.f14327f.setContentDescription(this.f14358x0.getString(C4044m.exo_controls_pause_description));
                return;
            }
            ((ImageView) this.f14327f).setImageDrawable(this.f14358x0.getDrawable(C4038g.exo_styled_controls_play));
            this.f14327f.setContentDescription(this.f14358x0.getString(C4044m.exo_controls_play_description));
        }
    }

    /* renamed from: n */
    public final void mo16538n() {
        C4936u0 u0Var = this.f14317P;
        if (u0Var != null) {
            C4012d dVar = this.f14289A0;
            float f = u0Var.mo20382b().f16696a;
            dVar.getClass();
            int round = Math.round(f * 100.0f);
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr = dVar.f14366h;
                if (i2 < iArr.length) {
                    int abs = Math.abs(round - iArr[i2]);
                    if (abs < i) {
                        i3 = i2;
                        i = abs;
                    }
                    i2++;
                } else {
                    dVar.f14367i = i3;
                    C4015g gVar = this.f14362z0;
                    C4012d dVar2 = this.f14289A0;
                    gVar.f14374h[0] = dVar2.f14365g[dVar2.f14367i];
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo16539o() {
        long j;
        int i;
        long j2;
        if (mo16533i() && this.f14320S) {
            C4936u0 u0Var = this.f14317P;
            long j3 = 0;
            if (u0Var != null) {
                j3 = this.f14350t0 + u0Var.mo20362E();
                j = this.f14350t0 + u0Var.mo20370O();
            } else {
                j = 0;
            }
            TextView textView = this.f14339o;
            if (textView != null && !this.f14334l0) {
                textView.setText(C6774a0.m15958r(this.f14343q, this.f14345r, j3));
            }
            C4032c0 c0Var = this.f14341p;
            if (c0Var != null) {
                c0Var.setPosition(j3);
                this.f14341p.setBufferedPosition(j);
            }
            removeCallbacks(this.f14351u);
            if (u0Var == null) {
                i = 1;
            } else {
                i = u0Var.mo20364H();
            }
            long j4 = 1000;
            if (u0Var != null && u0Var.isPlaying()) {
                C4032c0 c0Var2 = this.f14341p;
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
                postDelayed(this.f14351u, C6774a0.m15948h(j4, (long) this.f14338n0, 1000));
            } else if (i != 4 && i != 1) {
                postDelayed(this.f14351u, 1000);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4060z zVar = this.f14356w0;
        zVar.f14520a.addOnLayoutChangeListener(zVar.f14543x);
        this.f14320S = true;
        if (mo16532h()) {
            this.f14356w0.mo16677g();
        }
        mo16534j();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4060z zVar = this.f14356w0;
        zVar.f14520a.removeOnLayoutChangeListener(zVar.f14543x);
        this.f14320S = false;
        removeCallbacks(this.f14351u);
        this.f14356w0.mo16676f();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f14356w0.f14521b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* renamed from: p */
    public final void mo16543p() {
        ImageView imageView;
        if (mo16533i() && this.f14320S && (imageView = this.f14332k) != null) {
            if (this.f14340o0 == 0) {
                mo16535k(imageView, false);
                return;
            }
            C4936u0 u0Var = this.f14317P;
            if (u0Var == null) {
                mo16535k(imageView, false);
                this.f14332k.setImageDrawable(this.f14353v);
                this.f14332k.setContentDescription(this.f14359y);
                return;
            }
            mo16535k(imageView, true);
            int M = u0Var.mo20368M();
            if (M == 0) {
                this.f14332k.setImageDrawable(this.f14353v);
                this.f14332k.setContentDescription(this.f14359y);
            } else if (M == 1) {
                this.f14332k.setImageDrawable(this.f14355w);
                this.f14332k.setContentDescription(this.f14361z);
            } else if (M == 2) {
                this.f14332k.setImageDrawable(this.f14357x);
                this.f14332k.setContentDescription(this.f14288A);
            }
        }
    }

    /* renamed from: q */
    public final void mo16544q() {
        this.f14360y0.measure(0, 0);
        this.f14291B0.setWidth(Math.min(this.f14360y0.getMeasuredWidth(), getWidth() - (this.f14295D0 * 2)));
        this.f14291B0.setHeight(Math.min(getHeight() - (this.f14295D0 * 2), this.f14360y0.getMeasuredHeight()));
    }

    /* renamed from: r */
    public final void mo16545r() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (mo16533i() && this.f14320S && (imageView = this.f14333l) != null) {
            C4936u0 u0Var = this.f14317P;
            if (!this.f14356w0.mo16675c(imageView)) {
                mo16535k(this.f14333l, false);
            } else if (u0Var == null) {
                mo16535k(this.f14333l, false);
                this.f14333l.setImageDrawable(this.f14292C);
                this.f14333l.setContentDescription(this.f14300G);
            } else {
                mo16535k(this.f14333l, true);
                ImageView imageView2 = this.f14333l;
                if (u0Var.mo20369N()) {
                    drawable = this.f14290B;
                } else {
                    drawable = this.f14292C;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f14333l;
                if (u0Var.mo20369N()) {
                    str = this.f14298F;
                } else {
                    str = this.f14300G;
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
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16546s() {
        /*
            r21 = this;
            r0 = r21
            ga.u0 r1 = r0.f14317P
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r2 = r0.f14321T
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x003c
            ga.e1 r2 = r1.mo20400s()
            ga.e1$c r7 = r0.f14349t
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
            r0.f14322U = r2
            r7 = 0
            r0.f14350t0 = r7
            ga.e1 r2 = r1.mo20400s()
            boolean r9 = r2.mo20464p()
            if (r9 != 0) goto L_0x012a
            int r1 = r1.mo20393k()
            boolean r9 = r0.f14322U
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
            r0.f14350t0 = r14
        L_0x006d:
            ga.e1$c r14 = r0.f14349t
            r2.mo20462m(r10, r14)
            ga.e1$c r14 = r0.f14349t
            long r7 = r14.f16437n
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 != 0) goto L_0x0082
            boolean r1 = r0.f14322U
            r1 = r1 ^ r6
            p583jk.C17875h.m44304o(r1)
            goto L_0x0128
        L_0x0082:
            int r7 = r14.f16438o
        L_0x0084:
            ga.e1$c r8 = r0.f14349t
            int r14 = r8.f16439p
            if (r7 > r14) goto L_0x0116
            ga.e1$b r8 = r0.f14347s
            r2.mo20345f(r7, r8, r5)
            ga.e1$b r8 = r0.f14347s
            hb.a r8 = r8.f16421g
            int r8 = r8.f17303b
            r14 = 0
        L_0x0096:
            if (r14 >= r8) goto L_0x0105
            ga.e1$b r15 = r0.f14347s
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
            long[] r15 = r0.f14342p0
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
            r0.f14342p0 = r4
            boolean[] r4 = r0.f14344q0
            boolean[] r3 = java.util.Arrays.copyOf(r4, r3)
            r0.f14344q0 = r3
        L_0x00d9:
            long[] r3 = r0.f14342p0
            long r17 = r11 + r17
            long r17 = p099ga.C4883f.m12377b(r17)
            r3[r13] = r17
            boolean[] r3 = r0.f14344q0
            ga.e1$b r4 = r0.f14347s
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
            android.widget.TextView r3 = r0.f14337n
            if (r3 == 0) goto L_0x0140
            java.lang.StringBuilder r4 = r0.f14343q
            java.util.Formatter r5 = r0.f14345r
            java.lang.String r4 = p277ub.C6774a0.m15958r(r4, r5, r1)
            r3.setText(r4)
        L_0x0140:
            com.google.android.exoplayer2.ui.c0 r3 = r0.f14341p
            if (r3 == 0) goto L_0x0177
            r3.setDuration(r1)
            long[] r1 = r0.f14346r0
            int r1 = r1.length
            int r2 = r13 + r1
            long[] r3 = r0.f14342p0
            int r4 = r3.length
            if (r2 <= r4) goto L_0x015f
            long[] r3 = java.util.Arrays.copyOf(r3, r2)
            r0.f14342p0 = r3
            boolean[] r3 = r0.f14344q0
            boolean[] r3 = java.util.Arrays.copyOf(r3, r2)
            r0.f14344q0 = r3
        L_0x015f:
            long[] r3 = r0.f14346r0
            long[] r4 = r0.f14342p0
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r13, r1)
            boolean[] r3 = r0.f14348s0
            boolean[] r4 = r0.f14344q0
            java.lang.System.arraycopy(r3, r5, r4, r13, r1)
            com.google.android.exoplayer2.ui.c0 r1 = r0.f14341p
            long[] r3 = r0.f14342p0
            boolean[] r4 = r0.f14344q0
            r1.mo16353b(r3, r4, r2)
        L_0x0177:
            r21.mo16539o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.StyledPlayerControlView.mo16546s():void");
    }

    public void setAnimationEnabled(boolean z) {
        this.f14356w0.f14519C = z;
    }

    public void setControlDispatcher(C4886g gVar) {
        if (this.f14318Q != gVar) {
            this.f14318Q = gVar;
            mo16536l();
        }
    }

    public void setOnFullScreenModeChangedListener(C4011c cVar) {
        boolean z;
        ImageView imageView = this.f14307J0;
        boolean z2 = true;
        if (cVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        ImageView imageView2 = this.f14309K0;
        if (cVar == null) {
            z2 = false;
        }
        if (imageView2 != null) {
            if (z2) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
    }

    @Deprecated
    public void setPlaybackPreparer(C4934t0 t0Var) {
    }

    public void setPlayer(C4936u0 u0Var) {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        if (!(u0Var == null || u0Var.mo20401t() == Looper.getMainLooper())) {
            z2 = false;
        }
        C17875h.m44301k(z2);
        C4936u0 u0Var2 = this.f14317P;
        if (u0Var2 != u0Var) {
            if (u0Var2 != null) {
                u0Var2.mo20404w(this.f14323b);
            }
            this.f14317P = u0Var;
            if (u0Var != null) {
                u0Var.mo20388g(this.f14323b);
            }
            if (u0Var instanceof C4914m) {
                C6506f f = ((C4914m) u0Var).mo20387f();
                if (f instanceof DefaultTrackSelector) {
                    this.f14297E0 = (DefaultTrackSelector) f;
                }
            } else {
                this.f14297E0 = null;
            }
            mo16534j();
        }
    }

    public void setProgressUpdateListener(C4013e eVar) {
    }

    public void setRepeatToggleModes(int i) {
        this.f14340o0 = i;
        C4936u0 u0Var = this.f14317P;
        boolean z = false;
        if (u0Var != null) {
            int M = u0Var.mo20368M();
            if (i == 0 && M != 0) {
                C4886g gVar = this.f14318Q;
                C4936u0 u0Var2 = this.f14317P;
                ((C4896h) gVar).getClass();
                u0Var2.mo20366J(0);
            } else if (i == 1 && M == 2) {
                C4886g gVar2 = this.f14318Q;
                C4936u0 u0Var3 = this.f14317P;
                ((C4896h) gVar2).getClass();
                u0Var3.mo20366J(1);
            } else if (i == 2 && M == 1) {
                C4886g gVar3 = this.f14318Q;
                C4936u0 u0Var4 = this.f14317P;
                ((C4896h) gVar3).getClass();
                u0Var4.mo20366J(2);
            }
        }
        C4060z zVar = this.f14356w0;
        ImageView imageView = this.f14332k;
        if (i != 0) {
            z = true;
        }
        zVar.mo16678h(imageView, z);
        mo16543p();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f14356w0.mo16678h(this.f14328g, z);
        mo16536l();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f14321T = z;
        mo16546s();
    }

    public void setShowNextButton(boolean z) {
        this.f14356w0.mo16678h(this.f14326e, z);
        mo16536l();
    }

    public void setShowPreviousButton(boolean z) {
        this.f14356w0.mo16678h(this.f14325d, z);
        mo16536l();
    }

    public void setShowRewindButton(boolean z) {
        this.f14356w0.mo16678h(this.f14329h, z);
        mo16536l();
    }

    public void setShowShuffleButton(boolean z) {
        this.f14356w0.mo16678h(this.f14333l, z);
        mo16545r();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f14356w0.mo16678h(this.f14305I0, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f14336m0 = i;
        if (mo16532h()) {
            this.f14356w0.mo16677g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f14356w0.mo16678h(this.f14335m, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f14338n0 = C6774a0.m15947g(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z;
        View view = this.f14335m;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            mo16535k(this.f14335m, z);
        }
    }

    /* renamed from: t */
    public final void mo16565t() {
        DefaultTrackSelector defaultTrackSelector;
        C4000c.C4001a aVar;
        C4017i iVar = this.f14299F0;
        iVar.getClass();
        iVar.f14386h = Collections.emptyList();
        iVar.f14387i = null;
        C4009a aVar2 = this.f14301G0;
        aVar2.getClass();
        aVar2.f14386h = Collections.emptyList();
        aVar2.f14387i = null;
        boolean z = false;
        if (!(this.f14317P == null || (defaultTrackSelector = this.f14297E0) == null || (aVar = defaultTrackSelector.f14145c) == null)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < aVar.f14146a; i++) {
                if (aVar.f14147b[i] == 3 && this.f14356w0.mo16675c(this.f14305I0)) {
                    mo16524f(aVar, i, arrayList);
                    arrayList3.add(Integer.valueOf(i));
                } else if (aVar.f14147b[i] == 1) {
                    mo16524f(aVar, i, arrayList2);
                    arrayList4.add(Integer.valueOf(i));
                }
            }
            this.f14299F0.mo16574m(arrayList3, arrayList, aVar);
            this.f14301G0.mo16568m(arrayList4, arrayList2, aVar);
        }
        if (this.f14299F0.getItemCount() > 0) {
            z = true;
        }
        mo16535k(this.f14305I0, z);
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.graphics.Typeface} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: android.graphics.Typeface} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: android.graphics.Typeface} */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r5v3, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StyledPlayerControlView(android.content.Context r24, android.util.AttributeSet r25, int r26, android.util.AttributeSet r27) {
        /*
            r23 = this;
            r1 = r23
            r0 = r27
            r23.<init>(r24, r25, r26)
            int r2 = com.google.android.exoplayer2.p052ui.C4042k.exo_styled_player_control_view
            r3 = 5000(0x1388, double:2.4703E-320)
            r1.f14352u0 = r3
            r3 = 15000(0x3a98, double:7.411E-320)
            r1.f14354v0 = r3
            r3 = 5000(0x1388, float:7.006E-42)
            r1.f14336m0 = r3
            r8 = 0
            r1.f14340o0 = r8
            r3 = 200(0xc8, float:2.8E-43)
            r1.f14338n0 = r3
            r9 = 1
            if (r0 == 0) goto L_0x00aa
            android.content.res.Resources$Theme r3 = r24.getTheme()
            int[] r4 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r0, r4, r8, r8)
            int r4 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_rewind_increment     // Catch:{ all -> 0x00a5 }
            long r5 = r1.f14352u0     // Catch:{ all -> 0x00a5 }
            int r6 = (int) r5     // Catch:{ all -> 0x00a5 }
            int r4 = r3.getInt(r4, r6)     // Catch:{ all -> 0x00a5 }
            long r4 = (long) r4     // Catch:{ all -> 0x00a5 }
            r1.f14352u0 = r4     // Catch:{ all -> 0x00a5 }
            int r4 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_fastforward_increment     // Catch:{ all -> 0x00a5 }
            long r5 = r1.f14354v0     // Catch:{ all -> 0x00a5 }
            int r6 = (int) r5     // Catch:{ all -> 0x00a5 }
            int r4 = r3.getInt(r4, r6)     // Catch:{ all -> 0x00a5 }
            long r4 = (long) r4     // Catch:{ all -> 0x00a5 }
            r1.f14354v0 = r4     // Catch:{ all -> 0x00a5 }
            int r4 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_controller_layout_id     // Catch:{ all -> 0x00a5 }
            int r2 = r3.getResourceId(r4, r2)     // Catch:{ all -> 0x00a5 }
            int r4 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_show_timeout     // Catch:{ all -> 0x00a5 }
            int r5 = r1.f14336m0     // Catch:{ all -> 0x00a5 }
            int r4 = r3.getInt(r4, r5)     // Catch:{ all -> 0x00a5 }
            r1.f14336m0 = r4     // Catch:{ all -> 0x00a5 }
            int r4 = r1.f14340o0     // Catch:{ all -> 0x00a5 }
            int r5 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_repeat_toggle_modes     // Catch:{ all -> 0x00a5 }
            int r4 = r3.getInt(r5, r4)     // Catch:{ all -> 0x00a5 }
            r1.f14340o0 = r4     // Catch:{ all -> 0x00a5 }
            int r4 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_show_rewind_button     // Catch:{ all -> 0x00a5 }
            boolean r4 = r3.getBoolean(r4, r9)     // Catch:{ all -> 0x00a5 }
            int r5 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_show_fastforward_button     // Catch:{ all -> 0x00a5 }
            boolean r5 = r3.getBoolean(r5, r9)     // Catch:{ all -> 0x00a5 }
            int r6 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_show_previous_button     // Catch:{ all -> 0x00a5 }
            boolean r6 = r3.getBoolean(r6, r9)     // Catch:{ all -> 0x00a5 }
            int r7 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_show_next_button     // Catch:{ all -> 0x00a5 }
            boolean r7 = r3.getBoolean(r7, r9)     // Catch:{ all -> 0x00a5 }
            int r10 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_show_shuffle_button     // Catch:{ all -> 0x00a5 }
            boolean r10 = r3.getBoolean(r10, r8)     // Catch:{ all -> 0x00a5 }
            int r11 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_show_subtitle_button     // Catch:{ all -> 0x00a5 }
            boolean r11 = r3.getBoolean(r11, r8)     // Catch:{ all -> 0x00a5 }
            int r12 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_show_vr_button     // Catch:{ all -> 0x00a5 }
            boolean r12 = r3.getBoolean(r12, r8)     // Catch:{ all -> 0x00a5 }
            int r13 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_time_bar_min_update_interval     // Catch:{ all -> 0x00a5 }
            int r14 = r1.f14338n0     // Catch:{ all -> 0x00a5 }
            int r13 = r3.getInt(r13, r14)     // Catch:{ all -> 0x00a5 }
            r1.setTimeBarMinUpdateInterval(r13)     // Catch:{ all -> 0x00a5 }
            int r13 = com.google.android.exoplayer2.p052ui.C4046o.StyledPlayerControlView_animation_enabled     // Catch:{ all -> 0x00a5 }
            boolean r13 = r3.getBoolean(r13, r9)     // Catch:{ all -> 0x00a5 }
            r3.recycle()
            r14 = r10
            r15 = r11
            r10 = r4
            r11 = r5
            r22 = r12
            r12 = r6
            r6 = r13
            r13 = r7
            r7 = r22
            goto L_0x00b2
        L_0x00a5:
            r0 = move-exception
            r3.recycle()
            throw r0
        L_0x00aa:
            r6 = 1
            r7 = 0
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 0
            r15 = 0
        L_0x00b2:
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r24)
            r3.inflate(r2, r1)
            r2 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r2)
            com.google.android.exoplayer2.ui.StyledPlayerControlView$b r5 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$b
            r5.<init>()
            r1.f14323b = r5
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            r1.f14324c = r2
            ga.e1$b r2 = new ga.e1$b
            r2.<init>()
            r1.f14347s = r2
            ga.e1$c r2 = new ga.e1$c
            r2.<init>()
            r1.f14349t = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1.f14343q = r2
            java.util.Formatter r3 = new java.util.Formatter
            java.util.Locale r4 = java.util.Locale.getDefault()
            r3.<init>(r2, r4)
            r1.f14345r = r3
            long[] r2 = new long[r8]
            r1.f14342p0 = r2
            boolean[] r2 = new boolean[r8]
            r1.f14344q0 = r2
            long[] r2 = new long[r8]
            r1.f14346r0 = r2
            boolean[] r2 = new boolean[r8]
            r1.f14348s0 = r2
            ga.h r2 = new ga.h
            long r3 = r1.f14354v0
            r26 = r10
            long r9 = r1.f14352u0
            r2.<init>(r3, r9)
            r1.f14318Q = r2
            androidx.appcompat.widget.n1 r2 = new androidx.appcompat.widget.n1
            r3 = 8
            r2.<init>(r1, r3)
            r1.f14351u = r2
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_duration
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f14337n = r2
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_position
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f14339o = r2
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_subtitle
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.f14305I0 = r2
            if (r2 == 0) goto L_0x0135
            r2.setOnClickListener(r5)
        L_0x0135:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_fullscreen
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.f14307J0 = r2
            com.google.android.exoplayer2.ui.q r4 = new com.google.android.exoplayer2.ui.q
            r4.<init>(r1, r8)
            if (r2 != 0) goto L_0x0147
            goto L_0x014d
        L_0x0147:
            r2.setVisibility(r3)
            r2.setOnClickListener(r4)
        L_0x014d:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_minimal_fullscreen
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.f14309K0 = r2
            com.google.android.exoplayer2.ui.r r4 = new com.google.android.exoplayer2.ui.r
            r4.<init>(r1, r8)
            if (r2 != 0) goto L_0x015f
            goto L_0x0165
        L_0x015f:
            r2.setVisibility(r3)
            r2.setOnClickListener(r4)
        L_0x0165:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_settings
            android.view.View r2 = r1.findViewById(r2)
            r1.f14311L0 = r2
            if (r2 == 0) goto L_0x0172
            r2.setOnClickListener(r5)
        L_0x0172:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_playback_speed
            android.view.View r2 = r1.findViewById(r2)
            r1.f14313M0 = r2
            if (r2 == 0) goto L_0x017f
            r2.setOnClickListener(r5)
        L_0x017f:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_audio_track
            android.view.View r2 = r1.findViewById(r2)
            r1.f14315N0 = r2
            if (r2 == 0) goto L_0x018c
            r2.setOnClickListener(r5)
        L_0x018c:
            int r9 = com.google.android.exoplayer2.p052ui.C4040i.exo_progress
            android.view.View r2 = r1.findViewById(r9)
            com.google.android.exoplayer2.ui.c0 r2 = (com.google.android.exoplayer2.p052ui.C4032c0) r2
            int r3 = com.google.android.exoplayer2.p052ui.C4040i.exo_progress_placeholder
            android.view.View r10 = r1.findViewById(r3)
            r4 = 0
            if (r2 == 0) goto L_0x01a7
            r1.f14341p = r2
            r0 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            goto L_0x01ed
        L_0x01a7:
            if (r10 == 0) goto L_0x01e4
            com.google.android.exoplayer2.ui.DefaultTimeBar r3 = new com.google.android.exoplayer2.ui.DefaultTimeBar
            r16 = 0
            r17 = 0
            int r18 = com.google.android.exoplayer2.p052ui.C4045n.ExoStyledControls_TimeBar
            r2 = r3
            r8 = r3
            r3 = r24
            r0 = r4
            r4 = r16
            r19 = r5
            r5 = r17
            r20 = r6
            r6 = r27
            r21 = r7
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r8.setId(r9)
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            r8.setLayoutParams(r2)
            android.view.ViewParent r2 = r10.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r3 = r2.indexOfChild(r10)
            r2.removeView(r10)
            r2.addView(r8, r3)
            r1.f14341p = r8
            goto L_0x01ed
        L_0x01e4:
            r0 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r1.f14341p = r0
        L_0x01ed:
            com.google.android.exoplayer2.ui.c0 r2 = r1.f14341p
            r3 = r19
            if (r2 == 0) goto L_0x01f6
            r2.mo16352a(r3)
        L_0x01f6:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_play_pause
            android.view.View r2 = r1.findViewById(r2)
            r1.f14327f = r2
            if (r2 == 0) goto L_0x0203
            r2.setOnClickListener(r3)
        L_0x0203:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_prev
            android.view.View r2 = r1.findViewById(r2)
            r1.f14325d = r2
            if (r2 == 0) goto L_0x0210
            r2.setOnClickListener(r3)
        L_0x0210:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_next
            android.view.View r2 = r1.findViewById(r2)
            r1.f14326e = r2
            if (r2 == 0) goto L_0x021d
            r2.setOnClickListener(r3)
        L_0x021d:
            int r5 = com.google.android.exoplayer2.p052ui.C4039h.roboto_medium_numbers
            java.lang.ThreadLocal<android.util.TypedValue> r2 = p116i1.C5247f.f17365a
            boolean r2 = r24.isRestricted()
            if (r2 == 0) goto L_0x0229
            r4 = r0
            goto L_0x0238
        L_0x0229:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r24
            android.graphics.Typeface r4 = p116i1.C5247f.m13263b(r4, r5, r6, r7, r8, r9, r10)
        L_0x0238:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_rew
            android.view.View r2 = r1.findViewById(r2)
            if (r2 != 0) goto L_0x0249
            int r5 = com.google.android.exoplayer2.p052ui.C4040i.exo_rew_with_amount
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x024a
        L_0x0249:
            r5 = r0
        L_0x024a:
            r1.f14331j = r5
            if (r5 == 0) goto L_0x0251
            r5.setTypeface(r4)
        L_0x0251:
            if (r2 != 0) goto L_0x0254
            r2 = r5
        L_0x0254:
            r1.f14329h = r2
            if (r2 == 0) goto L_0x025b
            r2.setOnClickListener(r3)
        L_0x025b:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_ffwd
            android.view.View r2 = r1.findViewById(r2)
            if (r2 != 0) goto L_0x026c
            int r5 = com.google.android.exoplayer2.p052ui.C4040i.exo_ffwd_with_amount
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x026d
        L_0x026c:
            r5 = r0
        L_0x026d:
            r1.f14330i = r5
            if (r5 == 0) goto L_0x0274
            r5.setTypeface(r4)
        L_0x0274:
            if (r2 != 0) goto L_0x0277
            r2 = r5
        L_0x0277:
            r1.f14328g = r2
            if (r2 == 0) goto L_0x027e
            r2.setOnClickListener(r3)
        L_0x027e:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_repeat_toggle
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.f14332k = r2
            if (r2 == 0) goto L_0x028d
            r2.setOnClickListener(r3)
        L_0x028d:
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_shuffle
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.f14333l = r2
            if (r2 == 0) goto L_0x029c
            r2.setOnClickListener(r3)
        L_0x029c:
            android.content.res.Resources r2 = r24.getResources()
            r1.f14358x0 = r2
            int r3 = com.google.android.exoplayer2.p052ui.C4041j.exo_media_button_opacity_percentage_enabled
            int r2 = r2.getInteger(r3)
            float r2 = (float) r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            r1.f14294D = r2
            android.content.res.Resources r2 = r1.f14358x0
            int r4 = com.google.android.exoplayer2.p052ui.C4041j.exo_media_button_opacity_percentage_disabled
            int r2 = r2.getInteger(r4)
            float r2 = (float) r2
            float r2 = r2 / r3
            r1.f14296E = r2
            int r2 = com.google.android.exoplayer2.p052ui.C4040i.exo_vr
            android.view.View r2 = r1.findViewById(r2)
            r1.f14335m = r2
            if (r2 == 0) goto L_0x02c8
            r3 = 0
            r1.mo16535k(r2, r3)
        L_0x02c8:
            com.google.android.exoplayer2.ui.z r2 = new com.google.android.exoplayer2.ui.z
            r2.<init>(r1)
            r1.f14356w0 = r2
            r9 = r20
            r2.f14519C = r9
            r2 = 2
            java.lang.String[] r3 = new java.lang.String[r2]
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            android.content.res.Resources r4 = r1.f14358x0
            int r5 = com.google.android.exoplayer2.p052ui.C4044m.exo_controls_playback_speed
            java.lang.String r4 = r4.getString(r5)
            r5 = 0
            r3[r5] = r4
            android.content.res.Resources r4 = r1.f14358x0
            int r6 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_speed
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r6)
            r2[r5] = r4
            android.content.res.Resources r4 = r1.f14358x0
            int r5 = com.google.android.exoplayer2.p052ui.C4044m.exo_track_selection_title_audio
            java.lang.String r4 = r4.getString(r5)
            r5 = 1
            r3[r5] = r4
            android.content.res.Resources r4 = r1.f14358x0
            int r6 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_audiotrack
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r6)
            r2[r5] = r4
            com.google.android.exoplayer2.ui.StyledPlayerControlView$g r4 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$g
            r4.<init>(r3, r2)
            r1.f14362z0 = r4
            android.content.res.Resources r2 = r1.f14358x0
            int r3 = com.google.android.exoplayer2.p052ui.C4037f.exo_settings_offset
            int r2 = r2.getDimensionPixelSize(r3)
            r1.f14295D0 = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r24)
            int r3 = com.google.android.exoplayer2.p052ui.C4042k.exo_styled_settings_list
            android.view.View r0 = r2.inflate(r3, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.f14360y0 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r1.f14360y0
            com.google.android.exoplayer2.ui.StyledPlayerControlView$g r2 = r1.f14362z0
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r1.f14360y0
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r23.getContext()
            r2.<init>(r3)
            r0.setLayoutManager(r2)
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            androidx.recyclerview.widget.RecyclerView r2 = r1.f14360y0
            r3 = -2
            r4 = 1
            r0.<init>(r2, r3, r3, r4)
            r1.f14291B0 = r0
            int r0 = p277ub.C6774a0.f20959a
            r2 = 23
            if (r0 >= r2) goto L_0x0353
            android.widget.PopupWindow r0 = r1.f14291B0
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = 0
            r2.<init>(r3)
            r0.setBackgroundDrawable(r2)
            goto L_0x0354
        L_0x0353:
            r3 = 0
        L_0x0354:
            android.widget.PopupWindow r0 = r1.f14291B0
            com.google.android.exoplayer2.ui.StyledPlayerControlView$b r2 = r1.f14323b
            r0.setOnDismissListener(r2)
            r0 = 1
            r1.f14293C0 = r0
            com.google.android.exoplayer2.ui.c r0 = new com.google.android.exoplayer2.ui.c
            android.content.res.Resources r2 = r23.getResources()
            r0.<init>(r2)
            r1.f14303H0 = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_subtitle_on
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.f14302H = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_subtitle_off
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.f14304I = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4044m.exo_controls_cc_enabled_description
            java.lang.String r0 = r0.getString(r2)
            r1.f14306J = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4044m.exo_controls_cc_disabled_description
            java.lang.String r0 = r0.getString(r2)
            r1.f14308K = r0
            com.google.android.exoplayer2.ui.StyledPlayerControlView$i r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$i
            r0.<init>()
            r1.f14299F0 = r0
            com.google.android.exoplayer2.ui.StyledPlayerControlView$a r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$a
            r0.<init>()
            r1.f14301G0 = r0
            com.google.android.exoplayer2.ui.StyledPlayerControlView$d r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$d
            android.content.res.Resources r2 = r1.f14358x0
            int r4 = com.google.android.exoplayer2.p052ui.C4034d.exo_playback_speeds
            java.lang.String[] r2 = r2.getStringArray(r4)
            android.content.res.Resources r4 = r1.f14358x0
            int r5 = com.google.android.exoplayer2.p052ui.C4034d.exo_speed_multiplied_by_100
            int[] r4 = r4.getIntArray(r5)
            r0.<init>(r2, r4)
            r1.f14289A0 = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_fullscreen_exit
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.f14310L = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_fullscreen_enter
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.f14312M = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_repeat_off
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.f14353v = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_repeat_one
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.f14355w = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_repeat_all
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.f14357x = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_shuffle_on
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.f14290B = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4038g.exo_styled_controls_shuffle_off
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.f14292C = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4044m.exo_controls_fullscreen_exit_description
            java.lang.String r0 = r0.getString(r2)
            r1.f14314N = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4044m.exo_controls_fullscreen_enter_description
            java.lang.String r0 = r0.getString(r2)
            r1.f14316O = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4044m.exo_controls_repeat_off_description
            java.lang.String r0 = r0.getString(r2)
            r1.f14359y = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4044m.exo_controls_repeat_one_description
            java.lang.String r0 = r0.getString(r2)
            r1.f14361z = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4044m.exo_controls_repeat_all_description
            java.lang.String r0 = r0.getString(r2)
            r1.f14288A = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4044m.exo_controls_shuffle_on_description
            java.lang.String r0 = r0.getString(r2)
            r1.f14298F = r0
            android.content.res.Resources r0 = r1.f14358x0
            int r2 = com.google.android.exoplayer2.p052ui.C4044m.exo_controls_shuffle_off_description
            java.lang.String r0 = r0.getString(r2)
            r1.f14300G = r0
            int r0 = com.google.android.exoplayer2.p052ui.C4040i.exo_bottom_bar
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.exoplayer2.ui.z r2 = r1.f14356w0
            r4 = 1
            r2.mo16678h(r0, r4)
            com.google.android.exoplayer2.ui.z r0 = r1.f14356w0
            android.view.View r2 = r1.f14328g
            r0.mo16678h(r2, r11)
            com.google.android.exoplayer2.ui.z r0 = r1.f14356w0
            android.view.View r2 = r1.f14329h
            r4 = r26
            r0.mo16678h(r2, r4)
            com.google.android.exoplayer2.ui.z r0 = r1.f14356w0
            android.view.View r2 = r1.f14325d
            r0.mo16678h(r2, r12)
            com.google.android.exoplayer2.ui.z r0 = r1.f14356w0
            android.view.View r2 = r1.f14326e
            r0.mo16678h(r2, r13)
            com.google.android.exoplayer2.ui.z r0 = r1.f14356w0
            android.widget.ImageView r2 = r1.f14333l
            r0.mo16678h(r2, r14)
            com.google.android.exoplayer2.ui.z r0 = r1.f14356w0
            android.widget.ImageView r2 = r1.f14305I0
            r0.mo16678h(r2, r15)
            com.google.android.exoplayer2.ui.z r0 = r1.f14356w0
            android.view.View r2 = r1.f14335m
            r12 = r21
            r0.mo16678h(r2, r12)
            com.google.android.exoplayer2.ui.z r0 = r1.f14356w0
            android.widget.ImageView r2 = r1.f14332k
            int r4 = r1.f14340o0
            if (r4 == 0) goto L_0x048f
            r8 = 1
            goto L_0x0490
        L_0x048f:
            r8 = 0
        L_0x0490:
            r0.mo16678h(r2, r8)
            q7.a r0 = new q7.a
            r2 = 1
            r0.<init>(r2, r1)
            r1.addOnLayoutChangeListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.StyledPlayerControlView.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }
}
