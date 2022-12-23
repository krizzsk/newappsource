package p099ga;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;
import p099ga.C4865c1;
import p150ka.C5533a;
import p150ka.C5534b;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p304x.C7029b1;
import p583jk.C17875h;

/* renamed from: ga.d1 */
public final class C4874d1 {

    /* renamed from: a */
    public final Context f16402a;

    /* renamed from: b */
    public final Handler f16403b;

    /* renamed from: c */
    public final C4875a f16404c;

    /* renamed from: d */
    public final AudioManager f16405d;

    /* renamed from: e */
    public C4876b f16406e;

    /* renamed from: f */
    public int f16407f = 3;

    /* renamed from: g */
    public int f16408g;

    /* renamed from: h */
    public boolean f16409h;

    /* renamed from: ga.d1$a */
    public interface C4875a {
    }

    /* renamed from: ga.d1$b */
    public final class C4876b extends BroadcastReceiver {

        /* renamed from: b */
        public static final /* synthetic */ int f16410b = 0;

        public C4876b() {
        }

        public final void onReceive(Context context, Intent intent) {
            C4874d1 d1Var = C4874d1.this;
            d1Var.f16403b.post(new C7029b1(d1Var, 4));
        }
    }

    public C4874d1(Context context, Handler handler, C4865c1.C4867b bVar) {
        boolean z;
        Context applicationContext = context.getApplicationContext();
        this.f16402a = applicationContext;
        this.f16403b = handler;
        this.f16404c = bVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        C17875h.m44306q(audioManager);
        this.f16405d = audioManager;
        this.f16408g = m12342a(audioManager, 3);
        int i = this.f16407f;
        if (C6774a0.f20959a >= 23) {
            z = audioManager.isStreamMute(i);
        } else if (m12342a(audioManager, i) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f16409h = z;
        C4876b bVar2 = new C4876b();
        try {
            applicationContext.registerReceiver(bVar2, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f16406e = bVar2;
        } catch (RuntimeException e) {
            C6776b0.m15968a("Error registering stream volume receiver", e);
        }
    }

    /* renamed from: a */
    public static int m12342a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            C6776b0.m15968a(sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: b */
    public final void mo20447b(int i) {
        if (this.f16407f != i) {
            this.f16407f = i;
            mo20448c();
            C4865c1.C4867b bVar = (C4865c1.C4867b) this.f16404c;
            C5533a R = C4865c1.m12188R(C4865c1.this.f16327o);
            if (!R.equals(C4865c1.this.f16313J)) {
                C4865c1 c1Var = C4865c1.this;
                c1Var.f16313J = R;
                Iterator<C5534b> it = c1Var.f16323k.iterator();
                while (it.hasNext()) {
                    it.next().mo16512Y();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo20448c() {
        boolean z;
        int a = m12342a(this.f16405d, this.f16407f);
        AudioManager audioManager = this.f16405d;
        int i = this.f16407f;
        if (C6774a0.f20959a >= 23) {
            z = audioManager.isStreamMute(i);
        } else if (m12342a(audioManager, i) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f16408g != a || this.f16409h != z) {
            this.f16408g = a;
            this.f16409h = z;
            Iterator<C5534b> it = C4865c1.this.f16323k.iterator();
            while (it.hasNext()) {
                it.next().mo16511U();
            }
        }
    }
}
