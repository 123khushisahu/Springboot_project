package com.nt;

import java.util.ArrayList;

public class Foodcart {
private ArrayList<String> menu;
public Foodcart() {
	System.out.println("Foodcart Object created");
}
public ArrayList<String> getMenu() {
	return menu;
}public void setMenu(ArrayList<String> menu) {
	this.menu = menu;
}
@Override
public String toString() {
	return "Foodcart [menu=" + menu + "]";

}
}
