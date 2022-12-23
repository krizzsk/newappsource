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
import com.google.android.exoplayer2.p052ui.PlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C4002d;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableList;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
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

/* renamed from: com.google.android.exoplayer2.ui.PlayerView */
public class PlayerView extends FrameLayout {

    /* renamed from: B */
    public static final /* synthetic */ int f14257B = 0;

    /* renamed from: A */
    public boolean f14258A;

    /* renamed from: b */
    public final C4008a f14259b;

    /* renamed from: c */
    public final AspectRatioFrameLayout f14260c;

    /* renamed from: d */
    public final View f14261d;

    /* renamed from: e */
    public final View f14262e;

    /* renamed from: f */
    public final boolean f14263f;

    /* renamed from: g */
    public final ImageView f14264g;

    /* renamed from: h */
    public final SubtitleView f14265h;

    /* renamed from: i */
    public final View f14266i;

    /* renamed from: j */
    public final TextView f14267j;

    /* renamed from: k */
    public final PlayerControlView f14268k;

    /* renamed from: l */
    public final FrameLayout f14269l;

    /* renamed from: m */
    public final FrameLayout f14270m;

    /* renamed from: n */
    public C4936u0 f14271n;

    /* renamed from: o */
    public boolean f14272o;

    /* renamed from: p */
    public PlayerControlView.C4007c f14273p;

    /* renamed from: q */
    public boolean f14274q;

    /* renamed from: r */
    public Drawable f14275r;

    /* renamed from: s */
    public int f14276s;

    /* renamed from: t */
    public boolean f14277t;

    /* renamed from: u */
    public CharSequence f14278u;

    /* renamed from: v */
    public int f14279v;

    /* renamed from: w */
    public boolean f14280w;

    /* renamed from: x */
    public boolean f14281x;

    /* renamed from: y */
    public boolean f14282y;

    /* renamed from: z */
    public int f14283z;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$a */
    public final class C4008a implements C4936u0.C4940d, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.C4007c {

        /* renamed from: b */
        public final C4879e1.C4881b f14284b = new C4879e1.C4881b();

        /* renamed from: c */
        public Object f14285c;

        public C4008a() {
        }

        /* renamed from: B */
        public final void mo16508B(List<C5332a> list) {
            SubtitleView subtitleView = PlayerView.this.f14265h;
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
            PlayerView playerView = PlayerView.this;
            int i2 = PlayerView.f14257B;
            playerView.mo16472i();
            PlayerView playerView2 = PlayerView.this;
            if (!playerView2.mo16452c() || !playerView2.f14281x) {
                playerView2.mo16453d(false);
                return;
            }
            PlayerControlView playerControlView = playerView2.f14268k;
            if (playerControlView != null) {
                playerControlView.mo16386c();
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
            C4936u0 u0Var = PlayerView.this.f14271n;
            u0Var.getClass();
            C4879e1 s = u0Var.mo20400s();
            if (s.mo20464p()) {
                this.f14285c = null;
            } else {
                if (u0Var.mo20399r().f14012b == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f14285c = s.mo20345f(u0Var.mo20359B(), this.f14284b, true).f16416b;
                } else {
                    Object obj = this.f14285c;
                    if (obj != null) {
                        int b = s.mo20342b(obj);
                        if (b == -1 || u0Var.mo20393k() != s.mo20345f(b, this.f14284b, false).f16417c) {
                            this.f14285c = null;
                        } else {
                            return;
                        }
                    }
                }
            }
            PlayerView.this.mo16475l(false);
        }

        /* renamed from: S */
        public final void mo16428S(int i, C4936u0.C4941e eVar, C4936u0.C4941e eVar2) {
            PlayerControlView playerControlView;
            PlayerView playerView = PlayerView.this;
            int i2 = PlayerView.f14257B;
            if (playerView.mo16452c()) {
                PlayerView playerView2 = PlayerView.this;
                if (playerView2.f14281x && (playerControlView = playerView2.f14268k) != null) {
                    playerControlView.mo16386c();
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
        public final void mo16450a() {
            PlayerView playerView = PlayerView.this;
            int i = PlayerView.f14257B;
            playerView.mo16473j();
        }

        /* renamed from: b */
        public final /* synthetic */ void mo16433b() {
        }

        /* renamed from: b0 */
        public final /* synthetic */ void mo16434b0(C4932s0 s0Var) {
        }

        /* renamed from: c */
        public final void mo16513c() {
            View view = PlayerView.this.f14261d;
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
            PlayerView playerView = PlayerView.this;
            int i = PlayerView.f14257B;
            playerView.mo16471h();
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m10750a((TextureView) view, PlayerView.this.f14283z);
        }

        public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
            float f2;
            if (i2 == 0 || i == 0) {
                f2 = 1.0f;
            } else {
                f2 = (((float) i) * f) / ((float) i2);
            }
            PlayerView playerView = PlayerView.this;
            View view = playerView.f14262e;
            if (view instanceof TextureView) {
                if (i3 == 90 || i3 == 270) {
                    f2 = 1.0f / f2;
                }
                if (playerView.f14283z != 0) {
                    view.removeOnLayoutChangeListener(this);
                }
                PlayerView playerView2 = PlayerView.this;
                playerView2.f14283z = i3;
                if (i3 != 0) {
                    playerView2.f14262e.addOnLayoutChangeListener(this);
                }
                PlayerView playerView3 = PlayerView.this;
                PlayerView.m10750a((TextureView) playerView3.f14262e, playerView3.f14283z);
            }
            PlayerView playerView4 = PlayerView.this;
            AspectRatioFrameLayout aspectRatioFrameLayout = playerView4.f14260c;
            if (playerView4.f14263f) {
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
            PlayerView playerView = PlayerView.this;
            int i2 = PlayerView.f14257B;
            playerView.mo16472i();
            PlayerView.this.mo16474k();
            PlayerView playerView2 = PlayerView.this;
            if (!playerView2.mo16452c() || !playerView2.f14281x) {
                playerView2.mo16453d(false);
                return;
            }
            PlayerControlView playerControlView = playerView2.f14268k;
            if (playerControlView != null) {
                playerControlView.mo16386c();
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

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m10750a(TextureView textureView, int i) {
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
    public final void mo16451b() {
        ImageView imageView = this.f14264g;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f14264g.setVisibility(4);
        }
    }

    /* renamed from: c */
    public final boolean mo16452c() {
        C4936u0 u0Var = this.f14271n;
        return u0Var != null && u0Var.mo20385d() && this.f14271n.mo20407z();
    }

    /* renamed from: d */
    public final void mo16453d(boolean z) {
        boolean z2;
        if ((!mo16452c() || !this.f14281x) && mo16476m()) {
            if (!this.f14268k.mo16390e() || this.f14268k.getShowTimeoutMs() > 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean f = mo16456f();
            if (z || z2 || f) {
                mo16457g(f);
            }
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        C4936u0 u0Var = this.f14271n;
        if (u0Var != null && u0Var.mo20385d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !mo16476m() || this.f14268k.mo16390e()) {
            if (!mo16476m() || !this.f14268k.mo16384a(keyEvent)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 || super.dispatchKeyEvent(keyEvent)) {
                mo16453d(true);
            } else if (!z || !mo16476m()) {
                return false;
            } else {
                mo16453d(true);
                return false;
            }
        } else {
            mo16453d(true);
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo16455e(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f14260c;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                this.f14264g.setImageDrawable(drawable);
                this.f14264g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo16456f() {
        C4936u0 u0Var = this.f14271n;
        if (u0Var == null) {
            return true;
        }
        int H = u0Var.mo20364H();
        if (!this.f14280w || (H != 1 && H != 4 && this.f14271n.mo20407z())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void mo16457g(boolean z) {
        int i;
        View view;
        View view2;
        if (mo16476m()) {
            PlayerControlView playerControlView = this.f14268k;
            if (z) {
                i = 0;
            } else {
                i = this.f14279v;
            }
            playerControlView.setShowTimeoutMs(i);
            PlayerControlView playerControlView2 = this.f14268k;
            if (!playerControlView2.mo16390e()) {
                playerControlView2.setVisibility(0);
                Iterator<PlayerControlView.C4007c> it = playerControlView2.f14226c.iterator();
                while (it.hasNext()) {
                    playerControlView2.getVisibility();
                    it.next().mo16450a();
                }
                playerControlView2.mo16399i();
                playerControlView2.mo16398h();
                playerControlView2.mo16401k();
                playerControlView2.mo16402l();
                playerControlView2.mo16403m();
                boolean f = playerControlView2.mo16391f();
                if (!f && (view2 = playerControlView2.f14229f) != null) {
                    view2.requestFocus();
                } else if (f && (view = playerControlView2.f14230g) != null) {
                    view.requestFocus();
                }
            }
            playerControlView2.mo16387d();
        }
    }

    public List<C5980f> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f14270m;
        if (frameLayout != null) {
            arrayList.add(new C5980f(3, frameLayout, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f14268k;
        if (playerControlView != null) {
            arrayList.add(new C5980f(0, playerControlView, (String) null));
        }
        return ImmutableList.m35691z(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f14269l;
        C17875h.m44307r(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.f14280w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f14282y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f14279v;
    }

    public Drawable getDefaultArtwork() {
        return this.f14275r;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f14270m;
    }

    public C4936u0 getPlayer() {
        return this.f14271n;
    }

    public int getResizeMode() {
        C17875h.m44306q(this.f14260c);
        return this.f14260c.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f14265h;
    }

    public boolean getUseArtwork() {
        return this.f14274q;
    }

    public boolean getUseController() {
        return this.f14272o;
    }

    public View getVideoSurfaceView() {
        return this.f14262e;
    }

    /* renamed from: h */
    public final boolean mo16471h() {
        if (!mo16476m() || this.f14271n == null) {
            return false;
        }
        if (!this.f14268k.mo16390e()) {
            mo16453d(true);
        } else if (this.f14282y) {
            this.f14268k.mo16386c();
        }
        return true;
    }

    /* renamed from: i */
    public final void mo16472i() {
        int i;
        if (this.f14266i != null) {
            C4936u0 u0Var = this.f14271n;
            boolean z = true;
            int i2 = 0;
            if (u0Var == null || u0Var.mo20364H() != 2 || ((i = this.f14276s) != 2 && (i != 1 || !this.f14271n.mo20407z()))) {
                z = false;
            }
            View view = this.f14266i;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    /* renamed from: j */
    public final void mo16473j() {
        PlayerControlView playerControlView = this.f14268k;
        String str = null;
        if (playerControlView == null || !this.f14272o) {
            setContentDescription((CharSequence) null);
        } else if (playerControlView.getVisibility() == 0) {
            if (this.f14282y) {
                str = getResources().getString(C4044m.exo_controls_hide);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(C4044m.exo_controls_show));
        }
    }

    /* renamed from: k */
    public final void mo16474k() {
        TextView textView = this.f14267j;
        if (textView != null) {
            CharSequence charSequence = this.f14278u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f14267j.setVisibility(0);
                return;
            }
            C4936u0 u0Var = this.f14271n;
            if (u0Var != null) {
                ExoPlaybackException l = u0Var.mo20394l();
            }
            this.f14267j.setVisibility(8);
        }
    }

    /* renamed from: l */
    public final void mo16475l(boolean z) {
        boolean z2;
        byte[] bArr;
        int i;
        View view;
        C4936u0 u0Var = this.f14271n;
        if (u0Var != null) {
            boolean z3 = true;
            if (u0Var.mo20399r().f14012b == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (z && !this.f14277t && (view = this.f14261d) != null) {
                    view.setVisibility(0);
                }
                if (C4002d.m10699a(u0Var.mo20403v())) {
                    mo16451b();
                    return;
                }
                View view2 = this.f14261d;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                if (this.f14274q) {
                    C17875h.m44306q(this.f14264g);
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
                                z4 = mo16455e(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
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
                    if (mo16455e(this.f14275r)) {
                        return;
                    }
                }
                mo16451b();
                return;
            }
        }
        if (!this.f14277t) {
            mo16451b();
            View view3 = this.f14261d;
            if (view3 != null) {
                view3.setVisibility(0);
            }
        }
    }

    /* renamed from: m */
    public final boolean mo16476m() {
        if (!this.f14272o) {
            return false;
        }
        C17875h.m44306q(this.f14268k);
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo16476m() || this.f14271n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f14258A = true;
            return true;
        } else if (action != 1 || !this.f14258A) {
            return false;
        } else {
            this.f14258A = false;
            performClick();
            return true;
        }
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!mo16476m() || this.f14271n == null) {
            return false;
        }
        mo16453d(true);
        return true;
    }

    public final boolean performClick() {
        super.performClick();
        return mo16471h();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.C4003a aVar) {
        C17875h.m44306q(this.f14260c);
        this.f14260c.setAspectRatioListener(aVar);
    }

    public void setControlDispatcher(C4886g gVar) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setControlDispatcher(gVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.f14280w = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f14281x = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C17875h.m44306q(this.f14268k);
        this.f14282y = z;
        mo16473j();
    }

    public void setControllerShowTimeoutMs(int i) {
        C17875h.m44306q(this.f14268k);
        this.f14279v = i;
        if (this.f14268k.mo16390e()) {
            mo16457g(mo16456f());
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.C4007c cVar) {
        C17875h.m44306q(this.f14268k);
        PlayerControlView.C4007c cVar2 = this.f14273p;
        if (cVar2 != cVar) {
            if (cVar2 != null) {
                this.f14268k.f14226c.remove(cVar2);
            }
            this.f14273p = cVar;
            if (cVar != null) {
                PlayerControlView playerControlView = this.f14268k;
                playerControlView.getClass();
                playerControlView.f14226c.add(cVar);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z;
        if (this.f14267j != null) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        this.f14278u = charSequence;
        mo16474k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f14275r != drawable) {
            this.f14275r = drawable;
            mo16475l(false);
        }
    }

    public void setErrorMessageProvider(C6779e<? super ExoPlaybackException> eVar) {
        if (eVar != null) {
            mo16474k();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setFastForwardIncrementMs(i);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f14277t != z) {
            this.f14277t = z;
            mo16475l(false);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(C4934t0 t0Var) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setPlaybackPreparer(t0Var);
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
        C4936u0 u0Var2 = this.f14271n;
        if (u0Var2 != u0Var) {
            if (u0Var2 != null) {
                u0Var2.mo20406y(this.f14259b);
                if (u0Var2.mo20454p(21)) {
                    View view = this.f14262e;
                    if (view instanceof TextureView) {
                        u0Var2.mo20360C((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        u0Var2.mo20367L((SurfaceView) view);
                    }
                }
            }
            SubtitleView subtitleView = this.f14265h;
            if (subtitleView != null) {
                subtitleView.setCues((List<C5332a>) null);
            }
            this.f14271n = u0Var;
            if (mo16476m()) {
                this.f14268k.setPlayer(u0Var);
            }
            mo16472i();
            mo16474k();
            mo16475l(true);
            if (u0Var != null) {
                if (u0Var.mo20454p(21)) {
                    View view2 = this.f14262e;
                    if (view2 instanceof TextureView) {
                        u0Var.mo20402u((TextureView) view2);
                    } else if (view2 instanceof SurfaceView) {
                        u0Var.mo20392j((SurfaceView) view2);
                    }
                }
                if (this.f14265h != null && u0Var.mo20454p(22)) {
                    this.f14265h.setCues(u0Var.mo20396n());
                }
                u0Var.mo20363G(this.f14259b);
                mo16453d(false);
                return;
            }
            PlayerControlView playerControlView = this.f14268k;
            if (playerControlView != null) {
                playerControlView.mo16386c();
            }
        }
    }

    public void setRepeatToggleModes(int i) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        C17875h.m44306q(this.f14260c);
        this.f14260c.setResizeMode(i);
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setRewindIncrementMs(i);
    }

    public void setShowBuffering(int i) {
        if (this.f14276s != i) {
            this.f14276s = i;
            mo16472i();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C17875h.m44306q(this.f14268k);
        this.f14268k.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f14261d;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        boolean z2;
        if (!z || this.f14264g != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17875h.m44304o(z2);
        if (this.f14274q != z) {
            this.f14274q = z;
            mo16475l(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z2;
        if (!z || this.f14268k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17875h.m44304o(z2);
        if (this.f14272o != z) {
            this.f14272o = z;
            if (mo16476m()) {
                this.f14268k.setPlayer(this.f14271n);
            } else {
                PlayerControlView playerControlView = this.f14268k;
                if (playerControlView != null) {
                    playerControlView.mo16386c();
                    this.f14268k.setPlayer((C4936u0) null);
                }
            }
            mo16473j();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f14262e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
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
        C4008a aVar = new C4008a();
        this.f14259b = aVar;
        if (isInEditMode()) {
            this.f14260c = null;
            this.f14261d = null;
            this.f14262e = null;
            this.f14263f = false;
            this.f14264g = null;
            this.f14265h = null;
            this.f14266i = null;
            this.f14267j = null;
            this.f14268k = null;
            this.f14269l = null;
            this.f14270m = null;
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
        int i8 = C4042k.exo_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C4046o.PlayerView, 0, 0);
            try {
                int i9 = C4046o.PlayerView_shutter_background_color;
                boolean hasValue = obtainStyledAttributes.hasValue(i9);
                int color = obtainStyledAttributes.getColor(i9, 0);
                int resourceId = obtainStyledAttributes.getResourceId(C4046o.PlayerView_player_layout_id, i8);
                boolean z9 = obtainStyledAttributes.getBoolean(C4046o.PlayerView_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(C4046o.PlayerView_default_artwork, 0);
                boolean z11 = obtainStyledAttributes.getBoolean(C4046o.PlayerView_use_controller, true);
                int i11 = obtainStyledAttributes.getInt(C4046o.PlayerView_surface_type, 1);
                int i12 = obtainStyledAttributes.getInt(C4046o.PlayerView_resize_mode, 0);
                int i13 = obtainStyledAttributes.getInt(C4046o.PlayerView_show_timeout, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
                boolean z12 = obtainStyledAttributes.getBoolean(C4046o.PlayerView_hide_on_touch, true);
                int i14 = resourceId;
                boolean z13 = obtainStyledAttributes.getBoolean(C4046o.PlayerView_auto_show, true);
                i6 = obtainStyledAttributes.getInteger(C4046o.PlayerView_show_buffering, 0);
                int i15 = i12;
                this.f14277t = obtainStyledAttributes.getBoolean(C4046o.PlayerView_keep_content_on_player_reset, this.f14277t);
                boolean z14 = obtainStyledAttributes.getBoolean(C4046o.PlayerView_hide_during_ads, true);
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
        this.f14260c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i5);
        }
        View findViewById = findViewById(C4040i.exo_shutter);
        this.f14261d = findViewById;
        if (findViewById != null && z3) {
            findViewById.setBackgroundColor(i4);
        }
        if (aspectRatioFrameLayout == null || i7 == 0) {
            this.f14262e = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 == 2) {
                this.f14262e = new TextureView(context2);
            } else if (i7 == 3) {
                this.f14262e = new SphericalGLSurfaceView(context2, (AttributeSet) null);
                z8 = true;
                this.f14262e.setLayoutParams(layoutParams);
                this.f14262e.setOnClickListener(aVar);
                this.f14262e.setClickable(false);
                aspectRatioFrameLayout.addView(this.f14262e, 0);
                z7 = z8;
            } else if (i7 != 4) {
                this.f14262e = new SurfaceView(context2);
            } else {
                this.f14262e = new VideoDecoderGLSurfaceView(context2, (AttributeSet) null);
            }
            z8 = false;
            this.f14262e.setLayoutParams(layoutParams);
            this.f14262e.setOnClickListener(aVar);
            this.f14262e.setClickable(false);
            aspectRatioFrameLayout.addView(this.f14262e, 0);
            z7 = z8;
        }
        this.f14263f = z7;
        this.f14269l = (FrameLayout) findViewById(C4040i.exo_ad_overlay);
        this.f14270m = (FrameLayout) findViewById(C4040i.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(C4040i.exo_artwork);
        this.f14264g = imageView2;
        this.f14274q = z2 && imageView2 != null;
        if (i3 != 0) {
            this.f14275r = C4732a.getDrawable(getContext(), i3);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C4040i.exo_subtitles);
        this.f14265h = subtitleView;
        if (subtitleView != null) {
            subtitleView.mo16636a();
            subtitleView.mo16637b();
        }
        View findViewById2 = findViewById(C4040i.exo_buffering);
        this.f14266i = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f14276s = i6;
        TextView textView = (TextView) findViewById(C4040i.exo_error_message);
        this.f14267j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i17 = C4040i.exo_controller;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i17);
        View findViewById3 = findViewById(C4040i.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f14268k = playerControlView;
        } else if (findViewById3 != null) {
            PlayerControlView playerControlView2 = new PlayerControlView(context2, (AttributeSet) null, 0, attributeSet2);
            this.f14268k = playerControlView2;
            playerControlView2.setId(i17);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            this.f14268k = null;
        }
        PlayerControlView playerControlView3 = this.f14268k;
        this.f14279v = playerControlView3 != null ? i2 : 0;
        this.f14282y = z4;
        this.f14280w = z6;
        this.f14281x = z5;
        this.f14272o = z && playerControlView3 != null;
        if (playerControlView3 != null) {
            playerControlView3.mo16386c();
        }
        mo16473j();
        PlayerControlView playerControlView4 = this.f14268k;
        if (playerControlView4 != null) {
            playerControlView4.f14226c.add(aVar);
        }
    }
}
