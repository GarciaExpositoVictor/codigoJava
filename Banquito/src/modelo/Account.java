package modelo;

import java.util.ArrayList;
import java.util.List;

import vista.AccountListener;

public class Account {

	private List<AccountListener> listeners;
	private String name;
	private double startAmount;
	public Account(String name, double startAmount) {
		this.name = name;
		this.startAmount = startAmount;
		this.listeners = new ArrayList<>();
	}
	private Account(String name){
		this(name,0);
	}
	public boolean isOverdrawn() {
		return this.startAmount < 0;
	}
	public void addFunds(double amount) {
		this.startAmount += amount;
		for (AccountListener listener : listeners)
			listener.notifyFundsChanged(getAmount());
	}
	public String getName() {
		return name;
	}
	public double getAmount() {
		return startAmount;
	}
	public void addAccountListener(AccountListener listener) {
		listeners.add(listener);
	}
	public void removeAccountListener(AccountListener listener) {
		listeners.remove(listener);
	}
	public void removeAllAccountListeners() {listeners.clear();
	}

}
