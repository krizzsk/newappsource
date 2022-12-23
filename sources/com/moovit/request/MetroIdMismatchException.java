package com.moovit.request;

import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;

public class MetroIdMismatchException extends ServerException {
    private final ServerId clientMetroId;
    private final ServerId serverMetroId;

    public MetroIdMismatchException(ServerId serverId, ServerId serverId2) {
        this.clientMetroId = serverId;
        this.serverMetroId = serverId2;
    }

    /* renamed from: a */
    public final ServerId mo49151a() {
        return this.clientMetroId;
    }

    /* renamed from: b */
    public final ServerId mo49152b() {
        return this.serverMetroId;
    }
}
