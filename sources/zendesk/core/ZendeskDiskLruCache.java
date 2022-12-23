package zendesk.core;

import com.zendesk.logger.Logger;
import ge0.C23410c;
import hi0.C23533d0;
import hi0.C23536e0;
import hi0.C23562t;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import p172m9.C5720b;
import p535hi.C17437a;
import si0.C24893c0;
import si0.C24910q;
import si0.C24911r;
import si0.C24915u;
import si0.C24917w;
import si0.C24918x;

class ZendeskDiskLruCache implements BaseStorage {
    private final File directory;
    private final long maxSize;
    private final Serializer serializer;
    private C17437a storage;

    public ZendeskDiskLruCache(File file, Serializer serializer2, int i) {
        this.directory = file;
        long j = (long) i;
        this.maxSize = j;
        this.storage = openCache(file, j);
        this.serializer = serializer2;
    }

    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private String getString(String str, int i) {
        Throwable th;
        C24918x xVar;
        C24918x xVar2;
        C24910q qVar;
        String str2;
        C24910q qVar2 = null;
        try {
            C17437a.C17443e f = this.storage.mo49896f(key(str));
            if (f != null) {
                qVar = C24911r.m62553i(f.f44937b[i]);
                try {
                    xVar2 = C24911r.m62547c(qVar);
                } catch (IOException unused) {
                    xVar2 = null;
                    try {
                        Logger.m57307f("Unable to read from cache", new Object[0]);
                        close(qVar);
                        close(xVar2);
                        return null;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        qVar2 = qVar;
                        xVar = xVar2;
                        th = th3;
                        close(qVar2);
                        close(xVar);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    qVar2 = qVar;
                    xVar = null;
                    close(qVar2);
                    close(xVar);
                    throw th;
                }
                try {
                    xVar2.f62987b.mo61417q1(xVar2.f62989d);
                    qVar2 = qVar;
                    str2 = xVar2.f62987b.mo61380H();
                } catch (IOException unused2) {
                    Logger.m57307f("Unable to read from cache", new Object[0]);
                    close(qVar);
                    close(xVar2);
                    return null;
                }
            } else {
                str2 = null;
                xVar2 = null;
            }
            close(qVar2);
            close(xVar2);
            return str2;
        } catch (IOException unused3) {
            qVar = null;
            xVar2 = null;
            Logger.m57307f("Unable to read from cache", new Object[0]);
            close(qVar);
            close(xVar2);
            return null;
        } catch (Throwable th5) {
            th = th5;
            xVar = null;
            close(qVar2);
            close(xVar);
            throw th;
        }
    }

    private String key(String str) {
        return C5720b.m14040H(str);
    }

    private String keyMediaType(String str) {
        return key(String.format(Locale.US, "%s_content_type", new Object[]{str}));
    }

    private C17437a openCache(File file, long j) {
        try {
            return C17437a.m43478j(file, j);
        } catch (IOException unused) {
            Logger.m57306e("Unable to open cache", new Object[0]);
            return null;
        }
    }

    private void putString(String str, int i, String str2) {
        try {
            write(str, i, C24911r.m62553i(new ByteArrayInputStream(str2.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException unused) {
            Logger.m57307f("Unable to encode string", new Object[0]);
        }
    }

    private void write(String str, int i, C24893c0 c0Var) {
        C24915u uVar;
        C17437a.C17440c e;
        C24917w wVar = null;
        try {
            synchronized (this.directory) {
                e = this.storage.mo49895e(key(str));
            }
            if (e != null) {
                uVar = C24911r.m62550f(e.mo49908c(i));
                try {
                    C24917w wVar2 = new C24917w(uVar);
                    try {
                        wVar2.mo61417q1(c0Var);
                        wVar2.flush();
                        e.mo49907b();
                        wVar = wVar2;
                    } catch (IOException unused) {
                        wVar = wVar2;
                        try {
                            Logger.m57307f("Unable to cache data", new Object[0]);
                            close(wVar);
                            close(uVar);
                            close(c0Var);
                        } catch (Throwable th) {
                            th = th;
                            close(wVar);
                            close(uVar);
                            close(c0Var);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        wVar = wVar2;
                        close(wVar);
                        close(uVar);
                        close(c0Var);
                        throw th;
                    }
                } catch (IOException unused2) {
                    Logger.m57307f("Unable to cache data", new Object[0]);
                    close(wVar);
                    close(uVar);
                    close(c0Var);
                }
            } else {
                uVar = null;
            }
        } catch (IOException unused3) {
            uVar = null;
        } catch (Throwable th3) {
            th = th3;
            uVar = null;
            close(wVar);
            close(uVar);
            close(c0Var);
            throw th;
        }
        close(wVar);
        close(uVar);
        close(c0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0027 A[Catch:{ IOException -> 0x0021, all -> 0x0038 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r4 = this;
            hi.a r0 = r4.storage
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r1 = 0
            r2 = 1
            java.io.File r0 = r0.f44912b     // Catch:{ IOException -> 0x0021 }
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x0021 }
            if (r0 == 0) goto L_0x0032
            hi.a r0 = r4.storage     // Catch:{ IOException -> 0x0021 }
            java.io.File r0 = r0.f44912b     // Catch:{ IOException -> 0x0021 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ IOException -> 0x0021 }
            if (r0 == 0) goto L_0x0023
            int r0 = r0.length     // Catch:{ IOException -> 0x0021 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            r0 = 0
            goto L_0x0024
        L_0x0021:
            r0 = move-exception
            goto L_0x003a
        L_0x0023:
            r0 = 1
        L_0x0024:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0032
            hi.a r0 = r4.storage     // Catch:{ IOException -> 0x0021 }
            r0.close()     // Catch:{ IOException -> 0x0021 }
            java.io.File r0 = r0.f44912b     // Catch:{ IOException -> 0x0021 }
            p535hi.C17446c.m43496a(r0)     // Catch:{ IOException -> 0x0021 }
            goto L_0x0047
        L_0x0032:
            hi.a r0 = r4.storage     // Catch:{ IOException -> 0x0021 }
            r0.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0047
        L_0x0038:
            r0 = move-exception
            goto L_0x0052
        L_0x003a:
            java.lang.String r3 = "Error clearing cache. Error: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0038 }
            r2[r1] = r0     // Catch:{ all -> 0x0038 }
            com.zendesk.logger.Logger.m57302a(r3, r2)     // Catch:{ all -> 0x0038 }
        L_0x0047:
            java.io.File r0 = r4.directory
            long r1 = r4.maxSize
            hi.a r0 = r4.openCache(r0, r1)
            r4.storage = r0
            return
        L_0x0052:
            java.io.File r1 = r4.directory
            long r2 = r4.maxSize
            hi.a r1 = r4.openCache(r1, r2)
            r4.storage = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.core.ZendeskDiskLruCache.clear():void");
    }

    public String get(String str) {
        if (this.storage == null) {
            return null;
        }
        return getString(str, 0);
    }

    public void put(String str, String str2) {
        if (this.storage != null && !C23410c.m57534b(str2)) {
            putString(str, 0, str2);
        }
    }

    public void remove(String str) {
    }

    public <E> E get(String str, Class<E> cls) {
        if (this.storage == null) {
            return null;
        }
        if (cls.equals(C23536e0.class)) {
            try {
                C17437a.C17443e f = this.storage.mo49896f(key(str));
                if (f == null) {
                    return null;
                }
                C24910q i = C24911r.m62553i(f.f44937b[0]);
                long j = f.f44938c[0];
                String string = getString(keyMediaType(str), 0);
                return new C23533d0(C23410c.m57533a(string) ? C23562t.m57743c(string) : null, j, C24911r.m62547c(i));
            } catch (IOException unused) {
                Logger.m57307f("Unable to read from cache", new Object[0]);
                return null;
            }
        } else {
            return this.serializer.deserialize(getString(str, 0), cls);
        }
    }

    public void put(String str, Object obj) {
        if (this.storage != null) {
            if (obj instanceof C23536e0) {
                C23536e0 e0Var = (C23536e0) obj;
                write(str, 0, e0Var.mo53600t());
                putString(keyMediaType(str), 0, e0Var.mo53599q().f59553a);
                return;
            }
            String str2 = null;
            if (obj != null) {
                str2 = this.serializer.serialize(obj);
            }
            put(str, str2);
        }
    }
}
