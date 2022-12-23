package p099ga;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import p099ga.C4865c1;

/* renamed from: ga.b */
public final class C4858b {

    /* renamed from: a */
    public final Context f16288a;

    /* renamed from: b */
    public final C4859a f16289b;

    /* renamed from: c */
    public boolean f16290c;

    /* renamed from: ga.b$a */
    public final class C4859a extends BroadcastReceiver implements Runnable {

        /* renamed from: b */
        public final C4860b f16291b;

        /* renamed from: c */
        public final Handler f16292c;

        public C4859a(Handler handler, C4865c1.C4867b bVar) {
            this.f16292c = handler;
            this.f16291b = bVar;
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f16292c.post(this);
            }
        }

        public final void run() {
            if (C4858b.this.f16290c) {
                C4865c1.this.mo20381a0(-1, 3, false);
            }
        }
    }

    /* renamed from: ga.b$b */
    public interface C4860b {
    }

    public C4858b(Context context, Handler handler, C4865c1.C4867b bVar) {
        this.f16288a = context.getApplicationContext();
        this.f16289b = new C4859a(handler, bVar);
    }

    /* renamed from: a */
    public final void mo20352a() {
        if (this.f16290c) {
            this.f16288a.unregisterReceiver(this.f16289b);
            this.f16290c = false;
        }
    }
}
