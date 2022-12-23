package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
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

public class MVNotificationPayload implements TBase<MVNotificationPayload, _Fields>, Serializable, Cloneable, Comparable<MVNotificationPayload> {

    /* renamed from: b */
    public static final C25113c f30481b = new C25113c("pushId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30482c = new C25113c("type", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30483d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30484e = new C25113c("androidText", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30485f = new C25113c("iphoneText", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f30486g = new C25113c("attributes", (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f30487h = new C25113c("fromTime", (byte) 10, 7);

    /* renamed from: i */
    public static final C25113c f30488i = new C25113c("toTime", (byte) 10, 8);

    /* renamed from: j */
    public static final HashMap f30489j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f30490k;
    private byte __isset_bitfield = 0;
    public String androidText;
    public List<MVPushAttribute> attributes;
    public long fromTime;
    public String iphoneText;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.ANDROID_TEXT, _Fields.IPHONE_TEXT};
    public int pushId;
    public String title;
    public long toTime;
    public String type;

    public enum _Fields implements C25085c {
        PUSH_ID(1, "pushId"),
        TYPE(2, "type"),
        TITLE(3, "title"),
        ANDROID_TEXT(4, "androidText"),
        IPHONE_TEXT(5, "iphoneText"),
        ATTRIBUTES(6, "attributes"),
        FROM_TIME(7, "fromTime"),
        TO_TIME(8, "toTime");
        
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
            switch (i) {
                case 1:
                    return PUSH_ID;
                case 2:
                    return TYPE;
                case 3:
                    return TITLE;
                case 4:
                    return ANDROID_TEXT;
                case 5:
                    return IPHONE_TEXT;
                case 6:
                    return ATTRIBUTES;
                case 7:
                    return FROM_TIME;
                case 8:
                    return TO_TIME;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVNotificationPayload$a */
    public static class C11861a extends C25239c<MVNotificationPayload> {
        public C11861a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNotificationPayload mVNotificationPayload = (MVNotificationPayload) tBase;
            mVNotificationPayload.getClass();
            C25113c cVar = MVNotificationPayload.f30481b;
            gVar.mo61687K();
            gVar.mo61711x(MVNotificationPayload.f30481b);
            gVar.mo61678B(mVNotificationPayload.pushId);
            gVar.mo61712y();
            if (mVNotificationPayload.type != null) {
                gVar.mo61711x(MVNotificationPayload.f30482c);
                gVar.mo61686J(mVNotificationPayload.type);
                gVar.mo61712y();
            }
            if (mVNotificationPayload.title != null && mVNotificationPayload.mo35250k()) {
                gVar.mo61711x(MVNotificationPayload.f30483d);
                gVar.mo61686J(mVNotificationPayload.title);
                gVar.mo61712y();
            }
            if (mVNotificationPayload.androidText != null && mVNotificationPayload.mo35244f()) {
                gVar.mo61711x(MVNotificationPayload.f30484e);
                gVar.mo61686J(mVNotificationPayload.androidText);
                gVar.mo61712y();
            }
            if (mVNotificationPayload.iphoneText != null && mVNotificationPayload.mo35248i()) {
                gVar.mo61711x(MVNotificationPayload.f30485f);
                gVar.mo61686J(mVNotificationPayload.iphoneText);
                gVar.mo61712y();
            }
            if (mVNotificationPayload.attributes != null) {
                gVar.mo61711x(MVNotificationPayload.f30486g);
                gVar.mo61680D(new C25119e((byte) 12, mVNotificationPayload.attributes.size()));
                for (MVPushAttribute X0 : mVNotificationPayload.attributes) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVNotificationPayload.f30487h);
            gVar.mo61679C(mVNotificationPayload.fromTime);
            gVar.mo61712y();
            gVar.mo61711x(MVNotificationPayload.f30488i);
            C25541a.m63891v(gVar, mVNotificationPayload.toTime);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNotificationPayload mVNotificationPayload = (MVNotificationPayload) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVNotificationPayload.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNotificationPayload.pushId = gVar.mo61696i();
                            mVNotificationPayload.mo35254p();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNotificationPayload.type = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNotificationPayload.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNotificationPayload.androidText = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNotificationPayload.iphoneText = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVNotificationPayload.attributes = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVPushAttribute mVPushAttribute = new MVPushAttribute();
                                mVPushAttribute.mo25201C1(gVar);
                                mVNotificationPayload.attributes.add(mVPushAttribute);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 7:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNotificationPayload.fromTime = gVar.mo61697j();
                            mVNotificationPayload.mo35253o();
                            break;
                        }
                    case 8:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNotificationPayload.toTime = gVar.mo61697j();
                            mVNotificationPayload.mo35255q();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVNotificationPayload$b */
    public static class C11862b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11861a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVNotificationPayload$c */
    public static class C11863c extends C25240d<MVNotificationPayload> {
        public C11863c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNotificationPayload mVNotificationPayload = (MVNotificationPayload) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVNotificationPayload.mo35249j()) {
                bitSet.set(0);
            }
            if (mVNotificationPayload.mo35252m()) {
                bitSet.set(1);
            }
            if (mVNotificationPayload.mo35250k()) {
                bitSet.set(2);
            }
            if (mVNotificationPayload.mo35244f()) {
                bitSet.set(3);
            }
            if (mVNotificationPayload.mo35248i()) {
                bitSet.set(4);
            }
            if (mVNotificationPayload.mo35245g()) {
                bitSet.set(5);
            }
            if (mVNotificationPayload.mo35246h()) {
                bitSet.set(6);
            }
            if (mVNotificationPayload.mo35251l()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVNotificationPayload.mo35249j()) {
                jVar.mo61678B(mVNotificationPayload.pushId);
            }
            if (mVNotificationPayload.mo35252m()) {
                jVar.mo61686J(mVNotificationPayload.type);
            }
            if (mVNotificationPayload.mo35250k()) {
                jVar.mo61686J(mVNotificationPayload.title);
            }
            if (mVNotificationPayload.mo35244f()) {
                jVar.mo61686J(mVNotificationPayload.androidText);
            }
            if (mVNotificationPayload.mo35248i()) {
                jVar.mo61686J(mVNotificationPayload.iphoneText);
            }
            if (mVNotificationPayload.mo35245g()) {
                jVar.mo61678B(mVNotificationPayload.attributes.size());
                for (MVPushAttribute X0 : mVNotificationPayload.attributes) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVNotificationPayload.mo35246h()) {
                jVar.mo61679C(mVNotificationPayload.fromTime);
            }
            if (mVNotificationPayload.mo35251l()) {
                jVar.mo61679C(mVNotificationPayload.toTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNotificationPayload mVNotificationPayload = (MVNotificationPayload) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVNotificationPayload.pushId = jVar.mo61696i();
                mVNotificationPayload.mo35254p();
            }
            if (T.get(1)) {
                mVNotificationPayload.type = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVNotificationPayload.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVNotificationPayload.androidText = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVNotificationPayload.iphoneText = jVar.mo61704q();
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVNotificationPayload.attributes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPushAttribute mVPushAttribute = new MVPushAttribute();
                    mVPushAttribute.mo25201C1(jVar);
                    mVNotificationPayload.attributes.add(mVPushAttribute);
                }
            }
            if (T.get(6)) {
                mVNotificationPayload.fromTime = jVar.mo61697j();
                mVNotificationPayload.mo35253o();
            }
            if (T.get(7)) {
                mVNotificationPayload.toTime = jVar.mo61697j();
                mVNotificationPayload.mo35255q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVNotificationPayload$d */
    public static class C11864d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11863c(0);
        }
    }

    static {
        new C17394d0("MVNotificationPayload");
        HashMap hashMap = new HashMap();
        f30489j = hashMap;
        hashMap.put(C25239c.class, new C11862b());
        hashMap.put(C25240d.class, new C11864d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PUSH_ID, new FieldMetaData("pushId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANDROID_TEXT, new FieldMetaData("androidText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IPHONE_TEXT, new FieldMetaData("iphoneText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ATTRIBUTES, new FieldMetaData("attributes", (byte) 3, new ListMetaData(new StructMetaData(MVPushAttribute.class))));
        enumMap.put(_Fields.FROM_TIME, new FieldMetaData("fromTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TO_TIME, new FieldMetaData("toTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30490k = unmodifiableMap;
        FieldMetaData.m61947a(MVNotificationPayload.class, unmodifiableMap);
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
        ((C25238b) f30489j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30489j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35241a(MVNotificationPayload mVNotificationPayload) {
        if (mVNotificationPayload == null || this.pushId != mVNotificationPayload.pushId) {
            return false;
        }
        boolean m = mo35252m();
        boolean m2 = mVNotificationPayload.mo35252m();
        if ((m || m2) && (!m || !m2 || !this.type.equals(mVNotificationPayload.type))) {
            return false;
        }
        boolean k = mo35250k();
        boolean k2 = mVNotificationPayload.mo35250k();
        if ((k || k2) && (!k || !k2 || !this.title.equals(mVNotificationPayload.title))) {
            return false;
        }
        boolean f = mo35244f();
        boolean f2 = mVNotificationPayload.mo35244f();
        if ((f || f2) && (!f || !f2 || !this.androidText.equals(mVNotificationPayload.androidText))) {
            return false;
        }
        boolean i = mo35248i();
        boolean i2 = mVNotificationPayload.mo35248i();
        if ((i || i2) && (!i || !i2 || !this.iphoneText.equals(mVNotificationPayload.iphoneText))) {
            return false;
        }
        boolean g = mo35245g();
        boolean g2 = mVNotificationPayload.mo35245g();
        if (((!g && !g2) || (g && g2 && this.attributes.equals(mVNotificationPayload.attributes))) && this.fromTime == mVNotificationPayload.fromTime && this.toTime == mVNotificationPayload.toTime) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int d;
        MVNotificationPayload mVNotificationPayload = (MVNotificationPayload) obj;
        if (!getClass().equals(mVNotificationPayload.getClass())) {
            return getClass().getName().compareTo(mVNotificationPayload.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35249j()).compareTo(Boolean.valueOf(mVNotificationPayload.mo35249j()));
        if (compareTo != 0 || ((mo35249j() && (compareTo = C25082a.m62839c(this.pushId, mVNotificationPayload.pushId)) != 0) || (compareTo = Boolean.valueOf(mo35252m()).compareTo(Boolean.valueOf(mVNotificationPayload.mo35252m()))) != 0 || ((mo35252m() && (compareTo = this.type.compareTo(mVNotificationPayload.type)) != 0) || (compareTo = Boolean.valueOf(mo35250k()).compareTo(Boolean.valueOf(mVNotificationPayload.mo35250k()))) != 0 || ((mo35250k() && (compareTo = this.title.compareTo(mVNotificationPayload.title)) != 0) || (compareTo = Boolean.valueOf(mo35244f()).compareTo(Boolean.valueOf(mVNotificationPayload.mo35244f()))) != 0 || ((mo35244f() && (compareTo = this.androidText.compareTo(mVNotificationPayload.androidText)) != 0) || (compareTo = Boolean.valueOf(mo35248i()).compareTo(Boolean.valueOf(mVNotificationPayload.mo35248i()))) != 0 || ((mo35248i() && (compareTo = this.iphoneText.compareTo(mVNotificationPayload.iphoneText)) != 0) || (compareTo = Boolean.valueOf(mo35245g()).compareTo(Boolean.valueOf(mVNotificationPayload.mo35245g()))) != 0 || ((mo35245g() && (compareTo = C25082a.m62844h(this.attributes, mVNotificationPayload.attributes)) != 0) || (compareTo = Boolean.valueOf(mo35246h()).compareTo(Boolean.valueOf(mVNotificationPayload.mo35246h()))) != 0 || ((mo35246h() && (compareTo = C25082a.m62840d(this.fromTime, mVNotificationPayload.fromTime)) != 0) || (compareTo = Boolean.valueOf(mo35251l()).compareTo(Boolean.valueOf(mVNotificationPayload.mo35251l()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo35251l() || (d = C25082a.m62840d(this.toTime, mVNotificationPayload.toTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVNotificationPayload)) {
            return mo35241a((MVNotificationPayload) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35244f() {
        return this.androidText != null;
    }

    /* renamed from: g */
    public final boolean mo35245g() {
        return this.attributes != null;
    }

    /* renamed from: h */
    public final boolean mo35246h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35248i() {
        return this.iphoneText != null;
    }

    /* renamed from: j */
    public final boolean mo35249j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo35250k() {
        return this.title != null;
    }

    /* renamed from: l */
    public final boolean mo35251l() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: m */
    public final boolean mo35252m() {
        return this.type != null;
    }

    /* renamed from: o */
    public final void mo35253o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo35254p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: q */
    public final void mo35255q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVNotificationPayload(", "pushId:");
        C0016g.m42z(n, this.pushId, ", ", "type:");
        String str = this.type;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo35250k()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo35244f()) {
            n.append(", ");
            n.append("androidText:");
            String str3 = this.androidText;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo35248i()) {
            n.append(", ");
            n.append("iphoneText:");
            String str4 = this.iphoneText;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        n.append(", ");
        n.append("attributes:");
        List<MVPushAttribute> list = this.attributes;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("fromTime:");
        C25541a.m63889t(n, this.fromTime, ", ", "toTime:");
        return C25541a.m63884o(n, this.toTime, ")");
    }
}
