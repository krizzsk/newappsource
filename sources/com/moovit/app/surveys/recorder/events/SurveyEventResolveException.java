package com.moovit.app.surveys.recorder.events;

public final class SurveyEventResolveException extends RuntimeException {
    public SurveyEventResolveException(Exception exc) {
        super("Unable to resolve itinerary event", exc);
    }

    public SurveyEventResolveException(String str) {
        super(str);
    }
}
