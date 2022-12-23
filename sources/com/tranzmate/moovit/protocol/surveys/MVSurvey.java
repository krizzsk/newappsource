package com.tranzmate.moovit.protocol.surveys;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TException;
import org.apache.thrift.TUnion;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TProtocolException;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import xi0.C25276a;

public class MVSurvey extends TUnion<MVSurvey, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f28433c = new C17394d0("MVSurvey");

    /* renamed from: d */
    public static final C25113c f28434d = new C25113c("localStopSurvey", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f28435e = new C25113c("localLineGroupSurvey", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f28436f = new C25113c("localSuggestedRoutesSurvey", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f28437g = new C25113c("remoteSurvey", (byte) 12, 4);

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28438h;

    public enum _Fields implements C25085c {
        LOCAL_STOP_SURVEY(1, "localStopSurvey"),
        LOCAL_LINE_GROUP_SURVEY(2, "localLineGroupSurvey"),
        LOCAL_SUGGESTED_ROUTES_SURVEY(3, "localSuggestedRoutesSurvey"),
        REMOTE_SURVEY(4, "remoteSurvey");
        
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
                return LOCAL_STOP_SURVEY;
            }
            if (i == 2) {
                return LOCAL_LINE_GROUP_SURVEY;
            }
            if (i == 3) {
                return LOCAL_SUGGESTED_ROUTES_SURVEY;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE_SURVEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurvey$a */
    public static /* synthetic */ class C10625a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28439a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tranzmate.moovit.protocol.surveys.MVSurvey$_Fields[] r0 = com.tranzmate.moovit.protocol.surveys.MVSurvey._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28439a = r0
                com.tranzmate.moovit.protocol.surveys.MVSurvey$_Fields r1 = com.tranzmate.moovit.protocol.surveys.MVSurvey._Fields.LOCAL_STOP_SURVEY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28439a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.surveys.MVSurvey$_Fields r1 = com.tranzmate.moovit.protocol.surveys.MVSurvey._Fields.LOCAL_LINE_GROUP_SURVEY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28439a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.surveys.MVSurvey$_Fields r1 = com.tranzmate.moovit.protocol.surveys.MVSurvey._Fields.LOCAL_SUGGESTED_ROUTES_SURVEY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28439a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.surveys.MVSurvey$_Fields r1 = com.tranzmate.moovit.protocol.surveys.MVSurvey._Fields.REMOTE_SURVEY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.surveys.MVSurvey.C10625a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCAL_STOP_SURVEY, new FieldMetaData("localStopSurvey", (byte) 3, new StructMetaData(MVLocalStopSurvey.class)));
        enumMap.put(_Fields.LOCAL_LINE_GROUP_SURVEY, new FieldMetaData("localLineGroupSurvey", (byte) 3, new StructMetaData(MVLocalLineGroupSurvey.class)));
        enumMap.put(_Fields.LOCAL_SUGGESTED_ROUTES_SURVEY, new FieldMetaData("localSuggestedRoutesSurvey", (byte) 3, new StructMetaData(MVLocalSuggestedRoutesSurvey.class)));
        enumMap.put(_Fields.REMOTE_SURVEY, new FieldMetaData("remoteSurvey", (byte) 3, new StructMetaData(MVQuestionnaire.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28438h = unmodifiableMap;
        FieldMetaData.m61947a(MVSurvey.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static C25113c m27026k(_Fields _fields) {
        int i = C10625a.f28439a[_fields.ordinal()];
        if (i == 1) {
            return f28434d;
        }
        if (i == 2) {
            return f28435e;
        }
        if (i == 3) {
            return f28436f;
        }
        if (i == 4) {
            return f28437g;
        }
        throw new IllegalArgumentException("Unknown field id " + _fields);
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

    /* renamed from: a */
    public final C25085c mo25504a(short s) {
        return _Fields.findByThriftIdOrThrow(s);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C25113c mo25505b(C25085c cVar) {
        return m27026k((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVSurvey mVSurvey = (MVSurvey) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVSurvey.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVSurvey.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVSurvey mVSurvey;
        if (!(obj instanceof MVSurvey) || (mVSurvey = (MVSurvey) obj) == null || this.setField_ != mVSurvey.setField_ || !this.value_.equals(mVSurvey.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f28433c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C10625a.f28439a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVLocalStopSurvey mVLocalStopSurvey = new MVLocalStopSurvey();
                    mVLocalStopSurvey.mo25201C1(gVar);
                    return mVLocalStopSurvey;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVLocalLineGroupSurvey mVLocalLineGroupSurvey = new MVLocalLineGroupSurvey();
                    mVLocalLineGroupSurvey.mo25201C1(gVar);
                    return mVLocalLineGroupSurvey;
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVLocalSuggestedRoutesSurvey mVLocalSuggestedRoutesSurvey = new MVLocalSuggestedRoutesSurvey();
                    mVLocalSuggestedRoutesSurvey.mo25201C1(gVar);
                    return mVLocalSuggestedRoutesSurvey;
                }
                C25122h.m63098a(gVar, b3);
                return null;
            } else if (i == 4) {
                byte b4 = cVar.f63356b;
                if (b4 == 12) {
                    MVQuestionnaire mVQuestionnaire = new MVQuestionnaire();
                    mVQuestionnaire.mo25201C1(gVar);
                    return mVQuestionnaire;
                }
                C25122h.m63098a(gVar, b4);
                return null;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            C25122h.m63098a(gVar, cVar.f63356b);
            return null;
        }
    }

    /* renamed from: h */
    public final void mo25510h(C25121g gVar) throws TException {
        int i = C10625a.f28439a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVLocalStopSurvey) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVLocalLineGroupSurvey) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVLocalSuggestedRoutesSurvey) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVQuestionnaire) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final Object mo25512i(C25121g gVar, short s) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(s);
        if (findByThriftId != null) {
            int i = C10625a.f28439a[findByThriftId.ordinal()];
            if (i == 1) {
                MVLocalStopSurvey mVLocalStopSurvey = new MVLocalStopSurvey();
                mVLocalStopSurvey.mo25201C1(gVar);
                return mVLocalStopSurvey;
            } else if (i == 2) {
                MVLocalLineGroupSurvey mVLocalLineGroupSurvey = new MVLocalLineGroupSurvey();
                mVLocalLineGroupSurvey.mo25201C1(gVar);
                return mVLocalLineGroupSurvey;
            } else if (i == 3) {
                MVLocalSuggestedRoutesSurvey mVLocalSuggestedRoutesSurvey = new MVLocalSuggestedRoutesSurvey();
                mVLocalSuggestedRoutesSurvey.mo25201C1(gVar);
                return mVLocalSuggestedRoutesSurvey;
            } else if (i == 4) {
                MVQuestionnaire mVQuestionnaire = new MVQuestionnaire();
                mVQuestionnaire.mo25201C1(gVar);
                return mVQuestionnaire;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C10625a.f28439a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVLocalStopSurvey) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVLocalLineGroupSurvey) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVLocalSuggestedRoutesSurvey) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVQuestionnaire) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: l */
    public final MVLocalLineGroupSurvey mo31933l() {
        if (this.setField_ == _Fields.LOCAL_LINE_GROUP_SURVEY) {
            return (MVLocalLineGroupSurvey) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'localLineGroupSurvey' because union is currently set to ");
        k.append(m27026k((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: m */
    public final MVLocalStopSurvey mo31934m() {
        if (this.setField_ == _Fields.LOCAL_STOP_SURVEY) {
            return (MVLocalStopSurvey) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'localStopSurvey' because union is currently set to ");
        k.append(m27026k((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: n */
    public final MVLocalSuggestedRoutesSurvey mo31935n() {
        if (this.setField_ == _Fields.LOCAL_SUGGESTED_ROUTES_SURVEY) {
            return (MVLocalSuggestedRoutesSurvey) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'localSuggestedRoutesSurvey' because union is currently set to ");
        k.append(m27026k((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }
}
