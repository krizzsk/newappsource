package com.moovit.request;

import ce0.C21100e;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;

public class MetroRevisionMismatchException extends ServerException {
    private final long latestRevision;
    private final ServerId metroId;

    public MetroRevisionMismatchException(ServerId serverId, long j) {
        C21100e.m49373x(serverId, "metroId");
        this.metroId = serverId;
        C21100e.m49367u(j, "latestRevision");
        this.latestRevision = j;
    }

    /* renamed from: a */
    public final long mo49153a() {
        return this.latestRevision;
    }

    /* renamed from: b */
    public final ServerId mo49154b() {
        return this.metroId;
    }
}
