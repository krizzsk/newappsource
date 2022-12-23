package com.fyber.inneractive.sdk.player.p050ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C2649j;
import com.fyber.inneractive.sdk.p051ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.player.controller.C3009k;
import com.fyber.inneractive.sdk.util.C3670b;
import com.fyber.inneractive.sdk.util.C3674c;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.C3724q0;
import com.fyber.inneractive.sdk.util.C3741w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.player.ui.i */
public abstract class C3457i extends C3451c {

    /* renamed from: K */
    public static final C3721p0 f12324K;

    /* renamed from: A */
    public C3724q0 f12325A;

    /* renamed from: B */
    public C3724q0 f12326B;

    /* renamed from: C */
    public int f12327C;

    /* renamed from: D */
    public int f12328D;

    /* renamed from: E */
    public Runnable f12329E;

    /* renamed from: F */
    public C3741w0 f12330F;

    /* renamed from: G */
    public boolean f12331G;

    /* renamed from: H */
    public ObjectAnimator f12332H;

    /* renamed from: I */
    public boolean f12333I;

    /* renamed from: J */
    public C3724q0 f12334J;

    /* renamed from: i */
    public ImageView f12335i;

    /* renamed from: j */
    public ViewGroup f12336j;

    /* renamed from: k */
    public TextView f12337k;

    /* renamed from: l */
    public Button f12338l;

    /* renamed from: m */
    public ImageView f12339m;

    /* renamed from: n */
    public TextView f12340n;

    /* renamed from: o */
    public TextView f12341o;

    /* renamed from: p */
    public View f12342p;

    /* renamed from: q */
    public int f12343q;

    /* renamed from: r */
    public int f12344r;

    /* renamed from: s */
    public boolean f12345s;

    /* renamed from: t */
    public ImageView f12346t;

    /* renamed from: u */
    public ImageView f12347u;

    /* renamed from: v */
    public IAsmoothProgressBar f12348v;

    /* renamed from: w */
    public View f12349w;

    /* renamed from: x */
    public View f12350x;

    /* renamed from: y */
    public ViewGroup f12351y;

    /* renamed from: z */
    public View f12352z;

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$a */
    public class C3458a implements C3741w0.C3743b {

        /* renamed from: a */
        public final /* synthetic */ int f12353a;

        public C3458a(int i) {
            this.f12353a = i;
        }

        /* renamed from: a */
        public void mo13200a(C3741w0 w0Var) {
            if (!C3457i.this.f12322h) {
                IAlog.m9902a("Autoclick is triggered", new Object[0]);
                ((C3009k) C3457i.this.f12321g).mo13883a(this.f12353a, C3457i.f12324K);
            } else {
                IAlog.m9902a("Autoclick is aborted - app in background", new Object[0]);
            }
            C3457i.this.mo14700e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$b */
    public class C3459b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f12355a;

        public C3459b(Bitmap bitmap) {
            this.f12355a = bitmap;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C3457i.this.getWidth() > 0 && C3457i.this.getHeight() > 0) {
                C3457i.this.mo14695b(true);
                C3457i.this.removeOnLayoutChangeListener(this);
                C3457i.this.mo14688a(this.f12355a);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$c */
    public class C3460c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public final /* synthetic */ View f12357a;

        /* renamed from: b */
        public final /* synthetic */ int[] f12358b;

        /* renamed from: c */
        public final /* synthetic */ int f12359c;

        public C3460c(View view, int[] iArr, int i) {
            this.f12357a = view;
            this.f12358b = iArr;
            this.f12359c = i;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f12357a.getRootView().getLocationOnScreen(this.f12358b);
                float rawX = motionEvent.getRawX() - ((float) this.f12358b[0]);
                float rawY = motionEvent.getRawY() - ((float) this.f12358b[1]);
                C3721p0 p0Var = C3457i.this.f12315a;
                p0Var.f12907a = rawX;
                p0Var.f12908b = rawY;
            }
            C3457i iVar = C3457i.this;
            C3456h hVar = iVar.f12321g;
            if (hVar != null) {
                ((C3009k) hVar).mo13883a(this.f12359c, iVar.f12315a);
            }
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$d */
    public class C3461d implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ GestureDetector f12361a;

        public C3461d(C3457i iVar, GestureDetector gestureDetector) {
            this.f12361a = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f12361a.onTouchEvent(motionEvent);
        }
    }

    static {
        C3721p0 a = C3721p0.m9979a();
        a.f12909c = true;
        f12324K = a;
    }

    public C3457i(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo14694a(boolean z, boolean z2, String str) {
        TextView textView = this.f12337k;
        if (textView != null) {
            textView.setAllCaps(z2);
            if (!TextUtils.isEmpty(str)) {
                this.f12337k.setText(str);
            } else {
                this.f12337k.setText(C2524R.string.ia_video_install_now_text);
            }
            this.f12337k.setVisibility(z ? 0 : 4);
        }
    }

    /* renamed from: b */
    public void mo14695b(boolean z) {
        if (this.f12335i != null) {
            ViewGroup viewGroup = this.f12351y;
            int i = 0;
            if (viewGroup == null || viewGroup.getVisibility() != 0) {
                ImageView imageView = this.f12335i;
                if (!z) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            }
            IAlog.m9902a("end card is visible and requested to show last frame image with value of %s", Boolean.valueOf(z));
            this.f12335i.setVisibility(8);
        }
    }

    /* renamed from: c */
    public void mo14697c(boolean z) {
        View view = this.f12349w;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: d */
    public void mo14698d(boolean z) {
        TextView textView = this.f12341o;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    public void destroy() {
        super.destroy();
        IAlog.m9902a("%sdestroyed called", IAlog.m9899a((Object) this));
        Runnable runnable = this.f12329E;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f12329E = null;
        }
        mo14700e();
        ViewGroup viewGroup = this.f12336j;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    /* renamed from: e */
    public final void mo14700e() {
        if (this.f12330F != null) {
            IAlog.m9902a("Autoclick is removed ", new Object[0]);
            this.f12330F.f12943e = null;
            this.f12330F = null;
        }
    }

    /* renamed from: f */
    public void mo14701f() {
        ImageView imageView = this.f12347u;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f12347u.setSelected(true);
        }
    }

    /* renamed from: g */
    public abstract void mo14684g();

    public View getEndCardView() {
        return this.f12342p;
    }

    public ViewGroup getTextureHost() {
        return this.f12336j;
    }

    public View[] getTrackingFriendlyView() {
        return new View[]{this.f12337k, this.f12340n, this.f12341o, this.f12346t, this.f12348v};
    }

    public int getVideoHeight() {
        return this.f12344r;
    }

    public int getVideoWidth() {
        return this.f12343q;
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mo14675a(this.f12334J, size, size2);
        C3724q0 q0Var = this.f12334J;
        int i3 = q0Var.f12915a;
        if (i3 <= 0 || q0Var.f12916b <= 0) {
            q0Var.f12915a = size;
            q0Var.f12916b = size2;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(this.f12334J.f12916b, 1073741824);
            i = makeMeasureSpec;
        }
        if (!this.f12325A.equals(this.f12334J)) {
            C3724q0 q0Var2 = this.f12325A;
            C3724q0 q0Var3 = this.f12334J;
            q0Var2.getClass();
            q0Var2.f12915a = q0Var3.f12915a;
            q0Var2.f12916b = q0Var3.f12916b;
            mo14684g();
        }
        super.onMeasure(i, i2);
    }

    public void setLastFrameBitmap(Bitmap bitmap) {
        IAlog.m9902a("%ssetLastFrameBitmap - %s", IAlog.m9899a((Object) this), bitmap);
        ImageView imageView = this.f12335i;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        C3724q0 q0Var = this.f12325A;
        if (q0Var.f12915a == 0 || q0Var.f12916b == 0) {
            mo14695b(false);
            addOnLayoutChangeListener(new C3459b(bitmap));
            return;
        }
        mo14688a(bitmap);
    }

    public void setLastFrameBitmapBlurred(Bitmap bitmap) {
        if (this.f12335i != null && bitmap != null) {
            C3674c cVar = new C3674c();
            cVar.f12831c = 20;
            cVar.f12832d = 1;
            cVar.f12829a = bitmap.getWidth();
            cVar.f12830b = bitmap.getHeight();
            this.f12335i.setImageBitmap(C3670b.m9912a(getContext(), bitmap, cVar));
        }
    }

    public void setMuteButtonState(boolean z) {
        this.f12346t.setSelected(z);
    }

    public void setRemainingTime(String str) {
        TextView textView = this.f12340n;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSkipText(String str) {
        TextView textView = this.f12341o;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public C3457i(Context context, AttributeSet attributeSet) {
        this(context, (AttributeSet) null, 0);
    }

    public C3457i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12343q = -1;
        this.f12344r = -1;
        this.f12345s = false;
        this.f12325A = new C3724q0(0, 0);
        this.f12331G = false;
        this.f12333I = false;
        this.f12334J = new C3724q0(0, 0);
        IAlog.m9902a("%sctor called", mo14674a());
        LayoutInflater.from(context).inflate(C2524R.layout.ia_video_view, this, true);
        setBackgroundColor(getResources().getColor(C2524R.color.ia_video_background_color));
        mo14696c();
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: c */
    public void mo14696c() {
        this.f12335i = (ImageView) findViewById(C2524R.C2526id.ia_iv_last_frame);
        this.f12336j = (ViewGroup) findViewById(C2524R.C2526id.ia_texture_view_host);
        this.f12346t = (ImageView) findViewById(C2524R.C2526id.ia_iv_mute_button);
        this.f12337k = (TextView) findViewById(C2524R.C2526id.ia_tv_call_to_action);
        this.f12347u = (ImageView) findViewById(C2524R.C2526id.ia_iv_expand_collapse_button);
        this.f12340n = (TextView) findViewById(C2524R.C2526id.ia_tv_remaining_time);
        this.f12348v = (IAsmoothProgressBar) findViewById(C2524R.C2526id.ia_video_progressbar);
        int i = C2524R.C2526id.ia_default_endcard_video_overlay;
        this.f12350x = findViewById(i);
        this.f12351y = (ViewGroup) findViewById(C2524R.C2526id.ia_endcard_video_overlay);
        this.f12349w = findViewById(C2524R.C2526id.ia_paused_video_overlay);
        this.f12352z = findViewById(C2524R.C2526id.ia_buffering_overlay);
        this.f12341o = (TextView) findViewById(C2524R.C2526id.ia_tv_skip);
        this.f12338l = (Button) findViewById(C2524R.C2526id.ia_b_end_card_call_to_action);
        this.f12339m = (ImageView) findViewById(C2524R.C2526id.hand_animation);
        mo14689a((View) this, 7);
        mo14689a((View) this.f12346t, 1);
        mo14689a((View) this.f12337k, 3);
        mo14689a((View) this.f12338l, 8);
        mo14689a((View) this.f12347u, 5);
        mo14689a((View) this.f12336j, 7);
        mo14689a((View) this.f12341o, 6);
        mo14689a(this.f12349w, 9);
        mo14689a(findViewById(i), -1);
    }

    /* renamed from: d */
    public boolean mo14699d() {
        return this.f12350x.getVisibility() == 0 || this.f12351y.getChildCount() > 0;
    }

    /* renamed from: a */
    public void mo14691a(C3449a aVar) {
        View view = this.f12350x;
        if (view != null) {
            boolean z = true;
            if (!aVar.f12295a) {
                view.setVisibility(8);
            } else if (!C2649j.C2652c.NONE.equals(aVar.f12303i)) {
                mo14690a(this.f12350x, aVar.f12303i, aVar.f12304j);
            } else {
                this.f12350x.setVisibility(0);
            }
            this.f12338l.setAllCaps(aVar.f12296b);
            if (!TextUtils.isEmpty(aVar.f12297c)) {
                this.f12338l.setText(aVar.f12297c);
            } else {
                this.f12338l.setText(C2524R.string.ia_video_install_now_text);
            }
            UnitDisplayType unitDisplayType = ((C2702y) this.f12317c).f9427f.f9256j;
            if (aVar.f12301g) {
                this.f12338l.setBackgroundResource(C2524R.C2525drawable.bg_green);
                this.f12339m.setVisibility(0);
                ImageView imageView = this.f12339m;
                float f = aVar.f12302h;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f})});
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.setDuration(700);
                ofPropertyValuesHolder.start();
            } else if (unitDisplayType.equals(UnitDisplayType.LANDSCAPE) || unitDisplayType.equals(UnitDisplayType.MRECT)) {
                this.f12338l.setBackgroundResource(C2524R.C2525drawable.bg_green_medium);
                this.f12338l.setTextSize(0, getResources().getDimension(C2524R.dimen.ia_video_overlay_text_large));
            } else {
                this.f12338l.setBackgroundResource(C2524R.C2525drawable.bg_green);
                this.f12338l.setTextSize(0, getResources().getDimension(C2524R.dimen.ia_video_overlay_text_large_plus));
            }
            this.f12338l.setVisibility(0);
            if (aVar.f12295a) {
                Integer num = aVar.f12298d;
                if (num == null) {
                    z = false;
                }
                if (z) {
                    mo14687a(8, num.intValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14687a(int i, int i2) {
        if (!this.f12331G && this.f12330F == null) {
            IAlog.m9902a("Start Autoclick timer - %d seconds", Integer.valueOf(i2));
            C3741w0 w0Var = new C3741w0(TimeUnit.SECONDS, (long) i2);
            this.f12330F = w0Var;
            w0Var.f12943e = new C3458a(i);
            w0Var.mo15392c();
        }
    }

    /* renamed from: a */
    public final void mo14690a(View view, C2649j.C2652c cVar, int i) {
        if (!this.f12333I && C2649j.C2652c.ZOOM_IN.equals(cVar)) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f})});
            this.f12332H = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration((long) i);
        }
    }

    /* renamed from: a */
    public final void mo14688a(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            C3724q0 q0Var = this.f12325A;
            int i = q0Var.f12915a;
            int i2 = q0Var.f12916b;
            if (width > 0 && height > 0) {
                float f = (float) width;
                float f2 = (float) height;
                float f3 = f / f2;
                if (this.f12318d == UnitDisplayType.SQUARE) {
                    i = (int) (((float) i2) * f3);
                } else {
                    if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                        Math.abs(f3 - 1.3333334f);
                    }
                    float min = Math.min(((float) i) / f, 10.0f);
                    float f4 = (float) i2;
                    float f5 = min * f2;
                    if (f4 > f5) {
                        i = (int) (min * f);
                        i2 = (int) f5;
                    } else {
                        float min2 = Math.min(f4 / f2, 10.0f);
                        i = (int) (f * min2);
                        i2 = (int) (min2 * f2);
                    }
                }
            }
            ImageView imageView = this.f12335i;
            if (imageView != null) {
                imageView.getLayoutParams().width = i;
                this.f12335i.getLayoutParams().height = i2;
            }
        }
    }

    /* renamed from: a */
    public void mo14693a(boolean z) {
        View view = this.f12352z;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo14689a(View view, int i) {
        if (view != null) {
            view.setOnTouchListener(new C3461d(this, new GestureDetector(view.getContext(), new C3460c(view, new int[2], i))));
        }
    }

    /* renamed from: a */
    public void mo14692a(C3724q0 q0Var, int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = f / f2;
            if (this.f12318d == UnitDisplayType.SQUARE) {
                i3 = (int) (((float) i4) * f3);
            } else {
                if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                    Math.abs(f3 - 1.3333334f);
                }
                float min = Math.min(((float) i3) / f, 10.0f);
                float f4 = (float) i4;
                float f5 = min * f2;
                if (f4 > f5) {
                    i3 = (int) (min * f);
                    i4 = (int) f5;
                } else {
                    float min2 = Math.min(f4 / f2, 10.0f);
                    i4 = (int) (min2 * f2);
                    i3 = (int) (f * min2);
                }
            }
        }
        q0Var.f12915a = i3;
        q0Var.f12916b = i4;
    }
}
