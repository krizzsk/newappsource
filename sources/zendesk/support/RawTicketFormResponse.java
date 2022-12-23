package zendesk.support;

import ge0.C23408a;
import java.util.List;

class RawTicketFormResponse {
    private List<RawTicketField> ticketFields;
    private List<RawTicketForm> ticketForms;

    public List<RawTicketField> getTicketFields() {
        return C23408a.m57526a(this.ticketFields);
    }

    public List<RawTicketForm> getTicketForms() {
        return C23408a.m57526a(this.ticketForms);
    }
}
