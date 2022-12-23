package com.usebutton.sdk.internal.events;

import com.usebutton.sdk.internal.api.models.ClientEventDTO;
import java.util.ArrayList;
import java.util.List;

public class InMemoryStore implements EventsStore {
    private final List<ClientEventDTO> mEvents = new ArrayList();

    public boolean add(ClientEventDTO clientEventDTO) {
        this.mEvents.add(clientEventDTO);
        return true;
    }

    public List<ClientEventDTO> peek(int i) {
        List<ClientEventDTO> list = this.mEvents;
        return list.subList(0, Math.min(i, list.size()));
    }

    public void remove(int i) {
        for (int i2 = 0; i2 < Math.min(i, this.mEvents.size()); i2++) {
            this.mEvents.remove(0);
        }
    }

    public int size() {
        return this.mEvents.size();
    }

    public void trimToSize(int i) {
        while (this.mEvents.size() > i) {
            this.mEvents.remove(0);
        }
    }
}
