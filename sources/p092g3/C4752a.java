package p092g3;

import android.graphics.Path;
import android.os.Looper;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p107h5.C5059g;
import p177n1.C5807g;
import p321y4.C7332r;
import p363ak.C13477c;
import p363ak.C13478d;
import p364al.C13487h;
import p364al.C13488i;
import p411cm.C13845c;
import p725pj.C18926a;
import p819tk.C19690g;

/* renamed from: g3.a */
public final class C4752a implements C13845c {

    /* renamed from: a */
    public Object f16037a;

    public C4752a(zzx zzx) {
        Preconditions.checkNotNull(zzx);
        this.f16037a = zzx;
    }

    /* renamed from: a */
    public final void mo4326a(C19690g gVar) {
        C13487h hVar;
        int i = gVar.f49981c;
        if (i < 200 || i >= 400) {
            hVar = new C13487h(null, new C13478d((C13477c) null, Integer.valueOf(i), new String(gVar.f49980b)));
        } else {
            hVar = new C13487h(gVar, (C18926a) null);
        }
        ((C13488i) this.f16037a).mo40393a(hVar);
    }

    /* renamed from: b */
    public final void mo4327b(C13477c cVar) {
        C13487h hVar;
        C13488i iVar = (C13488i) this.f16037a;
        if (C13477c.f33352f.equals(cVar.f48170b)) {
            hVar = new C13487h(null, new C13478d(cVar, C13478d.f33357i, "HTTPS certificate validation failure"));
        } else {
            hVar = new C13487h(null, new C13478d(cVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        }
        iVar.mo40393a(hVar);
    }

    /* renamed from: c */
    public final void mo20256c(Object obj) {
        ((ArrayList) this.f16037a).add(obj);
    }

    /* renamed from: d */
    public final void mo20257d(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    Object obj2 = this.f16037a;
                    ((ArrayList) obj2).ensureCapacity(((ArrayList) obj2).size() + objArr.length);
                    Collections.addAll((ArrayList) this.f16037a, objArr);
                }
            } else if (obj instanceof Collection) {
                ((ArrayList) this.f16037a).addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    ((ArrayList) this.f16037a).add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    ((ArrayList) this.f16037a).add(it.next());
                }
            } else {
                StringBuilder k = C13555b.m33972k("Don't know how to spread ");
                k.append(obj.getClass());
                throw new UnsupportedOperationException(k.toString());
            }
        }
    }

    /* renamed from: e */
    public final void mo20258e(Path path) {
        int size = ((List) this.f16037a).size();
        while (true) {
            size--;
            if (size >= 0) {
                C7332r rVar = (C7332r) ((List) this.f16037a).get(size);
                C5059g.C5060a aVar = C5059g.f17057a;
                if (rVar != null && !rVar.f22550a) {
                    C5059g.m12908a(path, rVar.f22553d.mo23733l() / 100.0f, rVar.f22554e.mo23733l() / 100.0f, rVar.f22555f.mo23733l() / 360.0f);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final int mo20259f() {
        return ((ArrayList) this.f16037a).size();
    }

    /* renamed from: g */
    public final Object[] mo20260g(Object[] objArr) {
        return ((ArrayList) this.f16037a).toArray(objArr);
    }

    public /* synthetic */ C4752a(Object obj) {
        this.f16037a = obj;
    }

    public /* synthetic */ C4752a(int i) {
        this.f16037a = new ArrayList(i);
    }

    public /* synthetic */ C4752a(CallableMemberDescriptor callableMemberDescriptor) {
        this.f16037a = callableMemberDescriptor;
    }

    public C4752a(int i, int i2) {
        if (i == 1) {
            this.f16037a = new ArrayList();
        } else if (i == 2) {
        } else {
            if (i != 7) {
                this.f16037a = C5807g.m14238a(Looper.getMainLooper());
            } else {
                this.f16037a = new HashMap();
            }
        }
    }
}
