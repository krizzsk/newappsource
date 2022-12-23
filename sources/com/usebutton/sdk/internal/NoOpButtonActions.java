package com.usebutton.sdk.internal;

import com.usebutton.sdk.action.ActionListener;
import com.usebutton.sdk.action.ActionRequest;
import com.usebutton.sdk.action.ButtonAction;
import com.usebutton.sdk.action.ButtonActionsInterface;

public class NoOpButtonActions implements ButtonActionsInterface {
    public void fetch(ActionRequest actionRequest, ActionListener actionListener) {
        actionListener.onComplete((ButtonAction) null, new IllegalStateException("Button.configure() must be called before using Button Actions API"));
    }
}
