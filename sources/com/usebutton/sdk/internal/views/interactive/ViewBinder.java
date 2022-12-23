package com.usebutton.sdk.internal.views.interactive;

import com.usebutton.sdk.InteractiveButton;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.sdk.models.Link;

public interface ViewBinder {
    void applyStyling(InteractiveButton.InteractiveStyle interactiveStyle);

    void bind(AppAction appAction, Receiver<Link> receiver, Configuration configuration);
}
