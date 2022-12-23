package com.appboy.models.cards;

import androidx.annotation.Keep;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.appboy.support.JsonUtils;
import com.braze.storage.ICardStorageProvider;
import org.json.JSONObject;
import p001a0.C0016g;
import p030bo.app.C1632m;
import p030bo.app.C1707v1;

@Keep
public final class TextAnnouncementCard extends Card {
    public final String mDescription;
    public final String mDomain;
    public final String mTitle;
    public final String mUrl;

    public TextAnnouncementCard(JSONObject jSONObject, CardKey.Provider provider) {
        this(jSONObject, provider, (C1707v1) null, (ICardStorageProvider<?>) null, (C1632m) null);
    }

    public CardType getCardType() {
        return CardType.TEXT_ANNOUNCEMENT;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getDomain() {
        return this.mDomain;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("TextAnnouncementCard{mDescription='");
        k.append(this.mDescription);
        k.append("'\nmTitle='");
        k.append(this.mTitle);
        k.append("'\nmUrl='");
        k.append(this.mUrl);
        k.append("'\nmDomain='");
        k.append(this.mDomain);
        k.append("'\n");
        return C0016g.m31o(k, super.toString(), "}\n");
    }

    public TextAnnouncementCard(JSONObject jSONObject, CardKey.Provider provider, C1707v1 v1Var, ICardStorageProvider<?> iCardStorageProvider, C1632m mVar) {
        super(jSONObject, provider, v1Var, iCardStorageProvider, mVar);
        this.mTitle = JsonUtils.getOptionalString(jSONObject, provider.getKey(CardKey.TEXT_ANNOUNCEMENT_TITLE));
        this.mDescription = jSONObject.getString(provider.getKey(CardKey.TEXT_ANNOUNCEMENT_DESCRIPTION));
        this.mUrl = JsonUtils.getOptionalString(jSONObject, provider.getKey(CardKey.TEXT_ANNOUNCEMENT_URL));
        this.mDomain = JsonUtils.getOptionalString(jSONObject, provider.getKey(CardKey.TEXT_ANNOUNCEMENT_DOMAIN));
    }
}
