package com.moovit.tracing;

public enum TraceEvent {
    MOOVIT_ACTIVITY_READY,
    MOOVIT_LOOPER_SERVICE_READY,
    STOP_DETAIL_ACTIVITY_LOADED,
    LINE_DETAIL_ACTIVITY_LOADED,
    NEAR_BY_ITEMS_ASYNC_TASK_COMPLETED,
    FIND_BEST_LINE_PATTERN_STOP_ASYNC_TASK_COMPLETED;
    
    public final String name;

    private TraceEvent(String str) {
        this.name = str;
    }
}
