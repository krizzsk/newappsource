package com.tranzmate.moovit.protocol.payments;

import com.appboy.models.MessageButton;
import com.appboy.support.StringUtils;
import com.unity3d.ads.metadata.MediationMetaData;
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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVTOS implements TBase<MVTOS, _Fields>, Serializable, Cloneable, Comparable<MVTOS> {

    /* renamed from: b */
    public static final C25113c f27703b = new C25113c(MessageButton.TEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27704c = new C25113c("links", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f27705d = new C25113c(MediationMetaData.KEY_VERSION, (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f27706e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27707f;
    private byte __isset_bitfield = 0;
    public List<MVTOSLink> links;
    public String text;
    public int version;

    public enum _Fields implements C25085c {
        TEXT(1, MessageButton.TEXT),
        LINKS(2, "links"),
        VERSION(3, MediationMetaData.KEY_VERSION);
        
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
                return TEXT;
            }
            if (i == 2) {
                return LINKS;
            }
            if (i != 3) {
                return null;
            }
            return VERSION;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTOS$a */
    public static class C10069a extends C25239c<MVTOS> {
        public C10069a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTOS mvtos = (MVTOS) tBase;
            mvtos.getClass();
            C25113c cVar = MVTOS.f27703b;
            gVar.mo61687K();
            if (mvtos.text != null) {
                gVar.mo61711x(MVTOS.f27703b);
                gVar.mo61686J(mvtos.text);
                gVar.mo61712y();
            }
            if (mvtos.links != null) {
                gVar.mo61711x(MVTOS.f27704c);
                gVar.mo61680D(new C25119e((byte) 12, mvtos.links.size()));
                for (MVTOSLink X0 : mvtos.links) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTOS.f27705d);
            C16530d.m42020n(gVar, mvtos.version);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTOS mvtos = (MVTOS) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mvtos.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mvtos.version = gVar.mo61696i();
                            mvtos.mo30609i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mvtos.links = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVTOSLink mVTOSLink = new MVTOSLink();
                            mVTOSLink.mo25201C1(gVar);
                            mvtos.links.add(mVTOSLink);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mvtos.text = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTOS$b */
    public static class C10070b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10069a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTOS$c */
    public static class C10071c extends C25240d<MVTOS> {
        public C10071c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTOS mvtos = (MVTOS) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mvtos.mo30606g()) {
                bitSet.set(0);
            }
            if (mvtos.mo30605f()) {
                bitSet.set(1);
            }
            if (mvtos.mo30607h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mvtos.mo30606g()) {
                jVar.mo61686J(mvtos.text);
            }
            if (mvtos.mo30605f()) {
                jVar.mo61678B(mvtos.links.size());
                for (MVTOSLink X0 : mvtos.links) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mvtos.mo30607h()) {
                jVar.mo61678B(mvtos.version);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTOS mvtos = (MVTOS) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mvtos.text = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mvtos.links = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTOSLink mVTOSLink = new MVTOSLink();
                    mVTOSLink.mo25201C1(jVar);
                    mvtos.links.add(mVTOSLink);
                }
            }
            if (T.get(2)) {
                mvtos.version = jVar.mo61696i();
                mvtos.mo30609i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTOS$d */
    public static class C10072d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10071c(0);
        }
    }

    static {
        new C17394d0("MVTOS");
        HashMap hashMap = new HashMap();
        f27706e = hashMap;
        hashMap.put(C25239c.class, new C10070b());
        hashMap.put(C25240d.class, new C10072d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LINKS, new FieldMetaData("links", (byte) 3, new ListMetaData(new StructMetaData(MVTOSLink.class))));
        enumMap.put(_Fields.VERSION, new FieldMetaData(MediationMetaData.KEY_VERSION, (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27707f = unmodifiableMap;
        FieldMetaData.m61947a(MVTOS.class, unmodifiableMap);
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
        ((C25238b) f27706e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27706e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30602a(MVTOS mvtos) {
        if (mvtos == null) {
            return false;
        }
        boolean g = mo30606g();
        boolean g2 = mvtos.mo30606g();
        if ((g || g2) && (!g || !g2 || !this.text.equals(mvtos.text))) {
            return false;
        }
        boolean f = mo30605f();
        boolean f2 = mvtos.mo30605f();
        if (((f || f2) && (!f || !f2 || !this.links.equals(mvtos.links))) || this.version != mvtos.version) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVTOS mvtos = (MVTOS) obj;
        if (!getClass().equals(mvtos.getClass())) {
            return getClass().getName().compareTo(mvtos.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30606g()).compareTo(Boolean.valueOf(mvtos.mo30606g()));
        if (compareTo != 0 || ((mo30606g() && (compareTo = this.text.compareTo(mvtos.text)) != 0) || (compareTo = Boolean.valueOf(mo30605f()).compareTo(Boolean.valueOf(mvtos.mo30605f()))) != 0 || ((mo30605f() && (compareTo = C25082a.m62844h(this.links, mvtos.links)) != 0) || (compareTo = Boolean.valueOf(mo30607h()).compareTo(Boolean.valueOf(mvtos.mo30607h()))) != 0))) {
            return compareTo;
        }
        if (!mo30607h() || (c = C25082a.m62839c(this.version, mvtos.version)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTOS)) {
            return mo30602a((MVTOS) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30605f() {
        return this.links != null;
    }

    /* renamed from: g */
    public final boolean mo30606g() {
        return this.text != null;
    }

    /* renamed from: h */
    public final boolean mo30607h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo30609i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTOS(", "text:");
        String str = this.text;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("links:");
        List<MVTOSLink> list = this.links;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("version:");
        return C13437d.m33707l(n, this.version, ")");
    }
}
