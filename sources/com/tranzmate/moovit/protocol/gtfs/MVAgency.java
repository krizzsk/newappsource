package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.presentation.MVPresentationLineTemplate;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVAgency implements TBase<MVAgency, _Fields>, Serializable, Cloneable, Comparable<MVAgency> {

    /* renamed from: b */
    public static final C25113c f25673b = new C25113c("agencyId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25674c = new C25113c("agencyName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25675d = new C25113c("routeType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25676e = new C25113c("image", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25677f = new C25113c("presentationLineTemplates", (byte) 15, 5);

    /* renamed from: g */
    public static final HashMap f25678g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25679h;
    private byte __isset_bitfield = 0;
    public int agencyId;
    public String agencyName;
    public int image;
    private _Fields[] optionals = {_Fields.IMAGE};
    public List<MVPresentationLineTemplate> presentationLineTemplates;
    public MVRouteType routeType;

    public enum _Fields implements C25085c {
        AGENCY_ID(1, "agencyId"),
        AGENCY_NAME(2, "agencyName"),
        ROUTE_TYPE(3, "routeType"),
        IMAGE(4, "image"),
        PRESENTATION_LINE_TEMPLATES(5, "presentationLineTemplates");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            if (i == 1) {
                return AGENCY_ID;
            }
            if (i == 2) {
                return AGENCY_NAME;
            }
            if (i == 3) {
                return ROUTE_TYPE;
            }
            if (i == 4) {
                return IMAGE;
            }
            if (i != 5) {
                return null;
            }
            return PRESENTATION_LINE_TEMPLATES;
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVAgency$a */
    public static class C8763a extends C25239c<MVAgency> {
        public C8763a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAgency mVAgency = (MVAgency) tBase;
            mVAgency.getClass();
            C25113c cVar = MVAgency.f25673b;
            gVar.mo61687K();
            gVar.mo61711x(MVAgency.f25673b);
            gVar.mo61678B(mVAgency.agencyId);
            gVar.mo61712y();
            if (mVAgency.agencyName != null) {
                gVar.mo61711x(MVAgency.f25674c);
                gVar.mo61686J(mVAgency.agencyName);
                gVar.mo61712y();
            }
            if (mVAgency.routeType != null) {
                gVar.mo61711x(MVAgency.f25675d);
                gVar.mo61678B(mVAgency.routeType.getValue());
                gVar.mo61712y();
            }
            if (mVAgency.mo27302h()) {
                gVar.mo61711x(MVAgency.f25676e);
                gVar.mo61678B(mVAgency.image);
                gVar.mo61712y();
            }
            if (mVAgency.presentationLineTemplates != null) {
                gVar.mo61711x(MVAgency.f25677f);
                gVar.mo61680D(new C25119e((byte) 12, mVAgency.presentationLineTemplates.size()));
                for (MVPresentationLineTemplate X0 : mVAgency.presentationLineTemplates) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAgency mVAgency = (MVAgency) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAgency.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 15) {
                                    C25119e k = gVar.mo61698k();
                                    mVAgency.presentationLineTemplates = new ArrayList(k.f63395b);
                                    for (int i = 0; i < k.f63395b; i++) {
                                        MVPresentationLineTemplate mVPresentationLineTemplate = new MVPresentationLineTemplate();
                                        mVPresentationLineTemplate.mo25201C1(gVar);
                                        mVAgency.presentationLineTemplates.add(mVPresentationLineTemplate);
                                    }
                                    gVar.mo61699l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVAgency.image = gVar.mo61696i();
                                mVAgency.mo27307l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVAgency.routeType = MVRouteType.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVAgency.agencyName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAgency.agencyId = gVar.mo61696i();
                    mVAgency.mo27306k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVAgency$b */
    public static class C8764b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8763a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVAgency$c */
    public static class C8765c extends C25240d<MVAgency> {
        public C8765c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAgency mVAgency = (MVAgency) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAgency.mo27300f()) {
                bitSet.set(0);
            }
            if (mVAgency.mo27301g()) {
                bitSet.set(1);
            }
            if (mVAgency.mo27305j()) {
                bitSet.set(2);
            }
            if (mVAgency.mo27302h()) {
                bitSet.set(3);
            }
            if (mVAgency.mo27304i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVAgency.mo27300f()) {
                jVar.mo61678B(mVAgency.agencyId);
            }
            if (mVAgency.mo27301g()) {
                jVar.mo61686J(mVAgency.agencyName);
            }
            if (mVAgency.mo27305j()) {
                jVar.mo61678B(mVAgency.routeType.getValue());
            }
            if (mVAgency.mo27302h()) {
                jVar.mo61678B(mVAgency.image);
            }
            if (mVAgency.mo27304i()) {
                jVar.mo61678B(mVAgency.presentationLineTemplates.size());
                for (MVPresentationLineTemplate X0 : mVAgency.presentationLineTemplates) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAgency mVAgency = (MVAgency) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVAgency.agencyId = jVar.mo61696i();
                mVAgency.mo27306k();
            }
            if (T.get(1)) {
                mVAgency.agencyName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVAgency.routeType = MVRouteType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVAgency.image = jVar.mo61696i();
                mVAgency.mo27307l();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVAgency.presentationLineTemplates = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPresentationLineTemplate mVPresentationLineTemplate = new MVPresentationLineTemplate();
                    mVPresentationLineTemplate.mo25201C1(jVar);
                    mVAgency.presentationLineTemplates.add(mVPresentationLineTemplate);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVAgency$d */
    public static class C8766d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8765c(0);
        }
    }

    static {
        new C17394d0("MVAgency");
        HashMap hashMap = new HashMap();
        f25678g = hashMap;
        hashMap.put(C25239c.class, new C8764b());
        hashMap.put(C25240d.class, new C8766d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_NAME, new FieldMetaData("agencyName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ROUTE_TYPE, new FieldMetaData("routeType", (byte) 3, new EnumMetaData(MVRouteType.class)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        enumMap.put(_Fields.PRESENTATION_LINE_TEMPLATES, new FieldMetaData("presentationLineTemplates", (byte) 3, new ListMetaData(new StructMetaData(MVPresentationLineTemplate.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25679h = unmodifiableMap;
        FieldMetaData.m61947a(MVAgency.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f25678g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25678g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVAgency mVAgency = (MVAgency) obj;
        if (!getClass().equals(mVAgency.getClass())) {
            return getClass().getName().compareTo(mVAgency.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27300f()).compareTo(Boolean.valueOf(mVAgency.mo27300f()));
        if (compareTo != 0 || ((mo27300f() && (compareTo = C25082a.m62839c(this.agencyId, mVAgency.agencyId)) != 0) || (compareTo = Boolean.valueOf(mo27301g()).compareTo(Boolean.valueOf(mVAgency.mo27301g()))) != 0 || ((mo27301g() && (compareTo = this.agencyName.compareTo(mVAgency.agencyName)) != 0) || (compareTo = Boolean.valueOf(mo27305j()).compareTo(Boolean.valueOf(mVAgency.mo27305j()))) != 0 || ((mo27305j() && (compareTo = this.routeType.compareTo(mVAgency.routeType)) != 0) || (compareTo = Boolean.valueOf(mo27302h()).compareTo(Boolean.valueOf(mVAgency.mo27302h()))) != 0 || ((mo27302h() && (compareTo = C25082a.m62839c(this.image, mVAgency.image)) != 0) || (compareTo = Boolean.valueOf(mo27304i()).compareTo(Boolean.valueOf(mVAgency.mo27304i()))) != 0))))) {
            return compareTo;
        }
        if (!mo27304i() || (h = C25082a.m62844h(this.presentationLineTemplates, mVAgency.presentationLineTemplates)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAgency)) {
            return false;
        }
        MVAgency mVAgency = (MVAgency) obj;
        if (this.agencyId != mVAgency.agencyId) {
            return false;
        }
        boolean g = mo27301g();
        boolean g2 = mVAgency.mo27301g();
        if ((g || g2) && (!g || !g2 || !this.agencyName.equals(mVAgency.agencyName))) {
            return false;
        }
        boolean j = mo27305j();
        boolean j2 = mVAgency.mo27305j();
        if ((j || j2) && (!j || !j2 || !this.routeType.equals(mVAgency.routeType))) {
            return false;
        }
        boolean h = mo27302h();
        boolean h2 = mVAgency.mo27302h();
        if ((h || h2) && (!h || !h2 || this.image != mVAgency.image)) {
            return false;
        }
        boolean i = mo27304i();
        boolean i2 = mVAgency.mo27304i();
        if ((i || i2) && (!i || !i2 || !this.presentationLineTemplates.equals(mVAgency.presentationLineTemplates))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27300f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo27301g() {
        return this.agencyName != null;
    }

    /* renamed from: h */
    public final boolean mo27302h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27304i() {
        return this.presentationLineTemplates != null;
    }

    /* renamed from: j */
    public final boolean mo27305j() {
        return this.routeType != null;
    }

    /* renamed from: k */
    public final void mo27306k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo27307l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAgency(", "agencyId:");
        C0016g.m42z(n, this.agencyId, ", ", "agencyName:");
        String str = this.agencyName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("routeType:");
        MVRouteType mVRouteType = this.routeType;
        if (mVRouteType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRouteType);
        }
        if (mo27302h()) {
            n.append(", ");
            n.append("image:");
            n.append(this.image);
        }
        n.append(", ");
        n.append("presentationLineTemplates:");
        List<MVPresentationLineTemplate> list = this.presentationLineTemplates;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
