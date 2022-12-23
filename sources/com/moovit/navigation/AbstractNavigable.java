package com.moovit.navigation;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import com.moovit.app.navigation.itinerary.ItineraryNavigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import d40.C4351g;
import g40.C4792a;
import h40.C5052c;
import java.util.HashMap;
import java.util.Locale;
import p067e1.C4522y;
import p824tp.C19739q;
import p824tp.C19740r;
import p977zz.C20943i;

public abstract class AbstractNavigable implements Navigable {

    /* renamed from: b */
    public C4351g f15015b;

    /* renamed from: c */
    public NavigationProgressEvent f15016c;

    /* renamed from: d */
    public C4231d<?> f15017d;

    /* renamed from: e */
    public TextToSpeech f15018e;

    /* renamed from: f */
    public int f15019f = -1;

    /* renamed from: g */
    public final C4199a f15020g = new C4199a();

    /* renamed from: com.moovit.navigation.AbstractNavigable$a */
    public class C4199a implements TextToSpeech.OnInitListener {
        public C4199a() {
        }

        public final void onInit(int i) {
            AbstractNavigable abstractNavigable = AbstractNavigable.this;
            if (abstractNavigable.f15018e == null) {
                abstractNavigable.f15019f = -1;
                return;
            }
            abstractNavigable.f15019f = i;
            if (i == 0) {
                try {
                    int language = AbstractNavigable.this.f15018e.setLanguage(Locale.getDefault());
                    if (language == -1 || language == -2) {
                        AbstractNavigable.this.f15019f = language;
                    }
                } catch (Throwable unused) {
                    AbstractNavigable.this.f15019f = -1;
                }
            }
        }
    }

    /* renamed from: D1 */
    public void mo19599D1() {
    }

    /* renamed from: J1 */
    public final void mo19600J1(C4231d<?> dVar) {
        this.f15017d = dVar;
        this.f15015b.mo19860j();
    }

    /* renamed from: L0 */
    public final void mo19601L0(C4351g gVar) {
        this.f15015b = gVar;
        mo19606c(gVar);
        this.f15015b.mo19860j();
        if (this instanceof ItineraryNavigable) {
            this.f15018e = new TextToSpeech(gVar, this.f15020g);
        }
    }

    /* renamed from: T0 */
    public long mo19602T0() {
        return -1;
    }

    /* renamed from: Z */
    public final void mo19603Z() {
    }

    /* renamed from: a */
    public final void mo19604a(NavigationProgressEvent navigationProgressEvent) {
        boolean z;
        ArrivalState arrivalState = navigationProgressEvent.f15115f;
        NavigationProgressEvent navigationProgressEvent2 = this.f15016c;
        if (navigationProgressEvent2 == null || navigationProgressEvent2.f15112c < navigationProgressEvent.f15112c || arrivalState.compareTo(navigationProgressEvent2.f15115f) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f15016c = navigationProgressEvent;
        mo19605b(navigationProgressEvent, z);
        this.f15015b.mo19860j();
    }

    /* renamed from: b */
    public void mo19605b(NavigationProgressEvent navigationProgressEvent, boolean z) {
    }

    /* renamed from: c */
    public void mo19606c(C4351g gVar) {
    }

    /* renamed from: d */
    public final void mo19607d(C4351g gVar, C5052c cVar, PendingIntent pendingIntent, boolean z) {
        boolean z2;
        C4792a aVar = new C4792a(gVar);
        C4522y yVar = aVar.f16175b;
        yVar.f15629j = 1;
        int i = -1;
        yVar.mo20033e(-1);
        aVar.f16175b.mo20034f(16, true);
        aVar.f16175b.mo20034f(8, z);
        aVar.f16175b.mo20038j(cVar.mo20780i());
        int i2 = C19739q.ic_notification_alert;
        C4522y yVar2 = aVar.f16175b;
        yVar2.f15644y.icon = i2;
        yVar2.f15626g = pendingIntent;
        aVar.f16184k = true;
        aVar.mo20311b(cVar);
        if (cVar.mo20785k() != null) {
            aVar.f16175b.mo20036h(cVar.mo20785k());
            i = -2;
        }
        if (cVar.mo20784a() != null) {
            aVar.f16175b.f15644y.vibrate = cVar.mo20784a();
            i &= -3;
        }
        aVar.f16175b.mo20033e(i);
        Notification a = aVar.mo20310a();
        if ((this instanceof ItineraryNavigable) && this.f15018e != null && this.f15019f == 0 && C20943i.m49048a(gVar)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            a.defaults = 0;
            a.sound = null;
            String format = String.format("%1$s, %2$s", new Object[]{cVar.getTitle(), cVar.mo20780i()});
            TextToSpeech textToSpeech = this.f15018e;
            if (C20943i.m49051d(21)) {
                textToSpeech.speak(format, 1, (Bundle) null, (String) null);
            } else {
                textToSpeech.speak(format.toString(), 1, (HashMap) null);
            }
        }
        ((NotificationManager) gVar.getSystemService("notification")).notify(mo19639e0(), C19740r.nav_alert_notification, a);
    }

    /* renamed from: g2 */
    public void mo19608g2() {
    }

    /* renamed from: o0 */
    public final void mo19609o0() {
    }

    /* renamed from: y0 */
    public void mo19610y0() {
        TextToSpeech textToSpeech = this.f15018e;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            this.f15018e = null;
            this.f15019f = -1;
        }
    }

    /* renamed from: y1 */
    public void mo19611y1() {
    }
}
