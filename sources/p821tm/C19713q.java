package p821tm;

import ce0.C21100e;
import com.masabi.justride.sdk.jobs.ticket.get.TicketSummaryBuilderException;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import p001a0.C0016g;
import p634ln.C18247a;
import p752qn.C19148f;
import p798sn.C19493a;

/* renamed from: tm.q */
public final class C19713q {

    /* renamed from: a */
    public String f50097a;

    /* renamed from: b */
    public Date f50098b;

    /* renamed from: c */
    public Date f50099c;

    /* renamed from: d */
    public String f50100d;

    /* renamed from: e */
    public String f50101e;

    /* renamed from: f */
    public String f50102f;

    /* renamed from: g */
    public Date f50103g;

    /* renamed from: h */
    public Date f50104h;

    /* renamed from: i */
    public Date f50105i;

    /* renamed from: j */
    public Date f50106j;

    /* renamed from: k */
    public Date f50107k;

    /* renamed from: l */
    public C18247a f50108l;

    /* renamed from: m */
    public C18247a f50109m;

    /* renamed from: n */
    public List<C18247a> f50110n;

    /* renamed from: o */
    public String f50111o;

    /* renamed from: p */
    public C19148f f50112p;

    /* renamed from: q */
    public String f50113q;

    /* renamed from: r */
    public Integer f50114r;

    /* renamed from: s */
    public Integer f50115s;

    /* renamed from: t */
    public String f50116t;

    /* renamed from: u */
    public List<String> f50117u;

    /* renamed from: v */
    public String f50118v;

    /* renamed from: w */
    public String f50119w;

    /* renamed from: x */
    public String f50120x;

    /* renamed from: y */
    public boolean f50121y;

    /* renamed from: z */
    public boolean f50122z;

    /* renamed from: a */
    public final C19493a mo52063a() throws TicketSummaryBuilderException {
        if (this.f50115s == null) {
            this.f50115s = 0;
        }
        String str = this.f50102f;
        if (str != null) {
            Date date = this.f50099c;
            if (date != null) {
                Date date2 = this.f50104h;
                if (date2 != null) {
                    Date date3 = this.f50103g;
                    if (date3 == null) {
                        throw new TicketSummaryBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket summary with null valid from ("), this.f50102f, ")"));
                    } else if (this.f50105i != null) {
                        String str2 = this.f50100d;
                        if (str2 != null) {
                            String str3 = this.f50097a;
                            if (str3 != null) {
                                String str4 = this.f50101e;
                                if (str4 == null) {
                                    throw new TicketSummaryBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket summary with null state ("), this.f50102f, ")"));
                                } else if (this.f50112p != null) {
                                    Date date4 = this.f50098b;
                                    String T = C21100e.m49325T(str3, str2);
                                    Date date5 = this.f50105i;
                                    Date date6 = this.f50106j;
                                    Date date7 = this.f50107k;
                                    C18247a aVar = this.f50108l;
                                    List<C18247a> list = this.f50110n;
                                    if (list == null) {
                                        list = Collections.emptyList();
                                    }
                                    List<C18247a> list2 = list;
                                    C18247a aVar2 = this.f50109m;
                                    C18247a aVar3 = aVar;
                                    String str5 = this.f50111o;
                                    C19148f fVar = this.f50112p;
                                    String str6 = this.f50113q;
                                    Integer num = this.f50114r;
                                    Integer num2 = this.f50115s;
                                    String str7 = this.f50116t;
                                    C18247a aVar4 = aVar2;
                                    List<String> list3 = this.f50117u;
                                    if (list3 == null) {
                                        list3 = Collections.emptyList();
                                    }
                                    String str8 = str7;
                                    return new C19493a(str3, date4, date, str2, str4, str, date3, date2, T, date5, date6, date7, aVar3, list2, aVar4, str5, fVar, str6, num, num2, str8, list3, this.f50118v, this.f50119w, this.f50120x, this.f50121y, this.f50122z);
                                } else {
                                    throw new TicketSummaryBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket summary with null price ("), this.f50102f, ")"));
                                }
                            } else {
                                throw new TicketSummaryBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket summary with null fare type ("), this.f50102f, ")"));
                            }
                        } else {
                            throw new TicketSummaryBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket summary with null product name ("), this.f50102f, ")"));
                        }
                    } else {
                        throw new TicketSummaryBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket summary with null purchase date ("), this.f50102f, ")"));
                    }
                } else {
                    throw new TicketSummaryBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket summary with null valid to ("), this.f50102f, ")"));
                }
            } else {
                throw new TicketSummaryBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket summary with null expected finalisation date ("), this.f50102f, ")"));
            }
        } else {
            throw new TicketSummaryBuilderException("Cannot create ticket summary with null ticket id");
        }
    }
}
