package zendesk.core;

import com.zendesk.logger.Logger;
import hi0.C23529c0;
import hi0.C23533d0;
import hi0.C23536e0;
import hi0.C23560s;
import hi0.C23562t;
import hi0.C23571x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import li0.C24319f;
import mf0.C24362h;
import okhttp3.Protocol;
import si0.C24898f;

class CachingInterceptor implements C23560s {
    private final BaseStorage cache;
    private final Map<String, Lock> locks = new HashMap();

    public CachingInterceptor(BaseStorage baseStorage) {
        this.cache = baseStorage;
    }

    private C23529c0 createResponse(int i, C23571x xVar, C23536e0 e0Var) {
        C23529c0.C23530a aVar = new C23529c0.C23530a();
        if (e0Var != null) {
            aVar.f59430g = e0Var;
        } else {
            Logger.m57306e("Response body is null", new Object[0]);
        }
        aVar.f59426c = i;
        aVar.f59427d = xVar.f59637b;
        aVar.f59424a = xVar;
        aVar.f59425b = Protocol.HTTP_1_1;
        return aVar.mo58645a();
    }

    private C23529c0 loadData(String str, C23560s.C23561a aVar) throws IOException {
        int i;
        C23536e0 e0Var = (C23536e0) this.cache.get(str, C23536e0.class);
        if (e0Var == null) {
            Logger.m57302a("Response not cached, loading it from the network. | %s", str);
            C24319f fVar = (C24319f) aVar;
            C23529c0 a = fVar.mo60464a(fVar.f61618e);
            if (a.mo58644v()) {
                C23562t q = a.f59416h.mo53599q();
                byte[] e = a.f59416h.mo58648e();
                BaseStorage baseStorage = this.cache;
                C24898f fVar2 = new C24898f();
                C24362h.m61211f(e, "source");
                fVar2.mo61392T(0, e.length, e);
                baseStorage.put(str, (Object) new C23533d0(q, (long) e.length, fVar2));
                C24898f fVar3 = new C24898f();
                fVar3.mo61392T(0, e.length, e);
                e0Var = new C23533d0(q, (long) e.length, fVar3);
            } else {
                Logger.m57302a("Unable to load data from network. | %s", str);
                e0Var = a.f59416h;
            }
            i = a.f59412d;
        } else {
            i = 200;
        }
        return createResponse(i, ((C24319f) aVar).f61618e, e0Var);
    }

    public C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        Lock lock;
        String str = ((C24319f) aVar).f61618e.f59636a.f59542i;
        synchronized (this.locks) {
            if (this.locks.containsKey(str)) {
                lock = this.locks.get(str);
            } else {
                lock = new ReentrantLock();
                this.locks.put(str, lock);
            }
        }
        try {
            lock.lock();
            return loadData(str, aVar);
        } finally {
            lock.unlock();
        }
    }
}
