package com.veriff.sdk.internal;

import android.content.Context;
import kotlin.Metadata;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.service.SendAuthenticationFlowDataToServerService;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/di/SdkLaunchComponent;", "", "Lcom/veriff/sdk/views/base/BaseActivity;", "activity", "Lbf0/d;", "inject", "Lmobi/lab/veriff/service/SendAuthenticationFlowDataToServerService;", "service", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "getApiService", "()Lmobi/lab/veriff/network/VeriffApi$ApiService;", "apiService", "Lcom/squareup/picasso/Picasso;", "getPicasso", "()Lcom/squareup/picasso/Picasso;", "picasso", "Factory", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.dw */
public interface C21582dw {

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/di/SdkLaunchComponent$Factory;", "", "create", "Lcom/veriff/di/SdkLaunchComponent;", "context", "Landroid/content/Context;", "arguments", "Lmobi/lab/veriff/data/SessionArguments;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.dw$a */
    public interface C21583a {
        /* renamed from: a */
        C21582dw mo54569a(Context context, C24426d dVar);
    }

    /* renamed from: a */
    void mo54570a(C22233ot otVar);

    /* renamed from: a */
    void mo54571a(SendAuthenticationFlowDataToServerService sendAuthenticationFlowDataToServerService);
}
