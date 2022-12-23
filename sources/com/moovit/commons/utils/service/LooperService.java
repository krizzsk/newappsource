package com.moovit.commons.utils.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executor;
import p001a0.C0016g;

public abstract class LooperService extends Service {

    /* renamed from: b */
    public volatile Looper f41041b;

    /* renamed from: c */
    public volatile C15783a f41042c;

    /* renamed from: d */
    public final String f41043d;

    /* renamed from: e */
    public int f41044e = 2;

    /* renamed from: com.moovit.commons.utils.service.LooperService$a */
    public final class C15783a extends Handler implements Executor {
        public C15783a(Looper looper) {
            super(looper);
        }

        public final void execute(Runnable runnable) {
            post(runnable);
        }

        public final void handleMessage(Message message) {
            LooperService.this.mo44582g(message);
        }
    }

    public LooperService(String str) {
        this.f41043d = str;
    }

    /* renamed from: d */
    public abstract void mo19675d(int i, Intent intent);

    /* renamed from: g */
    public void mo44582g(Message message) {
        if (message.what == 1) {
            mo19675d(message.arg1, (Intent) message.obj);
        }
    }

    /* renamed from: h */
    public void mo19676h(Message message) {
        this.f41042c.sendMessage(message);
    }

    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread(C0016g.m31o(C13555b.m33972k("LooperService["), this.f41043d, "]"));
        handlerThread.start();
        this.f41041b = handlerThread.getLooper();
        this.f41042c = new C15783a(this.f41041b);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f41041b.quit();
        this.f41041b = null;
        this.f41042c = null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Message obtainMessage = this.f41042c.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.arg1 = i2;
        obtainMessage.obj = intent;
        mo19676h(obtainMessage);
        return this.f41044e;
    }
}
