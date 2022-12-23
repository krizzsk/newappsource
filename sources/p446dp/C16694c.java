package p446dp;

import android.content.res.Resources;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import java.text.DateFormat;
import java.util.Date;
import jj0.C23751b;
import mf0.C24362h;
import p258t4.C6587a;
import p605ki.C18065s;
import p605ki.C18066t;
import p720pe.C18917a;

/* renamed from: dp.c */
public final class C16694c {

    /* renamed from: a */
    public int f43482a;

    /* renamed from: b */
    public Object f43483b;

    /* renamed from: c */
    public Object f43484c;

    /* renamed from: d */
    public Object f43485d;

    /* renamed from: e */
    public Object f43486e;

    public /* synthetic */ C16694c(TicketState ticketState, Date date, int i, Resources resources) {
        this.f43484c = ticketState;
        this.f43485d = date;
        this.f43482a = i;
        this.f43486e = resources;
        this.f43483b = new C6587a();
    }

    /* renamed from: a */
    public final String mo49403a(int i, int i2, int i3, int i4) {
        String quantityString = ((Resources) this.f43486e).getQuantityString(i, i2, new Object[]{Integer.valueOf(i2)});
        C24362h.m61210e(quantityString, "resources.getQuantityStr…imeUnitQuantity\n        )");
        String quantityString2 = ((Resources) this.f43486e).getQuantityString(i3, i4, new Object[]{Integer.valueOf(i4)});
        C24362h.m61210e(quantityString2, "resources.getQuantityStr…imeUnitQuantity\n        )");
        String string = ((Resources) this.f43486e).getString(C18066t.com_masabi_justride_sdk_universal_ticket_details_time_left, new Object[]{quantityString, quantityString2});
        C24362h.m61210e(string, "resources.getString(\n   …lTimeUnitString\n        )");
        return string;
    }

    /* renamed from: b */
    public final String mo49404b() {
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(2, 3);
        C24362h.m61210e(dateTimeInstance, "dateFormat");
        String format = dateTimeInstance.format((Date) this.f43485d);
        C24362h.m61210e(format, "dateFormat.format(expectedFinalisationDate)");
        return format;
    }

    /* renamed from: c */
    public final String mo49405c() {
        String str;
        long time = ((Date) this.f43485d).getTime() - new Date().getTime();
        ((C6587a) this.f43483b).getClass();
        int i = (int) (time / 86400000);
        ((C6587a) this.f43483b).getClass();
        int i2 = (int) ((time / 3600000) % 24);
        ((C6587a) this.f43483b).getClass();
        int i3 = (int) ((time / 60000) % 60);
        ((C6587a) this.f43483b).getClass();
        int i4 = (int) ((time / 1000) % 60);
        if (i > 0) {
            return mo49403a(C18065s.com_masabi_justride_sdk_numbers_of_days, i, C18065s.com_masabi_justride_sdk_numbers_of_hours, i2);
        }
        if (i2 > 0) {
            return mo49403a(C18065s.com_masabi_justride_sdk_numbers_of_hours, i2, C18065s.com_masabi_justride_sdk_numbers_of_minutes, i3);
        }
        if (i3 > 0) {
            str = ((Resources) this.f43486e).getQuantityString(C18065s.com_masabi_justride_sdk_minutes_left, i3, new Object[]{Integer.valueOf(i3)});
            C24362h.m61210e(str, "resources.getQuantityStr…           time\n        )");
        } else {
            str = ((Resources) this.f43486e).getQuantityString(C18065s.com_masabi_justride_sdk_seconds_left, i4, new Object[]{Integer.valueOf(i4)});
            C24362h.m61210e(str, "resources.getQuantityStr…           time\n        )");
        }
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: char[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49406d() {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6.f43482a
            java.lang.Object r1 = r6.f43483b
            pe.a r1 = (p720pe.C18917a) r1
            int r2 = r1.f48155c
            if (r0 >= r2) goto L_0x00ec
            java.lang.Object r1 = r1.f48157e
            r3 = r1
            char[] r3 = (char[]) r3
            int r4 = r0 + 1
            r6.f43482a = r4
            char r0 = r3[r0]
            r3 = 36
            if (r0 != r3) goto L_0x00d3
            if (r4 >= r2) goto L_0x00d3
            char[] r1 = (char[]) r1
            int r2 = r4 + 1
            r6.f43482a = r2
            char r1 = r1[r4]
            r3 = 123(0x7b, float:1.72E-43)
            if (r1 != r3) goto L_0x00cf
        L_0x0027:
            int r0 = r6.f43482a
            java.lang.Object r1 = r6.f43483b
            pe.a r1 = (p720pe.C18917a) r1
            int r2 = r1.f48155c
            java.lang.String r3 = "${"
            r4 = 0
            if (r0 >= r2) goto L_0x0099
            java.lang.Object r1 = r1.f48157e
            char[] r1 = (char[]) r1
            int r2 = r0 + 1
            r6.f43482a = r2
            char r0 = r1[r0]
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto L_0x0081
            java.lang.Object r0 = r6.f43484c
            pe.a r0 = (p720pe.C18917a) r0
            int r1 = r0.f48155c
            if (r1 <= 0) goto L_0x0077
            java.lang.String r0 = r0.toString()
            java.lang.Object r1 = r6.f43486e
            jj0.b r1 = (jj0.C23751b) r1
            java.lang.String r1 = r1.mo58847a(r0)
            if (r1 != 0) goto L_0x0070
            java.lang.Object r1 = r6.f43485d
            pe.a r1 = (p720pe.C18917a) r1
            r1.mo51430a(r3)
            java.lang.Object r1 = r6.f43485d
            pe.a r1 = (p720pe.C18917a) r1
            r1.mo51430a(r0)
            java.lang.Object r0 = r6.f43485d
            pe.a r0 = (p720pe.C18917a) r0
            java.lang.String r1 = "}"
            r0.mo51430a(r1)
            goto L_0x0077
        L_0x0070:
            java.lang.Object r0 = r6.f43485d
            pe.a r0 = (p720pe.C18917a) r0
            r0.mo51430a(r1)
        L_0x0077:
            java.lang.Object r0 = r6.f43484c
            pe.a r0 = (p720pe.C18917a) r0
            r1 = 0
            r0.f48156d = r1
            r0.f48155c = r4
            goto L_0x0099
        L_0x0081:
            java.lang.Object r1 = r6.f43484c
            pe.a r1 = (p720pe.C18917a) r1
            int r2 = r1.f48155c
            int r2 = r2 + 1
            r1.mo51431b(r2)
            java.lang.Object r2 = r1.f48157e
            char[] r2 = (char[]) r2
            int r3 = r1.f48155c
            int r4 = r3 + 1
            r1.f48155c = r4
            r2[r3] = r0
            goto L_0x0027
        L_0x0099:
            java.lang.Object r0 = r6.f43484c
            pe.a r0 = (p720pe.C18917a) r0
            int r0 = r0.f48155c
            if (r0 <= 0) goto L_0x0000
            java.lang.Object r0 = r6.f43485d
            pe.a r0 = (p720pe.C18917a) r0
            r0.mo51430a(r3)
            java.lang.Object r0 = r6.f43485d
            pe.a r0 = (p720pe.C18917a) r0
            java.lang.Object r1 = r6.f43484c
            pe.a r1 = (p720pe.C18917a) r1
            r0.getClass()
            java.lang.Object r2 = r1.f48157e
            char[] r2 = (char[]) r2
            int r1 = r1.f48155c
            int r3 = r0.f48155c
            int r3 = r3 + r1
            r0.mo51431b(r3)
            java.lang.Object r3 = r0.f48157e
            char[] r3 = (char[]) r3
            int r5 = r0.f48155c
            java.lang.System.arraycopy(r2, r4, r3, r5, r1)
            int r2 = r0.f48155c
            int r2 = r2 + r1
            r0.f48155c = r2
            goto L_0x0000
        L_0x00cf:
            int r2 = r2 + -1
            r6.f43482a = r2
        L_0x00d3:
            java.lang.Object r1 = r6.f43485d
            pe.a r1 = (p720pe.C18917a) r1
            int r2 = r1.f48155c
            int r2 = r2 + 1
            r1.mo51431b(r2)
            java.lang.Object r2 = r1.f48157e
            char[] r2 = (char[]) r2
            int r3 = r1.f48155c
            int r4 = r3 + 1
            r1.f48155c = r4
            r2[r3] = r0
            goto L_0x0000
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p446dp.C16694c.mo49406d():void");
    }

    public /* synthetic */ C16694c(C23751b bVar) {
        this.f43483b = new C18917a();
        this.f43484c = new C18917a();
        this.f43485d = new C18917a();
        this.f43486e = bVar;
    }
}
