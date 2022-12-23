package zendesk.support;

import ge0.C23408a;
import java.util.Date;
import java.util.List;
import p384bg.C13622c;

class RawTicketField {
    private long accountId;
    @C13622c("isActive")
    private boolean active;
    @C13622c("isCollapsedForAgents")
    private boolean collapsedForAgents;
    private Date createdAt;
    private List<RawTicketFieldOption> customFieldOptions;
    private String defaultContentKey;
    private String description;
    @C13622c("isEditableInPortal")
    private boolean editableInPortal;
    @C13622c("isExportable")
    private boolean exportable;

    /* renamed from: id */
    private long f63721id;
    private int position;
    private String regexpForValidation;
    @C13622c("isRequired")
    private boolean required;
    @C13622c("isRequiredInPortal")
    private boolean requiredInPortal;
    private long subTypeId;
    private List<RawTicketFieldSystemOption> systemFieldOptions;
    private String tag;
    private String title;
    private String titleInPortal;
    private TicketFieldType type;
    private Date updatedAt;
    @C13622c("isVisibleInPortal")
    private boolean visibleInPortal;

    public List<RawTicketFieldOption> getCustomFieldOptions() {
        return C23408a.m57526a(this.customFieldOptions);
    }

    public String getDescription() {
        return this.description;
    }

    public long getId() {
        return this.f63721id;
    }

    public String getRegexpForValidation() {
        return this.regexpForValidation;
    }

    public List<RawTicketFieldSystemOption> getSystemFieldOptions() {
        return C23408a.m57526a(this.systemFieldOptions);
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleInPortal() {
        return this.titleInPortal;
    }

    public TicketFieldType getType() {
        return this.type;
    }
}
