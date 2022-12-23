package com.tranzmate.moovit.protocol.gtfs;

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

public class MVMetroLanguagesResponse implements TBase<MVMetroLanguagesResponse, _Fields>, Serializable, Cloneable, Comparable<MVMetroLanguagesResponse> {

    /* renamed from: b */
    public static final C25113c f25766b = new C25113c("languages", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f25767c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f25768d;
    public List<MVMetroLanguage> languages;
    private _Fields[] optionals = {_Fields.LANGUAGES};

    public enum _Fields implements C25085c {
        LANGUAGES(1, "languages");
        
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
            return LANGUAGES;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroLanguagesResponse$a */
    public static class C8807a extends C25239c<MVMetroLanguagesResponse> {
        public C8807a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroLanguagesResponse mVMetroLanguagesResponse = (MVMetroLanguagesResponse) tBase;
            mVMetroLanguagesResponse.getClass();
            C25113c cVar = MVMetroLanguagesResponse.f25766b;
            gVar.mo61687K();
            if (mVMetroLanguagesResponse.languages != null && mVMetroLanguagesResponse.mo27453f()) {
                gVar.mo61711x(MVMetroLanguagesResponse.f25766b);
                gVar.mo61680D(new C25119e((byte) 12, mVMetroLanguagesResponse.languages.size()));
                for (MVMetroLanguage X0 : mVMetroLanguagesResponse.languages) {
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
            MVMetroLanguagesResponse mVMetroLanguagesResponse = (MVMetroLanguagesResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMetroLanguagesResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVMetroLanguagesResponse.languages = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVMetroLanguage mVMetroLanguage = new MVMetroLanguage();
                        mVMetroLanguage.mo25201C1(gVar);
                        mVMetroLanguagesResponse.languages.add(mVMetroLanguage);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroLanguagesResponse$b */
    public static class C8808b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8807a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroLanguagesResponse$c */
    public static class C8809c extends C25240d<MVMetroLanguagesResponse> {
        public C8809c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroLanguagesResponse mVMetroLanguagesResponse = (MVMetroLanguagesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMetroLanguagesResponse.mo27453f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMetroLanguagesResponse.mo27453f()) {
                jVar.mo61678B(mVMetroLanguagesResponse.languages.size());
                for (MVMetroLanguage X0 : mVMetroLanguagesResponse.languages) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroLanguagesResponse mVMetroLanguagesResponse = (MVMetroLanguagesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVMetroLanguagesResponse.languages = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVMetroLanguage mVMetroLanguage = new MVMetroLanguage();
                    mVMetroLanguage.mo25201C1(jVar);
                    mVMetroLanguagesResponse.languages.add(mVMetroLanguage);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroLanguagesResponse$d */
    public static class C8810d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8809c(0);
        }
    }

    static {
        new C17394d0("MVMetroLanguagesResponse");
        HashMap hashMap = new HashMap();
        f25767c = hashMap;
        hashMap.put(C25239c.class, new C8808b());
        hashMap.put(C25240d.class, new C8810d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LANGUAGES, new FieldMetaData("languages", (byte) 2, new ListMetaData(new StructMetaData(MVMetroLanguage.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25768d = unmodifiableMap;
        FieldMetaData.m61947a(MVMetroLanguagesResponse.class, unmodifiableMap);
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
        ((C25238b) f25767c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25767c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVMetroLanguagesResponse mVMetroLanguagesResponse = (MVMetroLanguagesResponse) obj;
        if (!getClass().equals(mVMetroLanguagesResponse.getClass())) {
            return getClass().getName().compareTo(mVMetroLanguagesResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27453f()).compareTo(Boolean.valueOf(mVMetroLanguagesResponse.mo27453f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo27453f() || (h = C25082a.m62844h(this.languages, mVMetroLanguagesResponse.languages)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMetroLanguagesResponse)) {
            return false;
        }
        MVMetroLanguagesResponse mVMetroLanguagesResponse = (MVMetroLanguagesResponse) obj;
        boolean f = mo27453f();
        boolean f2 = mVMetroLanguagesResponse.mo27453f();
        if ((f || f2) && (!f || !f2 || !this.languages.equals(mVMetroLanguagesResponse.languages))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27453f() {
        return this.languages != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVMetroLanguagesResponse(");
        if (mo27453f()) {
            sb.append("languages:");
            List<MVMetroLanguage> list = this.languages;
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
