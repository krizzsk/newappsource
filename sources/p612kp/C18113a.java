package p612kp;

import android.annotation.SuppressLint;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import java.text.SimpleDateFormat;
import java.util.Date;
import mf0.C24362h;
import p492fn.C17043c;
import p891wk.C20364s;

/* renamed from: kp.a */
public final class C18113a {
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: a */
    public SimpleDateFormat f46309a = new SimpleDateFormat("");

    /* renamed from: b */
    public SimpleDateFormat f46310b;

    /* renamed from: c */
    public C17043c f46311c;

    /* renamed from: d */
    public String f46312d;

    public C18113a(C20364s sVar) {
        C24362h.m61211f(sVar, "ticketDisplayBundle");
        C17043c cVar = sVar.f51626d;
        TicketDisplayConfiguration ticketDisplayConfiguration = sVar.f51631i;
        C24362h.m61210e(ticketDisplayConfiguration, "ticketDisplayBundle.ticketDisplayConfiguration");
        String str = ticketDisplayConfiguration.f37085b;
        TicketDisplayConfiguration ticketDisplayConfiguration2 = sVar.f51631i;
        C24362h.m61210e(ticketDisplayConfiguration2, "ticketDisplayBundle.ticketDisplayConfiguration");
        String str2 = ticketDisplayConfiguration2.f37086c;
        TicketDisplayConfiguration ticketDisplayConfiguration3 = sVar.f51631i;
        C24362h.m61210e(ticketDisplayConfiguration3, "ticketDisplayBundle.ticketDisplayConfiguration");
        String str3 = ticketDisplayConfiguration3.f37087d;
        TicketDisplayConfiguration ticketDisplayConfiguration4 = sVar.f51631i;
        C24362h.m61210e(ticketDisplayConfiguration4, "ticketDisplayBundle.ticketDisplayConfiguration");
        String str4 = ticketDisplayConfiguration4.f37092i;
        C24362h.m61210e(str4, "ticketDisplayBundle.tick…onfiguration.layoutPreset");
        this.f46311c = cVar;
        this.f46312d = str4;
        mo50550b(str, str2, str3);
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: a */
    public static boolean m44782a(String str) {
        try {
            String format = new SimpleDateFormat(str).format(new Date());
            C24362h.m61210e(format, "formattedDate");
            if (format.length() > 0) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final boolean mo50550b(String str, String str2, String str3) {
        String str4;
        SimpleDateFormat simpleDateFormat;
        String pattern = this.f46309a.toPattern();
        SimpleDateFormat simpleDateFormat2 = this.f46310b;
        String str5 = null;
        if (simpleDateFormat2 != null) {
            str4 = simpleDateFormat2.toPattern();
        } else {
            str4 = null;
        }
        if (C24362h.m61206a(this.f46312d, "VISVAL_FIRST")) {
            if (str2 != null && m44782a(str2)) {
                if (str3 == null) {
                    this.f46309a = new SimpleDateFormat(str2);
                    this.f46310b = null;
                } else if (m44782a(str3)) {
                    this.f46309a = new SimpleDateFormat(str2);
                    this.f46310b = new SimpleDateFormat(str3);
                }
            }
            this.f46309a = new SimpleDateFormat("HH:mm:ss");
            this.f46310b = new SimpleDateFormat("dd/MM/yyyy");
        } else {
            if (str == null || !m44782a(str)) {
                simpleDateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            } else {
                simpleDateFormat = new SimpleDateFormat(str);
            }
            this.f46309a = simpleDateFormat;
            this.f46310b = null;
        }
        String pattern2 = this.f46309a.toPattern();
        SimpleDateFormat simpleDateFormat3 = this.f46310b;
        if (simpleDateFormat3 != null) {
            str5 = simpleDateFormat3.toPattern();
        }
        if ((!C24362h.m61206a(pattern, pattern2)) || (!C24362h.m61206a(str4, str5))) {
            return true;
        }
        return false;
    }
}
