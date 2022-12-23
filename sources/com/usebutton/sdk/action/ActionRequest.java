package com.usebutton.sdk.action;

public class ActionRequest {
    private final String buttonId;
    private String pubRef;
    private final ActionQuery query;

    public ActionRequest(String str, ActionQuery actionQuery) {
        this.buttonId = str;
        this.query = actionQuery;
    }

    public String getButtonId() {
        return this.buttonId;
    }

    public String getPubRef() {
        return this.pubRef;
    }

    public ActionQuery getQuery() {
        return this.query;
    }

    public void setPubRef(String str) {
        this.pubRef = str;
    }
}
