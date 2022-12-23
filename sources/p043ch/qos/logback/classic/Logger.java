package p043ch.qos.logback.classic;

import ce0.C21100e;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import nj0.C24541b;
import nj0.C24542c;
import p001a0.C0016g;
import p001a0.C0017h;
import p023b4.C1470a;
import p070e4.C4546a;
import p257t3.C6557a;
import p271u4.C6690a;
import p271u4.C6691b;

/* renamed from: ch.qos.logback.classic.Logger */
public final class Logger implements C24541b, C6690a<Object>, Serializable {

    /* renamed from: i */
    public static final String f6376i = Logger.class.getName();
    private static final long serialVersionUID = 5454405123156820674L;

    /* renamed from: b */
    public transient Level f6377b;

    /* renamed from: c */
    public transient int f6378c;

    /* renamed from: d */
    public transient Logger f6379d;

    /* renamed from: e */
    public transient CopyOnWriteArrayList f6380e;

    /* renamed from: f */
    public transient C6691b<Object> f6381f;

    /* renamed from: g */
    public transient boolean f6382g = true;

    /* renamed from: h */
    public final transient C6557a f6383h;
    private String name;

    public Logger(String str, Logger logger, C6557a aVar) {
        this.name = str;
        this.f6379d = logger;
        this.f6383h = aVar;
    }

    /* renamed from: a */
    public final synchronized void mo6664a(C4546a<Object> aVar) {
        if (this.f6381f == null) {
            this.f6381f = new C6691b<>();
        }
        this.f6381f.mo6664a(aVar);
    }

    /* renamed from: b */
    public final Logger mo6665b(String str) {
        if (C21100e.m49345i0(this.name.length() + 1, str) == -1) {
            if (this.f6380e == null) {
                this.f6380e = new CopyOnWriteArrayList();
            }
            Logger logger = new Logger(str, this, this.f6383h);
            this.f6380e.add(logger);
            logger.f6378c = this.f6378c;
            return logger;
        }
        StringBuilder k = C13555b.m33972k("For logger [");
        C0017h.m61R(k, this.name, "] child name [", str, " passed as parameter, may not include '.' after index");
        k.append(this.name.length() + 1);
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: c */
    public final void mo6666c(String str) {
        mo6668e(Level.f6373f, str);
    }

    /* renamed from: d */
    public final void mo6667d(String str) {
        mo6668e(Level.f6370c, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6668e(p043ch.qos.logback.classic.Level r7, java.lang.String r8) {
        /*
            r6 = this;
            t3.a r0 = r6.f6383h
            ch.qos.logback.classic.spi.TurboFilterList r1 = r0.f20371q
            int r1 = r1.size()
            r2 = 0
            if (r1 != 0) goto L_0x000e
            ch.qos.logback.core.spi.FilterReply r0 = p043ch.qos.logback.core.spi.FilterReply.NEUTRAL
            goto L_0x0042
        L_0x000e:
            ch.qos.logback.classic.spi.TurboFilterList r0 = r0.f20371q
            int r1 = r0.size()
            r3 = 1
            if (r1 != r3) goto L_0x0022
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0040 }
            c4.a r0 = (p036c4.C1776a) r0     // Catch:{ IndexOutOfBoundsException -> 0x0040 }
            ch.qos.logback.core.spi.FilterReply r0 = r0.mo6595m()     // Catch:{ IndexOutOfBoundsException -> 0x0040 }
            goto L_0x0042
        L_0x0022:
            java.lang.Object[] r0 = r0.toArray()
            int r1 = r0.length
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x0040
            r3 = r0[r2]
            c4.a r3 = (p036c4.C1776a) r3
            ch.qos.logback.core.spi.FilterReply r3 = r3.mo6595m()
            ch.qos.logback.core.spi.FilterReply r4 = p043ch.qos.logback.core.spi.FilterReply.DENY
            if (r3 == r4) goto L_0x003e
            ch.qos.logback.core.spi.FilterReply r4 = p043ch.qos.logback.core.spi.FilterReply.ACCEPT
            if (r3 != r4) goto L_0x003b
            goto L_0x003e
        L_0x003b:
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003e:
            r0 = r3
            goto L_0x0042
        L_0x0040:
            ch.qos.logback.core.spi.FilterReply r0 = p043ch.qos.logback.core.spi.FilterReply.NEUTRAL
        L_0x0042:
            ch.qos.logback.core.spi.FilterReply r1 = p043ch.qos.logback.core.spi.FilterReply.NEUTRAL
            if (r0 != r1) goto L_0x004d
            int r0 = r6.f6378c
            int r1 = r7.levelInt
            if (r0 <= r1) goto L_0x0052
            return
        L_0x004d:
            ch.qos.logback.core.spi.FilterReply r1 = p043ch.qos.logback.core.spi.FilterReply.DENY
            if (r0 != r1) goto L_0x0052
            return
        L_0x0052:
            b4.b r0 = new b4.b
            r0.<init>(r6, r7, r8)
            r7 = 0
            r8 = r6
        L_0x0059:
            if (r8 == 0) goto L_0x0081
            u4.b<java.lang.Object> r1 = r8.f6381f
            if (r1 == 0) goto L_0x0077
            w4.a<e4.a<E>> r1 = r1.f20769b
            r1.mo23229i()
            E[] r1 = r1.f21750d
            e4.a[] r1 = (p070e4.C4546a[]) r1
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x006b:
            if (r3 >= r2) goto L_0x0078
            r5 = r1[r3]
            r5.mo20052d(r0)
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L_0x006b
        L_0x0077:
            r4 = 0
        L_0x0078:
            int r7 = r7 + r4
            boolean r1 = r8.f6382g
            if (r1 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            ch.qos.logback.classic.Logger r8 = r8.f6379d
            goto L_0x0059
        L_0x0081:
            if (r7 != 0) goto L_0x00af
            t3.a r7 = r6.f6383h
            int r8 = r7.f20367m
            int r0 = r8 + 1
            r7.f20367m = r0
            if (r8 != 0) goto L_0x00af
            e4.c r8 = r7.f15676d
            v4.g r0 = new v4.g
            java.lang.String r1 = "No appenders present in context ["
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.String r7 = r7.f15675c
            r1.append(r7)
            java.lang.String r7 = "] for logger ["
            r1.append(r7)
            java.lang.String r7 = r6.name
            java.lang.String r2 = "]."
            java.lang.String r7 = p001a0.C0016g.m31o(r1, r7, r2)
            r0.<init>(r7, r6)
            r8.mo20056a(r0)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p043ch.qos.logback.classic.Logger.mo6668e(ch.qos.logback.classic.Level, java.lang.String):void");
    }

    /* renamed from: f */
    public final Logger mo6669f(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6380e;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < size; i++) {
            Logger logger = (Logger) this.f6380e.get(i);
            if (str.equals(logger.name)) {
                return logger;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final String mo6670g() {
        return this.name;
    }

    /* renamed from: h */
    public final synchronized void mo6671h(int i) {
        if (this.f6377b == null) {
            this.f6378c = i;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6380e;
            if (copyOnWriteArrayList != null) {
                int size = copyOnWriteArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Logger) this.f6380e.get(i2)).mo6671h(i);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo6672i(String str) {
        mo6668e(Level.f6372e, str);
    }

    /* renamed from: j */
    public final void mo6673j() {
        boolean z;
        Level level;
        C6691b<Object> bVar = this.f6381f;
        if (bVar != null) {
            Iterator<C4546a<E>> it = bVar.f20769b.iterator();
            while (it.hasNext()) {
                it.next().stop();
            }
            bVar.f20769b.clear();
        }
        this.f6378c = 10000;
        if (this.f6379d == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            level = Level.f6373f;
        } else {
            level = null;
        }
        this.f6377b = level;
        this.f6382g = true;
        if (this.f6380e != null) {
            Iterator it2 = new CopyOnWriteArrayList(this.f6380e).iterator();
            while (it2.hasNext()) {
                ((Logger) it2.next()).mo6673j();
            }
        }
    }

    /* renamed from: k */
    public final synchronized void mo6674k(Level level) {
        boolean z;
        if (this.f6377b != level) {
            if (level == null) {
                if (this.f6379d == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    throw new IllegalArgumentException("The level of the root logger cannot be set to null");
                }
            }
            this.f6377b = level;
            if (level == null) {
                this.f6378c = this.f6379d.f6378c;
            } else {
                this.f6378c = level.levelInt;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6380e;
            if (copyOnWriteArrayList != null) {
                int size = copyOnWriteArrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Logger) this.f6380e.get(i)).mo6671h(this.f6378c);
                }
            }
            Iterator it = this.f6383h.f20368n.iterator();
            while (it.hasNext()) {
                ((C1470a) it.next()).mo5820b();
            }
        }
    }

    public Object readResolve() throws ObjectStreamException {
        return C24542c.m61718b(this.name);
    }

    public final String toString() {
        return C0016g.m31o(C13555b.m33972k("Logger["), this.name, "]");
    }
}
