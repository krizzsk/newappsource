package com.usebutton.sdk.internal.commands;

import com.appboy.Constants;
import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.api.ButtonHttpStatusException;
import com.usebutton.sdk.internal.api.ButtonNetworkException;
import com.usebutton.sdk.internal.api.models.ClientEventDTO;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.util.List;

public class PostEventsCommand extends AuthenticatedCommand {
    private static final String TAG = "PostEventsCommand";
    private final EventTracker mEventTracker;

    public PostEventsCommand(ButtonApi buttonApi, Storage storage, EventTracker eventTracker) {
        super(buttonApi, storage);
        this.mEventTracker = eventTracker;
    }

    public Object execute() throws Exception {
        String str;
        super.execute();
        if (isCancelled()) {
            return null;
        }
        List<ClientEventDTO> pendingEvents = this.mEventTracker.getPendingEvents();
        if (pendingEvents.isEmpty()) {
            ButtonLog.info(TAG, "No events to post.");
            return null;
        }
        int size = pendingEvents.size();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(size);
        if (size == 1) {
            str = "";
        } else {
            str = Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY;
        }
        objArr[1] = str;
        ButtonLog.infoFormat(TAG, "Posting %d event%s", objArr);
        try {
            this.mApi.postEvents(pendingEvents);
            this.mEventTracker.removeEvents(pendingEvents.size());
            this.mEventTracker.onEventsReported();
            ButtonLog.infoFormat(TAG, "Successfully posted events %d", Integer.valueOf(pendingEvents.size()));
        } catch (ButtonNetworkException e) {
            ButtonLog.warn(TAG, "Error posting events.", e);
            if ((e instanceof ButtonHttpStatusException) && ((ButtonHttpStatusException) e).wasBadRequest()) {
                ButtonLog.warn(TAG, "Request was malformed, not likely that we will recover. Scrap events and move on.");
                this.mEventTracker.removeEvents(pendingEvents.size());
            }
        }
        return null;
    }

    public String key() {
        return "post-events";
    }
}
