package com.ruben.cardstone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ruben.cardstone.managers.CardsAPI;
import com.ruben.cardstone.model.Card;
import com.ruben.cardstone.model.Deck;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView cardImageView;
    TextView remainingTextView;
    Deck deck = new Deck();
    Card card = new Card();
    CardsAPI cardsAPI = new CardsAPI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardImageView = (ImageView) findViewById(R.id.activity_main__card_image_view);
        remainingTextView = (TextView) findViewById(R.id.activity_main__remaining_view);

        cardsAPI.newDeck(this, deck);

        deck.setId("");

        cardImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (deck.getRemaining() == 0 ) {
                    cardsAPI.newDeck(view.getContext(), deck);
                    remainingTextView.setText("Remaining: " + deck.getRemaining());
                }else{
                    cardsAPI.drawCard(view.getContext(),deck , card);
                    remainingTextView.setText("Remaining: " + deck.getRemaining());
                    Picasso.with(view.getContext()).load(card.getImage()).into(cardImageView);
                }
            }
        });
    }
}
