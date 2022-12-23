package com.tranzmate.moovit.protocol.surveys;

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
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVSurveyResponse implements TBase<MVSurveyResponse, _Fields>, Serializable, Cloneable, Comparable<MVSurveyResponse> {

    /* renamed from: b */
    public static final C25113c f28466b = new C25113c("showAtSec", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28467c = new C25113c("survey", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28468d = new C25113c("surveyContext", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f28469e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28470f;
    private byte __isset_bitfield = 0;
    public int showAtSec;
    public MVSurvey survey;
    public String surveyContext;

    public enum _Fields implements C25085c {
        SHOW_AT_SEC(1, "showAtSec"),
        SURVEY(2, "survey"),
        SURVEY_CONTEXT(3, "surveyContext");
        
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
                return SHOW_AT_SEC;
            }
            if (i == 2) {
                return SURVEY;
            }
            if (i != 3) {
                return null;
            }
            return SURVEY_CONTEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyResponse$a */
    public static class C10639a extends C25239c<MVSurveyResponse> {
        public C10639a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyResponse mVSurveyResponse = (MVSurveyResponse) tBase;
            mVSurveyResponse.getClass();
            C25113c cVar = MVSurveyResponse.f28466b;
            gVar.mo61687K();
            gVar.mo61711x(MVSurveyResponse.f28466b);
            gVar.mo61678B(mVSurveyResponse.showAtSec);
            gVar.mo61712y();
            if (mVSurveyResponse.survey != null) {
                gVar.mo61711x(MVSurveyResponse.f28467c);
                mVSurveyResponse.survey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSurveyResponse.surveyContext != null) {
                gVar.mo61711x(MVSurveyResponse.f28468d);
                gVar.mo61686J(mVSurveyResponse.surveyContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyResponse mVSurveyResponse = (MVSurveyResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSurveyResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVSurveyResponse.surveyContext = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVSurvey mVSurvey = new MVSurvey();
                        mVSurveyResponse.survey = mVSurvey;
                        mVSurvey.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSurveyResponse.showAtSec = gVar.mo61696i();
                    mVSurveyResponse.mo31983i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyResponse$b */
    public static class C10640b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10639a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyResponse$c */
    public static class C10641c extends C25240d<MVSurveyResponse> {
        public C10641c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyResponse mVSurveyResponse = (MVSurveyResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSurveyResponse.mo31979f()) {
                bitSet.set(0);
            }
            if (mVSurveyResponse.mo31980g()) {
                bitSet.set(1);
            }
            if (mVSurveyResponse.mo31981h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVSurveyResponse.mo31979f()) {
                jVar.mo61678B(mVSurveyResponse.showAtSec);
            }
            if (mVSurveyResponse.mo31980g()) {
                mVSurveyResponse.survey.mo25202X0(jVar);
            }
            if (mVSurveyResponse.mo31981h()) {
                jVar.mo61686J(mVSurveyResponse.surveyContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyResponse mVSurveyResponse = (MVSurveyResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVSurveyResponse.showAtSec = jVar.mo61696i();
                mVSurveyResponse.mo31983i();
            }
            if (T.get(1)) {
                MVSurvey mVSurvey = new MVSurvey();
                mVSurveyResponse.survey = mVSurvey;
                mVSurvey.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVSurveyResponse.surveyContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyResponse$d */
    public static class C10642d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10641c(0);
        }
    }

    static {
        new C17394d0("MVSurveyResponse");
        HashMap hashMap = new HashMap();
        f28469e = hashMap;
        hashMap.put(C25239c.class, new C10640b());
        hashMap.put(C25240d.class, new C10642d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SHOW_AT_SEC, new FieldMetaData("showAtSec", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SURVEY, new FieldMetaData("survey", (byte) 3, new StructMetaData(MVSurvey.class)));
        enumMap.put(_Fields.SURVEY_CONTEXT, new FieldMetaData("surveyContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28470f = unmodifiableMap;
        FieldMetaData.m61947a(MVSurveyResponse.class, unmodifiableMap);
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
        ((C25238b) f28469e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28469e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSurveyResponse mVSurveyResponse = (MVSurveyResponse) obj;
        if (!getClass().equals(mVSurveyResponse.getClass())) {
            return getClass().getName().compareTo(mVSurveyResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31979f()).compareTo(Boolean.valueOf(mVSurveyResponse.mo31979f()));
        if (compareTo2 != 0 || ((mo31979f() && (compareTo2 = C25082a.m62839c(this.showAtSec, mVSurveyResponse.showAtSec)) != 0) || (compareTo2 = Boolean.valueOf(mo31980g()).compareTo(Boolean.valueOf(mVSurveyResponse.mo31980g()))) != 0 || ((mo31980g() && (compareTo2 = this.survey.compareTo(mVSurveyResponse.survey)) != 0) || (compareTo2 = Boolean.valueOf(mo31981h()).compareTo(Boolean.valueOf(mVSurveyResponse.mo31981h()))) != 0))) {
            return compareTo2;
        }
        if (!mo31981h() || (compareTo = this.surveyContext.compareTo(mVSurveyResponse.surveyContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.tranzmate.moovit.protocol.surveys.MVSurveyResponse
            r2 = 1
            if (r1 == 0) goto L_0x005f
            com.tranzmate.moovit.protocol.surveys.MVSurveyResponse r7 = (com.tranzmate.moovit.protocol.surveys.MVSurveyResponse) r7
            int r1 = r6.showAtSec
            int r3 = r7.showAtSec
            if (r1 == r3) goto L_0x0012
            goto L_0x005f
        L_0x0012:
            boolean r1 = r6.mo31980g()
            boolean r3 = r7.mo31980g()
            if (r1 != 0) goto L_0x001e
            if (r3 == 0) goto L_0x0042
        L_0x001e:
            if (r1 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0023
            goto L_0x005f
        L_0x0023:
            com.tranzmate.moovit.protocol.surveys.MVSurvey r1 = r6.survey
            com.tranzmate.moovit.protocol.surveys.MVSurvey r3 = r7.survey
            if (r3 == 0) goto L_0x003b
            F r4 = r1.setField_
            F r5 = r3.setField_
            if (r4 != r5) goto L_0x003e
            java.lang.Object r1 = r1.value_
            java.lang.Object r3 = r3.value_
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003e
            r1 = 1
            goto L_0x003f
        L_0x003b:
            r1.getClass()
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r1 != 0) goto L_0x0042
            goto L_0x005f
        L_0x0042:
            boolean r1 = r6.mo31981h()
            boolean r3 = r7.mo31981h()
            if (r1 != 0) goto L_0x004e
            if (r3 == 0) goto L_0x005e
        L_0x004e:
            if (r1 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0053
            goto L_0x005f
        L_0x0053:
            java.lang.String r1 = r6.surveyContext
            java.lang.String r7 = r7.surveyContext
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r0 = 1
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.surveys.MVSurveyResponse.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo31979f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31980g() {
        return this.survey != null;
    }

    /* renamed from: h */
    public final boolean mo31981h() {
        return this.surveyContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31983i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSurveyResponse(", "showAtSec:");
        C0016g.m42z(n, this.showAtSec, ", ", "survey:");
        MVSurvey mVSurvey = this.survey;
        if (mVSurvey == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSurvey);
        }
        n.append(", ");
        n.append("surveyContext:");
        String str = this.surveyContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
