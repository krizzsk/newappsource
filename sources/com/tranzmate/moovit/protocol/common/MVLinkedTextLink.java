package com.tranzmate.moovit.protocol.common;

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

public class MVLinkedTextLink implements TBase<MVLinkedTextLink, _Fields>, Serializable, Cloneable, Comparable<MVLinkedTextLink> {

    /* renamed from: b */
    public static final C25113c f25085b = new C25113c(MessageButton.TEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25086c = new C25113c(Events.PROPERTY_ACTION, (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f25087d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25088e;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLinkedTextLink$a */
    public static class C8464a extends C25239c<MVLinkedTextLink> {
        public C8464a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLinkedTextLink mVLinkedTextLink = (MVLinkedTextLink) tBase;
            mVLinkedTextLink.getClass();
            C25113c cVar = MVLinkedTextLink.f25085b;
            gVar.mo61687K();
            if (mVLinkedTextLink.text != null) {
                gVar.mo61711x(MVLinkedTextLink.f25085b);
                gVar.mo61686J(mVLinkedTextLink.text);
                gVar.mo61712y();
            }
            if (mVLinkedTextLink.action != null) {
                gVar.mo61711x(MVLinkedTextLink.f25086c);
                gVar.mo61686J(mVLinkedTextLink.action);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLinkedTextLink mVLinkedTextLink = (MVLinkedTextLink) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLinkedTextLink.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVLinkedTextLink.action = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVLinkedTextLink.text = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLinkedTextLink$b */
    public static class C8465b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8464a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLinkedTextLink$c */
    public static class C8466c extends C25240d<MVLinkedTextLink> {
        public C8466c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLinkedTextLink mVLinkedTextLink = (MVLinkedTextLink) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLinkedTextLink.mo26313g()) {
                bitSet.set(0);
            }
            if (mVLinkedTextLink.mo26312f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVLinkedTextLink.mo26313g()) {
                jVar.mo61686J(mVLinkedTextLink.text);
            }
            if (mVLinkedTextLink.mo26312f()) {
                jVar.mo61686J(mVLinkedTextLink.action);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLinkedTextLink mVLinkedTextLink = (MVLinkedTextLink) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVLinkedTextLink.text = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVLinkedTextLink.action = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLinkedTextLink$d */
    public static class C8467d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8466c(0);
        }
    }

    static {
        new C17394d0("MVLinkedTextLink");
        HashMap hashMap = new HashMap();
        f25087d = hashMap;
        hashMap.put(C25239c.class, new C8465b());
        hashMap.put(C25240d.class, new C8467d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION, new FieldMetaData(Events.PROPERTY_ACTION, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25088e = unmodifiableMap;
        FieldMetaData.m61947a(MVLinkedTextLink.class, unmodifiableMap);
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
        ((C25238b) f25087d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25087d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26309a(MVLinkedTextLink mVLinkedTextLink) {
        if (mVLinkedTextLink == null) {
            return false;
        }
        boolean g = mo26313g();
        boolean g2 = mVLinkedTextLink.mo26313g();
        if ((g || g2) && (!g || !g2 || !this.text.equals(mVLinkedTextLink.text))) {
            return false;
        }
        boolean f = mo26312f();
        boolean f2 = mVLinkedTextLink.mo26312f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.action.equals(mVLinkedTextLink.action)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLinkedTextLink mVLinkedTextLink = (MVLinkedTextLink) obj;
        if (!getClass().equals(mVLinkedTextLink.getClass())) {
            return getClass().getName().compareTo(mVLinkedTextLink.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26313g()).compareTo(Boolean.valueOf(mVLinkedTextLink.mo26313g()));
        if (compareTo2 != 0 || ((mo26313g() && (compareTo2 = this.text.compareTo(mVLinkedTextLink.text)) != 0) || (compareTo2 = Boolean.valueOf(mo26312f()).compareTo(Boolean.valueOf(mVLinkedTextLink.mo26312f()))) != 0)) {
            return compareTo2;
        }
        if (!mo26312f() || (compareTo = this.action.compareTo(mVLinkedTextLink.action)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLinkedTextLink)) {
            return mo26309a((MVLinkedTextLink) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26312f() {
        return this.action != null;
    }

    /* renamed from: g */
    public final boolean mo26313g() {
        return this.text != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLinkedTextLink(", "text:");
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
