package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fyber.inneractive.sdk.player.exoplayer2.C3067e;
import com.fyber.inneractive.sdk.player.exoplayer2.C3221h;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3325h;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.f */
public class C3219f extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C3220g f11542a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3219f(C3220g gVar, Looper looper) {
        super(looper);
        this.f11542a = gVar;
    }

    public void handleMessage(Message message) {
        C3220g gVar = this.f11542a;
        gVar.getClass();
        boolean z = true;
        switch (message.what) {
            case 0:
                gVar.f11555m--;
                return;
            case 1:
                gVar.f11553k = message.arg1;
                Iterator<C3067e.C3068a> it = gVar.f11548f.iterator();
                while (it.hasNext()) {
                    it.next().mo13929a(gVar.f11552j, gVar.f11553k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                gVar.f11556n = z;
                Iterator<C3067e.C3068a> it2 = gVar.f11548f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo13928a(gVar.f11556n);
                }
                return;
            case 3:
                if (gVar.f11555m == 0) {
                    C3325h hVar = (C3325h) message.obj;
                    gVar.f11551i = true;
                    gVar.f11559q = hVar.f11912a;
                    gVar.f11560r = hVar.f11913b;
                    gVar.f11544b.mo14455a(hVar.f11914c);
                    Iterator<C3067e.C3068a> it3 = gVar.f11548f.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo13927a(gVar.f11559q, gVar.f11560r);
                    }
                    return;
                }
                return;
            case 4:
                int i = gVar.f11554l - 1;
                gVar.f11554l = i;
                if (i == 0) {
                    gVar.f11562t = (C3221h.C3223b) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<C3067e.C3068a> it4 = gVar.f11548f.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo13923a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (gVar.f11554l == 0) {
                    gVar.f11562t = (C3221h.C3223b) message.obj;
                    Iterator<C3067e.C3068a> it5 = gVar.f11548f.iterator();
                    while (it5.hasNext()) {
                        it5.next().mo13923a();
                    }
                    return;
                }
                return;
            case 6:
                C3221h.C3225d dVar = (C3221h.C3225d) message.obj;
                gVar.f11554l -= dVar.f11626d;
                if (gVar.f11555m == 0) {
                    gVar.f11557o = dVar.f11623a;
                    gVar.f11558p = dVar.f11624b;
                    gVar.f11562t = dVar.f11625c;
                    Iterator<C3067e.C3068a> it6 = gVar.f11548f.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo13926a(gVar.f11557o, gVar.f11558p);
                    }
                    return;
                }
                return;
            case 7:
                C3231m mVar = (C3231m) message.obj;
                if (!gVar.f11561s.equals(mVar)) {
                    gVar.f11561s = mVar;
                    Iterator<C3067e.C3068a> it7 = gVar.f11548f.iterator();
                    while (it7.hasNext()) {
                        it7.next().mo13925a(mVar);
                    }
                    return;
                }
                return;
            case 8:
                C3054d dVar2 = (C3054d) message.obj;
                Iterator<C3067e.C3068a> it8 = gVar.f11548f.iterator();
                while (it8.hasNext()) {
                    it8.next().mo13924a(dVar2);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
