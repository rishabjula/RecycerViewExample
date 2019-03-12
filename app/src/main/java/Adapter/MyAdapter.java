package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import Model.ListItem;
import rishab.recyclerviewexample.Details;
import rishab.recyclerviewexample.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<ListItem> listItems;

    public MyAdapter(Context context, List listItem)
    {
        this.context = context;
        this.listItems = listItem;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder viewHolder, int position) {

        // here we will bind our views to our data-source and and to our recycler viewer

        ListItem items = listItems.get(position);
        viewHolder.name.setText(items.getName());
        viewHolder.description.setText(items.getDescription());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name,description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
// this class is going to hold all of the list items
             name = itemView.findViewById(R.id.title);
             description = itemView.findViewById(R.id.Desc);
             itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            // getting the position of the row clicked.

            int position = getAdapterPosition();

            ListItem itemPosition = listItems.get(position);

            Intent intent = new Intent(context, Details.class);
            intent.putExtra("name",itemPosition.getName());
            intent.putExtra("description",itemPosition.getDescription());

            context.startActivity(intent);


         //   Toast.makeText(context,itemPosition.getName(),Toast.LENGTH_LONG).show();


        }



    }
}
