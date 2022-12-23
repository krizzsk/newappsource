package com.tranzmate.moovit.protocol.common;

import com.appboy.models.MessageButton;
import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.MapMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25120f;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVErrorMessage implements TBase<MVErrorMessage, _Fields>, Serializable, Cloneable, Comparable<MVErrorMessage> {

    /* renamed from: b */
    public static final C25113c f25005b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25006c = new C25113c(MessageButton.TEXT, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25007d = new C25113c("code", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25008e = new C25113c("technicalInformation", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f25009f = new C25113c("properties", (byte) 13, 5);

    /* renamed from: g */
    public static final HashMap f25010g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25011h;
    private byte __isset_bitfield = 0;
    public int code;
    private _Fields[] optionals = {_Fields.TECHNICAL_INFORMATION, _Fields.PROPERTIES};
    public Map<String, String> properties;
    public String technicalInformation;
    public String text;
    public String title;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        TEXT(2, MessageButton.TEXT),
        CODE(3, "code"),
        TECHNICAL_INFORMATION(4, "technicalInformation"),
        PROPERTIES(5, "properties");
        
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
                return TITLE;
            }
            if (i == 2) {
                return TEXT;
            }
            if (i == 3) {
                return CODE;
            }
            if (i == 4) {
                return TECHNICAL_INFORMATION;
            }
            if (i != 5) {
                return null;
            }
            return PROPERTIES;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVErrorMessage$a */
    public static class C8396a extends C25239c<MVErrorMessage> {
        public C8396a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVErrorMessage mVErrorMessage = (MVErrorMessage) tBase;
            mVErrorMessage.getClass();
            C25113c cVar = MVErrorMessage.f25005b;
            gVar.mo61687K();
            if (mVErrorMessage.title != null) {
                gVar.mo61711x(MVErrorMessage.f25005b);
                gVar.mo61686J(mVErrorMessage.title);
                gVar.mo61712y();
            }
            if (mVErrorMessage.text != null) {
                gVar.mo61711x(MVErrorMessage.f25006c);
                gVar.mo61686J(mVErrorMessage.text);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVErrorMessage.f25007d);
            gVar.mo61678B(mVErrorMessage.code);
            gVar.mo61712y();
            if (mVErrorMessage.technicalInformation != null && mVErrorMessage.mo26150h()) {
                gVar.mo61711x(MVErrorMessage.f25008e);
                gVar.mo61686J(mVErrorMessage.technicalInformation);
                gVar.mo61712y();
            }
            if (mVErrorMessage.properties != null && mVErrorMessage.mo26149g()) {
                gVar.mo61711x(MVErrorMessage.f25009f);
                gVar.mo61682F(new C25120f((byte) 11, (byte) 11, mVErrorMessage.properties.size()));
                for (Map.Entry next : mVErrorMessage.properties.entrySet()) {
                    gVar.mo61686J((String) next.getKey());
                    gVar.mo61686J((String) next.getValue());
                }
                gVar.mo61683G();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVErrorMessage mVErrorMessage = (MVErrorMessage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVErrorMessage.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 13) {
                                    C25120f m = gVar.mo61700m();
                                    mVErrorMessage.properties = new HashMap(m.f63398c * 2);
                                    for (int i = 0; i < m.f63398c; i++) {
                                        mVErrorMessage.properties.put(gVar.mo61704q(), gVar.mo61704q());
                                    }
                                    gVar.mo61701n();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVErrorMessage.technicalInformation = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVErrorMessage.code = gVar.mo61696i();
                            mVErrorMessage.mo26154k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVErrorMessage.text = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVErrorMessage.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVErrorMessage$b */
    public static class C8397b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8396a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVErrorMessage$c */
    public static class C8398c extends C25240d<MVErrorMessage> {
        public C8398c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVErrorMessage mVErrorMessage = (MVErrorMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVErrorMessage.mo26153j()) {
                bitSet.set(0);
            }
            if (mVErrorMessage.mo26152i()) {
                bitSet.set(1);
            }
            if (mVErrorMessage.mo26148f()) {
                bitSet.set(2);
            }
            if (mVErrorMessage.mo26150h()) {
                bitSet.set(3);
            }
            if (mVErrorMessage.mo26149g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVErrorMessage.mo26153j()) {
                jVar.mo61686J(mVErrorMessage.title);
            }
            if (mVErrorMessage.mo26152i()) {
                jVar.mo61686J(mVErrorMessage.text);
            }
            if (mVErrorMessage.mo26148f()) {
                jVar.mo61678B(mVErrorMessage.code);
            }
            if (mVErrorMessage.mo26150h()) {
                jVar.mo61686J(mVErrorMessage.technicalInformation);
            }
            if (mVErrorMessage.mo26149g()) {
                jVar.mo61678B(mVErrorMessage.properties.size());
                for (Map.Entry next : mVErrorMessage.properties.entrySet()) {
                    jVar.mo61686J((String) next.getKey());
                    jVar.mo61686J((String) next.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVErrorMessage mVErrorMessage = (MVErrorMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVErrorMessage.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVErrorMessage.text = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVErrorMessage.code = jVar.mo61696i();
                mVErrorMessage.mo26154k();
            }
            if (T.get(3)) {
                mVErrorMessage.technicalInformation = jVar.mo61704q();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVErrorMessage.properties = new HashMap(i * 2);
                for (int i2 = 0; i2 < i; i2++) {
                    mVErrorMessage.properties.put(jVar.mo61704q(), jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVErrorMessage$d */
    public static class C8399d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8398c(0);
        }
    }

    static {
        new C17394d0("MVErrorMessage");
        HashMap hashMap = new HashMap();
        f25010g = hashMap;
        hashMap.put(C25239c.class, new C8397b());
        hashMap.put(C25240d.class, new C8399d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CODE, new FieldMetaData("code", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TECHNICAL_INFORMATION, new FieldMetaData("technicalInformation", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROPERTIES, new FieldMetaData("properties", (byte) 2, new MapMetaData(new FieldValueMetaData((byte) 11, false), new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25011h = unmodifiableMap;
        FieldMetaData.m61947a(MVErrorMessage.class, unmodifiableMap);
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
        ((C25238b) f25010g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25010g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int i;
        MVErrorMessage mVErrorMessage = (MVErrorMessage) obj;
        if (!getClass().equals(mVErrorMessage.getClass())) {
            return getClass().getName().compareTo(mVErrorMessage.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26153j()).compareTo(Boolean.valueOf(mVErrorMessage.mo26153j()));
        if (compareTo != 0 || ((mo26153j() && (compareTo = this.title.compareTo(mVErrorMessage.title)) != 0) || (compareTo = Boolean.valueOf(mo26152i()).compareTo(Boolean.valueOf(mVErrorMessage.mo26152i()))) != 0 || ((mo26152i() && (compareTo = this.text.compareTo(mVErrorMessage.text)) != 0) || (compareTo = Boolean.valueOf(mo26148f()).compareTo(Boolean.valueOf(mVErrorMessage.mo26148f()))) != 0 || ((mo26148f() && (compareTo = C25082a.m62839c(this.code, mVErrorMessage.code)) != 0) || (compareTo = Boolean.valueOf(mo26150h()).compareTo(Boolean.valueOf(mVErrorMessage.mo26150h()))) != 0 || ((mo26150h() && (compareTo = this.technicalInformation.compareTo(mVErrorMessage.technicalInformation)) != 0) || (compareTo = Boolean.valueOf(mo26149g()).compareTo(Boolean.valueOf(mVErrorMessage.mo26149g()))) != 0))))) {
            return compareTo;
        }
        if (!mo26149g() || (i = C25082a.m62845i(this.properties, mVErrorMessage.properties)) == 0) {
            return 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVErrorMessage)) {
            return false;
        }
        MVErrorMessage mVErrorMessage = (MVErrorMessage) obj;
        boolean j = mo26153j();
        boolean j2 = mVErrorMessage.mo26153j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVErrorMessage.title))) {
            return false;
        }
        boolean i = mo26152i();
        boolean i2 = mVErrorMessage.mo26152i();
        if (((i || i2) && (!i || !i2 || !this.text.equals(mVErrorMessage.text))) || this.code != mVErrorMessage.code) {
            return false;
        }
        boolean h = mo26150h();
        boolean h2 = mVErrorMessage.mo26150h();
        if ((h || h2) && (!h || !h2 || !this.technicalInformation.equals(mVErrorMessage.technicalInformation))) {
            return false;
        }
        boolean g = mo26149g();
        boolean g2 = mVErrorMessage.mo26149g();
        if ((g || g2) && (!g || !g2 || !this.properties.equals(mVErrorMessage.properties))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26148f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26149g() {
        return this.properties != null;
    }

    /* renamed from: h */
    public final boolean mo26150h() {
        return this.technicalInformation != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26152i() {
        return this.text != null;
    }

    /* renamed from: j */
    public final boolean mo26153j() {
        return this.title != null;
    }

    /* renamed from: k */
    public final void mo26154k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVErrorMessage(", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("text:");
        String str2 = this.text;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("code:");
        n.append(this.code);
        if (mo26150h()) {
            n.append(", ");
            n.append("technicalInformation:");
            String str3 = this.technicalInformation;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo26149g()) {
            n.append(", ");
            n.append("properties:");
            Map<String, String> map = this.properties;
            if (map == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(map);
            }
        }
        n.append(")");
        return n.toString();
    }
}
