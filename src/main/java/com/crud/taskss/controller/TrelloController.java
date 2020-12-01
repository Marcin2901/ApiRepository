package com.crud.taskss.controller;

//import com.crud.taskss.domain.CreatedTrelloCardDto;
//import com.crud.taskss.domain.TrelloBoardDto;
//import com.crud.taskss.domain.TrelloCardDto;
//import com.crud.taskss.service.TrelloService;
//import com.crud.taskss.trello.client.TrelloClient;
//import com.crud.taskss.trello.facade.TrelloFacade;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.converter.json.GsonBuilderUtils;
import com.crud.taskss.domain.CreatedTrelloCardDto;
import com.crud.taskss.domain.TrelloBoardDto;
import com.crud.taskss.domain.TrelloCardDto;
import com.crud.taskss.trello.client.TrelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/v1/trello")
public class TrelloController {

    @Autowired
    TrelloClient trelloClient;
//    @Autowired
//    private TrelloFacade trelloFacade;
//
//    @RequestMapping(method = RequestMethod.GET, value = "/getTrelloBoards")
//    public List<TrelloBoardDto> getTrelloBoards() {
//        return trelloFacade.fetchTrelloBoards();
//    }
//
    @RequestMapping(method = RequestMethod.POST, value ="createTrelloCard")
    public CreatedTrelloCardDto createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
    //   return trelloFacade.createCard(trelloCardDto)
        return trelloClient.createNewCard(trelloCardDto);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloClient.getTrelloBoards();
}
}
