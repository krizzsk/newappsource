package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.fyber.inneractive.sdk.network.h */
public class C2903h {
    /* renamed from: a */
    public InputStream mo13700a(InputStream inputStream, boolean z) {
        if (z) {
            try {
                IAlog.m9902a("HttpExecutorImpl: getInputStream found gzip encoding", new Object[0]);
                return new GZIPInputStream(inputStream);
            } catch (Exception unused) {
                return null;
            }
        } else {
            IAlog.m9902a("HttpExecutorImpl: getInputStream no gzip encoding", new Object[0]);
            return new BufferedInputStream(inputStream);
        }
    }

    /* renamed from: a */
    public C2908j mo13699a(InputStream inputStream, int i, String str, Map<String, List<String>> map, String str2) throws C2930q0, C2888b {
        try {
            C2908j jVar = new C2908j(inputStream, i, str, map, str2);
            if (jVar.f9920a / 100 != 5) {
                return jVar;
            }
            throw new C2888b(String.format("server returned error %d", new Object[]{Integer.valueOf(jVar.f9920a)}));
        } catch (C2888b e) {
            IAlog.m9901a("failed executing network request", e, new Object[0]);
            throw new C2888b((Throwable) e);
        } catch (Exception e2) {
            IAlog.m9901a("failed reading network response", e2, new Object[0]);
            throw new C2930q0(e2);
        }
    }
}
