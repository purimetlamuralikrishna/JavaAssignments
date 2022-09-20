package com.murali;

public class MainClass {

	public static void main(String[] args) {
		
		int nooftickets = 5;
		int availableTickets= 25;
		int ticketid= 123;
		int price= 100;
		
		Ticket tickets = new Ticket(ticketid,price,availableTickets);
		int totalAmount = tickets.calculateTicketCost(nooftickets);
		Ticket.printDetails(totalAmount);
		
		nooftickets = 2;
		availableTickets= 20;
		ticketid= 124;
		price= 100;
		
		Ticket tickets1 = new Ticket(ticketid,price,availableTickets);
		totalAmount = tickets1.calculateTicketCost(nooftickets);
		Ticket.printDetails(totalAmount);
		
		
		
		
		
		
	}

}

class Ticket{
	
	int ticketid;
	int price;
	static int availableTickets;
	
	Ticket(int id,int cost,int availibility){
		this.ticketid = id;
		this.price = cost;
		availableTickets = availibility;
	}
	
	static void printDetails(int totalAmount) {
		System.out.println("Total Amount :"+ totalAmount);
		System.out.println("Available tickets after booking "+ Ticket.availableTickets);
	}
	
	public int calculateTicketCost(int nooftickets) {
		
		if(Ticket.availableTickets>nooftickets) {
			Ticket.availableTickets -= nooftickets;
			return nooftickets*this.price;
		}
		else {
			return -1;
		}
		
	}
}
