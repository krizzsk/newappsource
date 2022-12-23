package com.veriff.sdk.views.camera;

import android.net.Uri;
import com.veriff.sdk.internal.C21882jp;
import com.veriff.sdk.views.C22932d;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.data.C24422b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000f"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/FlowActionScreen;", "Lcom/veriff/sdk/views/Screen;", "Lcom/veriff/sdk/internal/data/PhotoContext;", "context", "", "canCapture", "", "Landroid/net/Uri;", "selectedUris", "Lbf0/d;", "filesSelected", "resetPhotoCapturing", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "step", "startAuthenticationFlowStep", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.r */
public interface C22904r extends C22932d {

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.r$a */
    public static final class C22905a {
        /* renamed from: a */
        public static void m56451a(C22904r rVar) {
        }

        /* renamed from: a */
        public static void m56452a(C22904r rVar, List<? extends Uri> list) {
            C24362h.m61211f(list, "selectedUris");
        }
    }

    /* renamed from: a */
    void mo56009a(List<? extends Uri> list);

    /* renamed from: a */
    void mo56010a(C24422b bVar);

    /* renamed from: a */
    boolean mo56011a(C21882jp jpVar);

    /* renamed from: b_ */
    void mo56012b_();
}
