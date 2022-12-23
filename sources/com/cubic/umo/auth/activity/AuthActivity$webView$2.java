package com.cubic.umo.auth.activity;

import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p109h7.C5135a;

@Metadata(mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "Landroid/webkit/WebView;", "kotlin.jvm.PlatformType", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class AuthActivity$webView$2 extends Lambda implements C24225a<WebView> {
    public final /* synthetic */ AuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthActivity$webView$2(AuthActivity authActivity) {
        super(0);
        this.this$0 = authActivity;
    }

    public final Object invoke() {
        return (WebView) this.this$0.findViewById(C5135a.webView);
    }
}
