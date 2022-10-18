package com.r2ha.blackjack;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CardDisplayTest {
    @Test
    void displayTenAsString() {
        Card card = new Card(Suit.CLUBS, Rank.TEN);

        assertThat(card.display())
                .isEqualTo("");
    }
}
