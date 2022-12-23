package com.moovit.app.surveys.recorder.request;

public final class SurveyRequestException extends RuntimeException {
    public SurveyRequestException(Exception exc) {
        super("SurveyRequest Failure!", exc);
    }
}
