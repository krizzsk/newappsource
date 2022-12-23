package com.amazonaws.logging;

import com.amazonaws.logging.LogFactory;

@Deprecated
public class ApacheCommonsLogging implements Log {
    private LogFactory.Level level = null;
    private Log log;
    private Class logClass;
    private String logString;

    public ApacheCommonsLogging(Class cls) {
        this.logClass = cls;
        this.log = LogFactory.getLog((Class<?>) cls);
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
            this.log.debug(obj);
        }
    }

    public void error(Object obj) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.ERROR.getValue()) {
            this.log.error(obj);
        }
    }

    public void info(Object obj) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.INFO.getValue()) {
            this.log.info(obj);
        }
    }

    public boolean isDebugEnabled() {
        if (!this.log.isDebugEnabled() || (getLevel() != null && getLevel().getValue() > LogFactory.Level.DEBUG.getValue())) {
            return false;
        }
        return true;
    }

    public boolean isErrorEnabled() {
        if (!this.log.isErrorEnabled() || (getLevel() != null && getLevel().getValue() > LogFactory.Level.ERROR.getValue())) {
            return false;
        }
        return true;
    }

    public boolean isInfoEnabled() {
        if (!this.log.isInfoEnabled() || (getLevel() != null && getLevel().getValue() > LogFactory.Level.INFO.getValue())) {
            return false;
        }
        return true;
    }

    public boolean isTraceEnabled() {
        if (!this.log.isTraceEnabled() || (getLevel() != null && getLevel().getValue() > LogFactory.Level.TRACE.getValue())) {
            return false;
        }
        return true;
    }

    public boolean isWarnEnabled() {
        if (!this.log.isWarnEnabled() || (getLevel() != null && getLevel().getValue() > LogFactory.Level.WARN.getValue())) {
            return false;
        }
        return true;
    }

    public void setLevel(LogFactory.Level level2) {
        this.level = level2;
    }

    public void trace(Object obj) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.TRACE.getValue()) {
            this.log.trace(obj);
        }
    }

    public void warn(Object obj) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.WARN.getValue()) {
            this.log.warn(obj);
        }
    }

    public void debug(Object obj, Throwable th) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.DEBUG.getValue()) {
            this.log.debug(obj, th);
        }
    }

    public void error(Object obj, Throwable th) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.ERROR.getValue()) {
            this.log.error(obj, th);
        }
    }

    public void info(Object obj, Throwable th) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.INFO.getValue()) {
            this.log.info(obj, th);
        }
    }

    public void trace(Object obj, Throwable th) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.TRACE.getValue()) {
            this.log.trace(obj, th);
        }
    }

    public void warn(Object obj, Throwable th) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.WARN.getValue()) {
            this.log.warn(obj, th);
        }
    }

    public ApacheCommonsLogging(String str) {
        this.logString = str;
        this.log = LogFactory.getLog(str);
    }
}
