package p821tm;

import com.masabi.justride.sdk.jobs.ticket.get.TicketDetailsBuilderException;
import com.masabi.justride.sdk.models.ticket.ValidationMethod;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import p001a0.C0016g;
import p634ln.C18247a;
import p752qn.C19143a;
import p752qn.C19145c;
import p752qn.C19146d;
import p752qn.C19147e;
import p752qn.C19148f;
import p752qn.C19150h;
import p752qn.C19151i;

/* renamed from: tm.o */
public final class C19711o {

    /* renamed from: A */
    public String f50056A;

    /* renamed from: B */
    public ValidationMethod f50057B;

    /* renamed from: C */
    public Integer f50058C;

    /* renamed from: D */
    public List<Integer> f50059D;

    /* renamed from: E */
    public List<Integer> f50060E;

    /* renamed from: F */
    public Boolean f50061F;

    /* renamed from: G */
    public List<C19145c> f50062G;

    /* renamed from: H */
    public String f50063H;

    /* renamed from: I */
    public String f50064I;

    /* renamed from: J */
    public C19151i f50065J;

    /* renamed from: a */
    public String f50066a;

    /* renamed from: b */
    public Date f50067b;

    /* renamed from: c */
    public Date f50068c;

    /* renamed from: d */
    public String f50069d;

    /* renamed from: e */
    public String f50070e;

    /* renamed from: f */
    public String f50071f;

    /* renamed from: g */
    public String f50072g;

    /* renamed from: h */
    public List<String> f50073h;

    /* renamed from: i */
    public String f50074i;

    /* renamed from: j */
    public Integer f50075j;

    /* renamed from: k */
    public Date f50076k;

    /* renamed from: l */
    public Date f50077l;

    /* renamed from: m */
    public String f50078m;

    /* renamed from: n */
    public Date f50079n;

    /* renamed from: o */
    public C19143a f50080o;

    /* renamed from: p */
    public C18247a f50081p;

    /* renamed from: q */
    public List<C18247a> f50082q;

    /* renamed from: r */
    public C18247a f50083r;

    /* renamed from: s */
    public C19146d f50084s;

    /* renamed from: t */
    public C19148f f50085t;

    /* renamed from: u */
    public String f50086u;

    /* renamed from: v */
    public List<C19147e> f50087v;

    /* renamed from: w */
    public Boolean f50088w;

    /* renamed from: x */
    public List<String> f50089x;

    /* renamed from: y */
    public String f50090y;

    /* renamed from: z */
    public String f50091z;

    /* renamed from: a */
    public final C19150h mo52061a() throws TicketDetailsBuilderException {
        String str = this.f50071f;
        if (str != null) {
            String str2 = this.f50066a;
            if (str2 != null) {
                Date date = this.f50068c;
                if (date != null) {
                    String str3 = this.f50069d;
                    if (str3 != null) {
                        String str4 = this.f50070e;
                        if (str4 == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null state ("), this.f50071f, ")"));
                        } else if (this.f50076k == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null valid from ("), this.f50071f, ")"));
                        } else if (this.f50077l == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null valid to ("), this.f50071f, ")"));
                        } else if (this.f50078m == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null product display name ("), this.f50071f, ")"));
                        } else if (this.f50079n == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null purchased date ("), this.f50071f, ")"));
                        } else if (this.f50080o == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null activation summary ("), this.f50071f, ")"));
                        } else if (this.f50088w == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null self service refund enabled ("), this.f50071f, ")"));
                        } else if (this.f50057B == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null default validation method ("), this.f50071f, ")"));
                        } else if (this.f50061F == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null selected for validation ("), this.f50071f, ")"));
                        } else if (this.f50065J == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null usage period info ("), this.f50071f, ")"));
                        } else if (this.f50085t == null) {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null price ("), this.f50071f, ")"));
                        } else if (this.f50086u != null) {
                            Date date2 = this.f50067b;
                            String str5 = this.f50072g;
                            List<String> list = this.f50073h;
                            if (list == null) {
                                list = Collections.emptyList();
                            }
                            List<String> list2 = list;
                            String str6 = this.f50074i;
                            Integer num = this.f50075j;
                            Date date3 = this.f50076k;
                            Date date4 = this.f50077l;
                            String str7 = this.f50078m;
                            Date date5 = this.f50079n;
                            C19143a aVar = this.f50080o;
                            Date date6 = date5;
                            C18247a aVar2 = this.f50081p;
                            C19143a aVar3 = aVar;
                            List<C18247a> list3 = this.f50082q;
                            if (list3 == null) {
                                list3 = Collections.emptyList();
                            }
                            List<C18247a> list4 = list3;
                            C18247a aVar4 = this.f50083r;
                            C18247a aVar5 = aVar2;
                            C19146d dVar = this.f50084s;
                            C19148f fVar = this.f50085t;
                            String str8 = this.f50086u;
                            C18247a aVar6 = aVar4;
                            List<C19147e> list5 = this.f50087v;
                            if (list5 == null) {
                                list5 = Collections.emptyList();
                            }
                            List<C19147e> list6 = list5;
                            Boolean bool = this.f50088w;
                            List<String> list7 = this.f50089x;
                            if (list7 == null) {
                                list7 = Collections.emptyList();
                            }
                            List<String> list8 = list7;
                            String str9 = this.f50090y;
                            String str10 = str8;
                            String str11 = this.f50091z;
                            String str12 = this.f50056A;
                            ValidationMethod validationMethod = this.f50057B;
                            Integer num2 = this.f50058C;
                            String str13 = str9;
                            List<Integer> list9 = this.f50059D;
                            if (list9 == null) {
                                list9 = Collections.emptyList();
                            }
                            List<Integer> list10 = list9;
                            List<Integer> list11 = this.f50060E;
                            if (list11 == null) {
                                list11 = Collections.emptyList();
                            }
                            List<Integer> list12 = list11;
                            boolean booleanValue = this.f50061F.booleanValue();
                            List<C19145c> list13 = this.f50062G;
                            if (list13 == null) {
                                list13 = Collections.emptyList();
                            }
                            Integer num3 = num2;
                            return new C19150h(str2, date2, date, str3, str4, str, str5, list2, str6, num, date3, date4, str7, date6, aVar3, aVar5, list4, aVar6, dVar, fVar, str10, list6, bool, list8, str13, str11, str12, validationMethod, num3, list10, list12, booleanValue, list13, this.f50063H, this.f50064I, this.f50065J);
                        } else {
                            throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null formattedPrice ("), this.f50071f, ")"));
                        }
                    } else {
                        throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null product name ("), this.f50071f, ")"));
                    }
                } else {
                    throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null expected finalisation date ("), this.f50071f, ")"));
                }
            } else {
                throw new TicketDetailsBuilderException(C0016g.m31o(C13555b.m33972k("Cannot create ticket details with null fare type ("), this.f50071f, ")"));
            }
        } else {
            throw new TicketDetailsBuilderException("Cannot create ticket details with null ticket id");
        }
    }
}
