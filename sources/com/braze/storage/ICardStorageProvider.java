package com.braze.storage;

import androidx.annotation.Keep;

@Keep
public interface ICardStorageProvider<T> {
    T getCachedCardsAsEvent();

    void markCardAsClicked(String str);

    void markCardAsDismissed(String str);

    void markCardAsViewed(String str);

    void markCardAsVisuallyRead(String str);
}
