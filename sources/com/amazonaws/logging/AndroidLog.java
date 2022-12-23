package com.amazonaws.logging;

import android.util.Log;
import com.amazonaws.logging.LogFactory;

public class AndroidLog implements Log {
    private LogFactory.Level level = null;
    private final String tag;

    public AndroidLog(String str) {
        this.tag = str;
    }

    private LogFactory.Level getLevel() {
        LogFactory.Level level2 = this.level;
        if (level2 != null) {
            return level2;
        }
        return LogFactory.getLevel();
    }

    public void debug(Object obj) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.DEBUG.getValue()) {
            obj.toString();
        }
    }

    public void error(Object obj) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.ERROR.getValue()) {
            obj.toString();
        }
    }

    public void info(Object obj) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.INFO.getValue()) {
            obj.toString();
        }
    }

    public boolean isDebugEnabled() {
        if (!Log.isLoggable(this.tag, 3) || (getLevel() != null && getLevel().getValue() > LogFactory.Level.DEBUG.getValue())) {
            return false;
        }
        return true;
    }

    public boolean isErrorEnabled() {
        if (!Log.isLoggable(this.tag, 6) || (getLevel() != null && getLevel().getValue() > LogFactory.Level.ERROR.getValue())) {
            return false;
        }
        return true;
    }

    public boolean isInfoEnabled() {
        if (!Log.isLoggable(this.tag, 4) || (getLevel() != null && getLevel().getValue() > LogFactory.Level.INFO.getValue())) {
            return false;
        }
        return true;
    }

    public boolean isTraceEnabled() {
        if (!Log.isLoggable(this.tag, 2) || (getLevel() != null && getLevel().getValue() > LogFactory.Level.TRACE.getValue())) {
            return false;
        }
        return true;
    }

    public boolean isWarnEnabled() {
        if (!Log.isLoggable(this.tag, 5) || (getLevel() != null && getLevel().getValue() > LogFactory.Level.WARN.getValue())) {
            return false;
        }
        return true;
    }

    public void setLevel(LogFactory.Level level2) {
        this.level = level2;
    }

    public void trace(Object obj) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.TRACE.getValue()) {
            obj.toString();
        }
    }

    public void warn(Object obj) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.WARN.getValue()) {
            obj.toString();
        }
    }

    public void debug(Object obj, Throwable th) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.DEBUG.getValue()) {
            obj.toString();
        }
    }

    public void error(Object obj, Throwable th) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.ERROR.getValue()) {
            obj.toString();
        }
    }

    public void info(Object obj, Throwable th) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.INFO.getValue()) {
            obj.toString();
        }
    }

    public void trace(Object obj, Throwable th) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.TRACE.getValue()) {
            obj.toString();
        }
    }

    public void warn(Object obj, Throwable th) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.WARN.getValue()) {
            obj.toString();
        }
    }
}
