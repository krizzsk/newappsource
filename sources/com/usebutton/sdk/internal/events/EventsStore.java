package com.usebutton.sdk.internal.events;

import com.usebutton.sdk.internal.api.models.ClientEventDTO;
import java.util.List;

public interface EventsStore {
    boolean add(ClientEventDTO clientEventDTO);

    List<ClientEventDTO> peek(int i);

    void remove(int i);

    int size();

    void trimToSize(int i);
}
