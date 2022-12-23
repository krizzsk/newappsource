package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVTicketReceipt extends TUnion<MVTicketReceipt, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f29198c = new C17394d0("MVTicketReceipt");

    /* renamed from: d */
    public static final C25113c f29199d = new C25113c("html", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f29200e = new C25113c("media", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f29201f = new C25113c("visualCode", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f29202g = new C25113c("vdv", (byte) 12, 4);

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f29203h;

    public enum _Fields implements C25085c {
        HTML(1, "html"),
        MEDIA(2, "media"),
        VISUAL_CODE(3, "visualCode"),
        VDV(4, "vdv");
        
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
                return HTML;
            }
            if (i == 2) {
                return MEDIA;
            }
            if (i == 3) {
                return VISUAL_CODE;
            }
            if (i != 4) {
                return null;
            }
            return VDV;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$a */
    public static /* synthetic */ class C11088a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29204a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields[] r0 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29204a = r0
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields.HTML     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29204a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields.MEDIA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29204a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields.VISUAL_CODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29204a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields.VDV     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt.C11088a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.HTML, new FieldMetaData("html", (byte) 3, new StructMetaData(MVHtmlTicketReceipt.class)));
        enumMap.put(_Fields.MEDIA, new FieldMetaData("media", (byte) 3, new StructMetaData(MVMediaTicketReceipt.class)));
        enumMap.put(_Fields.VISUAL_CODE, new FieldMetaData("visualCode", (byte) 3, new StructMetaData(MVVisualCodeTicketReceipt.class)));
        enumMap.put(_Fields.VDV, new FieldMetaData("vdv", (byte) 3, new StructMetaData(MVVDVTicketReceipt.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29203h = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketReceipt.class, unmodifiableMap);
    }

    /* renamed from: l */
    public static C25113c m28594l(_Fields _fields) {
        int i = C11088a.f29204a[_fields.ordinal()];
        if (i == 1) {
            return f29199d;
        }
        if (i == 2) {
            return f29200e;
        }
        if (i == 3) {
            return f29201f;
        }
        if (i == 4) {
            return f29202g;
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
        return m28594l((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVTicketReceipt mVTicketReceipt = (MVTicketReceipt) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVTicketReceipt.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVTicketReceipt.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MVTicketReceipt) {
            return mo33110k((MVTicketReceipt) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f29198c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C11088a.f29204a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVHtmlTicketReceipt mVHtmlTicketReceipt = new MVHtmlTicketReceipt();
                    mVHtmlTicketReceipt.mo25201C1(gVar);
                    return mVHtmlTicketReceipt;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVMediaTicketReceipt mVMediaTicketReceipt = new MVMediaTicketReceipt();
                    mVMediaTicketReceipt.mo25201C1(gVar);
                    return mVMediaTicketReceipt;
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVVisualCodeTicketReceipt mVVisualCodeTicketReceipt = new MVVisualCodeTicketReceipt();
                    mVVisualCodeTicketReceipt.mo25201C1(gVar);
                    return mVVisualCodeTicketReceipt;
                }
                C25122h.m63098a(gVar, b3);
                return null;
            } else if (i == 4) {
                byte b4 = cVar.f63356b;
                if (b4 == 12) {
                    MVVDVTicketReceipt mVVDVTicketReceipt = new MVVDVTicketReceipt();
                    mVVDVTicketReceipt.mo25201C1(gVar);
                    return mVVDVTicketReceipt;
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
        int i = C11088a.f29204a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVHtmlTicketReceipt) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMediaTicketReceipt) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVVisualCodeTicketReceipt) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVVDVTicketReceipt) this.value_).mo25202X0(gVar);
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
            int i = C11088a.f29204a[findByThriftId.ordinal()];
            if (i == 1) {
                MVHtmlTicketReceipt mVHtmlTicketReceipt = new MVHtmlTicketReceipt();
                mVHtmlTicketReceipt.mo25201C1(gVar);
                return mVHtmlTicketReceipt;
            } else if (i == 2) {
                MVMediaTicketReceipt mVMediaTicketReceipt = new MVMediaTicketReceipt();
                mVMediaTicketReceipt.mo25201C1(gVar);
                return mVMediaTicketReceipt;
            } else if (i == 3) {
                MVVisualCodeTicketReceipt mVVisualCodeTicketReceipt = new MVVisualCodeTicketReceipt();
                mVVisualCodeTicketReceipt.mo25201C1(gVar);
                return mVVisualCodeTicketReceipt;
            } else if (i == 4) {
                MVVDVTicketReceipt mVVDVTicketReceipt = new MVVDVTicketReceipt();
                mVVDVTicketReceipt.mo25201C1(gVar);
                return mVVDVTicketReceipt;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C11088a.f29204a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVHtmlTicketReceipt) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMediaTicketReceipt) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVVisualCodeTicketReceipt) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVVDVTicketReceipt) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: k */
    public final boolean mo33110k(MVTicketReceipt mVTicketReceipt) {
        if (mVTicketReceipt == null || this.setField_ != mVTicketReceipt.setField_ || !this.value_.equals(mVTicketReceipt.value_)) {
            return false;
        }
        return true;
    }
}
