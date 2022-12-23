package com.appboy.models.cards;

import androidx.annotation.Keep;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.braze.storage.ICardStorageProvider;
import org.json.JSONObject;
import p001a0.C0016g;
import p030bo.app.C1632m;
import p030bo.app.C1707v1;

@Keep
public class ControlCard extends Card {
    public ControlCard(JSONObject jSONObject, CardKey.Provider provider, C1707v1 v1Var, ICardStorageProvider<?> iCardStorageProvider, C1632m mVar) {
        super(jSONObject, provider, v1Var, iCardStorageProvider, mVar);
    }

    public CardType getCardType() {
        return CardType.CONTROL;
    }

    public String toString() {
        return C0016g.m31o(C13555b.m33972k("ControlCard{"), super.toString(), "}");
    }
}
