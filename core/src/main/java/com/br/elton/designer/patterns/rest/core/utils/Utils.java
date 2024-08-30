package com.br.elton.designer.patterns.rest.core.utils;

import java.time.LocalDate;

public final class Utils {

    private final static String BACKSLASH = "/";

    private Utils() {}

    public static String getMonthAndYear(LocalDate date) {
        return (date.getMonth().getValue() + BACKSLASH + date.getYear());
    }

}
