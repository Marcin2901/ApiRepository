package com.crud.taskss.domain;
//modul 18
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloBoardDto {
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;
    @JsonProperty("lists")
    private List<TrelloListDto> lists;

    public Optional<String> optional (String name) {
        return Optional.ofNullable(name);
    }
}
