package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p081f3.C4653e;
import p081f3.C4667l;
import p081f3.C4672p;
import p081f3.C4673q;
import p205p3.C6054p;
import p205p3.C6056r;
import p218q3.C6165a;

public final class WorkerParameters {

    /* renamed from: a */
    public UUID f5130a;

    /* renamed from: b */
    public C1388b f5131b;

    /* renamed from: c */
    public HashSet f5132c;

    /* renamed from: d */
    public C1384a f5133d;

    /* renamed from: e */
    public int f5134e;

    /* renamed from: f */
    public Executor f5135f;

    /* renamed from: g */
    public C6165a f5136g;

    /* renamed from: h */
    public C4673q f5137h;

    /* renamed from: i */
    public C4667l f5138i;

    /* renamed from: j */
    public C4653e f5139j;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1384a {

        /* renamed from: a */
        public List<String> f5140a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f5141b = Collections.emptyList();

        /* renamed from: c */
        public Network f5142c;
    }

    public WorkerParameters(UUID uuid, C1388b bVar, List list, C1384a aVar, int i, ExecutorService executorService, C6165a aVar2, C4672p pVar, C6056r rVar, C6054p pVar2) {
        this.f5130a = uuid;
        this.f5131b = bVar;
        this.f5132c = new HashSet(list);
        this.f5133d = aVar;
        this.f5134e = i;
        this.f5135f = executorService;
        this.f5136g = aVar2;
        this.f5137h = pVar;
        this.f5138i = rVar;
        this.f5139j = pVar2;
    }
}
