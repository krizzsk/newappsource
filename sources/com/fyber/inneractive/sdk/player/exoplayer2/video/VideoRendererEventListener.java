package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;

public interface VideoRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        /* access modifiers changed from: private */
        public final VideoRendererEventListener listener;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$a */
        public class C3410a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f12189a;

            public C3410a(DecoderCounters decoderCounters) {
                this.f12189a = decoderCounters;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoEnabled(this.f12189a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$b */
        public class C3411b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f12191a;

            /* renamed from: b */
            public final /* synthetic */ long f12192b;

            /* renamed from: c */
            public final /* synthetic */ long f12193c;

            public C3411b(String str, long j, long j2) {
                this.f12191a = str;
                this.f12192b = j;
                this.f12193c = j2;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoDecoderInitialized(this.f12191a, this.f12192b, this.f12193c);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$c */
        public class C3412c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C3226i f12195a;

            public C3412c(C3226i iVar) {
                this.f12195a = iVar;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoInputFormatChanged(this.f12195a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$d */
        public class C3413d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f12197a;

            /* renamed from: b */
            public final /* synthetic */ long f12198b;

            public C3413d(int i, long j) {
                this.f12197a = i;
                this.f12198b = j;
            }

            public void run() {
                EventDispatcher.this.listener.onDroppedFrames(this.f12197a, this.f12198b);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$e */
        public class C3414e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f12200a;

            /* renamed from: b */
            public final /* synthetic */ int f12201b;

            /* renamed from: c */
            public final /* synthetic */ int f12202c;

            /* renamed from: d */
            public final /* synthetic */ float f12203d;

            public C3414e(int i, int i2, int i3, float f) {
                this.f12200a = i;
                this.f12201b = i2;
                this.f12202c = i3;
                this.f12203d = f;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoSizeChanged(this.f12200a, this.f12201b, this.f12202c, this.f12203d);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$f */
        public class C3415f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Surface f12205a;

            public C3415f(Surface surface) {
                this.f12205a = surface;
            }

            public void run() {
                EventDispatcher.this.listener.onRenderedFirstFrame(this.f12205a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$g */
        public class C3416g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f12207a;

            public C3416g(DecoderCounters decoderCounters) {
                this.f12207a = decoderCounters;
            }

            public void run() {
                this.f12207a.ensureUpdated();
                EventDispatcher.this.listener.onVideoDisabled(this.f12207a);
            }
        }

        public EventDispatcher(Handler handler2, VideoRendererEventListener videoRendererEventListener) {
            Handler handler3;
            if (videoRendererEventListener != null) {
                handler3 = (Handler) C3380a.m8503a(handler2);
            } else {
                handler3 = null;
            }
            this.handler = handler3;
            this.listener = videoRendererEventListener;
        }

        public void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new C3411b(str, j, j2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C3416g(decoderCounters));
            }
        }

        public void droppedFrames(int i, long j) {
            if (this.listener != null) {
                this.handler.post(new C3413d(i, j));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C3410a(decoderCounters));
            }
        }

        public void inputFormatChanged(C3226i iVar) {
            if (this.listener != null) {
                this.handler.post(new C3412c(iVar));
            }
        }

        public void renderedFirstFrame(Surface surface) {
            if (this.listener != null) {
                this.handler.post(new C3415f(surface));
            }
        }

        public void videoSizeChanged(int i, int i2, int i3, float f) {
            if (this.listener != null) {
                this.handler.post(new C3414e(i, i2, i3, f));
            }
        }
    }

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(Surface surface);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(C3226i iVar);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
