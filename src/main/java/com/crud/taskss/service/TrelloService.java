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

//@Service
//public class TrelloService {
//
//    private final static String SUBJECT = "Tasks: new Trello card";

//    @Autowired
//    AdminConfig adminConfig;

//    @Autowired
//    private TrelloClient trelloClient;

//    @Autowired
//    private SimpleEmailService emailService;

//    public List<TrelloBoardDto> fetchTrelloBoards() {
//        return trelloClient.getTrelloBoards();
//    }

//    public CreatedTrelloCardDto createdTrelloCard (final TrelloCardDto trelloCardDto) {
//        CreatedTrelloCardDto newCard = trelloClient.createNewCard(trelloCardDto);
//         emailService.send(new Mail(adminConfig.getAdminMail(), SUBJECT,
//                        "New Card: " + trelloCardDto.getName() + " has been created on your Trello account"));


//        return newCard;
//    }
//}

