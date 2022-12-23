package com.usebutton.sdk.purchasepath;

public class CardHelper {
    public static int uniqueIdForCard(Card card) {
        return card.getUniqueId().hashCode();
    }
}
