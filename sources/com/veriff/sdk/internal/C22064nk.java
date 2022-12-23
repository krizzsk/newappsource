package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import ff0.C23349c;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0014\u001a\u00020\u0004H&J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0004H&J\b\u0010\u001a\u001a\u00020\u0004H&J\u001b\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager$UploadStatusListener;", "uploadStatusListener", "Lbf0/d;", "addUploadStatusListener", "clearAllMedia", "", "context", "clearNonInflowMediaForContext", "", "Lcom/veriff/sdk/internal/upload/Media;", "getErrorUploads", "getFailedUploads", "Lcom/veriff/sdk/internal/upload/MediaWithStatus;", "getInflowUploads", "getMediaForContext", "media", "queueMedia", "removeUploadStatusListener", "resetFailedUploads", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "uploadMediaFileForInflow", "(Lcom/veriff/sdk/internal/upload/Media;Lff0/c;)Ljava/lang/Object;", "uploadQueuedInflowMedia", "uploadQueuedItems", "waitForUploadToFinish", "", "getEverythingUploaded", "()Z", "everythingUploaded", "UploadStatusListener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nk */
public interface C22064nk {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager$UploadStatusListener;", "", "Lcom/veriff/sdk/internal/upload/MediaWithStatus;", "upload", "Lbf0/d;", "onMediaUploadFinished", "Lcom/veriff/sdk/internal/upload/SessionUploadStatus;", "status", "onUploadStatusChanged", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nk$a */
    public interface C22065a {

        @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nk$a$a */
        public static final class C22066a {
            /* renamed from: a */
            public static void m53820a(C22065a aVar, C22060ng ngVar) {
                C24362h.m61211f(ngVar, "upload");
            }

            /* renamed from: a */
            public static void m53821a(C22065a aVar, C22062ni niVar) {
                C24362h.m61211f(niVar, ServerParameters.STATUS);
            }
        }

        /* renamed from: a */
        void mo55961a(C22060ng ngVar);

        /* renamed from: a */
        void mo55962a(C22062ni niVar);
    }

    /* renamed from: a */
    C22046na mo55946a(String str);

    /* renamed from: a */
    Object mo55947a(C22046na naVar, C23349c<? super C21924kn<C22561tq>> cVar);

    /* renamed from: a */
    void mo55948a(C22046na naVar);

    /* renamed from: a */
    void mo55949a(C22065a aVar);

    /* renamed from: a */
    boolean mo55950a();

    /* renamed from: b */
    Object mo55951b(C22046na naVar, C23349c<? super C22060ng> cVar);

    /* renamed from: b */
    void mo55952b();

    /* renamed from: b */
    void mo55953b(C22065a aVar);

    /* renamed from: b */
    void mo55954b(String str);

    /* renamed from: c */
    void mo55955c();

    /* renamed from: d */
    void mo55956d();

    /* renamed from: e */
    List<C22060ng> mo55957e();

    /* renamed from: f */
    List<C22046na> mo55958f();

    /* renamed from: g */
    List<C22046na> mo55959g();

    /* renamed from: h */
    void mo55960h();
}
