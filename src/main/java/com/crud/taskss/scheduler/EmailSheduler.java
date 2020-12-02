package com.crud.taskss.scheduler;

import com.crud.taskss.config.AdminConfig;
import com.crud.taskss.domain.Mail;
import com.crud.taskss.repository.TaskRepository;
import com.crud.taskss.service.SimpleEmailService;
import com.crud.taskss.service.TrelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//19.4
@Component
public class EmailSheduler {
    private final static String SUBJECT = "Tasks: Once a day email";

    @Autowired
    TaskRepository taskRepository;
    @Autowired
    SimpleEmailService simpleEmailService;
    @Autowired
    AdminConfig adminConfig;

    @Scheduled //(cron = "0 0 10 * * *")
            (fixedDelay = 30000)
    public void sendInformationEmail() {
        long size = taskRepository.count();
        if(size == 1) {
            simpleEmailService.send(new Mail(adminConfig.getAdminMail(), SUBJECT, "Currently in database you got: " + size + " task"));
        } else
        simpleEmailService.send(new Mail(adminConfig.getAdminMail(), SUBJECT, "Currently in database you got: " + size + " tasks"));
    }
};