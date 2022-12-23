package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;

public interface AudioRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        /* access modifiers changed from: private */
        public final AudioRendererEventListener listener;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$a */
        public class C3027a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f10351a;

            public C3027a(DecoderCounters decoderCounters) {
                this.f10351a = decoderCounters;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioEnabled(this.f10351a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$b */
        public class C3028b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f10353a;

            /* renamed from: b */
            public final /* synthetic */ long f10354b;

            /* renamed from: c */
            public final /* synthetic */ long f10355c;

            public C3028b(String str, long j, long j2) {
                this.f10353a = str;
                this.f10354b = j;
                this.f10355c = j2;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioDecoderInitialized(this.f10353a, this.f10354b, this.f10355c);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$c */
        public class C3029c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C3226i f10357a;

            public C3029c(C3226i iVar) {
                this.f10357a = iVar;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioInputFormatChanged(this.f10357a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$d */
        public class C3030d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f10359a;

            /* renamed from: b */
            public final /* synthetic */ long f10360b;

            /* renamed from: c */
            public final /* synthetic */ long f10361c;

            public C3030d(int i, long j, long j2) {
                this.f10359a = i;
                this.f10360b = j;
                this.f10361c = j2;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioTrackUnderrun(this.f10359a, this.f10360b, this.f10361c);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$e */
        public class C3031e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f10363a;

            public C3031e(DecoderCounters decoderCounters) {
                this.f10363a = decoderCounters;
            }

            public void run() {
                this.f10363a.ensureUpdated();
                EventDispatcher.this.listener.onAudioDisabled(this.f10363a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$f */
        public class C3032f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f10365a;

            public C3032f(int i) {
                this.f10365a = i;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioSessionId(this.f10365a);
            }
        }

        public EventDispatcher(Handler handler2, AudioRendererEventListener audioRendererEventListener) {
            Handler handler3;
            if (audioRendererEventListener != null) {
                handler3 = (Handler) C3380a.m8503a(handler2);
            } else {
                handler3 = null;
            }
            this.handler = handler3;
            this.listener = audioRendererEventListener;
        }

        public void audioSessionId(int i) {
            if (this.listener != null) {
                this.handler.post(new C3032f(i));
            }
        }

        public void audioTrackUnderrun(int i, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new C3030d(i, j, j2));
            }
        }

        public void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new C3028b(str, j, j2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C3031e(decoderCounters));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C3027a(decoderCounters));
            }
        }

        public void inputFormatChanged(C3226i iVar) {
            if (this.listener != null) {
                this.handler.post(new C3029c(iVar));
            }
        }
    }

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(C3226i iVar);

    void onAudioSessionId(int i);

    void onAudioTrackUnderrun(int i, long j, long j2);
}
