package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import androidx.camera.core.impl.C0578e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p054d0.C4289j0;
import p066e0.C4424e;
import p066e0.C4427f0;
import p066e0.C4428g;
import p066e0.C4450p0;
import p153l0.C5551b;
import p153l0.C5552c;

public final class SessionConfig {

    /* renamed from: a */
    public final List<DeferrableSurface> f1932a;

    /* renamed from: b */
    public final List<CameraDevice.StateCallback> f1933b;

    /* renamed from: c */
    public final List<CameraCaptureSession.StateCallback> f1934c;

    /* renamed from: d */
    public final List<C4424e> f1935d;

    /* renamed from: e */
    public final List<C0567c> f1936e;

    /* renamed from: f */
    public final C0578e f1937f;

    /* renamed from: g */
    public InputConfiguration f1938g;

    public enum SessionError {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$a */
    public static class C0565a {

        /* renamed from: a */
        public final LinkedHashSet f1939a = new LinkedHashSet();

        /* renamed from: b */
        public final C0578e.C0579a f1940b = new C0578e.C0579a();

        /* renamed from: c */
        public final ArrayList f1941c = new ArrayList();

        /* renamed from: d */
        public final ArrayList f1942d = new ArrayList();

        /* renamed from: e */
        public final ArrayList f1943e = new ArrayList();

        /* renamed from: f */
        public final ArrayList f1944f = new ArrayList();

        /* renamed from: g */
        public InputConfiguration f1945g;
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$b */
    public static class C0566b extends C0565a {
        /* renamed from: d */
        public static C0566b m1604d(C0595r<?> rVar) {
            C0568d p = rVar.mo2497p();
            if (p != null) {
                C0566b bVar = new C0566b();
                p.mo2462a(rVar, bVar);
                return bVar;
            }
            StringBuilder k = C13555b.m33972k("Implementation is missing option unpacker for ");
            k.append(rVar.getTargetName(rVar.toString()));
            throw new IllegalStateException(k.toString());
        }

        /* renamed from: a */
        public final void mo2458a(C4424e eVar) {
            this.f1940b.mo2480b(eVar);
            if (!this.f1944f.contains(eVar)) {
                this.f1944f.add(eVar);
            }
        }

        /* renamed from: b */
        public final void mo2459b(CameraCaptureSession.StateCallback stateCallback) {
            if (!this.f1942d.contains(stateCallback)) {
                this.f1942d.add(stateCallback);
            }
        }

        /* renamed from: c */
        public final SessionConfig mo2460c() {
            return new SessionConfig(new ArrayList(this.f1939a), this.f1941c, this.f1942d, this.f1944f, this.f1943e, this.f1940b.mo2482d(), this.f1945g);
        }
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$c */
    public interface C0567c {
        void onError();
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$d */
    public interface C0568d {
        /* renamed from: a */
        void mo2462a(C0595r<?> rVar, C0566b bVar);
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$e */
    public static final class C0569e extends C0565a {

        /* renamed from: k */
        public static final List<Integer> f1946k = Arrays.asList(new Integer[]{1, 3});

        /* renamed from: h */
        public final C5552c f1947h = new C5552c();

        /* renamed from: i */
        public boolean f1948i = true;

        /* renamed from: j */
        public boolean f1949j = false;

        /* renamed from: a */
        public final void mo2463a(SessionConfig sessionConfig) {
            Map<String, Object> map;
            C0578e eVar = sessionConfig.f1937f;
            int i = eVar.f1972c;
            if (i != -1) {
                this.f1949j = true;
                C0578e.C0579a aVar = this.f1940b;
                int i2 = aVar.f1979c;
                List<Integer> list = f1946k;
                if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                    i = i2;
                }
                aVar.f1979c = i;
            }
            C4450p0 p0Var = sessionConfig.f1937f.f1975f;
            Map<String, Object> map2 = this.f1940b.f1982f.f15509a;
            if (!(map2 == null || (map = p0Var.f15509a) == null)) {
                map2.putAll(map);
            }
            this.f1941c.addAll(sessionConfig.f1933b);
            this.f1942d.addAll(sessionConfig.f1934c);
            this.f1940b.mo2479a(sessionConfig.f1937f.f1973d);
            this.f1944f.addAll(sessionConfig.f1935d);
            this.f1943e.addAll(sessionConfig.f1936e);
            InputConfiguration inputConfiguration = sessionConfig.f1938g;
            if (inputConfiguration != null) {
                this.f1945g = inputConfiguration;
            }
            this.f1939a.addAll(sessionConfig.mo2457b());
            this.f1940b.f1977a.addAll(eVar.mo2478a());
            if (!this.f1939a.containsAll(this.f1940b.f1977a)) {
                C4289j0.m11435b("ValidatingBuilder");
                this.f1948i = false;
            }
            this.f1940b.mo2481c(eVar.f1971b);
        }

        /* renamed from: b */
        public final SessionConfig mo2464b() {
            if (this.f1948i) {
                ArrayList arrayList = new ArrayList(this.f1939a);
                C5552c cVar = this.f1947h;
                if (cVar.f18183a) {
                    Collections.sort(arrayList, new C5551b(cVar, 0));
                }
                return new SessionConfig(arrayList, this.f1941c, this.f1942d, this.f1944f, this.f1943e, this.f1940b.mo2482d(), this.f1945g);
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
    }

    public SessionConfig(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, C0578e eVar, InputConfiguration inputConfiguration) {
        this.f1932a = arrayList;
        this.f1933b = Collections.unmodifiableList(arrayList2);
        this.f1934c = Collections.unmodifiableList(arrayList3);
        this.f1935d = Collections.unmodifiableList(arrayList4);
        this.f1936e = Collections.unmodifiableList(arrayList5);
        this.f1937f = eVar;
        this.f1938g = inputConfiguration;
    }

    /* renamed from: a */
    public static SessionConfig m1602a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        ArrayList arrayList5 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        C0589m t = C0589m.m1674t();
        ArrayList arrayList6 = new ArrayList();
        C4427f0 c = C4427f0.m11609c();
        ArrayList arrayList7 = new ArrayList(hashSet);
        C0590n s = C0590n.m1678s(t);
        C4450p0 p0Var = C4450p0.f15508b;
        ArrayMap arrayMap = new ArrayMap();
        for (String next : c.mo19987b()) {
            arrayMap.put(next, c.mo19986a(next));
        }
        return new SessionConfig(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, new C0578e(arrayList7, s, -1, arrayList6, false, new C4450p0(arrayMap), (C4428g) null), (InputConfiguration) null);
    }

    /* renamed from: b */
    public final List<DeferrableSurface> mo2457b() {
        return Collections.unmodifiableList(this.f1932a);
    }
}
