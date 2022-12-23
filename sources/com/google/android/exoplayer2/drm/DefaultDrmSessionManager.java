package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.drm.C3915c;
import com.google.android.exoplayer2.drm.C3920f;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.upstream.C4076a;
import com.google.common.collect.C14439w0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p054d0.C4278e0;
import p099ga.C4883f;
import p161la.C5654c;
import p161la.C5656e;
import p265tb.C6669s;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6792n;
import p316y.C7218m;
import p583jk.C17875h;

public final class DefaultDrmSessionManager implements C3915c {

    /* renamed from: b */
    public final UUID f13683b;

    /* renamed from: c */
    public final C3920f.C3923c f13684c;

    /* renamed from: d */
    public final C3927i f13685d;

    /* renamed from: e */
    public final HashMap<String, String> f13686e;

    /* renamed from: f */
    public final boolean f13687f;

    /* renamed from: g */
    public final int[] f13688g;

    /* renamed from: h */
    public final boolean f13689h;

    /* renamed from: i */
    public final C3907d f13690i = new C3907d();

    /* renamed from: j */
    public final C6669s f13691j;

    /* renamed from: k */
    public final C3908e f13692k = new C3908e();

    /* renamed from: l */
    public final long f13693l;

    /* renamed from: m */
    public final ArrayList f13694m = new ArrayList();

    /* renamed from: n */
    public final Set<C3906c> f13695n = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: o */
    public final Set<DefaultDrmSession> f13696o = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: p */
    public int f13697p;

    /* renamed from: q */
    public C3920f f13698q;

    /* renamed from: r */
    public DefaultDrmSession f13699r;

    /* renamed from: s */
    public DefaultDrmSession f13700s;

    /* renamed from: t */
    public Looper f13701t;

    /* renamed from: u */
    public Handler f13702u;

    /* renamed from: v */
    public int f13703v = 0;

    /* renamed from: w */
    public byte[] f13704w;

    /* renamed from: x */
    public volatile C3905b f13705x;

    public static final class MissingSchemeDataException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public MissingSchemeDataException(java.util.UUID r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 29
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Media does not support uuid: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException.<init>(java.util.UUID):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$a */
    public class C3904a implements C3920f.C3922b {
        public C3904a() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$b */
    public class C3905b extends Handler {
        public C3905b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                Iterator it = DefaultDrmSessionManager.this.f13694m.iterator();
                while (it.hasNext()) {
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) it.next();
                    if (Arrays.equals(defaultDrmSession.f13672t, bArr)) {
                        if (message.what == 2 && defaultDrmSession.f13657e == 0 && defaultDrmSession.f13666n == 4) {
                            int i = C6774a0.f20959a;
                            defaultDrmSession.mo15958g(false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$c */
    public class C3906c implements C3915c.C3917b {

        /* renamed from: b */
        public final C3912b.C3913a f13708b;

        /* renamed from: c */
        public DrmSession f13709c;

        /* renamed from: d */
        public boolean f13710d;

        public C3906c(C3912b.C3913a aVar) {
            this.f13708b = aVar;
        }

        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.f13702u;
            handler.getClass();
            C6774a0.m15966z(handler, new C4278e0(this, 5));
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d */
    public class C3907d implements DefaultDrmSession.C3899a {

        /* renamed from: a */
        public final HashSet f13712a = new HashSet();

        /* renamed from: b */
        public DefaultDrmSession f13713b;

        /* renamed from: a */
        public final void mo15978a(Exception exc) {
            this.f13713b = null;
            ImmutableList z = ImmutableList.m35691z(this.f13712a);
            this.f13712a.clear();
            C14439w0 u = z.iterator();
            while (u.hasNext()) {
                ((DefaultDrmSession) u.next()).mo15961i(exc);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$e */
    public class C3908e implements DefaultDrmSession.C3900b {
        public C3908e() {
        }
    }

    public DefaultDrmSessionManager(UUID uuid, C3920f.C3923c cVar, C3926h hVar, HashMap hashMap, boolean z, int[] iArr, boolean z2, C4076a aVar, long j) {
        uuid.getClass();
        C17875h.m44302l(!C4883f.f16442b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f13683b = uuid;
        this.f13684c = cVar;
        this.f13685d = hVar;
        this.f13686e = hashMap;
        this.f13687f = z;
        this.f13688g = iArr;
        this.f13689h = z2;
        this.f13691j = aVar;
        this.f13693l = j;
    }

    /* renamed from: b */
    public static boolean m10394b(DefaultDrmSession defaultDrmSession) {
        if (defaultDrmSession.f13666n == 1) {
            if (C6774a0.f20959a < 19) {
                return true;
            }
            DrmSession.DrmSessionException a = defaultDrmSession.mo15952a();
            a.getClass();
            if (a.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static ArrayList m10395i(DrmInitData drmInitData, UUID uuid, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList(drmInitData.f13718e);
        for (int i = 0; i < drmInitData.f13718e; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.f13715b[i];
            if (schemeData.mo15985b(uuid) || (C4883f.f16443c.equals(uuid) && schemeData.mo15985b(C4883f.f16442b))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (schemeData.f13723f != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final DrmSession mo15967a(Looper looper, C3912b.C3913a aVar, Format format, boolean z) {
        ArrayList arrayList;
        boolean z2;
        if (this.f13705x == null) {
            this.f13705x = new C3905b(looper);
        }
        DrmInitData drmInitData = format.f13421p;
        DefaultDrmSession defaultDrmSession = null;
        int i = 0;
        if (drmInitData == null) {
            int g = C6792n.m15994g(format.f13418m);
            C3920f fVar = this.f13698q;
            fVar.getClass();
            if (!C5654c.class.equals(fVar.mo16007a()) || !C5654c.f18411d) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return null;
            }
            int[] iArr = this.f13688g;
            int i2 = C6774a0.f20959a;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                } else if (iArr[i] == g) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1 || C5656e.class.equals(fVar.mo16007a())) {
                return null;
            }
            DefaultDrmSession defaultDrmSession2 = this.f13699r;
            if (defaultDrmSession2 == null) {
                DefaultDrmSession h = mo15973h(ImmutableList.m35687D(), true, (C3912b.C3913a) null, z);
                this.f13694m.add(h);
                this.f13699r = h;
            } else {
                defaultDrmSession2.mo15953b((C3912b.C3913a) null);
            }
            return this.f13699r;
        }
        if (this.f13704w == null) {
            arrayList = m10395i(drmInitData, this.f13683b, false);
            if (arrayList.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f13683b);
                C6776b0.m15968a("DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.mo16005e(missingSchemeDataException);
                }
                return new C3919e(new DrmSession.DrmSessionException(missingSchemeDataException));
            }
        } else {
            arrayList = null;
        }
        if (this.f13687f) {
            Iterator it = this.f13694m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession defaultDrmSession3 = (DefaultDrmSession) it.next();
                if (C6774a0.m15941a(defaultDrmSession3.f13653a, arrayList)) {
                    defaultDrmSession = defaultDrmSession3;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f13700s;
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = mo15973h(arrayList, false, aVar, z);
            if (!this.f13687f) {
                this.f13700s = defaultDrmSession;
            }
            this.f13694m.add(defaultDrmSession);
        } else {
            defaultDrmSession.mo15953b(aVar);
        }
        return defaultDrmSession;
    }

    /* renamed from: c */
    public final void mo15968c() {
        int i = this.f13697p;
        this.f13697p = i + 1;
        if (i == 0) {
            if (this.f13698q == null) {
                C3920f a = this.f13684c.mo16019a(this.f13683b);
                this.f13698q = a;
                a.mo16014h(new C3904a());
            } else if (this.f13693l != -9223372036854775807L) {
                for (int i2 = 0; i2 < this.f13694m.size(); i2++) {
                    ((DefaultDrmSession) this.f13694m.get(i2)).mo15953b((C3912b.C3913a) null);
                }
            }
        }
    }

    /* renamed from: d */
    public final DrmSession mo15969d(Looper looper, C3912b.C3913a aVar, Format format) {
        boolean z;
        if (this.f13697p > 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        mo15974j(looper);
        return mo15967a(looper, aVar, format, true);
    }

    /* renamed from: e */
    public final C3915c.C3917b mo15970e(Looper looper, C3912b.C3913a aVar, Format format) {
        boolean z;
        if (this.f13697p > 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        mo15974j(looper);
        C3906c cVar = new C3906c(aVar);
        Handler handler = this.f13702u;
        handler.getClass();
        handler.post(new C7218m(6, cVar, format));
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class<? extends p161la.C5653b> mo15971f(com.google.android.exoplayer2.Format r6) {
        /*
            r5 = this;
            com.google.android.exoplayer2.drm.f r0 = r5.f13698q
            r0.getClass()
            java.lang.Class r0 = r0.mo16007a()
            com.google.android.exoplayer2.drm.DrmInitData r1 = r6.f13421p
            r2 = 0
            if (r1 != 0) goto L_0x002a
            java.lang.String r6 = r6.f13418m
            int r6 = p277ub.C6792n.m15994g(r6)
            int[] r1 = r5.f13688g
            int r3 = p277ub.C6774a0.f20959a
        L_0x0018:
            int r3 = r1.length
            r4 = -1
            if (r2 >= r3) goto L_0x0024
            r3 = r1[r2]
            if (r3 != r6) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0024:
            r2 = -1
        L_0x0025:
            if (r2 == r4) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            return r0
        L_0x002a:
            byte[] r6 = r5.f13704w
            r3 = 1
            if (r6 == 0) goto L_0x0030
            goto L_0x008a
        L_0x0030:
            java.util.UUID r6 = r5.f13683b
            java.util.ArrayList r6 = m10395i(r1, r6, r3)
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x005d
            int r6 = r1.f13718e
            if (r6 != r3) goto L_0x008b
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r6 = r1.f13715b
            r6 = r6[r2]
            java.util.UUID r4 = p099ga.C4883f.f16442b
            boolean r6 = r6.mo15985b(r4)
            if (r6 == 0) goto L_0x008b
            java.util.UUID r6 = r5.f13683b
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r6 = r6.length()
            int r6 = r6 + 72
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
        L_0x005d:
            java.lang.String r6 = r1.f13717d
            if (r6 == 0) goto L_0x008a
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x006a
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0079
            int r6 = p277ub.C6774a0.f20959a
            r1 = 25
            if (r6 < r1) goto L_0x008b
            goto L_0x008a
        L_0x0079:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x008b
            java.lang.String r1 = "cens"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r2 = 1
        L_0x008b:
            if (r2 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            java.lang.Class<la.e> r0 = p161la.C5656e.class
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.mo15971f(com.google.android.exoplayer2.Format):java.lang.Class");
    }

    /* renamed from: g */
    public final DefaultDrmSession mo15972g(List<DrmInitData.SchemeData> list, boolean z, C3912b.C3913a aVar) {
        this.f13698q.getClass();
        UUID uuid = this.f13683b;
        C3920f fVar = this.f13698q;
        C3907d dVar = this.f13690i;
        C3908e eVar = this.f13692k;
        int i = this.f13703v;
        byte[] bArr = this.f13704w;
        HashMap<String, String> hashMap = this.f13686e;
        C3927i iVar = this.f13685d;
        Looper looper = this.f13701t;
        looper.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, fVar, dVar, eVar, list, i, this.f13689h | z, z, bArr, hashMap, iVar, looper, this.f13691j);
        defaultDrmSession.mo15953b(aVar);
        if (this.f13693l != -9223372036854775807L) {
            defaultDrmSession.mo15953b((C3912b.C3913a) null);
        }
        return defaultDrmSession;
    }

    /* renamed from: h */
    public final DefaultDrmSession mo15973h(List<DrmInitData.SchemeData> list, boolean z, C3912b.C3913a aVar, boolean z2) {
        DefaultDrmSession g = mo15972g(list, z, aVar);
        if (m10394b(g) && !this.f13696o.isEmpty()) {
            C14439w0 u = ImmutableSet.m35757C(this.f13696o).iterator();
            while (u.hasNext()) {
                ((DrmSession) u.next()).mo15954c((C3912b.C3913a) null);
            }
            g.mo15954c(aVar);
            if (this.f13693l != -9223372036854775807L) {
                g.mo15954c((C3912b.C3913a) null);
            }
            g = mo15972g(list, z, aVar);
        }
        if (!m10394b(g) || !z2 || this.f13695n.isEmpty()) {
            return g;
        }
        C14439w0 u2 = ImmutableSet.m35757C(this.f13695n).iterator();
        while (u2.hasNext()) {
            ((C3906c) u2.next()).release();
        }
        g.mo15954c(aVar);
        if (this.f13693l != -9223372036854775807L) {
            g.mo15954c((C3912b.C3913a) null);
        }
        return mo15972g(list, z, aVar);
    }

    /* renamed from: j */
    public final synchronized void mo15974j(Looper looper) {
        boolean z;
        Looper looper2 = this.f13701t;
        if (looper2 == null) {
            this.f13701t = looper;
            this.f13702u = new Handler(looper);
        } else {
            if (looper2 == looper) {
                z = true;
            } else {
                z = false;
            }
            C17875h.m44304o(z);
            this.f13702u.getClass();
        }
    }

    /* renamed from: k */
    public final void mo15975k() {
        if (this.f13698q != null && this.f13697p == 0 && this.f13694m.isEmpty() && this.f13695n.isEmpty()) {
            C3920f fVar = this.f13698q;
            fVar.getClass();
            fVar.release();
            this.f13698q = null;
        }
    }

    public final void release() {
        int i = this.f13697p - 1;
        this.f13697p = i;
        if (i == 0) {
            if (this.f13693l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f13694m);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((DefaultDrmSession) arrayList.get(i2)).mo15954c((C3912b.C3913a) null);
                }
            }
            C14439w0 u = ImmutableSet.m35757C(this.f13695n).iterator();
            while (u.hasNext()) {
                ((C3906c) u.next()).release();
            }
            mo15975k();
        }
    }
}
