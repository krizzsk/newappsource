package com.usebutton.sdk.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ButtonThreadFactory implements ThreadFactory {
    private final ThreadGroup mGroup;
    private final String mName;
    private final AtomicInteger threadNumber = new AtomicInteger(1);

    public ButtonThreadFactory(String str) {
        ThreadGroup threadGroup;
        this.mName = str;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.mGroup = threadGroup;
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder("Button SDK");
        if (this.mName != null) {
            sb.append(" -");
            sb.append(this.mName);
            sb.append('-');
        }
        sb.append(" -thread-");
        sb.append(this.threadNumber.getAndIncrement());
        Thread thread = new Thread(this.mGroup, runnable, sb.toString(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
