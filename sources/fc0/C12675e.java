package fc0;

import ac0.C7557a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ce0.C21100e;
import com.cubic.umo.p045ad.playback.p046ui.views.AKWebView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import ec0.C12632a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import kc0.C12844i;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;
import p988j$.util.Spliterator;
import uh0.C25081h;

@SuppressLint({"ViewConstructor"})
/* renamed from: fc0.e */
public final class C12675e extends AKWebView {

    /* renamed from: j */
    public static final /* synthetic */ int f31327j = 0;

    /* renamed from: d */
    public C12679d f31328d;

    /* renamed from: e */
    public boolean f31329e;

    /* renamed from: f */
    public final String f31330f = "UMOAKMRaidWebView";

    /* renamed from: g */
    public String f31331g;

    /* renamed from: h */
    public String f31332h;

    /* renamed from: i */
    public final String f31333i;

    /* renamed from: fc0.e$a */
    public static final class C12676a extends C12632a {
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str;
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("AKMRaidWebChromeClient: Console Message: [ ");
            if (consoleMessage == null) {
                str = null;
            } else {
                str = consoleMessage.message();
            }
            J0.append(str);
            J0.append(" ]");
            logger.mo6672i(J0.toString());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* renamed from: fc0.e$c */
    public static final class C12678c implements View.OnTouchListener {
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C24362h.m61211f(view, "v");
            C24362h.m61211f(motionEvent, "event");
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: fc0.e$d */
    public interface C12679d {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12675e(Context context, String str) {
        super(context);
        String str2;
        C24362h.m61211f(str, "spotId");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        this.f31333i = str2;
        setWebViewClient(new C12677b(this));
        setWebChromeClient(new C12676a());
        mo11147b();
        setOnTouchListener(new C12678c());
        setScrollBarStyle(0);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setDisplayZoomControls(false);
        getSettings().setCacheMode(2);
    }

    public final C12679d getHandler() {
        return this.f31328d;
    }

    public final void setHandler(C12679d dVar) {
        this.f31328d = dVar;
    }

    public final void setLoaded(boolean z) {
        this.f31329e = z;
    }

    /* renamed from: fc0.e$b */
    public final class C12677b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ C12675e f31334a;

        public C12677b(C12675e eVar) {
            InputStream inputStream;
            C24362h.m61211f(eVar, "this$0");
            this.f31334a = eVar;
            InputStream inputStream2 = null;
            if (eVar.f31331g == null) {
                ClassLoader classLoader = C12675e.class.getClassLoader();
                if (classLoader == null) {
                    inputStream = null;
                } else {
                    inputStream = classLoader.getResourceAsStream("AKMRaidController.js");
                }
                StringBuilder sb = new StringBuilder();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), Spliterator.SUBSIZED);
                    char[] cArr = new char[4096];
                    while (true) {
                        int read = bufferedReader.read(cArr);
                        if (read == -1) {
                            break;
                        }
                        sb.append(cArr, 0, read);
                    }
                } catch (IllegalArgumentException e) {
                    C7557a.f23040a.mo6667d(C24362h.m61216k(e.getLocalizedMessage(), "getDataFromInputStream(): IllegalArgumentException: "));
                } catch (NullPointerException e2) {
                    C7557a.f23040a.mo6667d(C24362h.m61216k(e2.getLocalizedMessage(), "getDataFromInputStream(): NullPointerException: "));
                } catch (UnsupportedEncodingException e3) {
                    C7557a.f23040a.mo6667d(C24362h.m61216k(e3.getLocalizedMessage(), "getDataFromInputStream(): UnsupportedEncodingException: "));
                } catch (IndexOutOfBoundsException e4) {
                    C7557a.f23040a.mo6667d(C24362h.m61216k(e4.getLocalizedMessage(), "getDataFromInputStream(): IndexOutOfBoundsException: "));
                }
                String sb2 = sb.toString();
                C24362h.m61210e(sb2, "sb.toString()");
                if (C12954d.m32800c(sb2)) {
                    this.f31334a.f31331g = sb2;
                }
            }
            ClassLoader classLoader2 = C12675e.class.getClassLoader();
            inputStream2 = classLoader2 != null ? classLoader2.getResourceAsStream("AKMRaidVPaidController.js") : inputStream2;
            StringBuilder sb3 = new StringBuilder();
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"), Spliterator.SUBSIZED);
                char[] cArr2 = new char[4096];
                while (true) {
                    int read2 = bufferedReader2.read(cArr2);
                    if (read2 == -1) {
                        break;
                    }
                    sb3.append(cArr2, 0, read2);
                }
            } catch (IllegalArgumentException e5) {
                C7557a.f23040a.mo6667d(C24362h.m61216k(e5.getLocalizedMessage(), "getDataFromInputStream(): IllegalArgumentException: "));
            } catch (NullPointerException e6) {
                C7557a.f23040a.mo6667d(C24362h.m61216k(e6.getLocalizedMessage(), "getDataFromInputStream(): NullPointerException: "));
            } catch (UnsupportedEncodingException e7) {
                C7557a.f23040a.mo6667d(C24362h.m61216k(e7.getLocalizedMessage(), "getDataFromInputStream(): UnsupportedEncodingException: "));
            } catch (IndexOutOfBoundsException e8) {
                C7557a.f23040a.mo6667d(C24362h.m61216k(e8.getLocalizedMessage(), "getDataFromInputStream(): IndexOutOfBoundsException: "));
            }
            String sb4 = sb3.toString();
            C24362h.m61210e(sb4, "sb.toString()");
            if (C12954d.m32800c(sb4)) {
                this.f31334a.f31332h = sb4;
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f31334a.setLoaded(true);
            C12679d handler = this.f31334a.getHandler();
            if (handler != null) {
                if (webView != null) {
                    C12675e eVar = (C12675e) webView;
                    C12844i iVar = ((C12844i.C12845a) handler).f31769a;
                    C12669a aVar = iVar.f31755m;
                    if (aVar != null) {
                        if (aVar.f31308b == eVar) {
                            iVar.mo39689h(aVar);
                        } else {
                            C12669a aVar2 = iVar.f31763u;
                            if (aVar2 != null && aVar2.f31308b == eVar) {
                                iVar.mo39689h(aVar2);
                            }
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.cubic.umo.ad.playback.mraid.AKMRaidWebView");
                }
            }
            if (webView != null) {
                webView.setFocusableInTouchMode(true);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f31334a.setLoaded(false);
            if (this.f31334a.getHandler() != null) {
                if (webView != null) {
                    C12675e eVar = (C12675e) webView;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.cubic.umo.ad.playback.mraid.AKMRaidWebView");
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C24362h.m61211f(webView, Promotion.ACTION_VIEW);
            super.onReceivedError(webView, i, str, str2);
            C12679d handler = this.f31334a.getHandler();
            if (handler != null) {
                C12675e eVar = (C12675e) webView;
                C7557a.f23040a.mo6667d(C24362h.m61216k(Integer.valueOf(i), "MRAID Error: webViewReceivedError: "));
                ((C12844i.C12845a) handler).f31769a.mo39693m();
            }
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C24362h.m61211f(webView, Promotion.ACTION_VIEW);
            C24362h.m61211f(str, "url");
            C12679d handler = this.f31334a.getHandler();
            boolean z = false;
            if (handler == null) {
                return false;
            }
            C12675e eVar = (C12675e) webView;
            C12844i.C12845a aVar = (C12844i.C12845a) handler;
            if (C12954d.m32800c(str)) {
                if (C12954d.m32800c(str) && (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str))) {
                    z = true;
                }
                aVar.f31769a.mo39682f(str, !z, C25081h.m62830A(Uri.parse(str).getScheme(), "mraid", true));
            }
            return true;
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            C12679d handler = this.f31334a.getHandler();
            if (handler != null) {
                if (webView != null) {
                    C12675e eVar = (C12675e) webView;
                    C12844i.C12845a aVar = (C12844i.C12845a) handler;
                    Object obj = null;
                    if (Build.VERSION.SDK_INT >= 23) {
                        Logger logger = C7557a.f23040a;
                        if (webResourceError != null) {
                            obj = webResourceError.getDescription();
                        }
                        logger.mo6667d(C24362h.m61216k(obj, "MRAID Error: webViewReceivedError: "));
                    } else {
                        Logger logger2 = C7557a.f23040a;
                        if (webResourceError != null) {
                            obj = webResourceError.toString();
                        }
                        logger2.mo6667d(C24362h.m61216k(obj, "MRAID Error: webViewReceivedError: "));
                    }
                    aVar.f31769a.mo39693m();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.cubic.umo.ad.playback.mraid.AKMRaidWebView");
            }
        }
    }
}
