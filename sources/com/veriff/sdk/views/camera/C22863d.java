package com.veriff.sdk.views.camera;

import com.veriff.sdk.camera.core.ImageProxy;
import com.veriff.sdk.detector.Size;
import com.veriff.sdk.internal.C22061nh;
import com.veriff.sdk.internal.C22660wl;
import java.io.File;
import kotlin.Metadata;
import wh0.C25162c0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&J \u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/Camera;", "", "Lbf0/d;", "deselectCamera", "", "hasCurrentCameraFlashCapability", "", "x", "y", "focus", "resetFaceFocus", "Lcom/veriff/sdk/views/camera/Camera$Type;", "preferredCamera", "selectCamera", "Lmobi/lab/veriff/fragment/PhotoConf;", "conf", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "pictureStorage", "", "fileName", "takePhoto", "getSelectedCamera", "()Lcom/veriff/sdk/views/camera/Camera$Type;", "selectedCamera", "Detector", "Listener", "Type", "VideoListener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.d */
public interface C22863d {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/Camera$Detector;", "", "Lcom/veriff/sdk/camera/core/ImageProxy;", "image", "Lcom/veriff/sdk/detector/Size;", "previewSize", "Lbf0/d;", "detect", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.d$a */
    public interface C22864a {
        /* renamed from: a */
        void mo56097a(ImageProxy imageProxy, Size size);
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/Camera$Listener;", "", "", "num", "Lbf0/d;", "gotMultipleFaces", "gotNoFace", "gotOneFace", "noCameraDeviceFound", "onCameraBusy", "onCameraReady", "Lmobi/lab/veriff/fragment/PhotoConf;", "photoConf", "photoCaptureFailed", "photoCaptureSuccess", "Ljava/io/File;", "file", "photoFileReady", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.d$b */
    public interface C22865b {
        /* renamed from: a */
        void mo56054a();

        /* renamed from: a */
        void mo56056a(C22660wl wlVar);

        /* renamed from: a */
        void mo56057a(C22660wl wlVar, File file);

        /* renamed from: a_ */
        void mo56060a_();

        /* renamed from: b */
        void mo56061b();

        /* renamed from: b */
        void mo56062b(C22660wl wlVar);
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/Camera$Type;", "", "(Ljava/lang/String;I)V", "FRONT", "BACK", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.d$c */
    public enum C22866c {
        FRONT,
        BACK
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J(\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\u0016\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/Camera$VideoListener;", "", "Lbf0/d;", "audioRecordingFailed", "Lcom/veriff/sdk/views/camera/VideoRecordingFailure;", "failure", "videoCaptureFailed", "Lcom/veriff/sdk/views/camera/VideoConfiguration;", "configuration", "Ljava/io/File;", "file", "", "timestamp", "duration", "videoFileReady", "Lwh0/c0;", "", "recordingCompletion", "videoStartSuccess", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.d$d */
    public interface C22867d {
        /* renamed from: a */
        void mo57601a(C22833ah ahVar, File file, long j, long j2);

        /* renamed from: a */
        void mo57602a(C22849ao aoVar);

        /* renamed from: a */
        void mo57606a(C25162c0<Boolean> c0Var);

        /* renamed from: i */
        void mo57616i();
    }

    void deselectCamera();

    void focus(float f, float f2);

    C22866c getSelectedCamera();

    boolean hasCurrentCameraFlashCapability();

    void resetFaceFocus();

    void selectCamera(C22866c cVar);

    void takePhoto(C22660wl wlVar, C22061nh nhVar, String str);
}
