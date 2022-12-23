package com.veriff.sdk.internal;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&¨\u0006\f"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/ui/UploadUI;", "", "Landroid/view/View;", "getView", "", "currentStep", "Lbf0/d;", "setCurrentStep", "gotDecision", "showUploadFailedScreen", "showUploadProgress", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.sk */
public interface C22517sk {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/ui/UploadUI$Listener;", "", "Lbf0/d;", "finishSuccessfully", "goToFinishedScreen", "onCloseButtonPressed", "onRetryClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sk$a */
    public interface C22518a {
        /* renamed from: a */
        void mo56649a();

        /* renamed from: b */
        void mo56650b();

        /* renamed from: c */
        void mo56651c();
    }

    /* renamed from: a */
    void mo56644a();

    /* renamed from: b */
    void mo56645b();

    /* renamed from: c */
    void mo56646c();

    View getView();

    void setCurrentStep(int i);
}
