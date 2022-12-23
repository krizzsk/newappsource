package com.moovit;

import com.moovit.commons.utils.ApplicationBugException;

public class MoovitLifecycleException extends ApplicationBugException {
    public MoovitLifecycleException() {
        super("setReady() was called when destroyed!");
    }
}
