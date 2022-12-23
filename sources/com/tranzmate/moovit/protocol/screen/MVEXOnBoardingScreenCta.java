package com.tranzmate.moovit.protocol.screen;

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

public class MVEXOnBoardingScreenCta implements TBase<MVEXOnBoardingScreenCta, _Fields>, Serializable, Cloneable, Comparable<MVEXOnBoardingScreenCta> {

    /* renamed from: b */
    public static final C25113c f28145b = new C25113c(Events.PROPERTY_ACTION, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28146c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28147d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28148e;
    public String action;
    private _Fields[] optionals = {_Fields.ACTION};
    public String title;

    public enum _Fields implements C25085c {
        ACTION(1, Events.PROPERTY_ACTION),
        TITLE(2, "title");
        
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
                return ACTION;
            }
            if (i != 2) {
                return null;
            }
            return TITLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.screen.MVEXOnBoardingScreenCta$a */
    public static class C10403a extends C25239c<MVEXOnBoardingScreenCta> {
        public C10403a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta = (MVEXOnBoardingScreenCta) tBase;
            mVEXOnBoardingScreenCta.getClass();
            C25113c cVar = MVEXOnBoardingScreenCta.f28145b;
            gVar.mo61687K();
            if (mVEXOnBoardingScreenCta.action != null && mVEXOnBoardingScreenCta.mo31419f()) {
                gVar.mo61711x(MVEXOnBoardingScreenCta.f28145b);
                gVar.mo61686J(mVEXOnBoardingScreenCta.action);
                gVar.mo61712y();
            }
            if (mVEXOnBoardingScreenCta.title != null) {
                gVar.mo61711x(MVEXOnBoardingScreenCta.f28146c);
                gVar.mo61686J(mVEXOnBoardingScreenCta.title);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta = (MVEXOnBoardingScreenCta) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVEXOnBoardingScreenCta.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVEXOnBoardingScreenCta.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVEXOnBoardingScreenCta.action = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.screen.MVEXOnBoardingScreenCta$b */
    public static class C10404b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10403a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.screen.MVEXOnBoardingScreenCta$c */
    public static class C10405c extends C25240d<MVEXOnBoardingScreenCta> {
        public C10405c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta = (MVEXOnBoardingScreenCta) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEXOnBoardingScreenCta.mo31419f()) {
                bitSet.set(0);
            }
            if (mVEXOnBoardingScreenCta.mo31420g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVEXOnBoardingScreenCta.mo31419f()) {
                jVar.mo61686J(mVEXOnBoardingScreenCta.action);
            }
            if (mVEXOnBoardingScreenCta.mo31420g()) {
                jVar.mo61686J(mVEXOnBoardingScreenCta.title);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta = (MVEXOnBoardingScreenCta) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVEXOnBoardingScreenCta.action = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVEXOnBoardingScreenCta.title = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.screen.MVEXOnBoardingScreenCta$d */
    public static class C10406d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10405c(0);
        }
    }

    static {
        new C17394d0("MVEXOnBoardingScreenCta");
        HashMap hashMap = new HashMap();
        f28147d = hashMap;
        hashMap.put(C25239c.class, new C10404b());
        hashMap.put(C25240d.class, new C10406d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACTION, new FieldMetaData(Events.PROPERTY_ACTION, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28148e = unmodifiableMap;
        FieldMetaData.m61947a(MVEXOnBoardingScreenCta.class, unmodifiableMap);
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
        ((C25238b) f28147d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28147d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31416a(MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta) {
        if (mVEXOnBoardingScreenCta == null) {
            return false;
        }
        boolean f = mo31419f();
        boolean f2 = mVEXOnBoardingScreenCta.mo31419f();
        if ((f || f2) && (!f || !f2 || !this.action.equals(mVEXOnBoardingScreenCta.action))) {
            return false;
        }
        boolean g = mo31420g();
        boolean g2 = mVEXOnBoardingScreenCta.mo31420g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.title.equals(mVEXOnBoardingScreenCta.title)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta = (MVEXOnBoardingScreenCta) obj;
        if (!getClass().equals(mVEXOnBoardingScreenCta.getClass())) {
            return getClass().getName().compareTo(mVEXOnBoardingScreenCta.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31419f()).compareTo(Boolean.valueOf(mVEXOnBoardingScreenCta.mo31419f()));
        if (compareTo2 != 0 || ((mo31419f() && (compareTo2 = this.action.compareTo(mVEXOnBoardingScreenCta.action)) != 0) || (compareTo2 = Boolean.valueOf(mo31420g()).compareTo(Boolean.valueOf(mVEXOnBoardingScreenCta.mo31420g()))) != 0)) {
            return compareTo2;
        }
        if (!mo31420g() || (compareTo = this.title.compareTo(mVEXOnBoardingScreenCta.title)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVEXOnBoardingScreenCta)) {
            return mo31416a((MVEXOnBoardingScreenCta) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31419f() {
        return this.action != null;
    }

    /* renamed from: g */
    public final boolean mo31420g() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVEXOnBoardingScreenCta(");
        if (mo31419f()) {
            sb.append("action:");
            String str = this.action;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }
}
