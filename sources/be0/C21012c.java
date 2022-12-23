package be0;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets$Type;
import android.view.WindowInsetsController;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcessClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import be0.C21026j;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.vungle.warren.p979ui.PresenterAdOpenCallback;
import com.vungle.warren.utility.ViewUtility;
import java.util.HashMap;
import xd0.C25247e;
import zd0.C25330a;

/* renamed from: be0.c */
public final class C21012c extends RelativeLayout {

    /* renamed from: b */
    public HashMap f52772b = new HashMap();

    /* renamed from: c */
    public final Window f52773c;

    /* renamed from: d */
    public final VideoView f52774d;

    /* renamed from: e */
    public final RelativeLayout f52775e;

    /* renamed from: f */
    public WebView f52776f;

    /* renamed from: g */
    public final ProgressBar f52777g;

    /* renamed from: h */
    public final ImageView f52778h;

    /* renamed from: i */
    public final ImageView f52779i;

    /* renamed from: j */
    public final ImageView f52780j;

    /* renamed from: k */
    public final ImageView f52781k;

    /* renamed from: l */
    public C21019g f52782l;

    /* renamed from: m */
    public C21032m f52783m;

    /* renamed from: n */
    public MediaPlayer.OnPreparedListener f52784n;

    /* renamed from: o */
    public MediaPlayer.OnErrorListener f52785o;

    /* renamed from: p */
    public MediaPlayer.OnCompletionListener f52786p;

    /* renamed from: q */
    public int f52787q;

    /* renamed from: r */
    public GestureDetector f52788r;

    /* renamed from: s */
    public C21013a f52789s;

    /* renamed from: t */
    public C21014b f52790t = new C21014b();

    /* renamed from: u */
    public C21015c f52791u = new C21015c();

    /* renamed from: v */
    public C21016d f52792v = new C21016d();

    /* renamed from: be0.c$a */
    public class C21013a implements Runnable {
        public C21013a() {
        }

        public final void run() {
            C21012c.m49174a(C21012c.this);
        }
    }

    /* renamed from: be0.c$b */
    public class C21014b extends GestureDetector.SimpleOnGestureListener {
        public C21014b() {
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C21012c cVar = C21012c.this;
            cVar.f52792v.onClick(cVar.f52775e);
            return true;
        }
    }

    /* renamed from: be0.c$c */
    public class C21015c implements ViewTreeObserver.OnGlobalLayoutListener {
        public C21015c() {
        }

        public final void onGlobalLayout() {
            C21012c cVar = C21012c.this;
            cVar.getViewTreeObserver().removeOnGlobalLayoutListener(cVar.f52791u);
            C21012c.m49174a(C21012c.this);
        }
    }

    /* renamed from: be0.c$d */
    public class C21016d implements View.OnClickListener {
        public C21016d() {
        }

        public final void onClick(View view) {
            int i;
            float f;
            C21012c cVar = C21012c.this;
            C21019g gVar = cVar.f52782l;
            if (gVar != null) {
                Integer num = (Integer) cVar.f52772b.get(view);
                if (num == null) {
                    i = -1;
                } else {
                    i = num.intValue();
                }
                C21026j.C21027a aVar = (C21026j.C21027a) gVar;
                if (i == 1) {
                    C21026j.this.f52803h.mo61885d();
                } else if (i == 2) {
                    C21026j.this.f52803h.mo61915p();
                } else if (i == 3) {
                    C21026j jVar = C21026j.this;
                    MediaPlayer mediaPlayer = jVar.f52805j;
                    if (mediaPlayer != null) {
                        boolean z = true ^ jVar.f52804i;
                        jVar.f52804i = z;
                        if (mediaPlayer != null) {
                            if (z) {
                                f = BitmapDescriptorFactory.HUE_RED;
                            } else {
                                f = 1.0f;
                            }
                            try {
                                mediaPlayer.setVolume(f, f);
                            } catch (IllegalStateException unused) {
                            }
                        }
                        C21026j jVar2 = C21026j.this;
                        C25330a aVar2 = jVar2.f52803h;
                        boolean z2 = jVar2.f52804i;
                        aVar2.f63649k = z2;
                        if (z2) {
                            aVar2.mo61919t("mute", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                        } else {
                            aVar2.mo61919t("unmute", "false");
                        }
                        C21026j jVar3 = C21026j.this;
                        jVar3.f52763e.setMuted(jVar3.f52804i);
                    }
                } else if (i == 4) {
                    C25330a aVar3 = C21026j.this.f52803h;
                    aVar3.f63652n.mo53088b((String) null, "https://vungle.com/privacy/", new C25247e(aVar3.f63657s, aVar3.f63644f), (PresenterAdOpenCallback) null);
                } else if (i == 5) {
                    C21026j jVar4 = C21026j.this;
                    if (jVar4.f52806k) {
                        jVar4.f52803h.mo61915p();
                    }
                }
            }
        }
    }

    /* renamed from: be0.c$e */
    public static class C21017e extends ContextWrapper {
        public C21017e(Context context) {
            super(context);
        }

        public final Object getSystemService(String str) {
            if ("audio".equals(str)) {
                return getApplicationContext().getSystemService(str);
            }
            return super.getSystemService(str);
        }
    }

    /* renamed from: be0.c$f */
    public static class C21018f implements Runnable {

        /* renamed from: b */
        public WebView f52797b;

        public C21018f(WebView webView) {
            this.f52797b = webView;
        }

        public final void run() {
            this.f52797b.stopLoading();
            this.f52797b.setWebViewClient((WebViewClient) null);
            if (Build.VERSION.SDK_INT >= 29) {
                this.f52797b.setWebViewRenderProcessClient((WebViewRenderProcessClient) null);
            }
            this.f52797b.loadData("", (String) null, (String) null);
            this.f52797b.destroy();
        }
    }

    /* renamed from: be0.c$g */
    public interface C21019g {
    }

    static {
        Class<C21012c> cls = C21012c.class;
    }

    public C21012c(Context context, Window window) throws InstantiationException {
        super(context);
        this.f52773c = window;
        Resources resources = getResources();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        this.f52789s = new C21013a();
        VideoView videoView = new VideoView(new C21017e(context));
        this.f52774d = videoView;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        videoView.setLayoutParams(layoutParams2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f52775e = relativeLayout;
        relativeLayout.setTag("videoViewContainer");
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(videoView, layoutParams2);
        addView(relativeLayout, layoutParams);
        this.f52788r = new GestureDetector(context, this.f52790t);
        try {
            WebView webView = new WebView(context);
            this.f52776f = webView;
            webView.setLayoutParams(layoutParams);
            this.f52776f.setTag("webView");
            addView(this.f52776f, layoutParams);
            ProgressBar progressBar = new ProgressBar(context, (AttributeSet) null, 16842872);
            this.f52777g = progressBar;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
            layoutParams3.addRule(12);
            progressBar.setLayoutParams(layoutParams3);
            progressBar.setMax(100);
            progressBar.setIndeterminate(false);
            progressBar.setVisibility(4);
            addView(progressBar);
            int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
            int applyDimension2 = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
            layoutParams4.setMargins(applyDimension2, applyDimension2, applyDimension2, applyDimension2);
            ImageView imageView = new ImageView(context);
            this.f52778h = imageView;
            imageView.setImageBitmap(ViewUtility.m57277b(ViewUtility.Asset.unMute, context));
            imageView.setLayoutParams(layoutParams4);
            imageView.setVisibility(8);
            addView(imageView);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
            layoutParams5.setMargins(applyDimension2, applyDimension2, applyDimension2, applyDimension2);
            ImageView imageView2 = new ImageView(context);
            this.f52779i = imageView2;
            imageView2.setTag("closeButton");
            imageView2.setImageBitmap(ViewUtility.m57277b(ViewUtility.Asset.close, context));
            layoutParams5.addRule(11);
            imageView2.setLayoutParams(layoutParams5);
            imageView2.setVisibility(8);
            addView(imageView2);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
            layoutParams6.addRule(12);
            layoutParams6.addRule(11);
            layoutParams6.setMargins(applyDimension2, applyDimension2, applyDimension2, applyDimension2);
            ImageView imageView3 = new ImageView(context);
            this.f52780j = imageView3;
            imageView3.setTag("ctaOverlay");
            imageView3.setLayoutParams(layoutParams6);
            imageView3.setImageBitmap(ViewUtility.m57277b(ViewUtility.Asset.cta, getContext()));
            imageView3.setVisibility(8);
            addView(imageView3);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
            layoutParams7.addRule(12);
            layoutParams7.addRule(9);
            layoutParams7.setMargins(applyDimension2, applyDimension2, applyDimension2, applyDimension2);
            ImageView imageView4 = new ImageView(context);
            this.f52781k = imageView4;
            imageView4.setLayoutParams(layoutParams7);
            imageView4.setVisibility(8);
            addView(imageView4);
            mo53106b(1, imageView2);
            mo53106b(2, imageView3);
            mo53106b(3, imageView);
            mo53106b(4, imageView4);
            this.f52772b.put(relativeLayout, 5);
            relativeLayout.setOnTouchListener(new C21020d(this));
            videoView.setOnPreparedListener(new C21021e(this));
            videoView.setOnErrorListener(new C21022f(this));
            videoView.setOnCompletionListener(new C21023g(this));
            WebView webView2 = this.f52776f;
            if (webView2 != null) {
                webView2.setOnTouchListener(new C21024h(this));
            }
            WebView webView3 = this.f52776f;
            if (webView3 != null) {
                webView3.getSettings().setMediaPlaybackRequiresUserGesture(false);
                this.f52776f.setVisibility(8);
            }
            relativeLayout.setVisibility(8);
        } catch (Exception e) {
            throw new InstantiationException(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m49174a(C21012c cVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            cVar.f52773c.setDecorFitsSystemWindows(false);
            WindowInsetsController insetsController = cVar.f52773c.getInsetsController();
            if (insetsController != null) {
                insetsController.hide(WindowInsets$Type.statusBars() | WindowInsets$Type.navigationBars());
                insetsController.setSystemBarsBehavior(2);
                return;
            }
            return;
        }
        cVar.f52773c.getDecorView().setSystemUiVisibility(5894);
    }

    /* renamed from: b */
    public final void mo53106b(int i, ImageView imageView) {
        this.f52772b.put(imageView, Integer.valueOf(i));
        imageView.setOnClickListener(this.f52792v);
    }

    /* renamed from: c */
    public final void mo53107c(long j) {
        WebView webView = this.f52776f;
        if (webView != null) {
            webView.removeJavascriptInterface("Android");
            this.f52776f.setWebChromeClient((WebChromeClient) null);
            removeView(this.f52776f);
            this.f52776f.removeAllViews();
            if (j <= 0) {
                WebView webView2 = this.f52776f;
                webView2.stopLoading();
                webView2.setWebViewClient((WebViewClient) null);
                if (Build.VERSION.SDK_INT >= 29) {
                    webView2.setWebViewRenderProcessClient((WebViewRenderProcessClient) null);
                }
                webView2.loadData("", (String) null, (String) null);
                webView2.destroy();
            } else {
                new Handler(Looper.getMainLooper()).postAtTime(new C21018f(this.f52776f), SystemClock.uptimeMillis() + j);
            }
            this.f52776f = null;
        }
    }

    /* renamed from: d */
    public final void mo53108d(String str) {
        if (this.f52776f != null) {
            this.f52776f.loadUrl(str);
            this.f52776f.setVisibility(0);
            this.f52775e.setVisibility(8);
            this.f52775e.setOnClickListener((View.OnClickListener) null);
            this.f52777g.setVisibility(8);
            this.f52779i.setVisibility(8);
            this.f52778h.setVisibility(8);
            this.f52780j.setVisibility(8);
            this.f52781k.setVisibility(8);
        }
    }

    public int getCurrentVideoPosition() {
        return this.f52774d.getCurrentPosition();
    }

    public String getUrl() {
        WebView webView = this.f52776f;
        if (webView == null) {
            return null;
        }
        return webView.getUrl();
    }

    public int getVideoDuration() {
        return this.f52774d.getDuration();
    }

    public WebView getWebView() {
        return this.f52776f;
    }

    public void setCtaEnabled(boolean z) {
        this.f52780j.setVisibility(z ? 0 : 8);
    }

    public void setMuted(boolean z) {
        Bitmap b = ViewUtility.m57277b(ViewUtility.Asset.mute, getContext());
        Bitmap b2 = ViewUtility.m57277b(ViewUtility.Asset.unMute, getContext());
        ImageView imageView = this.f52778h;
        if (!z) {
            b = b2;
        }
        imageView.setImageBitmap(b);
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f52786p = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f52785o = onErrorListener;
    }

    public void setOnItemClickListener(C21019g gVar) {
        this.f52782l = gVar;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f52784n = onPreparedListener;
    }

    public void setOnViewTouchListener(C21032m mVar) {
        this.f52783m = mVar;
    }
}
