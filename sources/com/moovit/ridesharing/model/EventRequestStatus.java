package com.moovit.ridesharing.model;

import p810sz.C19577c;

public enum EventRequestStatus {
    WAITING_FOR_PROVIDER_APPROVAL,
    APPROVED_BY_PROVIDER,
    REJECTED_BY_PROVIDER,
    CANCELED_BY_PASSENGER,
    FULFILLED,
    UNFULFILLED;
    
    public static final C19577c<EventRequestStatus> CODER = null;

    /* access modifiers changed from: public */
    static {
        EventRequestStatus eventRequestStatus;
        EventRequestStatus eventRequestStatus2;
        EventRequestStatus eventRequestStatus3;
        EventRequestStatus eventRequestStatus4;
        EventRequestStatus eventRequestStatus5;
        EventRequestStatus eventRequestStatus6;
        CODER = new C19577c<>(EventRequestStatus.class, eventRequestStatus, eventRequestStatus2, eventRequestStatus3, eventRequestStatus4, eventRequestStatus5, eventRequestStatus6);
    }
}
