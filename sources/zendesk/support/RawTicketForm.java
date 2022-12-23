package zendesk.support;

import ge0.C23408a;
import java.util.Date;
import java.util.List;
import p384bg.C13622c;

class RawTicketForm {
    private Date createdAt;
    private boolean endUserVisible;

    /* renamed from: id */
    private long f63723id;
    private boolean inAllBrands;
    private boolean inAllOrganizations;
    @C13622c("active")
    private boolean isActive;
    @C13622c("default")
    private boolean isDefault;
    private String name;
    private int position;
    private String rawDisplayName;
    private String rawName;
    private List<Long> restrictedBrandIds;
    private List<Long> restrictedOrganizationIds;
    private List<Long> ticketFieldIds;
    private Date updatedAt;
    private String url;

    public static TicketForm create(RawTicketForm rawTicketForm, List<TicketField> list) {
        return new TicketForm(rawTicketForm.getId(), rawTicketForm.getName(), list);
    }

    public long getId() {
        return this.f63723id;
    }

    public String getName() {
        return this.name;
    }

    public List<Long> getTicketFieldIds() {
        return C23408a.m57526a(this.ticketFieldIds);
    }
}
