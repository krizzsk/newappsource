package androidx.camera.core;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.widget.C0436m1;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0587k;
import androidx.camera.core.impl.C0588l;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.C0595r;
import androidx.camera.core.impl.C0597s;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.play.core.appupdate.C14226d;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import p054d0.C4268a1;
import p054d0.C4271b1;
import p054d0.C4289j0;
import p054d0.C4324z0;
import p066e0.C4415a0;
import p115i0.C5231g;
import p695od.C18728c;

public final class VideoCapture extends UseCase {

    /* renamed from: s */
    public static final C0543c f1872s = new C0543c();

    /* renamed from: l */
    public HandlerThread f1873l;

    /* renamed from: m */
    public HandlerThread f1874m;

    /* renamed from: n */
    public MediaCodec f1875n;

    /* renamed from: o */
    public MediaCodec f1876o;

    /* renamed from: p */
    public SessionConfig.C0566b f1877p;

    /* renamed from: q */
    public Surface f1878q;

    /* renamed from: r */
    public C4415a0 f1879r;

    public enum VideoEncoderInitStatus {
        VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED,
        VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED,
        VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE,
        VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED
    }

    /* renamed from: androidx.camera.core.VideoCapture$a */
    public static class C0541a {
        /* renamed from: a */
        public static int m1539a(MediaCodec.CodecException codecException) {
            return codecException.getErrorCode();
        }
    }

    /* renamed from: androidx.camera.core.VideoCapture$b */
    public static final class C0542b implements C0595r.C0596a<VideoCapture, C0597s, C0542b> {

        /* renamed from: a */
        public final C0589m f1880a;

        public C0542b(C0589m mVar) {
            Object obj;
            Class<VideoCapture> cls = VideoCapture.class;
            this.f1880a = mVar;
            Object obj2 = null;
            try {
                obj = mVar.mo2422a(C5231g.f17324u);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls2 = (Class) obj;
            if (cls2 == null || cls2.equals(cls)) {
                this.f1880a.mo2503w(C5231g.f17324u, cls);
                C0589m mVar2 = this.f1880a;
                C0572a aVar = C5231g.f17323t;
                mVar2.getClass();
                try {
                    obj2 = mVar2.mo2422a(aVar);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    this.f1880a.mo2503w(C5231g.f17323t, cls.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        public final C0588l getMutableConfig() {
            return this.f1880a;
        }

        public final C0595r getUseCaseConfig() {
            return new C0597s(C0590n.m1678s(this.f1880a));
        }
    }

    /* renamed from: androidx.camera.core.VideoCapture$c */
    public static final class C0543c {

        /* renamed from: a */
        public static final C0597s f1881a;

        static {
            Size size = new Size(1920, 1080);
            C0589m t = C0589m.m1674t();
            new C0542b(t);
            t.mo2503w(C0597s.f2035y, 30);
            t.mo2503w(C0597s.f2036z, 8388608);
            t.mo2503w(C0597s.f2030A, 1);
            t.mo2503w(C0597s.f2031B, 64000);
            t.mo2503w(C0597s.f2032C, Integer.valueOf(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED));
            t.mo2503w(C0597s.f2033D, 1);
            t.mo2503w(C0597s.f2034E, 1024);
            t.mo2503w(C0587k.f2010k, size);
            t.mo2503w(C0595r.f2028q, 3);
            t.mo2503w(C0587k.f2005f, 1);
            f1881a = new C0597s(C0590n.m1678s(t));
        }
    }

    /* renamed from: z */
    public static MediaFormat m1528z(C0597s sVar, Size size) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", 2130708361);
        sVar.getClass();
        createVideoFormat.setInteger("bitrate", ((Integer) ((C0590n) sVar.getConfig()).mo2422a(C0597s.f2036z)).intValue());
        createVideoFormat.setInteger("frame-rate", ((Integer) ((C0590n) sVar.getConfig()).mo2422a(C0597s.f2035y)).intValue());
        createVideoFormat.setInteger("i-frame-interval", ((Integer) ((C0590n) sVar.getConfig()).mo2422a(C0597s.f2030A)).intValue());
        return createVideoFormat;
    }

    /* renamed from: A */
    public final void mo2393A(boolean z) {
        C4415a0 a0Var = this.f1879r;
        if (a0Var != null) {
            MediaCodec mediaCodec = this.f1875n;
            a0Var.mo2450a();
            this.f1879r.mo2453d().addListener(new C4324z0(z, mediaCodec), C14226d.m35358z0());
            if (z) {
                this.f1875n = null;
            }
            this.f1878q = null;
            this.f1879r = null;
        }
    }

    /* renamed from: B */
    public final void mo2394B() {
        this.f1873l.quitSafely();
        this.f1874m.quitSafely();
        MediaCodec mediaCodec = this.f1876o;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f1876o = null;
        }
        if (this.f1878q != null) {
            mo2393A(true);
        }
    }

    /* renamed from: C */
    public final void mo2395C(Size size, String str) {
        C0597s sVar = (C0597s) this.f1865f;
        this.f1875n.reset();
        VideoEncoderInitStatus videoEncoderInitStatus = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
        try {
            this.f1875n.configure(m1528z(sVar, size), (Surface) null, (MediaCrypto) null, 1);
            if (this.f1878q != null) {
                mo2393A(false);
            }
            Surface createInputSurface = this.f1875n.createInputSurface();
            this.f1878q = createInputSurface;
            this.f1877p = SessionConfig.C0566b.m1604d(sVar);
            C4415a0 a0Var = this.f1879r;
            if (a0Var != null) {
                a0Var.mo2450a();
            }
            C4415a0 a0Var2 = new C4415a0(this.f1878q, size, mo2370e());
            this.f1879r = a0Var2;
            C18728c<Void> d = a0Var2.mo2453d();
            Objects.requireNonNull(createInputSurface);
            d.addListener(new C4268a1(createInputSurface, 0), C14226d.m35358z0());
            SessionConfig.C0566b bVar = this.f1877p;
            bVar.f1939a.add(this.f1879r);
            SessionConfig.C0566b bVar2 = this.f1877p;
            bVar2.f1943e.add(new C4271b1(this, str, size));
            mo2390y(this.f1877p.mo2460c());
            throw null;
        } catch (MediaCodec.CodecException e) {
            if (Build.VERSION.SDK_INT >= 23) {
                int a = C0541a.m1539a(e);
                e.getDiagnosticInfo();
                if (a == 1100) {
                    C4289j0.m11435b("VideoCapture");
                    VideoEncoderInitStatus videoEncoderInitStatus2 = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
                } else if (a == 1101) {
                    C4289j0.m11435b("VideoCapture");
                    VideoEncoderInitStatus videoEncoderInitStatus3 = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
                }
            } else {
                VideoEncoderInitStatus videoEncoderInitStatus4 = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
            }
        } catch (IllegalArgumentException | IllegalStateException unused) {
            VideoEncoderInitStatus videoEncoderInitStatus5 = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
        }
    }

    /* renamed from: D */
    public final void mo2396D() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C14226d.m35358z0().execute(new C0436m1(this, 3));
            return;
        }
        C4289j0.m11435b("VideoCapture");
        SessionConfig.C0566b bVar = this.f1877p;
        bVar.f1939a.clear();
        bVar.f1940b.f1977a.clear();
        SessionConfig.C0566b bVar2 = this.f1877p;
        bVar2.f1939a.add(this.f1879r);
        mo2390y(this.f1877p.mo2460c());
        Iterator it = this.f1860a.iterator();
        while (it.hasNext()) {
            ((UseCase.C0540c) it.next()).mo2237b(this);
        }
    }

    /* renamed from: d */
    public final C0595r<?> mo2369d(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config a = useCaseConfigFactory.mo2468a(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE, 1);
        if (z) {
            f1872s.getClass();
            a = C13715c.m34250p(a, C0543c.f1881a);
        }
        if (a == null) {
            return null;
        }
        return new C0597s(C0590n.m1678s(((C0542b) mo2373h(a)).f1880a));
    }

    /* renamed from: h */
    public final C0595r.C0596a<?, ?, ?> mo2373h(Config config) {
        return new C0542b(C0589m.m1675u(config));
    }

    /* renamed from: p */
    public final void mo2381p() {
        this.f1873l = new HandlerThread("CameraX-video encoding thread");
        this.f1874m = new HandlerThread("CameraX-audio encoding thread");
        this.f1873l.start();
        new Handler(this.f1873l.getLooper());
        this.f1874m.start();
        new Handler(this.f1874m.getLooper());
    }

    /* renamed from: s */
    public final void mo2384s() {
        mo2396D();
        mo2394B();
    }

    /* renamed from: u */
    public final void mo2386u() {
        mo2396D();
    }

    /* renamed from: v */
    public final Size mo2387v(Size size) {
        if (this.f1878q != null) {
            this.f1875n.stop();
            this.f1875n.release();
            this.f1876o.stop();
            this.f1876o.release();
            mo2393A(false);
        }
        try {
            this.f1875n = MediaCodec.createEncoderByType("video/avc");
            this.f1876o = MediaCodec.createEncoderByType("audio/mp4a-latm");
            mo2395C(size, mo2368c());
            mo2376k();
            return size;
        } catch (IOException e) {
            StringBuilder k = C13555b.m33972k("Unable to create MediaCodec due to: ");
            k.append(e.getCause());
            throw new IllegalStateException(k.toString());
        }
    }
}
