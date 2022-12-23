package com.google.android.exoplayer2.p052ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.InAppMessageBase;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.p052ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.p052ui.StyledPlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C4002d;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableList;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import p090g1.C4732a;
import p099ga.C4879e1;
import p099ga.C4886g;
import p099ga.C4901j0;
import p099ga.C4910k0;
import p099ga.C4932s0;
import p099ga.C4934t0;
import p099ga.C4936u0;
import p126ib.C5332a;
import p193o4.C5980f;
import p252sb.C6505e;
import p277ub.C6774a0;
import p277ub.C6779e;
import p290vb.C6955o;
import p583jk.C17875h;

/* renamed from: com.google.android.exoplayer2.ui.StyledPlayerView */
public class StyledPlayerView extends FrameLayout {

    /* renamed from: B */
    public static final /* synthetic */ int f14389B = 0;

    /* renamed from: A */
    public boolean f14390A;

    /* renamed from: b */
    public final C4021a f14391b;

    /* renamed from: c */
    public final AspectRatioFrameLayout f14392c;

    /* renamed from: d */
    public final View f14393d;

    /* renamed from: e */
    public final View f14394e;

    /* renamed from: f */
    public final boolean f14395f;

    /* renamed from: g */
    public final ImageView f14396g;

    /* renamed from: h */
    public final SubtitleView f14397h;

    /* renamed from: i */
    public final View f14398i;

    /* renamed from: j */
    public final TextView f14399j;

    /* renamed from: k */
    public final StyledPlayerControlView f14400k;

    /* renamed from: l */
    public final FrameLayout f14401l;

    /* renamed from: m */
    public final FrameLayout f14402m;

    /* renamed from: n */
    public C4936u0 f14403n;

    /* renamed from: o */
    public boolean f14404o;

    /* renamed from: p */
    public StyledPlayerControlView.C4020l f14405p;

    /* renamed from: q */
    public boolean f14406q;

    /* renamed from: r */
    public Drawable f14407r;

    /* renamed from: s */
    public int f14408s;

    /* renamed from: t */
    public boolean f14409t;

    /* renamed from: u */
    public CharSequence f14410u;

    /* renamed from: v */
    public int f14411v;

    /* renamed from: w */
    public boolean f14412w;

    /* renamed from: x */
    public boolean f14413x;

    /* renamed from: y */
    public boolean f14414y;

    /* renamed from: z */
    public int f14415z;

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerView$a */
    public final class C4021a implements C4936u0.C4940d, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.C4020l {

        /* renamed from: b */
        public final C4879e1.C4881b f14416b = new C4879e1.C4881b();

        /* renamed from: c */
        public Object f14417c;

        public C4021a() {
        }

        /* renamed from: B */
        public final void mo16508B(List<C5332a> list) {
            SubtitleView subtitleView = StyledPlayerView.this.f14397h;
            if (subtitleView != null) {
                subtitleView.setCues(list);
            }
        }

        /* renamed from: I */
        public final /* synthetic */ void mo16509I(int i, int i2) {
        }

        /* renamed from: K */
        public final /* synthetic */ void mo16423K(ExoPlaybackException exoPlaybackException) {
        }

        /* renamed from: L */
        public final /* synthetic */ void mo16424L(boolean z) {
        }

        /* renamed from: M */
        public final void mo16425M(int i, boolean z) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i2 = StyledPlayerView.f14389B;
            styledPlayerView.mo16597i();
            StyledPlayerView styledPlayerView2 = StyledPlayerView.this;
            if (!styledPlayerView2.mo16577c() || !styledPlayerView2.f14413x) {
                styledPlayerView2.mo16578d(false);
                return;
            }
            StyledPlayerControlView styledPlayerControlView = styledPlayerView2.f14400k;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.mo16525g();
            }
        }

        /* renamed from: N */
        public final /* synthetic */ void mo16510N(float f) {
        }

        /* renamed from: P */
        public final /* synthetic */ void mo16426P(C4901j0 j0Var, int i) {
        }

        /* renamed from: Q */
        public final void mo16427Q(TrackGroupArray trackGroupArray, C6505e eVar) {
            boolean z;
            C4936u0 u0Var = StyledPlayerView.this.f14403n;
            u0Var.getClass();
            C4879e1 s = u0Var.mo20400s();
            if (s.mo20464p()) {
                this.f14417c = null;
            } else {
                if (u0Var.mo20399r().f14012b == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f14417c = s.mo20345f(u0Var.mo20359B(), this.f14416b, true).f16416b;
                } else {
                    Object obj = this.f14417c;
                    if (obj != null) {
                        int b = s.mo20342b(obj);
                        if (b == -1 || u0Var.mo20393k() != s.mo20345f(b, this.f14416b, false).f16417c) {
                            this.f14417c = null;
                        } else {
                            return;
                        }
                    }
                }
            }
            StyledPlayerView.this.mo16600l(false);
        }

        /* renamed from: S */
        public final void mo16428S(int i, C4936u0.C4941e eVar, C4936u0.C4941e eVar2) {
            StyledPlayerControlView styledPlayerControlView;
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i2 = StyledPlayerView.f14389B;
            if (styledPlayerView.mo16577c()) {
                StyledPlayerView styledPlayerView2 = StyledPlayerView.this;
                if (styledPlayerView2.f14413x && (styledPlayerControlView = styledPlayerView2.f14400k) != null) {
                    styledPlayerControlView.mo16525g();
                }
            }
        }

        /* renamed from: U */
        public final /* synthetic */ void mo16511U() {
        }

        /* renamed from: V */
        public final /* synthetic */ void mo16429V(int i) {
        }

        /* renamed from: X */
        public final /* synthetic */ void mo16430X() {
        }

        /* renamed from: Y */
        public final /* synthetic */ void mo16512Y() {
        }

        /* renamed from: Z */
        public final /* synthetic */ void mo16431Z(int i, boolean z) {
        }

        /* renamed from: a */
        public final void mo16575a() {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i = StyledPlayerView.f14389B;
            styledPlayerView.mo16598j();
        }

        /* renamed from: b */
        public final /* synthetic */ void mo16433b() {
        }

        /* renamed from: b0 */
        public final /* synthetic */ void mo16434b0(C4932s0 s0Var) {
        }

        /* renamed from: c */
        public final void mo16513c() {
            View view = StyledPlayerView.this.f14393d;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        /* renamed from: d */
        public final /* synthetic */ void mo16514d(boolean z) {
        }

        /* renamed from: d0 */
        public final /* synthetic */ void mo16437d0(C4936u0.C4939c cVar) {
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

        /* renamed from: j */
        public final /* synthetic */ void mo16515j(C6955o oVar) {
        }

        /* renamed from: l */
        public final /* synthetic */ void mo16442l(int i) {
        }

        public final void onClick(View view) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i = StyledPlayerView.f14389B;
            styledPlayerView.mo16596h();
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            StyledPlayerView.m10853a((TextureView) view, StyledPlayerView.this.f14415z);
        }

        public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
            float f2;
            if (i2 == 0 || i == 0) {
                f2 = 1.0f;
            } else {
                f2 = (((float) i) * f) / ((float) i2);
            }
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            View view = styledPlayerView.f14394e;
            if (view instanceof TextureView) {
                if (i3 == 90 || i3 == 270) {
                    f2 = 1.0f / f2;
                }
                if (styledPlayerView.f14415z != 0) {
                    view.removeOnLayoutChangeListener(this);
                }
                StyledPlayerView styledPlayerView2 = StyledPlayerView.this;
                styledPlayerView2.f14415z = i3;
                if (i3 != 0) {
                    styledPlayerView2.f14394e.addOnLayoutChangeListener(this);
                }
                StyledPlayerView styledPlayerView3 = StyledPlayerView.this;
                StyledPlayerView.m10853a((TextureView) styledPlayerView3.f14394e, styledPlayerView3.f14415z);
            }
            StyledPlayerView styledPlayerView4 = StyledPlayerView.this;
            AspectRatioFrameLayout aspectRatioFrameLayout = styledPlayerView4.f14392c;
            if (styledPlayerView4.f14395f) {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (aspectRatioFrameLayout != null) {
                aspectRatioFrameLayout.setAspectRatio(f2);
            }
        }

        /* renamed from: p */
        public final /* synthetic */ void mo16444p(List list) {
        }

        /* renamed from: s */
        public final /* synthetic */ void mo16445s(C4910k0 k0Var) {
        }

        /* renamed from: u */
        public final void mo16446u(int i) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i2 = StyledPlayerView.f14389B;
            styledPlayerView.mo16597i();
            StyledPlayerView.this.mo16599k();
            StyledPlayerView styledPlayerView2 = StyledPlayerView.this;
            if (!styledPlayerView2.mo16577c() || !styledPlayerView2.f14413x) {
                styledPlayerView2.mo16578d(false);
                return;
            }
            StyledPlayerControlView styledPlayerControlView = styledPlayerView2.f14400k;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.mo16525g();
            }
        }

        /* renamed from: w */
        public final /* synthetic */ void mo16447w(boolean z) {
        }

        /* renamed from: x */
        public final /* synthetic */ void mo16519x(Metadata metadata) {
        }

        /* renamed from: y */
        public final /* synthetic */ void mo16448y(int i) {
        }
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m10853a(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == BitmapDescriptorFactory.HUE_RED || height == BitmapDescriptorFactory.HUE_RED || i == 0)) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate((float) i, f, f2);
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: b */
    public final void mo16576b() {
        ImageView imageView = this.f14396g;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f14396g.setVisibility(4);
        }
    }

    /* renamed from: c */
    public final boolean mo16577c() {
        C4936u0 u0Var = this.f14403n;
        return u0Var != null && u0Var.mo20385d() && this.f14403n.mo20407z();
    }

    /* renamed from: d */
    public final void mo16578d(boolean z) {
        boolean z2;
        if ((!mo16577c() || !this.f14413x) && mo16601m()) {
            if (!this.f14400k.mo16532h() || this.f14400k.getShowTimeoutMs() > 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean f = mo16581f();
            if (z || z2 || f) {
                mo16582g(f);
            }
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        C4936u0 u0Var = this.f14403n;
        if (u0Var != null && u0Var.mo20385d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !mo16601m() || this.f14400k.mo16532h()) {
            if (!mo16601m() || !this.f14400k.mo16520c(keyEvent)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 || super.dispatchKeyEvent(keyEvent)) {
                mo16578d(true);
            } else if (!z || !mo16601m()) {
                return false;
            } else {
                mo16578d(true);
                return false;
            }
        } else {
            mo16578d(true);
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo16580e(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f14392c;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                this.f14396g.setImageDrawable(drawable);
                this.f14396g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo16581f() {
        C4936u0 u0Var = this.f14403n;
        if (u0Var == null) {
            return true;
        }
        int H = u0Var.mo20364H();
        if (this.f14412w && !this.f14403n.mo20400s().mo20464p()) {
            if (H == 1 || H == 4) {
                return true;
            }
            C4936u0 u0Var2 = this.f14403n;
            u0Var2.getClass();
            if (!u0Var2.mo20407z()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo16582g(boolean z) {
        int i;
        if (mo16601m()) {
            StyledPlayerControlView styledPlayerControlView = this.f14400k;
            if (z) {
                i = 0;
            } else {
                i = this.f14411v;
            }
            styledPlayerControlView.setShowTimeoutMs(i);
            C4060z zVar = this.f14400k.f14356w0;
            if (!zVar.f14520a.mo16533i()) {
                zVar.f14520a.setVisibility(0);
                zVar.f14520a.mo16534j();
                View view = zVar.f14520a.f14327f;
                if (view != null) {
                    view.requestFocus();
                }
            }
            zVar.mo16680k();
        }
    }

    public List<C5980f> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f14402m;
        if (frameLayout != null) {
            arrayList.add(new C5980f(3, frameLayout, "Transparent overlay does not impact viewability"));
        }
        StyledPlayerControlView styledPlayerControlView = this.f14400k;
        if (styledPlayerControlView != null) {
            arrayList.add(new C5980f(0, styledPlayerControlView, (String) null));
        }
        return ImmutableList.m35691z(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f14401l;
        C17875h.m44307r(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.f14412w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f14414y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f14411v;
    }

    public Drawable getDefaultArtwork() {
        return this.f14407r;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f14402m;
    }

    public C4936u0 getPlayer() {
        return this.f14403n;
    }

    public int getResizeMode() {
        C17875h.m44306q(this.f14392c);
        return this.f14392c.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f14397h;
    }

    public boolean getUseArtwork() {
        return this.f14406q;
    }

    public boolean getUseController() {
        return this.f14404o;
    }

    public View getVideoSurfaceView() {
        return this.f14394e;
    }

    /* renamed from: h */
    public final boolean mo16596h() {
        if (mo16601m() && this.f14403n != null) {
            if (!this.f14400k.mo16532h()) {
                mo16578d(true);
                return true;
            } else if (this.f14414y) {
                this.f14400k.mo16525g();
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo16597i() {
        int i;
        if (this.f14398i != null) {
            C4936u0 u0Var = this.f14403n;
            boolean z = true;
            int i2 = 0;
            if (u0Var == null || u0Var.mo20364H() != 2 || ((i = this.f14408s) != 2 && (i != 1 || !this.f14403n.mo20407z()))) {
                z = false;
            }
            View view = this.f14398i;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    /* renamed from: j */
    public final void mo16598j() {
        StyledPlayerControlView styledPlayerControlView = this.f14400k;
        String str = null;
        if (styledPlayerControlView == null || !this.f14404o) {
            setContentDescription((CharSequence) null);
        } else if (styledPlayerControlView.mo16532h()) {
            if (this.f14414y) {
                str = getResources().getString(C4044m.exo_controls_hide);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(C4044m.exo_controls_show));
        }
    }

    /* renamed from: k */
    public final void mo16599k() {
        TextView textView = this.f14399j;
        if (textView != null) {
            CharSequence charSequence = this.f14410u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f14399j.setVisibility(0);
                return;
            }
            C4936u0 u0Var = this.f14403n;
            if (u0Var != null) {
                ExoPlaybackException l = u0Var.mo20394l();
            }
            this.f14399j.setVisibility(8);
        }
    }

    /* renamed from: l */
    public final void mo16600l(boolean z) {
        boolean z2;
        byte[] bArr;
        int i;
        View view;
        C4936u0 u0Var = this.f14403n;
        if (u0Var != null) {
            boolean z3 = true;
            if (u0Var.mo20399r().f14012b == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (z && !this.f14409t && (view = this.f14393d) != null) {
                    view.setVisibility(0);
                }
                if (C4002d.m10699a(u0Var.mo20403v())) {
                    mo16576b();
                    return;
                }
                View view2 = this.f14393d;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                if (this.f14406q) {
                    C17875h.m44306q(this.f14396g);
                } else {
                    z3 = false;
                }
                if (z3) {
                    for (Metadata next : u0Var.mo20391h()) {
                        int i2 = 0;
                        int i3 = -1;
                        boolean z4 = false;
                        while (true) {
                            Metadata.Entry[] entryArr = next.f13864b;
                            if (i2 >= entryArr.length) {
                                break;
                            }
                            Metadata.Entry entry = entryArr[i2];
                            if (entry instanceof ApicFrame) {
                                ApicFrame apicFrame = (ApicFrame) entry;
                                bArr = apicFrame.f13907f;
                                i = apicFrame.f13906e;
                            } else if (entry instanceof PictureFrame) {
                                PictureFrame pictureFrame = (PictureFrame) entry;
                                bArr = pictureFrame.f13892i;
                                i = pictureFrame.f13885b;
                            } else {
                                continue;
                                i2++;
                            }
                            if (i3 == -1 || i == 3) {
                                z4 = mo16580e(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                                if (i == 3) {
                                    continue;
                                    break;
                                } else {
                                    i3 = i;
                                    i2++;
                                }
                            } else {
                                i2++;
                            }
                        }
                        if (z4) {
                            return;
                        }
                    }
                    if (mo16580e(this.f14407r)) {
                        return;
                    }
                }
                mo16576b();
                return;
            }
        }
        if (!this.f14409t) {
            mo16576b();
            View view3 = this.f14393d;
            if (view3 != null) {
                view3.setVisibility(0);
            }
        }
    }

    /* renamed from: m */
    public final boolean mo16601m() {
        if (!this.f14404o) {
            return false;
        }
        C17875h.m44306q(this.f14400k);
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo16601m() || this.f14403n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f14390A = true;
            return true;
        } else if (action != 1 || !this.f14390A) {
            return false;
        } else {
            this.f14390A = false;
            return performClick();
        }
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!mo16601m() || this.f14403n == null) {
            return false;
        }
        mo16578d(true);
        return true;
    }

    public final boolean performClick() {
        super.performClick();
        return mo16596h();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.C4003a aVar) {
        C17875h.m44306q(this.f14392c);
        this.f14392c.setAspectRatioListener(aVar);
    }

    public void setControlDispatcher(C4886g gVar) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setControlDispatcher(gVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.f14412w = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f14413x = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C17875h.m44306q(this.f14400k);
        this.f14414y = z;
        mo16598j();
    }

    public void setControllerOnFullScreenModeChangedListener(StyledPlayerControlView.C4011c cVar) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setOnFullScreenModeChangedListener(cVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        C17875h.m44306q(this.f14400k);
        this.f14411v = i;
        if (this.f14400k.mo16532h()) {
            mo16582g(mo16581f());
        }
    }

    public void setControllerVisibilityListener(StyledPlayerControlView.C4020l lVar) {
        C17875h.m44306q(this.f14400k);
        StyledPlayerControlView.C4020l lVar2 = this.f14405p;
        if (lVar2 != lVar) {
            if (lVar2 != null) {
                this.f14400k.f14324c.remove(lVar2);
            }
            this.f14405p = lVar;
            if (lVar != null) {
                StyledPlayerControlView styledPlayerControlView = this.f14400k;
                styledPlayerControlView.getClass();
                styledPlayerControlView.f14324c.add(lVar);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z;
        if (this.f14399j != null) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        this.f14410u = charSequence;
        mo16599k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f14407r != drawable) {
            this.f14407r = drawable;
            mo16600l(false);
        }
    }

    public void setErrorMessageProvider(C6779e<? super ExoPlaybackException> eVar) {
        if (eVar != null) {
            mo16599k();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f14409t != z) {
            this.f14409t = z;
            mo16600l(false);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(C4934t0 t0Var) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setPlaybackPreparer(t0Var);
    }

    public void setPlayer(C4936u0 u0Var) {
        boolean z;
        boolean z2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        if (u0Var == null || u0Var.mo20401t() == Looper.getMainLooper()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17875h.m44301k(z2);
        C4936u0 u0Var2 = this.f14403n;
        if (u0Var2 != u0Var) {
            if (u0Var2 != null) {
                u0Var2.mo20406y(this.f14391b);
                View view = this.f14394e;
                if (view instanceof TextureView) {
                    u0Var2.mo20360C((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    u0Var2.mo20367L((SurfaceView) view);
                }
            }
            SubtitleView subtitleView = this.f14397h;
            if (subtitleView != null) {
                subtitleView.setCues((List<C5332a>) null);
            }
            this.f14403n = u0Var;
            if (mo16601m()) {
                this.f14400k.setPlayer(u0Var);
            }
            mo16597i();
            mo16599k();
            mo16600l(true);
            if (u0Var != null) {
                if (u0Var.mo20454p(21)) {
                    View view2 = this.f14394e;
                    if (view2 instanceof TextureView) {
                        u0Var.mo20402u((TextureView) view2);
                    } else if (view2 instanceof SurfaceView) {
                        u0Var.mo20392j((SurfaceView) view2);
                    }
                }
                if (this.f14397h != null && u0Var.mo20454p(22)) {
                    this.f14397h.setCues(u0Var.mo20396n());
                }
                u0Var.mo20363G(this.f14391b);
                mo16578d(false);
                return;
            }
            StyledPlayerControlView styledPlayerControlView = this.f14400k;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.mo16525g();
            }
        }
    }

    public void setRepeatToggleModes(int i) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        C17875h.m44306q(this.f14392c);
        this.f14392c.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f14408s != i) {
            this.f14408s = i;
            mo16597i();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        C17875h.m44306q(this.f14400k);
        this.f14400k.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f14393d;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        boolean z2;
        if (!z || this.f14396g != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17875h.m44304o(z2);
        if (this.f14406q != z) {
            this.f14406q = z;
            mo16600l(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z2;
        if (!z || this.f14400k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17875h.m44304o(z2);
        if (this.f14404o != z) {
            this.f14404o = z;
            if (mo16601m()) {
                this.f14400k.setPlayer(this.f14403n);
            } else {
                StyledPlayerControlView styledPlayerControlView = this.f14400k;
                if (styledPlayerControlView != null) {
                    styledPlayerControlView.mo16525g();
                    this.f14400k.setPlayer((C4936u0) null);
                }
            }
            mo16598j();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f14394e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyledPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        int i7;
        boolean z7;
        boolean z8;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        C4021a aVar = new C4021a();
        this.f14391b = aVar;
        if (isInEditMode()) {
            this.f14392c = null;
            this.f14393d = null;
            this.f14394e = null;
            this.f14395f = false;
            this.f14396g = null;
            this.f14397h = null;
            this.f14398i = null;
            this.f14399j = null;
            this.f14400k = null;
            this.f14401l = null;
            this.f14402m = null;
            ImageView imageView = new ImageView(context2);
            if (C6774a0.f20959a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(C4038g.exo_edit_mode_logo, (Resources.Theme) null));
                imageView.setBackgroundColor(resources.getColor(C4036e.exo_edit_mode_background_color, (Resources.Theme) null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(C4038g.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(C4036e.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i8 = C4042k.exo_styled_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C4046o.StyledPlayerView, 0, 0);
            try {
                int i9 = C4046o.StyledPlayerView_shutter_background_color;
                boolean hasValue = obtainStyledAttributes.hasValue(i9);
                int color = obtainStyledAttributes.getColor(i9, 0);
                int resourceId = obtainStyledAttributes.getResourceId(C4046o.StyledPlayerView_player_layout_id, i8);
                boolean z9 = obtainStyledAttributes.getBoolean(C4046o.StyledPlayerView_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(C4046o.StyledPlayerView_default_artwork, 0);
                boolean z11 = obtainStyledAttributes.getBoolean(C4046o.StyledPlayerView_use_controller, true);
                int i11 = obtainStyledAttributes.getInt(C4046o.StyledPlayerView_surface_type, 1);
                int i12 = obtainStyledAttributes.getInt(C4046o.StyledPlayerView_resize_mode, 0);
                int i13 = obtainStyledAttributes.getInt(C4046o.StyledPlayerView_show_timeout, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
                boolean z12 = obtainStyledAttributes.getBoolean(C4046o.StyledPlayerView_hide_on_touch, true);
                int i14 = resourceId;
                boolean z13 = obtainStyledAttributes.getBoolean(C4046o.StyledPlayerView_auto_show, true);
                i6 = obtainStyledAttributes.getInteger(C4046o.StyledPlayerView_show_buffering, 0);
                int i15 = i12;
                this.f14409t = obtainStyledAttributes.getBoolean(C4046o.StyledPlayerView_keep_content_on_player_reset, this.f14409t);
                boolean z14 = obtainStyledAttributes.getBoolean(C4046o.StyledPlayerView_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                i7 = i11;
                i5 = i15;
                i3 = resourceId2;
                z3 = hasValue;
                int i16 = i13;
                z5 = z14;
                i8 = i14;
                z = z11;
                z2 = z9;
                i4 = color;
                z4 = z12;
                z6 = z13;
                i2 = i16;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i7 = 1;
            z6 = true;
            z5 = true;
            i6 = 0;
            i5 = 0;
            z4 = true;
            i4 = 0;
            z3 = false;
            z2 = true;
            i3 = 0;
            z = true;
            i2 = InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        }
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(C4040i.exo_content_frame);
        this.f14392c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i5);
        }
        View findViewById = findViewById(C4040i.exo_shutter);
        this.f14393d = findViewById;
        if (findViewById != null && z3) {
            findViewById.setBackgroundColor(i4);
        }
        if (aspectRatioFrameLayout == null || i7 == 0) {
            this.f14394e = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 == 2) {
                this.f14394e = new TextureView(context2);
            } else if (i7 == 3) {
                this.f14394e = new SphericalGLSurfaceView(context2, (AttributeSet) null);
                z8 = true;
                this.f14394e.setLayoutParams(layoutParams);
                this.f14394e.setOnClickListener(aVar);
                this.f14394e.setClickable(false);
                aspectRatioFrameLayout.addView(this.f14394e, 0);
                z7 = z8;
            } else if (i7 != 4) {
                this.f14394e = new SurfaceView(context2);
            } else {
                this.f14394e = new VideoDecoderGLSurfaceView(context2, (AttributeSet) null);
            }
            z8 = false;
            this.f14394e.setLayoutParams(layoutParams);
            this.f14394e.setOnClickListener(aVar);
            this.f14394e.setClickable(false);
            aspectRatioFrameLayout.addView(this.f14394e, 0);
            z7 = z8;
        }
        this.f14395f = z7;
        this.f14401l = (FrameLayout) findViewById(C4040i.exo_ad_overlay);
        this.f14402m = (FrameLayout) findViewById(C4040i.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(C4040i.exo_artwork);
        this.f14396g = imageView2;
        this.f14406q = z2 && imageView2 != null;
        if (i3 != 0) {
            this.f14407r = C4732a.getDrawable(getContext(), i3);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C4040i.exo_subtitles);
        this.f14397h = subtitleView;
        if (subtitleView != null) {
            subtitleView.mo16636a();
            subtitleView.mo16637b();
        }
        View findViewById2 = findViewById(C4040i.exo_buffering);
        this.f14398i = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f14408s = i6;
        TextView textView = (TextView) findViewById(C4040i.exo_error_message);
        this.f14399j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i17 = C4040i.exo_controller;
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(i17);
        View findViewById3 = findViewById(C4040i.exo_controller_placeholder);
        if (styledPlayerControlView != null) {
            this.f14400k = styledPlayerControlView;
        } else if (findViewById3 != null) {
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context2, (AttributeSet) null, 0, attributeSet2);
            this.f14400k = styledPlayerControlView2;
            styledPlayerControlView2.setId(i17);
            styledPlayerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(styledPlayerControlView2, indexOfChild);
        } else {
            this.f14400k = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.f14400k;
        this.f14411v = styledPlayerControlView3 != null ? i2 : 0;
        this.f14414y = z4;
        this.f14412w = z6;
        this.f14413x = z5;
        this.f14404o = z && styledPlayerControlView3 != null;
        if (styledPlayerControlView3 != null) {
            C4060z zVar = styledPlayerControlView3.f14356w0;
            int i18 = zVar.f14545z;
            if (!(i18 == 3 || i18 == 2)) {
                zVar.mo16676f();
                zVar.mo16679i(2);
            }
            this.f14400k.f14324c.add(aVar);
        }
        mo16598j();
    }
}
