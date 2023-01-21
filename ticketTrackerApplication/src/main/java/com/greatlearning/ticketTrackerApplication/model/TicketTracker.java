package com.greatlearning.ticketTrackerApplication.model;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ticket_tracker")
@Data
@NoArgsConstructor
public class TicketTracker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_id")
	private int ticketId;

	@Column(name = "ticket_title")
	private String ticketTitle;

	@Column(name = "ticket_description")
	private String ticketDescription;

	@Column(name = "ticket_content")
	private String ticketContent;

	@Column(name = "ticket_created_on")
	private String ticketCreatedOn;
}
