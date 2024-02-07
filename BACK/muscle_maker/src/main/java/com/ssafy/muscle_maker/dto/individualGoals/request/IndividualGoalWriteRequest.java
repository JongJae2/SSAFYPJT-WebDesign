package com.ssafy.muscle_maker.dto.individualGoals.request;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class IndividualGoalWriteRequest {

    private double kg;
    private double muscle;
    private double fat;
    private boolean diet;

}
