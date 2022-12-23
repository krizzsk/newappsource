package com.tranzmate.moovit.protocol.payments;

import com.appboy.models.MessageButton;
import com.appboy.support.StringUtils;
import com.usebutton.sdk.internal.events.Events;
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
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVTOSLink implements TBase<MVTOSLink, _Fields>, Serializable, Cloneable, Comparable<MVTOSLink> {

    /* renamed from: b */
    public static final C25113c f27708b = new C25113c(MessageButton.TEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27709c = new C25113c(Events.PROPERTY_ACTION, (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27710d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27711e;
    public String action;
    public String text;

    public enum _Fields implements C25085c {
        TEXT(1, MessageButton.TEXT),
        ACTION(2, Events.PROPERTY_ACTION);
        
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
            if (i != 2) {
                return null;
            }
            return ACTION;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTOSLink$a */
    public static class C10073a extends C25239c<MVTOSLink> {
        public C10073a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTOSLink mVTOSLink = (MVTOSLink) tBase;
            mVTOSLink.getClass();
            C25113c cVar = MVTOSLink.f27708b;
            gVar.mo61687K();
            if (mVTOSLink.text != null) {
                gVar.mo61711x(MVTOSLink.f27708b);
                gVar.mo61686J(mVTOSLink.text);
                gVar.mo61712y();
            }
            if (mVTOSLink.action != null) {
                gVar.mo61711x(MVTOSLink.f27709c);
                gVar.mo61686J(mVTOSLink.action);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTOSLink mVTOSLink = (MVTOSLink) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTOSLink.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVTOSLink.action = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTOSLink.text = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTOSLink$b */
    public static class C10074b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10073a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTOSLink$c */
    public static class C10075c extends C25240d<MVTOSLink> {
        public C10075c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTOSLink mVTOSLink = (MVTOSLink) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTOSLink.mo30615g()) {
                bitSet.set(0);
            }
            if (mVTOSLink.mo30614f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTOSLink.mo30615g()) {
                jVar.mo61686J(mVTOSLink.text);
            }
            if (mVTOSLink.mo30614f()) {
                jVar.mo61686J(mVTOSLink.action);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTOSLink mVTOSLink = (MVTOSLink) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTOSLink.text = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTOSLink.action = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTOSLink$d */
    public static class C10076d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10075c(0);
        }
    }

    static {
        new C17394d0("MVTOSLink");
        HashMap hashMap = new HashMap();
        f27710d = hashMap;
        hashMap.put(C25239c.class, new C10074b());
        hashMap.put(C25240d.class, new C10076d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION, new FieldMetaData(Events.PROPERTY_ACTION, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27711e = unmodifiableMap;
        FieldMetaData.m61947a(MVTOSLink.class, unmodifiableMap);
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
        ((C25238b) f27710d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27710d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTOSLink mVTOSLink = (MVTOSLink) obj;
        if (!getClass().equals(mVTOSLink.getClass())) {
            return getClass().getName().compareTo(mVTOSLink.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30615g()).compareTo(Boolean.valueOf(mVTOSLink.mo30615g()));
        if (compareTo2 != 0 || ((mo30615g() && (compareTo2 = this.text.compareTo(mVTOSLink.text)) != 0) || (compareTo2 = Boolean.valueOf(mo30614f()).compareTo(Boolean.valueOf(mVTOSLink.mo30614f()))) != 0)) {
            return compareTo2;
        }
        if (!mo30614f() || (compareTo = this.action.compareTo(mVTOSLink.action)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTOSLink)) {
            return false;
        }
        MVTOSLink mVTOSLink = (MVTOSLink) obj;
        boolean g = mo30615g();
        boolean g2 = mVTOSLink.mo30615g();
        if ((g || g2) && (!g || !g2 || !this.text.equals(mVTOSLink.text))) {
            return false;
        }
        boolean f = mo30614f();
        boolean f2 = mVTOSLink.mo30614f();
        if ((f || f2) && (!f || !f2 || !this.action.equals(mVTOSLink.action))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30614f() {
        return this.action != null;
    }

    /* renamed from: g */
    public final boolean mo30615g() {
        return this.text != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTOSLink(", "text:");
        String str = this.text;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("action:");
        String str2 = this.action;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
