package org.example.models;

public class RequiredEnums {
    enum AccountStatus
    {
        Active, Closed, Canceled, Blaclisted, None;
    }

    enum BookFormat{
        Hardcover, Paperback, Audiobook, Ebook, Newspaper, Magazine, Journal;
    }

    enum BookStatus{
        Available, Reserved, Loaned, Lost;
    }

    enum ReservationStatus {
        Waiting, Pending, Completed, Canceled, None;
    }
}
