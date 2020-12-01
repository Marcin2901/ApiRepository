package com.crud.taskss.service;

//import com.crud.taskss.config.AdminConfig;
//import com.crud.taskss.domain.CreatedTrelloCardDto;
//import com.crud.taskss.domain.Mail;
//import com.crud.taskss.domain.TrelloBoardDto;
//import com.crud.taskss.domain.TrelloCardDto;
//import com.crud.taskss.trello.client.TrelloClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;

import com.crud.taskss.config.AdminConfig;
import com.crud.taskss.domain.CreatedTrelloCardDto;
import com.crud.taskss.domain.Mail;
import com.crud.taskss.domain.TrelloBoardDto;
import com.crud.taskss.domain.TrelloCardDto;
import com.crud.taskss.trello.client.TrelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.mapping.Alias.ofNullable;

@Service
public class TrelloService {

    private final static String SUBJECT = "Tasks: new Trello card";

    @Autowired
    AdminConfig adminConfig;

    @Autowired
    private TrelloClient trelloClient;

    @Autowired
    private SimpleEmailService emailService;

    public List<TrelloBoardDto> fetchTrelloBoards() {
        return trelloClient.getTrelloBoards();
    }

    public CreatedTrelloCardDto createdTrelloCard (final TrelloCardDto trelloCardDto) {
        CreatedTrelloCardDto newCard = trelloClient.createNewCard(trelloCardDto);

//        ofNullable(newCard).isPresent(card -> emailService.send(new Mail(adminConfig.getAdminMail(), SUBJECT,
            //    "New Card: " + trelloCardDto.getName() + " has been created on your Trello account")));


         emailService.send(new Mail(adminConfig.getAdminMail(), SUBJECT,
                        "New Card: " + trelloCardDto.getName() + " has been created on your Trello account"));


        return newCard;
    }
}

