package com.moovit.app.useraccount.manager;

import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import java.io.IOException;

public interface UserAccountDataProvider<D> {

    public enum ProviderType {
        PROFILE,
        FAVORITES,
        NOTIFICATIONS,
        CAMPAIGNS,
        PROMOTIONS
    }

    /* renamed from: a */
    void mo46564a();

    /* renamed from: b */
    void mo46565b(D d) throws IOException, ServerException;

    /* renamed from: c */
    D mo46566c(ServerId serverId) throws IOException, ServerException;

    /* renamed from: d */
    void mo46567d();

    ProviderType getType();

    void load() throws IOException, ServerException;
}
