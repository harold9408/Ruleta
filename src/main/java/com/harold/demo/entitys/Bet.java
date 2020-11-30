package com.harold.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bet")
public class Bet {
	@Column
	private Long id;
	@Column
	private float amount;
	@Column
	private int number;
	@Column
	private String color;
	@Column
	private Long idRoulette;
}
