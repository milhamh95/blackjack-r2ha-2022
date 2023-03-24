package com.r2ha.blackjack.adapter.in.console;

import com.r2ha.blackjack.adapter.in.console.ConsoleCard;
import com.r2ha.blackjack.domain.Hand;

import java.util.stream.Collectors;

import static org.fusesource.jansi.Ansi.ansi;

// in charge of translating or transforming
// or mapping domain -> String
public class ConsoleHand {
    // Translate DOMAIN Object (Hand) --> Some String for display purposes
    public static String displayFaceUpCard(Hand hand) {
        return ConsoleCard.display(hand.faceUpCard());
    }

    public static String cardsAsString(Hand hand) {
        return hand.cards()
                   .map(ConsoleCard::display)
                   .collect(Collectors.joining(
                            ansi().cursorUp(6).cursorRight(1).toString()));
    }
}
