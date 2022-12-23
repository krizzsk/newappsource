package p492fn;

import java.util.ArrayList;
import java.util.Calendar;
import p583jk.C17871d;

/* renamed from: fn.c */
public final class C17043c {

    /* renamed from: a */
    public final C17044d f44182a;

    public C17043c(C17044d dVar) {
        this.f44182a = dVar;
    }

    /* renamed from: a */
    public final ArrayList mo49647a() {
        C17044d dVar = this.f44182a;
        C17871d dVar2 = dVar.f44186a;
        dVar2.getClass();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(dVar2.f45856a.mo49402a());
        if (dVar.f44192g == null) {
            dVar.f44192g = new long[(C17044d.f44184j * 2)];
        }
        if (dVar.f44193h == null) {
            dVar.f44193h = new int[(C17044d.f44184j * 2)];
        }
        int timeInMillis = (int) (((instance.getTimeInMillis() % 1000) << 10) / 1000);
        if (!dVar.f44189d) {
            timeInMillis = 1024;
        } else if (timeInMillis < 512) {
            timeInMillis = 1024 - timeInMillis;
        }
        for (int i = 0; i < dVar.f44190e.length; i++) {
            int b = dVar.mo49648b(i, instance, false);
            int b2 = dVar.mo49648b(i, instance, true);
            int i2 = instance.get(13) + (instance.get(12) * 60) + (instance.get(11) * 3600);
            int i3 = C17044d.f44183i[i];
            dVar.f44190e[i] = C17044d.m42894a(b, b2, ((i2 % i3) << 10) / i3);
            int[] iArr = dVar.f44190e;
            iArr[i] = C17044d.m42894a(16777215, iArr[i], timeInMillis);
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 : dVar.f44190e) {
            arrayList.add(Integer.valueOf(i4 | -16777216));
        }
        return arrayList;
    }
}
