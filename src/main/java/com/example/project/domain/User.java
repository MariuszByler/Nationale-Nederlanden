package com.example.project.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private long id;
    private String login;
    private String name;
    private String type;
    @JsonAlias("avatar_url")
    private String avatarUrl;
    @JsonAlias("created_at")
    private String createdAt;
    private double calculations;
}
