package com.veriff.sdk.views.camera;

import com.appboy.models.InAppMessageBase;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000eB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/VideoRecordingFailure;", "", "kind", "Lcom/veriff/sdk/views/camera/VideoRecordingFailure$Kind;", "message", "", "cause", "(Lcom/veriff/sdk/views/camera/VideoRecordingFailure$Kind;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getKind", "()Lcom/veriff/sdk/views/camera/VideoRecordingFailure$Kind;", "getMessage", "()Ljava/lang/String;", "Kind", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ao */
public final class C22849ao extends Throwable {

    /* renamed from: a */
    private final C22850a f58010a;

    /* renamed from: b */
    private final String f58011b;

    /* renamed from: c */
    private final Throwable f58012c;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/VideoRecordingFailure$Kind;", "", "(Ljava/lang/String;I)V", "MIC_UNAVAILABLE", "VIDEO_ENCODER_FAILED", "VIDEO_THREAD_STUCK", "VIDEO_MUXER_FAILED", "FILE_TOO_LARGE", "AUDIO_RECORDER_FAILED", "AUDIO_ENCODER", "IMMEDIATE_TEARDOWN", "NO_FRAMES", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.ao$a */
    public enum C22850a {
        MIC_UNAVAILABLE,
        VIDEO_ENCODER_FAILED,
        VIDEO_THREAD_STUCK,
        VIDEO_MUXER_FAILED,
        FILE_TOO_LARGE,
        AUDIO_RECORDER_FAILED,
        AUDIO_ENCODER,
        IMMEDIATE_TEARDOWN,
        NO_FRAMES
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C22849ao(com.veriff.sdk.views.camera.C22849ao.C22850a r1, java.lang.String r2, java.lang.Throwable r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0015
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Video recording failed: "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
        L_0x0015:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x001a
            r3 = 0
        L_0x001a:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.C22849ao.<init>(com.veriff.sdk.views.camera.ao$a, java.lang.String, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: a */
    public final C22850a mo57677a() {
        return this.f58010a;
    }

    public Throwable getCause() {
        return this.f58012c;
    }

    public String getMessage() {
        return this.f58011b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22849ao(C22850a aVar, String str, Throwable th) {
        super(str, th);
        C24362h.m61211f(aVar, "kind");
        C24362h.m61211f(str, InAppMessageBase.MESSAGE);
        this.f58010a = aVar;
        this.f58011b = str;
        this.f58012c = th;
    }
}
