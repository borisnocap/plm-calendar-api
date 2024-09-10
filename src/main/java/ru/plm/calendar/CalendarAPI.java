package ru.plm.calendar;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public interface CalendarAPI {

    @Nullable
    CalendarEvent getActiveEvent();

    boolean isEventActive(@NotNull CalendarEvent calendarEvent);
}
