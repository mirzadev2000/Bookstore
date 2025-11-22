package com.example.bookstoreapp;

import javafx.event.Event;
import javafx.event.EventType;

public class BookStoreEvent extends Event {
    public BookStoreEvent(EventType<? extends Event> eventType) {
        super(eventType);
    }


    public static final EventType<BookStoreEvent> createScene = new EventType<>("CreateScene");
    public static final EventType<BookStoreEvent> overviewScene = new EventType<>("overviewScene");
}
