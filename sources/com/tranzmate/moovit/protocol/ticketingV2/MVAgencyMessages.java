package com.tranzmate.moovit.protocol.ticketingV2;

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
import p358af.C13437d;
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

public class MVAgencyMessages implements TBase<MVAgencyMessages, _Fields>, Serializable, Cloneable, Comparable<MVAgencyMessages> {

    /* renamed from: b */
    public static final C25113c f28682b = new C25113c("agencyKey", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28683c = new C25113c("messages", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f28684d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28685e;
    public String agencyKey;
    public List<MVAgencyMessage> messages;

    public enum _Fields implements C25085c {
        AGENCY_KEY(1, "agencyKey"),
        MESSAGES(2, "messages");
        
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
                return AGENCY_KEY;
            }
            if (i != 2) {
                return null;
            }
            return MESSAGES;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessages$a */
    public static class C10781a extends C25239c<MVAgencyMessages> {
        public C10781a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAgencyMessages mVAgencyMessages = (MVAgencyMessages) tBase;
            mVAgencyMessages.getClass();
            C25113c cVar = MVAgencyMessages.f28682b;
            gVar.mo61687K();
            if (mVAgencyMessages.agencyKey != null) {
                gVar.mo61711x(MVAgencyMessages.f28682b);
                gVar.mo61686J(mVAgencyMessages.agencyKey);
                gVar.mo61712y();
            }
            if (mVAgencyMessages.messages != null) {
                gVar.mo61711x(MVAgencyMessages.f28683c);
                gVar.mo61680D(new C25119e((byte) 12, mVAgencyMessages.messages.size()));
                for (MVAgencyMessage X0 : mVAgencyMessages.messages) {
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
            MVAgencyMessages mVAgencyMessages = (MVAgencyMessages) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAgencyMessages.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVAgencyMessages.messages = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVAgencyMessage mVAgencyMessage = new MVAgencyMessage();
                            mVAgencyMessage.mo25201C1(gVar);
                            mVAgencyMessages.messages.add(mVAgencyMessage);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAgencyMessages.agencyKey = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessages$b */
    public static class C10782b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10781a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessages$c */
    public static class C10783c extends C25240d<MVAgencyMessages> {
        public C10783c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAgencyMessages mVAgencyMessages = (MVAgencyMessages) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAgencyMessages.mo32341f()) {
                bitSet.set(0);
            }
            if (mVAgencyMessages.mo32342g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVAgencyMessages.mo32341f()) {
                jVar.mo61686J(mVAgencyMessages.agencyKey);
            }
            if (mVAgencyMessages.mo32342g()) {
                jVar.mo61678B(mVAgencyMessages.messages.size());
                for (MVAgencyMessage X0 : mVAgencyMessages.messages) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAgencyMessages mVAgencyMessages = (MVAgencyMessages) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVAgencyMessages.agencyKey = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVAgencyMessages.messages = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAgencyMessage mVAgencyMessage = new MVAgencyMessage();
                    mVAgencyMessage.mo25201C1(jVar);
                    mVAgencyMessages.messages.add(mVAgencyMessage);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessages$d */
    public static class C10784d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10783c(0);
        }
    }

    static {
        new C17394d0("MVAgencyMessages");
        HashMap hashMap = new HashMap();
        f28684d = hashMap;
        hashMap.put(C25239c.class, new C10782b());
        hashMap.put(C25240d.class, new C10784d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MESSAGES, new FieldMetaData("messages", (byte) 3, new ListMetaData(new StructMetaData(MVAgencyMessage.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28685e = unmodifiableMap;
        FieldMetaData.m61947a(MVAgencyMessages.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f28684d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28684d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVAgencyMessages mVAgencyMessages = (MVAgencyMessages) obj;
        if (!getClass().equals(mVAgencyMessages.getClass())) {
            return getClass().getName().compareTo(mVAgencyMessages.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32341f()).compareTo(Boolean.valueOf(mVAgencyMessages.mo32341f()));
        if (compareTo != 0 || ((mo32341f() && (compareTo = this.agencyKey.compareTo(mVAgencyMessages.agencyKey)) != 0) || (compareTo = Boolean.valueOf(mo32342g()).compareTo(Boolean.valueOf(mVAgencyMessages.mo32342g()))) != 0)) {
            return compareTo;
        }
        if (!mo32342g() || (h = C25082a.m62844h(this.messages, mVAgencyMessages.messages)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAgencyMessages)) {
            return false;
        }
        MVAgencyMessages mVAgencyMessages = (MVAgencyMessages) obj;
        boolean f = mo32341f();
        boolean f2 = mVAgencyMessages.mo32341f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVAgencyMessages.agencyKey))) {
            return false;
        }
        boolean g = mo32342g();
        boolean g2 = mVAgencyMessages.mo32342g();
        if ((g || g2) && (!g || !g2 || !this.messages.equals(mVAgencyMessages.messages))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32341f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32342g() {
        return this.messages != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAgencyMessages(", "agencyKey:");
        String str = this.agencyKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("messages:");
        List<MVAgencyMessage> list = this.messages;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
