package zendesk.support;

import p384bg.C13622c;

class RawTicketFieldOption {

    /* renamed from: id */
    private long f63722id;
    @C13622c("default")
    private boolean isDefault;
    private String name;
    private String rawName;
    private String value;

    public static TicketFieldOption create(RawTicketFieldOption rawTicketFieldOption) {
        return new TicketFieldOption(rawTicketFieldOption.getId(), rawTicketFieldOption.getName(), rawTicketFieldOption.getValue(), rawTicketFieldOption.isDefault());
    }

    public long getId() {
        return this.f63722id;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isDefault() {
        return this.isDefault;
    }
}
