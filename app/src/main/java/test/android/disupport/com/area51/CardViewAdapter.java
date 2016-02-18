package test.android.disupport.com.area51;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import test.android.disupport.com.area51.model.Message;

/**
 * Created by sebastiangreif on 17.02.2016.
 */
public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
    private final LayoutInflater inflater;
    private final List<Message> messages;

    private Random rand = new Random();

    public CardViewAdapter(LayoutInflater inflater, List<Message> messages) {
        this.inflater = inflater;
        this.messages = messages;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CardViewHolder(inflater.inflate(R.layout.card_row, parent, false));
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.cardNameTextView.setText(messages.get(position).getTitle());
//        holder.cardNameTextView.setPadding(4, rand.nextInt(40), 4, 4);
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    /**
     *
     */
    class CardViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.card_name)
        TextView cardNameTextView;

        public CardViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
