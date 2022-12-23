package com.veriff.sdk.internal;

import com.veriff.sdk.detector.FaceDetector;
import com.veriff.sdk.internal.C21667gf;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe;", "", "()V", "Failure", "WorkingFaceDetector", "Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe$WorkingFaceDetector;", "Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe$Failure;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.oj */
public abstract class C22201oj {

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe$Failure;", "Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe;", "reason", "Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe$Failure$Reason;", "(Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe$Failure$Reason;)V", "analyticsReason", "Lcom/veriff/sdk/internal/analytics/Event$AutoCaptureDisabledReason;", "getAnalyticsReason", "()Lcom/veriff/sdk/internal/analytics/Event$AutoCaptureDisabledReason;", "getReason", "()Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe$Failure$Reason;", "Reason", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.oj$a */
    public static final class C22202a extends C22201oj {

        /* renamed from: a */
        private final C22203a f55966a;

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe$Failure$Reason;", "", "(Ljava/lang/String;I)V", "APP_UNSUPPORTED", "PROBE_INCOMPLETE", "MODEL_UNAVAILABLE", "PROBE_FAILED", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.oj$a$a */
        public enum C22203a {
            APP_UNSUPPORTED,
            PROBE_INCOMPLETE,
            MODEL_UNAVAILABLE,
            PROBE_FAILED
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22202a(C22203a aVar) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(aVar, "reason");
            this.f55966a = aVar;
        }

        /* renamed from: a */
        public final C21667gf.C21709b mo56111a() {
            int i = C22205ok.f55973a[this.f55966a.ordinal()];
            if (i == 1) {
                return C21667gf.C21709b.app_unsupported;
            }
            if (i == 2) {
                return C21667gf.C21709b.probe_incomplete;
            }
            if (i == 3) {
                return C21667gf.C21709b.model_unavailable;
            }
            if (i == 4) {
                return C21667gf.C21709b.probe_failed;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe$WorkingFaceDetector;", "Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe;", "detector", "Lcom/veriff/sdk/detector/FaceDetector;", "(Lcom/veriff/sdk/detector/FaceDetector;)V", "getDetector", "()Lcom/veriff/sdk/detector/FaceDetector;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.oj$b */
    public static final class C22204b extends C22201oj {

        /* renamed from: a */
        private final FaceDetector f55972a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22204b(FaceDetector faceDetector) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(faceDetector, "detector");
            this.f55972a = faceDetector;
        }

        /* renamed from: a */
        public final FaceDetector mo56112a() {
            return this.f55972a;
        }
    }

    private C22201oj() {
    }

    public /* synthetic */ C22201oj(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
