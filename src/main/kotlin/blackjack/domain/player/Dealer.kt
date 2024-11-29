package blackjack.domain.player

import blackjack.domain.card.Cards

class Dealer(
    name: String = "딜러",
    cards: Cards = Cards(),
) : Participant(name, cards) {
    override fun canReceive(): Boolean {
        return cards.getScore().value < ONE_MORE_DRAW_SCORE
    }

    companion object {
        private const val ONE_MORE_DRAW_SCORE = 17
    }
}
