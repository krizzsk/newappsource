package com.veriff.sdk.views.camera;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Size;
import android.view.Surface;
import bf0.C21050d;
import com.appboy.models.InAppMessageBase;
import com.appboy.support.AppboyFileUtils;
import com.veriff.sdk.camera.core.AndroidImageProxy;
import com.veriff.sdk.camera.core.ImageProxy;
import com.veriff.sdk.internal.C21636fm;
import com.veriff.sdk.internal.C21637fn;
import com.veriff.sdk.views.camera.C22849ao;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$LongRef;
import lf0.C24225a;
import mf0.C24362h;
import mobi.lab.veriff.util.C24446b;
import mobi.lab.veriff.util.C24465j;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001gBW\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010_\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010b\u001a\u00020)\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J$\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002J\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002R\u0014\u0010%\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X.¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010.R\u0014\u0010C\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010.R\u0014\u0010D\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010.R\u0014\u0010E\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010.R\u0014\u0010F\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010.R\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010IR\u0014\u0010U\u001a\u00020T8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010IR\u0016\u0010^\u001a\u00020\u00108\u0002@\u0002X.¢\u0006\u0006\n\u0004\b^\u0010(R\u0014\u0010_\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010+R\u0014\u0010`\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u00103R\u0016\u0010a\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u0010;¨\u0006h"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/VideoRecorder;", "Lcom/veriff/sdk/views/camera/FrameConsumer;", "Lbf0/d;", "audioEncode", "Lcom/veriff/sdk/views/camera/AudioParameters;", "params", "Landroid/media/MediaFormat;", "createAudioFormat", "Lcom/veriff/sdk/camera/core/ImageProxy;", "initialFrame", "createVideoFormat", "finishedBeforeFrames", "Ljava/nio/ByteBuffer;", "buffer", "", "inputBufferIndex", "Landroid/media/MediaCodec;", "codec", "getInputImage", "frame", "onFrameReceived", "onFramesEnd", "setupAudioEncoder", "setupMuxer", "Ljava/util/concurrent/CountDownLatch;", "setupVideoEncoder", "audioParameters", "startAudioEncoder", "", "muxerStarted", "stopVideoRecording", "videoEncode", "bufferIndex", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "writeAudioEncodedBuffer", "writeVideoEncodedBuffer", "audioEnabled", "Z", "audioEncoder", "Landroid/media/MediaCodec;", "Lcom/veriff/sdk/internal/Scheduler;", "audioEncoderThread", "Lcom/veriff/sdk/internal/Scheduler;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "audioInitFailed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "audioInitLatch", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/atomic/AtomicInteger;", "audioSamplesWritten", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lcom/veriff/sdk/views/camera/AudioSource;", "audioSource", "Lcom/veriff/sdk/views/camera/AudioSource;", "Lcom/veriff/sdk/views/camera/AudioSourceFactory;", "audioSourceFactory", "Lcom/veriff/sdk/views/camera/AudioSourceFactory;", "audioTrackIndex", "I", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Lcom/veriff/sdk/views/camera/VideoConfiguration;", "configuration", "Lcom/veriff/sdk/views/camera/VideoConfiguration;", "encoderSetupDone", "endOfAudioStreamSignal", "endOfAudioVideoSignal", "endOfVideoStreamSignal", "errorOccurred", "", "lastEncodedFrameNs", "J", "Lcom/veriff/sdk/views/camera/MediaCodecFactory;", "mediaCodecFactory", "Lcom/veriff/sdk/views/camera/MediaCodecFactory;", "Landroid/media/MediaMuxer;", "muxer", "Landroid/media/MediaMuxer;", "Ljava/lang/Object;", "muxerLock", "Ljava/lang/Object;", "nsPerFrame", "Lcom/veriff/sdk/views/camera/VideoRecorder$MainCallback;", "postListener", "Lcom/veriff/sdk/views/camera/VideoRecorder$MainCallback;", "Lcom/veriff/sdk/views/camera/Rotation;", "rotation", "Lcom/veriff/sdk/views/camera/Rotation;", "Ljava/io/File;", "saveLocation", "Ljava/io/File;", "start", "videoEncoder", "videoEncoderThread", "videoSamplesWritten", "videoTrackIndex", "main", "Lcom/veriff/sdk/views/camera/VideoRecorderCallback;", "callback", "<init>", "(Lcom/veriff/sdk/views/camera/VideoConfiguration;Lcom/veriff/sdk/views/camera/MediaCodecFactory;Lcom/veriff/sdk/views/camera/AudioSourceFactory;Ljava/io/File;Lcom/veriff/sdk/views/camera/Rotation;Lmobi/lab/veriff/util/Clock;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/views/camera/VideoRecorderCallback;)V", "MainCallback", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.al */
public final class C22837al {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C24446b f57958A;

    /* renamed from: B */
    private final C21636fm f57959B;

    /* renamed from: C */
    private final C21636fm f57960C;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C22838a f57961a;

    /* renamed from: b */
    private final Object f57962b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f57963c = new AtomicBoolean(true);

    /* renamed from: d */
    private final AtomicBoolean f57964d = new AtomicBoolean(true);

    /* renamed from: e */
    private final AtomicBoolean f57965e = new AtomicBoolean(true);

    /* renamed from: f */
    private final AtomicBoolean f57966f = new AtomicBoolean(false);

    /* renamed from: g */
    private final AtomicInteger f57967g = new AtomicInteger(0);

    /* renamed from: h */
    private final AtomicInteger f57968h = new AtomicInteger(0);

    /* renamed from: i */
    private final AtomicBoolean f57969i = new AtomicBoolean(false);

    /* renamed from: j */
    private MediaMuxer f57970j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f57971k = -1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MediaCodec f57972l;

    /* renamed from: m */
    private final boolean f57973m;

    /* renamed from: n */
    private final CountDownLatch f57974n;

    /* renamed from: o */
    private int f57975o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public MediaCodec f57976p;

    /* renamed from: q */
    private C22861b f57977q;

    /* renamed from: r */
    private final long f57978r;

    /* renamed from: s */
    private long f57979s;

    /* renamed from: t */
    private final long f57980t;

    /* renamed from: u */
    private final AtomicBoolean f57981u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C22833ah f57982v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C22931z f57983w;

    /* renamed from: x */
    private final C22862c f57984x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final File f57985y;

    /* renamed from: z */
    private final C22830ae f57986z;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.al$b */
    public static final class C22845b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22837al f58003a;

        /* renamed from: b */
        public final /* synthetic */ ImageProxy f58004b;

        /* renamed from: c */
        public final /* synthetic */ CountDownLatch f58005c;

        /* renamed from: d */
        public final /* synthetic */ Ref$LongRef f58006d;

        public C22845b(C22837al alVar, ImageProxy imageProxy, CountDownLatch countDownLatch, Ref$LongRef ref$LongRef) {
            this.f58003a = alVar;
            this.f58004b = imageProxy;
            this.f58005c = countDownLatch;
            this.f58006d = ref$LongRef;
        }

        public final void run() {
            boolean z = true;
            try {
                C22837al alVar = this.f58003a;
                alVar.f57972l = alVar.f57983w.mo57635a(this.f58003a.f57982v.mo57643e().mo57651b());
                C22837al.m56213b(this.f58003a).reset();
                C22837al.m56213b(this.f58003a).configure(this.f58003a.m56220c(this.f58004b), (Surface) null, (MediaCrypto) null, 1);
                C22837al.m56213b(this.f58003a).start();
                this.f58003a.f57971k = -1;
                this.f58005c.countDown();
                this.f58006d.element = this.f58003a.f57958A.mo60661a();
                boolean h = this.f58003a.m56225e();
                long length = this.f58003a.f57985y.length();
                if (length > this.f58003a.f57982v.mo57642d()) {
                    C22838a j = this.f58003a.f57961a;
                    C22849ao.C22850a aVar = C22849ao.C22850a.FILE_TOO_LARGE;
                    j.mo57664a(aVar, "Saved video file is too large - " + length + " bytes");
                } else {
                    z = h;
                }
            } catch (Throwable th) {
                C22848an.f58009a.mo60708e("Saving video file failed", th);
                this.f58003a.f57961a.mo57665a(C22849ao.C22850a.VIDEO_ENCODER_FAILED, th);
            }
            if (!z) {
                this.f58003a.f57961a.mo57667a(this.f58003a.f57985y, this.f58006d.element, this.f58003a.f57958A.mo60661a() - this.f58006d.element);
                return;
            }
            this.f58003a.f57985y.delete();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.al$c */
    public static final class C22846c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22837al f58007a;

        /* renamed from: b */
        public final /* synthetic */ C22825a f58008b;

        public C22846c(C22837al alVar, C22825a aVar) {
            this.f58007a = alVar;
            this.f58008b = aVar;
        }

        public final void run() {
            C22837al alVar = this.f58007a;
            alVar.f57976p = alVar.f57983w.mo57635a(this.f58008b.mo57621a());
            C22837al.m56219c(this.f58007a).reset();
            C22837al.m56219c(this.f58007a).configure(this.f58007a.m56214b(this.f58008b), (Surface) null, (MediaCrypto) null, 1);
            C22837al.m56219c(this.f58007a).start();
            C22848an.f58009a.mo60709i("Starting audio recording");
            C22837al.m56207a(this.f58007a).mo57630a();
            this.f58007a.m56223d();
        }
    }

    public C22837al(C22833ah ahVar, C22931z zVar, C22862c cVar, File file, C22830ae aeVar, C24446b bVar, C21636fm fmVar, C21636fm fmVar2, C21636fm fmVar3, C22847am amVar) {
        boolean z;
        C24362h.m61211f(ahVar, "configuration");
        C24362h.m61211f(zVar, "mediaCodecFactory");
        C24362h.m61211f(cVar, "audioSourceFactory");
        C24362h.m61211f(file, "saveLocation");
        C24362h.m61211f(aeVar, "rotation");
        C24362h.m61211f(bVar, "clock");
        C24362h.m61211f(fmVar, "videoEncoderThread");
        C24362h.m61211f(fmVar2, "audioEncoderThread");
        C24362h.m61211f(fmVar3, "main");
        C24362h.m61211f(amVar, WidgetMessageParser.KEY_CALLBACK);
        this.f57982v = ahVar;
        this.f57983w = zVar;
        this.f57984x = cVar;
        this.f57985y = file;
        this.f57986z = aeVar;
        this.f57958A = bVar;
        this.f57959B = fmVar;
        this.f57960C = fmVar2;
        this.f57961a = new C22838a(amVar, fmVar3);
        if (ahVar.mo57645f() != null) {
            z = true;
        } else {
            z = false;
        }
        this.f57973m = z;
        this.f57974n = new CountDownLatch(1);
        this.f57975o = -1;
        this.f57978r = TimeUnit.SECONDS.toNanos(1) / ((long) ahVar.mo57643e().mo57654e());
        this.f57979s = Long.MIN_VALUE;
        this.f57980t = bVar.mo60661a();
        this.f57981u = new AtomicBoolean(false);
        C24465j a = C22848an.f58009a;
        a.mo60709i("Starting new video recording with " + ahVar);
    }

    /* renamed from: b */
    public static final /* synthetic */ MediaCodec m56213b(C22837al alVar) {
        MediaCodec mediaCodec = alVar.f57972l;
        if (mediaCodec != null) {
            return mediaCodec;
        }
        C24362h.m61217l("videoEncoder");
        throw null;
    }

    /* renamed from: c */
    public static final /* synthetic */ MediaCodec m56219c(C22837al alVar) {
        MediaCodec mediaCodec = alVar.f57976p;
        if (mediaCodec != null) {
            return mediaCodec;
        }
        C24362h.m61217l("audioEncoder");
        throw null;
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bJ \u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J \u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0016\u0010\u001a\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0002R\u0014\u0010\u001b\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/VideoRecorder$MainCallback;", "Lcom/veriff/sdk/views/camera/VideoRecorderCallback;", "Lbf0/d;", "onAudioInitError", "Lcom/veriff/sdk/views/camera/VideoRecordingFailure;", "failure", "onError", "Lcom/veriff/sdk/views/camera/VideoRecordingFailure$Kind;", "kind", "", "message", "", "cause", "codecName", "", "width", "height", "onFirstVideoFrame", "Ljava/io/File;", "file", "", "timestamp", "duration", "onVideoSaved", "Lkotlin/Function0;", "fn", "once", "callback", "Lcom/veriff/sdk/views/camera/VideoRecorderCallback;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "callbackSent", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/veriff/sdk/internal/Scheduler;", "main", "Lcom/veriff/sdk/internal/Scheduler;", "<init>", "(Lcom/veriff/sdk/views/camera/VideoRecorderCallback;Lcom/veriff/sdk/internal/Scheduler;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.al$a */
    public static final class C22838a implements C22847am {

        /* renamed from: a */
        private final AtomicBoolean f57987a = new AtomicBoolean(false);
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C22847am f57988b;

        /* renamed from: c */
        private final C21636fm f57989c;

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.camera.al$a$a */
        public static final class C22839a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C22838a f57990a;

            public C22839a(C22838a aVar) {
                this.f57990a = aVar;
            }

            public final void run() {
                this.f57990a.f57988b.mo57663a();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.camera.al$a$b */
        public static final class C22840b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C22838a f57991a;

            /* renamed from: b */
            public final /* synthetic */ C22849ao f57992b;

            public C22840b(C22838a aVar, C22849ao aoVar) {
                this.f57991a = aVar;
                this.f57992b = aoVar;
            }

            public final void run() {
                this.f57991a.m56236a((C24225a<C21050d>) new C24225a<C21050d>(this) {

                    /* renamed from: a */
                    public final /* synthetic */ C22840b f57993a;

                    {
                        this.f57993a = r1;
                    }

                    /* renamed from: a */
                    public final void mo57671a() {
                        this.f57993a.f57991a.f57988b.mo57666a(this.f57993a.f57992b);
                    }

                    public /* synthetic */ Object invoke() {
                        mo57671a();
                        return C21050d.f52856a;
                    }
                });
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.camera.al$a$c */
        public static final class C22842c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C22838a f57994a;

            /* renamed from: b */
            public final /* synthetic */ String f57995b;

            /* renamed from: c */
            public final /* synthetic */ int f57996c;

            /* renamed from: d */
            public final /* synthetic */ int f57997d;

            public C22842c(C22838a aVar, String str, int i, int i2) {
                this.f57994a = aVar;
                this.f57995b = str;
                this.f57996c = i;
                this.f57997d = i2;
            }

            public final void run() {
                this.f57994a.f57988b.mo57668a(this.f57995b, this.f57996c, this.f57997d);
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.camera.al$a$d */
        public static final class C22843d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C22838a f57998a;

            /* renamed from: b */
            public final /* synthetic */ File f57999b;

            /* renamed from: c */
            public final /* synthetic */ long f58000c;

            /* renamed from: d */
            public final /* synthetic */ long f58001d;

            public C22843d(C22838a aVar, File file, long j, long j2) {
                this.f57998a = aVar;
                this.f57999b = file;
                this.f58000c = j;
                this.f58001d = j2;
            }

            public final void run() {
                this.f57998a.m56236a((C24225a<C21050d>) new C24225a<C21050d>(this) {

                    /* renamed from: a */
                    public final /* synthetic */ C22843d f58002a;

                    {
                        this.f58002a = r1;
                    }

                    /* renamed from: a */
                    public final void mo57674a() {
                        C22847am a = this.f58002a.f57998a.f57988b;
                        C22843d dVar = this.f58002a;
                        a.mo57667a(dVar.f57999b, dVar.f58000c, dVar.f58001d);
                    }

                    public /* synthetic */ Object invoke() {
                        mo57674a();
                        return C21050d.f52856a;
                    }
                });
            }
        }

        public C22838a(C22847am amVar, C21636fm fmVar) {
            C24362h.m61211f(amVar, WidgetMessageParser.KEY_CALLBACK);
            C24362h.m61211f(fmVar, "main");
            this.f57988b = amVar;
            this.f57989c = fmVar;
        }

        /* renamed from: a */
        public void mo57667a(File file, long j, long j2) {
            C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
            this.f57989c.mo54894a(new C22843d(this, file, j, j2));
        }

        /* renamed from: a */
        public void mo57666a(C22849ao aoVar) {
            C24362h.m61211f(aoVar, "failure");
            this.f57989c.mo54894a(new C22840b(this, aoVar));
        }

        /* renamed from: a */
        public final void mo57665a(C22849ao.C22850a aVar, Throwable th) {
            C24362h.m61211f(aVar, "kind");
            C24362h.m61211f(th, "cause");
            mo57666a(new C22849ao(aVar, (String) null, th, 2, (DefaultConstructorMarker) null));
        }

        /* renamed from: a */
        public final void mo57664a(C22849ao.C22850a aVar, String str) {
            C24362h.m61211f(aVar, "kind");
            C24362h.m61211f(str, InAppMessageBase.MESSAGE);
            mo57666a(new C22849ao(aVar, str, (Throwable) null, 4, (DefaultConstructorMarker) null));
        }

        /* renamed from: a */
        public void mo57668a(String str, int i, int i2) {
            C24362h.m61211f(str, "codecName");
            this.f57989c.mo54894a(new C22842c(this, str, i, i2));
        }

        /* renamed from: a */
        public void mo57663a() {
            this.f57989c.mo54894a(new C22839a(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m56236a(C24225a<C21050d> aVar) {
            if (this.f57987a.compareAndSet(false, true)) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: c */
    private final C22825a m56221c() {
        C22825a f = this.f57982v.mo57645f();
        if (f != null) {
            C22861b a = this.f57984x.mo57634a(f);
            C24465j a2 = C22848an.f58009a;
            a2.mo60709i("Audio recorder initialized (" + a + ')');
            if (a != null) {
                this.f57963c.set(false);
                this.f57977q = a;
                return f;
            }
            this.f57966f.set(true);
            this.f57974n.countDown();
            this.f57961a.mo57663a();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m56223d() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        C22848an.f58009a.mo60709i("Enter audio encode loop");
        boolean z = false;
        boolean z2 = true;
        while (!z && z2) {
            if (this.f57963c.compareAndSet(true, false)) {
                C22848an.f58009a.mo60705d("End of audio stream signal received");
                z2 = false;
            }
            MediaCodec mediaCodec = this.f57976p;
            if (mediaCodec != null) {
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000);
                if (dequeueInputBuffer != -1) {
                    MediaCodec mediaCodec2 = this.f57976p;
                    if (mediaCodec2 != null) {
                        ByteBuffer inputBuffer = mediaCodec2.getInputBuffer(dequeueInputBuffer);
                        if (inputBuffer == null) {
                            C22848an.f58009a.mo60711w("Audio encoder buffer is null");
                        } else {
                            inputBuffer.clear();
                            C22861b bVar = this.f57977q;
                            if (bVar != null) {
                                int a = bVar.mo57629a(inputBuffer);
                                if (a > 0) {
                                    MediaCodec mediaCodec3 = this.f57976p;
                                    if (mediaCodec3 != null) {
                                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, a, System.nanoTime() / ((long) 1000), z2 ? 0 : 4);
                                        while (true) {
                                            MediaCodec mediaCodec4 = this.f57976p;
                                            if (mediaCodec4 != null) {
                                                int dequeueOutputBuffer = mediaCodec4.dequeueOutputBuffer(bufferInfo, 0);
                                                if (dequeueOutputBuffer != -2) {
                                                    if (dequeueOutputBuffer == -1) {
                                                        break;
                                                    }
                                                    z = m56218b(dequeueOutputBuffer, bufferInfo);
                                                    if (dequeueOutputBuffer >= 0 && !z) {
                                                        if (!z2) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else {
                                                    C22848an.f58009a.mo60705d("Audio format changed");
                                                    synchronized (this.f57962b) {
                                                        MediaMuxer mediaMuxer = this.f57970j;
                                                        if (mediaMuxer != null) {
                                                            MediaCodec mediaCodec5 = this.f57976p;
                                                            if (mediaCodec5 != null) {
                                                                int addTrack = mediaMuxer.addTrack(mediaCodec5.getOutputFormat());
                                                                this.f57975o = addTrack;
                                                                if (addTrack >= 0 && this.f57971k >= 0) {
                                                                    MediaMuxer mediaMuxer2 = this.f57970j;
                                                                    if (mediaMuxer2 != null) {
                                                                        mediaMuxer2.start();
                                                                    } else {
                                                                        C24362h.m61217l("muxer");
                                                                        throw null;
                                                                    }
                                                                }
                                                                C22848an.f58009a.mo60705d("Audio track ready");
                                                                this.f57974n.countDown();
                                                                C21050d dVar = C21050d.f52856a;
                                                            } else {
                                                                C24362h.m61217l("audioEncoder");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C24362h.m61217l("muxer");
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            } else {
                                                C24362h.m61217l("audioEncoder");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        C24362h.m61217l("audioEncoder");
                                        throw null;
                                    }
                                } else {
                                    C22838a aVar = this.f57961a;
                                    C22849ao.C22850a aVar2 = C22849ao.C22850a.MIC_UNAVAILABLE;
                                    aVar.mo57664a(aVar2, "Audio recorder gave " + a + " bytes");
                                    this.f57974n.countDown();
                                    this.f57966f.set(true);
                                    return;
                                }
                            } else {
                                C24362h.m61217l("audioSource");
                                throw null;
                            }
                        }
                    } else {
                        C24362h.m61217l("audioEncoder");
                        throw null;
                    }
                }
            } else {
                C24362h.m61217l("audioEncoder");
                throw null;
            }
        }
        try {
            C22861b bVar2 = this.f57977q;
            if (bVar2 != null) {
                bVar2.mo57631b();
                C22861b bVar3 = this.f57977q;
                if (bVar3 != null) {
                    bVar3.mo57632c();
                    try {
                        MediaCodec mediaCodec6 = this.f57976p;
                        if (mediaCodec6 != null) {
                            mediaCodec6.stop();
                            MediaCodec mediaCodec7 = this.f57976p;
                            if (mediaCodec7 != null) {
                                mediaCodec7.release();
                                C22848an.f58009a.mo60709i("Audio encode thread end");
                                this.f57964d.set(true);
                                return;
                            }
                            C24362h.m61217l("audioEncoder");
                            throw null;
                        }
                        C24362h.m61217l("audioEncoder");
                        throw null;
                    } catch (IllegalStateException e) {
                        this.f57961a.mo57665a(C22849ao.C22850a.AUDIO_ENCODER, (Throwable) e);
                        C22848an.f58009a.mo60708e("Audio encoder stop failed", e);
                    }
                } else {
                    C24362h.m61217l("audioSource");
                    throw null;
                }
            } else {
                C24362h.m61217l("audioSource");
                throw null;
            }
        } catch (IllegalStateException e2) {
            this.f57961a.mo57665a(C22849ao.C22850a.AUDIO_RECORDER_FAILED, (Throwable) e2);
            C22848an.f58009a.mo60708e("Audio recorder stop failed", e2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m56225e() {
        /*
            r17 = this;
            r1 = r17
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo
            r0.<init>()
            mobi.lab.veriff.util.j r2 = com.veriff.sdk.views.camera.C22848an.f58009a
            java.lang.String r3 = "Enter video encode loop"
            r2.mo60709i(r3)
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0013:
            if (r3 != 0) goto L_0x00e5
            java.util.concurrent.atomic.AtomicBoolean r5 = r1.f57969i
            boolean r5 = r5.get()
            if (r5 != 0) goto L_0x00e5
            java.util.concurrent.atomic.AtomicBoolean r5 = r1.f57964d
            boolean r5 = r5.get()
            r6 = -1
            r7 = 10000(0x2710, double:4.9407E-320)
            r9 = 0
            if (r5 == 0) goto L_0x0062
            mobi.lab.veriff.util.j r5 = com.veriff.sdk.views.camera.C22848an.f58009a
            java.lang.String r10 = "End of video stream signal received"
            r5.mo60705d(r10)
            android.media.MediaCodec r5 = r1.f57972l
            if (r5 == 0) goto L_0x005c
            int r11 = r5.dequeueInputBuffer(r7)
            if (r11 != r6) goto L_0x003d
            goto L_0x0013
        L_0x003d:
            android.media.MediaCodec r10 = r1.f57972l
            if (r10 == 0) goto L_0x0056
            r12 = 0
            r13 = 0
            long r14 = java.lang.System.nanoTime()
            r5 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r5
            long r14 = r14 / r6
            r16 = 4
            r10.queueInputBuffer(r11, r12, r13, r14, r16)
            java.util.concurrent.atomic.AtomicBoolean r5 = r1.f57964d
            r5.set(r2)
            goto L_0x0062
        L_0x0056:
            java.lang.String r0 = "videoEncoder"
            mf0.C24362h.m61217l(r0)
            throw r9
        L_0x005c:
            java.lang.String r0 = "videoEncoder"
            mf0.C24362h.m61217l(r0)
            throw r9
        L_0x0062:
            android.media.MediaCodec r5 = r1.f57972l
            if (r5 == 0) goto L_0x00df
            r6 = 10000(0x2710, double:4.9407E-320)
            int r5 = r5.dequeueOutputBuffer(r0, r6)
            r6 = -2
            if (r5 == r6) goto L_0x0077
            r6 = -1
            if (r5 == r6) goto L_0x0013
            boolean r3 = r1.m56211a((int) r5, (android.media.MediaCodec.BufferInfo) r0)
            goto L_0x0013
        L_0x0077:
            r5 = 1
            if (r4 == 0) goto L_0x0088
            com.veriff.sdk.views.camera.al$a r6 = r1.f57961a
            com.veriff.sdk.views.camera.ao$a r7 = com.veriff.sdk.views.camera.C22849ao.C22850a.VIDEO_ENCODER_FAILED
            java.lang.String r8 = "Unexpected change in video encoding format."
            r6.mo57664a((com.veriff.sdk.views.camera.C22849ao.C22850a) r7, (java.lang.String) r8)
            java.util.concurrent.atomic.AtomicBoolean r6 = r1.f57969i
            r6.set(r5)
        L_0x0088:
            java.lang.Object r6 = r1.f57962b
            monitor-enter(r6)
            android.media.MediaMuxer r7 = r1.f57970j     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x00d6
            android.media.MediaCodec r8 = r1.f57972l     // Catch:{ all -> 0x00dc }
            if (r8 == 0) goto L_0x00d0
            android.media.MediaFormat r8 = r8.getOutputFormat()     // Catch:{ all -> 0x00dc }
            int r7 = r7.addTrack(r8)     // Catch:{ all -> 0x00dc }
            r1.f57971k = r7     // Catch:{ all -> 0x00dc }
            int r7 = r1.f57975o     // Catch:{ all -> 0x00dc }
            if (r7 >= 0) goto L_0x00b0
            boolean r7 = r1.f57973m     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x00b0
            java.util.concurrent.atomic.AtomicBoolean r7 = r1.f57966f     // Catch:{ all -> 0x00dc }
            boolean r7 = r7.get()     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r7 = 0
            goto L_0x00b1
        L_0x00b0:
            r7 = 1
        L_0x00b1:
            if (r7 == 0) goto L_0x00cb
            mobi.lab.veriff.util.j r4 = com.veriff.sdk.views.camera.C22848an.f58009a     // Catch:{ all -> 0x00dc }
            java.lang.String r7 = "media muxer start"
            r4.mo60709i(r7)     // Catch:{ all -> 0x00dc }
            android.media.MediaMuxer r4 = r1.f57970j     // Catch:{ all -> 0x00dc }
            if (r4 == 0) goto L_0x00c5
            r4.start()     // Catch:{ all -> 0x00dc }
            r4 = 1
            goto L_0x00cb
        L_0x00c5:
            java.lang.String r0 = "muxer"
            mf0.C24362h.m61217l(r0)     // Catch:{ all -> 0x00dc }
            throw r9     // Catch:{ all -> 0x00dc }
        L_0x00cb:
            bf0.d r5 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00dc }
            monitor-exit(r6)
            goto L_0x0013
        L_0x00d0:
            java.lang.String r0 = "videoEncoder"
            mf0.C24362h.m61217l(r0)     // Catch:{ all -> 0x00dc }
            throw r9     // Catch:{ all -> 0x00dc }
        L_0x00d6:
            java.lang.String r0 = "muxer"
            mf0.C24362h.m61217l(r0)     // Catch:{ all -> 0x00dc }
            throw r9     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x00df:
            java.lang.String r0 = "videoEncoder"
            mf0.C24362h.m61217l(r0)
            throw r9
        L_0x00e5:
            boolean r0 = r1.m56212a((boolean) r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.C22837al.m56225e():boolean");
    }

    /* renamed from: f */
    private final void m56227f() {
        long a = this.f57958A.mo60662a(this.f57980t);
        C24465j a2 = C22848an.f58009a;
        a2.mo60709i("We haven't received a single frame, finish without frames. Time since start: " + a + "ms");
        C22849ao.C22850a aVar = a < 3000 ? C22849ao.C22850a.IMMEDIATE_TEARDOWN : C22849ao.C22850a.NO_FRAMES;
        C22838a aVar2 = this.f57961a;
        StringBuilder t = C0016g.m36t("Video capture stopped before encoder setup was done - wrote ", "a=");
        t.append(this.f57968h.get());
        t.append(" v=");
        t.append(this.f57967g.get());
        t.append(" frames");
        aVar2.mo57664a(aVar, t.toString());
    }

    /* renamed from: a */
    public static final /* synthetic */ C22861b m56207a(C22837al alVar) {
        C22861b bVar = alVar.f57977q;
        if (bVar != null) {
            return bVar;
        }
        C24362h.m61217l("audioSource");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r4.f57961a.mo57665a(com.veriff.sdk.views.camera.C22849ao.C22850a.f58016d, (java.lang.Throwable) r0);
        r4.f57969i.set(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m56216b() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f57962b     // Catch:{ IOException -> 0x002e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x002e }
            android.media.MediaMuxer r1 = new android.media.MediaMuxer     // Catch:{ all -> 0x002b }
            java.io.File r2 = r4.f57985y     // Catch:{ all -> 0x002b }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x002b }
            com.veriff.sdk.views.camera.ah r3 = r4.f57982v     // Catch:{ all -> 0x002b }
            com.veriff.sdk.views.camera.ak r3 = r3.mo57643e()     // Catch:{ all -> 0x002b }
            int r3 = r3.mo57650a()     // Catch:{ all -> 0x002b }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x002b }
            r4.f57970j = r1     // Catch:{ all -> 0x002b }
            r2 = 0
            r1.setOrientationHint(r2)     // Catch:{ all -> 0x002b }
            mobi.lab.veriff.util.j r1 = com.veriff.sdk.views.camera.C22848an.f58009a     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "Muxer initialized"
            r1.mo60709i(r2)     // Catch:{ all -> 0x002b }
            bf0.d r1 = bf0.C21050d.f52856a     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x003c
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            throw r1     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r0 = move-exception
            com.veriff.sdk.views.camera.al$a r1 = r4.f57961a
            com.veriff.sdk.views.camera.ao$a r2 = com.veriff.sdk.views.camera.C22849ao.C22850a.VIDEO_MUXER_FAILED
            r1.mo57665a((com.veriff.sdk.views.camera.C22849ao.C22850a) r2, (java.lang.Throwable) r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f57969i
            r1 = 1
            r0.set(r1)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.C22837al.m56216b():void");
    }

    /* renamed from: a */
    public void mo57661a() {
        C22848an.f58009a.mo60709i("onFramesEnd");
        if (this.f57965e.compareAndSet(false, true)) {
            C22848an.f58009a.mo60709i("stopRecording");
            boolean z = this.f57966f.get();
            if (!this.f57973m || z) {
                C24465j a = C22848an.f58009a;
                StringBuilder k = C13555b.m33972k("Audio is enabled=");
                k.append(this.f57973m);
                k.append(" failed=");
                k.append(z);
                k.append(", signaling video thread to stop");
                a.mo60709i(k.toString());
                this.f57964d.set(true);
                return;
            }
            C22848an.f58009a.mo60709i("Audio is enabled, signaling audio thread to stop");
            this.f57963c.set(true);
        } else if (!this.f57981u.get()) {
            m56227f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final MediaFormat m56220c(ImageProxy imageProxy) {
        MediaCodec mediaCodec = this.f57972l;
        if (mediaCodec != null) {
            int[] iArr = mediaCodec.getCodecInfo().getCapabilitiesForType(this.f57982v.mo57643e().mo57652c()).colorFormats;
            C24362h.m61210e(iArr, "capabilities.colorFormats");
            for (int i : iArr) {
                if (C22835aj.m56193a().contains(Integer.valueOf(i))) {
                    Size a = C22848an.m56255b(this.f57986z.mo57636a(new Size(imageProxy.getWidth(), imageProxy.getHeight())), 16);
                    int a2 = C22848an.m56251a(this.f57982v.mo57643e().mo57653d(), this.f57982v.mo57641c().mo55600a(), a);
                    C22848an.f58009a.mo60705d("Setting video encoder input size to " + a);
                    return C22848an.m56252a(this.f57982v.mo57643e().mo57652c(), a.getWidth(), a.getHeight(), i, a2, this.f57982v.mo57643e().mo57654e(), this.f57982v.mo57643e().mo57656f());
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        C24362h.m61217l("videoEncoder");
        throw null;
    }

    /* renamed from: b */
    private final CountDownLatch m56215b(ImageProxy imageProxy) {
        this.f57965e.set(false);
        this.f57964d.set(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = this.f57980t;
        this.f57959B.mo54894a(new C22845b(this, imageProxy, countDownLatch, ref$LongRef));
        return countDownLatch;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0 = com.veriff.sdk.views.camera.C22848an.m56254a();
        r0.mo60707e("audio error:size=" + r12.size + "/offset=" + r12.offset + "/timeUs=" + r12.presentationTimeUs);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0059 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m56218b(int r11, android.media.MediaCodec.BufferInfo r12) {
        /*
            r10 = this;
            android.media.MediaCodec r0 = r10.f57976p
            r1 = 0
            if (r0 == 0) goto L_0x00a3
            java.nio.ByteBuffer r0 = r0.getOutputBuffer(r11)
            r2 = 1
            if (r0 != 0) goto L_0x0016
            mobi.lab.veriff.util.j r11 = com.veriff.sdk.views.camera.C22848an.f58009a
            java.lang.String r12 = "AudioEncoder gave empty buffer"
            r11.mo60707e(r12)
            return r2
        L_0x0016:
            int r3 = r12.offset
            r0.position(r3)
            java.lang.Object r3 = r10.f57962b
            monitor-enter(r3)
            int r4 = r10.f57975o     // Catch:{ all -> 0x00a0 }
            r5 = 0
            if (r4 < 0) goto L_0x0029
            int r4 = r10.f57971k     // Catch:{ all -> 0x00a0 }
            if (r4 < 0) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0087
            int r4 = r12.size     // Catch:{ all -> 0x00a0 }
            if (r4 < 0) goto L_0x0087
            long r6 = r12.presentationTimeUs     // Catch:{ all -> 0x00a0 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0087
            java.util.concurrent.atomic.AtomicInteger r4 = r10.f57968h     // Catch:{ Exception -> 0x0059 }
            int r4 = r4.getAndIncrement()     // Catch:{ Exception -> 0x0059 }
            if (r4 != 0) goto L_0x0049
            mobi.lab.veriff.util.j r4 = com.veriff.sdk.views.camera.C22848an.f58009a     // Catch:{ Exception -> 0x0059 }
            java.lang.String r6 = "First audio sample written"
            r4.mo60709i(r6)     // Catch:{ Exception -> 0x0059 }
        L_0x0049:
            android.media.MediaMuxer r4 = r10.f57970j     // Catch:{ Exception -> 0x0059 }
            if (r4 == 0) goto L_0x0053
            int r6 = r10.f57975o     // Catch:{ Exception -> 0x0059 }
            r4.writeSampleData(r6, r0, r12)     // Catch:{ Exception -> 0x0059 }
            goto L_0x0087
        L_0x0053:
            java.lang.String r0 = "muxer"
            mf0.C24362h.m61217l(r0)     // Catch:{ Exception -> 0x0059 }
            throw r1     // Catch:{ Exception -> 0x0059 }
        L_0x0059:
            mobi.lab.veriff.util.j r0 = com.veriff.sdk.views.camera.C22848an.f58009a     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r4.<init>()     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = "audio error:size="
            r4.append(r6)     // Catch:{ all -> 0x00a0 }
            int r6 = r12.size     // Catch:{ all -> 0x00a0 }
            r4.append(r6)     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = "/offset="
            r4.append(r6)     // Catch:{ all -> 0x00a0 }
            int r6 = r12.offset     // Catch:{ all -> 0x00a0 }
            r4.append(r6)     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = "/timeUs="
            r4.append(r6)     // Catch:{ all -> 0x00a0 }
            long r6 = r12.presentationTimeUs     // Catch:{ all -> 0x00a0 }
            r4.append(r6)     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00a0 }
            r0.mo60707e(r4)     // Catch:{ all -> 0x00a0 }
        L_0x0087:
            bf0.d r0 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00a0 }
            monitor-exit(r3)
            android.media.MediaCodec r0 = r10.f57976p
            if (r0 == 0) goto L_0x009a
            r0.releaseOutputBuffer(r11, r5)
            int r11 = r12.flags
            r11 = r11 & 4
            if (r11 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r2 = 0
        L_0x0099:
            return r2
        L_0x009a:
            java.lang.String r11 = "audioEncoder"
            mf0.C24362h.m61217l(r11)
            throw r1
        L_0x00a0:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
        L_0x00a3:
            java.lang.String r11 = "audioEncoder"
            mf0.C24362h.m61217l(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.C22837al.m56218b(int, android.media.MediaCodec$BufferInfo):boolean");
    }

    /* renamed from: a */
    public void mo57662a(ImageProxy imageProxy) {
        ImageProxy imageProxy2 = imageProxy;
        C24362h.m61211f(imageProxy2, "frame");
        long nanoTime = System.nanoTime();
        if (!this.f57969i.get()) {
            if (this.f57981u.compareAndSet(false, true)) {
                C24465j a = C22848an.f58009a;
                StringBuilder k = C13555b.m33972k("First frame received with resolution ");
                k.append(imageProxy.getWidth());
                k.append('x');
                k.append(imageProxy.getHeight());
                a.mo60705d(k.toString());
                C24465j a2 = C22848an.f58009a;
                StringBuilder k2 = C13555b.m33972k("Setting up video recorder with config=");
                k2.append(this.f57982v);
                a2.mo60705d(k2.toString());
                m56216b();
                C22825a c = m56221c();
                if (!m56215b(imageProxy).await(30000, TimeUnit.MILLISECONDS)) {
                    Throwable a3 = C21637fn.m52521a("VrffVideo", "VrffAudio");
                    C24362h.m61210e(a3, "Schedulers.dumpThreads(\"VrffVideo\", \"VrffAudio\")");
                    this.f57961a.mo57666a(new C22849ao(C22849ao.C22850a.VIDEO_THREAD_STUCK, "Video thread stuck", a3));
                    this.f57981u.set(false);
                    MediaMuxer mediaMuxer = this.f57970j;
                    if (mediaMuxer != null) {
                        mediaMuxer.release();
                        C22861b bVar = this.f57977q;
                        if (bVar == null) {
                            return;
                        }
                        if (bVar != null) {
                            bVar.mo57632c();
                            return;
                        } else {
                            C24362h.m61217l("audioSource");
                            throw null;
                        }
                    } else {
                        C24362h.m61217l("muxer");
                        throw null;
                    }
                } else if (this.f57972l == null) {
                    this.f57961a.mo57664a(C22849ao.C22850a.VIDEO_ENCODER_FAILED, "Video encoder init failed");
                    this.f57969i.set(true);
                    return;
                } else {
                    if (c != null) {
                        m56208a(c);
                    }
                    this.f57961a.mo57668a(this.f57982v.mo57643e().mo57651b(), imageProxy.getWidth(), imageProxy.getHeight());
                }
            } else if (nanoTime - this.f57979s < this.f57978r) {
                return;
            }
            this.f57979s = nanoTime;
            try {
                MediaCodec mediaCodec = this.f57972l;
                if (mediaCodec != null) {
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000);
                    if (dequeueInputBuffer != -1) {
                        MediaCodec mediaCodec2 = this.f57972l;
                        if (mediaCodec2 != null) {
                            ByteBuffer inputBuffer = mediaCodec2.getInputBuffer(dequeueInputBuffer);
                            Integer valueOf = inputBuffer != null ? Integer.valueOf(inputBuffer.remaining()) : null;
                            MediaCodec mediaCodec3 = this.f57972l;
                            if (mediaCodec3 != null) {
                                ImageProxy a4 = m56206a(inputBuffer, dequeueInputBuffer, mediaCodec3);
                                if (a4 == null) {
                                    C22848an.f58009a.mo60705d("input image null");
                                    return;
                                }
                                C22855ar.m56261a(this.f57986z, imageProxy2, a4);
                                int width = imageProxy.getWidth();
                                ImageProxy.PlaneProxy planeProxy = a4.getPlanes()[0];
                                C24362h.m61210e(planeProxy, "image.planes[0]");
                                int intValue = valueOf != null ? valueOf.intValue() : ((planeProxy.getRowStride() * width) * 3) / 2;
                                MediaCodec mediaCodec4 = this.f57972l;
                                if (mediaCodec4 != null) {
                                    mediaCodec4.queueInputBuffer(dequeueInputBuffer, 0, intValue, System.nanoTime() / ((long) 1000), 0);
                                } else {
                                    C24362h.m61217l("videoEncoder");
                                    throw null;
                                }
                            } else {
                                C24362h.m61217l("videoEncoder");
                                throw null;
                            }
                        } else {
                            C24362h.m61217l("videoEncoder");
                            throw null;
                        }
                    }
                } else {
                    C24362h.m61217l("videoEncoder");
                    throw null;
                }
            } catch (Exception e) {
                C22848an.f58009a.mo60708e("Failed to dequeue input buffer", e);
                this.f57961a.mo57665a(C22849ao.C22850a.VIDEO_ENCODER_FAILED, (Throwable) e);
                this.f57969i.set(true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final MediaFormat m56214b(C22825a aVar) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(aVar.mo57622b(), aVar.mo57623c(), aVar.mo57624d());
        C24362h.m61210e(createAudioFormat, "MediaFormat.createAudioF…ate, params.channelCount)");
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", aVar.mo57625e());
        return createAudioFormat;
    }

    /* renamed from: a */
    private final ImageProxy m56206a(ByteBuffer byteBuffer, int i, MediaCodec mediaCodec) {
        if (!this.f57982v.mo57643e().mo57658h()) {
            MediaCodec mediaCodec2 = this.f57972l;
            if (mediaCodec2 != null) {
                Image inputImage = mediaCodec2.getInputImage(i);
                if (inputImage != null) {
                    return new AndroidImageProxy(inputImage);
                }
                return null;
            }
            C24362h.m61217l("videoEncoder");
            throw null;
        } else if (byteBuffer == null) {
            return null;
        } else {
            MediaFormat inputFormat = mediaCodec.getInputFormat();
            C24362h.m61210e(inputFormat, "codec.inputFormat");
            int integer = inputFormat.getInteger("color-format");
            return C22851ap.f58023a.mo57680a(byteBuffer, inputFormat.getInteger("width"), inputFormat.getInteger("height"), integer);
        }
    }

    /* renamed from: a */
    private final void m56208a(C22825a aVar) {
        this.f57960C.mo54894a(new C22846c(this, aVar));
    }

    /* renamed from: a */
    private final boolean m56212a(boolean z) {
        try {
            C22848an.f58009a.mo60709i("videoEncoder stop");
            MediaCodec mediaCodec = this.f57972l;
            if (mediaCodec != null) {
                mediaCodec.stop();
                MediaCodec mediaCodec2 = this.f57972l;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                    try {
                        synchronized (this.f57962b) {
                            if (z) {
                                MediaMuxer mediaMuxer = this.f57970j;
                                if (mediaMuxer != null) {
                                    mediaMuxer.stop();
                                } else {
                                    C24362h.m61217l("muxer");
                                    throw null;
                                }
                            }
                            MediaMuxer mediaMuxer2 = this.f57970j;
                            if (mediaMuxer2 != null) {
                                mediaMuxer2.release();
                                C21050d dVar = C21050d.f52856a;
                            } else {
                                C24362h.m61217l("muxer");
                                throw null;
                            }
                        }
                    } catch (Exception e) {
                        if (this.f57968h.get() < ((!this.f57973m || this.f57966f.get()) ? 0 : 2)) {
                            m56227f();
                        } else {
                            this.f57961a.mo57666a(new C22849ao(C22849ao.C22850a.VIDEO_MUXER_FAILED, "Muxer stop failed", e));
                        }
                        this.f57969i.set(true);
                    } catch (Throwable th) {
                        throw th;
                    }
                    this.f57965e.set(true);
                    C22848an.f58009a.mo60709i("Video encode thread end");
                    return this.f57969i.get();
                }
                C24362h.m61217l("videoEncoder");
                throw null;
            }
            C24362h.m61217l("videoEncoder");
            throw null;
        } catch (Exception e2) {
            this.f57961a.mo57666a(new C22849ao(C22849ao.C22850a.VIDEO_ENCODER_FAILED, "Encoder stop failed", e2));
            this.f57969i.set(true);
        }
    }

    /* renamed from: a */
    private final boolean m56211a(int i, MediaCodec.BufferInfo bufferInfo) {
        if (i < 0) {
            C24465j a = C22848an.f58009a;
            a.mo60707e("Output buffer has negative index " + i);
            return false;
        }
        MediaCodec mediaCodec = this.f57972l;
        if (mediaCodec != null) {
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
            if (outputBuffer == null) {
                C22848an.f58009a.mo60705d("Output buffer was null");
                return false;
            } else if ((bufferInfo.flags & 2) != 0) {
                C22848an.f58009a.mo60705d("Dropping buffer config");
                MediaCodec mediaCodec2 = this.f57972l;
                if (mediaCodec2 != null) {
                    mediaCodec2.releaseOutputBuffer(i, false);
                    return false;
                }
                C24362h.m61217l("videoEncoder");
                throw null;
            } else {
                if (this.f57973m) {
                    this.f57974n.await();
                }
                if (this.f57971k >= 0 && bufferInfo.size > 0) {
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    bufferInfo.presentationTimeUs = System.nanoTime() / ((long) 1000);
                    synchronized (this.f57962b) {
                        if (this.f57967g.getAndIncrement() == 0) {
                            C22848an.f58009a.mo60709i("First video sample written");
                        }
                        MediaMuxer mediaMuxer = this.f57970j;
                        if (mediaMuxer != null) {
                            mediaMuxer.writeSampleData(this.f57971k, outputBuffer, bufferInfo);
                            C21050d dVar = C21050d.f52856a;
                        } else {
                            C24362h.m61217l("muxer");
                            throw null;
                        }
                    }
                }
                MediaCodec mediaCodec3 = this.f57972l;
                if (mediaCodec3 != null) {
                    mediaCodec3.releaseOutputBuffer(i, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        return true;
                    }
                    return false;
                }
                C24362h.m61217l("videoEncoder");
                throw null;
            }
        } else {
            C24362h.m61217l("videoEncoder");
            throw null;
        }
    }
}
