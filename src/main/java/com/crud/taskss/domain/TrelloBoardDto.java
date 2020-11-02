package com.crud.taskss.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TrelloBoardDto {
    private String name;
    private String id;

    public Optional<String> optional (String name) {
        return Optional.ofNullable(name);
    }
}
