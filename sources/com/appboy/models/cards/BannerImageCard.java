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
public final class BannerImageCard extends Card {
    public final float mAspectRatio;
    public final String mDomain;
    public final String mImageUrl;
    public final String mUrl;

    public BannerImageCard(JSONObject jSONObject, CardKey.Provider provider) {
        this(jSONObject, provider, (C1707v1) null, (ICardStorageProvider<?>) null, (C1632m) null);
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    public CardType getCardType() {
        return CardType.BANNER;
    }

    public String getDomain() {
        return this.mDomain;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("BannerImageCard{mImageUrl='");
        k.append(this.mImageUrl);
        k.append("'\nmUrl='");
        k.append(this.mUrl);
        k.append("'\nmDomain='");
        k.append(this.mDomain);
        k.append("'\nmAspectRatio=");
        k.append(this.mAspectRatio);
        return C0016g.m31o(k, super.toString(), "}\n");
    }

    public BannerImageCard(JSONObject jSONObject, CardKey.Provider provider, C1707v1 v1Var, ICardStorageProvider<?> iCardStorageProvider, C1632m mVar) {
        super(jSONObject, provider, v1Var, iCardStorageProvider, mVar);
        this.mImageUrl = jSONObject.getString(provider.getKey(CardKey.BANNER_IMAGE_IMAGE));
        this.mUrl = JsonUtils.getOptionalString(jSONObject, provider.getKey(CardKey.BANNER_IMAGE_URL));
        this.mDomain = JsonUtils.getOptionalString(jSONObject, provider.getKey(CardKey.BANNER_IMAGE_DOMAIN));
        this.mAspectRatio = (float) jSONObject.optDouble(provider.getKey(CardKey.BANNER_IMAGE_ASPECT_RATIO), 0.0d);
    }
}
