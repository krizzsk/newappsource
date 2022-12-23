package m90;

import c00.C13723g;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.receipt.media.C7772a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import n90.C12919a;
import p583jk.C17884p;
import p589jq.C17917i;
import p693nz.C18656g;
import p810sz.C19617r;
import q90.C13040a;
import r90.C13049a;

/* renamed from: m90.c */
public final class C12892c extends C18656g<TicketId, C12890b, C12893a> {

    /* renamed from: k */
    public static C12892c f31904k;

    /* renamed from: l */
    public static final C19617r f31905l;

    static {
        C19617r.C19618a aVar = new C19617r.C19618a();
        C12919a.C12920a aVar2 = C12919a.f31982e;
        aVar.mo51969a(1, C12919a.class, aVar2, aVar2);
        C7772a.C7773a aVar3 = C7772a.f23591i;
        aVar.mo51969a(2, C7772a.class, aVar3, aVar3);
        C13040a.C13041a aVar4 = C13040a.f32261f;
        aVar.mo51969a(3, C13040a.class, aVar4, aVar4);
        C13049a.C13050a aVar5 = C13049a.f32274f;
        aVar.mo51969a(4, C13049a.class, aVar5, aVar5);
        f31905l = aVar.mo51970b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12892c(android.content.Context r10) {
        /*
            r9 = this;
            java.io.File r10 = r10.getFilesDir()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "stores"
            r0.<init>(r10, r1)
            java.io.File r3 = new java.io.File
            java.lang.String r10 = "ticket_receipts"
            r3.<init>(r0, r10)
            sz.r r8 = f31905l
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r2 = r9
            r7 = r8
            r2.<init>(r3, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.C12892c.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static m90.C12892c m32688r(android.content.Context r3) {
        /*
            m90.c r0 = f31904k
            if (r0 != 0) goto L_0x0035
            java.lang.Class<m90.c> r0 = m90.C12892c.class
            monitor-enter(r0)
            m90.c r1 = f31904k     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
            m90.c r1 = new m90.c     // Catch:{ IOException -> 0x0018 }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ IOException -> 0x0018 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0018 }
            r1.mo51042l()     // Catch:{ IOException -> 0x0018 }
            goto L_0x002e
        L_0x0018:
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x0032 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "stores"
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0032 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "ticket_receipts"
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0032 }
            p786rz.C19387a.m46676h(r3)     // Catch:{ all -> 0x0032 }
            r1 = 0
        L_0x002e:
            f31904k = r1     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0035
        L_0x0032:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r3
        L_0x0035:
            m90.c r3 = f31904k
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.C12892c.m32688r(android.content.Context):m90.c");
    }

    /* renamed from: a */
    public final void mo39744a(Object obj) {
        TicketId ticketId = (TicketId) obj;
        synchronized (this) {
            mo51038c();
        }
    }

    public final boolean clear() {
        boolean clear;
        synchronized (this) {
            clear = super.clear();
        }
        return clear;
    }

    /* renamed from: g */
    public final C18656g.C18657a mo39746g(DataInputStream dataInputStream) throws IOException {
        return new C12893a(dataInputStream);
    }

    /* renamed from: h */
    public final C18656g.C18657a mo39748h(Object obj, String str, Object obj2) {
        TicketId ticketId = (TicketId) obj;
        C12890b bVar = (C12890b) obj2;
        return new C12893a(bVar.f31902b, str, bVar.f31903c);
    }

    /* renamed from: j */
    public final String mo39749j(Object obj) {
        return String.valueOf(C17884p.m44335F((TicketId) obj));
    }

    /* renamed from: k */
    public final long mo23807k(Object obj, Object obj2) {
        TicketId ticketId = (TicketId) obj;
        return ((C12890b) obj2).f31902b;
    }

    /* renamed from: m */
    public final boolean mo39750m(C18656g.C18657a aVar) {
        if (System.currentTimeMillis() > ((C12893a) aVar).f31906b) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo39751o(long j) {
        boolean o;
        synchronized (this) {
            o = super.mo39751o(j);
        }
        return o;
    }

    public final void onLowMemory() {
        synchronized (this) {
        }
    }

    /* renamed from: p */
    public final void mo39753p(String str) {
        mo51038c();
        for (T t : C13723g.m34282c(this.f47526g.values(), new C17917i(str, 4))) {
            mo51038c();
            if (mo51043n(t.f47530a)) {
                mo51039d();
            }
        }
    }

    /* renamed from: q */
    public final C12890b get(TicketId ticketId) {
        C12890b bVar;
        synchronized (this) {
            bVar = (C12890b) super.get(ticketId);
        }
        return bVar;
    }

    /* renamed from: s */
    public final boolean put(TicketId ticketId, C12890b bVar) {
        boolean put;
        synchronized (this) {
            put = super.put(ticketId, bVar);
        }
        return put;
    }

    /* renamed from: m90.c$a */
    public static class C12893a extends C18656g.C18657a {

        /* renamed from: b */
        public final long f31906b;

        /* renamed from: c */
        public final String f31907c;

        public C12893a(DataInputStream dataInputStream) throws IOException {
            super(dataInputStream);
            this.f31906b = dataInputStream.readLong();
            this.f31907c = dataInputStream.readUTF();
        }

        /* renamed from: a */
        public final void mo39757a(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeUTF(this.f47530a);
            dataOutputStream.writeLong(this.f31906b);
            dataOutputStream.writeUTF(this.f31907c);
        }

        public C12893a(long j, String str, String str2) {
            super(str);
            this.f31906b = j;
            this.f31907c = str2;
        }
    }
}
