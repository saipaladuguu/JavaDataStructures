package dataStructures.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import dataStructures.model.*;

public class StructureController 
{
	private Queue<Customer> datQueue;
	
	public StructureController()
	{
		datQueue = new LinkedList<Customer>();
	}
	
	public void addAndRemoveCustomers()
	{
		Customer twentyOneSavage = new Customer(21, "Savage", "M");
		Customer jackson = new Customer(17, "Jackson", "M");
		Customer bettyWhite = new Customer(95, "Betty White", "F");
		Customer lilCalvin = new Customer(15, "Calvin", "M");
		datQueue.add(twentyOneSavage);
		datQueue.add(jackson);
		datQueue.add(bettyWhite);
		datQueue.add(lilCalvin);
		datQueue.remove(jackson);
	}
	
	public void start()
	{
		addAndRemoveCustomers();
		
	}
}