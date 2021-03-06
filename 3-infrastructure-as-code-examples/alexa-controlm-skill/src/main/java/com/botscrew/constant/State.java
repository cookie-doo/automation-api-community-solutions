package com.botscrew.constant;

public enum State {

    FILLING_CUSTOM_WORD("FILLING_CUSTOM_WORD"),
    END_OF_WORD("END_OF_WORD"),

    WRONG_WORD_SYMBOL_QUESTION("WRONG_WORD_SYMBOL_QUESTION"),
    WRONG_WORD_POSITION_QUESTION("WRONG_WORD_POSITION_QUESTION"),
    JOB_END_OF_WORD("JOB_END_OF_WORD"),

    CHOOSE_ENVIRONMENT("CHOOSE_ENVIRONMENT"),
//    RUN_JOB_CHOOSE_ENVIRONMENT("RUN_JOB_CHOOSE_ENVIRONMENT"),
//    START_CHOOSING_JOB("START_CHOOSING_JOB"),
    DEFAULT_STATE("DEFAULT_STATE"),
    ON_LAUNCH("ON_LAUNCH");
//    JOB_STATUS_CHOOSE_ENVIRONMENT("JOB_STATUS_CHOOSE_ENVIRONMENT");

    private String value;

    State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
