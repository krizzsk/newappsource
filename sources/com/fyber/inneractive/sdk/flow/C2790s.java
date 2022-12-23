package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.content.res.Resources;
import android.os.CountDownTimer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3668a;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3741w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.s */
public abstract class C2790s<AdContent extends C2776j, EventsListener extends InneractiveUnitController.EventsListener> extends C2778l<AdContent, EventsListener> implements C2812c {

    /* renamed from: k */
    public C2812c.C2813a f9633k;

    /* renamed from: l */
    public Runnable f9634l;

    /* renamed from: m */
    public C3741w0 f9635m;

    /* renamed from: n */
    public Runnable f9636n;

    /* renamed from: o */
    public C3741w0 f9637o;

    /* renamed from: p */
    public boolean f9638p = false;

    /* renamed from: q */
    public boolean f9639q = false;

    /* renamed from: r */
    public long f9640r;

    /* renamed from: s */
    public boolean f9641s = false;

    /* renamed from: t */
    public boolean f9642t = false;

    /* renamed from: u */
    public final C3668a f9643u = new C3668a();

    /* renamed from: v */
    public CountDownTimer f9644v;

    /* renamed from: com.fyber.inneractive.sdk.flow.s$a */
    public class C2791a extends CountDownTimer {
        public C2791a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            CountDownTimer countDownTimer = C2790s.this.f9644v;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            C2790s.this.mo13577e(false);
        }

        public void onTick(long j) {
            int i = ((int) j) / 1000;
            C2812c.C2813a aVar = C2790s.this.f9633k;
            if (aVar != null) {
                aVar.updateCloseCountdown(i);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.s$b */
    public class C2792b implements C3741w0.C3743b {
        public C2792b() {
        }

        /* renamed from: a */
        public void mo13200a(C3741w0 w0Var) {
            C3714n.f12902b.post(C2790s.this.f9634l);
            C2790s sVar = C2790s.this;
            C3741w0 w0Var2 = sVar.f9635m;
            if (w0Var2 != null) {
                w0Var2.f12943e = null;
                sVar.f9635m = null;
            }
            boolean unused = sVar.f9639q = false;
        }
    }

    /* renamed from: E */
    public abstract boolean mo13345E();

    /* renamed from: F */
    public void mo13573F() {
        boolean z;
        if (this.f9634l == null) {
            this.f9640r = mo13348I();
            AdContent adcontent = this.f9598b;
            if (adcontent != null) {
                z = mo13354b(adcontent);
            } else {
                z = false;
            }
            this.f9634l = new C2788r(this, this.f9640r);
            IAlog.m9902a("%senabling close with delay %d", IAlog.m9899a((Object) this), Long.valueOf(this.f9640r));
            if (!z || mo13345E()) {
                mo13574K();
            } else if (z) {
                C2812c.C2813a aVar = this.f9633k;
                if (aVar != null) {
                    aVar.showCloseCountdown();
                }
                C2791a aVar2 = new C2791a(100 + this.f9640r, 1000);
                this.f9644v = aVar2;
                aVar2.start();
            }
        }
    }

    /* renamed from: G */
    public abstract int mo13346G();

    /* renamed from: H */
    public abstract int mo13347H();

    /* renamed from: I */
    public abstract long mo13348I();

    /* renamed from: J */
    public abstract boolean mo13349J();

    /* renamed from: K */
    public void mo13574K() {
        if (!this.f9639q) {
            this.f9639q = true;
            C3741w0 w0Var = new C3741w0(TimeUnit.MILLISECONDS, this.f9640r);
            this.f9635m = w0Var;
            w0Var.f12943e = new C2792b();
            w0Var.mo15392c();
        }
    }

    /* renamed from: a */
    public abstract long mo13350a(long j);

    /* renamed from: b */
    public abstract boolean mo13354b(AdContent adcontent);

    /* renamed from: c */
    public void mo13575c(boolean z) {
    }

    /* renamed from: d */
    public void mo13576d(boolean z) {
        C2926q.C2927a aVar;
        if (this.f9598b == null) {
            C2924p pVar = C2924p.MRAID_CUSTOM_CLOSE_DETECTED;
            aVar = new C2926q.C2927a((C3648e) null);
            aVar.f10042c = pVar;
            aVar.f10040a = null;
            aVar.f10043d = null;
        } else {
            C2924p pVar2 = C2924p.MRAID_CUSTOM_CLOSE_DETECTED;
            AdContent adcontent = this.f9598b;
            InneractiveAdRequest inneractiveAdRequest = adcontent.f9590a;
            C3648e c = adcontent.mo13293c();
            JSONArray c2 = this.f9598b.f9592c.mo13268c();
            aVar = new C2926q.C2927a(c);
            aVar.f10042c = pVar2;
            aVar.f10040a = inneractiveAdRequest;
            aVar.f10043d = c2;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean valueOf = Boolean.valueOf(z);
        try {
            jSONObject.put("fyber_close_enabled", valueOf);
        } catch (Exception unused) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", "fyber_close_enabled", valueOf);
        }
        aVar.f10045f.put(jSONObject);
        aVar.mo13717a((String) null);
    }

    public void destroy() {
        Runnable runnable = this.f9634l;
        if (runnable != null) {
            C3714n.f12902b.removeCallbacks(runnable);
            this.f9634l = null;
        }
        Runnable runnable2 = this.f9636n;
        if (runnable2 != null) {
            C3714n.f12902b.removeCallbacks(runnable2);
            this.f9636n = null;
        }
        C2812c.C2813a aVar = this.f9633k;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f9633k = null;
        CountDownTimer countDownTimer = this.f9644v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f9644v = null;
        }
        C3741w0 w0Var = this.f9637o;
        if (w0Var != null) {
            w0Var.f12943e = null;
            this.f9637o = null;
        }
        C3741w0 w0Var2 = this.f9635m;
        if (w0Var2 != null) {
            w0Var2.f12943e = null;
            this.f9635m = null;
        }
        super.destroy();
    }

    /* renamed from: e */
    public void mo13577e(boolean z) {
        C2926q.C2927a aVar;
        this.f9638p = true;
        if (z) {
            if (this.f9598b == null) {
                C2924p pVar = C2924p.FAIL_SAFE_ACTIVATED;
                aVar = new C2926q.C2927a((C3648e) null);
                aVar.f10042c = pVar;
                aVar.f10040a = null;
                aVar.f10043d = null;
            } else {
                C2924p pVar2 = C2924p.FAIL_SAFE_ACTIVATED;
                AdContent adcontent = this.f9598b;
                InneractiveAdRequest inneractiveAdRequest = adcontent.f9590a;
                C3648e c = adcontent.mo13293c();
                JSONArray c2 = this.f9598b.f9592c.mo13268c();
                aVar = new C2926q.C2927a(c);
                aVar.f10042c = pVar2;
                aVar.f10040a = inneractiveAdRequest;
                aVar.f10043d = c2;
            }
            JSONObject jSONObject = new JSONObject();
            Boolean valueOf = Boolean.valueOf(mo13349J());
            try {
                jSONObject.put("is_endcard", valueOf);
            } catch (Exception unused) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "is_endcard", valueOf);
            }
            aVar.f10045f.put(jSONObject);
            aVar.mo13717a((String) null);
        }
        C2812c.C2813a aVar2 = this.f9633k;
        if (aVar2 != null) {
            aVar2.showCloseButton(z, mo13347H(), mo13346G());
            if (!z) {
                this.f9643u.mo15342a(false);
            }
        }
    }

    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f9597a = inneractiveAdSpot;
        this.f9598b = inneractiveAdSpot.getAdContent();
        this.f9599c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
        this.f9643u.f12817a = inneractiveAdSpot;
    }

    /* renamed from: o */
    public void mo13578o() {
        C3741w0 w0Var = this.f9635m;
        if (w0Var != null) {
            w0Var.mo15391b();
        }
        C3741w0 w0Var2 = this.f9637o;
        if (w0Var2 != null) {
            w0Var2.mo15391b();
        }
    }

    /* renamed from: s */
    public void mo13579s() {
        C3741w0 w0Var = this.f9635m;
        if (w0Var != null) {
            w0Var.mo15389a();
        }
        C3741w0 w0Var2 = this.f9637o;
        if (w0Var2 != null) {
            w0Var2.mo15389a();
        }
    }

    /* renamed from: w */
    public int mo13555w() {
        C2812c.C2813a aVar = this.f9633k;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.f9633k.getLayout().getHeight();
    }

    /* renamed from: x */
    public int mo13556x() {
        C2812c.C2813a aVar = this.f9633k;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.f9633k.getLayout().getWidth();
    }

    /* renamed from: z */
    public void mo13558z() {
        super.mo13558z();
    }

    /* renamed from: a */
    public void mo13351a(C2812c.C2813a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException {
        if (this.f9597a == null) {
            IAlog.m9906e("%sYou must set the spot to render before calling renderAd", IAlog.m9899a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        } else if (aVar != null) {
            this.f9633k = aVar;
        } else {
            IAlog.m9906e("%srenderAd called with a null activity!", IAlog.m9899a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }
}
