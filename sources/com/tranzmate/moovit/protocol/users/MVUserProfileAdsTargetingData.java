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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVUserProfileAdsTargetingData implements TBase<MVUserProfileAdsTargetingData, _Fields>, Serializable, Cloneable, Comparable<MVUserProfileAdsTargetingData> {

    /* renamed from: b */
    public static final C25113c f30624b = new C25113c("userTags", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f30625c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f30626d;
    private _Fields[] optionals = {_Fields.USER_TAGS};
    public List<MVUserTag> userTags;

    public enum _Fields implements C25085c {
        USER_TAGS(1, "userTags");
        
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
            if (i != 1) {
                return null;
            }
            return USER_TAGS;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileAdsTargetingData$a */
    public static class C11977a extends C25239c<MVUserProfileAdsTargetingData> {
        public C11977a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileAdsTargetingData mVUserProfileAdsTargetingData = (MVUserProfileAdsTargetingData) tBase;
            mVUserProfileAdsTargetingData.getClass();
            C25113c cVar = MVUserProfileAdsTargetingData.f30624b;
            gVar.mo61687K();
            if (mVUserProfileAdsTargetingData.userTags != null && mVUserProfileAdsTargetingData.mo35509f()) {
                gVar.mo61711x(MVUserProfileAdsTargetingData.f30624b);
                gVar.mo61680D(new C25119e((byte) 12, mVUserProfileAdsTargetingData.userTags.size()));
                for (MVUserTag X0 : mVUserProfileAdsTargetingData.userTags) {
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
            MVUserProfileAdsTargetingData mVUserProfileAdsTargetingData = (MVUserProfileAdsTargetingData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserProfileAdsTargetingData.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVUserProfileAdsTargetingData.userTags = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVUserTag mVUserTag = new MVUserTag();
                        mVUserTag.mo25201C1(gVar);
                        mVUserProfileAdsTargetingData.userTags.add(mVUserTag);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileAdsTargetingData$b */
    public static class C11978b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11977a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileAdsTargetingData$c */
    public static class C11979c extends C25240d<MVUserProfileAdsTargetingData> {
        public C11979c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileAdsTargetingData mVUserProfileAdsTargetingData = (MVUserProfileAdsTargetingData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserProfileAdsTargetingData.mo35509f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVUserProfileAdsTargetingData.mo35509f()) {
                jVar.mo61678B(mVUserProfileAdsTargetingData.userTags.size());
                for (MVUserTag X0 : mVUserProfileAdsTargetingData.userTags) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileAdsTargetingData mVUserProfileAdsTargetingData = (MVUserProfileAdsTargetingData) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVUserProfileAdsTargetingData.userTags = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVUserTag mVUserTag = new MVUserTag();
                    mVUserTag.mo25201C1(jVar);
                    mVUserProfileAdsTargetingData.userTags.add(mVUserTag);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileAdsTargetingData$d */
    public static class C11980d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11979c(0);
        }
    }

    static {
        new C17394d0("MVUserProfileAdsTargetingData");
        HashMap hashMap = new HashMap();
        f30625c = hashMap;
        hashMap.put(C25239c.class, new C11978b());
        hashMap.put(C25240d.class, new C11980d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.USER_TAGS, new FieldMetaData("userTags", (byte) 2, new ListMetaData(new StructMetaData(MVUserTag.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30626d = unmodifiableMap;
        FieldMetaData.m61947a(MVUserProfileAdsTargetingData.class, unmodifiableMap);
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
        ((C25238b) f30625c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30625c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35506a(MVUserProfileAdsTargetingData mVUserProfileAdsTargetingData) {
        if (mVUserProfileAdsTargetingData == null) {
            return false;
        }
        boolean f = mo35509f();
        boolean f2 = mVUserProfileAdsTargetingData.mo35509f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.userTags.equals(mVUserProfileAdsTargetingData.userTags)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVUserProfileAdsTargetingData mVUserProfileAdsTargetingData = (MVUserProfileAdsTargetingData) obj;
        if (!getClass().equals(mVUserProfileAdsTargetingData.getClass())) {
            return getClass().getName().compareTo(mVUserProfileAdsTargetingData.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35509f()).compareTo(Boolean.valueOf(mVUserProfileAdsTargetingData.mo35509f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo35509f() || (h = C25082a.m62844h(this.userTags, mVUserProfileAdsTargetingData.userTags)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVUserProfileAdsTargetingData)) {
            return mo35506a((MVUserProfileAdsTargetingData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35509f() {
        return this.userTags != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVUserProfileAdsTargetingData(");
        if (mo35509f()) {
            sb.append("userTags:");
            List<MVUserTag> list = this.userTags;
            if (list == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
