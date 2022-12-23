package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import cf0.C21132f;
import com.appboy.models.outgoing.TwitterUser;
import com.appsflyer.ServerParameters;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.common.C2359b;
import com.facebook.common.C2362e;
import com.facebook.common.C2363f;
import com.facebook.login.LoginTargetApp;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.usebutton.sdk.internal.events.Events;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import mf0.C24362h;
import org.json.JSONArray;
import p009a8.C0115o;
import p073e7.C4583a;
import p262t8.C6606a;

/* renamed from: com.facebook.internal.j0 */
public class C2410j0 extends Dialog {

    /* renamed from: n */
    public static final int f8659n = C2363f.com_facebook_activity_theme;

    /* renamed from: o */
    public static volatile int f8660o;

    /* renamed from: b */
    public String f8661b;

    /* renamed from: c */
    public String f8662c;

    /* renamed from: d */
    public C2413c f8663d;

    /* renamed from: e */
    public C2416f f8664e;

    /* renamed from: f */
    public ProgressDialog f8665f;

    /* renamed from: g */
    public ImageView f8666g;

    /* renamed from: h */
    public FrameLayout f8667h;

    /* renamed from: i */
    public C2414d f8668i;

    /* renamed from: j */
    public boolean f8669j;

    /* renamed from: k */
    public boolean f8670k;

    /* renamed from: l */
    public boolean f8671l;

    /* renamed from: m */
    public WindowManager.LayoutParams f8672m;

    /* renamed from: com.facebook.internal.j0$a */
    public static class C2411a {

        /* renamed from: a */
        public Context f8673a;

        /* renamed from: b */
        public String f8674b;

        /* renamed from: c */
        public C2413c f8675c;

        /* renamed from: d */
        public Bundle f8676d;

        public C2411a(FragmentActivity fragmentActivity, String str, Bundle bundle, int i) {
            str = str == null ? C2397f0.m6323q(fragmentActivity) : str;
            C2400g0.m6341f(str, "applicationId");
            this.f8674b = str;
            this.f8673a = fragmentActivity;
            this.f8676d = bundle;
        }
    }

    /* renamed from: com.facebook.internal.j0$b */
    public final class C2412b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ C2410j0 f8677a;

        public C2412b(C2410j0 j0Var) {
            C24362h.m61211f(j0Var, "this$0");
            this.f8677a = j0Var;
        }

        public final void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog;
            C24362h.m61211f(webView, Promotion.ACTION_VIEW);
            C24362h.m61211f(str, "url");
            super.onPageFinished(webView, str);
            C2410j0 j0Var = this.f8677a;
            if (!j0Var.f8670k && (progressDialog = j0Var.f8665f) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f8677a.f8667h;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            C2416f fVar = this.f8677a.f8664e;
            if (fVar != null) {
                fVar.setVisibility(0);
            }
            ImageView imageView = this.f8677a.f8666g;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f8677a.f8671l = true;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog progressDialog;
            C24362h.m61211f(webView, Promotion.ACTION_VIEW);
            C24362h.m61211f(str, "url");
            C2397f0 f0Var = C2397f0.f8630a;
            C24362h.m61216k(str, "Webview loading URL: ");
            C0115o oVar = C0115o.f331a;
            super.onPageStarted(webView, str, bitmap);
            C2410j0 j0Var = this.f8677a;
            if (!j0Var.f8670k && (progressDialog = j0Var.f8665f) != null) {
                progressDialog.show();
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C24362h.m61211f(webView, Promotion.ACTION_VIEW);
            C24362h.m61211f(str, TwitterUser.DESCRIPTION_KEY);
            C24362h.m61211f(str2, "failingUrl");
            super.onReceivedError(webView, i, str, str2);
            this.f8677a.mo12569d(new FacebookDialogException(str, i, str2));
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C24362h.m61211f(webView, Promotion.ACTION_VIEW);
            C24362h.m61211f(sslErrorHandler, "handler");
            C24362h.m61211f(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.f8677a.mo12569d(new FacebookDialogException((String) null, -11, (String) null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00b4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean shouldOverrideUrlLoading(android.webkit.WebView r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r0 = "view"
                mf0.C24362h.m61211f(r7, r0)
                java.lang.String r7 = "url"
                mf0.C24362h.m61211f(r8, r7)
                com.facebook.internal.f0 r7 = com.facebook.internal.C2397f0.f8630a
                java.lang.String r7 = "Redirect URL: "
                mf0.C24362h.m61216k(r8, r7)
                a8.o r7 = p009a8.C0115o.f331a
                android.net.Uri r7 = android.net.Uri.parse(r8)
                java.lang.String r0 = r7.getPath()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x002f
                java.lang.String r7 = r7.getPath()
                java.lang.String r0 = "^/(v\\d+\\.\\d+/)??dialog/.*"
                boolean r7 = java.util.regex.Pattern.matches(r0, r7)
                if (r7 == 0) goto L_0x002f
                r7 = 1
                goto L_0x0030
            L_0x002f:
                r7 = 0
            L_0x0030:
                com.facebook.internal.j0 r0 = r6.f8677a
                java.lang.String r0 = r0.f8662c
                r3 = 0
                boolean r0 = uh0.C25081h.m62835F(r8, r0)
                if (r0 == 0) goto L_0x00ce
                com.facebook.internal.j0 r7 = r6.f8677a
                android.os.Bundle r7 = r7.mo12566b(r8)
                java.lang.String r8 = "error"
                java.lang.String r8 = r7.getString(r8)
                if (r8 != 0) goto L_0x004f
                java.lang.String r8 = "error_type"
                java.lang.String r8 = r7.getString(r8)
            L_0x004f:
                java.lang.String r0 = "error_msg"
                java.lang.String r0 = r7.getString(r0)
                if (r0 != 0) goto L_0x005d
                java.lang.String r0 = "error_message"
                java.lang.String r0 = r7.getString(r0)
            L_0x005d:
                if (r0 != 0) goto L_0x0065
                java.lang.String r0 = "error_description"
                java.lang.String r0 = r7.getString(r0)
            L_0x0065:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r7.getString(r2)
                r4 = -1
                if (r2 == 0) goto L_0x007a
                boolean r5 = com.facebook.internal.C2397f0.m6292A(r2)
                if (r5 != 0) goto L_0x007a
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0079 }
                goto L_0x007b
            L_0x0079:
            L_0x007a:
                r2 = -1
            L_0x007b:
                boolean r5 = com.facebook.internal.C2397f0.m6292A(r8)
                if (r5 == 0) goto L_0x009c
                boolean r5 = com.facebook.internal.C2397f0.m6292A(r0)
                if (r5 == 0) goto L_0x009c
                if (r2 != r4) goto L_0x009c
                com.facebook.internal.j0 r8 = r6.f8677a
                com.facebook.internal.j0$c r0 = r8.f8663d
                if (r0 == 0) goto L_0x00cd
                boolean r2 = r8.f8669j
                if (r2 != 0) goto L_0x00cd
                r8.f8669j = r1
                r0.mo12584a(r7, r3)
                r8.dismiss()
                goto L_0x00cd
            L_0x009c:
                if (r8 == 0) goto L_0x00b4
                java.lang.String r7 = "access_denied"
                boolean r7 = mf0.C24362h.m61206a(r8, r7)
                if (r7 != 0) goto L_0x00ae
                java.lang.String r7 = "OAuthAccessDeniedException"
                boolean r7 = mf0.C24362h.m61206a(r8, r7)
                if (r7 == 0) goto L_0x00b4
            L_0x00ae:
                com.facebook.internal.j0 r7 = r6.f8677a
                r7.cancel()
                goto L_0x00cd
            L_0x00b4:
                r7 = 4201(0x1069, float:5.887E-42)
                if (r2 != r7) goto L_0x00be
                com.facebook.internal.j0 r7 = r6.f8677a
                r7.cancel()
                goto L_0x00cd
            L_0x00be:
                com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
                r7.<init>(r2, r8, r0)
                com.facebook.internal.j0 r8 = r6.f8677a
                com.facebook.FacebookServiceException r2 = new com.facebook.FacebookServiceException
                r2.<init>(r7, r0)
                r8.mo12569d(r2)
            L_0x00cd:
                return r1
            L_0x00ce:
                java.lang.String r0 = "fbconnect://cancel"
                boolean r0 = uh0.C25081h.m62835F(r8, r0)
                if (r0 == 0) goto L_0x00dc
                com.facebook.internal.j0 r7 = r6.f8677a
                r7.cancel()
                return r1
            L_0x00dc:
                if (r7 != 0) goto L_0x00ff
                java.lang.String r7 = "touch"
                boolean r7 = kotlin.text.C24179b.m60559G(r8, r7, r2)
                if (r7 == 0) goto L_0x00e8
                goto L_0x00ff
            L_0x00e8:
                com.facebook.internal.j0 r7 = r6.f8677a     // Catch:{ ActivityNotFoundException -> 0x00fd }
                android.content.Context r7 = r7.getContext()     // Catch:{ ActivityNotFoundException -> 0x00fd }
                android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00fd }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ ActivityNotFoundException -> 0x00fd }
                r0.<init>(r3, r8)     // Catch:{ ActivityNotFoundException -> 0x00fd }
                r7.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00fd }
                goto L_0x00fe
            L_0x00fd:
                r1 = 0
            L_0x00fe:
                return r1
            L_0x00ff:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2410j0.C2412b.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* renamed from: com.facebook.internal.j0$c */
    public interface C2413c {
        /* renamed from: a */
        void mo12584a(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: com.facebook.internal.j0$d */
    public final class C2414d extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        public final String f8678a;

        /* renamed from: b */
        public final Bundle f8679b;

        /* renamed from: c */
        public Exception[] f8680c = new Exception[0];

        /* renamed from: d */
        public final /* synthetic */ C2410j0 f8681d;

        public C2414d(C2410j0 j0Var, String str, Bundle bundle) {
            C24362h.m61211f(j0Var, "this$0");
            C24362h.m61211f(str, Events.PROPERTY_ACTION);
            this.f8681d = j0Var;
            this.f8678a = str;
            this.f8679b = bundle;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:35|36|(2:39|37)|50|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            r12 = r3.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009b, code lost:
            if (r12.hasNext() != false) goto L_0x009d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
            ((p009a8.C0120s) r12.next()).cancel(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0093 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String[] mo12585a(java.lang.Void... r12) {
            /*
                r11 = this;
                boolean r0 = p262t8.C6606a.m15601b(r11)
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                boolean r0 = p262t8.C6606a.m15601b(r11)     // Catch:{ all -> 0x00ac }
                if (r0 == 0) goto L_0x000f
                return r1
            L_0x000f:
                java.lang.String r0 = "p0"
                mf0.C24362h.m61211f(r12, r0)     // Catch:{ all -> 0x008d }
                android.os.Bundle r12 = r11.f8679b     // Catch:{ all -> 0x008d }
                java.lang.String r0 = "media"
                java.lang.String[] r12 = r12.getStringArray(r0)     // Catch:{ all -> 0x008d }
                if (r12 != 0) goto L_0x001f
                return r1
            L_0x001f:
                int r0 = r12.length     // Catch:{ all -> 0x008d }
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x008d }
                int r2 = r12.length     // Catch:{ all -> 0x008d }
                java.lang.Exception[] r2 = new java.lang.Exception[r2]     // Catch:{ all -> 0x008d }
                r11.f8680c = r2     // Catch:{ all -> 0x008d }
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x008d }
                int r3 = r12.length     // Catch:{ all -> 0x008d }
                r2.<init>(r3)     // Catch:{ all -> 0x008d }
                java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x008d }
                r3.<init>()     // Catch:{ all -> 0x008d }
                java.util.Date r4 = com.facebook.AccessToken.f8348m     // Catch:{ all -> 0x008d }
                com.facebook.AccessToken r4 = com.facebook.AccessToken.C2266c.m6110b()     // Catch:{ all -> 0x008d }
                r5 = 0
                r6 = 1
                int r7 = r12.length     // Catch:{ Exception -> 0x0093 }
                int r7 = r7 + -1
                if (r7 < 0) goto L_0x008f
            L_0x003f:
                int r8 = r5 + 1
                boolean r9 = r11.isCancelled()     // Catch:{ Exception -> 0x0093 }
                if (r9 == 0) goto L_0x005c
                java.util.Iterator r12 = r3.iterator()     // Catch:{ Exception -> 0x0093 }
            L_0x004b:
                boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x0093 }
                if (r0 == 0) goto L_0x005b
                java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x0093 }
                a8.s r0 = (p009a8.C0120s) r0     // Catch:{ Exception -> 0x0093 }
                r0.cancel(r6)     // Catch:{ Exception -> 0x0093 }
                goto L_0x004b
            L_0x005b:
                return r1
            L_0x005c:
                r9 = r12[r5]     // Catch:{ Exception -> 0x0093 }
                android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x0093 }
                boolean r10 = com.facebook.internal.C2397f0.m6293B(r9)     // Catch:{ Exception -> 0x0093 }
                if (r10 == 0) goto L_0x0072
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0093 }
                r0[r5] = r9     // Catch:{ Exception -> 0x0093 }
                r2.countDown()     // Catch:{ Exception -> 0x0093 }
                goto L_0x0088
            L_0x0072:
                com.facebook.internal.k0 r10 = new com.facebook.internal.k0     // Catch:{ Exception -> 0x0093 }
                r10.<init>(r0, r5, r11, r2)     // Catch:{ Exception -> 0x0093 }
                java.lang.String r5 = "uri"
                mf0.C24362h.m61210e(r9, r5)     // Catch:{ Exception -> 0x0093 }
                com.facebook.GraphRequest r5 = p336z8.C7505e.m17225d(r4, r9, r10)     // Catch:{ Exception -> 0x0093 }
                a8.s r5 = r5.mo11904d()     // Catch:{ Exception -> 0x0093 }
                r3.add(r5)     // Catch:{ Exception -> 0x0093 }
            L_0x0088:
                if (r8 <= r7) goto L_0x008b
                goto L_0x008f
            L_0x008b:
                r5 = r8
                goto L_0x003f
            L_0x008d:
                r12 = move-exception
                goto L_0x00a8
            L_0x008f:
                r2.await()     // Catch:{ Exception -> 0x0093 }
                return r0
            L_0x0093:
                java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x008d }
            L_0x0097:
                boolean r0 = r12.hasNext()     // Catch:{ all -> 0x008d }
                if (r0 == 0) goto L_0x00a7
                java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x008d }
                a8.s r0 = (p009a8.C0120s) r0     // Catch:{ all -> 0x008d }
                r0.cancel(r6)     // Catch:{ all -> 0x008d }
                goto L_0x0097
            L_0x00a7:
                return r1
            L_0x00a8:
                p262t8.C6606a.m15600a(r11, r12)     // Catch:{ all -> 0x00ac }
                return r1
            L_0x00ac:
                r12 = move-exception
                p262t8.C6606a.m15600a(r11, r12)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2410j0.C2414d.mo12585a(java.lang.Void[]):java.lang.String[]");
        }

        /* renamed from: b */
        public final void mo12586b(String[] strArr) {
            if (!C6606a.m15601b(this)) {
                try {
                    if (!C6606a.m15601b(this)) {
                        ProgressDialog progressDialog = this.f8681d.f8665f;
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                        }
                        Exception[] excArr = this.f8680c;
                        int i = 0;
                        int length = excArr.length;
                        while (i < length) {
                            Exception exc = excArr[i];
                            i++;
                            if (exc != null) {
                                this.f8681d.mo12569d(exc);
                                return;
                            }
                        }
                        if (strArr == null) {
                            this.f8681d.mo12569d(new FacebookException("Failed to stage photos for web dialog"));
                            return;
                        }
                        List K0 = C21132f.m49428K0(strArr);
                        if (K0.contains((Object) null)) {
                            this.f8681d.mo12569d(new FacebookException("Failed to stage photos for web dialog"));
                            return;
                        }
                        C2397f0 f0Var = C2397f0.f8630a;
                        C2397f0.m6299H(this.f8679b, new JSONArray(K0));
                        String a = C2393d0.m6286a();
                        Uri b = C2397f0.m6308b(this.f8679b, a, C0115o.m213d() + "/dialog/" + this.f8678a);
                        this.f8681d.f8661b = b.toString();
                        ImageView imageView = this.f8681d.f8666g;
                        if (imageView != null) {
                            this.f8681d.mo12571e((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(this, th);
                }
            }
        }

        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (C6606a.m15601b(this)) {
                return null;
            }
            try {
                if (C6606a.m15601b(this)) {
                    return null;
                }
                return mo12585a((Void[]) objArr);
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
                return null;
            }
        }

        public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (!C6606a.m15601b(this)) {
                try {
                    if (!C6606a.m15601b(this)) {
                        mo12586b((String[]) obj);
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.j0$e */
    public /* synthetic */ class C2415e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8682a;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            f8682a = iArr;
        }
    }

    /* renamed from: com.facebook.internal.j0$f */
    public static final class C2416f extends WebView {
        public C2416f(Context context) {
            super(context);
        }

        public final void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2410j0(Context context, String str, Bundle bundle, LoginTargetApp loginTargetApp, C2413c cVar) {
        super(context, f8660o);
        Uri uri;
        C2400g0.m6342g();
        String str2 = "fbconnect://success";
        this.f8662c = str2;
        bundle = bundle == null ? new Bundle() : bundle;
        str2 = C2397f0.m6330x(context) ? "fbconnect://chrome_os_success" : str2;
        this.f8662c = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C0115o.m211b());
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"15.1.0"}, 1));
        C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString(ServerParameters.ANDROID_SDK_INT, format);
        this.f8663d = cVar;
        if (!C24362h.m61206a(str, "share") || !bundle.containsKey("media")) {
            if (C2415e.f8682a[loginTargetApp.ordinal()] == 1) {
                uri = C2397f0.m6308b(bundle, C2393d0.m6287b(), "oauth/authorize");
            } else {
                String a = C2393d0.m6286a();
                uri = C2397f0.m6308b(bundle, a, C0115o.m213d() + "/dialog/" + str);
            }
            this.f8661b = uri.toString();
            return;
        }
        this.f8668i = new C2414d(this, str, bundle);
    }

    /* renamed from: a */
    public static final void m6361a(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE);
            if (applicationInfo == null) {
                bundle = null;
            } else {
                bundle = applicationInfo.metaData;
            }
            if (bundle != null && f8660o == 0) {
                int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i == 0) {
                    i = f8659n;
                }
                f8660o = i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public Bundle mo12566b(String str) {
        Uri parse = Uri.parse(str);
        C2397f0 f0Var = C2397f0.f8630a;
        Bundle G = C2397f0.m6298G(parse.getQuery());
        G.putAll(C2397f0.m6298G(parse.getFragment()));
        return G;
    }

    /* renamed from: c */
    public final void mo12567c() {
        int i;
        double d;
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i2 < i3) {
                i = i2;
            } else {
                i = i3;
            }
            if (i2 >= i3) {
                i3 = i2;
            }
            int i4 = (int) (((float) i) / displayMetrics.density);
            double d2 = 1.0d;
            if (i4 <= 480) {
                d = 1.0d;
            } else if (i4 >= 800) {
                d = 0.5d;
            } else {
                d = ((((double) (800 - i4)) / ((double) 320)) * 0.5d) + 0.5d;
            }
            int min = Math.min((int) (((double) i) * d), i2);
            int i5 = (int) (((float) i3) / displayMetrics.density);
            if (i5 > 800) {
                if (i5 >= 1280) {
                    d2 = 0.5d;
                } else {
                    d2 = ((((double) (1280 - i5)) / ((double) 480)) * 0.5d) + 0.5d;
                }
            }
            int min2 = Math.min((int) (((double) i3) * d2), displayMetrics.heightPixels);
            Window window = getWindow();
            if (window != null) {
                window.setLayout(min, min2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public void cancel() {
        if (this.f8663d != null && !this.f8669j) {
            mo12569d(new FacebookOperationCanceledException());
        }
    }

    /* renamed from: d */
    public final void mo12569d(Exception exc) {
        FacebookException facebookException;
        if (this.f8663d != null && !this.f8669j) {
            this.f8669j = true;
            if (exc instanceof FacebookException) {
                facebookException = (FacebookException) exc;
            } else {
                facebookException = new FacebookException((Throwable) exc);
            }
            C2413c cVar = this.f8663d;
            if (cVar != null) {
                cVar.mo12584a((Bundle) null, facebookException);
            }
            dismiss();
        }
    }

    public final void dismiss() {
        ProgressDialog progressDialog;
        C2416f fVar = this.f8664e;
        if (fVar != null) {
            fVar.stopLoading();
        }
        if (!this.f8670k && (progressDialog = this.f8665f) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: e */
    public final void mo12571e(int i) {
        WebSettings webSettings;
        WebSettings webSettings2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        C2416f fVar = new C2416f(getContext());
        this.f8664e = fVar;
        fVar.setVerticalScrollBarEnabled(false);
        C2416f fVar2 = this.f8664e;
        if (fVar2 != null) {
            fVar2.setHorizontalScrollBarEnabled(false);
        }
        C2416f fVar3 = this.f8664e;
        if (fVar3 != null) {
            fVar3.setWebViewClient(new C2412b(this));
        }
        C2416f fVar4 = this.f8664e;
        WebSettings webSettings3 = null;
        if (fVar4 == null) {
            webSettings = null;
        } else {
            webSettings = fVar4.getSettings();
        }
        if (webSettings != null) {
            webSettings.setJavaScriptEnabled(true);
        }
        C2416f fVar5 = this.f8664e;
        if (fVar5 != null) {
            String str = this.f8661b;
            if (str != null) {
                fVar5.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        C2416f fVar6 = this.f8664e;
        if (fVar6 != null) {
            fVar6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        C2416f fVar7 = this.f8664e;
        if (fVar7 != null) {
            fVar7.setVisibility(4);
        }
        C2416f fVar8 = this.f8664e;
        if (fVar8 == null) {
            webSettings2 = null;
        } else {
            webSettings2 = fVar8.getSettings();
        }
        if (webSettings2 != null) {
            webSettings2.setSavePassword(false);
        }
        C2416f fVar9 = this.f8664e;
        if (fVar9 != null) {
            webSettings3 = fVar9.getSettings();
        }
        if (webSettings3 != null) {
            webSettings3.setSaveFormData(false);
        }
        C2416f fVar10 = this.f8664e;
        if (fVar10 != null) {
            fVar10.setFocusable(true);
        }
        C2416f fVar11 = this.f8664e;
        if (fVar11 != null) {
            fVar11.setFocusableInTouchMode(true);
        }
        C2416f fVar12 = this.f8664e;
        if (fVar12 != null) {
            fVar12.setOnTouchListener(new C2405i0());
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f8664e);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f8667h;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder;
        Window window;
        IBinder iBinder2;
        WindowManager.LayoutParams attributes;
        this.f8670k = false;
        C2397f0 f0Var = C2397f0.f8630a;
        Context context = getContext();
        C24362h.m61210e(context, AppActionRequest.KEY_CONTEXT);
        if (C2397f0.m6297F(context) && (layoutParams = this.f8672m) != null) {
            IBinder iBinder3 = null;
            if (layoutParams == null) {
                iBinder = null;
            } else {
                iBinder = layoutParams.token;
            }
            if (iBinder == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    if (ownerActivity == null) {
                        window = null;
                    } else {
                        window = ownerActivity.getWindow();
                    }
                    if (window == null || (attributes = window.getAttributes()) == null) {
                        iBinder2 = null;
                    } else {
                        iBinder2 = attributes.token;
                    }
                    layoutParams.token = iBinder2;
                }
                WindowManager.LayoutParams layoutParams2 = this.f8672m;
                if (layoutParams2 != null) {
                    iBinder3 = layoutParams2.token;
                }
                C24362h.m61216k(iBinder3, "Set token on onAttachedToWindow(): ");
                C0115o oVar = C0115o.f331a;
            }
        }
        super.onAttachedToWindow();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f8665f = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f8665f;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(C2362e.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f8665f;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f8665f;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new C2403h0(this));
        }
        requestWindowFeature(1);
        this.f8667h = new FrameLayout(getContext());
        mo12567c();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f8666g = imageView;
        imageView.setOnClickListener(new C4583a(this, 1));
        Drawable drawable = getContext().getResources().getDrawable(C2359b.com_facebook_close);
        ImageView imageView2 = this.f8666g;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f8666g;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f8661b != null) {
            ImageView imageView4 = this.f8666g;
            if (imageView4 != null) {
                mo12571e((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.f8667h;
        if (frameLayout != null) {
            frameLayout.addView(this.f8666g, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f8667h;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void onDetachedFromWindow() {
        this.f8670k = true;
        super.onDetachedFromWindow();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C24362h.m61211f(keyEvent, "event");
        if (i == 4) {
            C2416f fVar = this.f8664e;
            if (fVar == null || !C24362h.m61206a(Boolean.valueOf(fVar.canGoBack()), Boolean.TRUE)) {
                cancel();
            } else {
                C2416f fVar2 = this.f8664e;
                if (fVar2 == null) {
                    return true;
                }
                fVar2.goBack();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onStart() {
        AsyncTask.Status status;
        super.onStart();
        C2414d dVar = this.f8668i;
        if (dVar != null) {
            if (dVar == null) {
                status = null;
            } else {
                status = dVar.getStatus();
            }
            if (status == AsyncTask.Status.PENDING) {
                C2414d dVar2 = this.f8668i;
                if (dVar2 != null) {
                    dVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f8665f;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        mo12567c();
    }

    public final void onStop() {
        C2414d dVar = this.f8668i;
        if (dVar != null) {
            dVar.cancel(true);
            ProgressDialog progressDialog = this.f8665f;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        C24362h.m61211f(layoutParams, "params");
        if (layoutParams.token == null) {
            this.f8672m = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2410j0(androidx.fragment.app.FragmentActivity r2, java.lang.String r3) {
        /*
            r1 = this;
            com.facebook.internal.C2400g0.m6342g()
            int r0 = f8660o
            if (r0 != 0) goto L_0x000c
            com.facebook.internal.C2400g0.m6342g()
            int r0 = f8660o
        L_0x000c:
            r1.<init>(r2, r0)
            java.lang.String r2 = "fbconnect://success"
            r1.f8662c = r2
            r1.f8661b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2410j0.<init>(androidx.fragment.app.FragmentActivity, java.lang.String):void");
    }
}
