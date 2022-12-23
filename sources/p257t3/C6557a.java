package p257t3;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import nj0.C24540a;
import p001a0.C0016g;
import p023b4.C1470a;
import p036c4.C1776a;
import p043ch.qos.logback.classic.Level;
import p043ch.qos.logback.classic.Logger;
import p043ch.qos.logback.classic.spi.LoggerContextVO;
import p043ch.qos.logback.classic.spi.TurboFilterList;
import p070e4.C4548c;
import p070e4.C4549d;
import p090g1.C4745d;
import p271u4.C6695f;
import p283v4.C6861f;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: t3.a */
public final class C6557a extends C4549d implements C24540a {

    /* renamed from: l */
    public final Logger f20366l;

    /* renamed from: m */
    public int f20367m = 0;

    /* renamed from: n */
    public final ArrayList f20368n = new ArrayList();

    /* renamed from: o */
    public ConcurrentHashMap f20369o = new ConcurrentHashMap();

    /* renamed from: p */
    public LoggerContextVO f20370p = new LoggerContextVO(this);

    /* renamed from: q */
    public final TurboFilterList f20371q = new TurboFilterList();

    /* renamed from: r */
    public boolean f20372r = false;

    public C6557a() {
        Logger logger = new Logger("ROOT", (Logger) null, this);
        this.f20366l = logger;
        logger.mo6674k(Level.f6373f);
        this.f20369o.put("ROOT", logger);
        mo20060c(new HashMap(), "EVALUATOR_MAP");
        new ArrayList();
    }

    /* renamed from: e */
    public final void mo20061e(String str, String str2) {
        super.mo20061e(str, str2);
        this.f20370p = new LoggerContextVO(this);
    }

    /* renamed from: f */
    public final Logger mo22168a(String str) {
        Logger f;
        if (str == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        } else if ("ROOT".equalsIgnoreCase(str)) {
            return this.f20366l;
        } else {
            Logger logger = this.f20366l;
            Logger logger2 = (Logger) this.f20369o.get(str);
            if (logger2 != null) {
                return logger2;
            }
            int i = 0;
            while (true) {
                int i0 = C21100e.m49345i0(i, str);
                String substring = i0 == -1 ? str : str.substring(0, i0);
                int i2 = i0 + 1;
                synchronized (logger) {
                    f = logger.mo6669f(substring);
                    if (f == null) {
                        f = logger.mo6665b(substring);
                        this.f20369o.put(substring, f);
                    }
                }
                if (i0 == -1) {
                    return f;
                }
                i = i2;
                logger = f;
            }
        }
    }

    /* renamed from: g */
    public final void mo22671g(Properties properties) {
        for (String next : properties.stringPropertyNames()) {
            super.mo20061e(next, properties.getProperty(next));
        }
        this.f20370p = new LoggerContextVO(this);
    }

    /* renamed from: h */
    public final void mo20063h(String str) {
        super.mo20063h(str);
        this.f20370p = new LoggerContextVO(this);
    }

    /* renamed from: i */
    public final void mo22672i() {
        C4745d dVar;
        ArrayList arrayList;
        Thread thread = (Thread) mo20059b("SHUTDOWN_HOOK");
        if (thread != null) {
            this.f15678f.remove("SHUTDOWN_HOOK");
            try {
                Runtime.getRuntime().removeShutdownHook(thread);
            } catch (IllegalStateException unused) {
            }
        }
        synchronized (this) {
            if (this.f15682j == null) {
                this.f15682j = new C4745d(3);
            }
            dVar = this.f15682j;
        }
        for (C6695f fVar : (Set) dVar.f16031a) {
            if (fVar.isStarted()) {
                fVar.stop();
            }
        }
        ((Set) dVar.f16031a).clear();
        this.f15677e.clear();
        this.f15678f.clear();
        mo20060c(new HashMap(), "EVALUATOR_MAP");
        mo20060c(new HashMap(), "FA_FILENAME_COLLISION_MAP");
        mo20060c(new HashMap(), "RFA_FILENAME_PATTERN_COLLISION_MAP");
        this.f20366l.mo6673j();
        Iterator it = this.f20371q.iterator();
        while (it.hasNext()) {
            ((C1776a) it.next()).f6245e = false;
        }
        this.f20371q.clear();
        Iterator it2 = this.f15681i.iterator();
        while (it2.hasNext()) {
            ((ScheduledFuture) it2.next()).cancel(false);
        }
        this.f15681i.clear();
        Iterator it3 = this.f20368n.iterator();
        while (it3.hasNext()) {
            ((C1470a) it3.next()).mo5821c();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = this.f20368n.iterator();
        while (it4.hasNext()) {
            C1470a aVar = (C1470a) it4.next();
            if (aVar.mo5819a()) {
                arrayList2.add(aVar);
            }
        }
        this.f20368n.retainAll(arrayList2);
        C4548c cVar = this.f15676d;
        synchronized (cVar.f15673f) {
            arrayList = new ArrayList(cVar.f15672e);
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            C6861f fVar2 = (C6861f) it5.next();
            synchronized (cVar.f15673f) {
                cVar.f15672e.remove(fVar2);
            }
        }
    }

    public final void start() {
        this.f15683k = true;
        Iterator it = this.f20368n.iterator();
        while (it.hasNext()) {
            ((C1470a) it.next()).onStart();
        }
    }

    public final void stop() {
        mo22672i();
        Iterator it = this.f20368n.iterator();
        while (it.hasNext()) {
            ((C1470a) it.next()).onStop();
        }
        this.f20368n.clear();
        super.stop();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C6557a.class, sb, "[");
        return C0016g.m31o(sb, this.f15675c, "]");
    }
}
