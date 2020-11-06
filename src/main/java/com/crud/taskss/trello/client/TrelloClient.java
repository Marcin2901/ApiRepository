package com.crud.taskss.trello.client;

//modul 18

//import com.crud.taskss.domain.CreatedTrelloCard;
//import com.crud.taskss.domain.TrelloBoardDto;
//import com.crud.taskss.domain.TrelloCardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//@Component
//public class TrelloClient {
//    @Value("${trello.api.endpoint.prod}")
//    private String trelloApiEndpoint;
//    @Value("${trello.app.key}")
//    private String trelloAppKey;
//    @Value("${trello.app.token}")
//    private String trelloToken;
//    @Value("${trello.app.username}")
//    private String trelloUsername;
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    public List<TrelloBoardDto> getTrelloBoards() {
//
//        URI url = getUrl();
//        TrelloBoardDto[] boardsResponce = restTemplate.getForObject(url, TrelloBoardDto[].class);
//        if(boardsResponce != null) {
//            return Arrays.asList(boardsResponce);
//        }
//        return new ArrayList<>();
//    }
//
//    public CreatedTrelloCard createNewCard(TrelloCardDto trelloCardDto) {
//        URI url = UriComponentsBuilder.fromHttpUrl(trelloApiEndpoint + "/cards")
//                .queryParam("key", trelloAppKey)
//                .queryParam("token", trelloToken)
//                .queryParam("name", trelloCardDto.getName())
//                .queryParam("desc", trelloCardDto.getDescription())
//                .queryParam("pos", trelloCardDto.getPos())
//                .queryParam("idList", trelloCardDto.getIdList())
//                .build().encode().toUri();
//
//        return restTemplate.postForObject(url, null, CreatedTrelloCard.class);
//    }
//
//
//    private URI getUrl() {
//        return UriComponentsBuilder.fromHttpUrl(trelloApiEndpoint + "/members/" + trelloUsername + "/boards")
//                .queryParam("key", trelloAppKey)
//                .queryParam("token", trelloToken)
//                .queryParam("fields","name,id")
//                .queryParam("lists", "all")
//                .build().encode().toUri();
//    }
//
//
//}
