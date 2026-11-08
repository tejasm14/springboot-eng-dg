package com.edigest.myFirstProject.service;

import com.edigest.myFirstProject.entity.JournalEntry;
import com.edigest.myFirstProject.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class JournalEntryService {

    @Autowired
    JournalEntryRepository journalEntryRepository;

    @Autowired
    private Environment environment;

    @Autowired
    private MongoTemplate mongoTemplate;

    public JournalEntry save(JournalEntry journalEntry){
        /*journalEntryRepository.save(journalEntry);
        return journalEntry;*/
        System.out.println("MongoDB URI: "
                + environment.getProperty("spring.mongodb.uri"));

        System.out.println("Actual MongoDB Database: "
                + mongoTemplate.getDb().getName());

        System.out.println("Actual MongoDB Database: "
                + mongoTemplate.getDb().getName());

        JournalEntry savedEntry =
                journalEntryRepository.save(journalEntry);

        System.out.println("Saved Journal ID: "
                + savedEntry.getJournalId());

        return savedEntry;
    }

}
