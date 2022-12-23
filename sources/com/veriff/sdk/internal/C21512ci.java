package com.veriff.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.veriff.sdk.internal.C21476bp;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.veriff.sdk.internal.ci */
public class C21512ci {

    /* renamed from: a */
    public static final Handler f54109a = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i2 < size) {
                        C21479br brVar = (C21479br) list.get(i2);
                        brVar.f54030b.mo54492a(brVar);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        C21476bp bpVar = (C21476bp) list2.get(i2);
                        bpVar.f54008a.mo54495c(bpVar);
                        i2++;
                    }
                } else {
                    StringBuilder k = C13555b.m33972k("Unknown handler message received: ");
                    k.append(message.what);
                    throw new AssertionError(k.toString());
                }
            } else {
                C21476bp bpVar2 = (C21476bp) message.obj;
                if (bpVar2.mo54404i().f54119l) {
                    C21537cs.m51506a("Main", "canceled", bpVar2.f54009b.mo54512a(), "target got garbage collected");
                }
                bpVar2.f54008a.mo54493a(bpVar2.mo54398c());
            }
        }
    };

    /* renamed from: c */
    public final Context f54110c;

    /* renamed from: d */
    public final C21491bx f54111d;

    /* renamed from: e */
    public final C21486bs f54112e;

    /* renamed from: f */
    public final C21532cp f54113f;

    /* renamed from: g */
    public final Map<Object, C21476bp> f54114g;

    /* renamed from: h */
    public final Map<ImageView, C21490bw> f54115h;

    /* renamed from: i */
    public final ReferenceQueue<Object> f54116i;

    /* renamed from: j */
    public final Bitmap.Config f54117j;

    /* renamed from: k */
    public boolean f54118k;

    /* renamed from: l */
    public volatile boolean f54119l;

    /* renamed from: o */
    private final C21520f f54120o;

    /* renamed from: q */
    private final List<C21529cn> f54121q;

    /* renamed from: com.veriff.sdk.internal.ci$b */
    public static class C21515b extends Thread {

        /* renamed from: a */
        private final ReferenceQueue<Object> f54128a;

        /* renamed from: b */
        private final Handler f54129b;

        public C21515b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f54128a = referenceQueue;
            this.f54129b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C21476bp.C21477a aVar = (C21476bp.C21477a) this.f54128a.remove(1000);
                    Message obtainMessage = this.f54129b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f54020a;
                        this.f54129b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f54129b.post(new Runnable(this) {
                        public void run() {
                            throw new RuntimeException(e);
                        }
                    });
                    return;
                }
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.ci$c */
    public interface C21517c {
        /* renamed from: a */
        void mo54502a(C21512ci ciVar, Uri uri, Exception exc);
    }

    /* renamed from: com.veriff.sdk.internal.ci$d */
    public enum C21518d {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: d */
        public final int f54135d;

        private C21518d(int i) {
            this.f54135d = i;
        }
    }

    /* renamed from: com.veriff.sdk.internal.ci$e */
    public enum C21519e {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: com.veriff.sdk.internal.ci$f */
    public interface C21520f {

        /* renamed from: a */
        public static final C21520f f54140a = new C21520f() {
            /* renamed from: a */
            public C21525cl mo54503a(C21525cl clVar) {
                return clVar;
            }
        };

        /* renamed from: a */
        C21525cl mo54503a(C21525cl clVar);
    }

    public C21512ci(Context context, C21491bx bxVar, C21486bs bsVar, C21517c cVar, C21520f fVar, List<C21529cn> list, C21532cp cpVar, Bitmap.Config config, boolean z, boolean z2) {
        int i;
        this.f54110c = context;
        this.f54111d = bxVar;
        this.f54112e = bsVar;
        this.f54120o = fVar;
        this.f54117j = config;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i + 7);
        arrayList.add(new C21531co(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C21488bu(context));
        arrayList.add(new C21504cd(context));
        arrayList.add(new C21489bv(context));
        arrayList.add(new C21478bq(context));
        arrayList.add(new C21497bz(context));
        arrayList.add(new C21508cg(bxVar.f54060d, cpVar));
        this.f54121q = Collections.unmodifiableList(arrayList);
        this.f54113f = cpVar;
        this.f54114g = new WeakHashMap();
        this.f54115h = new WeakHashMap();
        this.f54118k = z;
        this.f54119l = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f54116i = referenceQueue;
        new C21515b(referenceQueue, f54109a).start();
    }

    /* renamed from: a */
    public void mo54489a(ImageView imageView) {
        if (imageView != null) {
            mo54493a((Object) imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    /* renamed from: b */
    public void mo54494b(C21476bp bpVar) {
        this.f54111d.mo54446a(bpVar);
    }

    /* renamed from: c */
    public void mo54495c(C21476bp bpVar) {
        Bitmap bitmap;
        if (C21506ce.m51404a(bpVar.f54012e)) {
            bitmap = mo54485a(bpVar.mo54399d());
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            C21518d dVar = C21518d.MEMORY;
            m51416a(bitmap, dVar, bpVar, (Exception) null);
            if (this.f54119l) {
                C21537cs.m51506a("Main", "completed", bpVar.f54009b.mo54512a(), "from " + dVar);
                return;
            }
            return;
        }
        mo54491a(bpVar);
        if (this.f54119l) {
            C21537cs.m51505a("Main", "resumed", bpVar.f54009b.mo54512a());
        }
    }

    /* renamed from: a */
    public C21528cm mo54487a(Uri uri) {
        return new C21528cm(this, uri, 0);
    }

    /* renamed from: com.veriff.sdk.internal.ci$a */
    public static class C21514a {

        /* renamed from: a */
        private final Context f54122a;

        /* renamed from: b */
        private C21496by f54123b;

        /* renamed from: c */
        private ExecutorService f54124c;

        /* renamed from: d */
        private C21486bs f54125d;

        /* renamed from: f */
        private C21520f f54126f;

        /* renamed from: g */
        private List<C21529cn> f54127g;

        public C21514a(Context context) {
            if (context != null) {
                this.f54122a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C21514a mo54497a(C21496by byVar) {
            if (byVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            } else if (this.f54123b == null) {
                this.f54123b = byVar;
                return this;
            } else {
                throw new IllegalStateException("Downloader already set.");
            }
        }

        /* renamed from: a */
        public C21514a mo54498a(C21529cn cnVar) {
            if (cnVar != null) {
                if (this.f54127g == null) {
                    this.f54127g = new ArrayList();
                }
                if (!this.f54127g.contains(cnVar)) {
                    this.f54127g.add(cnVar);
                    return this;
                }
                throw new IllegalStateException("RequestHandler already registered.");
            }
            throw new IllegalArgumentException("RequestHandler must not be null.");
        }

        /* renamed from: a */
        public C21512ci mo54499a() {
            Context context = this.f54122a;
            if (this.f54123b == null) {
                this.f54123b = new C21511ch(context);
            }
            if (this.f54125d == null) {
                this.f54125d = new C21500cb(context);
            }
            if (this.f54124c == null) {
                this.f54124c = new C21523ck();
            }
            if (this.f54126f == null) {
                this.f54126f = C21520f.f54140a;
            }
            C21532cp cpVar = new C21532cp(this.f54125d);
            Context context2 = context;
            return new C21512ci(context2, new C21491bx(context2, this.f54124c, C21512ci.f54109a, this.f54123b, this.f54125d, cpVar), this.f54125d, (C21517c) null, this.f54126f, this.f54127g, cpVar, (Bitmap.Config) null, false, false);
        }
    }

    /* renamed from: a */
    public List<C21529cn> mo54488a() {
        return this.f54121q;
    }

    /* renamed from: a */
    public C21525cl mo54486a(C21525cl clVar) {
        C21525cl a = this.f54120o.mo54503a(clVar);
        if (a != null) {
            return a;
        }
        StringBuilder k = C13555b.m33972k("Request transformer ");
        k.append(this.f54120o.getClass().getCanonicalName());
        k.append(" returned null for ");
        k.append(clVar);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: a */
    public void mo54490a(ImageView imageView, C21490bw bwVar) {
        if (this.f54115h.containsKey(imageView)) {
            mo54493a((Object) imageView);
        }
        this.f54115h.put(imageView, bwVar);
    }

    /* renamed from: a */
    public void mo54491a(C21476bp bpVar) {
        Object c = bpVar.mo54398c();
        if (!(c == null || this.f54114g.get(c) == bpVar)) {
            mo54493a(c);
            this.f54114g.put(c, bpVar);
        }
        mo54494b(bpVar);
    }

    /* renamed from: a */
    public Bitmap mo54485a(String str) {
        Bitmap a = this.f54112e.mo54434a(str);
        if (a != null) {
            this.f54113f.mo54534a();
        } else {
            this.f54113f.mo54538b();
        }
        return a;
    }

    /* renamed from: a */
    public void mo54492a(C21479br brVar) {
        C21476bp i = brVar.mo54420i();
        List<C21476bp> k = brVar.mo54422k();
        boolean z = true;
        boolean z2 = k != null && !k.isEmpty();
        if (i == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = brVar.mo54419h().f54153d;
            Exception l = brVar.mo54423l();
            Bitmap e = brVar.mo54416e();
            C21518d m = brVar.mo54424m();
            if (i != null) {
                m51416a(e, m, i, l);
            }
            if (z2) {
                int size = k.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m51416a(e, m, k.get(i2), l);
                }
            }
        }
    }

    /* renamed from: a */
    private void m51416a(Bitmap bitmap, C21518d dVar, C21476bp bpVar, Exception exc) {
        if (!bpVar.mo54400e()) {
            if (!bpVar.mo54401f()) {
                this.f54114g.remove(bpVar.mo54398c());
            }
            if (bitmap == null) {
                bpVar.mo54396a(exc);
                if (this.f54119l) {
                    C21537cs.m51506a("Main", "errored", bpVar.f54009b.mo54512a(), exc.getMessage());
                }
            } else if (dVar != null) {
                bpVar.mo54395a(bitmap, dVar);
                if (this.f54119l) {
                    String a = bpVar.f54009b.mo54512a();
                    C21537cs.m51506a("Main", "completed", a, "from " + dVar);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* renamed from: a */
    public void mo54493a(Object obj) {
        C21490bw remove;
        C21537cs.m51503a();
        C21476bp remove2 = this.f54114g.remove(obj);
        if (remove2 != null) {
            remove2.mo54394a();
            this.f54111d.mo54453b(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f54115h.remove((ImageView) obj)) != null) {
            remove.mo54440a();
        }
    }
}
