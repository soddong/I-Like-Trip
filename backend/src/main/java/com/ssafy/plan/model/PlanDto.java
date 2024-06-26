package com.ssafy.plan.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PlanDto {

	private int planId;
	private String title;
	private String makerId;
	private String registDate;
	private int visibility;
	private String comment;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
}
