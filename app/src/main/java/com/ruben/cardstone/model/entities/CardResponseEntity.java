package com.ruben.cardstone.model.entities;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CardResponseEntity {
    @SerializedName("success") String success;
    @SerializedName("deck_id") String deckId;
    @SerializedName("remaining") int remaining;
    @SerializedName("cards") List<CardsResoultsEntity> card;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getDeckId() {
        return deckId;
    }

    public void setDeckId(String deckId) {
        this.deckId = deckId;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public List<CardsResoultsEntity> getCard() {
        return card;
    }

    public void setCard(List<CardsResoultsEntity> card) {
        this.card = card;
    }
}
