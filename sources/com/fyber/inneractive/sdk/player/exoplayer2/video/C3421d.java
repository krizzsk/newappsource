package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;

@TargetApi(16)
/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.d */
public final class C3421d {

    /* renamed from: a */
    public final C3422a f12221a;

    /* renamed from: b */
    public final long f12222b;

    /* renamed from: c */
    public final long f12223c;

    /* renamed from: d */
    public long f12224d;

    /* renamed from: e */
    public long f12225e;

    /* renamed from: f */
    public long f12226f;

    /* renamed from: g */
    public boolean f12227g;

    /* renamed from: h */
    public long f12228h;

    /* renamed from: i */
    public long f12229i;

    /* renamed from: j */
    public long f12230j;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.d$a */
    public static final class C3422a implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: e */
        public static final C3422a f12231e = new C3422a();

        /* renamed from: a */
        public volatile long f12232a;

        /* renamed from: b */
        public final Handler f12233b;

        /* renamed from: c */
        public Choreographer f12234c;

        /* renamed from: d */
        public int f12235d;

        public C3422a() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f12233b = handler;
            handler.sendEmptyMessage(0);
        }

        /* renamed from: a */
        public static C3422a m8635a() {
            return f12231e;
        }

        public void doFrame(long j) {
            this.f12232a = j;
            this.f12234c.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f12234c = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                int i2 = this.f12235d + 1;
                this.f12235d = i2;
                if (i2 == 1) {
                    this.f12234c.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = this.f12235d - 1;
                this.f12235d = i3;
                if (i3 == 0) {
                    this.f12234c.removeFrameCallback(this);
                    this.f12232a = 0;
                }
                return true;
            }
        }
    }

    public C3421d(Context context) {
        this((double) m8633a(context), true);
    }

    /* renamed from: a */
    public final boolean mo14618a(long j, long j2) {
        return Math.abs((j2 - this.f12228h) - (j - this.f12229i)) > 20000000;
    }

    public C3421d(double d, boolean z) {
        if (z) {
            this.f12221a = C3422a.m8635a();
            long j = (long) (1.0E9d / d);
            this.f12222b = j;
            this.f12223c = (j * 80) / 100;
            return;
        }
        this.f12221a = null;
        this.f12222b = -1;
        this.f12223c = -1;
    }

    /* renamed from: a */
    public static float m8633a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }
}
