package i30;

import c00.C13720d;
import c00.C13722f;
import com.facebook.appevents.C2342l;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p009a8.C0112l;
import p054d0.C4303q;
import p638lr.C18262i;
import p638lr.C18267n;
import p826tr.C19752b;
import p875vs.C20228e;
import p900wt.C20415e;
import p977zz.C20944i0;

/* renamed from: i30.e */
public final class C5269e implements Iterable<C20944i0<MetroEntityType, ServerId>> {

    /* renamed from: b */
    public final CollectionHashMap.HashSetHashMap<MetroEntityType, ServerId> f17412b = new CollectionHashMap.HashSetHashMap<>();

    /* renamed from: c */
    public final HashSet f17413c = new HashSet(2);

    /* renamed from: i30.e$a */
    public static class C5270a {

        /* renamed from: a */
        public final HashSet f17414a = new HashSet();

        /* renamed from: b */
        public final HashSet f17415b = new HashSet();

        /* renamed from: c */
        public final HashSet f17416c = new HashSet();

        /* renamed from: d */
        public final HashSet f17417d = new HashSet();

        /* renamed from: e */
        public final HashSet f17418e = new HashSet();

        /* renamed from: f */
        public boolean f17419f = false;

        /* renamed from: g */
        public final HashSet f17420g = new HashSet();

        /* renamed from: h */
        public final HashSet f17421h = new HashSet();

        /* renamed from: i */
        public final HashSet f17422i = new HashSet();

        /* renamed from: a */
        public final C5269e mo21074a() {
            C5269e eVar = new C5269e();
            if (!this.f17414a.isEmpty()) {
                HashSet g = C13720d.m34277g(this.f17414a, (C13722f) null, new C20228e(16));
                eVar.f17412b.mo47002b(MetroEntityType.TRANSIT_STOP, g);
            }
            if (!this.f17415b.isEmpty()) {
                HashSet g2 = C13720d.m34277g(this.f17415b, (C13722f) null, new C0112l(12));
                eVar.f17412b.mo47002b(MetroEntityType.BICYCLE_STOP, g2);
            }
            if (!this.f17417d.isEmpty()) {
                HashSet g3 = C13720d.m34277g(this.f17417d, (C13722f) null, new C4303q(16));
                eVar.f17412b.mo47002b(MetroEntityType.TRANSIT_LINE, g3);
            }
            if (!this.f17416c.isEmpty()) {
                HashSet g4 = C13720d.m34277g(this.f17416c, (C13722f) null, new C20415e(10));
                eVar.f17412b.mo47002b(MetroEntityType.TRANSIT_LINE_GROUP, g4);
            }
            if (!this.f17418e.isEmpty()) {
                HashSet g5 = C13720d.m34277g(this.f17418e, (C13722f) null, new C19752b(10));
                MetroEntityType metroEntityType = MetroEntityType.TRANSIT_PATTERN;
                eVar.f17412b.mo47002b(metroEntityType, g5);
                if (this.f17419f) {
                    eVar.mo21067b(metroEntityType);
                }
            }
            if (!this.f17420g.isEmpty()) {
                HashSet g6 = C13720d.m34277g(this.f17420g, (C13722f) null, new C2342l(14));
                eVar.f17412b.mo47002b(MetroEntityType.SHAPE, g6);
            }
            if (!this.f17421h.isEmpty()) {
                HashSet g7 = C13720d.m34277g(this.f17421h, (C13722f) null, new C18262i(16));
                eVar.f17412b.mo47002b(MetroEntityType.SHAPE_SEGMENT, g7);
            }
            if (!this.f17422i.isEmpty()) {
                HashSet g8 = C13720d.m34277g(this.f17422i, (C13722f) null, new C18267n(15));
                eVar.f17412b.mo47002b(MetroEntityType.TRANSIT_FREQUENCIES, g8);
            }
            if (eVar.isEmpty()) {
                return null;
            }
            return eVar;
        }

        /* renamed from: b */
        public final void mo21075b(int i) {
            this.f17417d.add(Integer.valueOf(i));
        }

        /* renamed from: c */
        public final void mo21076c(int i) {
            this.f17414a.add(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo21066a(MetroEntityType metroEntityType, ServerId serverId) {
        this.f17412b.mo47001a(metroEntityType, serverId);
    }

    /* renamed from: b */
    public final void mo21067b(MetroEntityType metroEntityType) {
        this.f17413c.add(metroEntityType);
    }

    /* renamed from: d */
    public final Set<ServerId> mo21068d(MetroEntityType metroEntityType) {
        Set set = (Set) this.f17412b.get(metroEntityType);
        if (set == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(set);
    }

    /* renamed from: e */
    public final Set<MetroEntityType> mo21069e() {
        return Collections.unmodifiableSet(this.f17412b.keySet());
    }

    /* renamed from: i */
    public final boolean mo21070i(MetroEntityType metroEntityType, Set set) {
        CollectionHashMap.HashSetHashMap<MetroEntityType, ServerId> hashSetHashMap = this.f17412b;
        Collection collection = (Collection) hashSetHashMap.get(metroEntityType);
        if (collection == null) {
            return false;
        }
        boolean removeAll = collection.removeAll(set);
        if (collection.isEmpty()) {
            hashSetHashMap.remove(metroEntityType);
        }
        return removeAll;
    }

    public final boolean isEmpty() {
        return this.f17412b.isEmpty();
    }

    public final Iterator<C20944i0<MetroEntityType, ServerId>> iterator() {
        return this.f17412b.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (MetroEntityType next : this.f17412b.keySet()) {
            sb.append(" Type ");
            sb.append(next);
            Set set = (Set) this.f17412b.get(next);
            if (set == null) {
                sb.append(" none");
            } else {
                sb.append(" size=");
                sb.append(set.size());
            }
        }
        return sb.toString();
    }
}
