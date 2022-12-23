package p099ga;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p099ga.C4865c1;
import p125ia.C5316d;
import p277ub.C6774a0;

/* renamed from: ga.d */
public final class C4869d {

    /* renamed from: a */
    public final AudioManager f16361a;

    /* renamed from: b */
    public final C4870a f16362b;

    /* renamed from: c */
    public C4871b f16363c;

    /* renamed from: d */
    public C5316d f16364d;

    /* renamed from: e */
    public int f16365e;

    /* renamed from: f */
    public int f16366f;

    /* renamed from: g */
    public float f16367g = 1.0f;

    /* renamed from: h */
    public AudioFocusRequest f16368h;

    /* renamed from: ga.d$a */
    public class C4870a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        public final Handler f16369a;

        public C4870a(Handler handler) {
            this.f16369a = handler;
        }

        public final void onAudioFocusChange(int i) {
            this.f16369a.post(new C4863c(this, i));
        }
    }

    /* renamed from: ga.d$b */
    public interface C4871b {
    }

    public C4869d(Context context, Handler handler, C4865c1.C4867b bVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f16361a = audioManager;
        this.f16363c = bVar;
        this.f16362b = new C4870a(handler);
        this.f16365e = 0;
    }

    /* renamed from: a */
    public final void mo20431a() {
        if (this.f16365e != 0) {
            if (C6774a0.f20959a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f16368h;
                if (audioFocusRequest != null) {
                    this.f16361a.abandonAudioFocusRequest(audioFocusRequest);
                }
            } else {
                this.f16361a.abandonAudioFocus(this.f16362b);
            }
            mo20433c(0);
        }
    }

    /* renamed from: b */
    public final void mo20432b(int i) {
        C4871b bVar = this.f16363c;
        if (bVar != null) {
            C4865c1.C4867b bVar2 = (C4865c1.C4867b) bVar;
            boolean z = C4865c1.this.mo20407z();
            C4865c1 c1Var = C4865c1.this;
            int i2 = 1;
            if (z && i != 1) {
                i2 = 2;
            }
            c1Var.mo20381a0(i, i2, z);
        }
    }

    /* renamed from: c */
    public final void mo20433c(int i) {
        float f;
        if (this.f16365e != i) {
            this.f16365e = i;
            if (i == 3) {
                f = 0.2f;
            } else {
                f = 1.0f;
            }
            if (this.f16367g != f) {
                this.f16367g = f;
                C4871b bVar = this.f16363c;
                if (bVar != null) {
                    C4865c1 c1Var = C4865c1.this;
                    c1Var.mo20375V(1, 2, Float.valueOf(c1Var.f16308E * c1Var.f16326n.f16367g));
                }
            }
        }
    }

    /* renamed from: d */
    public final int mo20434d(int i, boolean z) {
        boolean z2;
        int i2;
        AudioFocusRequest.Builder builder;
        boolean z3;
        int i3 = 1;
        if (i == 1 || this.f16366f != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            mo20431a();
            if (z) {
                return 1;
            }
            return -1;
        } else if (!z) {
            return -1;
        } else {
            if (this.f16365e != 1) {
                if (C6774a0.f20959a >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f16368h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            builder = new AudioFocusRequest.Builder(this.f16366f);
                        } else {
                            builder = new AudioFocusRequest.Builder(this.f16368h);
                        }
                        C5316d dVar = this.f16364d;
                        if (dVar == null || dVar.f17512a != 1) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        dVar.getClass();
                        this.f16368h = builder.setAudioAttributes(dVar.mo21095a()).setWillPauseWhenDucked(z3).setOnAudioFocusChangeListener(this.f16362b).build();
                    }
                    i2 = this.f16361a.requestAudioFocus(this.f16368h);
                } else {
                    AudioManager audioManager = this.f16361a;
                    C4870a aVar = this.f16362b;
                    C5316d dVar2 = this.f16364d;
                    dVar2.getClass();
                    i2 = audioManager.requestAudioFocus(aVar, C6774a0.m15957q(dVar2.f17514c), this.f16366f);
                }
                if (i2 == 1) {
                    mo20433c(1);
                } else {
                    mo20433c(0);
                    i3 = -1;
                }
            }
            return i3;
        }
    }
}
