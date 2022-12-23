package ud0;

import android.os.Bundle;
import ce0.C21105j;
import com.vungle.warren.C23097c;
import com.vungle.warren.C23181n1;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import od0.C24545c;
import od0.C24566m;
import od0.C24573q;
import p359ag.C13452i;
import td0.C24932c;
import td0.C24935e;
import td0.C24942l;

/* renamed from: ud0.c */
public final class C25019c implements C25021e {

    /* renamed from: d */
    public static final /* synthetic */ int f63190d = 0;

    /* renamed from: a */
    public final C24932c f63191a;

    /* renamed from: b */
    public final C23192a f63192b;

    /* renamed from: c */
    public final C23097c f63193c;

    public C25019c(C24932c cVar, C23192a aVar, C23097c cVar2) {
        this.f63191a = cVar;
        this.f63192b = aVar;
        this.f63193c = cVar2;
    }

    /* renamed from: a */
    public final int mo61555a(Bundle bundle, C25024h hVar) {
        C24932c cVar = this.f63191a;
        if (cVar == null || this.f63192b == null) {
            return 1;
        }
        cVar.mo61491e();
        List<Class<?>> list = C21105j.f52950a;
        File[] listFiles = this.f63191a.mo61491e().listFiles();
        List<C24566m> list2 = this.f63192b.mo58282q(C24566m.class).get();
        if (list2 == null || list2.size() == 0) {
            return 0;
        }
        Collection collection = this.f63192b.mo58286u().get();
        HashSet hashSet = new HashSet();
        try {
            for (C24566m mVar : list2) {
                if (collection == null || collection.isEmpty() || collection.contains(mVar)) {
                    C23192a aVar = this.f63192b;
                    String str = mVar.f62257a;
                    aVar.getClass();
                    List<String> list3 = (List) new C24935e(aVar.f58875b.submit(new C24942l(aVar, str))).get();
                    if (list3 != null) {
                        for (String str2 : list3) {
                            C24545c cVar2 = (C24545c) this.f63192b.mo58281p(C24545c.class, str2).get();
                            if (cVar2 != null) {
                                if (cVar2.f62207f * 1000 > System.currentTimeMillis() || cVar2.f62192N == 2) {
                                    hashSet.add(cVar2.getId());
                                } else {
                                    this.f63192b.mo58272g(str2);
                                    C23181n1 b = C23181n1.m57208b();
                                    C13452i iVar = new C13452i();
                                    SessionEvent sessionEvent = SessionEvent.AD_EXPIRED;
                                    iVar.mo40349F("event", sessionEvent.toString());
                                    iVar.mo40349F(SessionAttribute.EVENT_ID.toString(), str2);
                                    b.mo58250d(new C24573q(sessionEvent, iVar));
                                    this.f63193c.mo58106m(mVar, mVar.mo60831a(), 1000, false);
                                }
                            }
                        }
                    }
                } else {
                    String.format(Locale.ENGLISH, "Placement %s is no longer valid, deleting it and its advertisement", new Object[]{mVar.f62257a});
                    this.f63192b.mo58271f(mVar);
                }
            }
            List<C24545c> list4 = this.f63192b.mo58282q(C24545c.class).get();
            if (list4 != null) {
                for (C24545c cVar3 : list4) {
                    if (cVar3.f62192N == 2) {
                        hashSet.add(cVar3.getId());
                    } else if (!hashSet.contains(cVar3.getId())) {
                        this.f63192b.mo58272g(cVar3.getId());
                    }
                }
            }
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (!hashSet.contains(file.getName())) {
                        String.format(Locale.ENGLISH, "Deleting assets under directory %s", new Object[]{file.getName()});
                        C21105j.m49397b(file);
                    }
                }
            }
            return 0;
        } catch (DatabaseHelper.DBException | IOException unused) {
            return 1;
        }
    }
}
