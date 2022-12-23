package com.masabi.justride.sdk.jobs.barcode;

import ce0.C21100e;
import com.masabi.ticket.schema.GenericField;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kb0.C12832h;
import p364al.C13487h;
import p431cy.C16525b;
import p445do.C16690b;
import p465ek.C16836d;
import p583jk.C17867b;
import p583jk.C17873f;
import p707op.C18813a;
import p725pj.C18926a;
import p731pp.C18938a;
import p776rp.C19309b;
import p800sp.C19501a;
import p800sp.C19509i;
import p891wk.C20344a;
import p891wk.C20362q;
import p893wm.C20374a;

/* renamed from: com.masabi.justride.sdk.jobs.barcode.b */
public final class C14655b {

    /* renamed from: a */
    public final C16690b f37119a;

    /* renamed from: b */
    public final C17867b.C17868a f37120b;

    /* renamed from: c */
    public final C18813a.C18814a f37121c;

    /* renamed from: d */
    public final C16525b f37122d;

    /* renamed from: e */
    public final C20374a f37123e;

    /* renamed from: f */
    public final C17873f f37124f;

    /* renamed from: g */
    public final int f37125g = 1;

    public C14655b(C16690b bVar, C17867b.C17868a aVar, C18813a.C18814a aVar2, C12832h hVar, C20374a aVar3, C17873f fVar) {
        this.f37119a = bVar;
        this.f37120b = aVar;
        this.f37121c = aVar2;
        this.f37122d = hVar;
        this.f37123e = aVar3;
        this.f37124f = fVar;
    }

    /* renamed from: a */
    public static C18938a m36787a(C19309b bVar, long j) throws IllegalArgumentException {
        if (bVar.mo51736a() instanceof C19509i) {
            return new C18938a(bVar.f49152a, BigInteger.valueOf(j).toByteArray());
        }
        throw new IllegalArgumentException("Failed generating dynamic payload: Unexpected field type found in schema.");
    }

    /* renamed from: b */
    public final C13487h mo44346b(ArrayList arrayList, C18813a aVar, byte[] bArr) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C18938a aVar2 = (C18938a) it.next();
                aVar.f47926c.write(C21100e.m49302D(C21100e.m49302D(new byte[0], aVar2.f48239b), aVar2.f48238a));
            }
            byte[] a = aVar.mo51307a(bArr);
            try {
                aVar.f47926c.flush();
                aVar.f47926c.close();
            } catch (IOException unused) {
            }
            return new C13487h(new String(a, StandardCharsets.UTF_8), (C18926a) null);
        } catch (IOException e) {
            this.f37124f.getClass();
            C13487h hVar = new C13487h(null, new C16836d((Integer) 107, C17873f.m44275b(e)));
            try {
                aVar.f47926c.flush();
                aVar.f47926c.close();
            } catch (IOException unused2) {
            }
            return hVar;
        } catch (Throwable th) {
            try {
                aVar.f47926c.flush();
                aVar.f47926c.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final ArrayList mo44347c(C20362q qVar, boolean z, long j) throws BarcodeException {
        C20362q qVar2 = qVar;
        C20344a aVar = qVar2.f51608n;
        if (aVar == null) {
            throw new BarcodeException("Cannot encode dynamic fields: ticket activation details are missing");
        } else if (aVar.f51509d != null) {
            C19309b d = mo44348d(GenericField.EXTRA_FIELD_SCHEMA_VERSION);
            C19309b d2 = mo44348d(GenericField.DEVICE_UTC_DATE_TIME);
            C19309b d3 = mo44348d(GenericField.ACTIVATION_START_UTC_DATE_TIME);
            C19309b d4 = mo44348d(GenericField.USES_COUNT);
            C19309b d5 = mo44348d(GenericField.USE_PERIOD_EXPIRY_UTC_DATE_TIME);
            C19309b d6 = mo44348d(GenericField.SELECTED_FOR_VALIDATION);
            ArrayList arrayList = new ArrayList();
            int i = this.f37125g;
            if (d.mo51736a() instanceof C19509i) {
                arrayList.add(new C18938a(d.f49152a, BigInteger.valueOf((long) i).toByteArray()));
                arrayList.add(m36787a(d2, j));
                arrayList.add(m36787a(d3, aVar.f51509d.longValue()));
                int intValue = aVar.f51510e.intValue();
                if (d4.mo51736a() instanceof C19509i) {
                    arrayList.add(new C18938a(d4.f49152a, BigInteger.valueOf((long) intValue).toByteArray()));
                    if (d6.mo51736a() instanceof C19501a) {
                        int i2 = d6.f49152a;
                        byte[] bArr = new byte[1];
                        if (z) {
                            bArr[0] = 1;
                        } else {
                            bArr[0] = 0;
                        }
                        arrayList.add(new C18938a(i2, bArr));
                        Long l = qVar2.f51586H;
                        if (l != null) {
                            arrayList.add(m36787a(d5, l.longValue()));
                        }
                        return arrayList;
                    }
                    throw new IllegalArgumentException("Failed generating dynamic payload: Unexpected field type found in schema.");
                }
                throw new IllegalArgumentException("Failed generating dynamic payload: Unexpected field type found in schema.");
            }
            throw new IllegalArgumentException("Failed generating dynamic payload: Unexpected field type found in schema.");
        } else {
            throw new BarcodeException("Cannot encode dynamic fields: no activation start timestamp available in ticket");
        }
    }

    /* renamed from: d */
    public final C19309b mo44348d(GenericField genericField) throws IllegalArgumentException {
        C19309b bVar;
        C16525b bVar2 = this.f37122d;
        int ordinal = genericField.ordinal();
        bVar2.getClass();
        Integer num = new Integer(ordinal);
        if (((HashMap) bVar2.f43144b).containsKey(num)) {
            bVar = (C19309b) ((HashMap) bVar2.f43144b).get(num);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Failed generating dynamic payload: No schema field matches the provided ID.");
    }
}
