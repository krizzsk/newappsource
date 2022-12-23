package com.tranzmate.moovit.protocol.payments;

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

public class MVQuestionButton implements TBase<MVQuestionButton, _Fields>, Serializable, Cloneable, Comparable<MVQuestionButton> {

    /* renamed from: b */
    public static final C25113c f27666b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27667c = new C25113c(MessageButton.TEXT, (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27668d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27669e;

    /* renamed from: id */
    public String f27670id;
    public String text;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        TEXT(2, MessageButton.TEXT);
        
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
                return ID;
            }
            if (i != 2) {
                return null;
            }
            return TEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVQuestionButton$a */
    public static class C10041a extends C25239c<MVQuestionButton> {
        public C10041a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVQuestionButton mVQuestionButton = (MVQuestionButton) tBase;
            mVQuestionButton.getClass();
            C25113c cVar = MVQuestionButton.f27666b;
            gVar.mo61687K();
            if (mVQuestionButton.f27670id != null) {
                gVar.mo61711x(MVQuestionButton.f27666b);
                gVar.mo61686J(mVQuestionButton.f27670id);
                gVar.mo61712y();
            }
            if (mVQuestionButton.text != null) {
                gVar.mo61711x(MVQuestionButton.f27667c);
                gVar.mo61686J(mVQuestionButton.text);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVQuestionButton mVQuestionButton = (MVQuestionButton) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVQuestionButton.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVQuestionButton.text = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVQuestionButton.f27670id = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVQuestionButton$b */
    public static class C10042b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10041a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVQuestionButton$c */
    public static class C10043c extends C25240d<MVQuestionButton> {
        public C10043c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVQuestionButton mVQuestionButton = (MVQuestionButton) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVQuestionButton.mo30538f()) {
                bitSet.set(0);
            }
            if (mVQuestionButton.mo30539g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVQuestionButton.mo30538f()) {
                jVar.mo61686J(mVQuestionButton.f27670id);
            }
            if (mVQuestionButton.mo30539g()) {
                jVar.mo61686J(mVQuestionButton.text);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVQuestionButton mVQuestionButton = (MVQuestionButton) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVQuestionButton.f27670id = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVQuestionButton.text = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVQuestionButton$d */
    public static class C10044d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10043c(0);
        }
    }

    static {
        new C17394d0("MVQuestionButton");
        HashMap hashMap = new HashMap();
        f27668d = hashMap;
        hashMap.put(C25239c.class, new C10042b());
        hashMap.put(C25240d.class, new C10044d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27669e = unmodifiableMap;
        FieldMetaData.m61947a(MVQuestionButton.class, unmodifiableMap);
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
        ((C25238b) f27668d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27668d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30535a(MVQuestionButton mVQuestionButton) {
        if (mVQuestionButton == null) {
            return false;
        }
        boolean f = mo30538f();
        boolean f2 = mVQuestionButton.mo30538f();
        if ((f || f2) && (!f || !f2 || !this.f27670id.equals(mVQuestionButton.f27670id))) {
            return false;
        }
        boolean g = mo30539g();
        boolean g2 = mVQuestionButton.mo30539g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.text.equals(mVQuestionButton.text)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVQuestionButton mVQuestionButton = (MVQuestionButton) obj;
        if (!getClass().equals(mVQuestionButton.getClass())) {
            return getClass().getName().compareTo(mVQuestionButton.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30538f()).compareTo(Boolean.valueOf(mVQuestionButton.mo30538f()));
        if (compareTo2 != 0 || ((mo30538f() && (compareTo2 = this.f27670id.compareTo(mVQuestionButton.f27670id)) != 0) || (compareTo2 = Boolean.valueOf(mo30539g()).compareTo(Boolean.valueOf(mVQuestionButton.mo30539g()))) != 0)) {
            return compareTo2;
        }
        if (!mo30539g() || (compareTo = this.text.compareTo(mVQuestionButton.text)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVQuestionButton)) {
            return mo30535a((MVQuestionButton) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30538f() {
        return this.f27670id != null;
    }

    /* renamed from: g */
    public final boolean mo30539g() {
        return this.text != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVQuestionButton(", "id:");
        String str = this.f27670id;
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
        n.append(")");
        return n.toString();
    }
}
