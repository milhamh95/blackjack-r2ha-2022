package com.r2ha.blackjack.domain;

import com.r2ha.blackjack.domain.Card;
import com.r2ha.blackjack.domain.Rank;
import com.r2ha.blackjack.domain.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(cards);
    }

    public int size() {
        return cards.size();
    }

    public Card draw() {
        return cards.remove(0);
    }
}
