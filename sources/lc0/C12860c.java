package lc0;

import ac0.C7557a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ce0.C21100e;
import com.cubic.umo.p045ad.playback.p046ui.views.AKWebView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import ec0.C12632a;
import fc0.C12675e;
import gc0.C12724b;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;
import p988j$.util.Spliterator;
import uh0.C25081h;

@SuppressLint({"ViewConstructor"})
/* renamed from: lc0.c */
public final class C12860c extends AKWebView {

    /* renamed from: i */
    public static final /* synthetic */ int f31801i = 0;

    /* renamed from: d */
    public C12864d f31802d;

    /* renamed from: e */
    public boolean f31803e;

    /* renamed from: f */
    public final String f31804f = "UMOAKVPaidWebView";

    /* renamed from: g */
    public String f31805g;

    /* renamed from: h */
    public final String f31806h;

    /* renamed from: lc0.c$a */
    public static final class C12861a extends C12632a {
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str;
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("AKVPaidWebChromeClient: Console Message: [");
            if (consoleMessage == null) {
                str = null;
            } else {
                str = consoleMessage.message();
            }
            J0.append(str);
            J0.append(']');
            logger.mo6672i(J0.toString());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* renamed from: lc0.c$c */
    public static final class C12863c implements View.OnTouchListener {
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

    /* renamed from: lc0.c$d */
    public interface C12864d {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12860c(Context context, String str) {
        super(context);
        String str2;
        C24362h.m61211f(str, "spotId");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        this.f31806h = str2;
        setWebViewClient(new C12862b(this));
        setWebChromeClient(new C12861a());
        mo11147b();
        setOnTouchListener(new C12863c());
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

    public final C12864d getHandler() {
        return this.f31802d;
    }

    public final void setHandler(C12864d dVar) {
        this.f31802d = dVar;
    }

    public final void setLoaded(boolean z) {
        this.f31803e = z;
    }

    /* renamed from: lc0.c$b */
    public class C12862b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ C12860c f31807a;

        public C12862b(C12860c cVar) {
            InputStream inputStream;
            C24362h.m61211f(cVar, "this$0");
            this.f31807a = cVar;
            if (cVar.f31805g == null) {
                ClassLoader classLoader = C12675e.class.getClassLoader();
                if (classLoader == null) {
                    inputStream = null;
                } else {
                    inputStream = classLoader.getResourceAsStream("AKVPaidController_2_0.js");
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
                    this.f31807a.f31805g = sb2;
                }
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f31807a.setLoaded(true);
            C12864d handler = this.f31807a.getHandler();
            if (handler != null) {
                if (webView != null) {
                    C12860c cVar = (C12860c) webView;
                    C12724b bVar = ((C12724b.C12725a) handler).f31447a;
                    C12856a aVar = bVar.f31442s;
                    if (aVar != null && aVar.f31787b == cVar) {
                        bVar.mo39522b(aVar);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.cubic.umo.ad.playback.vpaid.AKVPaidWebView");
                }
            }
            if (webView != null) {
                webView.setFocusableInTouchMode(true);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f31807a.setLoaded(false);
            if (this.f31807a.getHandler() != null) {
                if (webView != null) {
                    C12860c cVar = (C12860c) webView;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.cubic.umo.ad.playback.vpaid.AKVPaidWebView");
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C12864d handler;
            C24362h.m61211f(webView, Promotion.ACTION_VIEW);
            super.onReceivedError(webView, i, str, str2);
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("AKVPaidWebChromeClient");
            J0.append(this.f31807a.f31806h);
            J0.append(": onReceivedError() - 1");
            logger.mo6667d(J0.toString());
            C12860c cVar = this.f31807a;
            if (!cVar.f31803e && (handler = cVar.getHandler()) != null) {
                C12860c cVar2 = (C12860c) webView;
                ((C12724b.C12725a) handler).f31447a.mo39527g();
            }
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("AKVPaidWebChromeClient");
            J0.append(this.f31807a.f31806h);
            J0.append(": onReceivedHttpError()");
            logger.mo6667d(J0.toString());
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("AKVPaidWebChromeClient");
            J0.append(this.f31807a.f31806h);
            J0.append(": onReceivedSslError()");
            logger.mo6667d(J0.toString());
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("AKVPaidWebChromeClient");
            J0.append(this.f31807a.f31806h);
            J0.append(": onRenderProcessGone()");
            logger.mo6667d(J0.toString());
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C24362h.m61211f(webView, Promotion.ACTION_VIEW);
            C24362h.m61211f(str, "url");
            if (this.f31807a.getHandler() == null) {
                return false;
            }
            C12860c cVar = (C12860c) webView;
            String scheme = Uri.parse(str).getScheme();
            if (scheme != null) {
                Locale locale = Locale.ROOT;
                C24362h.m61210e(locale, "ROOT");
                String lowerCase = scheme.toLowerCase(locale);
                C24362h.m61210e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                C25081h.m62835F(lowerCase, "http");
            }
            C25081h.m62830A(scheme, "vpaid", true);
            return true;
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C12864d handler;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("AKVPaidWebChromeClient");
            J0.append(this.f31807a.f31806h);
            J0.append(": onReceivedError() - 2");
            logger.mo6667d(J0.toString());
            C12860c cVar = this.f31807a;
            if (!cVar.f31803e && (handler = cVar.getHandler()) != null) {
                if (webView != null) {
                    C12860c cVar2 = (C12860c) webView;
                    ((C12724b.C12725a) handler).f31447a.mo39527g();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.cubic.umo.ad.playback.vpaid.AKVPaidWebView");
            }
        }
    }
}
