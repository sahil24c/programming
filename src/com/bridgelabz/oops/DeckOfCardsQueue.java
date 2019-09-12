
package com.bridgelabz.oops;

import java.io.FileWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DeckOfCardsQueue {
	public static void main(String[] args) {

		String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] value = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int totalcount = Suits.length * value.length;
		String[] deck = new String[totalcount];

		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < Suits.length; j++) {
				deck[Suits.length * i + j] = value[i] + " " + Suits[j];
			}
		}
		for (int i = 0; i < totalcount; i++) {
			int r = i + (int) (Math.random() * (totalcount - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		JSONObject janam = new JSONObject();
		System.out.println("Total number of cards are " + deck.length);
		for (int i = 0; i <=3; i++) {
			JSONArray ja = new JSONArray();
			System.out.println("----- Person " + (i + 1) + " -----");
			for (int j = 0; j <= 8; j++) {
				JSONObject jo = new JSONObject();
				System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
				Map <String, Object> myMan = new LinkedHashMap<String, Object>();

				myMan.put(deck[i + j * 4], " (Card " + (i + j * 4) + ")");
				ja.add(myMan);
			}
			janam.put("Player "+ (i+1), ja);
		}
		try(FileWriter f= new FileWriter("deck.json"))
		{
			f.write(janam.toJSONString());
			f.flush();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

