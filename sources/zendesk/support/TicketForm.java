package zendesk.support;

import ge0.C23408a;
import java.util.List;

public class TicketForm {

    /* renamed from: id */
    private long f63731id;
    private String name;
    private List<TicketField> ticketFields;

    public TicketForm(long j, String str, List<TicketField> list) {
        this.f63731id = j;
        this.name = str;
        this.ticketFields = C23408a.m57526a(list);
    }

    public long getId() {
        return this.f63731id;
    }

    public String getName() {
        return this.name;
    }

    public List<TicketField> getTicketFields() {
        return C23408a.m57526a(this.ticketFields);
    }
}
