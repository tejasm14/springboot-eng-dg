package com.edigest.myFirstProject.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "journal_entries")
public class JournalEntry {

    @Id
    private ObjectId journalId;
    private String title;
    private String content;
    private LocalDateTime date;

    public ObjectId getJournalId() {
        return journalId;
    }

    public void setJournalId(ObjectId journalId) {
        this.journalId = journalId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
