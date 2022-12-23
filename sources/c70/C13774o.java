package c70;

import android.content.Context;
import b00.C13556a;
import ce0.C21100e;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p241s0.C6302b;
import p241s0.C6307g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;

/* renamed from: c70.o */
public abstract class C13774o implements C13556a {

    /* renamed from: b */
    public final ArrayList f33912b;

    /* renamed from: c */
    public final CollectionHashMap.ArrayListHashMap f33913c = new CollectionHashMap.ArrayListHashMap();

    /* renamed from: d */
    public int f33914d = 0;

    /* renamed from: e */
    public final C6302b f33915e = new C6302b();

    /* renamed from: f */
    public final C6302b f33916f = new C6302b();

    /* renamed from: c70.o$a */
    public class C13775a<RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> implements C20437h<RQ, RS> {

        /* renamed from: b */
        public final String f33917b;

        public C13775a(String str) {
            C21100e.m49373x(str, "requestId");
            this.f33917b = str;
        }

        /* renamed from: a */
        public final void mo313a(RQ rq, boolean z) {
            C13774o oVar = C13774o.this;
            String str = this.f33917b;
            oVar.f33914d++;
            if (z) {
                oVar.f33915e.put(str, null);
            }
            if (oVar.f33914d == oVar.f33912b.size()) {
                oVar.mo40704a(oVar.f33913c, oVar.f33915e);
            }
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C13774o oVar = C13774o.this;
            oVar.f33915e.put(this.f33917b, serverException);
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(RQ rq, IOException iOException) {
            C13774o oVar = C13774o.this;
            oVar.f33915e.put(this.f33917b, iOException);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C13774o oVar = C13774o.this;
            oVar.f33915e.put(this.f33917b, iOException);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(RQ rq, RS rs) {
            C13774o oVar = C13774o.this;
            oVar.f33913c.mo47001a(this.f33917b, rs);
        }
    }

    public C13774o(Collection<? extends C13753f<?>> collection) {
        if (!collection.isEmpty()) {
            this.f33912b = new ArrayList(collection);
            return;
        }
        throw new IllegalArgumentException("requests may not be null or empty");
    }

    /* renamed from: a */
    public abstract void mo40704a(CollectionHashMap.ArrayListHashMap arrayListHashMap, C6302b bVar);

    /* renamed from: b */
    public final void mo40705b(Context context) {
        Iterator it = this.f33912b.iterator();
        while (it.hasNext()) {
            C13753f fVar = (C13753f) it.next();
            String str = fVar.f33855a;
            C13775a aVar = new C13775a(str);
            if (this.f33916f.put(str, ((C13756i) context.getSystemService("request_manager")).mo40684g(str, fVar.f33856b, fVar.f33857c, aVar)) != null) {
                throw new IllegalStateException("The list of request IDs may not contain duplicates");
            }
        }
    }

    public boolean cancel(boolean z) {
        Iterator it = ((C6307g.C6312e) this.f33916f.values()).iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            z2 &= ((C13556a) it.next()).cancel(z);
        }
        this.f33916f.clear();
        return z2;
    }
}
